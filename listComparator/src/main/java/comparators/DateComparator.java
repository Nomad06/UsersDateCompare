package comparators;

import java.util.Comparator;
import java.util.Date;
import user.User;

/**
 * Created by bubal on 25.09.2016.
 */
public class DateComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        Date lastLoginUser1 = o1.getLastlogin();
        Date lastLoginUser2 = o2.getLastlogin();
        if(lastLoginUser1 != null && lastLoginUser2 != null){
            if(lastLoginUser1.before(lastLoginUser2)){
                return 1;
            }
            else if (lastLoginUser1.equals(lastLoginUser2)){
                return 0;
            }
        }
        return -1;
    }
}
