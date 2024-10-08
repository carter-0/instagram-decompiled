package X;

/* renamed from: X.Dro  reason: case insensitive filesystem */
public final class C47173Dro extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public C47173Dro(int i, String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47173Dro)) {
            return false;
        }
        C47173Dro dro = (C47173Dro) obj;
        if (dro.A00 == 0 && 0qQ.A0K(this.A02, dro.A02) && this.A01 == dro.A01 && this.A03 == dro.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        return DbS.A06(this.A03, (AnonymousClass7TE.A0O(this.A02) + this.A01) * 31);
    }

    public C47173Dro(String str, boolean z, int i) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = i;
    }
}
