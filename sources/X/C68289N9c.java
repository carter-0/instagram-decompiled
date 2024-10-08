package X;

/* renamed from: X.N9c  reason: case insensitive filesystem */
public final class C68289N9c extends AnonymousClass0T0 implements C74270Pry {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C68289N9c(boolean z, boolean z2, int i) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C68289N9c)) {
            return false;
        }
        C68289N9c n9c = (C68289N9c) obj;
        if (n9c.A00 == i && this.A02 == n9c.A02 && this.A01 == n9c.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, C51965G9l.A05(this.A02));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C68289N9c() {
        this(true, true, 1);
        this.A00 = 1;
    }
}
