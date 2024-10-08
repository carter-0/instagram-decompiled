package com.facebook.msys.mcp.authdatastorageplugin;

import X.0KC;
import X.AnonymousClass7TF;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.AuthDataStorage;

public class MsysAuthDataStoragePluginSessionless extends Sessionless {
    private boolean checkAuthDataStorageReadiness() {
        boolean z = AuthDataStorage.sInitialized;
        if (!z) {
            0KC.A0C("MsysAuthDataStorage", "AuthDataStorage is not initialized.");
        }
        return z;
    }

    private boolean checkAuthDataValid(AuthData authData) {
        return AnonymousClass7TF.A1V(authData.getFacebookUserID());
    }

    public Object MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy(AuthData authData, String str) {
        if (!AnonymousClass7TF.A1V(authData.getFacebookUserID()) || !checkAuthDataStorageReadiness()) {
            return null;
        }
        return AuthDataStorage.getFromRawKey(str);
    }

    public void MsysAuthDataStorageImpl_MsysAuthDataStorageReset(AuthData authData) {
        if (AnonymousClass7TF.A1V(authData.getFacebookUserID()) && checkAuthDataStorageReadiness()) {
            AuthDataStorage.resetFromFacebookUserId(authData.getFacebookUserID());
        }
    }

    public void MsysAuthDataStorageImpl_MsysAuthDataStorageSet(AuthData authData, String str, Object obj) {
        if (AnonymousClass7TF.A1V(authData.getFacebookUserID()) && checkAuthDataStorageReadiness()) {
            AuthDataStorage.setWithRawKey(str, obj);
        }
    }
}
