package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wq8  reason: case insensitive filesystem */
public abstract class C20368Wq8 implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20368Wq8)) {
            return false;
        }
        C20368Wq8 wq8 = (C20368Wq8) obj;
        if (this.A00 == wq8.A00) {
            String str = this.A02;
            String str2 = wq8.A02;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A01 == wq8.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 > 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 < 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.concurrent.Delayed r9 = (java.util.concurrent.Delayed) r9
            boolean r0 = r9 instanceof X.C20368Wq8
            if (r0 == 0) goto L_0x002a
            X.Wq8 r9 = (X.C20368Wq8) r9
            long r1 = r8.A01
            long r3 = r9.A01
            r7 = 0
            r5 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            long r1 = r8.A00
            long r3 = r9.A00
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
        L_0x001c:
            r7 = -1
        L_0x001d:
            return r7
        L_0x001e:
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            goto L_0x001c
        L_0x0024:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            r7 = 1
            return r7
        L_0x002a:
            java.lang.String r1 = "Comparing a Dispatchable to a non-Dispatchable."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20368Wq8.compareTo(java.lang.Object):int");
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: X.2R4[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: X.2R4[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: X.2R4[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: X.2R4[]} */
    /* JADX WARNING: type inference failed for: r1v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r3v18, types: [X.2R4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v62, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:216|217|218|219|(4:222|(2:224|367)(2:225|368)|365|220)|366|226) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r1 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r3 = r6.A0A;
        r6.A00 = r4 - r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        X.C19866Wgt.A02(r0);
        X.C19866Wgt.A04(r6.A09);
        r11 = X.AnonymousClass7TF.A0t(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x040a, code lost:
        if (r11.hasNext() != false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x040c, code lost:
        r4 = (X.C17994VjW) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0415, code lost:
        if (r4.A00 == null) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0417, code lost:
        r6.A02 += r4.A03[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0421, code lost:
        r4.A00 = null;
        X.C19866Wgt.A04(r4.A00());
        X.C19866Wgt.A04(r4.A01());
        r11.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0436, code lost:
        r6.A03 = X.C13989Tnp.A0f(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x064f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0657, code lost:
        throw new java.lang.RuntimeException("Exception while loading map config", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0658, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        X.1yR.A09.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x065f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:?, code lost:
        android.util.Log.e("MapConfig", "Unable to download config", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0665, code lost:
        if (r3 != null) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:216:0x03f1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0658 A[ExcHandler: Exception (r1v19 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v15 java.io.InputStream) = (r3v9 java.io.InputStream), (r3v9 java.io.InputStream), (r3v9 java.io.InputStream), (r3v16 java.io.InputStream), (r3v17 java.io.InputStream), (r3v17 java.io.InputStream) binds: [B:260:0x050a, B:261:?, B:262:0x0519, B:292:0x0652, B:263:?, B:264:0x051f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:260:0x050a] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x065f A[ExcHandler: IOException (r1v18 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v14 java.io.InputStream) = (r3v9 java.io.InputStream), (r3v9 java.io.InputStream), (r3v16 java.io.InputStream), (r3v17 java.io.InputStream) binds: [B:260:0x050a, B:261:?, B:292:0x0652, B:264:0x051f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:260:0x050a] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0667 A[SYNTHETIC, Splitter:B:303:0x0667] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06cf A[ExcHandler: all (th java.lang.Throwable), Splitter:B:260:0x050a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r1 = r32
            boolean r0 = r1 instanceof X.UHG
            if (r0 == 0) goto L_0x0048
            r3 = r1
            X.UHG r3 = (X.UHG) r3
            X.UHH r6 = r3.A00
            X.UH3 r5 = r6.A04
            X.WFU r0 = r5.A07
            X.U4m r0 = r0.A0I
            int r2 = r0.A0H
            X.W1g r1 = r3.A01
            if (r1 == 0) goto L_0x06fd
            X.W0J r0 = r5.A09
            r0.A03(r1)
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0711
            int r1 = r6.A03
            int r0 = r2 + 1
            if (r1 > r0) goto L_0x0711
            r5.A05()
            java.util.ArrayList r3 = X.UH3.A0C
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0711
            int r2 = r3.size()
            r1 = 0
        L_0x0036:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r0 = r3.get(r1)
            X.Tzf r0 = (X.C14633Tzf) r0
            r0.A05()
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0044:
            r3.clear()
            return
        L_0x0048:
            boolean r0 = r1 instanceof X.UHH
            if (r0 == 0) goto L_0x008e
            r6 = r1
            X.UHH r6 = (X.UHH) r6
            X.UH3 r0 = r6.A04
            int r5 = r6.A01
            int r4 = r6.A02
            int r3 = r6.A03
            X.W1g r1 = r0.A0H(r5, r4, r3)
            X.W1g r0 = X.C21007X9g.A00
            if (r1 == r0) goto L_0x0073
            r0 = 0
            if (r1 == 0) goto L_0x0068
        L_0x0062:
            r1.A02 = r5
            r1.A03 = r4
            r1.A04 = r3
        L_0x0068:
            X.UHG r2 = new X.UHG
            r2.<init>(r6, r1, r0)
            android.os.Handler r0 = X.C18796W2e.A01
            r0.post(r2)
            return
        L_0x0073:
            int r2 = r1.A01
            int r0 = r1.A00
            X.W1g r1 = new X.W1g
            r1.<init>(r2, r0)
            android.graphics.Bitmap r2 = X.W1g.A0F
            monitor-enter(r1)
            android.graphics.Bitmap r0 = r1.A05     // Catch:{ all -> 0x008b }
            if (r0 == r2) goto L_0x0086
            X.W1g.A01(r1)     // Catch:{ all -> 0x008b }
        L_0x0086:
            r1.A05 = r2     // Catch:{ all -> 0x008b }
            monitor-exit(r1)
            r0 = 1
            goto L_0x0062
        L_0x008b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x008e:
            boolean r0 = r1 instanceof X.UHD
            if (r0 == 0) goto L_0x00b5
            X.UHD r1 = (X.UHD) r1
            X.Va5 r7 = r1.A01
            r0 = 0
            r7.A01 = r0
            X.UH0 r5 = r7.A05
            float r4 = r1.A00
            java.util.Set r3 = r5.A0B
            r3.clear()
            X.X8E r2 = r5.A02
            X.2R4 r1 = r5.A08
            X.W2R r0 = r5.A08
            r2.AoS(r0, r1, r3, r4)
            X.UH0.A00(r5, r3)
            java.lang.Float r6 = java.lang.Float.valueOf(r4)
        L_0x00b2:
            r7.A03 = r6
            return
        L_0x00b5:
            boolean r0 = r1 instanceof X.UH7
            if (r0 == 0) goto L_0x00bf
            java.util.Vector r3 = X.C18636VvY.A02
            monitor-enter(r3)
            r2 = 0
            goto L_0x029c
        L_0x00bf:
            boolean r0 = r1 instanceof X.UHE
            if (r0 == 0) goto L_0x00f3
            r0 = r1
            X.UHE r0 = (X.UHE) r0
            android.content.Context r0 = r0.A00
            java.io.File r6 = r0.getCacheDir()
            long r3 = r6.getFreeSpace()
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0711
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2097152(0x200000, float:2.938736E-39)
            if (r0 < 0) goto L_0x00e0
            r1 = 5242880(0x500000, float:7.34684E-39)
        L_0x00e0:
            java.lang.String r0 = ".facebook_cache"
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r0)
            long r1 = (long) r1
            r12 = 2
            r17 = 1
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a6
            goto L_0x02b3
        L_0x00f3:
            boolean r0 = r1 instanceof X.UH9
            if (r0 == 0) goto L_0x0112
            r0 = r1
            X.UH9 r0 = (X.UH9) r0
            X.U4m r2 = r0.A00
            double r0 = X.C14723U4m.A0p
            java.util.Queue r0 = r2.A0S
            if (r0 == 0) goto L_0x0711
        L_0x0102:
            java.util.Queue r0 = r2.A0S
            java.lang.Object r1 = r0.poll()
            X.X2E r1 = (X.X2E) r1
            if (r1 == 0) goto L_0x04b5
            X.WFU r0 = r2.A0M
            r1.DPZ(r0)
            goto L_0x0102
        L_0x0112:
            boolean r0 = r1 instanceof X.UHC
            if (r0 == 0) goto L_0x012c
            r0 = r1
            X.UHC r0 = (X.UHC) r0
            X.W1g r1 = r0.A00
            boolean r0 = X.W1g.A0C
            r0 = 0
            r1.A0B = r0
            X.W1g r0 = r1.A06
            if (r0 != 0) goto L_0x0711
            X.W1g r0 = r1.A07
            if (r0 != 0) goto L_0x0711
            r1.A03()
            return
        L_0x012c:
            boolean r0 = r1 instanceof X.UH6
            if (r0 == 0) goto L_0x0154
            java.util.List r0 = X.2R6.A08
            java.util.ListIterator r1 = r0.listIterator()
        L_0x0136:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0711
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.X0O r0 = (X.X0O) r0
            if (r0 == 0) goto L_0x0150
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            goto L_0x0136
        L_0x0150:
            r1.remove()
            goto L_0x0136
        L_0x0154:
            boolean r0 = r1 instanceof X.UHF
            if (r0 == 0) goto L_0x0171
            r6 = r1
            X.UHF r6 = (X.UHF) r6
            long r2 = r6.A00
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x04b9
            java.util.concurrent.Semaphore r0 = X.2R6.A09
            boolean r0 = r0.tryAcquire()
            if (r0 != 0) goto L_0x04b9
            return
        L_0x0171:
            boolean r0 = r1 instanceof X.UHB
            if (r0 == 0) goto L_0x0190
            r0 = r1
            X.UHB r0 = (X.UHB) r0
            X.VdE r1 = r0.A00
            r0 = 0
            r1.A0S = r0
            X.X0N r3 = r1.A0M
            float r2 = r1.A0A
            float r1 = r1.A0B
            X.U4m r3 = (X.C14723U4m) r3
            X.Tzf r0 = r3.A0O
            if (r0 == 0) goto L_0x06d1
            boolean r0 = r0.A0F(r2, r1)
            if (r0 == 0) goto L_0x06d1
            return
        L_0x0190:
            boolean r0 = r1 instanceof X.UHA
            if (r0 == 0) goto L_0x01be
            r0 = r1
            X.UHA r0 = (X.UHA) r0
            X.VdE r0 = r0.A00
            X.X0N r5 = r0.A0M
            float r4 = r0.A0A
            float r3 = r0.A0B
            X.U4m r5 = (X.C14723U4m) r5
            X.C14723U4m.A0A(r5)
            X.Tzf r0 = r5.A0O
            if (r0 == 0) goto L_0x06dc
            boolean r0 = r0.A0G(r4, r3)
            if (r0 == 0) goto L_0x06dc
            X.WFU r2 = r5.A0M
            X.Tzf r1 = r5.A0O
            X.Tzf r0 = r2.A07
            if (r0 == 0) goto L_0x01bb
            if (r0 == r1) goto L_0x01bb
            r0.A07()
        L_0x01bb:
            r2.A07 = r1
            return
        L_0x01be:
            r0 = r1
            X.UH8 r0 = (X.UH8) r0
            X.Va5 r7 = r0.A00
            r4 = 0
            r7.A00 = r4
            X.UH0 r9 = r7.A05
            r9.A05()
            X.WFU r0 = r9.A07
            com.facebook.android.maps.model.CameraPosition r0 = r0.A02()
            float r3 = r0.A02
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            if (r6 == 0) goto L_0x0711
            X.WFV r5 = r7.A04
            java.util.Set r10 = r9.A0B
            r10.clear()
            X.X8E r2 = r9.A02
            X.2R4 r1 = r9.A08
            X.W2R r0 = r9.A08
            r2.AoS(r0, r1, r10, r3)
            java.util.List r3 = r9.A0A
            r3.clear()
            java.util.Map r0 = r9.A04
            java.util.Iterator r8 = X.AnonymousClass7TF.A0v(r0)
        L_0x01f4:
            boolean r0 = r8.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0212
            java.lang.Object r1 = r8.next()
            X.Wh8 r1 = (X.C19879Wh8) r1
        L_0x0201:
            int r0 = r1.A03
            if (r2 >= r0) goto L_0x020e
            X.Wh5[] r0 = r1.A07
            r0 = r0[r2]
            r0.A02 = r1
            int r2 = r2 + 1
            goto L_0x0201
        L_0x020e:
            r3.add(r1)
            goto L_0x01f4
        L_0x0212:
            X.UH0.A00(r9, r10)
            java.util.Iterator r11 = r10.iterator()
        L_0x0219:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0250
            java.lang.Object r10 = r11.next()
            X.Wh8 r10 = (X.C19879Wh8) r10
            X.Tzf r8 = r10.A05
            boolean r0 = r8 instanceof X.C14957UGv
            if (r0 == 0) goto L_0x0219
            X.Wh5[] r0 = r10.A07
            r0 = r0[r2]
            X.Wh8 r0 = r0.A02
            if (r0 != 0) goto L_0x0234
            r0 = r10
        L_0x0234:
            r10.A04 = r0
            X.UGv r8 = (X.C14957UGv) r8
            r0 = 0
            r8.A0H(r0)
            X.Wh8 r0 = r10.A04
            com.facebook.android.maps.model.LatLng r0 = r0.A03()
            r8.A0I(r0)
            X.VUS r1 = new X.VUS
            r1.<init>(r8, r10, r9)
            java.util.Collection r0 = r5.A02
            r0.add(r1)
            goto L_0x0219
        L_0x0250:
            int r1 = r3.size()
        L_0x0254:
            if (r2 >= r1) goto L_0x0261
            java.lang.Object r0 = r3.get(r2)
            X.Wh8 r0 = (X.C19879Wh8) r0
            r0.A04 = r4
            int r2 = r2 + 1
            goto L_0x0254
        L_0x0261:
            r3.clear()
            X.VSw r0 = r7.A02
            if (r0 != 0) goto L_0x0289
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x026a:
            java.util.Collection r2 = r5.A02
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00b2
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            X.Tzh r2 = X.C14635Tzh.A00(r3, r2)
            r5.A01 = r2
            r2.A06(r0)
            r2.A08(r5)
            r2.A07(r5)
            r2.A05()
            goto L_0x00b2
        L_0x0289:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r0.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0299
            r0 = 0
            goto L_0x026a
        L_0x0299:
            r0 = 300(0x12c, double:1.48E-321)
            goto L_0x026a
        L_0x029c:
            int r1 = r3.size()     // Catch:{ all -> 0x02b0 }
        L_0x02a0:
            if (r2 >= r1) goto L_0x02ae
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x02b0 }
            X.VvY r0 = (X.C18636VvY) r0     // Catch:{ all -> 0x02b0 }
            r0.A01()     // Catch:{ all -> 0x02b0 }
            int r2 = r2 + 1
            goto L_0x02a0
        L_0x02ae:
            monitor-exit(r3)     // Catch:{ all -> 0x02b0 }
            return
        L_0x02b0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02b0 }
            throw r0
        L_0x02b3:
            java.lang.String r0 = "journal.bkp"
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x04ae }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x04ae }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x04ae }
            if (r0 == 0) goto L_0x02d0
            java.lang.String r0 = "journal"
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x04ae }
            r3.<init>(r5, r0)     // Catch:{ IOException -> 0x04ae }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x04ae }
            if (r0 == 0) goto L_0x02de
            r4.delete()     // Catch:{ IOException -> 0x04ae }
        L_0x02d0:
            X.Wgt r6 = new X.Wgt     // Catch:{ IOException -> 0x04ae }
            r6.<init>(r5, r1)     // Catch:{ IOException -> 0x04ae }
            java.io.File r10 = r6.A08     // Catch:{ IOException -> 0x04ae }
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x04ae }
            if (r0 == 0) goto L_0x0489
            goto L_0x02eb
        L_0x02de:
            boolean r0 = r4.renameTo(r3)     // Catch:{ IOException -> 0x04ae }
            if (r0 != 0) goto L_0x02d0
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x04ae }
            r1.<init>()     // Catch:{ IOException -> 0x04ae }
            goto L_0x04ad
        L_0x02eb:
            java.lang.String r19 = ", "
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x045c }
            r3.<init>(r10)     // Catch:{ IOException -> 0x045c }
            java.nio.charset.Charset r9 = X.C19866Wgt.A0F     // Catch:{ IOException -> 0x045c }
            X.Wgr r16 = new X.Wgr     // Catch:{ IOException -> 0x045c }
            r0 = r16
            r0.<init>(r6, r3, r9)     // Catch:{ IOException -> 0x045c }
            java.lang.String r8 = r16.A00()     // Catch:{ all -> 0x0457 }
            java.lang.String r7 = r16.A00()     // Catch:{ all -> 0x0457 }
            java.lang.String r11 = r16.A00()     // Catch:{ all -> 0x0457 }
            java.lang.String r4 = r16.A00()     // Catch:{ all -> 0x0457 }
            java.lang.String r3 = r16.A00()     // Catch:{ all -> 0x0457 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0457 }
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0457 }
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x0457 }
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0457 }
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = java.lang.Integer.toString(r17)     // Catch:{ all -> 0x0457 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0457 }
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0457 }
            if (r0 == 0) goto L_0x043d
            r4 = 0
        L_0x033c:
            java.lang.String r7 = r16.A00()     // Catch:{ EOFException -> 0x03f1 }
            r8 = 32
            int r13 = r7.indexOf(r8)     // Catch:{ EOFException -> 0x03f1 }
            java.lang.String r3 = "unexpected journal line: "
            r14 = -1
            if (r13 == r14) goto L_0x03e3
            int r0 = r13 + 1
            int r12 = r7.indexOf(r8, r0)     // Catch:{ EOFException -> 0x03f1 }
            if (r12 != r14) goto L_0x0368
            java.lang.String r15 = r7.substring(r0)     // Catch:{ EOFException -> 0x03f1 }
            r0 = 6
            if (r13 != r0) goto L_0x036c
            java.lang.String r0 = "REMOVE"
            boolean r0 = r7.startsWith(r0)     // Catch:{ EOFException -> 0x03f1 }
            if (r0 == 0) goto L_0x036c
            java.util.LinkedHashMap r0 = r6.A0A     // Catch:{ EOFException -> 0x03f1 }
            r0.remove(r15)     // Catch:{ EOFException -> 0x03f1 }
            goto L_0x03d1
        L_0x0368:
            java.lang.String r15 = r7.substring(r0, r12)     // Catch:{ EOFException -> 0x03f1 }
        L_0x036c:
            java.util.LinkedHashMap r0 = r6.A0A     // Catch:{ EOFException -> 0x03f1 }
            java.lang.Object r11 = r0.get(r15)     // Catch:{ EOFException -> 0x03f1 }
            X.VjW r11 = (X.C17994VjW) r11     // Catch:{ EOFException -> 0x03f1 }
            r8 = 0
            if (r11 != 0) goto L_0x037f
            X.VjW r11 = new X.VjW     // Catch:{ EOFException -> 0x03f1 }
            r11.<init>(r6, r15)     // Catch:{ EOFException -> 0x03f1 }
            r0.put(r15, r11)     // Catch:{ EOFException -> 0x03f1 }
        L_0x037f:
            r0 = 5
            if (r12 == r14) goto L_0x03b4
            if (r13 != r0) goto L_0x03de
            java.lang.String r0 = "CLEAN"
            boolean r0 = r7.startsWith(r0)     // Catch:{ EOFException -> 0x03f1 }
            if (r0 == 0) goto L_0x03de
            int r0 = r12 + 1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ EOFException -> 0x03f1 }
            java.lang.String r0 = " "
            java.lang.String[] r14 = r7.split(r0)     // Catch:{ EOFException -> 0x03f1 }
            r0 = r17
            r11.A01 = r0     // Catch:{ EOFException -> 0x03f1 }
            r11.A00 = r8     // Catch:{ EOFException -> 0x03f1 }
            int r15 = r14.length     // Catch:{ EOFException -> 0x03f1 }
            X.Wgt r0 = r11.A04     // Catch:{ EOFException -> 0x03f1 }
            int r0 = r0.A06     // Catch:{ EOFException -> 0x03f1 }
            if (r15 != r0) goto L_0x03e8
            r13 = 0
        L_0x03a6:
            if (r13 >= r15) goto L_0x03d1
            long[] r12 = r11.A03     // Catch:{ NumberFormatException -> 0x03d5 }
            r0 = r14[r13]     // Catch:{ NumberFormatException -> 0x03d5 }
            long r7 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x03d5 }
            r12[r13] = r7     // Catch:{ NumberFormatException -> 0x03d5 }
            r13 = 1
            goto L_0x03a6
        L_0x03b4:
            if (r13 != r0) goto L_0x03c6
            java.lang.String r0 = "DIRTY"
            boolean r0 = r7.startsWith(r0)     // Catch:{ EOFException -> 0x03f1 }
            if (r0 == 0) goto L_0x03de
            X.VhR r0 = new X.VhR     // Catch:{ EOFException -> 0x03f1 }
            r0.<init>(r11, r6)     // Catch:{ EOFException -> 0x03f1 }
            r11.A00 = r0     // Catch:{ EOFException -> 0x03f1 }
            goto L_0x03d1
        L_0x03c6:
            r0 = 4
            if (r13 != r0) goto L_0x03de
            java.lang.String r0 = "READ"
            boolean r0 = r7.startsWith(r0)     // Catch:{ EOFException -> 0x03f1 }
            if (r0 == 0) goto L_0x03de
        L_0x03d1:
            int r4 = r4 + 1
            goto L_0x033c
        L_0x03d5:
            java.lang.String r0 = java.util.Arrays.toString(r14)     // Catch:{ EOFException -> 0x03f1 }
            java.io.IOException r0 = X.Pxg.A0Z(r3, r0)     // Catch:{ EOFException -> 0x03f1 }
            goto L_0x03f0
        L_0x03de:
            java.io.IOException r0 = X.Pxg.A0Z(r3, r7)     // Catch:{ EOFException -> 0x03f1 }
            goto L_0x03f0
        L_0x03e3:
            java.io.IOException r0 = X.Pxg.A0Z(r3, r7)     // Catch:{ EOFException -> 0x03f1 }
            goto L_0x03f0
        L_0x03e8:
            java.lang.String r0 = java.util.Arrays.toString(r14)     // Catch:{ EOFException -> 0x03f1 }
            java.io.IOException r0 = X.Pxg.A0Z(r3, r0)     // Catch:{ EOFException -> 0x03f1 }
        L_0x03f0:
            throw r0     // Catch:{ EOFException -> 0x03f1 }
        L_0x03f1:
            java.util.LinkedHashMap r3 = r6.A0A     // Catch:{ all -> 0x0457 }
            int r0 = r3.size()     // Catch:{ all -> 0x0457 }
            int r4 = r4 - r0
            r6.A00 = r4     // Catch:{ all -> 0x0457 }
            X.C19866Wgt.A02(r16)     // Catch:{ IOException -> 0x045c }
            java.io.File r0 = r6.A09     // Catch:{ IOException -> 0x045c }
            X.C19866Wgt.A04(r0)     // Catch:{ IOException -> 0x045c }
            java.util.Iterator r11 = X.AnonymousClass7TF.A0t(r3)     // Catch:{ IOException -> 0x045c }
        L_0x0406:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x045c }
            if (r0 == 0) goto L_0x0436
            java.lang.Object r4 = r11.next()     // Catch:{ IOException -> 0x045c }
            X.VjW r4 = (X.C17994VjW) r4     // Catch:{ IOException -> 0x045c }
            X.VhR r0 = r4.A00     // Catch:{ IOException -> 0x045c }
            r3 = 0
            if (r0 != 0) goto L_0x0421
            long r7 = r6.A02     // Catch:{ IOException -> 0x045c }
            long[] r0 = r4.A03     // Catch:{ IOException -> 0x045c }
            r3 = r0[r3]     // Catch:{ IOException -> 0x045c }
            long r7 = r7 + r3
            r6.A02 = r7     // Catch:{ IOException -> 0x045c }
            goto L_0x0406
        L_0x0421:
            r0 = 0
            r4.A00 = r0     // Catch:{ IOException -> 0x045c }
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x045c }
            X.C19866Wgt.A04(r0)     // Catch:{ IOException -> 0x045c }
            java.io.File r0 = r4.A01()     // Catch:{ IOException -> 0x045c }
            X.C19866Wgt.A04(r0)     // Catch:{ IOException -> 0x045c }
            r11.remove()     // Catch:{ IOException -> 0x045c }
            goto L_0x0406
        L_0x0436:
            java.io.BufferedWriter r0 = X.C13989Tnp.A0f(r10, r9)     // Catch:{ IOException -> 0x045c }
            r6.A03 = r0     // Catch:{ IOException -> 0x045c }
            goto L_0x0494
        L_0x043d:
            java.lang.String r17 = "unexpected journal header: ["
            java.lang.String r25 = "]"
            r21 = r19
            r23 = r19
            r18 = r8
            r20 = r7
            r22 = r4
            r24 = r3
            java.lang.String r3 = X.002.A18(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0457 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0457 }
            r0.<init>(r3)     // Catch:{ all -> 0x0457 }
            throw r0     // Catch:{ all -> 0x0457 }
        L_0x0457:
            r0 = move-exception
            X.C19866Wgt.A02(r16)     // Catch:{ IOException -> 0x045c }
            throw r0     // Catch:{ IOException -> 0x045c }
        L_0x045c:
            r7 = move-exception
            java.io.PrintStream r4 = java.lang.System.out     // Catch:{ IOException -> 0x04ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04ae }
            r3.<init>()     // Catch:{ IOException -> 0x04ae }
            java.lang.String r0 = "DiskLruCache "
            r3.append(r0)     // Catch:{ IOException -> 0x04ae }
            r3.append(r5)     // Catch:{ IOException -> 0x04ae }
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch:{ IOException -> 0x04ae }
            java.lang.String r0 = r7.getMessage()     // Catch:{ IOException -> 0x04ae }
            r3.append(r0)     // Catch:{ IOException -> 0x04ae }
            java.lang.String r0 = ", removing"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r3)     // Catch:{ IOException -> 0x04ae }
            r4.println(r0)     // Catch:{ IOException -> 0x04ae }
            r6.close()     // Catch:{ IOException -> 0x04ae }
            java.io.File r0 = r6.A07     // Catch:{ IOException -> 0x04ae }
            X.C19866Wgt.A03(r0)     // Catch:{ IOException -> 0x04ae }
        L_0x0489:
            r5.mkdirs()     // Catch:{ IOException -> 0x04ae }
            X.Wgt r6 = new X.Wgt     // Catch:{ IOException -> 0x04ae }
            r6.<init>(r5, r1)     // Catch:{ IOException -> 0x04ae }
            X.C19866Wgt.A01(r6)     // Catch:{ IOException -> 0x04ae }
        L_0x0494:
            X.UHJ.A09 = r6     // Catch:{ IOException -> 0x04ae }
            X.WhC r1 = new X.WhC     // Catch:{ IOException -> 0x04ae }
            r1.<init>()     // Catch:{ IOException -> 0x04ae }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ IOException -> 0x04ae }
            r0.<init>(r1)     // Catch:{ IOException -> 0x04ae }
            X.UHJ.A06 = r0     // Catch:{ IOException -> 0x04ae }
            r0.start()     // Catch:{ IOException -> 0x04ae }
            return
        L_0x04a6:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x04ae }
            r1.<init>(r0)     // Catch:{ IOException -> 0x04ae }
        L_0x04ad:
            throw r1     // Catch:{ IOException -> 0x04ae }
        L_0x04ae:
            r1 = move-exception
            X.1yR r0 = X.1yR.A0B
            r0.A04(r1)
            return
        L_0x04b5:
            r0 = 0
            r2.A0S = r0
            return
        L_0x04b9:
            boolean r0 = X.2R6.A05
            java.lang.String r4 = "MapConfig"
            java.lang.String r2 = ""
            X.X5o r3 = r6.A01
            if (r3 == 0) goto L_0x0507
            boolean r0 = X.C9221RTy.A00()
            if (r0 == 0) goto L_0x0507
            android.content.Context r1 = X.2R6.A02
            r0 = 21
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0507
            android.content.Context r1 = X.2R6.A02
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0507
            android.location.Location r3 = r3.AuA(r4)
            if (r3 == 0) goto L_0x0507
            java.lang.StringBuilder r2 = X.AnonymousClass7TF.A0n(r2)
            java.lang.String r0 = "&latitude="
            r2.append(r0)
            double r0 = r3.getLatitude()
            r2.append(r0)
            java.lang.String r0 = "&longitude="
            r2.append(r0)
            double r0 = r3.getLongitude()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
        L_0x0507:
            r0 = 512(0x200, float:7.175E-43)
            r3 = 0
            byte[] r7 = new byte[r0]     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            java.lang.String r1 = X.2R6.A0D     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            java.lang.String r0 = X.2R6.A0C     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            java.lang.String r1 = X.002.A0g(r1, r0, r2)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            java.io.InputStream r3 = r0.openStream()     // Catch:{ IOException -> 0x064f, Exception -> 0x0658, all -> 0x06cf }
            r2 = 0
            r5 = 0
        L_0x051f:
            int r0 = r7.length     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            int r0 = r0 - r5
            int r1 = r3.read(r7, r5, r0)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            r0 = -1
            if (r1 == r0) goto L_0x0537
            int r5 = r5 + r1
            int r0 = r7.length     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            if (r5 < r0) goto L_0x051f
            int r0 = r7.length     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            int r0 = r0 << 1
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            int r0 = r7.length     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            java.lang.System.arraycopy(r7, r2, r1, r2, r0)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            r7 = r1
            goto L_0x051f
        L_0x0537:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            r0.<init>(r7, r2, r5)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            org.json.JSONObject r9 = r0.getJSONObject(r2)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658 }
            r3.close()     // Catch:{ IOException -> 0x054e }
        L_0x054e:
            if (r9 == 0) goto L_0x066a
            java.lang.String r25 = "south"
            java.lang.String r24 = "east"
            java.lang.String r23 = "north"
            java.lang.String r22 = "west"
            java.lang.String r21 = "rectangles"
            X.2R5 r0 = X.2R6.A0B
            java.lang.String r1 = r0.A01
            java.lang.String r20 = "base_url"
            r0 = r20
            java.lang.String r26 = r9.optString(r0, r1)
            X.2R5 r0 = X.2R6.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "static_base_url"
            java.lang.String r27 = r9.optString(r0, r1)
            java.lang.String r0 = "osm_config"
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x05d2 }
            java.lang.String r0 = "zoom_threshold"
            int r19 = r1.getInt(r0)     // Catch:{ JSONException -> 0x05d2 }
            r0 = r21
            org.json.JSONArray r15 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x05d2 }
            int r8 = r15.length()     // Catch:{ JSONException -> 0x05d2 }
            android.graphics.Rect[] r0 = new android.graphics.Rect[r8]     // Catch:{ JSONException -> 0x05d2 }
            r18 = r0
            r7 = 1
            int r7 = r7 << r19
            r5 = 0
        L_0x058e:
            if (r5 >= r8) goto L_0x05de
            org.json.JSONObject r4 = r15.getJSONObject(r5)     // Catch:{ JSONException -> 0x05d2 }
            double r2 = (double) r7     // Catch:{ JSONException -> 0x05d2 }
            r0 = r22
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r13 = X.W2R.A01(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r0 = r2 * r13
            int r14 = (int) r0     // Catch:{ JSONException -> 0x05d2 }
            r0 = r23
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r16 = X.W2R.A00(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r0 = r2 * r16
            int r10 = (int) r0     // Catch:{ JSONException -> 0x05d2 }
            r0 = r24
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r16 = X.W2R.A01(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r0 = r2 * r16
            int r13 = (int) r0     // Catch:{ JSONException -> 0x05d2 }
            r0 = r25
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r0 = X.W2R.A00(r0)     // Catch:{ JSONException -> 0x05d2 }
            double r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ JSONException -> 0x05d2 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ JSONException -> 0x05d2 }
            r1.<init>(r14, r10, r13, r0)     // Catch:{ JSONException -> 0x05d2 }
            r18[r5] = r1     // Catch:{ JSONException -> 0x05d2 }
            int r5 = r5 + 1
            goto L_0x058e
        L_0x05d2:
            X.2R5 r0 = X.2R6.A0B
            int r0 = r0.A00
            r19 = r0
            X.2R5 r0 = X.2R6.A0B
            android.graphics.Rect[] r0 = r0.A04
            r18 = r0
        L_0x05de:
            java.lang.String r0 = "url_override_config"
            org.json.JSONArray r14 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x0696 }
            int r7 = r14.length()     // Catch:{ JSONException -> 0x0696 }
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ JSONException -> 0x0696 }
            X.2R4[][] r0 = new X.AnonymousClass2R4[r7][]     // Catch:{ JSONException -> 0x0696 }
            r5 = 0
        L_0x05ed:
            if (r5 >= r7) goto L_0x069e
            org.json.JSONObject r2 = r14.getJSONObject(r5)     // Catch:{ JSONException -> 0x0696 }
            r1 = r20
            java.lang.String r1 = r2.getString(r1)     // Catch:{ JSONException -> 0x0696 }
            r10[r5] = r1     // Catch:{ JSONException -> 0x0696 }
            r1 = r21
            org.json.JSONArray r13 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x0696 }
            int r8 = r13.length()     // Catch:{ JSONException -> 0x0696 }
            X.2R4[] r1 = new X.AnonymousClass2R4[r8]     // Catch:{ JSONException -> 0x0696 }
            r0[r5] = r1     // Catch:{ JSONException -> 0x0696 }
            r4 = 0
        L_0x060a:
            if (r4 >= r8) goto L_0x064c
            X.2R4 r3 = new X.2R4     // Catch:{ JSONException -> 0x0696 }
            r3.<init>()     // Catch:{ JSONException -> 0x0696 }
            org.json.JSONObject r9 = r13.getJSONObject(r4)     // Catch:{ JSONException -> 0x0696 }
            r1 = r22
            double r1 = r9.getDouble(r1)     // Catch:{ JSONException -> 0x0696 }
            double r1 = X.W2R.A01(r1)     // Catch:{ JSONException -> 0x0696 }
            r3.A01 = r1     // Catch:{ JSONException -> 0x0696 }
            r1 = r23
            double r1 = r9.getDouble(r1)     // Catch:{ JSONException -> 0x0696 }
            double r1 = X.W2R.A00(r1)     // Catch:{ JSONException -> 0x0696 }
            r3.A03 = r1     // Catch:{ JSONException -> 0x0696 }
            r1 = r24
            double r1 = r9.getDouble(r1)     // Catch:{ JSONException -> 0x0696 }
            double r1 = X.W2R.A01(r1)     // Catch:{ JSONException -> 0x0696 }
            r3.A02 = r1     // Catch:{ JSONException -> 0x0696 }
            r1 = r25
            double r1 = r9.getDouble(r1)     // Catch:{ JSONException -> 0x0696 }
            double r1 = X.W2R.A00(r1)     // Catch:{ JSONException -> 0x0696 }
            r3.A00 = r1     // Catch:{ JSONException -> 0x0696 }
            r1 = r0[r5]     // Catch:{ JSONException -> 0x0696 }
            r1[r4] = r3     // Catch:{ JSONException -> 0x0696 }
            int r4 = r4 + 1
            goto L_0x060a
        L_0x064c:
            int r5 = r5 + 1
            goto L_0x05ed
        L_0x064f:
            r2 = move-exception
            java.lang.String r1 = "Exception while loading map config"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
            throw r0     // Catch:{ IOException -> 0x065f, Exception -> 0x0658, all -> 0x06cf }
        L_0x0658:
            r1 = move-exception
            X.1yR r0 = X.1yR.A09     // Catch:{ all -> 0x06c8 }
            r0.A04(r1)     // Catch:{ all -> 0x06c8 }
            goto L_0x0665
        L_0x065f:
            r1 = move-exception
            java.lang.String r0 = "Unable to download config"
            android.util.Log.e(r4, r0, r1)     // Catch:{ all -> 0x06c8 }
        L_0x0665:
            if (r3 == 0) goto L_0x066a
            r3.close()     // Catch:{ IOException -> 0x066a }
        L_0x066a:
            long r3 = r6.A00
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x06bd
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            java.lang.String r5 = "MapConfigUpdateDispatchable"
            int r1 = X.C18796W2e.A00
            int r0 = r1 + -1
            X.C18796W2e.A00 = r0
            long r1 = (long) r1
            r0 = 32
            long r1 = r1 << r0
            r6.A00 = r1
            r6.A02 = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 + r3
            r6.A01 = r0
            X.VQX r0 = X.C18796W2e.A00()
            java.util.concurrent.BlockingQueue r0 = r0.A00
            r0.add(r6)
            return
        L_0x0696:
            X.2R5 r0 = X.2R6.A0B
            java.lang.String[] r10 = r0.A05
            X.2R5 r0 = X.2R6.A0B
            X.2R4[][] r0 = r0.A06
        L_0x069e:
            X.2R5 r25 = new X.2R5
            r28 = r18
            r29 = r10
            r30 = r0
            r31 = r19
            r25.<init>(r26, r27, r28, r29, r30, r31)
            X.2R6.A0B = r25
            long r0 = android.os.SystemClock.uptimeMillis()
            X.2R6.A00 = r0
            X.UH6 r1 = new X.UH6
            r1.<init>()
            android.os.Handler r0 = X.C18796W2e.A01
            r0.post(r1)
        L_0x06bd:
            r6.A00 = r11
            r0 = 0
            X.2R6.A05 = r0
            java.util.concurrent.Semaphore r0 = X.2R6.A09
            r0.release()
            return
        L_0x06c8:
            r0 = move-exception
            if (r3 == 0) goto L_0x06d0
            r3.close()     // Catch:{ IOException -> 0x06d0 }
            throw r0
        L_0x06cf:
            r0 = move-exception
        L_0x06d0:
            throw r0
        L_0x06d1:
            X.XAA r1 = r3.A0R
            java.lang.String r0 = "gesture_single_long_tap"
            r1.ELr(r0)
            X.C14723U4m.A0A(r3)
            return
        L_0x06dc:
            X.XAA r1 = r5.A0R
            java.lang.String r0 = "gesture_single_tap"
            r1.ELr(r0)
            X.WFU r2 = r5.A0M
            r1 = 0
            X.Tzf r0 = r2.A07
            if (r0 == 0) goto L_0x06ed
            r0.A07()
        L_0x06ed:
            r2.A07 = r1
            X.X2B r1 = r2.A06
            if (r1 == 0) goto L_0x0711
            X.W2R r0 = r2.A0J
            com.facebook.android.maps.model.LatLng r0 = r0.A04(r4, r3)
            r1.DPW(r0)
            return
        L_0x06fd:
            int r4 = r6.A00
            if (r4 <= 0) goto L_0x0712
            int r3 = r6.A03
            r0 = -1
            if (r3 == r0) goto L_0x0708
            if (r3 != r2) goto L_0x0712
        L_0x0708:
            int r2 = r6.A01
            int r1 = r6.A02
            int r0 = r4 + -1
            r5.A0J(r2, r1, r3, r0)
        L_0x0711:
            return
        L_0x0712:
            X.W1g r0 = r6.A05
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20368Wq8.run():void");
    }
}
