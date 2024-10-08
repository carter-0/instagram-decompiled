package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.2re  reason: invalid class name and case insensitive filesystem */
public final class C231422re {
    public static final Executor A07 = new C231432rf();
    public int A00;
    public List A01;
    public List A02;
    public Executor A03;
    public final C231472rj A04;
    public final C231452rh A05;
    public final List A06;

    public final void A01(List list, Runnable runnable) {
        int i = this.A00 + 1;
        this.A00 = i;
        List list2 = this.A01;
        List list3 = list;
        Runnable runnable2 = runnable;
        if (list != list2) {
            List list4 = this.A02;
            if (list == null) {
                int size = list2.size();
                this.A01 = null;
                this.A02 = Collections.emptyList();
                this.A05.Ddf(0, size);
            } else if (list2 == null) {
                this.A01 = list;
                this.A02 = Collections.unmodifiableList(list);
                this.A05.DKr(0, list.size());
            } else {
                this.A04.A01.execute(new AnonymousClass3D9(this, runnable2, list2, list3, i));
                return;
            }
            A00(this, runnable, list4);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C231422re(X.C252303ot r5, X.2Rw r6) {
        /*
            r4 = this;
            X.2rg r3 = new X.2rg
            r3.<init>(r6)
            r2 = 0
            java.lang.Object r1 = X.C231462ri.A01
            monitor-enter(r1)
            java.util.concurrent.Executor r0 = X.C231462ri.A00     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0014
            r0 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)     // Catch:{ all -> 0x0020 }
            X.C231462ri.A00 = r0     // Catch:{ all -> 0x0020 }
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            java.util.concurrent.Executor r1 = X.C231462ri.A00
            X.2rj r0 = new X.2rj
            r0.<init>(r5, r2, r1)
            r4.<init>((X.C231472rj) r0, (X.C231452rh) r3)
            return
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231422re.<init>(X.3ot, X.2Rw):void");
    }

    public static void A00(C231422re r3, Runnable runnable, List list) {
        for (C322156vL D7T : r3.A06) {
            D7T.D7T(list, r3.A02);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C231422re(C231472rj r2, C231452rh r3) {
        this.A06 = new CopyOnWriteArrayList();
        this.A02 = Collections.emptyList();
        this.A05 = r3;
        this.A04 = r2;
        Executor executor = r2.A02;
        this.A03 = executor == null ? A07 : executor;
    }
}
