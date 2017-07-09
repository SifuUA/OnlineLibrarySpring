package com.okres.springlibrary.interfaces;

import com.okres.springlibrary.objects.User;

/**
 * Created by Alex on 08.07.2017.
 */
public interface SecureLibrary {

    boolean login(User user);

    void logout(User user);
}
