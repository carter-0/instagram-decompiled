package X;

/* renamed from: X.Dsy  reason: case insensitive filesystem */
public final class C47211Dsy extends AnonymousClass0T0 implements C51937G8g {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47211Dsy) {
                C47211Dsy dsy = (C47211Dsy) obj;
                if (!(this.A00 == dsy.A00 && this.A01 == dsy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return DbS.A06(this.A01, i * 31);
    }

    public C47211Dsy(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
