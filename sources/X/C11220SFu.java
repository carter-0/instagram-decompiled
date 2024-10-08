package X;

import android.util.SparseArray;

/* renamed from: X.SFu  reason: case insensitive filesystem */
public final class C11220SFu {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public byte[] A08;
    public final SparseArray A09 = Pxe.A0L();
    public final SparseArray A0A = Pxe.A0L();
    public final SRU A0B;
    public final C13900TjN A0C;

    public static void A00(C11220SFu sFu, int i) {
        long j = sFu.A04;
        if (j != -9223372036854775807L) {
            boolean z = sFu.A07;
            int i2 = (int) (sFu.A01 - sFu.A03);
            sFu.A0C.EJm((S4h) null, z ? 1 : 0, i2, i, j);
        }
    }

    public C11220SFu(C13900TjN tjN) {
        this.A0C = tjN;
        byte[] bArr = new byte[128];
        this.A08 = bArr;
        this.A0B = new SRU(bArr, 0, 0);
        this.A06 = false;
    }
}
