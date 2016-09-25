import comparators.DateComparator;
import user.User;

import java.util.Comparator;
import java.util.List;

/**
 * Created by bubal on 24.09.2016.
 */
public class DateSorting {

    public List<User> listSortByDate(List<User> userList){
        Comparator<User> comparator = new DateComparator();
        userList.sort(comparator);
        return userList;
    }
}
