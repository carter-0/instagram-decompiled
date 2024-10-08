package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: X.To3  reason: case insensitive filesystem */
public abstract class C14001To3 implements X00 {
    public static final C14754U7l A0C = new C14009ToB(1);
    public static final C14754U7l A0D = new C14009ToB(5);
    public static final C14754U7l A0E = new C14009ToB(6);
    public static final C14754U7l A0F = new C14009ToB(7);
    public static final C14754U7l A0G = new C14009ToB(3);
    public static final C14754U7l A0H = new C14009ToB(4);
    public static final C14754U7l A0I = new C14009ToB(2);
    public static final C14754U7l A0J = new C14009ToB(8);
    public static final C14754U7l A0K = new C14009ToB(0);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public final V4M A08;
    public final Object A09;
    public final ArrayList A0A;
    public final ArrayList A0B;

    public static void A00(C14001To3 to3, boolean z) {
        ArrayList arrayList;
        int i = 0;
        to3.A06 = false;
        ThreadLocal threadLocal = AnonymousClass6WD.A05;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnonymousClass6WD());
        }
        AnonymousClass6WD r4 = (AnonymousClass6WD) threadLocal.get();
        r4.A02.remove(to3);
        ArrayList arrayList2 = r4.A04;
        int indexOf = arrayList2.indexOf(to3);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, (Object) null);
            r4.A01 = true;
        }
        to3.A05 = 0;
        to3.A07 = false;
        while (true) {
            arrayList = to3.A0A;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((AnonymousClass3K4) arrayList.get(i)).CvG(to3, to3.A03, to3.A04, z);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void A03(float f) {
    }

    public final void A04(float f) {
        ArrayList arrayList;
        this.A08.A01(this.A09, f);
        int i = 0;
        while (true) {
            arrayList = this.A0B;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((AnonymousClass3K5) arrayList.get(i)).CvP(this, this.A03, this.A04);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void A05(AnonymousClass3K4 r2) {
        JTR.A1S(r2, this.A0A);
    }

    public final void A06(AnonymousClass3K5 r3) {
        if (!this.A06) {
            JTR.A1S(r3, this.A0B);
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public boolean A07(long j) {
        double d;
        float f;
        long j2 = j;
        C14090Tph tph = (C14090Tph) this;
        boolean z = tph.A02;
        float f2 = tph.A00;
        int i = (f2 > Float.MAX_VALUE ? 1 : (f2 == Float.MAX_VALUE ? 0 : -1));
        if (z) {
            if (i != 0) {
                tph.A01.A02 = (double) f2;
                tph.A00 = Float.MAX_VALUE;
            }
            tph.A03 = (float) tph.A01.A02;
            tph.A04 = 0.0f;
            tph.A02 = false;
            return true;
        }
        C14002To4 to4 = tph.A01;
        if (i != 0) {
            j2 = j / 2;
            VQR A002 = to4.A00((double) tph.A03, (double) tph.A04, j2);
            to4.A02 = (double) f2;
            tph.A00 = Float.MAX_VALUE;
            d = (double) A002.A00;
            f = A002.A01;
        } else {
            d = (double) tph.A03;
            f = tph.A04;
        }
        VQR A003 = to4.A00(d, (double) f, j2);
        float f3 = A003.A00;
        tph.A03 = f3;
        float f4 = A003.A01;
        tph.A04 = f4;
        float max = Math.max(f3, tph.A01);
        tph.A03 = max;
        float min = Math.min(max, tph.A00);
        tph.A03 = min;
        if (((double) Math.abs(f4)) >= to4.A07) {
            return false;
        }
        float f5 = (float) to4.A02;
        if (((double) AnonymousClass7TE.A00(min, f5)) >= to4.A06) {
            return false;
        }
        tph.A03 = f5;
        tph.A04 = 0.0f;
        return true;
    }

    public C14001To3(AnonymousClass3K3 r3) {
        this.A04 = 0.0f;
        this.A03 = Float.MAX_VALUE;
        this.A07 = false;
        this.A06 = false;
        this.A00 = Float.MAX_VALUE;
        this.A01 = -3.4028235E38f;
        this.A05 = 0;
        this.A0A = new ArrayList();
        this.A0B = new ArrayList();
        this.A09 = null;
        this.A08 = new C14003To5(this, r3);
        this.A02 = 1.0f;
    }

    public void A01() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.A06) {
            A00(this, true);
        }
    }

    public void A02() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.A06) {
            this.A06 = true;
            if (!this.A07) {
                this.A03 = this.A08.A00(this.A09);
            }
            float f = this.A03;
            if (f > this.A00 || f < this.A01) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ThreadLocal threadLocal = AnonymousClass6WD.A05;
            if (threadLocal.get() == null) {
                threadLocal.set(new AnonymousClass6WD());
            }
            AnonymousClass6WD r1 = (AnonymousClass6WD) threadLocal.get();
            ArrayList arrayList = r1.A04;
            if (arrayList.size() == 0) {
                AnonymousClass6WF r2 = r1.A00;
                if (r2 == null) {
                    r2 = new AnonymousClass6WF(r1.A03);
                    r1.A00 = r2;
                }
                r2.A01.postFrameCallback(r2.A00);
            }
            JTR.A1S(this, arrayList);
        }
    }

    public C14001To3(V4M v4m, Object obj) {
        float f;
        this.A04 = 0.0f;
        this.A03 = Float.MAX_VALUE;
        this.A07 = false;
        this.A06 = false;
        this.A00 = Float.MAX_VALUE;
        this.A01 = -3.4028235E38f;
        this.A05 = 0;
        this.A0A = new ArrayList();
        this.A0B = new ArrayList();
        this.A09 = obj;
        this.A08 = v4m;
        if (v4m == A0D || v4m == A0E || v4m == A0F) {
            f = 0.1f;
        } else if (v4m == A0C || v4m == A0G || v4m == A0H) {
            this.A02 = 0.00390625f;
            return;
        } else {
            f = 1.0f;
        }
        this.A02 = f;
    }
}
