package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Mbc  reason: case insensitive filesystem */
public final class C66731Mbc extends C318286oh {
    public final C65041a9 A00;
    public final C21109XEz A01;
    public final C21109XEz A02;
    public final C318266of A03;
    public volatile boolean A04;

    public final C65051aA A00(Runnable runnable) {
        if (this.A04) {
            return AnonymousClass6F8.INSTANCE;
        }
        return this.A03.A02(this.A02, runnable, TimeUnit.MILLISECONDS, 0);
    }

    public final C65051aA A01(Runnable runnable, TimeUnit timeUnit, long j) {
        if (this.A04) {
            return AnonymousClass6F8.INSTANCE;
        }
        return this.A03.A02(this.A00, runnable, timeUnit, j);
    }

    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            this.A01.dispose();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1aA, X.XEz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.1aA, java.lang.Object, X.1a9] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.XEz, java.lang.Object] */
    public C66731Mbc(C318266of r4) {
        this.A03 = r4;
        ? obj = new Object();
        this.A02 = obj;
        ? obj2 = new Object();
        this.A00 = obj2;
        ? obj3 = new Object();
        this.A01 = obj3;
        obj3.A7i(obj);
        obj3.A7i(obj2);
    }
}
