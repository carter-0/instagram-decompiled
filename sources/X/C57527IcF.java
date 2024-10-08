package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IcF  reason: case insensitive filesystem */
public final class C57527IcF implements JR0 {
    public AnonymousClass49S A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public C57527IcF(AnonymousClass49S r2, AnonymousClass2hP r3, String str, String str2, String str3, String str4) {
        C51973G9u.A0r(2, r2, str2, str3);
        this.A00 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A05 = C51965G9l.A0v(r3);
    }

    public final String Apg() {
        return this.A01;
    }

    public final AnonymousClass49S Apm() {
        return this.A00;
    }

    public final String B9x() {
        return this.A02;
    }

    public final String BRt() {
        return this.A03;
    }

    public final AnonymousClass2hP BWQ() {
        return (AnonymousClass2hP) this.A05.get();
    }

    public final String getModuleName() {
        return this.A04;
    }
}
