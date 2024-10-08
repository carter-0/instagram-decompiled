package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4R9  reason: invalid class name */
public final class AnonymousClass4R9 {
    public static AnonymousClass4R9 A04;
    public int A00 = 0;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final Object A02 = new Object();
    public final CopyOnWriteArrayList A03 = new CopyOnWriteArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r2.hasNext() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = (java.lang.ref.Reference) r2.next();
        r0 = (X.AnonymousClass4RC) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.DTs(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r3 = r3.A03;
        r2 = r3.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass4R9 r3, int r4) {
        /*
            java.lang.Object r1 = r3.A02
            monitor-enter(r1)
            int r0 = r3.A00     // Catch:{ all -> 0x002f }
            if (r0 != r4) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            return
        L_0x0009:
            r3.A00 = r4     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.A03
            java.util.Iterator r2 = r3.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.4RC r0 = (X.AnonymousClass4RC) r0
            if (r0 == 0) goto L_0x002a
            r0.DTs(r4)
            goto L_0x0012
        L_0x002a:
            r3.remove(r1)
            goto L_0x0012
        L_0x002e:
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4R9.A00(X.4R9, int):void");
    }

    public AnonymousClass4R9(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new AnonymousClass4RA(this), intentFilter);
    }
}
