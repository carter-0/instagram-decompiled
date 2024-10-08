package X;

import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.AudioPageViewModel$viewState$1", f = "AudioPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GVV extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ C53044Ghc A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVV(C53044Ghc ghc, AnonymousClass4D7 r3) {
        super(6, r3);
        this.A05 = ghc;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        boolean A1a2 = AnonymousClass7TE.A1a(obj3);
        boolean A1a3 = AnonymousClass7TE.A1a(obj4);
        GVV gvv = new GVV(this.A05, (AnonymousClass4D7) obj6);
        gvv.A00 = obj;
        gvv.A02 = A1a;
        gvv.A03 = A1a2;
        gvv.A04 = A1a3;
        gvv.A01 = obj5;
        return gvv.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C2606046i r6;
        boolean z;
        String str;
        C61037Jvb jvb;
        1ro r5;
        MusicAssetModel musicAssetModel;
        MusicInfoImpl musicInfoImpl;
        TrackData trackData;
        0eS.A00(obj);
        List list = (List) this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        boolean z4 = this.A04;
        GVR gvr = (GVR) this.A01;
        if (gvr == null || (r6 = gvr.A01()) == null) {
            r6 = (C2606046i) this.A05.A0F.getValue();
        }
        C53368Gms gms = null;
        if (gvr != null) {
            str = gvr.A07;
            z = gvr.A0E;
            jvb = gvr.A03;
            C55709Hm6 hm6 = gvr.A05;
            if (hm6 != null) {
                r5 = hm6.A02;
            }
            r5 = null;
        } else {
            str = null;
            z = false;
            jvb = null;
            r5 = null;
        }
        MusicPageTabType musicPageTabType = this.A05.A08;
        if (gvr != null) {
            gms = gvr.A00;
            C55709Hm6 hm62 = gvr.A05;
            if (!(hm62 == null || (musicInfoImpl = hm62.A00) == null || (trackData = musicInfoImpl.A00) == null)) {
                musicAssetModel = MusicAssetModel.A01(trackData, false);
                return new GVW(gms, jvb, musicPageTabType, r5, r6, musicAssetModel, str, list, z2, z3, z4, z);
            }
        }
        musicAssetModel = null;
        return new GVW(gms, jvb, musicPageTabType, r5, r6, musicAssetModel, str, list, z2, z3, z4, z);
    }
}
