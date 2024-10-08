package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.AnonymousClass7TG;
import X.B0V;
import X.C56908IHd;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

public final class MultipeerServiceDelegateBridge {
    public B0V delegate;

    public final void sendBinaryMessage(String str, byte[] bArr, boolean z) {
        B0V b0v = this.delegate;
        if (b0v != null) {
            boolean A1Z = AnonymousClass7TG.A1Z(str, bArr);
            VideoEffectCommunicationApi videoEffectCommunicationApi = ((C56908IHd) b0v).A02.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.sendMultipeerBinaryMessage(str, bArr, A1Z);
            }
        }
    }

    public final void sendMessage(String str, String str2, boolean z) {
        B0V b0v = this.delegate;
        if (b0v != null) {
            boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
            VideoEffectCommunicationApi videoEffectCommunicationApi = ((C56908IHd) b0v).A02.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.sendMultipeerMessage(str, str2, A1Z);
            }
        }
    }

    public final void setBinaryMessageTopicHandler(String str, Object obj) {
        B0V b0v = this.delegate;
        if (b0v != null) {
            AnonymousClass7TG.A1N(str, obj);
            ((C56908IHd) b0v).A00.put(str, obj);
        }
    }

    public final void setTopicHandler(String str, Object obj) {
        B0V b0v = this.delegate;
        if (b0v != null) {
            AnonymousClass7TG.A1N(str, obj);
            ((C56908IHd) b0v).A01.put(str, obj);
        }
    }
}
