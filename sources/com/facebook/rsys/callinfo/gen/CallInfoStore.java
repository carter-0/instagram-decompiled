package com.facebook.rsys.callinfo.gen;

import X.AnonymousClass00P;
import java.util.ArrayList;

public abstract class CallInfoStore {
    public abstract void readCallInfo(String str, boolean z, CallInfoReadCallback callInfoReadCallback);

    public abstract void readUserProfiles(ArrayList arrayList, String str, UserProfilesReadCallback userProfilesReadCallback);

    public abstract void registerObserver(CallInfoObserver callInfoObserver);

    public abstract void unregisterObserver(CallInfoObserver callInfoObserver);

    public CallInfoStore() {
        throw AnonymousClass00P.createAndThrow();
    }
}
