package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.96Y  reason: invalid class name */
public final class AnonymousClass96Y {
    public C3735596a A00;
    public Boolean A01;
    public final C3735195u A02;
    public final boolean A03;
    public final /* synthetic */ FirebaseInstanceId A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r0 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A00() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Boolean r0 = r2.A01     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x000a
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x000a:
            boolean r0 = r2.A03     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            com.google.firebase.iid.FirebaseInstanceId r0 = r2.A04     // Catch:{ all -> 0x002b }
            X.95g r0 = r0.A02     // Catch:{ all -> 0x002b }
            X.C3734195g.A01(r0)     // Catch:{ all -> 0x002b }
            X.96L r0 = r0.A03     // Catch:{ all -> 0x002b }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002b }
            X.96e r1 = (X.C3735996e) r1     // Catch:{ all -> 0x002b }
            monitor-enter(r1)     // Catch:{ all -> 0x002b }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0025:
            r1 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            monitor-exit(r2)
            return r1
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96Y.A00():boolean");
    }

    public AnonymousClass96Y(C3735195u r8, FirebaseInstanceId firebaseInstanceId) {
        boolean z;
        Boolean bool;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.A04 = firebaseInstanceId;
        this.A02 = r8;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            C3734195g r0 = firebaseInstanceId.A02;
            C3734195g.A01(r0);
            Context context = r0.A00;
            Intent intent = new Intent(Pxd.A00(201));
            intent.setPackage(context.getPackageName());
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            z = (resolveService == null || resolveService.serviceInfo == null) ? false : z;
        }
        z = true;
        this.A03 = z;
        C3734195g r02 = this.A04.A02;
        C3734195g.A01(r02);
        Context context2 = r02.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled"))) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            bool = null;
        }
        this.A01 = bool;
        if (bool == null && z) {
            C3735596a r4 = new C3735596a(this);
            this.A00 = r4;
            Class<C3735696b> cls = C3735696b.class;
            Executor executor = r8.A02;
            synchronized (r8) {
                Map map = r8.A01;
                if (!map.containsKey(cls)) {
                    map.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) map.get(cls)).put(r4, executor);
            }
        }
    }
}
