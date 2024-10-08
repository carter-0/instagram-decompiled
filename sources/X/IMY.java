package X;

import android.content.Context;
import com.instagram.music.common.config.MusicAttributionConfig;

public final class IMY implements C270674h7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ C57297IWg A02;
    public final /* synthetic */ C56044Hrt A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void D3s() {
    }

    public final void D3t(C52228GJt gJt) {
    }

    public final void D3u(C52263GLe gLe) {
        AnonymousClass8JL r0;
        0qQ.A0B(gLe, 0);
        C2606046i A012 = ((GVR) gLe.A01).A01();
        if (A012 != null) {
            MusicAttributionConfig Col = A012.Col(this.A00);
            C56044Hrt hrt = this.A03;
            String str = this.A04;
            hrt.A0G = str;
            hrt.A08 = Col;
            if (this.A06 && I7J.A00(this.A02.A01, str, this.A05) == (r0 = AnonymousClass8JL.AUDIO)) {
                0qQ.A0B(r0, 0);
                hrt.A01 = r0;
            }
        }
        C57297IWg.A00(this.A01, this.A02, this.A03);
    }

    public IMY(Context context, 28D r2, C57297IWg iWg, C56044Hrt hrt, String str, String str2, boolean z) {
        this.A00 = context;
        this.A03 = hrt;
        this.A04 = str;
        this.A06 = z;
        this.A02 = iWg;
        this.A05 = str2;
        this.A01 = r2;
    }

    public final void D3r(H3D h3d) {
        C57297IWg.A00(this.A01, this.A02, this.A03);
    }
}
