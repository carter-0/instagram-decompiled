package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IcE  reason: case insensitive filesystem */
public final class C57526IcE implements JR0 {
    public AnonymousClass49S A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public final String Apg() {
        return this.A01;
    }

    public final AnonymousClass49S Apm() {
        return this.A00;
    }

    public final String B9x() {
        return this.A01;
    }

    public final String BRt() {
        return this.A02;
    }

    public final AnonymousClass2hP BWQ() {
        return (AnonymousClass2hP) this.A04.get();
    }

    public final String getModuleName() {
        return this.A03;
    }

    public C57526IcE(AnonymousClass49S r2, AnonymousClass2hP r3, String str, String str2, String str3) {
        C51972G9s.A1D(str2, str3);
        0qQ.A0B(r2, 7);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = r2;
        this.A04 = C51965G9l.A0v(r3);
    }
}
