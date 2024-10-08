package X;

import java.util.concurrent.Executor;

/* renamed from: X.XCj  reason: case insensitive filesystem */
public final class C21057XCj extends 00q {
    public static final Executor A02 = new C21059XCl(1);
    public static final Executor A03 = new C21059XCl(0);
    public static volatile C21057XCj A04;
    public 00q A00;
    public final 00q A01;

    public static C21057XCj A00() {
        if (A04 == null) {
            synchronized (C21057XCj.class) {
                if (A04 == null) {
                    A04 = new C21057XCj();
                }
            }
        }
        return A04;
    }

    public final void A01(Runnable runnable) {
        this.A00.A01(runnable);
    }

    public final void A02(Runnable runnable) {
        this.A00.A02(runnable);
    }

    public final boolean A03() {
        return this.A00.A03();
    }

    public C21057XCj() {
        Pxr pxr = new Pxr();
        this.A01 = pxr;
        this.A00 = pxr;
    }
}
