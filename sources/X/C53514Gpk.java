package X;

/* renamed from: X.Gpk  reason: case insensitive filesystem */
public final class C53514Gpk extends AnonymousClass0T0 implements C59551JNx {
    public final Integer A00;
    public final String A01;
    public final C62320sa A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53514Gpk) {
                C53514Gpk gpk = (C53514Gpk) obj;
                if (!0qQ.A0K(this.A01, gpk.A01) || !0qQ.A0K(this.A02, gpk.A02) || this.A00 != gpk.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C62320sa BXy() {
        return this.A02;
    }

    public final int hashCode() {
        String str;
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A01));
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "PRIMARY";
                break;
            case 2:
                str = "SECONDARY";
                break;
            default:
                str = "LINK";
                break;
        }
        return A07 + C51966G9m.A04(str, intValue);
    }

    public C53514Gpk(String str, Integer num, C62320sa r3) {
        AnonymousClass7TG.A1O(str, r3);
        this.A01 = str;
        this.A02 = r3;
        this.A00 = num;
    }
}
