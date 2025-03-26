public class RolesAndPermissions extends User {
    //        ************************************************************ Behaviours/Methods ************************************************************

    /**
     * Checks if the admin with specified credentials is registered or not.
     * @param username of the imaginary admin
     * @param password of the imaginary admin
     * @return -1 if admin not found, else index of the admin in the array.
     */
    public boolean isPrivilegedUserOrNot(String username, String password) {
        boolean isFound = false;
        for (Admin admin : User_Data.admins) {
            if (username.equals(admin.getUsername())) {
                if (password.equals(admin.getPassword())) {
                    isFound = true;
                    break;
                }
            }
        }
        return isFound;
    }

    /**
     * Checks if the passenger with specified credentials is registered or not.
     * @param email of the specified passenger
     * @param password of the specified passenger
     * @return 1 with the userID if the passenger is registered, else 0
     */
    public String isPassengerRegistered(String email, String password) {
        String isFound = "0";
        for (Customer c : User_Data.customers) {
            if (email.equals(c.getEmail())) {
                if (password.equals(c.getPassword())) {
                    isFound = "1-" + c.getUserID();
                    break;
                }
            }
        }
        return isFound;
    }
}
