package com.facebook.rsys.polls.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class PollsApi {
    public static 2LV CONVERTER = C22181Xwr.A00(34);

    public final class CProxy extends PollsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PollsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void closeActivity();

        public native void createTextPoll(String str, ArrayList arrayList);

        public native int hashCode();

        public native void removePoll(String str);

        public native void removeVote(String str);

        public native void vote(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PollsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void closeActivity();

    public abstract void createTextPoll(String str, ArrayList arrayList);

    public abstract void removePoll(String str);

    public abstract void removeVote(String str);

    public abstract void vote(String str);
}
