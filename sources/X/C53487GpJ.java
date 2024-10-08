package X;

/* renamed from: X.GpJ  reason: case insensitive filesystem */
public final class C53487GpJ extends AnonymousClass0T0 implements C299735vl {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53487GpJ) {
                C53487GpJ gpJ = (C53487GpJ) obj;
                if (!0qQ.A0K(this.A01, gpJ.A01) || !0qQ.A0K(this.A02, gpJ.A02) || !0qQ.A0K(this.A00, gpJ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }

    public C53487GpJ(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
