package com.instagram.rtc.rsys.proxies;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.ParsedMwsBinaryMessage;
import java.util.ArrayList;
import java.util.Map;

public abstract class IGRTCSignalingCoordinator {
    public static 2LV CONVERTER = new C71545Omg(28);

    public final class CProxy extends IGRTCSignalingCoordinator {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native IGRTCSignalingCoordinator createFromMcfType(McfReference mcfReference);

        public static native ArrayList createInitialDataMessages(ArrayList arrayList, boolean z, boolean z2, String str);

        public static native IGRTCSignalingCoordinator createSignalingCoordinator(String str, String str2, SignalingSenderProxy signalingSenderProxy, McfReference mcfReference, int i);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void cacheIncomingMessageUntilFirstSend();

        public native EngineModel createEngineModel(Map map);

        public native ArrayList createEngineUserIds(ArrayList arrayList);

        public native void declineWithSubReason(String str, String str2);

        public native PerfLoggerHolder getPerfLoggerHolder();

        public native SignalingTransportProxy getSignalingTransportProxy();

        public native String getUserId();

        public native void handleMqttMessage(String str);

        public native int hashCode();

        public native void receiveParsedMultiwaySignalingMessage(ParsedMwsBinaryMessage parsedMwsBinaryMessage, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);

        public native void receivedMultiwayHttpResponse(String str, Map map, int i);

        public native void receivedMultiwayLegacyMessage(Map map);

        public native void receivedMultiwaySignalingMessage(byte[] bArr, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof IGRTCSignalingCoordinator)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cacheIncomingMessageUntilFirstSend();

    public abstract EngineModel createEngineModel(Map map);

    public abstract ArrayList createEngineUserIds(ArrayList arrayList);

    public abstract void declineWithSubReason(String str, String str2);

    public abstract PerfLoggerHolder getPerfLoggerHolder();

    public abstract SignalingTransportProxy getSignalingTransportProxy();

    public abstract String getUserId();

    public abstract void handleMqttMessage(String str);

    public abstract void receiveParsedMultiwaySignalingMessage(ParsedMwsBinaryMessage parsedMwsBinaryMessage, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);

    public abstract void receivedMultiwayHttpResponse(String str, Map map, int i);

    public abstract void receivedMultiwayLegacyMessage(Map map);

    public abstract void receivedMultiwaySignalingMessage(byte[] bArr, int i, SignalingMessageIncomingStats signalingMessageIncomingStats);
}
