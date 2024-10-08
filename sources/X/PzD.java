package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;

public final class PzD implements Runnable {
    public final /* synthetic */ AnonymousClass5AD A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ List A02;

    public PzD(AnonymousClass5AD r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = list;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.5AD] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r1 != 5) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.util.List r0 = r8.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x0006:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r5 = r7.next()
            X.PzA r5 = (X.PzA) r5
            java.util.Set r0 = r5.A0F
            if (r0 == 0) goto L_0x0006
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0006
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r3 = r8.A01
            androidx.core.graphics.drawable.IconCompat r2 = r5.A09
            r4 = 0
            if (r2 == 0) goto L_0x0039
            int r1 = r2.A02
            r0 = -1
            if (r1 != r0) goto L_0x0030
            java.lang.Object r0 = r2.A06
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r1 = r0.getType()
        L_0x0030:
            r0 = 1
            if (r1 == r0) goto L_0x00a0
            r0 = 2
            if (r1 == r0) goto L_0x0090
            r0 = 5
            if (r1 == r0) goto L_0x00a0
        L_0x0039:
            r6 = r4
            r0 = r4
        L_0x003b:
            X.PzB r2 = new X.PzB
            r2.<init>(r5)
            X.PzA r1 = r2.A01
            r1.A09 = r4
            X.PzA r1 = r2.A00()
            X.PzC r4 = new X.PzC
            r4.<init>(r1, r6, r0)
            androidx.core.graphics.drawable.IconCompat r0 = r5.A09
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x008e
            android.graphics.Bitmap r1 = r0.A05()
        L_0x0057:
            java.lang.String r5 = r5.A0D
            java.util.Map r0 = r3.A04
            r0.put(r5, r4)
            if (r1 == 0) goto L_0x0006
            X.Pz4 r4 = new X.Pz4
            r4.<init>(r1, r3, r2)
            X.5AD r2 = new X.5AD
            r2.<init>()
            java.util.concurrent.ExecutorService r1 = r3.A06
            X.Pz2 r0 = new X.Pz2
            r0.<init>(r2, r3, r4)
            r1.submit(r0)
            java.util.Map r0 = r3.A03
            java.lang.Object r1 = r0.put(r5, r2)
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            if (r1 == 0) goto L_0x0082
            r0 = 0
            r1.cancel(r0)
        L_0x0082:
            X.Pz3 r1 = new X.Pz3
            r1.<init>(r8, r2, r5)
            java.util.concurrent.ExecutorService r0 = r3.A05
            r2.addListener(r1, r0)
            goto L_0x0006
        L_0x008e:
            r1 = 0
            goto L_0x0057
        L_0x0090:
            android.content.Context r0 = r3.A00
            android.content.res.Resources r1 = r0.getResources()
            int r0 = r2.A04()
            java.lang.String r6 = r1.getResourceName(r0)
            r0 = r4
            goto L_0x003b
        L_0x00a0:
            java.io.File r2 = r3.A01
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.lang.String r0 = r0.getAbsolutePath()
            r6 = r4
            goto L_0x003b
        L_0x00b5:
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r1 = r8.A01
            X.5AD r0 = r8.A00
            r1.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PzD.run():void");
    }
}
