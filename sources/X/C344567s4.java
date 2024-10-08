package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7s4  reason: invalid class name and case insensitive filesystem */
public final class C344567s4 {
    public static final Map A0H = Collections.synchronizedMap(new HashMap());
    public Handler A00;
    public final int A01;
    public final Context A02;
    public final C344557s3 A03;
    public final C344557s3 A04;
    public final C344507ry A05;
    public final C344607s8 A06;
    public final C3496981j A07 = new C3496981j();
    public final Object A08 = new Object();
    public final boolean A09;
    public final boolean A0A;
    public final C344547s2 A0B;
    public final C344537s1 A0C;
    public volatile Looper A0D;
    public volatile C345897uG A0E;
    public volatile boolean A0F;
    public volatile boolean A0G;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Av8, java.lang.RuntimeException] */
    public static void A00(C344567s4 r7) {
        C345897uG r6 = r7.A0E;
        if (r6 != null) {
            try {
                List list = r7.A07.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C344747sM) list.get(i)).detach();
                }
                r6.release();
            } catch (Throwable th) {
                r7.A0E = null;
                r7.A0G = false;
                r7.A0F = false;
                A0H.remove(r7.A00.getLooper());
                throw th;
            }
            r7.A0E = null;
            r7.A0G = false;
            r7.A0F = false;
            A0H.remove(r7.A00.getLooper());
        }
    }

    public final C345897uG A01() {
        C345897uG r2;
        synchronized (this.A08) {
            r2 = null;
            C344567s4 r0 = (C344567s4) A0H.get(Looper.myLooper());
            if (r0 != null) {
                r2 = r0.A0E;
            }
            r2.getClass();
        }
        return r2;
    }

    public final void A02() {
        if (this.A0A && !this.A0G) {
            synchronized (this.A08) {
                this.A0G = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Av8, java.lang.RuntimeException] */
    public final void A03(C344747sM r5) {
        Object obj = this.A08;
        C3496981j r2 = this.A07;
        if (r5 != null) {
            synchronized (obj) {
                try {
                    if (!r2.A00.contains(r5)) {
                        r5.CMa(this);
                        C345897uG r1 = this.A0E;
                        if (r1 != null && A06()) {
                            r5.ACn(r1);
                        }
                        r2.A01(r5);
                    }
                } catch (Throwable th) {
                    A05(new RuntimeException("GlHostImpl.attach() failed.", th));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Av8, java.lang.RuntimeException] */
    public final void A04(C344747sM r5) {
        Object obj = this.A08;
        C3496981j r0 = this.A07;
        if (r5 != null) {
            synchronized (obj) {
                try {
                    if (r0.A02(r5) && this.A0E != null) {
                        r5.detach();
                    }
                } catch (Throwable th) {
                    A05(new RuntimeException("GlHostImpl.detach() failed.", th));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9tX, X.9dQ] */
    public final void A05(C41505Av8 av8) {
        C344547s2 r1 = this.A0B;
        ? r2 = new C391719tX(31000, (Throwable) av8);
        C344457rt r12 = r1.A00;
        C344497rx r0 = r12.A02;
        if (r0 != null) {
            r0.DQF(r2);
        }
        C344457rt.A00(r12, r2);
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A08) {
            C345897uG r0 = this.A0E;
            Looper looper = this.A0D;
            if (r0 == null || (this.A0G && looper != Looper.myLooper())) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public C344567s4(Context context, Looper looper, C344547s2 r7, C344557s3 r8, C344507ry r9, C344537s1 r10) {
        this.A02 = context;
        this.A05 = r9;
        C344517rz r2 = C344507ry.A07;
        int i = 3;
        Map map = r9.A00;
        Object obj = map.get(r2);
        int intValue = ((Number) (obj != null ? obj : i)).intValue();
        this.A01 = intValue;
        C344517rz r0 = C344507ry.A02;
        Object obj2 = C344527s0.A05;
        Object obj3 = map.get(r0);
        this.A03 = C344577s5.A01(obj3 != null ? obj3 : obj2, intValue);
        this.A04 = r8;
        this.A0B = r7;
        this.A00 = new Handler(looper);
        this.A0D = looper;
        boolean z = false;
        Object obj4 = map.get(C344507ry.A01);
        this.A09 = ((Boolean) (obj4 != null ? obj4 : z)).booleanValue();
        boolean z2 = true;
        Object obj5 = map.get(C344507ry.A09);
        this.A0A = ((Boolean) (obj5 != null ? obj5 : z2)).booleanValue();
        this.A06 = new C344607s8((Looper) map.get(C344507ry.A0A));
        this.A0C = r10;
    }
}
