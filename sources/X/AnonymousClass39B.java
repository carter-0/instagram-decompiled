package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.LinkedHashSet;

/* renamed from: X.39B  reason: invalid class name */
public abstract class AnonymousClass39B {
    public Object A00;
    public final Context A01;
    public final Object A02 = new Object();
    public final LinkedHashSet A03 = new LinkedHashSet();
    public final AnonymousClass38N A04;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r1 != 5) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r2.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        if (r1 <= 0.15f) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass39H
            if (r0 == 0) goto L_0x000e
            r0 = r6
            X.39H r0 = (X.AnonymousClass39H) r0
            android.net.ConnectivityManager r0 = r0.A00
            X.52c r0 = X.C2804952b.A00(r0)
            return r0
        L_0x000e:
            boolean r0 = r6 instanceof X.AnonymousClass398
            if (r0 == 0) goto L_0x0045
            r0 = 502(0x1f6, float:7.03E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r0)
            android.content.Context r1 = r6.A01
            r0 = 0
            android.content.Intent r2 = r1.registerReceiver(r0, r2)
            if (r2 != 0) goto L_0x0036
            X.AnonymousClass389.A00()
            java.lang.String r1 = X.C9893Rj8.A00
            java.lang.String r0 = "getInitialState - null intent received"
            android.util.Log.e(r1, r0)
        L_0x0030:
            r5 = 0
        L_0x0031:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x0036:
            r5 = 1
            r1 = -1
            java.lang.String r0 = "status"
            int r1 = r2.getIntExtra(r0, r1)
            r0 = 2
            if (r1 == r0) goto L_0x0031
            r0 = 5
            if (r1 != r0) goto L_0x0030
            goto L_0x0031
        L_0x0045:
            boolean r0 = r6 instanceof X.AnonymousClass39J
            if (r0 == 0) goto L_0x007d
            r0 = r6
            X.399 r0 = (X.AnonymousClass399) r0
            android.content.Context r2 = r0.A01
            android.content.IntentFilter r1 = r0.A04()
            r0 = 0
            android.content.Intent r1 = r2.registerReceiver(r0, r1)
            r5 = 0
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = r1.getAction()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r2 = r1.getAction()
            if (r2 == 0) goto L_0x0031
            int r1 = r2.hashCode()
            r0 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r1 == r0) goto L_0x0031
            r0 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r1 != r0) goto L_0x0031
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x0031
        L_0x007d:
            r0 = 502(0x1f6, float:7.03E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r0)
            android.content.Context r1 = r6.A01
            r0 = 0
            android.content.Intent r4 = r1.registerReceiver(r0, r2)
            r5 = 0
            if (r4 != 0) goto L_0x009d
            X.AnonymousClass389.A00()
            java.lang.String r1 = X.C9894Rj9.A00
            java.lang.String r0 = "getInitialState - null intent received"
            android.util.Log.e(r1, r0)
            goto L_0x0031
        L_0x009d:
            java.lang.String r0 = "status"
            r3 = -1
            int r2 = r4.getIntExtra(r0, r3)
            java.lang.String r0 = "level"
            int r1 = r4.getIntExtra(r0, r3)
            java.lang.String r0 = "scale"
            int r0 = r4.getIntExtra(r0, r3)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1
            if (r2 == r0) goto L_0x00bd
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
        L_0x00bd:
            r5 = 1
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39B.A00():java.lang.Object");
    }

    public final void A01() {
        if (this instanceof AnonymousClass39H) {
            AnonymousClass39H r0 = (AnonymousClass39H) this;
            try {
                AnonymousClass389.A00();
                ConnectivityManager connectivityManager = r0.A00;
                AnonymousClass39I r1 = r0.A01;
                0qQ.A0B(connectivityManager, 0);
                0qQ.A0B(r1, 1);
                connectivityManager.registerDefaultNetworkCallback(r1);
            } catch (IllegalArgumentException | SecurityException e) {
                AnonymousClass389.A00();
                Log.e(C2804952b.A00, "Received exception while registering network callback", e);
            }
        } else {
            AnonymousClass399 r02 = (AnonymousClass399) this;
            AnonymousClass389.A00();
            r02.A01.registerReceiver(r02.A00, r02.A04());
        }
    }

    public final void A02() {
        if (this instanceof AnonymousClass39H) {
            AnonymousClass39H r0 = (AnonymousClass39H) this;
            try {
                AnonymousClass389.A00();
                ConnectivityManager connectivityManager = r0.A00;
                AnonymousClass39I r1 = r0.A01;
                0qQ.A0B(connectivityManager, 0);
                0qQ.A0B(r1, 1);
                connectivityManager.unregisterNetworkCallback(r1);
            } catch (IllegalArgumentException | SecurityException e) {
                AnonymousClass389.A00();
                Log.e(C2804952b.A00, "Received exception while unregistering network callback", e);
            }
        } else {
            AnonymousClass399 r02 = (AnonymousClass399) this;
            AnonymousClass389.A00();
            r02.A01.unregisterReceiver(r02.A00);
        }
    }

    public final void A03(Object obj) {
        synchronized (this.A02) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                ((AnonymousClass38M) this.A04).A02.execute(new C40928Ala(this, 00k.A0a(this.A03)));
            }
        }
    }

    public AnonymousClass39B(Context context, AnonymousClass38N r3) {
        this.A04 = r3;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A01 = applicationContext;
    }
}
