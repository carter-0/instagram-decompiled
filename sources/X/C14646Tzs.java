package X;

import android.view.Choreographer;
import java.lang.reflect.Method;

/* renamed from: X.Tzs  reason: case insensitive filesystem */
public final class C14646Tzs {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public boolean A03;
    public final Choreographer A04;
    public final C18560VuC A05;
    public final Runnable A06;
    public final Method A07;
    public final Method A08;
    public final Method A09;
    public final 0Gb A0A;

    public final void A01() {
        this.A02 = false;
        try {
            this.A09.invoke(this.A04, new Object[]{0, this.A06, null});
        } catch (Exception e) {
            A00(this, e);
        }
    }

    public final void A02() {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        A03(this.A06);
    }

    public static void A00(C14646Tzs tzs, Exception exc) {
        tzs.A0A.EwA(C51968G9o.A16(tzs), "Choreographer reflection failed.", exc);
        tzs.A03 = true;
    }

    public final void A03(Runnable runnable) {
        if (!this.A03) {
            try {
                this.A08.invoke(this.A04, new Object[]{0, runnable, null});
            } catch (Exception e) {
                A00(this, e);
            }
        }
    }

    public C14646Tzs(Choreographer choreographer, 0Gb r8, C18560VuC vuC) {
        Method method;
        Method method2;
        Method method3;
        this.A05 = vuC;
        this.A04 = choreographer;
        this.A0A = r8;
        try {
            method = Choreographer.class.getDeclaredMethod("postCallback", new Class[]{Integer.TYPE, Runnable.class, Object.class});
        } catch (NoSuchMethodException e) {
            A00(this, e);
            method = null;
        }
        this.A08 = method;
        try {
            method2 = Choreographer.class.getDeclaredMethod("removeCallbacks", new Class[]{Integer.TYPE, Runnable.class, Object.class});
        } catch (NoSuchMethodException e2) {
            A00(this, e2);
            method2 = null;
        }
        this.A09 = method2;
        try {
            method3 = Choreographer.class.getDeclaredMethod("getFrameTime", new Class[0]);
        } catch (NoSuchMethodException e3) {
            A00(this, e3);
            method3 = null;
        }
        this.A07 = method3;
        this.A06 = new C14647Tzt(this);
    }
}
