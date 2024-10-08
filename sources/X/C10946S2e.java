package X;

import java.util.List;

/* renamed from: X.S2e  reason: case insensitive filesystem */
public final class C10946S2e {
    public final 02U A00;
    public final C13538TcA A01;
    public final String A02;
    public final List A03;
    public final Class A04;

    public C10946S2e(02U r8, C13538TcA tcA, Class cls, Class cls2, Class cls3, List list) {
        this.A04 = cls;
        this.A03 = list;
        this.A01 = tcA;
        this.A00 = r8;
        this.A02 = 002.A15("Failed DecodePath{", cls.getSimpleName(), "->", cls2.getSimpleName(), "->", cls3.getSimpleName(), "}");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DecodePath{ dataClass=");
        A1A.append(this.A04);
        A1A.append(", decoders=");
        A1A.append(this.A03);
        A1A.append(", transcoder=");
        return Pxg.A0p(this.A01, A1A);
    }
}
