package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4R6  reason: invalid class name */
public final class AnonymousClass4R6 implements C250823m7, AnonymousClass28n {
    public static AnonymousClass4R6 A0E;
    public static final List A0F = AnonymousClass4R7.A00(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final List A0G = AnonymousClass4R7.A00(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final List A0H = AnonymousClass4R7.A00(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final List A0I = AnonymousClass4R7.A00(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final List A0J = AnonymousClass4R7.A00(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static final List A0K = AnonymousClass4R7.A00(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public int A07;
    public long A08;
    public final AnonymousClass281 A09;
    public final boolean A0A;
    public final AnonymousClass4R8 A0B;
    public final C697227w A0C;
    public final Map A0D;

    public final synchronized long Ag0() {
        return this.A02;
    }

    public final C250823m7 C9P() {
        return this;
    }

    public final synchronized void Czk(C257113ws r5, C257263x7 r6, int i, boolean z) {
        if (z) {
            if ((r6.A00 & 8) != 8) {
                this.A03 += (long) i;
            }
        }
    }

    public final synchronized void Dtf(C257113ws r4, C257263x7 r5, boolean z, boolean z2) {
        if (z) {
            if ((r5.A00 & 8) != 8) {
                int i = this.A01;
                if (i == 0) {
                    this.A04 = SystemClock.elapsedRealtime();
                }
                this.A01 = i + 1;
            }
        }
    }

    public static long A00(AnonymousClass4R6 r1, int i) {
        Map map = r1.A0D;
        Number number = (Number) map.get(Integer.valueOf(i));
        if (number == null && (number = (Number) map.get(0)) == null) {
            number = 1000000L;
        }
        return number.longValue();
    }

    public static void A01(AnonymousClass4R6 r3, int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != r3.A08) {
            r3.A08 = j2;
            Iterator it = r3.A0B.A00.iterator();
            while (it.hasNext()) {
                C45329CuX cuX = (C45329CuX) it.next();
                if (!cuX.A00) {
                    cuX.A01.post(new C45977DHg(cuX));
                }
            }
        }
    }

    public final synchronized void DtX(C257113ws r17, C257263x7 r18, boolean z) {
        synchronized (this) {
            if (z) {
                if ((r18.A00 & 8) != 8) {
                    boolean z2 = false;
                    if (this.A01 > 0) {
                        z2 = true;
                    }
                    C256703wD.A04(z2);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i = (int) (elapsedRealtime - this.A04);
                    this.A06 += (long) i;
                    long j = this.A05;
                    long j2 = this.A03;
                    this.A05 = j + j2;
                    if (i > 0) {
                        AnonymousClass281 r7 = this.A09;
                        r7.A01((int) Math.sqrt((double) j2), (((float) j2) * 8000.0f) / ((float) i));
                        if (this.A06 >= 2000 || this.A05 >= 524288) {
                            this.A02 = (long) r7.A00();
                        }
                        this.A07++;
                        A01(this, i, this.A03, this.A02);
                        this.A04 = elapsedRealtime;
                        this.A03 = 0;
                    }
                    this.A01--;
                }
            }
        }
    }

    public final void EDe(AnonymousClass4RU r2) {
        this.A0B.A00(r2);
    }

    public AnonymousClass4R6(Context context, C697227w r8, Map map, boolean z) {
        AnonymousClass4R9 r5;
        int i;
        this.A0D = new HashMap(map);
        this.A0B = new AnonymousClass4R8();
        this.A09 = new AnonymousClass281();
        this.A0C = r8;
        this.A0A = z;
        if (context != null) {
            synchronized (AnonymousClass4R9.class) {
                r5 = AnonymousClass4R9.A04;
                if (r5 == null) {
                    r5 = new AnonymousClass4R9(context);
                    AnonymousClass4R9.A04 = r5;
                }
            }
            synchronized (r5.A02) {
                i = r5.A00;
            }
            this.A00 = i;
            this.A02 = A00(this, i);
            AnonymousClass4RB r4 = new AnonymousClass4RB(this);
            CopyOnWriteArrayList copyOnWriteArrayList = r5.A03;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference.get() == null) {
                    copyOnWriteArrayList.remove(reference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(r4));
            r5.A01.post(new AnonymousClass4RD(r4, r5));
            return;
        }
        this.A00 = 0;
        this.A02 = A00(this, 0);
    }

    public final void A8Q(Handler handler, AnonymousClass4RU r4) {
        r4.getClass();
        AnonymousClass4R8 r0 = this.A0B;
        r0.A00(r4);
        r0.A00.add(new C45329CuX(handler, r4));
    }

    @Deprecated
    public AnonymousClass4R6() {
        this((Context) null, C697227w.A00, Collections.emptyMap(), false);
    }
}
