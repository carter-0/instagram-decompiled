package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GvN  reason: case insensitive filesystem */
public final class C53856GvN extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JR7 A02;
    public final C59509JMh A03;
    public final C52046GCs A04;
    public final boolean A05;
    public final int A06;
    public final 2WX A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        C54663HMu hMu;
        2WX r2;
        AnonymousClass4DU r22;
        0qQ.A0B(r15, 0);
        2V1 r9 = r15.A05;
        Context context = r9.A0C;
        int A002 = AnonymousClass3ZC.A00(AnonymousClass7TF.A0A(context));
        int i = this.A06;
        if (((float) i) > ((float) A002) * 0.25f) {
            C59509JMh jMh = this.A03;
            0qQ.A0B(jMh, 0);
            if (jMh instanceof HKH) {
                hMu = C54663HMu.AppRatingsAndReviews;
            } else if (jMh instanceof HKG) {
                hMu = C54663HMu.AppInstallCount;
            } else if (jMh instanceof C57635Ie0) {
                hMu = C54663HMu.BusinessCategory;
            } else {
                hMu = C54663HMu.BusinessRatingsAndReviews;
            }
            long A062 = C244013aV.A06(r15);
            int i2 = hMu.A00;
            0sL r3 = hMu.A01;
            C267324bN r11 = this.A00;
            String str = (String) r3.invoke(r11, context);
            if (str != null) {
                2WX r7 = 2WX.A02;
                2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, A062);
                Integer num = AnonymousClass05K.A01;
                2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(A003, num, 0, A062), AnonymousClass05K.A0D, "clips_more_info_label_glyph_tag", 4);
                Drawable A0K = C51968G9o.A0K(r15, i2);
                C51973G9u.A0x(A0K, r15, R.color.canvas_bottom_sheet_description_text_color);
                GH5 gh5 = new GH5(A0K, (ImageView.ScaleType) null, A0Y, false);
                2WX A004 = C52199GIq.A00(r15);
                AnonymousClass9JS A0d = C51965G9l.A0d(num, true, 4);
                if (A004 == r7) {
                    A004 = null;
                }
                2WX A0V = C51972G9s.A0V(C51965G9l.A0X(A004, A0d), J6P.A00(this, 0));
                if (!(jMh instanceof C57635Ie0) || (r22 = this.A09) == null) {
                    r2 = null;
                } else {
                    r2 = GFM.A01(C238863Ds.ATTRIBUTION_ROW_PILL, r7, r11, this.A08, r22);
                }
                2WX A005 = C51971G9r.A0Z(A0V, AnonymousClass05K.A0Y, J6P.A00(this, 1), (String) null).A00(r2);
                2WX A006 = this.A07.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0N, 0, C51969G9p.A0G(i)));
                2Wb A0S = AnonymousClass7TG.A0S(r9);
                2Wb A0v = G9t.A0v(gh5, A0S.A00);
                C51971G9r.A1E(C52199GIq.A02(A0v, (2WX) null, str, false), A0v, A0S, A005);
                return C243563Zg.A0B(A0S, r15, A006);
            }
        }
        return null;
    }

    public C53856GvN(2WX r2, C267324bN r3, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r6, JR7 jr7, C59509JMh jMh, C52046GCs gCs, int i, boolean z) {
        C51974G9v.A1L(jMh, jr7, gDe);
        0qQ.A0B(userSession, 5);
        this.A03 = jMh;
        this.A02 = jr7;
        this.A00 = r3;
        this.A01 = gDe;
        this.A08 = userSession;
        this.A07 = r2;
        this.A06 = i;
        this.A05 = z;
        this.A04 = gCs;
        this.A09 = r6;
    }
}
