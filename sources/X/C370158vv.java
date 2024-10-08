package X;

import java.util.List;

/* renamed from: X.8vv  reason: invalid class name and case insensitive filesystem */
public final class C370158vv extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C370158vv) {
                C370158vv r5 = (C370158vv) obj;
                if (!(0qQ.A0K(this.A05, r5.A05) && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A05.hashCode() * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02);
    }

    public C370158vv(boolean z) {
        0sn r3 = 0sn.A00;
        float f = z ? 0.0f : 1.0f;
        0qQ.A0B(r3, 1);
        this.A05 = r3;
        this.A03 = f;
        this.A00 = 1.0f;
        this.A04 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
    }

    public C370158vv() {
        this(false);
    }
}
