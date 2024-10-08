package X;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.WEn  reason: case insensitive filesystem */
public final class C18960WEn implements C265614Vl {
    public final WindowLayoutComponent A00;
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();
    public final ReentrantLock A03 = new ReentrantLock();

    public final void EBh(Context context, 02R r6, Executor executor) {
        0qQ.A0B(context, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Map map = this.A01;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.A00(r6);
                this.A02.put(r6, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.A02.put(r6, context);
                multicastConsumer2.A00(r6);
                this.A00.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FIw(X.02R r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.concurrent.locks.ReentrantLock r6 = r7.A03
            r6.lock()
            java.util.Map r5 = r7.A02     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r5.get(r8)     // Catch:{ all -> 0x0045 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0041
            java.util.Map r3 = r7.A01     // Catch:{ all -> 0x0045 }
            java.lang.Object r2 = r3.get(r4)     // Catch:{ all -> 0x0045 }
            androidx.window.layout.adapter.extensions.MulticastConsumer r2 = (androidx.window.layout.adapter.extensions.MulticastConsumer) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ all -> 0x0045 }
            r1.lock()     // Catch:{ all -> 0x0045 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x003c }
            r0.remove(r8)     // Catch:{ all -> 0x003c }
            r1.unlock()     // Catch:{ all -> 0x0045 }
            r5.remove(r8)     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            r3.remove(r4)     // Catch:{ all -> 0x0045 }
            androidx.window.extensions.layout.WindowLayoutComponent r0 = r7.A00     // Catch:{ all -> 0x0045 }
            r0.removeWindowLayoutInfoListener(r2)     // Catch:{ all -> 0x0045 }
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
            r1.unlock()     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r6.unlock()
            return
        L_0x0045:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18960WEn.FIw(X.02R):void");
    }

    public C18960WEn(WindowLayoutComponent windowLayoutComponent) {
        this.A00 = windowLayoutComponent;
    }
}
