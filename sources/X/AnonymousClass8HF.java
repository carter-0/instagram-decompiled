package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.io.File;

/* renamed from: X.8HF  reason: invalid class name */
public final class AnonymousClass8HF extends AnonymousClass8HG {
    public int A00;
    public int A01;
    public long A02;
    public TargetViewSizeProvider A03;
    public File A04;
    public Integer A05;
    public final AnonymousClass8HW A06 = new AnonymousClass8HV(this);
    public final AnonymousClass8HX A07 = new AnonymousClass8HX(this);
    public final AnonymousClass8HZ A08 = new AnonymousClass8HY(this);
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass8HU(this));
    public volatile String A0A;

    public AnonymousClass8HF(Context context, View view, UserSession userSession, C357638Yz r16, TargetViewSizeProvider targetViewSizeProvider, C353028Fz r18, AnonymousClass8AL r19, C3503684j r20, C3496881i r21, AnonymousClass80U r22) {
        super(context, view, userSession, r16, r18, r19, r20, r21, r22, false);
        this.A03 = targetViewSizeProvider;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r1 == r0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(X.C21986Xoh r4, X.AnonymousClass8HF r5, boolean r6) {
        /*
            r2 = r5
            monitor-enter(r2)
            X.80X r0 = r5.A0U     // Catch:{ all -> 0x003d }
            X.80X r1 = X.AnonymousClass80X.PRE_CAPTURE     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x000c
            X.80X r0 = r5.A0U     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            X.8HJ r0 = r5.A0T     // Catch:{ all -> 0x003d }
            r5.A0C = r0     // Catch:{ all -> 0x003d }
        L_0x0010:
            X.80X r0 = r5.A0U     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x001f
            X.80X r0 = r5.A0U     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001f
            X.8HJ r1 = r5.A0C     // Catch:{ all -> 0x003d }
            X.8HJ r0 = r5.A0T     // Catch:{ all -> 0x003d }
            r5 = 1
            if (r1 != r0) goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            java.util.Map r1 = r2.A0L     // Catch:{ all -> 0x003d }
            X.8HJ r0 = r2.A0T     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x003d }
            X.A7b r0 = (X.C39735A7b) r0     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0039
            int r3 = r0.A03     // Catch:{ all -> 0x003d }
        L_0x002e:
            X.AqV r0 = new X.AqV     // Catch:{ all -> 0x003d }
            r1 = r4
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x003d }
            X.C342057ny.A00(r0)     // Catch:{ all -> 0x003d }
            goto L_0x003b
        L_0x0039:
            r3 = 0
            goto L_0x002e
        L_0x003b:
            monitor-exit(r2)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HF.A01(X.Xoh, X.8HF, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r1 = r0.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A02(X.AnonymousClass8HF r3) {
        /*
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.A0M     // Catch:{ all -> 0x0028 }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x0028 }
            r2 = 0
            r3.A04 = r2     // Catch:{ all -> 0x0028 }
            r3.A0A = r2     // Catch:{ all -> 0x0028 }
            r3.A01 = r0     // Catch:{ all -> 0x0028 }
            r3.A00 = r0     // Catch:{ all -> 0x0028 }
            r3.A0A = r0     // Catch:{ all -> 0x0028 }
            java.util.Map r0 = r3.A0L     // Catch:{ all -> 0x0028 }
            r0.clear()     // Catch:{ all -> 0x0028 }
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r0 = r3.A09     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            X.8Pm r1 = r0.A0B     // Catch:{ all -> 0x0028 }
            X.B2X r0 = r1.A09     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            r0.reset()     // Catch:{ all -> 0x0028 }
            r1.A09 = r2     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HF.A02(X.8HF):void");
    }

    public static boolean A03(AnonymousClass8HF r2, String str) {
        return str.equals(r2.A0A) && r2.A0M.get() != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (((java.lang.Number) r13.second).floatValue() != r8.A01) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r8 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r6 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r6 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6.isEmpty() != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        r8 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r8 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r8.isEmpty() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r9 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r10 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r10 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r2 = r14.A05;
        r2.getClass();
        A01(new X.C21986Xoh(new X.Xnz((java.io.FileDescriptor) null, r8, r9, r10, 0, r2.intValue())), r14, true);
        r5.compareAndSet(4, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r0 = X.002.A02(r9, r14.A00, "update: w or h == 0, w= ", " h=");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.util.Pair r13, X.AnonymousClass8HF r14) {
        /*
            java.util.concurrent.atomic.AtomicInteger r5 = r14.A0M
            r4 = 3
            r1 = 4
            boolean r0 = r5.compareAndSet(r4, r1)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r14.A0O
            java.lang.String r3 = "GLBoomerangCaptureController"
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "Update in post capture is disabled but GLBoomerangCaptureController is still requesting to do so"
        L_0x0012:
            X.0kD.A03(r3, r0)
        L_0x0015:
            return
        L_0x0016:
            X.AjL r0 = new X.AjL
            r0.<init>(r14)
            X.C342057ny.A00(r0)
            java.util.Map r2 = r14.A0L
            X.8HJ r0 = r14.A0T
            java.lang.Object r8 = r2.get(r0)
            X.A7b r8 = (X.C39735A7b) r8
            r0 = 1
            if (r13 == 0) goto L_0x004a
            if (r8 == 0) goto L_0x0093
            java.lang.Object r2 = r13.first
            java.lang.Number r2 = (java.lang.Number) r2
            float r6 = r2.floatValue()
            float r2 = r8.A00
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004a
            java.lang.Object r2 = r13.second
            java.lang.Number r2 = (java.lang.Number) r2
            float r6 = r2.floatValue()
            float r2 = r8.A01
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 1
            if (r2 == 0) goto L_0x004d
        L_0x004a:
            r7 = 0
            if (r8 == 0) goto L_0x0093
        L_0x004d:
            java.lang.String r6 = r8.A04
            if (r6 == 0) goto L_0x0093
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            java.lang.String r8 = r8.A05
            if (r8 == 0) goto L_0x0063
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0064
        L_0x0063:
            r8 = r6
        L_0x0064:
            int r9 = r14.A01
            if (r9 == 0) goto L_0x0088
            int r10 = r14.A00
            if (r10 == 0) goto L_0x0088
            r7 = 0
            r11 = 0
            java.lang.Integer r2 = r14.A05
            r2.getClass()
            int r12 = r2.intValue()
            X.Xnz r6 = new X.Xnz
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.Xoh r2 = new X.Xoh
            r2.<init>(r6)
            A01(r2, r14, r0)
            r5.compareAndSet(r1, r4)
            return
        L_0x0088:
            java.lang.String r2 = "update: w or h == 0, w= "
            java.lang.String r1 = " h="
            int r0 = r14.A00
            java.lang.String r0 = X.002.A02(r9, r0, r2, r1)
            goto L_0x0012
        L_0x0093:
            X.8HJ r4 = r14.A0T
            java.lang.Integer r2 = r14.A05
            if (r2 != 0) goto L_0x00a5
            java.lang.String r2 = "generateBoomerang() has null mCameraFacing"
            X.0kD.A03(r3, r2)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.A05 = r2
        L_0x00a5:
            int r2 = r2.intValue()
            java.io.File r2 = X.LIM.A00(r2)
            java.lang.String r7 = r2.getAbsolutePath()
            X.7pN r3 = r14.A05
            if (r13 != 0) goto L_0x00dc
            r3.getClass()
            X.8HW r5 = r14.A06
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.0qQ.A0B(r4, r0)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.7tO r0 = X.C342917pN.A00(r3)
            X.7tN r0 = (X.C345367tN) r0
            X.7rl r0 = r0.A00
            if (r0 == 0) goto L_0x0015
            X.7rk r0 = (X.C344367rk) r0
            X.AJ3 r6 = r0.A02
            if (r6 == 0) goto L_0x0015
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = r8
            X.AJ3.A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x00dc:
            r3.getClass()
            java.lang.Object r2 = r13.first
            java.lang.Number r2 = (java.lang.Number) r2
            float r12 = r2.floatValue()
            java.lang.Object r2 = r13.second
            java.lang.Number r2 = (java.lang.Number) r2
            float r13 = r2.floatValue()
            X.8HW r10 = r14.A06
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.0qQ.A0B(r4, r0)
            X.0qQ.A0B(r10, r1)
            X.7tO r8 = X.C342917pN.A00(r3)
            r9 = r4
            r11 = r7
            r8.FJl(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HF.A00(android.util.Pair, X.8HF):void");
    }
}
