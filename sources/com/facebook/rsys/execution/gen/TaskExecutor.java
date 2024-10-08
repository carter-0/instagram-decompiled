package com.facebook.rsys.execution.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class TaskExecutor {
    public static 2LV CONVERTER = C22180Xwq.A00(48);

    public final class CProxy extends TaskExecutor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TaskExecutor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void execute(Task task, long j);

        public native int hashCode();

        public native boolean isCurrent();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TaskExecutor)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void execute(Task task, long j);

    public abstract boolean isCurrent();
}
