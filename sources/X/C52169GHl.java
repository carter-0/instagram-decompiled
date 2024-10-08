package X;

import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GHl  reason: case insensitive filesystem */
public final class C52169GHl extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final C59618JQm A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final GFO A07;
    public final C52084GEe A08;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        float f = this.A04;
        2V5 A0Z = C51968G9o.A0Z(r13, (f + 1.0f) * 1.0f);
        2V5 A0Z2 = C51968G9o.A0Z(r13, 1.0f);
        long j = this.A05;
        long A012 = 2Wd.A01(1.0f / 2.0f, 2Wd.A01(f, j));
        AnonymousClass3XV r5 = 2WX.A02;
        Integer num = AnonymousClass05K.A1F;
        2WX A0A = C51974G9v.A0A(A0Z, (2WX) null, new AnonymousClass9JS(A0Z, num));
        Integer num2 = AnonymousClass05K.A00;
        2WX A0W = C51971G9r.A0W(A0Z2, A0A, num2);
        long A013 = 2Wd.A01(1.0f - f, j);
        2WX A002 = AnonymousClass9JR.A00(A0W, num2, 0, A013);
        Integer num3 = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00(A002, num3, 0, A013);
        long j2 = this.A06;
        2WX A0S = C51972G9s.A0S(A003, 0, A012);
        Integer num4 = AnonymousClass05K.A08;
        return new GH5(C244013aV.A0D(r13, R.drawable.instagram_comment_outline_44), ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Y(C51971G9r.A0Y(C51972G9s.A0U(C51971G9r.A0Y(C51974G9v.A0J(C51974G9v.A0F(AnonymousClass9JR.A00(A0S, num4, 0, A012), C51967G9n.A0T(0, A012), 0, j2), C51972G9s.A0W(r13, 2131956343, 0), num2), num, J6J.A00(this, 12), 4), num3, 0), num4, "comment_button", 4), AnonymousClass05K.A04, J6J.A00(this, 13), 4), false);
    }

    public C52169GHl(C267324bN r2, C52058GDe gDe, UserSession userSession, GFO gfo, C59618JQm jQm, C52084GEe gEe, float f, long j, long j2) {
        AnonymousClass7TG.A1U(gEe, jQm, r2);
        0qQ.A0B(gDe, 5);
        this.A08 = gEe;
        this.A03 = jQm;
        this.A00 = r2;
        this.A02 = userSession;
        this.A01 = gDe;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = f;
        this.A07 = gfo;
    }
}
