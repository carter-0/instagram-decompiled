package X;

import android.os.MessageQueue;

/* renamed from: X.Mgp  reason: case insensitive filesystem */
public final class C67016Mgp implements MessageQueue.IdleHandler {
    public final /* synthetic */ C66633Ma2 A00;

    public C67016Mgp(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean queueIdle() {
        /*
            r5 = this;
            java.lang.String r0 = "DirectInboxController.globalLayoutListenerIdleTask"
            X.0lp r3 = X.0lq.A00(r0)
            X.Ma2 r4 = r5.A00
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0F     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            X.3pI r2 = r0.A0D     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0042
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            X.Mi9 r0 = r4.A0u()     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0042
            X.Mgq r0 = X.C66633Ma2.A04(r4)     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            X.Mgq r1 = X.C66633Ma2.A04(r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "dispatch_global_layout_listener_on_idle"
            r1.A0E(r0)     // Catch:{ all -> 0x0047 }
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2     // Catch:{ all -> 0x0047 }
            int r0 = r2.A1a()     // Catch:{ all -> 0x0047 }
            if (r0 < 0) goto L_0x0042
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0F     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            r0.dispatchOnGlobalLayout()     // Catch:{ all -> 0x0047 }
        L_0x0042:
            r0 = 0
            r3.close()
            return r0
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67016Mgp.queueIdle():boolean");
    }
}
