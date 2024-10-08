package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.List;
import java.util.Map;

public final class SUv implements ComponentCallbacks2 {
    public static volatile SUv A09;
    public static volatile boolean A0A;
    public final Q6I A00;
    public final C13813Thg A01;
    public final ST0 A02;
    public final QHU A03;
    public final C9213RTq A04;
    public final C11458SVw A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final C10166Rnh A07;
    public final SOI A08;

    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: X.Siq} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.QHU, X.S6p] */
    /* JADX WARNING: type inference failed for: r1v27, types: [X.Thg] */
    /* JADX WARNING: type inference failed for: r1v29, types: [X.RTq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.SUv A00(android.content.Context r22) {
        /*
            X.SUv r0 = A09
            if (r0 != 0) goto L_0x0270
            android.content.Context r2 = r22.getApplicationContext()
            java.lang.String r0 = "com.bumptech.glide.GeneratedAppGlideModuleImpl"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x002c, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException -> 0x002c, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x002c, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x002c, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ ClassNotFoundException -> 0x002c, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x002c, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            goto L_0x003a
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)
            throw r0
        L_0x002c:
            r0 = 5
            java.lang.String r1 = "Glide"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"
            android.util.Log.w(r1, r0)
        L_0x003a:
            java.lang.Class<X.SUv> r9 = X.SUv.class
            monitor-enter(r9)
            X.SUv r0 = A09     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x025f
            boolean r0 = A0A     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x0182
            r15 = 1
            A0A = r15     // Catch:{ all -> 0x026d }
            X.Rz6 r0 = new X.Rz6     // Catch:{ all -> 0x026d }
            r0.<init>()     // Catch:{ all -> 0x026d }
            android.content.Context r11 = r22.getApplicationContext()     // Catch:{ all -> 0x026d }
            java.lang.String r7 = "ManifestParser"
            r6 = 3
            android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x026d }
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x026d }
            android.content.pm.ApplicationInfo r5 = X.Pxj.A0G(r11)     // Catch:{ NameNotFoundException -> 0x0189 }
            android.os.Bundle r1 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0189 }
            if (r1 != 0) goto L_0x0067
            android.util.Log.isLoggable(r7, r6)     // Catch:{ NameNotFoundException -> 0x0189 }
            goto L_0x00c5
        L_0x0067:
            r1 = 2
            android.util.Log.isLoggable(r7, r1)     // Catch:{ NameNotFoundException -> 0x0189 }
            android.os.Bundle r1 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0189 }
            java.util.Iterator r4 = X.Pxf.A0t(r1)     // Catch:{ NameNotFoundException -> 0x0189 }
        L_0x0071:
            boolean r1 = r4.hasNext()     // Catch:{ NameNotFoundException -> 0x0189 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)     // Catch:{ NameNotFoundException -> 0x0189 }
            java.lang.String r2 = "GlideModule"
            android.os.Bundle r1 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0189 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ NameNotFoundException -> 0x0189 }
            boolean r1 = r2.equals(r1)     // Catch:{ NameNotFoundException -> 0x0189 }
            if (r1 == 0) goto L_0x0071
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00ab }
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x009b }
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x009b }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x009b }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x009b }
            goto L_0x00b3
        L_0x009b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NameNotFoundException -> 0x0189 }
            java.lang.String r0 = "Unable to instantiate GlideModule implementation for "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)     // Catch:{ NameNotFoundException -> 0x0189 }
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r2)     // Catch:{ NameNotFoundException -> 0x0189 }
            goto L_0x00c1
        L_0x00ab:
            r1 = move-exception
            java.lang.String r0 = "Unable to find GlideModule implementation"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ NameNotFoundException -> 0x0189 }
            goto L_0x00c1
        L_0x00b3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NameNotFoundException -> 0x0189 }
            java.lang.String r0 = "Expected instanceof GlideModule, but found: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ NameNotFoundException -> 0x0189 }
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ NameNotFoundException -> 0x0189 }
        L_0x00c1:
            throw r0     // Catch:{ NameNotFoundException -> 0x0189 }
        L_0x00c2:
            android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x026d }
        L_0x00c5:
            java.lang.String r1 = "Glide"
            boolean r1 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x00e2
            java.util.Iterator r2 = r21.iterator()     // Catch:{ all -> 0x026d }
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x00e2
            r2.next()     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "getClass"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x026d }
            goto L_0x0190
        L_0x00e2:
            java.util.Iterator r2 = r21.iterator()     // Catch:{ all -> 0x026d }
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x00f7
            r2.next()     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "applyOptions"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x026d }
            goto L_0x0190
        L_0x00f7:
            X.TO7 r1 = r0.A09     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0122
            X.TOE r5 = new X.TOE     // Catch:{ all -> 0x026d }
            r5.<init>()     // Catch:{ all -> 0x026d }
            X.Tj1 r3 = X.C13880Tj1.A00     // Catch:{ all -> 0x026d }
            int r1 = X.TO7.A02     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0115
            r2 = 4
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x026d }
            int r1 = r1.availableProcessors()     // Catch:{ all -> 0x026d }
            int r1 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x026d }
            X.TO7.A02 = r1     // Catch:{ all -> 0x026d }
        L_0x0115:
            int r6 = X.TO7.A02     // Catch:{ all -> 0x026d }
            java.lang.String r4 = "source"
            r8 = 0
            r7 = r6
            X.TO7 r1 = X.C9209RTm.A00(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x026d }
            r0.A09 = r1     // Catch:{ all -> 0x026d }
        L_0x0122:
            X.TO7 r1 = r0.A08     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0139
            X.TOE r14 = new X.TOE     // Catch:{ all -> 0x026d }
            r14.<init>()     // Catch:{ all -> 0x026d }
            X.Tj1 r12 = X.C13880Tj1.A00     // Catch:{ all -> 0x026d }
            java.lang.String r13 = "disk-cache"
            r16 = r15
            r17 = r15
            X.TO7 r1 = X.C9209RTm.A00(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x026d }
            r0.A08 = r1     // Catch:{ all -> 0x026d }
        L_0x0139:
            X.TO7 r1 = r0.A07     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0168
            int r1 = X.TO7.A02     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0150
            r2 = 4
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x026d }
            int r1 = r1.availableProcessors()     // Catch:{ all -> 0x026d }
            int r1 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x026d }
            X.TO7.A02 = r1     // Catch:{ all -> 0x026d }
        L_0x0150:
            int r2 = X.TO7.A02     // Catch:{ all -> 0x026d }
            r1 = 4
            r4 = 1
            if (r2 < r1) goto L_0x0157
            r4 = 2
        L_0x0157:
            X.TOE r3 = new X.TOE     // Catch:{ all -> 0x026d }
            r3.<init>()     // Catch:{ all -> 0x026d }
            X.Tj1 r1 = X.C13880Tj1.A00     // Catch:{ all -> 0x026d }
            java.lang.String r2 = "animation"
            r5 = r4
            r6 = r15
            X.TO7 r1 = X.C9209RTm.A00(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x026d }
            r0.A07 = r1     // Catch:{ all -> 0x026d }
        L_0x0168:
            X.Rvt r5 = r0.A06     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x0198
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r11.getSystemService(r1)     // Catch:{ all -> 0x026d }
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch:{ all -> 0x026d }
            android.util.DisplayMetrics r2 = X.AnonymousClass7TF.A0E(r11)     // Catch:{ all -> 0x026d }
            boolean r1 = r3.isLowRamDevice()     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x0191
            r4 = 0
            goto L_0x0191
        L_0x0182:
            java.lang.String r0 = "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x026d }
            goto L_0x0190
        L_0x0189:
            r1 = move-exception
            java.lang.String r0 = "Unable to find metadata to parse GlideModules"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)     // Catch:{ all -> 0x026d }
        L_0x0190:
            throw r0     // Catch:{ all -> 0x026d }
        L_0x0191:
            X.Rvt r5 = new X.Rvt     // Catch:{ all -> 0x026d }
            r5.<init>(r3, r11, r2, r4)     // Catch:{ all -> 0x026d }
            r0.A06 = r5     // Catch:{ all -> 0x026d }
        L_0x0198:
            X.RTq r1 = r0.A0A     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x01a3
            X.RTq r1 = new X.RTq     // Catch:{ all -> 0x026d }
            r1.<init>()     // Catch:{ all -> 0x026d }
            r0.A0A = r1     // Catch:{ all -> 0x026d }
        L_0x01a3:
            X.Thg r1 = r0.A02     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x01b3
            int r1 = r5.A01     // Catch:{ all -> 0x026d }
            if (r1 <= 0) goto L_0x0266
            long r2 = (long) r1     // Catch:{ all -> 0x026d }
            X.Siq r1 = new X.Siq     // Catch:{ all -> 0x026d }
            r1.<init>(r2)     // Catch:{ all -> 0x026d }
        L_0x01b1:
            r0.A02 = r1     // Catch:{ all -> 0x026d }
        L_0x01b3:
            X.ST0 r1 = r0.A03     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x01c2
            X.Rvt r1 = r0.A06     // Catch:{ all -> 0x026d }
            int r2 = r1.A00     // Catch:{ all -> 0x026d }
            X.ST0 r1 = new X.ST0     // Catch:{ all -> 0x026d }
            r1.<init>(r2)     // Catch:{ all -> 0x026d }
            r0.A03 = r1     // Catch:{ all -> 0x026d }
        L_0x01c2:
            X.QHU r6 = r0.A05     // Catch:{ all -> 0x026d }
            if (r6 != 0) goto L_0x01d2
            X.Rvt r1 = r0.A06     // Catch:{ all -> 0x026d }
            int r1 = r1.A02     // Catch:{ all -> 0x026d }
            long r1 = (long) r1     // Catch:{ all -> 0x026d }
            X.QHU r6 = new X.QHU     // Catch:{ all -> 0x026d }
            r6.<init>(r1)     // Catch:{ all -> 0x026d }
            r0.A05 = r6     // Catch:{ all -> 0x026d }
        L_0x01d2:
            X.Rnm r5 = r0.A04     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x01dd
            X.Rnm r5 = new X.Rnm     // Catch:{ all -> 0x026d }
            r5.<init>(r11)     // Catch:{ all -> 0x026d }
            r0.A04 = r5     // Catch:{ all -> 0x026d }
        L_0x01dd:
            X.SOI r1 = r0.A01     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0220
            X.TO7 r4 = r0.A08     // Catch:{ all -> 0x026d }
            X.TO7 r3 = r0.A09     // Catch:{ all -> 0x026d }
            long r15 = X.TO7.A01     // Catch:{ all -> 0x026d }
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x026d }
            java.util.concurrent.SynchronousQueue r18 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x026d }
            r18.<init>()     // Catch:{ all -> 0x026d }
            X.TOE r8 = new X.TOE     // Catch:{ all -> 0x026d }
            r8.<init>()     // Catch:{ all -> 0x026d }
            X.Tj1 r7 = X.C13880Tj1.A00     // Catch:{ all -> 0x026d }
            java.lang.String r2 = "source-unlimited"
            r13 = 0
            X.TOR r1 = new X.TOR     // Catch:{ all -> 0x026d }
            r1.<init>(r7, r2, r8, r13)     // Catch:{ all -> 0x026d }
            r14 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.ThreadPoolExecutor r12 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x026d }
            r19 = r1
            r12.<init>(r13, r14, r15, r17, r18, r19)     // Catch:{ all -> 0x026d }
            X.TO7 r7 = new X.TO7     // Catch:{ all -> 0x026d }
            r7.<init>(r12)     // Catch:{ all -> 0x026d }
            X.TO7 r2 = r0.A07     // Catch:{ all -> 0x026d }
            X.SOI r1 = new X.SOI     // Catch:{ all -> 0x026d }
            r12 = r1
            r13 = r5
            r14 = r6
            r15 = r4
            r16 = r3
            r17 = r7
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x026d }
            r0.A01 = r1     // Catch:{ all -> 0x026d }
        L_0x0220:
            java.util.List r1 = r0.A0B     // Catch:{ all -> 0x026d }
            if (r1 != 0) goto L_0x0261
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x026d }
        L_0x0228:
            r0.A0B = r1     // Catch:{ all -> 0x026d }
            X.Rni r1 = r0.A0C     // Catch:{ all -> 0x026d }
            X.Rnj r13 = new X.Rnj     // Catch:{ all -> 0x026d }
            r13.<init>(r1)     // Catch:{ all -> 0x026d }
            X.SVw r5 = new X.SVw     // Catch:{ all -> 0x026d }
            r5.<init>(r13)     // Catch:{ all -> 0x026d }
            X.SOI r14 = r0.A01     // Catch:{ all -> 0x026d }
            X.QHU r4 = r0.A05     // Catch:{ all -> 0x026d }
            X.Thg r15 = r0.A02     // Catch:{ all -> 0x026d }
            X.ST0 r3 = r0.A03     // Catch:{ all -> 0x026d }
            X.RTq r2 = r0.A0A     // Catch:{ all -> 0x026d }
            X.Rnh r12 = r0.A00     // Catch:{ all -> 0x026d }
            java.util.Map r1 = r0.A0D     // Catch:{ all -> 0x026d }
            java.util.List r0 = r0.A0B     // Catch:{ all -> 0x026d }
            X.SUv r10 = new X.SUv     // Catch:{ all -> 0x026d }
            r17 = r4
            r18 = r2
            r19 = r5
            r20 = r0
            r22 = r1
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x026d }
            r11.registerComponentCallbacks(r10)     // Catch:{ all -> 0x026d }
            A09 = r10     // Catch:{ all -> 0x026d }
            r0 = 0
            A0A = r0     // Catch:{ all -> 0x026d }
        L_0x025f:
            monitor-exit(r9)     // Catch:{ all -> 0x026d }
            goto L_0x0270
        L_0x0261:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x026d }
            goto L_0x0228
        L_0x0266:
            X.Sip r1 = new X.Sip     // Catch:{ all -> 0x026d }
            r1.<init>()     // Catch:{ all -> 0x026d }
            goto L_0x01b1
        L_0x026d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x026d }
            throw r0
        L_0x0270:
            X.SUv r0 = A09
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUv.A00(android.content.Context):X.SUv");
    }

    public static Sk4 A01(Context context) {
        if (context != null) {
            return A00(context).A05.A03(context);
        }
        throw AnonymousClass7TE.A11("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.RTt, java.lang.Object] */
    public SUv(Context context, C10166Rnh rnh, C10168Rnj rnj, SOI soi, C13813Thg thg, ST0 st0, QHU qhu, C9213RTq rTq, C11458SVw sVw, List list, List list2, Map map) {
        this.A08 = soi;
        this.A01 = thg;
        ST0 st02 = st0;
        this.A02 = st02;
        this.A03 = qhu;
        this.A05 = sVw;
        this.A04 = rTq;
        this.A07 = rnh;
        Context context2 = context;
        C10168Rnj rnj2 = rnj;
        this.A00 = new Q6I(context2, rnh, rnj2, soi, st02, new Object(), new C12001SkK(this, list2), list, map);
    }

    public final void onLowMemory() {
        C11424STg.A04();
        this.A03.A01(0);
        this.A01.AHj();
        ST0 st0 = this.A02;
        synchronized (st0) {
            ST0.A02(st0, 0);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onTrimMemory(int r7) {
        /*
            r6 = this;
            X.C11424STg.A04()
            java.util.List r2 = r6.A06
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0059 }
        L_0x000a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0014
            r1.next()     // Catch:{ all -> 0x0059 }
            goto L_0x000a
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            X.QHU r5 = r6.A03
            r4 = 40
            if (r7 < r4) goto L_0x002c
            r2 = 0
        L_0x001d:
            r5.A01(r2)
        L_0x0020:
            X.Thg r0 = r6.A01
            r0.FI3(r7)
            X.ST0 r1 = r6.A02
            monitor-enter(r1)
            if (r7 < r4) goto L_0x0042
            r0 = 0
            goto L_0x003c
        L_0x002c:
            r0 = 20
            if (r7 >= r0) goto L_0x0034
            r0 = 15
            if (r7 != r0) goto L_0x0020
        L_0x0034:
            monitor-enter(r5)
            long r2 = r5.A01     // Catch:{ all -> 0x0056 }
            monitor-exit(r5)
            r0 = 2
            long r2 = r2 / r0
            goto L_0x001d
        L_0x003c:
            X.ST0.A02(r1, r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0051
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0042:
            r0 = 20
            if (r7 >= r0) goto L_0x004a
            r0 = 15
            if (r7 != r0) goto L_0x0051
        L_0x004a:
            int r0 = r1.A01     // Catch:{ all -> 0x0053 }
            int r0 = r0 / 2
            X.ST0.A02(r1, r0)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r1)
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0056:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUv.onTrimMemory(int):void");
    }
}
