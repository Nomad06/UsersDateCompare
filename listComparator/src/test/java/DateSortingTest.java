import org.junit.*;
import user.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bubal on 25.09.2016.
 */
public class DateSortingTest {

    private final List<User> userListBefore = new ArrayList<>();
    private final List<User> userListAfter = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        User user1 = new User();
        User user2 = new User("Nomad");
        User user3 = new User("Bubalex", Calendar.getInstance().getTime());
        User user4 = new User("Shogun", DateSortingTest.stringToDateConvert("12.09.2016"));
        User user5 = new User("Shogun", DateSortingTest.stringToDateConvert("12.08.2016"));
        userListBefore.add(user1);
        userListBefore.add(user2);
        userListBefore.add(user3);
        userListBefore.add(user4);
        userListBefore.add(user5);

        userListAfter.add(user3);
        userListAfter.add(user4);
        userListAfter.add(user5);
        userListAfter.add(user2);
        userListAfter.add(user1);

    }

    @After
    public void tearDown() throws Exception {
        userListBefore.clear();
        userListAfter.clear();
    }

    @Test
    public void listSortByDate() throws Exception {
        Object[] sortedUserList = new DateSorting().listSortByDate(userListBefore).toArray();
        Object[] usersArrayAfter = userListAfter.toArray();
        assertArrayEquals(usersArrayAfter, sortedUserList);

    }

    private static Date stringToDateConvert(String string){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}