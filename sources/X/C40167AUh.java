package X;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.AUh  reason: case insensitive filesystem */
public final class C40167AUh implements B17 {
    public final int A00;
    public final Object A01;

    public C40167AUh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DZ8(C363848kR r19) {
        Slq slq;
        ByteBuffer byteBuffer;
        C363848kR r2 = r19;
        switch (this.A00) {
            case 0:
                C345707tx r4 = (C345707tx) this.A01;
                C13554TcQ tcQ = r4.A07;
                C340607lX r3 = r4.A0e;
                if (r3 != null && r3.isConnected() && tcQ != null) {
                    try {
                        int BsR = r3.BsR();
                        int i = r4.A02;
                        if (i != -1) {
                            int i2 = -90;
                            if (r4.A00 == 1) {
                                i2 = 90;
                            }
                            BsR = ((BsR + 360) + (i2 * i)) % 360;
                        }
                        C13417TZx[] tZxArr = null;
                        if (r19 != null) {
                            C39708A5z[] a5zArr = r2.A0B;
                            if (a5zArr != null) {
                                int length = a5zArr.length;
                                Slq[] slqArr = new Slq[length];
                                for (int i3 = 0; i3 < length; i3++) {
                                    C39708A5z a5z = a5zArr[i3];
                                    if (a5z == null || (byteBuffer = a5z.A02) == null) {
                                        slq = null;
                                    } else {
                                        slq = new Slq(byteBuffer, a5z.A00, a5z.A01);
                                    }
                                    slqArr[i3] = slq;
                                }
                                tZxArr = slqArr;
                            }
                            byte[] bArr = r2.A09;
                            float[] fArr = r2.A0A;
                            tcQ.onPreviewFrame(new C10843Rz3(r2.A04, r2.A05, r2.A07, r2.A06, bArr, fArr, tZxArr, r2.A01, r2.A02, r2.A00, BsR, r2.A03, r2.A08));
                            return;
                        }
                        return;
                    } catch (C352928Fp unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                AnonymousClass9RJ r22 = (AnonymousClass9RJ) this.A01;
                B17 b17 = r22.A04;
                if (b17 == null) {
                    b17 = new C40167AUh(r22, 1);
                    r22.A04 = b17;
                }
                r22.EEJ(b17);
                C378949Rv r32 = r22.A0J;
                C378959Rw r42 = r32.A00;
                ReentrantLock reentrantLock = r42.A01;
                reentrantLock.lock();
                try {
                    boolean A002 = r42.A00();
                    reentrantLock.lock();
                    if (!r42.A01()) {
                        r42.A00 = (r42.A00 | 2) & -2;
                    }
                    if (A002) {
                        C340577lU.A00(18, 0, (Object) null);
                        C341877nf r0 = r32.A03;
                        if (r0 != null) {
                            r0.A00();
                        }
                        C3496981j r1 = r32.A01;
                        if (!r1.A00.isEmpty()) {
                            C342057ny.A00(new C379269Te(r32, r1.A00));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                LP6 lp6 = ((KB1) this.A01).A02;
                if (lp6 != null) {
                    byte[] bArr2 = r2.A09;
                    if (bArr2 == null) {
                        lp6.A03(r2);
                        return;
                    } else {
                        lp6.A04(bArr2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
