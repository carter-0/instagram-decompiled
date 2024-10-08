package X;

import android.os.Debug;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/* renamed from: X.Sko  reason: case insensitive filesystem */
public final class C12027Sko implements C275064pX, C275104pb, C58880Au {
    public byte A00;
    public long A01;
    public long A02;
    public C274844pB A03;
    public boolean A04 = false;
    public final byte A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final 0Mq A0B;
    public final Random A0C = new Random();
    public final C275094pa A0D;
    public final C11383SQw A0E;
    public final 00w A0F;
    public final AnonymousClass0Mm A0G;
    public final 0N1 A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final byte[] A0L;
    public final Class[] A0M;
    public final Class[] A0N;

    public final synchronized C274844pB AuB() {
        return this.A03;
    }

    public final void CoE(C274844pB r11) {
        Integer num;
        byte[] bArr;
        int i;
        C274844pB r5 = r11;
        synchronized (r5) {
            this.A03 = null;
            0Mq r2 = this.A0B;
            if (r2 != null) {
                Integer num2 = r11.A08;
                synchronized (r2) {
                    if (!A01(r11)) {
                        if (num2 == AnonymousClass05K.A0C) {
                            r2.A0C();
                        }
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A01;
                        if (num2 != num) {
                            if (num2 == AnonymousClass05K.A00 || num2 == AnonymousClass05K.A0Y) {
                                C11383SQw sQw = this.A0E;
                                bArr = this.A0L;
                                i = sQw.A03(r5, this.A0H, bArr, this.A01).intValue();
                            } else {
                                if (num2 == AnonymousClass05K.A0N) {
                                    r2.A0C();
                                }
                                0N1 r1 = this.A0H;
                                bArr = this.A0L;
                                boolean A022 = C11383SQw.A02(r11, r1, bArr, 0);
                                i = 3;
                                if (A022) {
                                    i = 4;
                                }
                            }
                            A00(i, bArr);
                        }
                    }
                    r11.A09(num);
                }
            }
        }
    }

    public final void CoJ(C274844pB r11) {
        Integer num;
        byte b;
        Integer num2;
        synchronized (r11) {
            0Mq r1 = this.A0B;
            if (r1 != null && this.A0J && r11.A08 != (num = AnonymousClass05K.A01) && r11.A05 == -1) {
                synchronized (r1) {
                    C274844pB r5 = this.A03;
                    if (r5 != null && r5 == r11) {
                        Integer num3 = r5.A08;
                        Integer num4 = AnonymousClass05K.A0N;
                        if (num3 == num4) {
                            r1.A0C();
                        } else if (num3 == AnonymousClass05K.A00 || num3 == AnonymousClass05K.A0Y) {
                            C11383SQw sQw = this.A0E;
                            byte[] bArr = this.A0L;
                            sQw.A03(r5, this.A0H, bArr, this.A01);
                            Integer num5 = AnonymousClass05K.A0C;
                            A00(2, bArr);
                            this.A03.A09(num5);
                        }
                        C274844pB r7 = this.A03;
                        0N1 r6 = this.A0H;
                        byte[] bArr2 = this.A0L;
                        C11383SQw.A01(bArr2, 0, r7.A01());
                        C11383SQw.A01(bArr2, 4, r7.A00());
                        if (C274794p6.A02.A01.get()) {
                            num = AnonymousClass05K.A0C;
                        }
                        if (1 - num.intValue() != 0) {
                            b = 1;
                        } else {
                            b = 2;
                        }
                        bArr2[8] = b;
                        List list = r7.A0A;
                        if (list == null || list.isEmpty()) {
                            num2 = AnonymousClass05K.A15;
                        } else {
                            C11383SQw.A00(r7, r6, bArr2, 9);
                            num2 = AnonymousClass05K.A0u;
                        }
                        A00(num2.intValue(), bArr2);
                        this.A03.A09(num4);
                    }
                }
            }
        }
    }

    public final void CoK(C274844pB r12) {
        C274844pB r6 = r12;
        synchronized (r6) {
            this.A03 = r12;
            0Mq r3 = this.A0B;
            if (r3 != null) {
                r12.A09(AnonymousClass05K.A00);
                if (!A01(r12)) {
                    if (r12.A05 == -1) {
                        if (this.A0K) {
                            r12.A09(AnonymousClass05K.A0Y);
                        }
                    }
                }
                synchronized (r3) {
                    C11383SQw sQw = this.A0E;
                    byte[] bArr = this.A0L;
                    Integer A032 = sQw.A03(r6, this.A0H, bArr, this.A01);
                    A00(A032.intValue(), bArr);
                    Integer num = AnonymousClass05K.A01;
                    if (!(A032 == num || A032 == AnonymousClass05K.A0j)) {
                        num = AnonymousClass05K.A0C;
                    }
                    r12.A09(num);
                }
            }
        }
    }

    private void A00(int i, byte[] bArr) {
        0Mq r3 = this.A0B;
        if (r3 != null) {
            try {
                r3.A0G(i, bArr);
            } catch (IllegalStateException e) {
                int length = bArr.length;
                int i2 = this.A08;
                if (i2 > 0 && this.A0C.nextInt(i2) < 1) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    r3.A0H(A1A);
                    A1A.append(" record type: ");
                    A1A.append(i);
                    A1A.append(AnonymousClass000.A00(1989));
                    A1A.append(length);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("lifecycle_raw_buffer", r3.A0B());
                    new StringBuilder();
                    synchronized (r3) {
                        0MS.A01((String) null, (String) null, (String) null, (String) null, "Exception writing record", A1A.toString(), e, A1E);
                    }
                }
                try {
                    r3.A0D();
                } catch (Exception unused) {
                }
            }
        }
    }

    private boolean A01(C274844pB r6) {
        if (!r6.A06((long) this.A09)) {
            Class[] clsArr = this.A0N;
            int length = clsArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Class cls = clsArr[i];
                    if (cls != null && r6.A09 == cls && r6.A07 == null) {
                        break;
                    }
                    i++;
                } else {
                    Class[] clsArr2 = this.A0M;
                    int length2 = clsArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            Class cls2 = clsArr2[i2];
                            if (cls2 != null && r6.A07 == cls2) {
                                break;
                            }
                            i2++;
                        } else {
                            Integer num = r6.A08;
                            if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0N) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void CwF(String str) {
        if (!this.A04 && this.A0B != null) {
            this.A04 = true;
            0N1 r2 = this.A0H;
            String[] strArr = {"nativePollOnce:bg", "nativePollOnce", "android.view.Choreographer$FrameHandler", "android.view.Choreographer$FrameDisplayEventReceiver", "android.os.Handler", "android.app.ActivityThread$H", "android.os.Handler", "android.os.BinderProxy", "android.view.ViewRootImpl$ViewRootHandler", "android.app.ActivityThread$ContextCleanupInfo", "android.app.ActivityThread$CreateServiceData", "android.app.ActivityThread$BindServiceData"};
            synchronized (r2) {
                int i = 0;
                do {
                    String str2 = strArr[i];
                    Properties properties = r2.A04;
                    if (properties.getProperty(str2) == null) {
                        short s = (short) (r2.A00 + 1);
                        r2.A00 = s;
                        properties.setProperty(str2, Short.toString(s));
                    }
                    i++;
                } while (i < 12);
                0N1.A00(r2);
            }
            C275094pa r22 = this.A0D;
            if (r22 != null && !Debug.isDebuggerConnected()) {
                r22.A00(0, false);
            }
        }
    }

    public final String getName() {
        return this.A0I;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.SQw] */
    public C12027Sko(C274884pF r10, C275044pV r11, 0Mk r12, File file, List list, int i) {
        int i2;
        C275094pa r0;
        Class<?> cls;
        int i3 = 0;
        for (Integer num : AnonymousClass05K.A00(8)) {
            if (i3 < 0At.A00(num)) {
                i3 = 0At.A00(num);
            }
        }
        this.A0L = new byte[(i3 - 1)];
        this.A0G = new C12070SmP(this);
        this.A0I = "ufad_looper_history";
        this.A08 = i;
        if (r10.A0A()) {
            File A0s = JTO.A0s(file, "looper.bin");
            if (!A0s.exists()) {
                this.A0F = r12.AL0(A0s, (int) r10.A01());
            } else {
                throw DbW.A0c("File exists: ", A0s.getName());
            }
        } else {
            this.A0F = null;
        }
        this.A06 = (int) r10.A01();
        this.A09 = (int) r10.A02();
        if (r10.A06()) {
            i2 = (int) r10.A00();
        } else {
            i2 = 0;
        }
        this.A07 = i2;
        this.A0K = r10.A0C();
        this.A0J = r10.A0B();
        if (r10.A06()) {
            r0 = new C275094pa(this, r10, r11, list);
        } else {
            r0 = null;
        }
        this.A0D = r0;
        long currentTimeMillis = System.currentTimeMillis();
        this.A0A = currentTimeMillis;
        byte b = C274794p6.A02.A01.get() ? (byte) 1 : 2;
        this.A05 = b;
        this.A00 = b;
        this.A02 = currentTimeMillis;
        this.A0H = new 0N1(file, false);
        this.A0E = new Object();
        C275084pZ r4 = C275084pZ.A03;
        Class<?> cls2 = r4.A00;
        if (cls2 == null) {
            try {
                cls = Class.forName("android.app.ActivityThread$H");
                cls2 = cls;
            } catch (Throwable unused) {
                cls = null;
                cls2 = null;
            }
            r4.A00 = cls;
        }
        this.A0N = new Class[]{cls2};
        this.A0M = r4.A00();
        if (this.A0F != null) {
            Integer[] A002 = AnonymousClass05K.A00(8);
            int length = A002.length;
            int[] iArr = new int[(length - 1)];
            for (int i4 = 1; i4 < length; i4++) {
                iArr[i4 - 1] = 0At.A00(A002[i4]);
            }
            0Mq r2 = new 0Mq(this.A0G, this.A0F.A00, iArr, (byte) 11, (int) r10.A01(), r10.A05());
            this.A0B = r2;
            this.A01 = r2.A0A();
            C274794p6.A02.A00(this);
            return;
        }
        this.A0B = null;
    }

    public final void ASk(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        0Mq r6 = this.A0B;
        if (r6 != null) {
            byte b = 2;
            if (z) {
                b = 1;
            }
            synchronized (r6) {
                r6.A0E(4, b);
                r6.A0F(3, currentTimeMillis);
                r6.A0E(6, this.A00);
                r6.A0F(5, this.A02);
            }
            this.A00 = b;
            this.A02 = currentTimeMillis;
        }
    }

    public final String Bz8(long j) {
        throw C66580MXl.A11();
    }
}
