package com.facebook.rsys.metaaivoicestate.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class MetaAiMediaStatsProxy {
    public static 2LV CONVERTER = C22181Xwr.A00(9);

    public final class CProxy extends MetaAiMediaStatsProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MetaAiMediaStatsProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onCreatorBotClientReadyMessage(CreatorBotClientReadyMessage creatorBotClientReadyMessage);

        public native void onGenAiMediaStats(GenAiMediaStats genAiMediaStats);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MetaAiMediaStatsProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCreatorBotClientReadyMessage(CreatorBotClientReadyMessage creatorBotClientReadyMessage);

    public abstract void onGenAiMediaStats(GenAiMediaStats genAiMediaStats);
}
