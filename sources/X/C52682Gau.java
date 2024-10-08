package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gau  reason: case insensitive filesystem */
public final class C52682Gau extends C3028165n {
    public int A00;
    public C299025uS A01;
    public IgImageView A02;
    public IZD A03;

    public final void A03(View view, Integer num, String str, int i, int i2, int i3, int i4) {
        IZD izd = this.A03;
        if (izd != null) {
            String A002 = C54769HSb.A00(num);
            AnonymousClass6LP r0 = izd.A00;
            if (r0 != null) {
                r0.A0G(A002, i, i2);
            }
        }
        super.A03(view, num, str, i, i2, i3, i4);
    }

    public final void Dyz() {
        IZD izd;
        C299025uS r5 = this.A01;
        if (r5 != null && (izd = this.A03) != null) {
            AnonymousClass6LP r0 = izd.A00;
            if (r0 != null) {
                r0.A08();
            }
            String str = izd.A04;
            if (str != null) {
                AnonymousClass6LP r1 = izd.A00;
                if (r1 != null) {
                    r1.A0H("fully_enter_viewport", str);
                }
                izd.A08.Cgh(C306046Ko.A01(AnonymousClass05K.A01, str));
            }
            UserSession userSession = izd.A09;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36312733012657381L)) {
                int A04 = DbS.A04(r2, userSession, 36594207989434001L);
                AnonymousClass6LQ r6 = izd.A01;
                if (r6 != null) {
                    C56657I6m.A01(izd.A07, r5, r6, izd.A0A, 0.0f, A04);
                }
            }
        }
    }

    public final void Dz8() {
        IZD izd = this.A03;
        if (izd != null) {
            AnonymousClass6LP r0 = izd.A00;
            if (r0 != null) {
                r0.A09();
            }
            izd.A08.Cgh(C306046Ko.A00(AnonymousClass05K.A01));
        }
    }

    public final void DzB() {
        IZD izd = this.A03;
        if (izd != null) {
            AnonymousClass6LP r0 = izd.A00;
            if (r0 != null) {
                r0.A08();
            }
            String str = izd.A04;
            if (str != null) {
                AnonymousClass6LP r1 = izd.A00;
                if (r1 != null) {
                    r1.A0H("partially_enter_viewport", str);
                }
                izd.A08.Cgh(C306046Ko.A02(AnonymousClass05K.A01, str));
            }
        }
    }

    public final void EIx() {
        IZD izd = this.A03;
        if (izd != null) {
            izd.EIz();
        }
    }

    public final IgImageView getAudioIconView$fbandroid_java_instagram_features_clips_viewer_adapter_ads_litho_v2_v2() {
        return this.A02;
    }

    public final boolean isPlaying() {
        IZD izd = this.A03;
        if (izd != null) {
            return izd.isPlaying();
        }
        return false;
    }

    public final void pause() {
        IZD izd = this.A03;
        if (izd != null) {
            izd.pause();
        }
    }

    public final void setCompositionController(IZD izd) {
        this.A03 = izd;
        if (izd != null) {
            izd.A05 = new C58676Ivl(this, 48);
        }
    }

    public final void stop() {
        IZD izd = this.A03;
        if (izd != null) {
            izd.stop();
        }
    }

    public final boolean CWX() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void E2p() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void reset() {
        removeAllViews();
        C299025uS r0 = this.A01;
        if (r0 != null) {
            r0.setRenderTree((C245663dH) null);
        }
        this.A01 = null;
        IZD izd = this.A03;
        if (izd != null) {
            izd.A01();
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
    }

    public final void setAudioIconView$fbandroid_java_instagram_features_clips_viewer_adapter_ads_litho_v2_v2(IgImageView igImageView) {
        this.A02 = igImageView;
    }
}
