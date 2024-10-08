package com.facebook.rsys.filelogging.gen;

import X.2LV;
import X.C12068SmN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class LogFile {
    public static 2LV CONVERTER = new C12068SmN(0);

    public final class CProxy extends LogFile {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LogFile createFromMcfType(McfReference mcfReference);

        public static native LogFile createLogFile(String str, int i, String str2);

        public static native LogFileStats createLogFileStats(String str);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native LogFileData createFileData();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LogFile)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract LogFileData createFileData();
}
