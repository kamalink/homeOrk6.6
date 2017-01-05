package module6.homeOrk6;

import module6.homeOrk4.User;
import module6.homeOrk5.UserUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(393729,"Larry", "Ducl", 460, 450);
        User user2 = new User(4356342, "Nirri", "Lartuk", 600, 650);
        User user3 = new User(17482, "Valli", "Krack", 990, 365);

        User[] mainArr = {user1, user2, user3};

        System.out.println(Arrays.toString(UserUtils.uniqueUsers(mainArr))+ "\n");
        System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(mainArr,450))+ "\n");
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(mainArr))+"\n");
        System.out.println(Arrays.toString(UserUtils.getUsersId(mainArr))+"\n");
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(mainArr)));
    }
}
