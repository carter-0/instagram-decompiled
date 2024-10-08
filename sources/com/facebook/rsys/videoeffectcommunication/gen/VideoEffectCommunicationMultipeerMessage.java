package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22179Xwp;
import X.C41845B3m;
import X.C51968G9o;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

public class VideoEffectCommunicationMultipeerMessage {
    public static 2LV CONVERTER = new C22179Xwp(18);
    public static long sMcfTypeId;
    public final byte[] binaryMessage;
    public final long effectId;
    public final String message;
    public final String senderId;
    public final String topic;

    public static native VideoEffectCommunicationMultipeerMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationMultipeerMessage)) {
                return false;
            }
            VideoEffectCommunicationMultipeerMessage videoEffectCommunicationMultipeerMessage = (VideoEffectCommunicationMultipeerMessage) obj;
            if (this.effectId != videoEffectCommunicationMultipeerMessage.effectId || !this.topic.equals(videoEffectCommunicationMultipeerMessage.topic) || !this.message.equals(videoEffectCommunicationMultipeerMessage.message)) {
                return false;
            }
            byte[] bArr = this.binaryMessage;
            byte[] bArr2 = videoEffectCommunicationMultipeerMessage.binaryMessage;
            if (bArr == null) {
                if (bArr2 != null) {
                    return false;
                }
            } else if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            String str = this.senderId;
            String str2 = videoEffectCommunicationMultipeerMessage.senderId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((AnonymousClass7TF.A08(this.message, AnonymousClass7TF.A08(this.topic, C66583MXo.A01(C51968G9o.A03(this.effectId)))) + AnonymousClass7TG.A0C(this.binaryMessage)) * 31) + C41845B3m.A00(this.senderId);
    }

    public VideoEffectCommunicationMultipeerMessage(long j, String str, String str2, byte[] bArr, String str3) {
        str.getClass();
        str2.getClass();
        this.effectId = j;
        this.topic = str;
        this.message = str2;
        this.binaryMessage = bArr;
        this.senderId = str3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationMultipeerMessage{effectId=");
        A1A.append(this.effectId);
        A1A.append(",topic=");
        A1A.append(this.topic);
        A1A.append(",message=");
        A1A.append(this.message);
        A1A.append(",binaryMessage=");
        A1A.append(this.binaryMessage);
        A1A.append(",senderId=");
        return C66584MXp.A0a(this.senderId, A1A);
    }
}
