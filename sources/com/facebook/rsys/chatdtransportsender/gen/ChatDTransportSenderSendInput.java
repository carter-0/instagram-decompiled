package com.facebook.rsys.chatdtransportsender.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import java.util.Arrays;
import java.util.Map;

public class ChatDTransportSenderSendInput {
    public static 2LV CONVERTER = C22180Xwq.A00(29);
    public static long sMcfTypeId;
    public final SignalingTransportCallback callbacks;
    public final SignalingTransportCallbackExt extCallbacks;
    public final Long flowId;
    public final Map loggingAnnotations;
    public final byte[] message;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;

    public static native ChatDTransportSenderSendInput createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatDTransportSenderSendInput)) {
                return false;
            }
            ChatDTransportSenderSendInput chatDTransportSenderSendInput = (ChatDTransportSenderSendInput) obj;
            if (!Arrays.equals(this.message, chatDTransportSenderSendInput.message)) {
                return false;
            }
            Long l = this.flowId;
            Long l2 = chatDTransportSenderSendInput.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.messageId;
            String str2 = chatDTransportSenderSendInput.messageId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.remoteSignalingId;
            String str4 = chatDTransportSenderSendInput.remoteSignalingId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            SignalingTransportCallback signalingTransportCallback = this.callbacks;
            SignalingTransportCallback signalingTransportCallback2 = chatDTransportSenderSendInput.callbacks;
            if (signalingTransportCallback == null) {
                if (signalingTransportCallback2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallback.equals(signalingTransportCallback2)) {
                return false;
            }
            SignalingTransportCallbackExt signalingTransportCallbackExt = this.extCallbacks;
            SignalingTransportCallbackExt signalingTransportCallbackExt2 = chatDTransportSenderSendInput.extCallbacks;
            if (signalingTransportCallbackExt == null) {
                if (signalingTransportCallbackExt2 != null) {
                    return false;
                }
            } else if (!signalingTransportCallbackExt.equals(signalingTransportCallbackExt2)) {
                return false;
            }
            String str5 = this.messageType;
            String str6 = chatDTransportSenderSendInput.messageType;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            Map map = this.loggingAnnotations;
            Map map2 = chatDTransportSenderSendInput.loggingAnnotations;
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
        int A01 = (((((((((((C66583MXo.A01(Arrays.hashCode(this.message)) + AnonymousClass7TG.A0C(this.flowId)) * 31) + AnonymousClass7TG.A0E(this.messageId)) * 31) + AnonymousClass7TG.A0E(this.remoteSignalingId)) * 31) + AnonymousClass7TG.A0C(this.callbacks)) * 31) + AnonymousClass7TG.A0C(this.extCallbacks)) * 31) + AnonymousClass7TG.A0E(this.messageType)) * 31;
        Map map = this.loggingAnnotations;
        if (map != null) {
            i = map.hashCode();
        }
        return A01 + i;
    }

    public ChatDTransportSenderSendInput(byte[] bArr, Long l, String str, String str2, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, String str3, Map map) {
        bArr.getClass();
        this.message = bArr;
        this.flowId = l;
        this.messageId = str;
        this.remoteSignalingId = str2;
        this.callbacks = signalingTransportCallback;
        this.extCallbacks = signalingTransportCallbackExt;
        this.messageType = str3;
        this.loggingAnnotations = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChatDTransportSenderSendInput{message=");
        A1A.append(this.message);
        A1A.append(",flowId=");
        A1A.append(this.flowId);
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
        A1A.append(",loggingAnnotations=");
        return C66582MXn.A0v(this.loggingAnnotations, A1A);
    }
}
