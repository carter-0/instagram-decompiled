package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* renamed from: X.Ppi  reason: case insensitive filesystem */
public final class C74141Ppi extends 0Yg implements 0sP {
    public static final C74141Ppi A00 = new C74141Ppi();

    public C74141Ppi() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        VideoEffectCommunicationApi videoEffectCommunicationApi = C66581MXm.A0j(obj).A06.A00;
        if (videoEffectCommunicationApi != null) {
            videoEffectCommunicationApi.participantModuleReset();
        }
        return C60340gF.A00;
    }
}
