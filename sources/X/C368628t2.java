package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.view.Surface;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8t2  reason: invalid class name and case insensitive filesystem */
public final class C368628t2 implements C368638t3 {
    public int A00;
    public Integer A01 = AnonymousClass05K.A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public EffectManifest A09 = new EffectManifest();
    public boolean A0A;
    public final C368658t5 A0B;
    public final C368648t4 A0C;
    public final Context A0D;
    public final C368598sv A0E;
    public final C368578ss A0F;
    public final HashSet A0G;
    public final ScheduledExecutorService A0H;
    public final ScheduledExecutorService A0I;

    public C368628t2(Context context, C368598sv r8, C368578ss r9, C368648t4 r10, HashSet hashSet, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        0qQ.A0B(scheduledExecutorService2, 4);
        0qQ.A0B(hashSet, 7);
        this.A0F = r9;
        Context context2 = context;
        this.A0D = context;
        this.A0I = scheduledExecutorService;
        this.A0H = scheduledExecutorService2;
        C368598sv r2 = r8;
        this.A0E = r8;
        this.A0C = r10;
        this.A0G = hashSet;
        this.A0B = new C368658t5(context2, r2, r9, scheduledExecutorService, scheduledExecutorService2);
        if (r10 != null) {
            r10.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0224, code lost:
        if (r10 != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0227, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a2, code lost:
        r11 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0205 A[Catch:{ 7sx -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x020b A[Catch:{ 7sx -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0216 A[Catch:{ 7sx -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0227 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:30:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dd A[Catch:{ 7sx -> 0x019f, all -> 0x0227 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4 A[Catch:{ 7sx -> 0x0197, all -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd A[Catch:{ 7sx -> 0x0197, all -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0120 A[Catch:{ RemoteException -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0157 A[Catch:{ RemoteException -> 0x018a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean APt(X.C368798tL r36, java.lang.Integer r37, float[] r38, float[] r39, float[] r40, long r41, long r43, boolean r45) {
        /*
            r35 = this;
            r4 = 0
            r12 = r38
            X.0qQ.A0B(r12, r4)
            r3 = 1
            r1 = r39
            X.0qQ.A0B(r1, r3)
            r5 = 2
            r0 = r40
            X.0qQ.A0B(r0, r5)
            r2 = 5
            r10 = r36
            X.0qQ.A0B(r10, r2)
            r2 = 7
            r11 = r37
            X.0qQ.A0B(r11, r2)
            r6 = r35
            java.lang.Integer r2 = r6.A01
            int r2 = r2.intValue()
            r15 = r41
            r33 = r43
            r19 = r45
            if (r2 == r3) goto L_0x0264
            r18 = 0
            if (r2 == r5) goto L_0x0033
            return r4
        L_0x0033:
            X.8t4 r2 = r6.A0C
            if (r2 == 0) goto L_0x0263
            r25 = 1000(0x3e8, double:4.94E-321)
            long r25 = r25 * r41
            X.8KV r5 = r10.A00
            int r15 = r5.A00
            java.lang.Integer r5 = r10.A01
            int r23 = X.AAJ.A00(r5)
            int r5 = r11.intValue()
            if (r5 == 0) goto L_0x00bd
            r24 = 1
        L_0x004d:
            X.7uO r5 = r2.A06
            if (r5 != 0) goto L_0x0064
            float[] r5 = X.C345977uO.A05
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.7ry r6 = new X.7ry
            r6.<init>(r5)
            X.7uO r5 = new X.7uO
            r5.<init>(r6)
            r2.A06 = r5
        L_0x0064:
            r5 = 16
            float[] r14 = new float[r5]
            float[] r13 = new float[r5]
            r5 = r14
            r6 = r4
            r7 = r12
            r8 = r4
            r9 = r1
            r10 = r4
            android.opengl.Matrix.multiplyMM(r5, r6, r7, r8, r9, r10)
            r7 = r14
            r9 = r0
            android.opengl.Matrix.multiplyMM(r5, r6, r7, r8, r9, r10)
            X.AIb r9 = r2.A0C
            boolean r0 = r9.A09()
            r18 = 1
            if (r0 == 0) goto L_0x0240
            android.view.Surface r0 = r2.A01
            if (r0 == 0) goto L_0x0240
            X.7v0 r0 = r2.A04
            if (r0 == 0) goto L_0x0240
            X.7uK r0 = r2.A03
            r8 = 0
            if (r0 != 0) goto L_0x00a6
            X.7s3 r5 = X.C344577s5.A02()
            if (r5 == 0) goto L_0x00a6
            X.7s3 r1 = r2.A0B
            if (r1 == 0) goto L_0x00bb
            r0 = 68
            r1.ErC(r5, r0)
            android.view.Surface r0 = r2.A01
            X.7uK r0 = r1.AMY(r0)
        L_0x00a4:
            r2.A03 = r0
        L_0x00a6:
            android.opengl.EGLContext r12 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetCurrentDisplay()
            r0 = 12378(0x305a, float:1.7345E-41)
            android.opengl.EGLSurface r6 = android.opengl.EGL14.eglGetCurrentSurface(r0)
            r0 = 12377(0x3059, float:1.7344E-41)
            android.opengl.EGLSurface r5 = android.opengl.EGL14.eglGetCurrentSurface(r0)
            goto L_0x00c0
        L_0x00bb:
            r0 = r8
            goto L_0x00a4
        L_0x00bd:
            r24 = 0
            goto L_0x004d
        L_0x00c0:
            X.7uK r0 = r2.A03     // Catch:{ 7sx -> 0x01a2, all -> 0x0227 }
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r0.A05()     // Catch:{ 7sx -> 0x019f, all -> 0x0227 }
            if (r0 != r3) goto L_0x01c3
            X.7v0 r10 = r2.A04     // Catch:{ 7sx -> 0x01a2, all -> 0x0227 }
            if (r10 == 0) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            r1 = 0
            if (r10 == 0) goto L_0x00e0
            goto L_0x00d9
        L_0x00d3:
            X.7v3 r0 = r10.A02     // Catch:{ 7sx -> 0x019f, all -> 0x0227 }
            if (r0 == 0) goto L_0x00cf
            int r1 = r0.A01     // Catch:{ 7sx -> 0x019f, all -> 0x0227 }
        L_0x00d9:
            X.7v3 r0 = r10.A02     // Catch:{ 7sx -> 0x019f, all -> 0x0227 }
            if (r0 == 0) goto L_0x00e0
            int r0 = r0.A00     // Catch:{ 7sx -> 0x019f, all -> 0x0227 }
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            r28 = r2
            r29 = r14
            r30 = r1
            r31 = r0
            r32 = r3
            r27 = r10
            X.C368648t4.A00(r27, r28, r29, r30, r31, r32)     // Catch:{ 7sx -> 0x019d, all -> 0x019a }
            X.7uK r10 = r2.A03     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
            if (r10 == 0) goto L_0x00f9
            r0 = r33
            r10.A04(r0)     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
        L_0x00f9:
            X.7uK r0 = r2.A03     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
            if (r0 == 0) goto L_0x0100
            r0.A03()     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
        L_0x0100:
            com.meta.arfx.engine.interfaces.IAREngineServiceController r0 = r9.A0A     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
            if (r0 == 0) goto L_0x0195
            boolean r0 = r9.A09()     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
            if (r0 == 0) goto L_0x0195
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x018a }
            r0.<init>()     // Catch:{ RemoteException -> 0x018a }
            java.util.concurrent.BlockingQueue r1 = r9.A0c     // Catch:{ RemoteException -> 0x018a }
            r1.drainTo(r0)     // Catch:{ RemoteException -> 0x018a }
            X.A6T r11 = r9.A0Z     // Catch:{ RemoteException -> 0x018a }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ RemoteException -> 0x018a }
        L_0x011a:
            boolean r0 = r17.hasNext()     // Catch:{ RemoteException -> 0x018a }
            if (r0 == 0) goto L_0x0153
            java.lang.Object r10 = r17.next()     // Catch:{ RemoteException -> 0x018a }
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch:{ RemoteException -> 0x018a }
            java.lang.Class<com.facebook.cameracore.util.memory.VersionedSharedMemory> r0 = com.facebook.cameracore.util.memory.VersionedSharedMemory.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ RemoteException -> 0x018a }
            r10.setClassLoader(r0)     // Catch:{ RemoteException -> 0x018a }
            java.lang.String r0 = "serviceType"
            boolean r1 = r10.containsKey(r0)     // Catch:{ RemoteException -> 0x018a }
            if (r1 == 0) goto L_0x011a
            int r0 = r10.getInt(r0)     // Catch:{ RemoteException -> 0x018a }
            java.util.Map r1 = r11.A02     // Catch:{ RemoteException -> 0x018a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RemoteException -> 0x018a }
            boolean r16 = r1.containsKey(r0)     // Catch:{ RemoteException -> 0x018a }
            if (r16 == 0) goto L_0x011a
            java.lang.Object r0 = r1.get(r0)     // Catch:{ RemoteException -> 0x018a }
            X.B38 r0 = (X.B38) r0     // Catch:{ RemoteException -> 0x018a }
            if (r0 == 0) goto L_0x011a
            r0.FKT(r10)     // Catch:{ RemoteException -> 0x018a }
            goto L_0x011a
        L_0x0153:
            com.meta.arfx.engine.interfaces.IAREngineServiceController r1 = r9.A0A     // Catch:{ RemoteException -> 0x018a }
            if (r1 == 0) goto L_0x0195
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x018a }
            r0.<init>()     // Catch:{ RemoteException -> 0x018a }
            java.util.Map r10 = r11.A02     // Catch:{ RemoteException -> 0x018a }
            java.util.Collection r10 = r10.values()     // Catch:{ RemoteException -> 0x018a }
            java.util.Iterator r11 = r10.iterator()     // Catch:{ RemoteException -> 0x018a }
        L_0x0166:
            boolean r10 = r11.hasNext()     // Catch:{ RemoteException -> 0x018a }
            if (r10 == 0) goto L_0x017c
            java.lang.Object r10 = r11.next()     // Catch:{ RemoteException -> 0x018a }
            X.B38 r10 = (X.B38) r10     // Catch:{ RemoteException -> 0x018a }
            java.util.List r10 = r10.EzR()     // Catch:{ RemoteException -> 0x018a }
            if (r10 == 0) goto L_0x0166
            r0.addAll(r10)     // Catch:{ RemoteException -> 0x018a }
            goto L_0x0166
        L_0x017c:
            r20 = r1
            r21 = r0
            r22 = r15
            r27 = r33
            r29 = r19
            r20.APu(r21, r22, r23, r24, r25, r27, r29)     // Catch:{ RemoteException -> 0x018a }
            goto L_0x0195
        L_0x018a:
            r10 = move-exception
            java.lang.Class<X.AIb> r1 = X.AIb.class
            java.lang.String r0 = "doFrame() failed: "
            X.0KC.A05(r1, r0, r10)     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
            X.AIb.A00(r9)     // Catch:{ 7sx -> 0x0197, all -> 0x023e }
        L_0x0195:
            r10 = 1
            goto L_0x01d8
        L_0x0197:
            r11 = move-exception
            r10 = 1
            goto L_0x01a4
        L_0x019a:
            r1 = move-exception
            goto L_0x0228
        L_0x019d:
            r11 = move-exception
            goto L_0x01a3
        L_0x019f:
            r11 = move-exception
            r10 = 0
            goto L_0x01a4
        L_0x01a2:
            r11 = move-exception
        L_0x01a3:
            r10 = 0
        L_0x01a4:
            java.lang.Class<X.8t4> r1 = X.C368648t4.class
            java.lang.String r0 = "Copy rendering of input texture failed: "
            X.0KC.A05(r1, r0, r11)     // Catch:{ all -> 0x0223 }
            if (r10 != 0) goto L_0x01d8
            r9.A03()
            X.7uK r0 = r2.A03
            if (r0 == 0) goto L_0x01b7
            r0.A02()
        L_0x01b7:
            r2.A03 = r8
            android.view.Surface r0 = r2.A01
            if (r0 == 0) goto L_0x01c0
            r0.release()
        L_0x01c0:
            r2.A01 = r8
            goto L_0x01d8
        L_0x01c3:
            r9.A03()
            X.7uK r0 = r2.A03
            if (r0 == 0) goto L_0x01cd
            r0.A02()
        L_0x01cd:
            r2.A03 = r8
            android.view.Surface r0 = r2.A01
            if (r0 == 0) goto L_0x01d6
            r0.release()
        L_0x01d6:
            r2.A01 = r8
        L_0x01d8:
            android.opengl.EGL14.eglMakeCurrent(r7, r5, r6, r12)
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x01ed
            android.graphics.SurfaceTexture r0 = r2.A00
            if (r0 == 0) goto L_0x01e6
            r0.updateTexImage()
        L_0x01e6:
            android.graphics.SurfaceTexture r0 = r2.A00
            if (r0 == 0) goto L_0x01ed
            r0.getTransformMatrix(r13)
        L_0x01ed:
            if (r10 == 0) goto L_0x0240
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0240
            X.7v0 r0 = r2.A05
            if (r0 == 0) goto L_0x0240
            boolean r0 = r9.A09()
            if (r0 == 0) goto L_0x0240
            X.7v0 r5 = r2.A05     // Catch:{ 7sx -> 0x021d }
            if (r5 == 0) goto L_0x0216
            X.7v3 r0 = r5.A02     // Catch:{ 7sx -> 0x021d }
            if (r0 == 0) goto L_0x0216
            int r1 = r0.A01     // Catch:{ 7sx -> 0x021d }
        L_0x0207:
            X.7v3 r0 = r5.A02     // Catch:{ 7sx -> 0x021d }
            if (r0 == 0) goto L_0x021a
            int r0 = r0.A00     // Catch:{ 7sx -> 0x021d }
        L_0x020d:
            r6 = r2
            r7 = r13
            r8 = r1
            r9 = r0
            r10 = r4
            X.C368648t4.A00(r5, r6, r7, r8, r9, r10)     // Catch:{ 7sx -> 0x021d }
            goto L_0x021c
        L_0x0216:
            r1 = 0
            if (r5 == 0) goto L_0x021a
            goto L_0x0207
        L_0x021a:
            r0 = 0
            goto L_0x020d
        L_0x021c:
            return r18
        L_0x021d:
            r2 = move-exception
            java.lang.Class<X.8t4> r1 = X.C368648t4.class
            java.lang.String r0 = "Copy rendering of output texture failed: "
            goto L_0x025e
        L_0x0223:
            r1 = move-exception
            if (r10 != 0) goto L_0x023f
            goto L_0x0228
        L_0x0227:
            r1 = move-exception
        L_0x0228:
            r9.A03()
            X.7uK r0 = r2.A03
            if (r0 == 0) goto L_0x0232
            r0.A02()
        L_0x0232:
            r2.A03 = r8
            android.view.Surface r0 = r2.A01
            if (r0 == 0) goto L_0x023b
            r0.release()
        L_0x023b:
            r2.A01 = r8
            throw r1
        L_0x023e:
            r1 = move-exception
        L_0x023f:
            throw r1
        L_0x0240:
            X.7v0 r4 = r2.A04
            if (r4 == 0) goto L_0x0261
            X.7v3 r0 = r4.A02     // Catch:{ 7sx -> 0x0259 }
            if (r0 == 0) goto L_0x0255
            int r1 = r0.A01     // Catch:{ 7sx -> 0x0259 }
            int r0 = r0.A00     // Catch:{ 7sx -> 0x0259 }
        L_0x024c:
            r5 = r2
            r6 = r14
            r7 = r1
            r8 = r0
            r9 = r3
            X.C368648t4.A00(r4, r5, r6, r7, r8, r9)     // Catch:{ 7sx -> 0x0259 }
            goto L_0x0258
        L_0x0255:
            r1 = 0
            r0 = 0
            goto L_0x024c
        L_0x0258:
            return r18
        L_0x0259:
            r2 = move-exception
            java.lang.Class<X.8t4> r1 = X.C368648t4.class
            java.lang.String r0 = "Copy rendering of camera texture failed: "
        L_0x025e:
            X.0KC.A05(r1, r0, r2)
        L_0x0261:
            r18 = 0
        L_0x0263:
            return r18
        L_0x0264:
            X.8t5 r9 = r6.A0B
            r13 = r1
            r14 = r0
            r17 = r33
            boolean r18 = r9.APt(r10, r11, r12, r13, r14, r15, r17, r19)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368628t2.APt(X.8tL, java.lang.Integer, float[], float[], float[], long, long, boolean):boolean");
    }

    public final void ErR(int i, int i2, int i3, int i4, boolean z) {
        C368648t4 r0;
        int i5 = i;
        this.A04 = i;
        int i6 = i2;
        this.A03 = i2;
        int i7 = i3;
        this.A08 = i3;
        int i8 = i4;
        this.A07 = i4;
        boolean z2 = z;
        this.A0A = z;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.ErR(i5, i6, i7, i8, z2);
        } else if (intValue == 2 && (r0 = this.A0C) != null) {
            r0.A0C.A04(i5, i6, i7, i8, z2);
        }
    }

    public final void AHJ() {
        C368648t4 r0;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.AHJ();
        } else if (intValue == 2 && (r0 = this.A0C) != null) {
            C368648t4.A01(r0);
            AIb aIb = r0.A0C;
            aIb.A0B = AnonymousClass05K.A00;
            IAREngineServiceController iAREngineServiceController = aIb.A0A;
            if (iAREngineServiceController != null) {
                try {
                    iAREngineServiceController.AHJ();
                } catch (RemoteException e) {
                    0KC.A05(AIb.class, "cleanupServices() failed: ", e);
                    AIb.A00(aIb);
                }
            }
        }
    }

    public final List AN1(C371698yt r2) {
        C368648t4 r0 = this.A0C;
        if (r0 != null) {
            r0.A0D.A00 = r2;
        }
        List AN1 = this.A0B.AN1(r2);
        0qQ.A07(AN1);
        return AN1;
    }

    public final AnalyticsLogger AbS() {
        AnalyticsLogger analyticsLogger;
        C368648t4 r0 = this.A0C;
        if (r0 == null || (analyticsLogger = r0.A0A) == null) {
            return this.A0B.B0D().getAnalyticsLogger();
        }
        return analyticsLogger;
    }

    public final EffectServiceHost B0D() {
        EffectServiceHost B0D = this.A0B.B0D();
        0qQ.A07(B0D);
        return B0D;
    }

    public final int B3h() {
        return C368658t5.A00(this.A0B).getFacesCount();
    }

    public final EffectManifest BOt() {
        return this.A09;
    }

    public final boolean CJk() {
        if (this.A0B.A0D != null) {
            return true;
        }
        return false;
    }

    public final void EF9() {
        C368648t4 r2 = this.A0C;
        if (r2 != null) {
            r2.A02();
        }
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.EF9();
        } else if (intValue == 2 && r2 != null) {
            C368578ss r0 = this.A0F;
            boolean z = r0.A04;
            r2.A0C.A06(r0.A01, 0, z, r0.A02, false);
        }
    }

    public final void EFB() {
        C368648t4 r0;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.EFB();
        } else if (intValue == 2 && (r0 = this.A0C) != null) {
            AIb aIb = r0.A0C;
            Integer num = aIb.A0D;
            Integer num2 = AnonymousClass05K.A0C;
            if (num == num2) {
                num = AnonymousClass05K.A01;
            }
            aIb.A0D = num;
            Integer num3 = aIb.A0E;
            if (num3 == num2) {
                num3 = AnonymousClass05K.A01;
            }
            aIb.A0E = num3;
            Integer num4 = AnonymousClass05K.A00;
            aIb.A0F = num4;
            aIb.A0B = num4;
            aIb.A0C = num4;
            IAREngineServiceController iAREngineServiceController = aIb.A0A;
            if (iAREngineServiceController != null) {
                try {
                    iAREngineServiceController.EFB();
                } catch (RemoteException e) {
                    0KC.A05(AIb.class, "renderSessionReleaseGl() failed: ", e);
                    AIb.A00(aIb);
                }
            }
        }
        this.A01 = AnonymousClass05K.A00;
    }

    public final void EFC(int i, int i2) {
        C368648t4 r3;
        C346337v0 r0;
        C346367v3 r1;
        this.A06 = i;
        this.A05 = i2;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.EFC(i, i2);
        } else if (intValue == 2 && (r3 = this.A0C) != null) {
            if (r3.A00 == null || (r0 = r3.A05) == null || (r1 = r0.A02) == null || i != r1.A01 || i2 != r1.A00) {
                C346327uz r12 = new C346327uz("AREngineOutput");
                r12.A03 = 36197;
                r12.A04 = i;
                r12.A02 = i2;
                r12.A00 = 6408;
                C346337v0 r02 = new C346337v0(r12);
                r3.A05 = r02;
                SurfaceTexture surfaceTexture = new SurfaceTexture(r02.A00);
                r3.A00 = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(i, i2);
                SurfaceTexture surfaceTexture2 = r3.A00;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.setOnFrameAvailableListener(r3.A09);
                }
                r3.A08 = false;
                r3.A0C.A05(new Surface(r3.A00), i, i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = r0.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EIk() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0027
            r0 = 2
            if (r1 != r0) goto L_0x002c
            X.8t4 r0 = r4.A0C
            if (r0 == 0) goto L_0x002c
            X.AIb r3 = r0.A0C
            com.meta.arfx.engine.interfaces.IAREngineServiceController r0 = r3.A0A
            if (r0 == 0) goto L_0x002c
            r0.EHx()     // Catch:{ RemoteException -> 0x001a }
            goto L_0x0026
        L_0x001a:
            r2 = move-exception
            java.lang.Class<X.AIb> r1 = X.AIb.class
            java.lang.String r0 = "resetCurrentEffect() failed: "
            X.0KC.A05(r1, r0, r2)
            X.AIb.A00(r3)
            return
        L_0x0026:
            return
        L_0x0027:
            X.8t5 r0 = r4.A0B
            r0.EIk()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368628t2.EIk():void");
    }

    public final void EQO(int i) {
        C368648t4 r0;
        this.A02 = i;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.EQO(i);
        } else if (intValue == 2 && (r0 = this.A0C) != null) {
            AIb aIb = r0.A0C;
            aIb.A00 = i;
            IAREngineServiceController iAREngineServiceController = aIb.A0A;
            if (iAREngineServiceController != null) {
                try {
                    iAREngineServiceController.EQO(i);
                } catch (RemoteException e) {
                    0KC.A05(AIb.class, "setCameraFacing() failed: ", e);
                    AIb.A00(aIb);
                }
            }
        }
    }

    public final void EQV(int i, int i2, int i3, int i4) {
        C368648t4 r2;
        C346367v3 r1;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.EQV(i, i2, i3, i4);
        } else if (intValue == 2 && (r2 = this.A0C) != null) {
            C346337v0 r12 = r2.A04;
            if (r12 == null || i != r12.A00 || i2 != r12.A01 || (r1 = r12.A02) == null || i3 != r1.A01 || i4 != r1.A00) {
                C346327uz r13 = new C346327uz("CameraTexture");
                r13.A03 = i2;
                r13.A04 = i3;
                r13.A02 = i4;
                r13.A00 = 6408;
                r13.A01 = i;
                r2.A04 = new C346337v0(r13);
            }
        }
    }

    public final void EyA() {
        C368648t4 r0;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            this.A0B.EyA();
        } else if (intValue == 2 && (r0 = this.A0C) != null) {
            C368648t4.A01(r0);
            AIb aIb = r0.A0C;
            aIb.A0B = AnonymousClass05K.A00;
            aIb.A0c.clear();
            IAREngineServiceController iAREngineServiceController = aIb.A0A;
            if (iAREngineServiceController != null) {
                try {
                    iAREngineServiceController.EyA();
                } catch (RemoteException e) {
                    0KC.A05(AIb.class, "stopEffect() failed: ", e);
                    AIb.A00(aIb);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        if (r2 != null) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKR(X.ASJ r35, int r36, boolean r37) {
        /*
            r34 = this;
            r3 = r34
            java.lang.Integer r0 = r3.A01
            int r1 = r0.intValue()
            r0 = 1
            r2 = r35
            r25 = r36
            r15 = r37
            if (r1 == r0) goto L_0x013e
            r0 = 2
            if (r1 != r0) goto L_0x0145
            X.8t4 r10 = r3.A0C
            if (r10 == 0) goto L_0x0145
            r9 = 0
            java.lang.Object r0 = r2.get()
            X.0qQ.A07(r0)
            X.ADH r0 = (X.ADH) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            byte[] r1 = r0.A0A
            r8 = 0
            if (r1 == 0) goto L_0x00e0
            int r3 = r1.length
        L_0x0037:
            java.nio.ByteBuffer r1 = r10.A07
            if (r1 == 0) goto L_0x0044
            int r1 = r1.capacity()
            if (r3 <= r1) goto L_0x0044
            X.C368648t4.A01(r10)
        L_0x0044:
            com.facebook.cameracore.util.memory.VersionedSharedMemory r1 = r10.A02
            if (r1 != 0) goto L_0x005f
            X.ALJ r2 = com.facebook.cameracore.util.memory.VersionedSharedMemory.CREATOR
            java.lang.String r1 = "arEngine_frameData"
            com.facebook.cameracore.util.memory.VersionedSharedMemory r1 = r2.A01(r1, r3)
            r10.A02 = r1
            java.nio.ByteBuffer r1 = r1.mapReadWrite()
            r10.A07 = r1
            X.AIb r2 = r10.A0C
            com.facebook.cameracore.util.memory.VersionedSharedMemory r1 = r10.A02
            r2.A07(r1)
        L_0x005f:
            java.nio.ByteBuffer r1 = r10.A07
            if (r1 == 0) goto L_0x0066
            r1.position(r9)
        L_0x0066:
            byte[] r2 = r0.A0A
            if (r2 == 0) goto L_0x00cb
            java.nio.ByteBuffer r1 = r10.A07
            if (r1 == 0) goto L_0x0071
            r1.put(r2)
        L_0x0071:
            X.AIb r10 = r10.A0C
            int r14 = r0.A03
            long r4 = r0.A07
            boolean r12 = r0.A09
            int r11 = r0.A04
            int r9 = r0.A02
            android.util.Pair r2 = r0.A08
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r1 = r2.first
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00c3
            float r19 = r1.floatValue()
        L_0x008b:
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00c8
            float r20 = r1.floatValue()
        L_0x0095:
            float r8 = r0.A00
            long r2 = r0.A06
            long r0 = r0.A05
            int[] r16 = X.00k.A0x(r13)
            int[] r17 = X.00k.A0x(r7)
            int[] r18 = X.00k.A0x(r6)
            com.meta.arfx.engine.interfaces.IAREngineServiceController r6 = r10.A0A
            if (r6 == 0) goto L_0x0145
            boolean r6 = X.AIb.A02(r10)
            if (r6 == 0) goto L_0x0145
            java.lang.Integer r7 = r10.A0C
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r7 != r6) goto L_0x00bc
            com.facebook.cameracore.util.memory.VersionedSharedMemory r6 = r10.A09
            r10.A07(r6)
        L_0x00bc:
            java.lang.Integer r7 = r10.A0C
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r7 != r6) goto L_0x0145
            goto L_0x0117
        L_0x00c3:
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x00c8
            goto L_0x008b
        L_0x00c8:
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0095
        L_0x00cb:
            X.7sh[] r4 = r0.A0C
            if (r4 == 0) goto L_0x0071
            int r3 = r4.length
        L_0x00d0:
            if (r8 >= r3) goto L_0x0071
            r1 = r4[r8]
            java.nio.ByteBuffer r2 = r10.A07
            if (r2 == 0) goto L_0x00dd
            java.nio.ByteBuffer r1 = r1.A02
            r2.put(r1)
        L_0x00dd:
            int r8 = r8 + 1
            goto L_0x00d0
        L_0x00e0:
            X.7sh[] r5 = r0.A0C
            if (r5 == 0) goto L_0x0114
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L_0x00e7:
            if (r2 >= r4) goto L_0x0037
            r11 = r5[r2]
            java.nio.ByteBuffer r1 = r11.A02
            int r1 = r1.remaining()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.add(r1)
            int r1 = r11.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.add(r1)
            int r1 = r11.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.add(r1)
            java.nio.ByteBuffer r1 = r11.A02
            int r1 = r1.remaining()
            int r3 = r3 + r1
            int r2 = r2 + 1
            goto L_0x00e7
        L_0x0114:
            r3 = 0
            goto L_0x0037
        L_0x0117:
            com.meta.arfx.engine.interfaces.IAREngineServiceController r6 = r10.A0A     // Catch:{ RemoteException -> 0x0132 }
            if (r6 == 0) goto L_0x0145
            r28 = r2
            r30 = r0
            r32 = r12
            r33 = r15
            r21 = r8
            r22 = r14
            r23 = r11
            r24 = r9
            r26 = r4
            r15 = r6
            r15.FKS(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r33)     // Catch:{ RemoteException -> 0x0132 }
            return
        L_0x0132:
            r2 = move-exception
            java.lang.Class<X.AIb> r1 = X.AIb.class
            java.lang.String r0 = "updateFrame() failed: "
            X.0KC.A05(r1, r0, r2)
            X.AIb.A00(r10)
            return
        L_0x013e:
            X.8t5 r1 = r3.A0B
            r0 = r25
            r1.FKR(r2, r0, r15)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368628t2.FKR(X.ASJ, int, boolean):void");
    }

    public final void finalize() {
        C368648t4 r0 = this.A0C;
        if (r0 != null) {
            r0.finalize();
        }
        C368658t5.A01(this.A0B);
    }

    /* JADX WARNING: type inference failed for: r0v89, types: [java.lang.Object, X.B0z] */
    public final void EUo(AsyncAssetFetcher asyncAssetFetcher, ProductFeatureConfig productFeatureConfig, C312596el r32, ComponentSyncListener componentSyncListener, C368798tL r34, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        String str7 = str;
        0qQ.A0B(str7, 0);
        String str8 = str2;
        0qQ.A0B(str8, 1);
        String str9 = str3;
        0qQ.A0B(str9, 2);
        C312596el r13 = r32;
        0qQ.A0B(r13, 5);
        List list2 = list;
        0qQ.A0B(list2, 8);
        C368798tL r12 = r34;
        0qQ.A0B(r12, 12);
        String str10 = str6;
        EffectManifest createFromDir = EffectManifest.createFromDir(str10);
        this.A09 = createFromDir;
        Integer num = AnonymousClass05K.A01;
        C368648t4 r5 = this.A0C;
        if (r5 != null) {
            List enabledCapabilities = createFromDir.getEnabledCapabilities();
            0qQ.A07(enabledCapabilities);
            if (this.A0G.containsAll(enabledCapabilities)) {
                num = AnonymousClass05K.A0C;
            }
        }
        if (num != this.A01) {
            EFB();
            this.A01 = num;
            EFC(this.A06, this.A05);
            EF9();
            ErR(this.A04, this.A03, this.A08, this.A07, this.A0A);
            EQO(this.A02);
            int i = this.A00;
            this.A00 = i;
            int intValue = this.A01.intValue();
            if (intValue == 1) {
                C368658t5.A00(this.A0B).setCameraSensorRotation(i);
            } else if (intValue == 2 && r5 != null) {
                AIb aIb = r5.A0C;
                aIb.A01 = i;
                IAREngineServiceController iAREngineServiceController = aIb.A0A;
                if (iAREngineServiceController != null) {
                    try {
                        iAREngineServiceController.EQT(i);
                    } catch (RemoteException e) {
                        0KC.A05(AIb.class, "setCameraSensorRotation() failed: ", e);
                        AIb.A00(aIb);
                    }
                }
            }
        }
        int intValue2 = this.A01.intValue();
        String str11 = str4;
        String str12 = str5;
        if (intValue2 == 1) {
            C312596el r18 = r13;
            C368658t5 r15 = this.A0B;
            r15.EUo(asyncAssetFetcher, productFeatureConfig, r18, (ComponentSyncListener) null, r12, str7, str8, str9, str11, str12, str10, list2, true);
        } else if (intValue2 == 2 && r5 != null) {
            int i2 = r13.A00;
            int i3 = r12.A00.A00;
            EffectManifest effectManifest = this.A09;
            A6T a6t = r5.A0D;
            Map map = a6t.A02;
            map.clear();
            map.put(12, new C40104ARr());
            map.put(38, new Object());
            if (effectManifest != null) {
                if (effectManifest.getServiceNeeded(C312446eR.FaceTrackingDataProvider)) {
                    map.put(24, new C40713Ahi());
                }
                if (effectManifest.getServiceNeeded(C312446eR.NativeUIControlService)) {
                    map.put(58, new C40712Ahh());
                }
                if (effectManifest.getServiceNeeded(C312446eR.LocaleService)) {
                    map.put(46, new C40708Ahd());
                }
                if (effectManifest.getServiceNeeded(C312446eR.HapticService)) {
                    map.put(37, new Object());
                }
                if (effectManifest.getServiceNeeded(C312446eR.MotionDataProvider)) {
                    map.put(51, new ARd());
                }
                if (effectManifest.getServiceNeeded(C312446eR.GalleryPickerService)) {
                    map.put(29, new C40715Ahk());
                }
                if (effectManifest.getServiceNeeded(C312446eR.ExternalAssetProvider)) {
                    map.put(22, new Object());
                }
                if (effectManifest.getServiceNeeded(C312446eR.TouchGesturesDataProvider)) {
                    map.put(22, new AS6());
                }
                if (effectManifest.getServiceNeeded(C312446eR.WorldTrackingDataProvider)) {
                    map.put(22, new Object());
                }
                if (effectManifest.getServiceNeeded(C312446eR.PersistenceService)) {
                    map.put(64, new C40716Ahl(new NetworkClientImpl(new Object())));
                }
                if (effectManifest.getServiceNeeded(C312446eR.PlatformEventsDataProvider)) {
                    map.put(67, new ARg());
                }
                if (effectManifest.getServiceNeeded(C312446eR.GraphQLService)) {
                    map.put(32, new Object());
                }
            }
            List list3 = a6t.A01;
            list3.clear();
            if (effectManifest != null) {
                if (effectManifest.getServiceNeeded(C312446eR.WOLFService)) {
                    1US r0 = 1US.A04;
                    list3.add("arservicesforwolf");
                }
                if (effectManifest.getServiceNeeded(C312446eR.UnifiedTargetTrackingDataProvider)) {
                    1US r02 = 1US.A04;
                    list3.add("arservicesforunifiedtargettracking");
                    list3.add("slam");
                }
                if (effectManifest.getServiceNeeded(C312446eR.GenericMLService)) {
                    1US r03 = 1US.A04;
                    list3.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
                    list3.add("arservicesforgenericml");
                }
                if (effectManifest.getServiceNeeded(C312446eR.ExpressionFittingDataProvider)) {
                    1US r04 = 1US.A04;
                    list3.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
                    list3.add("arservicesforexpressionfitting");
                }
                if (effectManifest.getServiceNeeded(C312446eR.HandTrackingDataProvider)) {
                    1US r05 = 1US.A04;
                    list3.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
                    list3.add("arservicesforhandtracking");
                    map.put(36, new Object());
                }
                C312446eR r122 = C312446eR.HairSegmentationDataProvider;
                if (effectManifest.getServiceNeeded(r122)) {
                    1US r06 = 1US.A04;
                    list3.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
                    list3.add("arservicesforhairsegmentation");
                    map.put(34, new C40711Ahg(r122));
                }
                C312446eR r123 = C312446eR.PersonSegmentationDataProvider;
                if (effectManifest.getServiceNeeded(r123)) {
                    1US r07 = 1US.A04;
                    list3.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
                    list3.add("arservicesforpersonsegmentation");
                    map.put(65, new C40717Ahm(r123));
                }
                C312446eR r6 = C312446eR.BodyTrackingDataProvider;
                if (effectManifest.getServiceNeeded(r6)) {
                    1US r08 = 1US.A04;
                    list3.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
                    list3.add("arservicesforbodytracking");
                    map.put(7, new C40717Ahm(r6));
                }
            }
            for (B38 CMw : map.values()) {
                CMw.CMw(a6t.A00);
            }
            r5.A0C.A08(str7, str8, str9, str12, str11, str10, i2, i3, true);
        }
    }
}
