package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        boolean containsNum = false;
        boolean containsUpper = false;
        boolean containsLower = false;
        boolean containsSpecial = false;
        for(int i = 0; i < newPassword.length();i++){
            int ele = (int)newPassword.charAt(i);
            if(ele <=90 && ele >=65){
                containsUpper = true;
            }
            if(ele <=122 && ele >=97){
                containsLower = true;
            }
            if(ele <=57 && ele >=48){
                containsNum = true;
            }
            if(ele <=47 && ele >=33){
                containsSpecial = true;
            }
        }
        if(getPassword().equals(oldPassword)){
            if(newPassword.length() >= 8 && containsUpper == true &&  containsUpper == true &&  containsNum == true && containsSpecial ==true){
                setPassword(newPassword);
            }
        }
    }
}
