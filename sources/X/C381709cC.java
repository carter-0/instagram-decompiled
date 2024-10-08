package X;

import java.io.File;

/* renamed from: X.9cC  reason: invalid class name and case insensitive filesystem */
public final class C381709cC extends AnonymousClass0T0 {
    public float A00;
    public final int A01;
    public final int A02;
    public final C390749rm A03;
    public final C361278fx A04;
    public final String A05;

    public C381709cC(C390749rm r2, C361278fx r3, String str, float f, int i, int i2) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381709cC) {
                C381709cC r5 = (C381709cC) obj;
                if (!(0qQ.A0K(this.A05, r5.A05) && this.A03 == r5.A03 && 0qQ.A0K(this.A04, r5.A04) && this.A02 == r5.A02 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        C361278fx r1 = this.A04;
        if (r1 instanceof AnonymousClass8Y4) {
            return ((File) r1.A00()).getPath();
        }
        return null;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A05))) + this.A02) * 31) + this.A01) * 31) + Float.floatToIntBits(this.A00);
    }
}
