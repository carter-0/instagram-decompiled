package X;

import java.util.Set;

/* renamed from: X.GKg  reason: case insensitive filesystem */
public final class C52239GKg implements Runnable {
    public final /* synthetic */ C52238GKf A00;
    public final /* synthetic */ C52228GJt A01;

    public C52239GKg(C52238GKf gKf, C52228GJt gJt) {
        this.A00 = gKf;
        this.A01 = gJt;
    }

    public final void run() {
        Set<C270674h7> set = this.A00.A04;
        C52228GJt gJt = this.A01;
        for (C270674h7 D3t : set) {
            D3t.D3t(gJt);
        }
    }
}
