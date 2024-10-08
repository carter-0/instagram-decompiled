package com.facebook.rsys.callmanager.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.call.gen.AddUsersOptions;
import com.facebook.rsys.datachannel.gen.DataApi;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CallApi {
    public static 2LV CONVERTER = C71546Omh.A00(20);

    public final class CProxy extends CallApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void accept(boolean z, boolean z2, boolean z3);

        public native void addUsers(ArrayList arrayList, AddUsersOptions addUsersOptions);

        public native void attemptAccept(boolean z, boolean z2, boolean z3);

        public native void consentToSeeRemoteVideo();

        public native void end(int i, String str, boolean z);

        public native void finishSetup();

        public native DataApi getDataApi();

        public native int hashCode();

        public native void removeUsers(ArrayList arrayList);

        public native void removeWhenEnded();

        public native void respondToApprovalRequests(ArrayList arrayList, int i);

        public native void setAppModelListener(AppModelListener appModelListener);

        public native void transfer();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void accept(boolean z, boolean z2, boolean z3);

    public abstract void addUsers(ArrayList arrayList, AddUsersOptions addUsersOptions);

    public abstract void attemptAccept(boolean z, boolean z2, boolean z3);

    public abstract void consentToSeeRemoteVideo();

    public abstract void end(int i, String str, boolean z);

    public abstract void finishSetup();

    public abstract DataApi getDataApi();

    public abstract void removeUsers(ArrayList arrayList);

    public abstract void removeWhenEnded();

    public abstract void respondToApprovalRequests(ArrayList arrayList, int i);

    public abstract void setAppModelListener(AppModelListener appModelListener);

    public abstract void transfer();
}
