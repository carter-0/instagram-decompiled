package X;

/* renamed from: X.GoY  reason: case insensitive filesystem */
public final class C53440GoY extends AnonymousClass0T0 implements C59651JRt {
    public final C53450Goi A00;
    public final String A01;
    public final String A02;

    public final C53440GoY F2g() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53440GoY) {
                C53440GoY goY = (C53440GoY) obj;
                if (!0qQ.A0K(this.A01, goY.A01) || !0qQ.A0K(this.A00, goY.A00) || !0qQ.A0K(this.A02, goY.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public C53440GoY(C53450Goi goi, String str, String str2) {
        AnonymousClass7TG.A1U(str, goi, str2);
        this.A01 = str;
        this.A00 = goi;
        this.A02 = str2;
    }
}
