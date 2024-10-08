package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.AoR  reason: case insensitive filesystem */
public final class C41105AoR implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C371248xs A02;

    public C41105AoR(Context context, Intent intent, C371248xs r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2.equals("android.intent.action.HEADSET_PLUG") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r3.getIntExtra(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, 0) != 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r5 = r6.A02.getDevices(2);
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3 >= r4) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r2 = r5[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r2.getType() == 8) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r2.getType() == 7) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r2.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r3.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0) == 2) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5 = r6.A02.getDevices(2);
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r3 >= r4) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r2 = r5[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r2.getType() == 4) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r2.getType() == 3) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r6.A03.post(new X.C371268xu(r6, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r2 = r3.getAction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.8xs r0 = r8.A02
            android.content.Intent r3 = r8.A01
            X.8xr r6 = r0.A00
            monitor-enter(r6)
            boolean r0 = r6.A05     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r6)     // Catch:{ all -> 0x007f }
            return
        L_0x000d:
            monitor-exit(r6)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r3.getAction()
            if (r2 == 0) goto L_0x007e
            java.lang.String r0 = "android.intent.action.HEADSET_PLUG"
            boolean r0 = r2.equals(r0)
            r7 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "state"
            int r0 = r3.getIntExtra(r0, r1)
            if (r0 != 0) goto L_0x0074
            android.media.AudioManager r1 = r6.A02
            r0 = 2
            android.media.AudioDeviceInfo[] r5 = r1.getDevices(r0)
            int r4 = r5.length
            r3 = 0
        L_0x002f:
            if (r3 >= r4) goto L_0x0073
            r2 = r5[r3]
            int r1 = r2.getType()
            r0 = 8
            if (r1 == r0) goto L_0x0074
            int r1 = r2.getType()
            r0 = 7
            if (r1 == r0) goto L_0x0074
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0045:
            java.lang.String r0 = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "android.bluetooth.adapter.extra.CONNECTION_STATE"
            int r0 = r3.getIntExtra(r0, r1)
            r1 = 2
            if (r0 == r1) goto L_0x0074
            android.media.AudioManager r0 = r6.A02
            android.media.AudioDeviceInfo[] r5 = r0.getDevices(r1)
            int r4 = r5.length
            r3 = 0
        L_0x005e:
            if (r3 >= r4) goto L_0x0073
            r2 = r5[r3]
            int r1 = r2.getType()
            r0 = 4
            if (r1 == r0) goto L_0x0074
            int r1 = r2.getType()
            r0 = 3
            if (r1 == r0) goto L_0x0074
            int r3 = r3 + 1
            goto L_0x005e
        L_0x0073:
            r7 = 0
        L_0x0074:
            android.os.Handler r1 = r6.A03
            X.8xu r0 = new X.8xu
            r0.<init>(r6, r7)
            r1.post(r0)
        L_0x007e:
            return
        L_0x007f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41105AoR.run():void");
    }
}
