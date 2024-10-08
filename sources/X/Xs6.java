package X;

import java.util.Locale;

public final class Xs6 {
    public static final TAH A03 = TAH.A02(":");
    public static final TAH A04 = TAH.A02(":status");
    public static final TAH A05 = TAH.A02(":authority");
    public static final TAH A06 = TAH.A02(":method");
    public static final TAH A07 = TAH.A02(":path");
    public static final TAH A08 = TAH.A02(":scheme");
    public final int A00;
    public final TAH A01;
    public final TAH A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Xs6)) {
            return false;
        }
        Xs6 xs6 = (Xs6) obj;
        if (!this.A01.equals(xs6.A01) || !this.A02.equals(xs6.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, C21056XCh.A01(this.A01));
    }

    public final String toString() {
        Object[] objArr = {this.A01.A08(), this.A02.A08()};
        String A002 = AnonymousClass000.A00(201);
        C22023Xt4 xt4 = SUS.A04;
        return String.format(Locale.US, A002, objArr);
    }

    public Xs6(TAH tah, TAH tah2) {
        this.A01 = tah;
        this.A02 = tah2;
        this.A00 = tah.A05() + 32 + tah2.A05();
    }

    public Xs6(String str, TAH tah) {
        this(tah, TAH.A02(str));
    }

    public Xs6(String str, String str2) {
        this(TAH.A02(str), TAH.A02(str2));
    }
}
