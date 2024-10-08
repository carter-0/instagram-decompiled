package X;

import java.util.Arrays;

/* renamed from: X.5xR  reason: invalid class name and case insensitive filesystem */
public final class C300575xR extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;

    public C300575xR(String str, String str2, byte[] bArr, float f, long j) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(bArr, 3);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = bArr;
        this.A01 = j;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C300575xR) {
                C300575xR r8 = (C300575xR) obj;
                if (!0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04) || this.A01 != r8.A01 || Float.compare(this.A00, r8.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return (((((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + Arrays.hashCode(this.A04)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00);
    }
}
