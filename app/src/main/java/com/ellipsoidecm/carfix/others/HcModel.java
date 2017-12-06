package com.ellipsoidecm.carfix.others;

/**
 * Created by ellipsoid on 11-10-2017.
 */

public class HcModel {

    private String username;

    private int profilePic;

    public HcModel(String username, int profilePic) {
        this.username = username;
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }
}
