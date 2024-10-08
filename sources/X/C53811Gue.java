package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gue  reason: case insensitive filesystem */
public final class C53811Gue extends C251343mx {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;
    public final C232722uK A02;
    public final 2WX A03;
    public final UserSession A04;
    public final String A05;
    public final boolean A06;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        2Wa A002 = C243643Zq.A00(r13, C58391IrA.A00);
        C243673Zt A003 = C243633Zp.A00(r13, C58392IrB.A00);
        String str = this.A05;
        C243773a4.A00(r13, new C58187Inr(24, this, A002), new Object[]{str});
        C243533Zd r7 = C243533Zd.GLOBAL;
        AnonymousClass4Ey A004 = 2Vi.A00(r7, "carousel_overlay_audio_hint");
        A004.A02(C51970G9q.A03(A004, C246033ds.A00));
        Object obj = A002.A03;
        int i = 150;
        if (obj == null) {
            i = C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        C51966G9m.A1M(A004, i);
        AnonymousClass4F7.A00(r13, A004);
        2WX r4 = this.A03;
        2Wb A0Q = C51972G9s.A0Q(r13);
        if (this.A06 || obj != null) {
            UserSession userSession = this.A04;
            C232722uK r9 = this.A02;
            C58176Ing ing = new C58176Ing(this, 48);
            AnonymousClass3XV r0 = 2WX.A02;
            A0Q.A00(new C53770Gtz(C51971G9r.A0Z(C51971G9r.A0Z(C51971G9r.A0V(A0Q.A00, (2WX) null, r7, "carousel_overlay_audio_hint"), AnonymousClass05K.A00, J6S.A00(A002, A003, 16), (String) null), AnonymousClass05K.A01, new J6H(A003, 11), (String) null), userSession, r9, str, ing));
        }
        return C243563Zg.A0B(A0Q, r13, r4);
    }

    public C53811Gue(2WX r2, UserSession userSession, 1Xj r4, AnonymousClass3W1 r5, C232722uK r6, String str, boolean z) {
        AnonymousClass7TG.A1U(str, userSession, r6);
        0qQ.A0B(r5, 5);
        this.A05 = str;
        this.A04 = userSession;
        this.A02 = r6;
        this.A00 = r4;
        this.A01 = r5;
        this.A06 = z;
        this.A03 = r2;
    }
}
