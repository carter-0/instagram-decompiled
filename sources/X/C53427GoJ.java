package X;

/* renamed from: X.GoJ  reason: case insensitive filesystem */
public final class C53427GoJ extends AnonymousClass0T0 implements JRS {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53427GoJ) {
                C53427GoJ goJ = (C53427GoJ) obj;
                if (!0qQ.A0K(this.A02, goJ.A02) || !0qQ.A0K(this.A00, goJ.A00) || !0qQ.A0K(this.A01, goJ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public C53427GoJ(String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
