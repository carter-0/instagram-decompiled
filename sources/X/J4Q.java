package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

public final class J4Q extends 0Yg implements 0sP {
    public static final J4Q A00 = new J4Q();

    public J4Q() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NDr A0i = C51971G9r.A0i(obj);
        if (A0i.A03 != null) {
            A0i.A03 = null;
            VideoEffectCommunicationApi videoEffectCommunicationApi = A0i.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.multipeerStopListening();
            }
            C56908IHd iHd = A0i.A01;
            if (iHd != null) {
                iHd.A01.clear();
                iHd.A00.clear();
            }
            A0i.A01 = null;
            A0i.A07.A00 = null;
        }
        return C60340gF.A00;
    }
}
