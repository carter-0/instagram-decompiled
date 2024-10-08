package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GvB  reason: case insensitive filesystem */
public final class C53844GvB extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final S6e A02;
    public final JTK A03;
    public final C52679Gar A04;
    public final 2WX A05;
    public final ClipsViewerConfig A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;

    public C53844GvB(2WX r2, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r7, S6e s6e, JTK jtk, C52679Gar gar) {
        C51973G9u.A0r(3, r4, userSession, gDe);
        AnonymousClass7TF.A1F(r7, 7, clipsViewerConfig);
        this.A04 = gar;
        this.A03 = jtk;
        this.A00 = r4;
        this.A07 = userSession;
        this.A01 = gDe;
        this.A05 = r2;
        this.A08 = r7;
        this.A06 = clipsViewerConfig;
        this.A02 = s6e;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        int i;
        Boolean bool;
        C53751Gtg gtg;
        AnonymousClass3Y5 r6 = r27;
        0qQ.A0B(r6, 0);
        C267324bN r5 = this.A00;
        boolean z = false;
        0qQ.A0B(r5, 0);
        if (r5.CcK()) {
            z = true;
        }
        if (z) {
            UserSession userSession = this.A07;
            boolean A042 = GEK.A04(r5, userSession);
            1Xj r12 = r5.A02;
            if (r12 != null) {
                long A062 = C244013aV.A06(r6);
                2WX r18 = 2WX.A02;
                2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, A062);
                Integer num = AnonymousClass05K.A01;
                2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00(A002, num, 0, A062), AnonymousClass05K.A0C, 0.0f, 1);
                Integer num2 = AnonymousClass05K.A0D;
                2WX A0Y = C51971G9r.A0Y(A0X, num2, "clips_sponsored_label_glyph_tag", 4);
                Drawable A0K = C51968G9o.A0K(r6, R.drawable.instagram_ads_pano_filled_16);
                C51973G9u.A0x(A0K, r6, R.color.canvas_bottom_sheet_description_text_color);
                Drawable mutate = A0K.mutate();
                if (A042) {
                    C51973G9u.A0x(mutate, r6, R.color.fds_white_alpha80);
                }
                0qQ.A07(mutate);
                GH5 gh5 = new GH5(mutate, (ImageView.ScaleType) null, A0Y, false);
                2WW A022 = C52199GIq.A02(r6, C51973G9u.A0N(C244063aa.SPONSORED_LABEL, (2WX) null), r5.A06().A0i, A042);
                C52058GDe gDe = this.A01;
                AnonymousClass3W1 r13 = gDe.A0E;
                if (r13 != null) {
                    i = r13.A03;
                } else {
                    i = -1;
                    if (r12.A5D()) {
                        i = 0;
                    }
                }
                User A11 = C51966G9m.A11(r12);
                if (A11 != null) {
                    bool = Boolean.valueOf(A11.A2Q());
                } else {
                    bool = null;
                }
                boolean A043 = AnonymousClass3ZC.A04(C243803a8.A00(r6), userSession, r12, bool, i);
                boolean A003 = C52368GPp.A00(userSession);
                2V5 A0Z = C51968G9o.A0Z(r6, 0.0f);
                C243673Zt A004 = C243633Zp.A00(r6, C58627Iuy.A00);
                C52679Gar gar = this.A04;
                boolean z2 = true;
                if (gar == null || !gar.A00) {
                    gtg = null;
                } else {
                    gtg = new C53751Gtg(r5, gDe, userSession, this.A03);
                }
                C243773a4.A00(r6, new C58206IoA(5, A0Z, A004, this, A003), new Object[]{gDe});
                2WX r1 = this.A05;
                2Wb A0Q = C51972G9s.A0Q(r6);
                2WX A012 = C52199GIq.A01(A0Q, (Integer) null, false, false, false, A042);
                if (this.A03 == null) {
                    z2 = false;
                }
                AnonymousClass9JS A0d = C51965G9l.A0d(num, Boolean.valueOf(z2), 4);
                if (A012 == r18) {
                    A012 = null;
                }
                C51971G9r.A1E(gtg, C51973G9u.A0J(gh5, A022, A0Q.A00), A0Q, C51972G9s.A0V(GFM.A02(C238863Ds.SPONSORED_CONTEXT, C51971G9r.A0W(A0Z, C51971G9r.A0Y(C51965G9l.A0X(A012, A0d), num2, "clips_sponsored_label_tag", 4), AnonymousClass05K.A02), r5, userSession, this.A08, A043), J6R.A00(this, A0Q, 39)));
                return C243563Zg.A0B(A0Q, r6, r1);
            }
        }
        return null;
    }
}
