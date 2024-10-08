package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.zzq;
import com.google.android.gms.dynamite.zzr;
import com.google.android.gms.internal.common.zza;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.lang.reflect.Field;

public final class SU6 {
    public static int A01 = -1;
    public static zzq A02;
    public static zzr A03;
    public static Boolean A04;
    public static Boolean A05;
    public static String A06;
    public static boolean A07;
    public static final C13638Te5 A08 = new Object();
    public static final C13638Te5 A09 = new Object();
    public static final C13638Te5 A0A = new Object();
    public static final ThreadLocal A0B = new ThreadLocal();
    public static final C13741TgD A0C = new Object();
    public static final ThreadLocal A0D = new ThreadLocal();
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ba, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bb, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d0, code lost:
        throw new java.lang.Exception(X.002.A0R("V2 version check failed: ", r2.getMessage()), r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c0 A[Catch:{ all -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c1 A[Catch:{ all -> 0x00d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r8 = 0
            android.content.ContentResolver r6 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.ThreadLocal r0 = A0D     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            long r4 = r0.longValue()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r0 = "api"
            r1 = 1
            if (r1 == r12) goto L_0x0019
            r3 = r0
        L_0x0019:
            android.net.Uri$Builder r2 = X.Pxe.A0I()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r0)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            android.net.Uri$Builder r3 = r0.appendPath(r11)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r2 = "requestStartTime"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            android.net.Uri r7 = X.DbV.A08(r3, r2, r0)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r12 = -420642211(0xffffffffe6ed825d, float:-5.608028E23)
            r9 = r8
            r10 = r8
            r11 = r8
            android.database.Cursor r3 = X.0fM.A01(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            if (r3 == 0) goto L_0x00a7
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x00b6 }
            if (r0 == 0) goto L_0x00a7
            r4 = 0
            int r5 = r3.getInt(r4)     // Catch:{ Exception -> 0x00b6 }
            if (r5 <= 0) goto L_0x0095
            java.lang.Class<X.SU6> r2 = X.SU6.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00b6 }
            r0 = 2
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0091 }
            A06 = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "loaderVersion"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0091 }
            if (r0 < 0) goto L_0x006d
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0091 }
            A01 = r0     // Catch:{ all -> 0x0091 }
        L_0x006d:
            java.lang.String r0 = "disableStandaloneDynamiteLoader2"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0091 }
            if (r0 < 0) goto L_0x007f
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x007c
            r1 = 0
        L_0x007c:
            A07 = r1     // Catch:{ all -> 0x0091 }
            r4 = r1
        L_0x007f:
            monitor-exit(r2)     // Catch:{ all -> 0x0091 }
            java.lang.ThreadLocal r0 = A0B     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00b6 }
            X.RpT r1 = (X.C10269RpT) r1     // Catch:{ Exception -> 0x00b6 }
            if (r1 == 0) goto L_0x0095
            android.database.Cursor r0 = r1.A00     // Catch:{ Exception -> 0x00b6 }
            if (r0 != 0) goto L_0x0095
            r1.A00 = r3     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0094
        L_0x0091:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0091 }
            goto L_0x00b5
        L_0x0094:
            r3 = r8
        L_0x0095:
            if (r13 == 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a1
            java.lang.String r0 = "forcing fallback to container DynamiteLoader impl"
            X.RJj r1 = new X.RJj     // Catch:{ Exception -> 0x00b6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b5
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()
        L_0x00a6:
            return r5
        L_0x00a7:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = "Failed to connect to dynamite module ContentResolver."
            X.RJj r1 = new X.RJj     // Catch:{ Exception -> 0x00b6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
        L_0x00b5:
            throw r1     // Catch:{ Exception -> 0x00b6 }
        L_0x00b6:
            r2 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            throw r0
        L_0x00ba:
            r2 = move-exception
            r3 = r8
        L_0x00bc:
            boolean r0 = r2 instanceof X.C8968RJj     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00c1
            throw r2     // Catch:{ all -> 0x00d1 }
        L_0x00c1:
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "V2 version check failed: "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x00d1 }
            X.RJj r0 = new X.RJj     // Catch:{ all -> 0x00d1 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d7
            r3.close()
        L_0x00d7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU6.A02(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [com.google.android.gms.internal.common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(java.lang.ClassLoader r4) {
        /*
            r3 = 0
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r0 = r4.loadClass(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            java.lang.Object r2 = X.Pxh.A0e(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            if (r2 == 0) goto L_0x001b
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r3 = r2.queryLocalInterface(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            boolean r0 = r3 instanceof com.google.android.gms.dynamite.zzr     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.dynamite.zzr r3 = (com.google.android.gms.dynamite.zzr) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
        L_0x001b:
            A03 = r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            goto L_0x0031
        L_0x001e:
            com.google.android.gms.dynamite.zzr r3 = new com.google.android.gms.dynamite.zzr     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            r3.<init>(r1, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            r0 = 1079691494(0x405ac8e6, float:3.4185119)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            r0 = 371984954(0x162c0a3a, float:1.3897276E-25)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            goto L_0x001b
        L_0x0031:
            return
        L_0x0032:
            r2 = move-exception
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            X.RJj r0 = new X.RJj
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU6.A06(java.lang.ClassLoader):void");
    }

    public static int A00(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(002.A0g("com.google.android.gms.dynamite.descriptors.", str, ".ModuleDescriptor"));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (SA1.A01(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            Log.e("DynamiteModule", 002.A11("Module descriptor id '", String.valueOf(declaredField.get((Object) null)), "' didn't match expected id '", str, "'"));
            return 0;
        } catch (ClassNotFoundException unused) {
            Pxf.A1L("Local module descriptor class for ", str, " not found.", "DynamiteModule");
            return 0;
        } catch (Exception e) {
            Pxh.A1L("Failed to load module descriptor class: ", String.valueOf(e.getMessage()), "DynamiteModule");
            return 0;
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
    public static int A01(android.content.Context r20, java.lang.String r21, boolean r22) {
        /*
            r4 = r20
            java.lang.Class<X.SU6> r20 = X.SU6.class
            monitor-enter(r20)     // Catch:{ all -> 0x02a0 }
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x0299 }
            r3 = 0
            r5 = 0
            r8 = r21
            r7 = r22
            if (r0 != 0) goto L_0x0176
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            java.lang.Class r1 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            java.lang.Class r19 = r2.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            monitor-enter(r19)     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
            java.lang.Object r1 = r2.get(r3)     // Catch:{ all -> 0x015f }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x015f }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015f }
            if (r1 != r0) goto L_0x003e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015f }
        L_0x003b:
            monitor-exit(r19)     // Catch:{ all -> 0x015f }
            goto L_0x0174
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            A06(r1)     // Catch:{ RJj -> 0x0043 }
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x015f }
            goto L_0x003b
        L_0x0046:
            boolean r0 = A07(r4)     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x004f
            monitor-exit(r19)     // Catch:{ all -> 0x015f }
            goto L_0x0158
        L_0x004f:
            boolean r0 = A07     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x014d
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x015f }
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x014d
            r0 = 1
            int r18 = A02(r4, r8, r7, r0)     // Catch:{ RJj -> 0x0142 }
            java.lang.String r0 = A06     // Catch:{ RJj -> 0x0142 }
            if (r0 == 0) goto L_0x015c
            boolean r0 = r0.isEmpty()     // Catch:{ RJj -> 0x0142 }
            if (r0 != 0) goto L_0x015c
            java.lang.Class<X.RQ8> r17 = X.RQ8.class
            monitor-enter(r17)     // Catch:{ RJj -> 0x0142 }
            java.lang.ClassLoader r10 = X.RQ8.A00     // Catch:{ all -> 0x013f }
            if (r10 != 0) goto L_0x0110
            java.lang.Thread r11 = X.RQ8.A01     // Catch:{ all -> 0x013f }
            r10 = 0
            if (r11 != 0) goto L_0x00f5
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x013f }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x013f }
            java.lang.ThreadGroup r11 = r0.getThreadGroup()     // Catch:{ all -> 0x013f }
            if (r11 != 0) goto L_0x0086
            r11 = r3
            goto L_0x00ed
        L_0x0086:
            java.lang.Class<java.lang.Void> r16 = java.lang.Void.class
            monitor-enter(r16)     // Catch:{ all -> 0x013f }
            int r13 = r11.activeGroupCount()     // Catch:{ SecurityException -> 0x00df }
            java.lang.ThreadGroup[] r6 = new java.lang.ThreadGroup[r13]     // Catch:{ SecurityException -> 0x00df }
            r11.enumerate(r6)     // Catch:{ SecurityException -> 0x00df }
            r14 = 0
            r1 = 0
        L_0x0094:
            if (r1 >= r13) goto L_0x00a7
            r12 = r6[r1]     // Catch:{ SecurityException -> 0x00df }
            java.lang.String r15 = "dynamiteLoader"
            java.lang.String r0 = r12.getName()     // Catch:{ SecurityException -> 0x00df }
            boolean r0 = r15.equals(r0)     // Catch:{ SecurityException -> 0x00df }
            if (r0 != 0) goto L_0x00ae
            int r1 = r1 + 1
            goto L_0x0094
        L_0x00a7:
            java.lang.String r0 = "dynamiteLoader"
            java.lang.ThreadGroup r12 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x00df }
            r12.<init>(r11, r0)     // Catch:{ SecurityException -> 0x00df }
        L_0x00ae:
            int r13 = r12.activeCount()     // Catch:{ SecurityException -> 0x00df }
            java.lang.Thread[] r6 = new java.lang.Thread[r13]     // Catch:{ SecurityException -> 0x00df }
            r12.enumerate(r6)     // Catch:{ SecurityException -> 0x00df }
        L_0x00b7:
            if (r14 >= r13) goto L_0x00ca
            r11 = r6[r14]     // Catch:{ SecurityException -> 0x00df }
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r11.getName()     // Catch:{ SecurityException -> 0x00df }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00df }
            if (r0 != 0) goto L_0x00ec
            int r14 = r14 + 1
            goto L_0x00b7
        L_0x00ca:
            r11 = r3
            java.lang.String r0 = "GmsDynamite"
            X.TQw r1 = new X.TQw     // Catch:{ SecurityException -> 0x00dd }
            r1.<init>(r12, r0)     // Catch:{ SecurityException -> 0x00dd }
            r1.setContextClassLoader(r3)     // Catch:{ SecurityException -> 0x00da }
            r1.start()     // Catch:{ SecurityException -> 0x00da }
            r11 = r1
            goto L_0x00ec
        L_0x00da:
            r0 = move-exception
            r11 = r1
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e1
        L_0x00df:
            r0 = move-exception
            r11 = r3
        L_0x00e1:
            java.lang.String r6 = "DynamiteLoaderV2CL"
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "Failed to enumerate thread/threadgroup "
            X.Pxh.A1K(r0, r1, r6)     // Catch:{ all -> 0x00f2 }
        L_0x00ec:
            monitor-exit(r16)     // Catch:{ all -> 0x00f2 }
        L_0x00ed:
            X.RQ8.A01 = r11     // Catch:{ all -> 0x013f }
            if (r11 != 0) goto L_0x00f5
            goto L_0x010a
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x00f2 }
            goto L_0x010f
        L_0x00f5:
            monitor-enter(r11)     // Catch:{ all -> 0x013f }
            java.lang.Thread r0 = X.RQ8.A01     // Catch:{ SecurityException -> 0x00fd }
            java.lang.ClassLoader r10 = r0.getContextClassLoader()     // Catch:{ SecurityException -> 0x00fd }
            goto L_0x0109
        L_0x00fd:
            r0 = move-exception
            java.lang.String r6 = "DynamiteLoaderV2CL"
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Failed to get thread context classloader "
            X.Pxh.A1K(r0, r1, r6)     // Catch:{ all -> 0x010d }
        L_0x0109:
            monitor-exit(r11)     // Catch:{ all -> 0x010d }
        L_0x010a:
            X.RQ8.A00 = r10     // Catch:{ all -> 0x013f }
            goto L_0x0110
        L_0x010d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x010d }
        L_0x010f:
            throw r0     // Catch:{ all -> 0x013f }
        L_0x0110:
            monitor-exit(r17)     // Catch:{ RJj -> 0x0142 }
            if (r10 != 0) goto L_0x0127
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ RJj -> 0x0142 }
            r0 = 29
            if (r1 < r0) goto L_0x0130
            java.lang.String r1 = A06     // Catch:{ RJj -> 0x0142 }
            X.AnonymousClass3Qk.A02(r1)     // Catch:{ RJj -> 0x0142 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ RJj -> 0x0142 }
            dalvik.system.DelegateLastClassLoader r10 = new dalvik.system.DelegateLastClassLoader     // Catch:{ RJj -> 0x0142 }
            r10.<init>(r1, r0)     // Catch:{ RJj -> 0x0142 }
        L_0x0127:
            A06(r10)     // Catch:{ RJj -> 0x0142 }
            r2.set(r3, r10)     // Catch:{ RJj -> 0x0142 }
            A04 = r9     // Catch:{ RJj -> 0x0142 }
            goto L_0x015a
        L_0x0130:
            java.lang.String r1 = A06     // Catch:{ RJj -> 0x0142 }
            X.AnonymousClass3Qk.A02(r1)     // Catch:{ RJj -> 0x0142 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ RJj -> 0x0142 }
            X.RBz r10 = new X.RBz     // Catch:{ RJj -> 0x0142 }
            r10.<init>(r1, r0)     // Catch:{ RJj -> 0x0142 }
            goto L_0x0127
        L_0x013f:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ RJj -> 0x0142 }
            throw r0     // Catch:{ RJj -> 0x0142 }
        L_0x0142:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015f }
            r2.set(r3, r0)     // Catch:{ all -> 0x015f }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015f }
            goto L_0x003b
        L_0x014d:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015f }
            r2.set(r3, r0)     // Catch:{ all -> 0x015f }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015f }
            goto L_0x003b
        L_0x0158:
            monitor-exit(r20)     // Catch:{ all -> 0x0299 }
            return r5
        L_0x015a:
            monitor-exit(r19)     // Catch:{ all -> 0x015f }
            goto L_0x015d
        L_0x015c:
            monitor-exit(r19)     // Catch:{ all -> 0x015f }
        L_0x015d:
            monitor-exit(r20)     // Catch:{ all -> 0x0299 }
            return r18
        L_0x015f:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x015f }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0166, IllegalAccessException -> 0x0164, NoSuchFieldException -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            goto L_0x0167
        L_0x0164:
            r0 = move-exception
            goto L_0x0167
        L_0x0166:
            r0 = move-exception
        L_0x0167:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Failed to load module via V2: "
            X.Pxh.A1K(r0, r1, r2)     // Catch:{ all -> 0x0299 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0299 }
        L_0x0174:
            A04 = r0     // Catch:{ all -> 0x0299 }
        L_0x0176:
            monitor-exit(r20)     // Catch:{ all -> 0x0299 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x018f
            int r5 = A02(r4, r8, r7, r5)     // Catch:{ RJj -> 0x0182 }
            return r5
        L_0x0182:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            X.Pxh.A1K(r0, r1, r2)     // Catch:{ all -> 0x02a0 }
            return r5
        L_0x018f:
            com.google.android.gms.dynamite.zzq r6 = A05(r4)     // Catch:{ all -> 0x02a0 }
            if (r6 == 0) goto L_0x0298
            r0 = 1694687017(0x6502df29, float:3.8626514E22)
            int r2 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x0282 }
            android.os.Parcel r1 = r6.A01()     // Catch:{ RemoteException -> 0x0282 }
            r0 = 6
            android.os.Parcel r0 = r6.A02(r1, r0)     // Catch:{ RemoteException -> 0x0282 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0282 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0282 }
            r0 = 2088150223(0x7c76a4cf, float:5.122591E36)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ RemoteException -> 0x0282 }
            r9 = 3
            if (r1 < r9) goto L_0x022c
            java.lang.ThreadLocal r11 = A0B     // Catch:{ RemoteException -> 0x0282 }
            java.lang.Object r0 = r11.get()     // Catch:{ RemoteException -> 0x0282 }
            X.RpT r0 = (X.C10269RpT) r0     // Catch:{ RemoteException -> 0x0282 }
            if (r0 == 0) goto L_0x01c8
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x0282 }
            if (r0 == 0) goto L_0x01c8
            int r5 = r0.getInt(r5)     // Catch:{ RemoteException -> 0x0282 }
            return r5
        L_0x01c8:
            com.google.android.gms.dynamic.ObjectWrapper r10 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x0282 }
            r10.<init>(r4)     // Catch:{ RemoteException -> 0x0282 }
            java.lang.ThreadLocal r0 = A0D     // Catch:{ RemoteException -> 0x0282 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0282 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0282 }
            long r0 = r0.longValue()     // Catch:{ RemoteException -> 0x0282 }
            r2 = 1043620808(0x3e3463c8, float:0.17616189)
            int r9 = X.AnonymousClass0fD.A03(r2)     // Catch:{ RemoteException -> 0x0282 }
            android.os.Parcel r2 = A03(r10, r6, r8, r7)     // Catch:{ RemoteException -> 0x0282 }
            r2.writeLong(r0)     // Catch:{ RemoteException -> 0x0282 }
            r0 = 7
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.internal.common.zza.A00(r2, r6, r0)     // Catch:{ RemoteException -> 0x0282 }
            r0 = 1079189304(0x40531f38, float:3.2987804)
            X.AnonymousClass0fD.A0A(r0, r9)     // Catch:{ RemoteException -> 0x0282 }
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.A00(r1)     // Catch:{ RemoteException -> 0x0282 }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ RemoteException -> 0x0282 }
            if (r6 == 0) goto L_0x0219
            boolean r0 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            if (r0 == 0) goto L_0x0219
            int r2 = r6.getInt(r5)     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            if (r2 <= 0) goto L_0x0215
            java.lang.Object r1 = r11.get()     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            X.RpT r1 = (X.C10269RpT) r1     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            if (r1 == 0) goto L_0x0215
            android.database.Cursor r0 = r1.A00     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            if (r0 != 0) goto L_0x0215
            r1.A00 = r6     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            return r2
        L_0x0215:
            r6.close()     // Catch:{ all -> 0x02a0 }
            return r2
        L_0x0219:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0229, all -> 0x0226 }
            if (r6 == 0) goto L_0x0298
            r6.close()     // Catch:{ all -> 0x02a0 }
            return r5
        L_0x0226:
            r0 = move-exception
            r3 = r6
            goto L_0x0295
        L_0x0229:
            r0 = move-exception
            r3 = r6
            goto L_0x0283
        L_0x022c:
            r0 = 2
            if (r1 != r0) goto L_0x0259
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0282 }
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x0282 }
            r1.<init>(r4)     // Catch:{ RemoteException -> 0x0282 }
            r0 = 16985275(0x1032cbb, float:2.4092993E-38)
            int r2 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x0282 }
            android.os.Parcel r1 = A03(r1, r6, r8, r7)     // Catch:{ RemoteException -> 0x0282 }
            r0 = 5
            android.os.Parcel r0 = r6.A02(r1, r0)     // Catch:{ RemoteException -> 0x0282 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0282 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0282 }
            r0 = 1484332854(0x58791f36, float:1.09564978E15)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ RemoteException -> 0x0282 }
            return r1
        L_0x0259:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0282 }
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x0282 }
            r1.<init>(r4)     // Catch:{ RemoteException -> 0x0282 }
            r0 = 650815244(0x26caa70c, float:1.4061844E-15)
            int r2 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x0282 }
            android.os.Parcel r0 = A03(r1, r6, r8, r7)     // Catch:{ RemoteException -> 0x0282 }
            android.os.Parcel r0 = r6.A02(r0, r9)     // Catch:{ RemoteException -> 0x0282 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0282 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0282 }
            r0 = -348064118(0xffffffffeb40f68a, float:-2.33278E26)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ RemoteException -> 0x0282 }
            return r1
        L_0x0282:
            r0 = move-exception
        L_0x0283:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            X.Pxh.A1K(r0, r1, r2)     // Catch:{ all -> 0x0294 }
            if (r3 == 0) goto L_0x0298
            r3.close()     // Catch:{ all -> 0x02a0 }
            return r5
        L_0x0294:
            r0 = move-exception
        L_0x0295:
            if (r3 == 0) goto L_0x029f
            goto L_0x029c
        L_0x0298:
            return r5
        L_0x0299:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0299 }
            goto L_0x029f
        L_0x029c:
            r3.close()     // Catch:{ all -> 0x02a0 }
        L_0x029f:
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            r3 = move-exception
            X.AnonymousClass3Qk.A02(r4)     // Catch:{ Exception -> 0x02a5 }
            throw r3
        L_0x02a5:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU6.A01(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.RpT] */
    public static SU6 A04(Context context, C13638Te5 te5, String str) {
        Exception exc;
        SU6 su6;
        int i;
        Exception exc2;
        Boolean bool;
        int i2;
        IObjectWrapper iObjectWrapper;
        int i3;
        zzr zzr;
        Boolean valueOf;
        int A032;
        IObjectWrapper A002;
        int i4;
        Class<SU6> cls = SU6.class;
        Context context2 = context;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = A0B;
            Object obj = threadLocal.get();
            ? obj2 = new Object();
            threadLocal.set(obj2);
            ThreadLocal threadLocal2 = A0D;
            Number number = (Number) threadLocal2.get();
            long longValue = number.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                C13638Te5 te52 = te5;
                String str2 = str;
                C10603Rux EL9 = te52.EL9(context2, A0C, str2);
                int i5 = EL9.A00;
                int i6 = EL9.A01;
                int i7 = EL9.A02;
                if (i7 != 0) {
                    if (i7 == -1) {
                        if (i5 != 0) {
                            String.valueOf(str2);
                            su6 = new SU6(applicationContext);
                        }
                    } else if (i6 != 0) {
                        try {
                            synchronized (cls) {
                                try {
                                    if (A07(context2)) {
                                        bool = A04;
                                    } else {
                                        throw new Exception("Remote loading disabled");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            if (bool == null) {
                                th = new Exception("Failed to determine which loading route to use.");
                            } else if (bool.booleanValue()) {
                                synchronized (cls) {
                                    try {
                                        zzr = A03;
                                    } catch (Throwable th2) {
                                        while (true) {
                                            th = th2;
                                            break;
                                        }
                                    }
                                }
                                if (zzr != null) {
                                    C10269RpT rpT = (C10269RpT) threadLocal.get();
                                    if (rpT == null || rpT.A00 == null) {
                                        th = new Exception("No result cursor");
                                    } else {
                                        Context applicationContext2 = context2.getApplicationContext();
                                        Cursor cursor = rpT.A00;
                                        new ObjectWrapper((Object) null);
                                        synchronized (cls) {
                                            try {
                                                valueOf = Boolean.valueOf(JTQ.A1P(A01, 2));
                                            } catch (Throwable th3) {
                                                while (true) {
                                                    th = th3;
                                                    break;
                                                }
                                            }
                                        }
                                        if (valueOf.booleanValue()) {
                                            ObjectWrapper objectWrapper = new ObjectWrapper(applicationContext2);
                                            ObjectWrapper objectWrapper2 = new ObjectWrapper(cursor);
                                            A032 = AnonymousClass0fD.A03(1813132671);
                                            Parcel A033 = A03(objectWrapper, zzr, str2, i6);
                                            Pxf.A16(objectWrapper2, A033);
                                            A002 = zza.A00(A033, zzr, 3);
                                            i4 = 623525203;
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            ObjectWrapper objectWrapper3 = new ObjectWrapper(applicationContext2);
                                            ObjectWrapper objectWrapper4 = new ObjectWrapper(cursor);
                                            A032 = AnonymousClass0fD.A03(883784836);
                                            Parcel A034 = A03(objectWrapper3, zzr, str2, i6);
                                            Pxf.A16(objectWrapper4, A034);
                                            A002 = zza.A00(A034, zzr, 2);
                                            i4 = 918806785;
                                        }
                                        AnonymousClass0fD.A0A(i4, A032);
                                        Context context3 = (Context) ObjectWrapper.A00(A002);
                                        if (context3 != null) {
                                            su6 = new SU6(context3);
                                        } else {
                                            th = new Exception("Failed to get module context");
                                        }
                                    }
                                } else {
                                    th = new Exception("DynamiteLoaderV2 was not cached.");
                                }
                            } else {
                                zzq A052 = A05(context2);
                                if (A052 != null) {
                                    int A035 = AnonymousClass0fD.A03(1694687017);
                                    Parcel A022 = A052.A02(A052.A01(), 6);
                                    int readInt = A022.readInt();
                                    A022.recycle();
                                    AnonymousClass0fD.A0A(2088150223, A035);
                                    if (readInt >= 3) {
                                        C10269RpT rpT2 = (C10269RpT) threadLocal.get();
                                        if (rpT2 != null) {
                                            ObjectWrapper objectWrapper5 = new ObjectWrapper(context2);
                                            ObjectWrapper objectWrapper6 = new ObjectWrapper(rpT2.A00);
                                            i2 = AnonymousClass0fD.A03(-676781313);
                                            Parcel A036 = A03(objectWrapper5, A052, str2, i6);
                                            Pxf.A16(objectWrapper6, A036);
                                            iObjectWrapper = zza.A00(A036, A052, 8);
                                            i3 = 898162345;
                                        } else {
                                            th = new Exception("No cached result cursor holder");
                                        }
                                    } else if (readInt == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        ObjectWrapper objectWrapper7 = new ObjectWrapper(context2);
                                        i2 = AnonymousClass0fD.A03(-844493346);
                                        iObjectWrapper = zza.A00(A03(objectWrapper7, A052, str2, i6), A052, 4);
                                        i3 = 96415761;
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        ObjectWrapper objectWrapper8 = new ObjectWrapper(context2);
                                        i2 = AnonymousClass0fD.A03(-827572926);
                                        iObjectWrapper = zza.A00(A03(objectWrapper8, A052, str2, i6), A052, 2);
                                        i3 = 1272737331;
                                    }
                                    AnonymousClass0fD.A0A(i3, i2);
                                    Object A003 = ObjectWrapper.A00(iObjectWrapper);
                                    if (A003 != null) {
                                        su6 = new SU6((Context) A003);
                                    } else {
                                        th = new Exception("Failed to load remote module.");
                                    }
                                } else {
                                    th = new Exception("Failed to create IDynamiteLoader.");
                                }
                            }
                            throw th;
                        } catch (RemoteException e) {
                            exc2 = new Exception("Failed to load remote module.", e);
                        } catch (C8968RJj e2) {
                            throw e2;
                        } catch (C8968RJj e3) {
                            Pxh.A1K("Failed to load remote module: ", e3.getMessage(), "DynamiteModule");
                            int i8 = EL9.A00;
                            if (i8 != 0) {
                                if (te52.EL9(context2, new C12564Sxp(i8), str2).A02 == -1) {
                                    String.valueOf(str2);
                                    su6 = new SU6(applicationContext);
                                }
                            }
                            exc = new Exception("Remote load failed. No local fallback found.", e3);
                        } catch (Throwable th4) {
                            exc2 = new Exception("Failed to load remote module.", th4);
                        }
                    }
                    if (i != 0) {
                        threadLocal2.set(number);
                    }
                    return su6;
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("No acceptable module ");
                A1A.append(str2);
                A1A.append(" found. Local version is ");
                A1A.append(i5);
                A1A.append(" and remote version is ");
                A1A.append(i6);
                exc = new Exception(AnonymousClass7TF.A0l(".", A1A));
                throw exc;
            } finally {
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(number);
                }
                Cursor cursor2 = obj2.A00;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(obj);
            }
        } else {
            throw new Exception("null application Context");
        }
        throw exc2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.gms.internal.common.zza} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.gms.dynamite.zzq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.android.gms.dynamite.zzq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.gms.dynamite.zzq} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != null) goto L_0x002f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.zzq A05(android.content.Context r6) {
        /*
            java.lang.Class<X.SU6> r5 = X.SU6.class
            monitor-enter(r5)
            com.google.android.gms.dynamite.zzq r4 = A02     // Catch:{ all -> 0x0059 }
            if (r4 != 0) goto L_0x0057
            r4 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r6.createPackageContext(r1, r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ Exception -> 0x0047 }
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.Object r3 = r0.newInstance()     // Catch:{ Exception -> 0x0047 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ Exception -> 0x0047 }
            if (r3 == 0) goto L_0x0057
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)     // Catch:{ Exception -> 0x0047 }
            boolean r0 = r2 instanceof com.google.android.gms.dynamite.zzq     // Catch:{ Exception -> 0x0047 }
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.dynamite.zzq r2 = (com.google.android.gms.dynamite.zzq) r2     // Catch:{ Exception -> 0x0047 }
            if (r2 == 0) goto L_0x0057
        L_0x002f:
            A02 = r2     // Catch:{ Exception -> 0x0047 }
            goto L_0x0045
        L_0x0032:
            com.google.android.gms.dynamite.zzq r2 = new com.google.android.gms.dynamite.zzq     // Catch:{ Exception -> 0x0047 }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0047 }
            r0 = 52582149(0x3225705, float:4.7707415E-37)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ Exception -> 0x0047 }
            r0 = -1627239747(0xffffffff9f024abd, float:-2.7590393E-20)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x002f
        L_0x0045:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            return r2
        L_0x0047:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x0059 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            return r4
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU6.A05(android.content.Context):com.google.android.gms.dynamite.zzq");
    }

    public static boolean A07(Context context) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals((Object) null)) {
            Boolean bool2 = A05;
            if (!bool.equals(bool2)) {
                boolean z = false;
                if (bool2 == null) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                    if (GoogleApiAvailabilityLight.A00.A03(context, MemoryUtil.MAX_ALLOC_SIZE) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    A05 = valueOf;
                    z = valueOf.booleanValue();
                    if (z) {
                        ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                        if (applicationInfo != null && (applicationInfo.flags & 129) == 0) {
                            A07 = true;
                        }
                        return z;
                    }
                }
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                return z;
            }
        }
        return true;
    }

    public final IBinder A08(String str) {
        try {
            return (IBinder) this.A00.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new Exception("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }

    public SU6(Context context) {
        AnonymousClass3Qk.A02(context);
        this.A00 = context;
    }

    public static Parcel A03(IInterface iInterface, zza zza, String str, int i) {
        Parcel A012 = zza.A01();
        A012.writeStrongBinder(iInterface.asBinder());
        A012.writeString(str);
        A012.writeInt(i);
        return A012;
    }
}
