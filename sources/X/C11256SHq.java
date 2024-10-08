package X;

import java.util.Random;

/* renamed from: X.SHq  reason: case insensitive filesystem */
public final class C11256SHq {
    public boolean A00;
    public final Random A01;
    public final C13199TPf A02 = new C13199TPf(this);
    public final C13198TPe A03 = new Object();
    public final C13198TPe A04;
    public final YCS A05;
    public final boolean A06;
    public final C12824T8t A07;
    public final byte[] A08;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.TPe] */
    public C11256SHq(Random random, YCS ycs) {
        if (ycs == null) {
            throw AnonymousClass7TE.A11("sink == null");
        } else if (random != null) {
            this.A06 = true;
            this.A05 = ycs;
            this.A04 = ycs.AEA();
            this.A01 = random;
            this.A08 = new byte[4];
            this.A07 = new C12824T8t();
        } else {
            throw AnonymousClass7TE.A11("random == null");
        }
    }

    public static void A00(C11256SHq sHq, TAH tah, int i) {
        if (!sHq.A00) {
            int A052 = tah.A05();
            if (((long) A052) <= 125) {
                C13198TPe tPe = sHq.A04;
                tPe.A0B(i | 128);
                if (sHq.A06) {
                    tPe.A0B(A052 | 128);
                    Random random = sHq.A01;
                    byte[] bArr = sHq.A08;
                    random.nextBytes(bArr);
                    tPe.A0J(bArr);
                    if (A052 > 0) {
                        long j = tPe.A00;
                        tah.A0B(tPe);
                        C12824T8t t8t = sHq.A07;
                        tPe.A0H(t8t);
                        t8t.A00(j);
                        C9883Riw.A00(t8t, bArr);
                        t8t.close();
                    }
                } else {
                    tPe.A0B(A052);
                    tah.A0B(tPe);
                }
                sHq.A05.flush();
                return;
            }
            throw AnonymousClass7TE.A0w("Payload size must be less than or equal to 125");
        }
        throw JTO.A0u("closed");
    }

    public final void A01(long j, boolean z) {
        if (!this.A00) {
            int i = 0;
            int i2 = 0;
            if (z) {
                i2 = 128;
            }
            C13198TPe tPe = this.A04;
            tPe.A0B(i2);
            boolean z2 = this.A06;
            if (z2) {
                i = 128;
            }
            if (j <= 125) {
                tPe.A0B(((int) j) | i);
            } else if (j <= 65535) {
                tPe.A0B(i | 126);
                tPe.A0D((int) j);
            } else {
                tPe.A0B(i | 127);
                SRX A09 = tPe.A09(8);
                byte[] bArr = A09.A06;
                int i3 = A09.A00;
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((int) ((j >>> 56) & 255));
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((int) ((j >>> 48) & 255));
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((int) ((j >>> 40) & 255));
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((int) ((j >>> 32) & 255));
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((int) ((j >>> 24) & 255));
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((int) ((j >>> 16) & 255));
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((int) ((j >>> 8) & 255));
                bArr[i10] = (byte) ((int) (j & 255));
                A09.A00 = i10 + 1;
                tPe.A00 += 8;
            }
            if (z2) {
                Random random = this.A01;
                byte[] bArr2 = this.A08;
                random.nextBytes(bArr2);
                tPe.A0J(bArr2);
                if (j > 0) {
                    long j2 = tPe.A00;
                    tPe.FNi(this.A03, j);
                    C12824T8t t8t = this.A07;
                    tPe.A0H(t8t);
                    t8t.A00(j2);
                    C9883Riw.A00(t8t, bArr2);
                    t8t.close();
                }
            } else {
                tPe.FNi(this.A03, j);
            }
            this.A05.ARF();
            return;
        }
        throw JTO.A0u("closed");
    }
}
