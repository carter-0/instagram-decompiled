package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class SSD {
    public long A00;
    public C9133RQh A01;
    public C9133RQh A02;
    public C9133RQh A03;
    public final C11389SRd A04 = Pxe.A0P(32);
    public final C13509Tba A05;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.RQh] */
    public static int A00(SSD ssd, int i) {
        C10149RnQ rnQ;
        C9133RQh rQh = ssd.A03;
        C9133RQh rQh2 = rQh;
        if (rQh.A03 == null) {
            C11677Sea sea = (C11677Sea) ssd.A05;
            synchronized (sea) {
                int i2 = sea.A00 + 1;
                sea.A00 = i2;
                int i3 = sea.A01;
                if (i3 > 0) {
                    C10149RnQ[] rnQArr = sea.A02;
                    int i4 = i3 - 1;
                    sea.A01 = i4;
                    rnQ = rnQArr[i4];
                    rnQ.getClass();
                    sea.A02[sea.A01] = null;
                } else {
                    rnQ = new C10149RnQ(new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED]);
                    C10149RnQ[] rnQArr2 = sea.A02;
                    int length = rnQArr2.length;
                    if (i2 > length) {
                        sea.A02 = (C10149RnQ[]) Arrays.copyOf(rnQArr2, length * 2);
                    }
                }
            }
            rQh2 = ssd.A03;
            long j = rQh2.A00;
            ? obj = new Object();
            C11366SPh.A02(DbW.A1a(obj.A03));
            obj.A01 = j;
            obj.A00 = j + 65536;
            rQh.A03 = rnQ;
            rQh.A02 = obj;
        }
        return Math.min(i, (int) (rQh2.A00 - ssd.A00));
    }

    public static C9133RQh A01(C11389SRd sRd, C7455QDu qDu, C9133RQh rQh, C10508RtN rtN) {
        long j;
        ByteBuffer byteBuffer;
        int i;
        if ((qDu.A00 & SN3.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            long j2 = rtN.A01;
            sRd.A0M(1);
            C9133RQh A032 = A03(rQh, sRd.A02, 1, j2);
            long j3 = j2 + 1;
            byte b = sRd.A02[0];
            boolean A1P = AnonymousClass7TF.A1P(b & 128);
            byte b2 = b & Byte.MAX_VALUE;
            C10764Rxi rxi = qDu.A04;
            byte[] bArr = rxi.A00;
            if (bArr == null) {
                rxi.A00 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            rQh = A03(A032, rxi.A00, b2, j3);
            long j4 = j3 + ((long) b2);
            if (A1P) {
                sRd.A0M(2);
                rQh = A03(rQh, sRd.A02, 2, j4);
                j4 += 2;
                i = sRd.A08();
            } else {
                i = 1;
            }
            int[] iArr = rxi.A02;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = rxi.A03;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (A1P) {
                int i2 = i * 6;
                sRd.A0M(i2);
                rQh = A03(rQh, sRd.A02, i2, j4);
                j4 += (long) i2;
                sRd.A0O(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = sRd.A08();
                    iArr2[i3] = sRd.A07();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = rtN.A00 - ((int) (j4 - rtN.A01));
            }
            S4h s4h = rtN.A02;
            byte[] bArr2 = s4h.A03;
            byte[] bArr3 = rxi.A00;
            int i4 = s4h.A01;
            int i5 = s4h.A02;
            int i6 = s4h.A00;
            rxi.A02 = iArr;
            rxi.A03 = iArr2;
            rxi.A01 = bArr2;
            rxi.A00 = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = rxi.A04;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            C10342Rqf rqf = rxi.A05;
            rqf.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = rqf.A00;
            pattern.set(i5, i6);
            rqf.A01.setPattern(pattern);
            long j5 = rtN.A01;
            int i7 = (int) (j4 - j5);
            rtN.A01 = j5 + ((long) i7);
            rtN.A00 -= i7;
        }
        if ((qDu.A00 & 268435456) == 268435456) {
            sRd.A0M(4);
            C9133RQh A033 = A03(rQh, sRd.A02, 4, rtN.A01);
            int A07 = sRd.A07();
            rtN.A01 += 4;
            rtN.A00 -= 4;
            qDu.A01(A07);
            rQh = A02(A033, qDu.A01, A07, rtN.A01);
            rtN.A01 += (long) A07;
            int i8 = rtN.A00 - A07;
            rtN.A00 = i8;
            ByteBuffer byteBuffer2 = qDu.A02;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i8) {
                qDu.A02 = ByteBuffer.allocate(i8);
            } else {
                qDu.A02.clear();
            }
            j = rtN.A01;
            byteBuffer = qDu.A02;
        } else {
            qDu.A01(rtN.A00);
            j = rtN.A01;
            byteBuffer = qDu.A01;
        }
        return A02(rQh, byteBuffer, rtN.A00, j);
    }

    public static C9133RQh A02(C9133RQh rQh, ByteBuffer byteBuffer, int i, long j) {
        while (j >= rQh.A00) {
            rQh = rQh.A02;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (rQh.A00 - j));
            byteBuffer.put(rQh.A03.A00, (int) (j - rQh.A01), min);
            i -= min;
            j += (long) min;
            if (j == rQh.A00) {
                rQh = rQh.A02;
            }
        }
        return rQh;
    }

    public static C9133RQh A03(C9133RQh rQh, byte[] bArr, int i, long j) {
        while (j >= rQh.A00) {
            rQh = rQh.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (rQh.A00 - j));
            System.arraycopy(rQh.A03.A00, (int) (j - rQh.A01), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == rQh.A00) {
                rQh = rQh.A02;
            }
        }
        return rQh;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.RQh] */
    public SSD(C13509Tba tba) {
        this.A05 = tba;
        ? obj = new Object();
        C11366SPh.A02(DbW.A1a(obj.A03));
        obj.A01 = 0;
        obj.A00 = 65536;
        this.A01 = obj;
        this.A02 = obj;
        this.A03 = obj;
    }
}
