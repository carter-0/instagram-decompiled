package X;

import com.instagram.common.session.UserSession;

public final class GLT extends C251343mx {
    public final int A00;
    public final JQS A01;
    public final GLQ A02;
    public final 2WX A03;
    public final UserSession A04;

    public GLT(2WX r2, UserSession userSession, JQS jqs, GLQ glq, int i) {
        AnonymousClass7TG.A0w(1, userSession, glq, jqs);
        this.A04 = userSession;
        this.A03 = r2;
        this.A02 = glq;
        this.A01 = jqs;
        this.A00 = i;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        2WX r1 = this.A03;
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass9JQ A0b = C51965G9l.A0b(num, 0.0f, 1);
        2WX r3 = 2WX.A02;
        if (r1 == r3) {
            r1 = null;
        }
        2WX A0Z = C51971G9r.A0Z(C51973G9u.A0Z(C51965G9l.A0X(r1, A0b), J6P.A00(this, 5)), AnonymousClass05K.A00, J6P.A00(this, 6), (String) null);
        2Wb A0Q = C51972G9s.A0Q(r13);
        int i = this.A00;
        2WX A002 = C52199GIq.A00(A0Q);
        AnonymousClass9JQ A0b2 = C51965G9l.A0b(num, 0.0f, 1);
        if (A002 == r3) {
            A002 = null;
        }
        2WX A0X = C51965G9l.A0X(A002, A0b2);
        2Wb A0L = C51973G9u.A0L(A0Q);
        C51971G9r.A1E(C52199GIq.A02(A0L, (2WX) null, C244013aV.A0F(A0L, Integer.valueOf(i), 2131971794), false), A0L, A0Q, A0X);
        return C243563Zg.A0G(A0Q, r13, A0Z);
    }
}
