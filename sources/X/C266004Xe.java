package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.4Xe  reason: invalid class name and case insensitive filesystem */
public final class C266004Xe {
    public long A00;
    public C266014Xf A01;
    public C266014Xf A02;
    public C266014Xf A03;
    public final AnonymousClass4QW A04;
    public final AnonymousClass4XV A05 = new AnonymousClass4XV(32);

    public static int A00(C266004Xe r6, int i) {
        AnonymousClass4QX r5;
        C266014Xf r4 = r6.A03;
        C266014Xf r3 = r4;
        if (r4.A03 == null) {
            AnonymousClass4QV r32 = (AnonymousClass4QV) r6.A04;
            synchronized (r32) {
                int i2 = r32.A00 + 1;
                r32.A00 = i2;
                int i3 = r32.A01;
                if (i3 > 0) {
                    AnonymousClass4QX[] r1 = r32.A02;
                    int i4 = i3 - 1;
                    r32.A01 = i4;
                    r5 = r1[i4];
                    r5.getClass();
                    r32.A02[r32.A01] = null;
                } else {
                    r5 = new AnonymousClass4QX(new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED]);
                    AnonymousClass4QX[] r12 = r32.A02;
                    int length = r12.length;
                    if (i2 > length) {
                        r32.A02 = (AnonymousClass4QX[]) Arrays.copyOf(r12, length * 2);
                    }
                }
            }
            r3 = r6.A03;
            C266014Xf r0 = new C266014Xf(r3.A00);
            r4.A03 = r5;
            r4.A02 = r0;
        }
        return Math.min(i, (int) (r3.A00 - r6.A00));
    }

    public static C266014Xf A01(AnonymousClass4PQ r12, C266014Xf r13, C266024Xg r14, AnonymousClass4XV r15) {
        long j;
        ByteBuffer byteBuffer;
        int i;
        if ((r12.A00 & SN3.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            long j2 = r14.A01;
            r15.A0E(1);
            C266014Xf A032 = A03(r13, r15.A02, 1, j2);
            long j3 = j2 + 1;
            byte b = r15.A02[0];
            boolean z = false;
            if ((b & 128) != 0) {
                z = true;
            }
            byte b2 = b & Byte.MAX_VALUE;
            AnonymousClass4PT r6 = r12.A06;
            byte[] bArr = r6.A00;
            if (bArr == null) {
                r6.A00 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            r13 = A03(A032, r6.A00, b2, j3);
            long j4 = j3 + ((long) b2);
            if (z) {
                r15.A0E(2);
                r13 = A03(r13, r15.A02, 2, j4);
                j4 += 2;
                i = r15.A05();
            } else {
                i = 1;
            }
            int[] iArr = r6.A02;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = r6.A03;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                r15.A0E(i2);
                r13 = A03(r13, r15.A02, i2, j4);
                j4 += (long) i2;
                r15.A0G(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = r15.A05();
                    iArr2[i3] = r15.A04();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = r14.A00 - ((int) (j4 - r14.A01));
            }
            C266034Xh r2 = r14.A02;
            byte[] bArr2 = r2.A03;
            byte[] bArr3 = r6.A00;
            int i4 = r2.A01;
            int i5 = r2.A02;
            int i6 = r2.A00;
            r6.A02 = iArr;
            r6.A03 = iArr2;
            r6.A01 = bArr2;
            r6.A00 = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = r6.A04;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            AnonymousClass4PV r22 = r6.A05;
            r22.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = r22.A00;
            pattern.set(i5, i6);
            r22.A01.setPattern(pattern);
            long j5 = r14.A01;
            int i7 = (int) (j4 - j5);
            r14.A01 = j5 + ((long) i7);
            r14.A00 -= i7;
        }
        if ((r12.A00 & 268435456) == 268435456) {
            r15.A0E(4);
            C266014Xf A033 = A03(r13, r15.A02, 4, r14.A01);
            int A042 = r15.A04();
            r14.A01 += 4;
            r14.A00 -= 4;
            r12.A01(A042);
            r13 = A02(A033, r12.A02, A042, r14.A01);
            r14.A01 += (long) A042;
            int i8 = r14.A00 - A042;
            r14.A00 = i8;
            ByteBuffer byteBuffer2 = r12.A03;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i8) {
                r12.A03 = ByteBuffer.allocate(i8);
            } else {
                r12.A03.clear();
            }
            j = r14.A01;
            byteBuffer = r12.A03;
        } else {
            r12.A01(r14.A00);
            j = r14.A01;
            byteBuffer = r12.A02;
        }
        return A02(r13, byteBuffer, r14.A00, j);
    }

    public static C266014Xf A02(C266014Xf r7, ByteBuffer byteBuffer, int i, long j) {
        while (j >= r7.A00) {
            r7 = r7.A02;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (r7.A00 - j));
            byteBuffer.put(r7.A03.A00, (int) (j - r7.A01), min);
            i -= min;
            j += (long) min;
            if (j == r7.A00) {
                r7 = r7.A02;
            }
        }
        return r7;
    }

    public static C266014Xf A03(C266014Xf r7, byte[] bArr, int i, long j) {
        while (j >= r7.A00) {
            r7 = r7.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (r7.A00 - j));
            System.arraycopy(r7.A03.A00, (int) (j - r7.A01), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == r7.A00) {
                r7 = r7.A02;
            }
        }
        return r7;
    }

    public static void A04(C266014Xf r5, C266004Xe r6) {
        if (r5.A03 != null) {
            C266014Xf r1 = r5;
            AnonymousClass4QV r4 = (AnonymousClass4QV) r6.A04;
            synchronized (r4) {
                do {
                    AnonymousClass4QX[] r3 = r4.A02;
                    int i = r4.A01;
                    r4.A01 = i + 1;
                    AnonymousClass4QX r0 = r1.A03;
                    r0.getClass();
                    r3[i] = r0;
                    r4.A00--;
                    r1 = r1.A02;
                    if (r1 == null || r1.A03 == null) {
                        r4.notifyAll();
                    }
                    AnonymousClass4QX[] r32 = r4.A02;
                    int i2 = r4.A01;
                    r4.A01 = i2 + 1;
                    AnonymousClass4QX r02 = r1.A03;
                    r02.getClass();
                    r32[i2] = r02;
                    r4.A00--;
                    r1 = r1.A02;
                    break;
                } while (r1.A03 == null);
                r4.notifyAll();
            }
            r5.A03 = null;
            r5.A02 = null;
        }
    }

    public final void A05(long j) {
        if (j != -1) {
            while (true) {
                C266014Xf r5 = this.A01;
                if (j >= r5.A00) {
                    AnonymousClass4QW r4 = this.A04;
                    AnonymousClass4QX r3 = r5.A03;
                    AnonymousClass4QV r42 = (AnonymousClass4QV) r4;
                    synchronized (r42) {
                        AnonymousClass4QX[] r2 = r42.A02;
                        int i = r42.A01;
                        r42.A01 = i + 1;
                        r2[i] = r3;
                        r42.A00--;
                        r42.notifyAll();
                    }
                    C266014Xf r22 = this.A01;
                    r22.A03 = null;
                    C266014Xf r0 = r22.A02;
                    r22.A02 = null;
                    this.A01 = r0;
                } else if (this.A02.A01 < r5.A01) {
                    this.A02 = r5;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public C266004Xe(AnonymousClass4QW r4) {
        this.A04 = r4;
        C266014Xf r0 = new C266014Xf(0);
        this.A01 = r0;
        this.A02 = r0;
        this.A03 = r0;
    }
}
