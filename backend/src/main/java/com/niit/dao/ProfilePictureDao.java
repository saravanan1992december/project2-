package com.niit.dao;

import com.niit.model.ProfilePicture;

public interface ProfilePictureDao {
void save(ProfilePicture profilePicture);
ProfilePicture getProfilePic(String email);
void update(ProfilePicture profilePicture);
void uploadProfilePicture(ProfilePicture profilePicture);

}
