package X;

import android.animation.Animator;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GHd  reason: case insensitive filesystem */
public final class C52161GHd extends C251343mx {
    public final Animator A00;
    public final C61047Jvl A01;
    public final 2Wa A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C247003fc A05;
    public final C59626JQu A06;
    public final boolean A07;
    public final float A08;
    public final long A09;
    public final long A0A;
    public final GFO A0B;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        AnonymousClass3Y5 r7 = r23;
        0qQ.A0B(r7, 0);
        C52162GHe gHe = C52162GHe.A00;
        float f = this.A08;
        2V5 A0Z = C51968G9o.A0Z(r7, (f + 1.0f) * 1.0f);
        2V5 A0Z2 = C51968G9o.A0Z(r7, 1.0f);
        long j = this.A09;
        long A012 = 2Wd.A01(1.0f / 2.0f, 2Wd.A01(f, j));
        2Wa A002 = C243643Zq.A00(r7, C52163GHf.A00);
        Object obj = C249213jJ.A01(new I84(A0Z, 35), this.A04).A00;
        Object A003 = AnonymousClass3Zw.A00(r7, C52164GHg.A00, new Object[0]);
        C243773a4.A00(r7, new C58207IoB(0, A003, this, A002, obj), new Object[]{this.A05});
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A1F;
        2WX A0A2 = C51974G9v.A0A(A0Z, (2WX) null, new AnonymousClass9JS(A0Z, num));
        Integer num2 = AnonymousClass05K.A00;
        2WX A0W = C51971G9r.A0W(A0Z2, A0A2, num2);
        long A013 = 2Wd.A01(1.0f - f, j);
        2WX A004 = AnonymousClass9JR.A00(A0W, num2, 0, A013);
        Integer num3 = AnonymousClass05K.A01;
        2WX A005 = AnonymousClass9JR.A00(A004, num3, 0, A013);
        long j2 = this.A0A;
        2WX A0S = C51972G9s.A0S(A005, 0, A012);
        Integer num4 = AnonymousClass05K.A08;
        GH5 gh5 = new GH5(C244013aV.A0D(r7, R.drawable.instagram_direct_outline_44), ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Z(C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0Y(C51972G9s.A0U(C51974G9v.A0J(C51971G9r.A0Y(C51973G9u.A0U(C51974G9v.A0F(AnonymousClass9JR.A00(A0S, num4, 0, A012), C51967G9n.A0T(0, A012), 0, j2), r7, 2131973441), AnonymousClass05K.A0D, "clips_ufi_share_button_component", 4), C51965G9l.A0d(num4, "direct_share_button", 4), num2), num3, 0), num, J6J.A00(this, 18), 4), AnonymousClass05K.A03, J6J.A00(this, 19), 4), AnonymousClass05K.A04, J6J.A00(this, 20), 4), AnonymousClass05K.A0C, new C58768IxF(40, A002, this, obj, A003), (String) null).A00((2WX) null), false);
        AnonymousClass56V.A00(gh5, (AnonymousClass2VW) AnonymousClass3Zw.A00(r7, gHe, new Object[0]));
        return gh5;
    }

    public C52161GHd(Animator animator, C61047Jvl jvl, 2Wa r4, AnonymousClass0iw r5, UserSession userSession, C247003fc r7, GFO gfo, C59626JQu jQu, float f, long j, long j2, boolean z) {
        C51974G9v.A1P(jQu, jvl, userSession, r5);
        0qQ.A0B(r7, 9);
        this.A06 = jQu;
        this.A01 = jvl;
        this.A04 = userSession;
        this.A03 = r5;
        this.A09 = j;
        this.A0A = j2;
        this.A08 = f;
        this.A07 = z;
        this.A05 = r7;
        this.A00 = animator;
        this.A02 = r4;
        this.A0B = gfo;
    }
}
