package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6oe  reason: invalid class name and case insensitive filesystem */
public final class C318256oe extends C318206oZ {
    public static final int A02;
    public static final C318296oi A03;
    public static final C318266of A04;
    public static final C318216oa A05;
    public final ThreadFactory A00 = A05;
    public final AtomicReference A01;

    public C318256oe() {
        C318296oi r3 = A03;
        this.A01 = new AtomicReference(r3);
        C318296oi r1 = new C318296oi(A02, this.A00);
        if (!1FH.A00(r3, r1, this.A01)) {
            for (C318266of dispose : r1.A02) {
                dispose.dispose();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.6og, X.6of] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        A02 = availableProcessors;
        ? r0 = new C318276og(new C318216oa("RxComputationShutdown", 5, false));
        A04 = r0;
        r0.dispose();
        C318216oa r1 = new C318216oa("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        A05 = r1;
        C318296oi r02 = new C318296oi(0, r1);
        A03 = r02;
        for (C318266of dispose : r02.A02) {
            dispose.dispose();
        }
    }
}
