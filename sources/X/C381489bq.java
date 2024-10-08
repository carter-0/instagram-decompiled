package X;

/* renamed from: X.9bq  reason: invalid class name and case insensitive filesystem */
public final class C381489bq extends AnonymousClass0T0 {
    public final C381599c1 A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381489bq) {
                C381489bq r5 = (C381489bq) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C381489bq(C381599c1 r1, Boolean bool, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A04 = str3;
        this.A01 = bool;
    }
}
