package X;

import java.util.Arrays;

/* renamed from: X.46V  reason: invalid class name */
public final class AnonymousClass46V extends AnonymousClass0T0 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public AnonymousClass46V(String str, String str2, byte[] bArr, long j) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(bArr, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = bArr;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass46V) {
                AnonymousClass46V r8 = (AnonymousClass46V) obj;
                if (!0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + Arrays.hashCode(this.A03)) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
