package com.facebook.rsys.tslog.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public abstract class TslogEngineApi {
    public static 2LV CONVERTER = new C71545Omg(8);

    public final class CProxy extends TslogEngineApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogEngineApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native TslogStreamApi createStream(String str, int i);

        public native TslogStreamApi createStreamWithProps(String str, int i, Map map);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogEngineApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract TslogStreamApi createStream(String str, int i);

    public abstract TslogStreamApi createStreamWithProps(String str, int i, Map map);
}
