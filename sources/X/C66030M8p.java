package X;

import java.util.List;

/* renamed from: X.M8p  reason: case insensitive filesystem */
public final class C66030M8p implements Runnable {
    public final /* synthetic */ C60404Jkx A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ C62320sa A02;

    public C66030M8p(C60404Jkx jkx, List list, C62320sa r3) {
        this.A00 = jkx;
        this.A01 = list;
        this.A02 = r3;
    }

    public final void run() {
        C60404Jkx jkx = this.A00;
        JTP.A1C(new C60356Jk4(this.A01, jkx.A00), jkx);
        this.A02.invoke();
    }
}
