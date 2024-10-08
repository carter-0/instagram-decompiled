package X;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.GDy  reason: case insensitive filesystem */
public class C52078GDy {
    public C267324bN A00;
    public IgImageView A01;
    public IgImageView A02;
    public AnonymousClass3W1 A03;
    public JRK A04;
    public SimpleVideoLayout A05;
    public boolean A06;
    public boolean A07;
    public final View A08;
    public final LithoView A09;
    public final ClipsViewerConfig A0A;
    public final UserSession A0B;
    public final C256003v4 A0C;
    public final C252063oV A0D;
    public final C252063oV A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static final void A00(Drawable drawable, C52078GDy gDy) {
        IgImageView igImageView = gDy.A02;
        if (igImageView != null) {
            igImageView.setImageDrawable(drawable);
        }
        IgImageView igImageView2 = gDy.A02;
        if (igImageView2 != null) {
            C294975nL.A04(new C65724Lye((Object) gDy, 29), new View[]{igImageView2}, true);
        }
    }

    public static final void A01(C52078GDy gDy, boolean z, boolean z2) {
        IgImageView igImageView;
        if (z2 && !gDy.A0G && (igImageView = gDy.A02) != null) {
            DbU.A13(gDy.A08.getContext(), igImageView, R.drawable.instagram_play_pano_filled_24);
        }
        if (!gDy.A0G) {
            IgImageView igImageView2 = gDy.A02;
            if (z) {
                if (igImageView2 != null) {
                    C294975nL.A04((C295005nO) null, new View[]{igImageView2}, false);
                }
            } else if (igImageView2 != null) {
                C294975nL.A05(new View[]{igImageView2}, false);
            }
        } else if (z) {
            AnonymousClass3W1 r1 = gDy.A03;
            if (r1 != null) {
                C51966G9m.A1N(r1.A3W, r1, true);
            }
        } else {
            AnonymousClass3W1 r2 = gDy.A03;
            if (r2 != null) {
                C51966G9m.A1N(r2.A3W, r2, false);
            }
        }
    }

    public final IgImageView A02() {
        IgImageView igImageView = this.A01;
        if (igImageView == null) {
            return new IgImageView(AnonymousClass7TE.A0S(this.A09));
        }
        return igImageView;
    }

    public final SimpleVideoLayout A03() {
        SimpleVideoLayout simpleVideoLayout = this.A05;
        if (simpleVideoLayout == null) {
            return new SimpleVideoLayout(AnonymousClass7TE.A0S(this.A09), (AttributeSet) null, 0);
        }
        return simpleVideoLayout;
    }

    public final void A04(IgImageView igImageView, boolean z) {
        if (!this.A0F) {
            return;
        }
        if (1KU.A07(this.A0B)) {
            if (this.A02 == null) {
                if (igImageView != null) {
                    this.A02 = igImageView;
                }
                if (z) {
                    A01(this, true, false);
                }
            }
        } else if (igImageView != null) {
            this.A02 = igImageView;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326077475599854L) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52078GDy(com.facebook.litho.LithoView r5, com.instagram.clips.intf.ClipsViewerConfig r6, com.instagram.common.session.UserSession r7, boolean r8) {
        /*
            r4 = this;
            X.C51972G9s.A1B(r6, r7)
            r4.<init>()
            r4.A0A = r6
            r4.A09 = r5
            r4.A0B = r7
            r4.A0F = r8
            r4.A08 = r5
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = new com.instagram.common.ui.widget.imageview.IgImageView
            r1.<init>(r2)
            r3 = 0
            X.2b2 r0 = new X.2b2
            r0.<init>(r1)
            r4.A0D = r0
            com.instagram.feed.widget.IgProgressImageView r1 = new com.instagram.feed.widget.IgProgressImageView
            r1.<init>(r2)
            X.2b2 r0 = new X.2b2
            r0.<init>(r1)
            r4.A0E = r0
            boolean r0 = X.1KU.A07(r7)
            if (r0 == 0) goto L_0x0041
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326077475599854(0x810e60000435ee, double:3.0360958967180686E-306)
            boolean r1 = X.182.A06(r2, r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r4.A0G = r0
            r1 = 0
            X.3v4 r0 = new X.3v4
            r0.<init>(r3, r1)
            r4.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52078GDy.<init>(com.facebook.litho.LithoView, com.instagram.clips.intf.ClipsViewerConfig, com.instagram.common.session.UserSession, boolean):void");
    }
}
