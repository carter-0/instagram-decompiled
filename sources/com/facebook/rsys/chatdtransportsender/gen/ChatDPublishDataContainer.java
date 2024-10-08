package com.facebook.rsys.chatdtransportsender.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import java.util.Arrays;
import java.util.Map;

public class ChatDPublishDataContainer {
    public static 2LV CONVERTER = C22180Xwq.A00(27);
    public static long sMcfTypeId;
    public final Map additionalAnnotations;
    public final SignalingTransportCallback callbacks;
    public final byte[] data;
    public final SignalingTransportCallbackExt extCallbacks;
    public final Long flowId;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;
    public final McfReference sender;
    public final String traceId;

    public static native ChatDPublishDataContainer createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatDPublishDataContainer)) {
                return false;
            }
            ChatDPublishDataContainer chatDPublishDataContainer = (ChatDPublishDataContainer) obj;
            if (!this.sender.equals(chatDPublishDataContainer.sender) || !Arrays.equals(this.data, chatDPublishDataContainer.data)) {
                return false;
            }
            Long l = this.flowId;
            Long l2 = chatDPublishDataContainer.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.traceId;
            String str2 = chatDPublishDataContainer.traceId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.messageId;
            String str4 = chatDPublishDataContainer.messageId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.remoteSignalingId;
            String str6 = chatDPublishDataContainer.remoteSignalingId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            SignalingTransportCallback signalingTransportCallback = this.callbacks;
            SignalingTransportCallback signalingTransportCallback2 = chatDPublishDataContainer.callbacks;
            if (signalingTransportCallback == null) {
                if (signalingTransportCallback2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallback.equals(signalingTransportCallback2)) {
                return false;
            }
            SignalingTransportCallbackExt signalingTransportCallbackExt = this.extCallbacks;
            SignalingTransportCallbackExt signalingTransportCallbackExt2 = chatDPublishDataContainer.extCallbacks;
            if (signalingTransportCallbackExt == null) {
                if (signalingTransportCallbackExt2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallbackExt.equals(signalingTransportCallbackExt2)) {
                return false;
            }
            String str7 = this.messageType;
            String str8 = chatDPublishDataContainer.messageType;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            Map map = this.additionalAnnotations;
            Map map2 = chatDPublishDataContainer.additionalAnnotations;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((((((((((((((C21056XCh.A01(this.sender) + Arrays.hashCode(this.data)) * 31) + AnonymousClass7TG.A0C(this.flowId)) * 31) + AnonymousClass7TG.A0E(this.traceId)) * 31) + AnonymousClass7TG.A0E(this.messageId)) * 31) + AnonymousClass7TG.A0E(this.remoteSignalingId)) * 31) + AnonymousClass7TG.A0C(this.callbacks)) * 31) + AnonymousClass7TG.A0C(this.extCallbacks)) * 31) + AnonymousClass7TG.A0E(this.messageType)) * 31;
        Map map = this.additionalAnnotations;
        if (map != null) {
            i = map.hashCode();
        }
        return A01 + i;
    }

    public ChatDPublishDataContainer(McfReference mcfReference, byte[] bArr, Long l, String str, String str2, String str3, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, String str4, Map map) {
        mcfReference.getClass();
        bArr.getClass();
        this.sender = mcfReference;
        this.data = bArr;
        this.flowId = l;
        this.traceId = str;
        this.messageId = str2;
        this.remoteSignalingId = str3;
        this.callbacks = signalingTransportCallback;
        this.extCallbacks = signalingTransportCallbackExt;
        this.messageType = str4;
        this.additionalAnnotations = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChatDPublishDataContainer{sender=");
        A1A.append(this.sender);
        A1A.append(",data=");
        A1A.append(this.data);
        A1A.append(",flowId=");
        A1A.append(this.flowId);
        A1A.append(",traceId=");
        A1A.append(this.traceId);
        A1A.append(",messageId=");
        A1A.append(this.messageId);
        A1A.append(",remoteSignalingId=");
        A1A.append(this.remoteSignalingId);
        A1A.append(",callbacks=");
        A1A.append(this.callbacks);
        A1A.append(",extCallbacks=");
        A1A.append(this.extCallbacks);
        A1A.append(",messageType=");
        A1A.append(this.messageType);
        A1A.append(",additionalAnnotations=");
        return C66582MXn.A0v(this.additionalAnnotations, A1A);
    }
}
