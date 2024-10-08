package X;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: X.Qva  reason: case insensitive filesystem */
public final class C8488Qva extends C8492Qve {
    public static boolean A05;
    public String A00;
    public boolean A01 = false;
    public AdvertisingIdClient.Info A02;
    public final Object A03 = Pxe.A0p();
    public final C11233SGt A04;

    private final boolean A02(String str) {
        try {
            String A012 = A01(str);
            ST5.A0B(this, "Storing hashed adid.", 2);
            FileOutputStream openFileOutput = this.A00.A00.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(A012.getBytes());
            openFileOutput.close();
            this.A00 = A012;
            return true;
        } catch (IOException e) {
            A0H("Error creating hash file", e);
            return false;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info A00(X.C8488Qva r25) {
        /*
            r2 = r25
            monitor-enter(r2)
            X.SGt r3 = r2.A04     // Catch:{ all -> 0x0336 }
            r0 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r3.A00(r0)     // Catch:{ all -> 0x0336 }
            if (r0 == 0) goto L_0x0332
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0336 }
            r3.A00 = r0     // Catch:{ all -> 0x0336 }
            X.SQt r0 = r2.A00     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            android.content.Context r6 = r0.A00     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            r17 = 0
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r1 = r6.createPackageContext(r1, r0)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = "google_ads_flags"
            android.content.SharedPreferences r7 = X.Pxe.A0H(r1, r0)     // Catch:{ all -> 0x002e }
            goto L_0x0038
        L_0x002b:
            r7 = r17
            goto L_0x0038
        L_0x002e:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while getting SharedPreferences "
            android.util.Log.w(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            r7 = r17
        L_0x0038:
            java.lang.String r0 = "gads:ad_id_app_context:enabled"
            r8 = 0
            if (r7 != 0) goto L_0x003f
            r5 = 0
            goto L_0x004d
        L_0x003f:
            boolean r5 = r7.getBoolean(r0, r8)     // Catch:{ all -> 0x0044 }
            goto L_0x004d
        L_0x0044:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            r5 = 0
        L_0x004d:
            java.lang.String r1 = "gads:ad_id_app_context:ping_ratio"
            r0 = 0
            if (r7 != 0) goto L_0x0055
            r18 = 0
            goto L_0x0064
        L_0x0055:
            float r18 = r7.getFloat(r1, r0)     // Catch:{ all -> 0x005a }
            goto L_0x0064
        L_0x005a:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            r18 = 0
        L_0x0064:
            java.lang.String r0 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x0077
            java.lang.String r4 = r7.getString(r0, r4)     // Catch:{ all -> 0x006f }
            goto L_0x0077
        L_0x006f:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
        L_0x0077:
            java.lang.String r0 = "gads:ad_id_use_persistent_service:enabled"
            if (r7 != 0) goto L_0x007d
            r0 = 0
            goto L_0x008b
        L_0x007d:
            boolean r0 = r7.getBoolean(r0, r8)     // Catch:{ all -> 0x0082 }
            goto L_0x008b
        L_0x0082:
            r3 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r0 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            r0 = 0
        L_0x008b:
            r23 = -1
            com.google.android.gms.ads.identifier.AdvertisingIdClient r3 = new com.google.android.gms.ads.identifier.AdvertisingIdClient     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            r3.<init>(r6, r5, r0)     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = "Calling this from your main thread can lead to deadlock"
            X.AnonymousClass3Qk.A05(r10)     // Catch:{ all -> 0x01f1 }
            monitor-enter(r3)     // Catch:{ all -> 0x01f1 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x00a3
            r3.A01()     // Catch:{ all -> 0x01ee }
        L_0x00a3:
            android.content.Context r6 = r3.A03     // Catch:{ all -> 0x01ee }
            boolean r7 = r3.A05     // Catch:{ all -> 0x01ee }
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01e1 }
            java.lang.String r0 = "com.android.vending"
            r1.getPackageInfo(r0, r8)     // Catch:{ NameNotFoundException -> 0x01e1 }
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.A00     // Catch:{ all -> 0x01ee }
            int r1 = X.Pxe.A05(r6, r0)     // Catch:{ all -> 0x01ee }
            if (r1 == 0) goto L_0x00c2
            r0 = 2
            if (r1 == r0) goto L_0x00c2
            java.lang.String r0 = "Google Play services not available"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x00c2:
            if (r7 == 0) goto L_0x00c7
            java.lang.String r0 = "com.google.android.gms.ads.identifier.service.PERSISTENT_START"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r0 = "com.google.android.gms.ads.identifier.service.START"
        L_0x00c9:
            X.SVV r8 = new X.SVV     // Catch:{ all -> 0x01ee }
            r8.<init>()     // Catch:{ all -> 0x01ee }
            android.content.Intent r1 = X.Pxe.A0G(r0)     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = "com.google.android.gms"
            r1.setPackage(r0)     // Catch:{ all -> 0x01ee }
            X.64D r0 = X.AnonymousClass64D.A00()     // Catch:{ all -> 0x01da }
            r9 = 1
            boolean r0 = r0.A03(r6, r1, r8, r9)     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01d3
            r3.A00 = r8     // Catch:{ all -> 0x01ee }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r6 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread"
            X.AnonymousClass3Qk.A05(r6)     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            boolean r6 = r8.A00     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            if (r6 != 0) goto L_0x01c5
            r8.A00 = r9     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            java.util.concurrent.BlockingQueue r6 = r8.A01     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            java.lang.Object r6 = r6.poll(r0, r7)     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            android.os.IBinder r6 = (android.os.IBinder) r6     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            if (r6 == 0) goto L_0x01bd
            java.lang.String r11 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            android.os.IInterface r1 = r6.queryLocalInterface(r11)     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads_identifier.zze     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            if (r0 == 0) goto L_0x010a
            com.google.android.gms.internal.ads_identifier.zze r1 = (com.google.android.gms.internal.ads_identifier.zze) r1     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            goto L_0x010f
        L_0x010a:
            com.google.android.gms.internal.ads_identifier.zzg r1 = new com.google.android.gms.internal.ads_identifier.zzg     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            r1.<init>(r6)     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
        L_0x010f:
            r3.A01 = r1     // Catch:{ all -> 0x01ee }
            r3.A02 = r9     // Catch:{ all -> 0x01ee }
            monitor-exit(r3)     // Catch:{ all -> 0x01ee }
            X.AnonymousClass3Qk.A05(r10)     // Catch:{ all -> 0x01f1 }
            monitor-enter(r3)     // Catch:{ all -> 0x01f1 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x01ba }
            if (r0 != 0) goto L_0x012a
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x01ba }
            monitor-enter(r1)     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = "AdvertisingIdClient is not connected."
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0126 }
            goto L_0x01b9
        L_0x012a:
            X.SVV r0 = r3.A00     // Catch:{ all -> 0x01ba }
            X.AnonymousClass3Qk.A02(r0)     // Catch:{ all -> 0x01ba }
            com.google.android.gms.internal.ads_identifier.zze r8 = r3.A01     // Catch:{ all -> 0x01ba }
            X.AnonymousClass3Qk.A02(r8)     // Catch:{ all -> 0x01ba }
            com.google.android.gms.internal.ads_identifier.zzg r8 = (com.google.android.gms.internal.ads_identifier.zzg) r8     // Catch:{ RemoteException -> 0x01b3 }
            r0 = 456134052(0x1b300da4, float:1.4562786E-22)
            int r6 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x01b3 }
            r12 = 581289385(0x22a5c5a9, float:4.493262E-18)
            int r7 = X.AnonymousClass0fD.A03(r12)     // Catch:{ RemoteException -> 0x01b3 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x01b3 }
            r1.writeInterfaceToken(r11)     // Catch:{ RemoteException -> 0x01b3 }
            r0 = -219565591(0xfffffffff2e9b1e9, float:-9.257611E30)
            X.AnonymousClass0fD.A0A(r0, r7)     // Catch:{ RemoteException -> 0x01b3 }
            android.os.Parcel r0 = r8.A00(r1, r9)     // Catch:{ RemoteException -> 0x01b3 }
            java.lang.String r7 = r0.readString()     // Catch:{ RemoteException -> 0x01b3 }
            r0.recycle()     // Catch:{ RemoteException -> 0x01b3 }
            r0 = -1367741701(0xffffffffae79eafb, float:-5.682475E-11)
            X.AnonymousClass0fD.A0A(r0, r6)     // Catch:{ RemoteException -> 0x01b3 }
            com.google.android.gms.internal.ads_identifier.zze r10 = r3.A01     // Catch:{ RemoteException -> 0x01b3 }
            com.google.android.gms.internal.ads_identifier.zzg r10 = (com.google.android.gms.internal.ads_identifier.zzg) r10     // Catch:{ RemoteException -> 0x01b3 }
            r0 = -1846023719(0xffffffff91f7e9d9, float:-3.9113848E-28)
            int r8 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x01b3 }
            int r6 = X.AnonymousClass0fD.A03(r12)     // Catch:{ RemoteException -> 0x01b3 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x01b3 }
            r1.writeInterfaceToken(r11)     // Catch:{ RemoteException -> 0x01b3 }
            r0 = -219565591(0xfffffffff2e9b1e9, float:-9.257611E30)
            X.AnonymousClass0fD.A0A(r0, r6)     // Catch:{ RemoteException -> 0x01b3 }
            r1.writeInt(r9)     // Catch:{ RemoteException -> 0x01b3 }
            r0 = 2
            android.os.Parcel r6 = r10.A00(r1, r0)     // Catch:{ RemoteException -> 0x01b3 }
            int r0 = r6.readInt()     // Catch:{ RemoteException -> 0x01b3 }
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            r6.recycle()     // Catch:{ RemoteException -> 0x01b3 }
            r0 = 70226003(0x42f9053, float:2.0637422E-36)
            X.AnonymousClass0fD.A0A(r0, r8)     // Catch:{ RemoteException -> 0x01b3 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r15 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch:{ RemoteException -> 0x01b3 }
            r15.<init>(r7, r1)     // Catch:{ RemoteException -> 0x01b3 }
            monitor-exit(r3)     // Catch:{ all -> 0x01ba }
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x01f1 }
            monitor-enter(r1)     // Catch:{ all -> 0x01f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            long r19 = X.Pxe.A0C(r13)     // Catch:{ all -> 0x01f1 }
            r21 = r5
            r16 = r4
            com.google.android.gms.ads.identifier.AdvertisingIdClient.A00(r15, r16, r17, r18, r19, r21)     // Catch:{ all -> 0x01f1 }
            r3.A01()     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            goto L_0x0218
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01b3:
            java.lang.String r0 = "Remote exception"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x01ba }
        L_0x01b9:
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01bd:
            java.lang.String r1 = "Timed out waiting for the service connection"
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
            goto L_0x01cb
        L_0x01c5:
            java.lang.String r0 = "Cannot call get on this connection more than once"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
        L_0x01cb:
            throw r0     // Catch:{ InterruptedException -> 0x01cc, all -> 0x01e7 }
        L_0x01cc:
            java.lang.String r0 = "Interrupted exception"
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01ed
        L_0x01d3:
            java.lang.String r0 = "Connection failure"
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01ed
        L_0x01da:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01ee }
            r1.<init>(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01ed
        L_0x01e1:
            X.RKI r1 = new X.RKI     // Catch:{ all -> 0x01ee }
            r1.<init>()     // Catch:{ all -> 0x01ee }
            goto L_0x01ed
        L_0x01e7:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01ee }
            r1.<init>(r0)     // Catch:{ all -> 0x01ee }
        L_0x01ed:
            throw r1     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r21 = move-exception
            r19 = r17
            r20 = r4
            r22 = r18
            r25 = r5
            com.google.android.gms.ads.identifier.AdvertisingIdClient.A00(r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x01fe }
            throw r21     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r0 = move-exception
            r3.A01()     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
            throw r0     // Catch:{ IllegalStateException -> 0x0211, Exception -> 0x0203 }
        L_0x0203:
            r1 = move-exception
            boolean r0 = A05     // Catch:{ all -> 0x0336 }
            if (r0 != 0) goto L_0x0217
            r0 = 1
            A05 = r0     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = "Error getting advertiser id"
            r2.A0G(r0, r1)     // Catch:{ all -> 0x0336 }
            goto L_0x0217
        L_0x0211:
            java.lang.String r1 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details."
            r0 = 5
            X.ST5.A0B(r2, r1, r0)     // Catch:{ all -> 0x0336 }
        L_0x0217:
            r15 = 0
        L_0x0218:
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r3 = r2.A02     // Catch:{ all -> 0x0336 }
            r6 = 0
            if (r15 == 0) goto L_0x021f
            java.lang.String r6 = r15.A00     // Catch:{ all -> 0x0336 }
        L_0x021f:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0336 }
            r8 = 1
            if (r0 != 0) goto L_0x0330
            X.SQt r10 = r2.A00     // Catch:{ all -> 0x0336 }
            X.QvV r5 = r10.A08     // Catch:{ all -> 0x0336 }
            X.C11381SQt.A02(r5)     // Catch:{ all -> 0x0336 }
            java.lang.String r1 = r5.A0K()     // Catch:{ all -> 0x0336 }
            java.lang.Object r4 = r2.A03     // Catch:{ all -> 0x0336 }
            monitor-enter(r4)     // Catch:{ all -> 0x0336 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x031f }
            if (r0 != 0) goto L_0x0278
            java.lang.String r9 = "gaClientIdData"
            r7 = 0
            android.content.Context r13 = r10.A00     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            java.io.FileInputStream r11 = r13.openFileInput(r9)     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r0 = 128(0x80, float:1.794E-43)
            byte[] r14 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r12 = 0
            int r3 = r11.read(r14, r12, r0)     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            int r0 = r11.available()     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            if (r0 <= 0) goto L_0x025d
            java.lang.String r3 = "Hash file seems corrupted, deleting it."
            r0 = 5
            X.ST5.A0B(r2, r3, r0)     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r13.deleteFile(r9)     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            goto L_0x02ac
        L_0x025d:
            if (r3 > 0) goto L_0x0269
            java.lang.String r3 = "Hash file is empty."
            r0 = 2
            X.ST5.A0B(r2, r3, r0)     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            goto L_0x02ac
        L_0x0269:
            java.lang.String r0 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r0.<init>(r14, r12, r3)     // Catch:{ FileNotFoundException -> 0x02ac, IOException -> 0x0276 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x0271, IOException -> 0x0273 }
        L_0x0271:
            r7 = r0
            goto L_0x02ac
        L_0x0273:
            r3 = move-exception
            r7 = r0
            goto L_0x02a2
        L_0x0276:
            r3 = move-exception
            goto L_0x02a2
        L_0x0278:
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x031f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x031f }
            if (r0 == 0) goto L_0x02b0
            if (r3 == 0) goto L_0x0295
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x031f }
            if (r0 == 0) goto L_0x0295
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = X.Pxh.A0l(r0, r1)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = A01(r0)     // Catch:{ all -> 0x031f }
            r2.A00 = r0     // Catch:{ all -> 0x031f }
            goto L_0x02b0
        L_0x0295:
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = X.Pxh.A0l(r0, r1)     // Catch:{ all -> 0x031f }
            boolean r8 = r2.A02(r0)     // Catch:{ all -> 0x031f }
            goto L_0x031b
        L_0x02a2:
            java.lang.String r0 = "Error reading Hash file, deleting it"
            r2.A0G(r0, r3)     // Catch:{ all -> 0x031f }
            android.content.Context r0 = r10.A00     // Catch:{ all -> 0x031f }
            r0.deleteFile(r9)     // Catch:{ all -> 0x031f }
        L_0x02ac:
            r2.A00 = r7     // Catch:{ all -> 0x031f }
            r2.A01 = r8     // Catch:{ all -> 0x031f }
        L_0x02b0:
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = X.Pxh.A0l(r0, r1)     // Catch:{ all -> 0x031f }
            java.lang.String r7 = A01(r0)     // Catch:{ all -> 0x031f }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x031f }
            if (r0 == 0) goto L_0x02c4
            r8 = 0
            goto L_0x031b
        L_0x02c4:
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x031f }
            boolean r0 = r7.equals(r3)     // Catch:{ all -> 0x031f }
            if (r0 != 0) goto L_0x031b
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x031f }
            if (r0 != 0) goto L_0x030f
            java.lang.String r1 = "Resetting the client id because Advertising Id changed."
            r0 = 2
            X.ST5.A0B(r2, r1, r0)     // Catch:{ all -> 0x031f }
            X.C11381SQt.A02(r5)     // Catch:{ all -> 0x031f }
            monitor-enter(r5)     // Catch:{ all -> 0x031f }
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x0303 }
            X.SFa r3 = X.C11381SQt.A00(r5)     // Catch:{ all -> 0x0303 }
            X.TN7 r1 = new X.TN7     // Catch:{ all -> 0x0303 }
            r1.<init>(r5)     // Catch:{ all -> 0x0303 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0303 }
            boolean r0 = r0 instanceof X.C13229TQv     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02fc
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0303 }
            r0.<init>(r1)     // Catch:{ all -> 0x0303 }
            r0.run()     // Catch:{ all -> 0x0303 }
        L_0x02f8:
            r5.A00 = r0     // Catch:{ all -> 0x0303 }
            monitor-exit(r5)     // Catch:{ all -> 0x0303 }
            goto L_0x0306
        L_0x02fc:
            X.TSq r0 = r3.A02     // Catch:{ all -> 0x0303 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ all -> 0x0303 }
            goto L_0x02f8
        L_0x0303:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0303 }
            throw r0     // Catch:{ all -> 0x031f }
        L_0x0306:
            java.lang.String r1 = r5.A0K()     // Catch:{ all -> 0x031f }
            java.lang.String r0 = "New client Id"
            r2.A0E(r0, r1)     // Catch:{ all -> 0x031f }
        L_0x030f:
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x031f }
            java.lang.String r0 = X.Pxh.A0l(r0, r1)     // Catch:{ all -> 0x031f }
            boolean r8 = r2.A02(r0)     // Catch:{ all -> 0x031f }
        L_0x031b:
            monitor-exit(r4)     // Catch:{ all -> 0x031f }
            if (r8 != 0) goto L_0x0330
            goto L_0x0322
        L_0x031f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x031f }
            throw r0     // Catch:{ all -> 0x0336 }
        L_0x0322:
            java.lang.String r1 = "Failed to reset client id on adid change. Not using adid"
            r0 = 6
            X.ST5.A0B(r2, r1, r0)     // Catch:{ all -> 0x0336 }
            java.lang.String r1 = ""
            r0 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r15 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch:{ all -> 0x0336 }
            r15.<init>(r1, r0)     // Catch:{ all -> 0x0336 }
        L_0x0330:
            r2.A02 = r15     // Catch:{ all -> 0x0336 }
        L_0x0332:
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r2.A02     // Catch:{ all -> 0x0336 }
            monitor-exit(r2)
            return r0
        L_0x0336:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8488Qva.A00(X.Qva):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public static String A01(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, messageDigest.digest(str.getBytes()))});
    }

    public C8488Qva(C11381SQt sQt) {
        super(sQt);
        this.A04 = new C11233SGt(sQt.A04);
    }
}
