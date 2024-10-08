package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.view.SelfieCaptureActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Slo  reason: case insensitive filesystem */
public final class C12061Slo implements C41825B2g, C13554TcQ {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public RFH A07;
    public C11257SHr A08;
    public Q7t A09;
    public Integer A0A = AnonymousClass05K.A00;
    public Integer A0B;
    public WeakReference A0C;
    public WeakReference A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G = -1;
    public final long A0H;
    public final ChallengeProvider A0I;
    public final SelfieCaptureConfig A0J;
    public final InMemoryLogger A0K;
    public final SelfieCaptureLogger A0L;
    public final C10832Rys A0M;
    public final C10562RuG A0N;
    public final C10680RwJ A0O;
    public final WeakReference A0P;
    public final WeakReference A0Q;

    public final void D07(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A0L.logError("Selfie presenter: camera error", exc);
    }

    public final void D0C(String str, String str2) {
    }

    public final void D0G() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPreviewFrame(X.C10843Rz3 r26) {
        /*
            r25 = this;
            r8 = 0
            r9 = r25
            java.lang.Integer r0 = r9.A0A
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r0 != r1) goto L_0x01e3
            X.Rz3 r7 = X.C9574RdE.A00(r26)
            int r15 = r7.A03
            r9.A05 = r15
            int r14 = r7.A00
            r9.A04 = r14
            X.SHr r10 = r9.A08
            X.Q7t r6 = r9.A09
            if (r10 == 0) goto L_0x01e3
            if (r6 == 0) goto L_0x01e3
            java.lang.Integer r0 = r9.A0A
            if (r0 != r1) goto L_0x01e3
            int r13 = r9.A02
            X.SEc r11 = r10.A07
            if (r11 != 0) goto L_0x002c
            X.C11257SHr.A00(r10)
            X.SEc r11 = r10.A07
        L_0x002c:
            r18 = 0
            if (r11 == 0) goto L_0x010d
            r5 = 33888866(0x2051a62, float:9.778868E-38)
            com.facebook.smartcapture.logging.SmartCaptureLogger r4 = r10.A04     // Catch:{ Exception -> 0x00e8 }
            r4.qplMarkerStart(r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = "event"
            java.lang.String r0 = "track"
            r4.qplMarkerAnnotate((int) r5, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = "tracker"
            java.lang.String r0 = "aml"
            r4.qplMarkerAnnotate((int) r5, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x00e8 }
            byte[] r3 = r7.A0A     // Catch:{ Exception -> 0x00e8 }
            r0 = 0
            if (r3 == 0) goto L_0x00df
            X.RrQ r2 = r11.A01     // Catch:{ Exception -> 0x00e8 }
            int r12 = r3.length     // Catch:{ Exception -> 0x00e8 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00e8 }
            int r1 = r2.A00     // Catch:{ all -> 0x0069 }
            if (r1 != r12) goto L_0x0060
            java.nio.ByteBuffer r1 = r2.A01     // Catch:{ all -> 0x0069 }
            r1.clear()     // Catch:{ all -> 0x0069 }
        L_0x005a:
            java.nio.ByteBuffer r12 = r2.A01     // Catch:{ all -> 0x0069 }
            X.0qQ.A06(r12)     // Catch:{ all -> 0x0069 }
            goto L_0x006c
        L_0x0060:
            r2.A00 = r12     // Catch:{ all -> 0x0069 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r12)     // Catch:{ all -> 0x0069 }
            r2.A01 = r1     // Catch:{ all -> 0x0069 }
            goto L_0x005a
        L_0x0069:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x00e8 }
            throw r0     // Catch:{ Exception -> 0x00e8 }
        L_0x006c:
            monitor-exit(r2)     // Catch:{ Exception -> 0x00e8 }
            r12.put(r3)     // Catch:{ Exception -> 0x00e8 }
            com.facebook.facedetection.amlfacetracker.AMLFaceTracker r1 = r11.A00     // Catch:{ Exception -> 0x00e8 }
            com.facebook.facedetection.amlfacetracker.AMLFaceTracker$NativePeer r11 = r1.A00     // Catch:{ Exception -> 0x00e8 }
            if (r11 == 0) goto L_0x00df
            r16 = r13
            r17 = r8
            r13 = r15
            com.facebook.facedetection.amlfacetracker.AMLDetectedFace[] r2 = r11.track(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00e8 }
            if (r2 == 0) goto L_0x00df
            int r1 = r2.length     // Catch:{ Exception -> 0x00e8 }
            if (r1 == 0) goto L_0x00df
            r11 = r2[r8]     // Catch:{ Exception -> 0x00e8 }
            if (r11 == 0) goto L_0x00df
            float[] r1 = r11.headPose     // Catch:{ Exception -> 0x00e8 }
            if (r1 == 0) goto L_0x00e6
            int r0 = r1.length     // Catch:{ Exception -> 0x00e8 }
            r3 = 2
            if (r0 <= r3) goto L_0x00e6
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x00e8 }
            r0 = r1[r3]     // Catch:{ Exception -> 0x00e8 }
            float r2 = java.lang.Math.signum(r0)     // Catch:{ Exception -> 0x00e8 }
            r1 = 1127481344(0x43340000, float:180.0)
            float[] r0 = r11.headPose     // Catch:{ Exception -> 0x00e8 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x00e8 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x00e8 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x00e8 }
            float r1 = r1 - r0
            float r2 = r2 * r1
        L_0x00a8:
            float r0 = -r2
            float r13 = X.C11176SEc.A03     // Catch:{ Exception -> 0x00e8 }
            float r0 = java.lang.Math.min(r0, r13)     // Catch:{ Exception -> 0x00e8 }
            float r12 = -r13
            float r21 = java.lang.Math.max(r0, r12)     // Catch:{ Exception -> 0x00e8 }
            float r0 = X.C11176SEc.A02     // Catch:{ Exception -> 0x00e8 }
            float r3 = -r0
            float r21 = r21 / r3
            float[] r2 = r11.headPose     // Catch:{ Exception -> 0x00e8 }
            if (r2 == 0) goto L_0x00e4
            int r1 = r2.length     // Catch:{ Exception -> 0x00e8 }
            r0 = 2
            if (r1 <= r0) goto L_0x00e4
            X.0qQ.A0A(r2)     // Catch:{ Exception -> 0x00e8 }
            r0 = r2[r8]     // Catch:{ Exception -> 0x00e8 }
        L_0x00c6:
            float r0 = java.lang.Math.min(r0, r13)     // Catch:{ Exception -> 0x00e8 }
            float r22 = java.lang.Math.max(r0, r12)     // Catch:{ Exception -> 0x00e8 }
            float r22 = r22 / r3
            android.graphics.Rect r1 = r11.faceRect     // Catch:{ Exception -> 0x00e8 }
            X.S6R r0 = new X.S6R     // Catch:{ Exception -> 0x00e8 }
            r19 = r0
            r20 = r1
            r23 = r15
            r24 = r14
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x00e8 }
        L_0x00df:
            r1 = 1
            r4.qplMarkerEnd(r5, r1)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00f9
        L_0x00e4:
            r0 = 0
            goto L_0x00c6
        L_0x00e6:
            r2 = 0
            goto L_0x00a8
        L_0x00e8:
            r2 = move-exception
            com.facebook.smartcapture.logging.SmartCaptureLogger r1 = r10.A04
            r1.qplMarkerEnd(r5, r8)
            java.lang.String r0 = "Failed to track face"
            r1.logError(r0, r2)
            X.C11257SHr.A00(r10)
            r0 = r18
            goto L_0x010f
        L_0x00f9:
            if (r0 == 0) goto L_0x010d
            android.graphics.Rect r1 = r0.A04
            r4 = 0
            if (r1 != 0) goto L_0x0150
            long r2 = r10.A00
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            long r0 = android.os.SystemClock.elapsedRealtime()
            if (r11 != 0) goto L_0x0143
            r10.A00 = r0
        L_0x010d:
            r0 = r18
        L_0x010f:
            boolean r1 = r9.A0E
            if (r0 != 0) goto L_0x0153
            if (r1 != 0) goto L_0x01e3
            r19 = 0
            X.S6R r0 = new X.S6R
            r20 = r19
            r21 = r8
            r22 = r8
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            X.AnonymousClass7TE.A1S(r6, r0, r8)
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r9.A0J
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x01e3
            java.lang.ref.WeakReference r0 = r9.A0P
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x01e3
            X.0qQ.A0A(r18)
            X.0qQ.A0A(r18)
            java.lang.String r0 = "setDiagnosticInfo"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0143:
            long r0 = r0 - r2
            r11 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x010d
            r10.A00 = r4
            X.C11257SHr.A00(r10)
            goto L_0x010d
        L_0x0150:
            r10.A00 = r4
            goto L_0x010f
        L_0x0153:
            if (r1 != 0) goto L_0x01e3
            java.lang.ref.WeakReference r1 = r9.A0D
            java.lang.Object r9 = r1.get()
            X.S3Y r9 = (X.S3Y) r9
            if (r9 == 0) goto L_0x01bf
            java.lang.Integer r2 = r9.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            if (r2 != r1) goto L_0x01bf
            android.graphics.Rect r10 = r0.A04
            if (r10 == 0) goto L_0x01bf
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.A00
            r11 = 500(0x1f4, double:2.47E-321)
            long r4 = r4 + r11
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x01bf
            float r1 = r0.A00
            float r11 = java.lang.Math.abs(r1)
            float r1 = r0.A01
            float r1 = java.lang.Math.abs(r1)
            float r11 = r11 + r1
            X.Rrv r5 = r9.A0B
            java.util.List r4 = r5.A00
            boolean r1 = X.AnonymousClass7TE.A1b(r4)
            if (r1 == 0) goto L_0x01c3
            int r1 = X.C51966G9m.A06(r4)
            java.lang.Object r12 = r4.remove(r1)
            java.lang.String r12 = (java.lang.String) r12
            java.util.PriorityQueue r4 = r5.A01
            X.Rru r1 = new X.Rru
            r1.<init>(r12, r11)
            r4.add(r1)
        L_0x01a1:
            android.graphics.Rect r1 = X.AnonymousClass7TE.A0W()
            X.0qQ.A0A(r10)
            r1.set(r10)
            if (r12 == 0) goto L_0x01bf
            r9.A00 = r2
            X.TNg r13 = new X.TNg
            r14 = r1
            r15 = r7
            r16 = r9
            r17 = r12
            r18 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            X.XtE.A00(r13)
        L_0x01bf:
            X.AnonymousClass7TE.A1S(r6, r0, r8)
            return
        L_0x01c3:
            java.util.PriorityQueue r5 = r5.A01
            java.lang.Object r4 = r5.peek()
            X.Rru r4 = (X.C10418Rru) r4
            if (r4 == 0) goto L_0x01e1
            float r1 = r4.A00
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x01e1
            r5.remove(r4)
            java.lang.String r12 = r4.A01
            X.Rru r1 = new X.Rru
            r1.<init>(r12, r11)
            r5.add(r1)
            goto L_0x01a1
        L_0x01e1:
            r12 = 0
            goto L_0x01a1
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12061Slo.onPreviewFrame(X.Rz3):void");
    }

    public C12061Slo(Context context, S3Y s3y, ChallengeProvider challengeProvider, SelfieCaptureConfig selfieCaptureConfig, SelfieCaptureLogger selfieCaptureLogger, C13580Td6 td6) {
        SelfieCaptureLogger selfieCaptureLogger2 = selfieCaptureLogger;
        AnonymousClass7TF.A1E(challengeProvider, 2, selfieCaptureLogger);
        this.A0I = challengeProvider;
        this.A0J = selfieCaptureConfig;
        this.A0L = selfieCaptureLogger;
        WeakReference A0v = C51965G9l.A0v(td6);
        this.A0P = A0v;
        this.A0K = new InMemoryLogger(selfieCaptureLogger);
        WeakReference A0v2 = C51965G9l.A0v(context);
        this.A0Q = A0v2;
        this.A0D = C51965G9l.A0v(s3y);
        C10680RwJ rwJ = null;
        this.A0C = C51965G9l.A0v((Object) null);
        FaceTrackerProvider faceTrackerProvider = selfieCaptureConfig.A0A;
        FaceTrackerModelsProvider faceTrackerModelsProvider = selfieCaptureConfig.A09;
        if (faceTrackerProvider == null || faceTrackerModelsProvider == null) {
            this.A08 = null;
            this.A09 = null;
        } else {
            this.A08 = new C11257SHr(faceTrackerModelsProvider, faceTrackerProvider, selfieCaptureLogger2, A0v2, A0v);
            this.A09 = new Q7t(this);
        }
        this.A0N = new C10562RuG();
        this.A0H = 300;
        this.A0M = new C10832Rys();
        if (DbX.A1a(this.A0J.A0F)) {
            C7918Qcp qcp = ((SelfieCaptureActivity) td6).A04;
            if (qcp == null) {
                0qQ.A0F("cameraOverlayFragment");
                throw AnonymousClass00P.createAndThrow();
            }
            rwJ = new C10680RwJ(this, ((C7927Qcy) qcp).A0P);
        }
        this.A0O = rwJ;
    }

    public static final void A00(C12061Slo slo) {
        int i = slo.A0G;
        int i2 = slo.A03;
        if (i != i2) {
            slo.A0G = i2;
            InMemoryLogger.LogEntryBuilder addEntry = slo.A0K.addEntry("CHALLENGE_STEP_CHANGE");
            addEntry.put("index", slo.A03);
            addEntry.put("step", slo.A02().A00);
            addEntry.submit();
        }
    }

    public static final void A01(C12061Slo slo) {
        if (slo.A0F) {
            slo.A0F = false;
            S3Y s3y = (S3Y) slo.A0D.get();
            if (s3y == null) {
                return;
            }
            if (s3y.A0E != null) {
                s3y.A0A.A00().A02();
                return;
            }
            SelfieEvidence selfieEvidence = new SelfieEvidence(s3y.A03, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, s3y.A0D, (String) null);
            s3y.A01 = selfieEvidence;
            S4B s4b = s3y.A02;
            if (s4b != null) {
                0qQ.A0A(selfieEvidence);
                s4b.A00(selfieEvidence);
            }
        }
    }

    public final RFH A02() {
        List unmodifiableList = Collections.unmodifiableList(this.A0I.A03);
        0qQ.A07(unmodifiableList);
        return (RFH) unmodifiableList.get(this.A03);
    }

    public final boolean A03() {
        List unmodifiableList = Collections.unmodifiableList(this.A0I.A03);
        0qQ.A07(unmodifiableList);
        if (this.A03 < unmodifiableList.size() - 1) {
            return false;
        }
        return true;
    }

    public final void D0B() {
        C13580Td6 td6 = (C13580Td6) this.A0P.get();
        if (td6 != null) {
            C7918Qcp qcp = ((SelfieCaptureActivity) td6).A04;
            if (qcp == null) {
                0qQ.A0F("cameraOverlayFragment");
                throw AnonymousClass00P.createAndThrow();
            } else if (!SelfieCaptureActivity.A01(qcp)) {
                C7927Qcy qcy = (C7927Qcy) qcp;
                qcy.A0N.postDelayed(new C12900TCo(qcy), 500);
            }
        }
        C10680RwJ rwJ = this.A0O;
        if (rwJ != null) {
            Q7e q7e = rwJ.A01;
            q7e.cancel();
            rwJ.A00 = SystemClock.elapsedRealtime();
            q7e.start();
        }
        Integer num = AnonymousClass05K.A01;
        if (num != this.A0B) {
            this.A0B = num;
            this.A0K.addEntry("CHALLENGE_STARTED").submit();
        }
    }
}
