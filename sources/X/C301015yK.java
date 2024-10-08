package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5yK  reason: invalid class name and case insensitive filesystem */
public final class C301015yK implements ServiceConnection, C301025yL {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final AnonymousClass64V A04;
    public final Map A05 = new HashMap();
    public final /* synthetic */ AnonymousClass63a A06;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r11 != null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r17) {
        /*
            r16 = this;
            r0 = 3
            r12 = r16
            r12.A00 = r0
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            boolean r0 = X.C301035yM.A01()
            if (r0 == 0) goto L_0x001f
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r4)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L_0x001f:
            X.63a r2 = r12.A06     // Catch:{ all -> 0x00ae }
            X.64D r13 = r2.A01     // Catch:{ all -> 0x00ae }
            android.content.Context r10 = r2.A00     // Catch:{ all -> 0x00ae }
            X.64V r3 = r12.A04     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = "ConnectionStatusConfig"
            java.lang.String r5 = r3.A01     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x005a
            boolean r0 = r3.A03     // Catch:{ all -> 0x00ae }
            r9 = 0
            if (r0 == 0) goto L_0x007d
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x00ae }
            r8.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "serviceActionBundleKey"
            r8.putString(r0, r5)     // Catch:{ all -> 0x00ae }
            android.content.ContentResolver r7 = r10.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x004b }
            android.net.Uri r1 = X.AnonymousClass64V.A04     // Catch:{ IllegalArgumentException -> 0x004b }
            java.lang.String r0 = "serviceIntentCall"
            android.os.Bundle r1 = r7.call(r1, r0, r9, r8)     // Catch:{ IllegalArgumentException -> 0x004b }
            if (r1 == 0) goto L_0x0070
            goto L_0x0066
        L_0x004b:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Dynamic intent resolution failed: "
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00ae }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0070
        L_0x005a:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00ae }
            r1.<init>()     // Catch:{ all -> 0x00ae }
            android.content.ComponentName r0 = r3.A00     // Catch:{ all -> 0x00ae }
            android.content.Intent r11 = r1.setComponent(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0088
        L_0x0066:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r11 = r1.getParcelable(r0)     // Catch:{ all -> 0x00ae }
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ all -> 0x00ae }
            if (r11 != 0) goto L_0x0088
        L_0x0070:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00ae }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00ae }
        L_0x007d:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00ae }
            r1.<init>(r5)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x00ae }
            android.content.Intent r11 = r1.setPackage(r0)     // Catch:{ all -> 0x00ae }
        L_0x0088:
            r15 = 4225(0x1081, float:5.92E-42)
            r1 = 1
            r14 = r17
            boolean r0 = X.AnonymousClass64D.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ae }
            r12.A03 = r0     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00a4
            android.os.Handler r0 = r2.A04     // Catch:{ all -> 0x00ae }
            android.os.Message r3 = r0.obtainMessage(r1, r3)     // Catch:{ all -> 0x00ae }
            android.os.Handler r2 = r2.A04     // Catch:{ all -> 0x00ae }
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x00ae }
            goto L_0x00aa
        L_0x00a4:
            r0 = 2
            r12.A00 = r0     // Catch:{ all -> 0x00ae }
            r13.A02(r10, r12)     // Catch:{ IllegalArgumentException -> 0x00aa }
        L_0x00aa:
            android.os.StrictMode.setVmPolicy(r4)
            return
        L_0x00ae:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C301015yK.A00(java.lang.String):void");
    }

    public C301015yK(AnonymousClass64V r2, AnonymousClass63a r3) {
        this.A06 = r3;
        this.A04 = r2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AnonymousClass63a r0 = this.A06;
        synchronized (r0.A02) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            for (ServiceConnection onServiceConnected : this.A05.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass63a r0 = this.A06;
        synchronized (r0.A02) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            for (ServiceConnection onServiceDisconnected : this.A05.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }
}
