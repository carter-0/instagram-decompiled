package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PbE  reason: case insensitive filesystem */
public final /* synthetic */ class C73355PbE implements Runnable {
    public final /* synthetic */ C74403PuJ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AtomicBoolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C73355PbE(C74403PuJ puJ, String str, AtomicBoolean atomicBoolean, boolean z) {
        this.A02 = atomicBoolean;
        this.A00 = puJ;
        this.A01 = str;
        this.A03 = z;
    }

    public final void run() {
        AtomicBoolean atomicBoolean = this.A02;
        C74403PuJ puJ = this.A00;
        String str = this.A01;
        boolean z = this.A03;
        if (!atomicBoolean.get()) {
            puJ.D55(str, z);
        }
    }
}
