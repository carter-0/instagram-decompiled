package X;

/* renamed from: X.Jyh  reason: case insensitive filesystem */
public final class C61188Jyh extends AnonymousClass0T0 implements C66472MTa {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61188Jyh) {
                C61188Jyh jyh = (C61188Jyh) obj;
                if (!(0qQ.A0K(this.A02, jyh.A02) && this.A04 == jyh.A04 && 0qQ.A0K(this.A03, jyh.A03) && this.A00 == jyh.A00 && this.A01 == jyh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return this.A04;
    }

    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A04, AnonymousClass7TG.A0E(this.A02) * 31) + C41845B3m.A00(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public C61188Jyh(String str, String str2, int i, int i2, boolean z) {
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = i2;
    }
}
