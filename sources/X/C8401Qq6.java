package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzb;

/* renamed from: X.Qq6  reason: case insensitive filesystem */
public final class C8401Qq6 extends AnonymousClass645 {
    public final C10755RxZ A00;
    public final C13480Tb7 A01;
    public final String A02 = "locationServices";

    public final String A05() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String A06() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public C8401Qq6(Context context, Looper looper, AnonymousClass63y r12, AnonymousClass640 r13, AnonymousClass643 r14) {
        super(context, looper, r12, r13, r14, 23);
        SyI syI = new SyI(this);
        this.A01 = syI;
        this.A00 = new C10755RxZ(context, syI);
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzal) {
            return queryLocalInterface;
        }
        zzb zzb = new zzb("com.google.android.gms.location.internal.IGoogleLocationManagerService", iBinder);
        AnonymousClass0fD.A0A(1234851570, AnonymousClass0fD.A03(-1687165546));
        return zzb;
    }

    public final Feature[] A0A() {
        return C10131Rn8.A02;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void disconnect() {
        /*
            r12 = this;
            X.RxZ r3 = r12.A00
            monitor-enter(r3)
            boolean r0 = r12.isConnected()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007c
            java.util.Map r2 = r3.A01     // Catch:{ Exception -> 0x0074 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0074 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r2)     // Catch:{ all -> 0x0071 }
        L_0x0010:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0071 }
            r6 = 0
            if (r0 == 0) goto L_0x001b
            r1.next()     // Catch:{ all -> 0x0071 }
            goto L_0x0010
        L_0x001b:
            r2.clear()     // Catch:{ all -> 0x0071 }
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            java.util.Map r4 = r3.A03     // Catch:{ Exception -> 0x0074 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0074 }
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r4)     // Catch:{ all -> 0x006e }
        L_0x0026:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x006e }
            com.google.android.gms.internal.location.zzas r1 = (com.google.android.gms.internal.location.zzas) r1     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0026
            X.Tb7 r0 = r3.A00     // Catch:{ all -> 0x006e }
            X.SyI r0 = (X.SyI) r0     // Catch:{ all -> 0x006e }
            X.Qq6 r0 = r0.A00     // Catch:{ all -> 0x006e }
            android.os.IInterface r0 = r0.A03()     // Catch:{ all -> 0x006e }
            com.google.android.gms.internal.location.zzal r0 = (com.google.android.gms.internal.location.zzal) r0     // Catch:{ all -> 0x006e }
            android.os.IBinder r8 = r1.asBinder()     // Catch:{ all -> 0x006e }
            r11 = 2
            com.google.android.gms.internal.location.zzbe r5 = new com.google.android.gms.internal.location.zzbe     // Catch:{ all -> 0x006e }
            r7 = r6
            r9 = r6
            r10 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x006e }
            r0.FP5(r5)     // Catch:{ all -> 0x006e }
            goto L_0x0026
        L_0x0051:
            r4.clear()     // Catch:{ all -> 0x006e }
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x0074 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0074 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r2)     // Catch:{ all -> 0x006b }
        L_0x005c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0066
            r1.next()     // Catch:{ all -> 0x006b }
            goto L_0x005c
        L_0x0066:
            r2.clear()     // Catch:{ all -> 0x006b }
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            goto L_0x007c
        L_0x006b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            goto L_0x0073
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            goto L_0x0073
        L_0x0071:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
        L_0x0073:
            throw r0     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0081 }
        L_0x007c:
            super.disconnect()     // Catch:{ all -> 0x0081 }
            monitor-exit(r3)     // Catch:{ all -> 0x0081 }
            return
        L_0x0081:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0081 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8401Qq6.disconnect():void");
    }

    public final Bundle A02() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(1170), this.A02);
        return A0a;
    }
}
