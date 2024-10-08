package com.facebook.rsys.callmanager.callclient.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.callmanager.gen.UnregisterCallback;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.simplejni.NativeHolder;

public abstract class CallManagerCallClient {
    public static 2LV CONVERTER = C71546Omh.A00(17);

    public final class CProxy extends CallManagerCallClient {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallManagerCallClient createCallManager(CallManagerConfig callManagerConfig, CallManagerClient callManagerClient, CallManagerCallClientCallbacks callManagerCallClientCallbacks, DevXAgentApi devXAgentApi);

        public static native CallManagerCallClient createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native LogFile createLogFileForCall(int i, String str);

        public native DevXAgentCallApi getDevXAgentCallApi();

        public native int hashCode();

        public native void registerUser(UserContext userContext);

        public native String startCallCopyId(StartCallCopyIdParams startCallCopyIdParams);

        public native void unregisterUser(String str, String str2, UnregisterCallback unregisterCallback);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallManagerCallClient)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract LogFile createLogFileForCall(int i, String str);

    public abstract DevXAgentCallApi getDevXAgentCallApi();

    public abstract void registerUser(UserContext userContext);

    public abstract String startCallCopyId(StartCallCopyIdParams startCallCopyIdParams);

    public abstract void unregisterUser(String str, String str2, UnregisterCallback unregisterCallback);
}
