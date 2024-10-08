package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Pma  reason: case insensitive filesystem */
public final class C73956Pma extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73956Pma(Object obj, String str, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A03 = obj;
        this.A02 = i2;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            N4R n4r = (N4R) obj;
            0qQ.A0B(n4r, 0);
            String str = this.A04;
            C68364NCd nCd = new C68364NCd((C71143Odx) this.A03, new C58729Iwc(str, 0));
            0qQ.A07(((OEP) n4r.A00).A01.startLiveSwapCopyId(str, this.A02, this.A01, "ig_rsys_live_swap", nCd));
        } else {
            1Ln r9 = (1Ln) obj;
            0qQ.A0B(r9, 0);
            r9.A0X(this.A01);
            r9.A0M((C69503Nml) this.A03, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            r9.A0O("is_e2ee", false);
            r9.A0Y(this.A02);
            C66580MXl.A1L(r9, "ai_voice");
            r9.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A04);
            r9.A0M(XSV.A02, "thread_type");
            r9.A0Z(24);
        }
        return C60340gF.A00;
    }
}
