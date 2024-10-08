package X;

/* renamed from: X.77i  reason: invalid class name and case insensitive filesystem */
public final class C3265777i extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final 2FW A03;
    public final String A04;
    public final boolean A05;

    public C3265777i(2FW r2, String str, int i, int i2, int i3, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r2, 2);
        this.A04 = str;
        this.A03 = r2;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3265777i) {
                C3265777i r5 = (C3265777i) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01) * 31) + this.A02) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
