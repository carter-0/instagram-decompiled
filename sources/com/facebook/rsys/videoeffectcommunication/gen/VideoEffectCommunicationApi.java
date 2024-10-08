package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.C56915IHk;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public abstract class VideoEffectCommunicationApi {
    public static 2LV CONVERTER = new C56915IHk(2);

    public final class CProxy extends VideoEffectCommunicationApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoEffectCommunicationApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void multipeerStartListening(long j);

        public native void multipeerStopListening();

        public native void participantModuleInitialize(long j);

        public native void participantModuleReset();

        public native void requestParticipantVideoFrames(String str);

        public native void sendGroupEffect(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo);

        public native void sendMultipeerBinaryMessage(String str, byte[] bArr, boolean z);

        public native void sendMultipeerMessage(String str, String str2, boolean z);

        public native void setGroupEffectStatus(Long l, int i);

        public native void updateParticipants(String str, Map map);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoEffectCommunicationApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void multipeerStartListening(long j);

    public abstract void multipeerStopListening();

    public abstract void participantModuleInitialize(long j);

    public abstract void participantModuleReset();

    public abstract void requestParticipantVideoFrames(String str);

    public abstract void sendGroupEffect(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo);

    public abstract void sendMultipeerBinaryMessage(String str, byte[] bArr, boolean z);

    public abstract void sendMultipeerMessage(String str, String str2, boolean z);

    public abstract void setGroupEffectStatus(Long l, int i);

    public abstract void updateParticipants(String str, Map map);
}
