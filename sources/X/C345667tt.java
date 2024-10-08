package X;

import android.graphics.Bitmap;
import android.os.Looper;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7tt  reason: invalid class name and case insensitive filesystem */
public final class C345667tt extends C344467ru implements C345677tu {
    public int A00;
    public C345607tn A01;
    public C345547th A02;
    public C344397rn A03;
    public final C344037rD A04;
    public final C341027mD A05 = new AUA(this);
    public final C343927r2 A06;
    public final Object A07 = new Object();
    public volatile C39671A4l A08;
    public volatile boolean A09 = true;

    public static void A01(C345667tt r2) {
        synchronized (r2.A07) {
            r2.A08 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, X.A4l] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r0.CKl() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010d, code lost:
        if (((X.C345597tm) r13.A01).A00 != 1) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EzW(X.A7O r21, X.C41807B1m r22, X.A3F r23) {
        /*
            r20 = this;
            r12 = r22
            r2 = r21
            boolean r0 = r12 instanceof X.B3L
            if (r0 != 0) goto L_0x0027
            boolean r0 = r12 instanceof X.C40091AQw
            if (r0 != 0) goto L_0x0027
            boolean r0 = r12 instanceof X.Slp
            if (r0 != 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Photo callback type not supported: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            r13 = r20
            X.7rn r0 = r13.A03
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.CKl()
            r3 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r21 != 0) goto L_0x004f
            X.A7O r2 = new X.A7O
            r2.<init>()
            r2.A03 = r8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r2.A05 = r7
            r2.A04 = r7
            r0 = 0
            r2.A00 = r0
            r2.A02 = r1
            r2.A01 = r1
        L_0x004f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r2.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x00e0
            X.7tn r0 = r13.A01
            boolean r0 = r0.CY8()
            if (r0 == 0) goto L_0x00e0
        L_0x0063:
            r11 = 1
        L_0x0064:
            X.7rD r5 = r13.A04
            if (r5 == 0) goto L_0x0075
            java.lang.String r3 = "PhotoCaptureControllerImpl"
            int r1 = r13.hashCode()
            if (r11 == 0) goto L_0x00dd
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0072:
            X.C363798kM.A00(r5, r0, r3, r1)
        L_0x0075:
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x009a
            java.lang.String r1 = "Cannot take photo while camera is paused."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            X.ALI.A03(r12, r0)
        L_0x0083:
            if (r5 == 0) goto L_0x0099
            java.lang.String r4 = "PhotoCaptureControllerImpl"
            int r3 = r13.hashCode()
            java.lang.String r2 = "validateReadyToTakePhoto failed"
            r0 = 10000(0x2710, float:1.4013E-41)
            X.9dR r1 = new X.9dR
            r1.<init>((int) r0, (java.lang.String) r2)
            java.lang.String r0 = "medium"
            X.C363808kN.A00(r1, r5, r4, r0, r3)
        L_0x0099:
            return
        L_0x009a:
            java.lang.Object r6 = r13.A07
            monitor-enter(r6)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0176 }
            X.A4l r0 = r13.A08     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x00b8
            X.A4l r0 = r13.A08     // Catch:{ all -> 0x0176 }
            long r0 = r0.A00     // Catch:{ all -> 0x0176 }
            long r3 = r3 - r0
            r9 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b4
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0176 }
            monitor-exit(r6)     // Catch:{ all -> 0x0176 }
            goto L_0x00ca
        L_0x00b4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0176 }
            monitor-exit(r6)     // Catch:{ all -> 0x0176 }
            goto L_0x00ca
        L_0x00b8:
            X.A4l r0 = new X.A4l     // Catch:{ all -> 0x0176 }
            r0.<init>()     // Catch:{ all -> 0x0176 }
            r13.A08 = r0     // Catch:{ all -> 0x0176 }
            X.A4l r0 = r13.A08     // Catch:{ all -> 0x0176 }
            r0.A01 = r12     // Catch:{ all -> 0x0176 }
            X.A4l r0 = r13.A08     // Catch:{ all -> 0x0176 }
            r0.A00 = r3     // Catch:{ all -> 0x0176 }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0176 }
            monitor-exit(r6)     // Catch:{ all -> 0x0176 }
        L_0x00ca:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0083
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00e2
            java.lang.String r1 = "Another photo capture in progress."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            X.ALI.A03(r12, r0)
            goto L_0x0083
        L_0x00dd:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0072
        L_0x00e0:
            r11 = 0
            goto L_0x0064
        L_0x00e2:
            java.io.File r3 = r2.A00
            r14 = r23
            if (r3 == 0) goto L_0x00f2
            if (r23 != 0) goto L_0x00f2
            java.lang.String r1 = "Photo file was requested but file callback not provided."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            android.os.SystemClock.elapsedRealtime()
            boolean r6 = r2.A03
            boolean r5 = r2.A05
            boolean r9 = r2.A04
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0105
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x010f
        L_0x0105:
            X.7tn r0 = r13.A01
            X.7tm r0 = (X.C345597tm) r0
            int r0 = r0.A00
            r18 = 1
            if (r0 == r8) goto L_0x0111
        L_0x010f:
            r18 = 0
        L_0x0111:
            X.8kg r4 = new X.8kg
            r4.<init>()
            X.8kh r1 = X.C363988kg.A05
            r0 = r9 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01(r1, r0)
            X.8kh r1 = X.C363988kg.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.A01(r1, r0)
            X.8kh r1 = X.C363988kg.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r4.A01(r1, r0)
            X.7th r0 = r13.A02
            android.view.View r0 = r0.Bf9()
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            X.7pa r15 = new X.7pa
            r15.<init>(r1, r0)
            if (r11 == 0) goto L_0x0159
            X.AV3 r11 = new X.AV3
            r17 = r6
            r19 = r5
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.7tn r0 = r13.A01
            r0.EzY(r11, r4)
            return
        L_0x0159:
            boolean r0 = r12 instanceof X.Slp
            if (r0 != 0) goto L_0x016e
            X.7th r1 = r13.A02
            X.AQw r0 = new X.AQw
            r4 = r0
            r5 = r2
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r1.Bes(r0)
            return
        L_0x016e:
            java.lang.String r1 = "Jpeg callback not supported for preview capture."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0176:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0176 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345667tt.EzW(X.A7O, X.B1m, X.A3F):void");
    }

    public C345667tt(C343837qt r3) {
        C344037rD r0;
        this.A00 = r3;
        C343937r3 r1 = C343927r2.A00;
        C343837qt r02 = this.A00;
        r02.getClass();
        this.A06 = (C343927r2) r02.Apf(r1);
        C343937r3 r12 = C344037rD.A00;
        C343837qt r03 = this.A00;
        r03.getClass();
        if (r03.CQO(r12)) {
            C343837qt r04 = this.A00;
            r04.getClass();
            r0 = (C344037rD) r04.Apf(r12);
        } else {
            r0 = null;
        }
        this.A04 = r0;
    }

    public static void A00(Bitmap bitmap, C41807B1m b1m, C39669A4j a4j, C345667tt r5, A3F a3f, File file) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("Method handlePreviewPhotoTaken must be invoked on a background thread");
        } else if (file == null || a3f == null) {
            A01(r5);
            ALI.A01(bitmap, b1m, a4j, (C39670A4k) null);
        } else {
            IOException A022 = AHH.A02(bitmap, file);
            A01(r5);
            ALI.A01(bitmap, b1m, a4j, (C39670A4k) null);
            ALI.A05(a3f, file, A022);
        }
    }
}
