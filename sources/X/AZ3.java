package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;

public final class AZ3 implements C41815B1v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AZ3(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
        this.A04 = obj4;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void DOX() {
        if (this.A00 != 0) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            GiphyClipsBrowserFragment giphyClipsBrowserFragment = ((C60591Jo0) this.A04).A01;
            C59725JVj jVj = giphyClipsBrowserFragment.A00;
            if (jVj != null) {
                27r A012 = 27p.A01(AnonymousClass7TE.A0l(giphyClipsBrowserFragment.A09));
                0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(1429));
                if (A0e.isSampled()) {
                    AnonymousClass7TE.A1W(A0e, "event_type", 1);
                    AnonymousClass7TE.A1W(A0e, "entity_type", 41);
                    AnonymousClass7TH.A0W(A0e, A012);
                    AnonymousClass283 r2 = A012.A04;
                    A0e.AAJ("camera_session_id", r2.A0L);
                    A0e.A8M(AnonymousClass80P.THIRD_PARTY_MEDIA, "camera_tool");
                    A0e.AAJ("composition_str_id", r2.A0M);
                    A0e.A8M(28t.A06, "composition_media_type");
                    A0e.A8M(jVj, "surface");
                    A0e.AAJ("module", "giphy_clips_grid");
                    AnonymousClass7TH.A0V(A0e);
                }
            }
            ((View) this.A02).setVisibility(0);
            ((View) this.A01).setVisibility(0);
            return;
        }
        ((C268684dp) this.A03).EE1(this);
        C380519Ym r4 = (C380519Ym) this.A02;
        0nA.A0p(r4.A03, new C41130Aoq((Drawable) this.A01, r4, (C317876nz) this.A04));
    }

    public final void DXr() {
        if (this.A00 != 0) {
            ((View) this.A03).setVisibility(8);
        }
    }
}
