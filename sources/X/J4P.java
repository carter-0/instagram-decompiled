package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

public final class J4P extends 0Yg implements 0sP {
    public static final J4P A00 = new J4P();

    public J4P() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NDr A0i = C51971G9r.A0i(obj);
        if (A0i.A04 != null) {
            A0i.A04 = null;
            VideoEffectCommunicationApi videoEffectCommunicationApi = A0i.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.participantModuleReset();
            }
            A0i.A02 = null;
            A0i.A07.A01 = null;
            A0i.A06.clear();
        }
        return C60340gF.A00;
    }
}
