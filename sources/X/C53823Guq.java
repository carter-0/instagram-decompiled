package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Guq  reason: case insensitive filesystem */
public final class C53823Guq extends C251343mx {
    public final JPE A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final UserSession A03;
    public final JR6 A04;
    public final boolean A05;
    public final boolean A06;

    public C53823Guq(JPE jpe, C267324bN r2, C52058GDe gDe, UserSession userSession, JR6 jr6, boolean z, boolean z2) {
        C51972G9s.A1B(userSession, jr6);
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = gDe;
        this.A04 = jr6;
        this.A00 = jpe;
        this.A05 = z;
        this.A06 = z2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        C251263mp guC;
        C251263mp gNv;
        boolean A1Z = C51966G9m.A1Z(r15);
        C243573Zh r0 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, r0, 3));
        long A032 = C244013aV.A03(r15);
        2WX A0x = G9t.A0x(C51973G9u.A0R(A0X, C51967G9n.A0U(A1Z ? 1 : 0, A032), A1Z, C244013aV.A03(r15)), AnonymousClass05K.A0C, 0.0f);
        boolean z = this.A05;
        if (z) {
            A0x = A0x.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0A, A1Z, C244013aV.A0C(r15, R.dimen.barcelona_countdown_sticker_digit_background_height)));
        }
        2Wb A0Q = C51972G9s.A0Q(r15);
        boolean z2 = this.A06;
        UserSession userSession = this.A03;
        C267324bN r9 = this.A01;
        C52058GDe gDe = this.A02;
        JR6 jr6 = this.A04;
        if (z2) {
            guC = new C53784GuD(r9, gDe, userSession, jr6, z);
        } else {
            guC = new C53783GuC(r9, gDe, userSession, jr6, z);
        }
        A0Q.A00(guC);
        JPE jpe = this.A00;
        if (jpe == null) {
            gNv = new AnonymousClass3XA();
        } else {
            gNv = new C52328GNv(C51971G9r.A0Y(C51974G9v.A0D((2WX) null, C51965G9l.A0b(num, 100.0f, A1Z), 100.0f, A1Z), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), jpe, r9, gDe);
        }
        return C51967G9n.A0Q(gNv, A0Q, r15, A0x);
    }
}
