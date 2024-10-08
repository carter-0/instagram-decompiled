package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.5kb  reason: invalid class name and case insensitive filesystem */
public final class C293365kb {
    public static int A08;
    public double A00;
    public double A01 = 0.0d;
    public C262554Eu A02;
    public boolean A03 = true;
    public final C293375kc A04 = new Object();
    public final C293375kc A05 = new Object();
    public final C293375kc A06 = new Object();
    public final CopyOnWriteArraySet A07 = new CopyOnWriteArraySet();

    public final void A00(double d) {
        if (this.A00 != d || !A01()) {
            this.A00 = d;
            Iterator it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onSpringEndStateChange");
            }
        }
    }

    public final boolean A01() {
        C293375kc r6 = this.A04;
        if (Math.abs(r6.A01) > 0.005d) {
            return false;
        }
        if (Math.abs(this.A00 - r6.A00) <= 0.005d || this.A02.A01 == 0.0d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5kc] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.5kc] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.5kc] */
    public C293365kb() {
        A08++;
        this.A02 = C262554Eu.A02;
    }
}
