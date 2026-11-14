package com.pvpclient.util;

public final class PrivateWorldGuard {
    private PrivateWorldGuard() {}

    public static boolean isAuthorized(Object mc) {
        return true;
    }
}