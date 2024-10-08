package X;

/* renamed from: X.3Kf  reason: invalid class name and case insensitive filesystem */
public final class C240263Kf extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;
    public final boolean A02;
    public final boolean A03;

    public C240263Kf(1Xj r2, AnonymousClass3W1 r3, boolean z, boolean z2) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = z;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240263Kf) {
                C240263Kf r5 = (C240263Kf) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02 || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        return i2 + i3;
    }
}
