package X;

import android.graphics.Bitmap;
import java.io.Closeable;

/* renamed from: X.3kY  reason: invalid class name and case insensitive filesystem */
public abstract class C249903kY implements Closeable, Cloneable {
    public static int A04;
    public static final 1T7 A05 = new 1T5();
    public static final 1T3 A06 = new 1T2();
    public boolean A00 = false;
    public final 1T7 A01;
    public final C240533Lg A02;
    public final Throwable A03;

    public C249903kY(1T7 r3, 1T3 r4, Object obj, boolean z) {
        this.A02 = new C240533Lg(r4, obj, z);
        this.A01 = r3;
        this.A03 = null;
    }

    public static C249903kY A00(1T7 r3, 1T3 r4, Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof C240513Le)) {
            int i = A04;
            if (i == 1) {
                return new C14976UHu(r3, r4, obj);
            }
            if (i == 2) {
                return new C249903kY(r3, r4, obj, false);
            }
            if (i == 3) {
                return new C249903kY((1T7) null, (1T3) null, obj, false);
            }
        }
        return new C268724dt(r3, r4, obj);
    }

    public synchronized C249903kY A04() {
        C249903kY r0;
        if (A06()) {
            r0 = A03();
        } else {
            r0 = null;
        }
        return r0;
    }

    public final synchronized Object A05() {
        Object A012;
        boolean z = false;
        if (!this.A00) {
            z = true;
        }
        0He.A00(z);
        A012 = this.A02.A01();
        A012.getClass();
        return A012;
    }

    public synchronized boolean A06() {
        return !this.A00;
    }

    public static void A01(C249903kY r0) {
        if (r0 != null) {
            r0.close();
        }
    }

    public static boolean A02(C249903kY r1) {
        if (r1 == null || !r1.A06()) {
            return false;
        }
        return true;
    }

    public C249903kY A03() {
        Throwable th;
        if (this instanceof C253753rM) {
            return this;
        }
        0He.A00(A06());
        C240533Lg r3 = this.A02;
        1T7 r2 = this.A01;
        if (this.A03 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new C268724dt(r2, r3, th);
    }

    public void close() {
        if (!(this instanceof C253753rM)) {
            synchronized (this) {
                if (!this.A00) {
                    this.A00 = true;
                    this.A02.A02();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C249903kY(1T7 r2, C240533Lg r3, Throwable th) {
        this.A02 = r3;
        synchronized (r3) {
            C240533Lg.A00(r3);
            r3.A00++;
        }
        this.A01 = r2;
        this.A03 = th;
    }
}
