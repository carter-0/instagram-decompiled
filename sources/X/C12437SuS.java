package X;

import java.io.Serializable;

/* renamed from: X.SuS  reason: case insensitive filesystem */
public class C12437SuS implements C13901TjO, Serializable {
    public final C268894eF A00;
    public final T9n A01;
    public final C269434f7 A02;
    public final C8208QkH A03;

    public final C269194ej AVP(C269144ee r4, Class cls) {
        C8208QkH qkH;
        C269194ej r2 = ((C269304eu) r4).A01.A00;
        C268854eA A012 = r4.A01();
        if (A012 == null || (qkH = this.A03) == null) {
            return r2;
        }
        return r2.A00(A012.A06(qkH));
    }

    public final C269434f7 B8O() {
        return this.A02;
    }

    public final C8208QkH BRS() {
        return this.A03;
    }

    public final T9n BSh() {
        return this.A01;
    }

    public final C268894eF CAJ() {
        return this.A00;
    }

    public final String getName() {
        return this.A02.A02;
    }

    public C12437SuS(C268894eF r1, T9n t9n, C269434f7 r3, C8208QkH qkH) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = t9n;
        this.A03 = qkH;
    }

    public final C269314ev AVO(C269144ee r4, Class cls) {
        C8208QkH qkH;
        C269314ev A04;
        C269314ev A002 = r4.A00();
        C268854eA A012 = r4.A01();
        if (A012 == null || (qkH = this.A03) == null || (A04 = A012.A04(qkH)) == null) {
            return A002;
        }
        return A002.A00(A04);
    }
}
