package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.TsW  reason: case insensitive filesystem */
public final class C14249TsW {
    public static final long[] A04 = new long[0];
    public long A00;
    public final 0sL A01;
    public final SerialDescriptor A02;
    public final long[] A03;

    public C14249TsW(0sL r6, SerialDescriptor serialDescriptor) {
        long[] jArr;
        this.A02 = serialDescriptor;
        this.A01 = r6;
        int B0a = serialDescriptor.B0a();
        long j = 0;
        if (B0a <= 64) {
            this.A00 = B0a != 64 ? -1 << B0a : j;
            jArr = A04;
        } else {
            this.A00 = 0;
            int i = (B0a - 1) >>> 6;
            jArr = new long[i];
            if ((B0a & 63) != 0) {
                jArr[i - 1] = -1 << B0a;
            }
        }
        this.A03 = jArr;
    }
}
