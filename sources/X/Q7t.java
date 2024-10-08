package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

public final class Q7t extends Handler {
    public boolean A00;
    public final WeakReference A01;

    private final float A00(RFH rfh, float f, float f2) {
        float f3;
        float f4;
        if (f == 0.0f && f2 == 0.0f) {
            return 0.0f;
        }
        int ordinal = rfh.ordinal();
        if (ordinal == 0) {
            f2 = -f2;
            f3 = 14.285714f;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                f2 = -f;
                f3 = 20.0f;
            }
            f3 = 14.285714f;
        } else {
            f4 = f * 12.5f;
            return Pxi.A01(1.0f, f4, 0.0f);
        }
        f4 = f2 * f3;
        return Pxi.A01(1.0f, f4, 0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0445, code lost:
        if (r11 != r6) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0465, code lost:
        if (r8 != 0.0f) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x047e, code lost:
        if (X.AnonymousClass7TE.A00(r8, r5.A01) >= 0.02f) goto L_0x0480;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r25) {
        /*
            r24 = this;
            r3 = 0
            r1 = r25
            X.0qQ.A0B(r1, r3)
            r9 = r24
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x06a9
            java.lang.ref.WeakReference r0 = r9.A01
            java.lang.Object r5 = r0.get()
            X.Slo r5 = (X.C12061Slo) r5
            if (r5 == 0) goto L_0x06a9
            java.lang.Object r1 = r1.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.smartcapture.facetracker.DetectedFace"
            X.0qQ.A0C(r1, r0)
            X.S6R r1 = (X.S6R) r1
            float r10 = r1.A00
            float r8 = r1.A01
            X.RFH r7 = X.RFH.LEFT
            float r21 = r9.A00(r7, r10, r8)
            X.RFH r6 = X.RFH.UP
            float r20 = r9.A00(r6, r10, r8)
            X.RFH r4 = X.RFH.RIGHT
            float r19 = r9.A00(r4, r10, r8)
            X.RFH r2 = X.RFH.DOWN
            float r18 = r9.A00(r2, r10, r8)
            android.graphics.Rect r11 = r1.A04
            int r15 = r1.A03
            int r14 = r1.A02
            java.lang.ref.WeakReference r0 = r5.A0P
            r22 = r0
            java.lang.Object r1 = r22.get()
            X.Td6 r1 = (X.C13580Td6) r1
            if (r1 == 0) goto L_0x012a
            X.Rys r13 = r5.A0M
            boolean r12 = r13.A06
            com.facebook.smartcapture.view.SelfieCaptureActivity r1 = (com.facebook.smartcapture.view.SelfieCaptureActivity) r1
            X.QCN r0 = r1.A01
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L_0x02dd
            r9 = 0
        L_0x005e:
            X.QCN r0 = r1.A01
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L_0x02d7
            r1 = 0
        L_0x0068:
            int r0 = r13.A01
            if (r0 != r15) goto L_0x02bf
            int r0 = r13.A00
            if (r0 != r14) goto L_0x02bf
            int r0 = r13.A03
            if (r0 != r9) goto L_0x02bf
            int r0 = r13.A02
            if (r0 != r1) goto L_0x02bf
        L_0x0078:
            if (r11 != 0) goto L_0x0244
            r13.A06 = r3
            r13.A04 = r3
        L_0x007e:
            boolean r0 = r13.A06
            if (r12 == 0) goto L_0x0220
            if (r0 != 0) goto L_0x00ba
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Integer r0 = r5.A0B
            if (r1 == r0) goto L_0x0097
            r5.A0B = r1
            com.facebook.smartcapture.logging.InMemoryLogger r1 = r5.A0K
            java.lang.String r0 = "LOOKING_FOR_FACE"
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r0 = r1.addEntry(r0)
            r0.submit()
        L_0x0097:
            java.lang.ref.WeakReference r0 = r5.A0Q
            java.lang.Object r12 = r0.get()
            android.content.Context r12 = (android.content.Context) r12
            if (r12 == 0) goto L_0x00ba
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.String r9 = "vibrator"
            java.lang.Object r12 = r12.getSystemService(r9)
            boolean r9 = r12 instanceof android.os.Vibrator
            if (r9 == 0) goto L_0x00ba
            android.os.Vibrator r12 = (android.os.Vibrator) r12
            if (r12 == 0) goto L_0x00ba
            r9 = -1
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r0, r9)
            r12.vibrate(r0)
        L_0x00ba:
            java.lang.Object r14 = r22.get()
            X.Td6 r14 = (X.C13580Td6) r14
            if (r14 == 0) goto L_0x012a
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r5.A0J
            java.lang.Boolean r15 = r0.A0G
            r12 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)
            boolean r0 = X.0qQ.A0K(r15, r9)
            if (r0 == 0) goto L_0x01fc
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x01fc
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x01fc
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x01fc
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x00e1:
            com.facebook.smartcapture.view.SelfieCaptureActivity r14 = (com.facebook.smartcapture.view.SelfieCaptureActivity) r14
            X.Qcp r9 = r14.A04
            java.lang.String r0 = "cameraOverlayFragment"
            if (r9 == 0) goto L_0x02f3
            boolean r0 = com.facebook.smartcapture.view.SelfieCaptureActivity.A01(r9)
            if (r0 != 0) goto L_0x00f2
            r9.A03(r1)
        L_0x00f2:
            java.lang.ref.WeakReference r0 = r5.A0D
            java.lang.Object r13 = r0.get()
            X.S3Y r13 = (X.S3Y) r13
            if (r13 == 0) goto L_0x012a
            r13.A04 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x012a
            java.lang.String r1 = r13.A0D
            if (r1 == 0) goto L_0x012a
            boolean r0 = r13.A05
            if (r0 != 0) goto L_0x012a
            X.SQQ.A01(r1)
            r13.A05 = r3
            r13.A05 = r12
            X.QCN r0 = r13.A0A
            X.Slp r9 = new X.Slp
            r9.<init>(r13)
            X.A7O r1 = new X.A7O
            r1.<init>()
            r1.A03 = r3
            r1.A05 = r12
            r1.A04 = r3
            X.AUb r0 = r0.A00()
            r0.A06(r1, r9)
        L_0x012a:
            if (r11 == 0) goto L_0x0439
            java.lang.Object r0 = r22.get()
            X.Td6 r0 = (X.C13580Td6) r0
            if (r0 == 0) goto L_0x0439
            com.facebook.smartcapture.flow.SelfieCaptureConfig r1 = r5.A0J
            boolean r1 = r1.A0R
            if (r1 == 0) goto L_0x0439
            X.RuG r4 = r5.A0N
            X.Rys r2 = r5.A0M
            X.0qQ.A0B(r2, r3)
            android.graphics.Rect r6 = r4.A00
            X.0qQ.A0B(r6, r3)
            android.graphics.Rect r1 = r2.A07
            r6.set(r1)
            android.graphics.Rect r13 = r4.A01
            X.0qQ.A0B(r13, r3)
            android.graphics.Rect r1 = r2.A08
            r13.set(r1)
            android.graphics.Rect r9 = r4.A02
            X.0qQ.A0B(r9, r3)
            android.graphics.Rect r1 = r2.A09
            r9.set(r1)
            r12 = 3
            r5 = 0
            com.facebook.smartcapture.diagnostic.Color r7 = new com.facebook.smartcapture.diagnostic.Color
            r7.<init>(r5, r5, r5, r5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            com.facebook.smartcapture.diagnostic.Color r2 = new com.facebook.smartcapture.diagnostic.Color
            r2.<init>(r4, r5, r5, r11)
            r1 = 5
            com.facebook.smartcapture.diagnostic.PolygonAnnotation r9 = X.C9578RdI.A00(r9, r7, r2, r1)
            r7 = 1056964608(0x3f000000, float:0.5)
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            com.facebook.smartcapture.diagnostic.Color r2 = new com.facebook.smartcapture.diagnostic.Color
            r2.<init>(r5, r7, r5, r14)
            com.facebook.smartcapture.diagnostic.Color r1 = new com.facebook.smartcapture.diagnostic.Color
            r1.<init>(r5, r7, r5, r11)
            com.facebook.smartcapture.diagnostic.PolygonAnnotation r6 = X.C9578RdI.A00(r6, r2, r1, r12)
            com.facebook.smartcapture.diagnostic.Color r2 = new com.facebook.smartcapture.diagnostic.Color
            r2.<init>(r5, r5, r7, r14)
            com.facebook.smartcapture.diagnostic.Color r1 = new com.facebook.smartcapture.diagnostic.Color
            r1.<init>(r5, r5, r7, r11)
            com.facebook.smartcapture.diagnostic.PolygonAnnotation r1 = X.C9578RdI.A00(r13, r2, r1, r12)
            com.facebook.smartcapture.diagnostic.PolygonAnnotation[] r11 = new com.facebook.smartcapture.diagnostic.PolygonAnnotation[]{r9, r6, r1}
            java.lang.String r2 = "Rotation: X:"
            java.lang.String r1 = " Y:"
            java.lang.String r6 = X.002.A0a(r2, r1, r10, r8)
            r1 = 10
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r1, r1)
            com.facebook.smartcapture.diagnostic.Color r8 = new com.facebook.smartcapture.diagnostic.Color
            r8.<init>(r5, r5, r5, r4)
            com.facebook.smartcapture.diagnostic.Color r9 = new com.facebook.smartcapture.diagnostic.Color
            r9.<init>(r4, r4, r4, r4)
            r10 = 18
            com.facebook.smartcapture.diagnostic.TextAnnotation r5 = new com.facebook.smartcapture.diagnostic.TextAnnotation
            r5.<init>(r6, r7, r8, r9, r10)
            com.facebook.smartcapture.diagnostic.TextAnnotation[] r14 = new com.facebook.smartcapture.diagnostic.TextAnnotation[]{r5}
            com.facebook.smartcapture.diagnostic.ImageAnnotation[] r10 = new com.facebook.smartcapture.diagnostic.ImageAnnotation[r3]
            com.facebook.smartcapture.diagnostic.PointAnnotation[] r12 = new com.facebook.smartcapture.diagnostic.PointAnnotation[r3]
            com.facebook.smartcapture.diagnostic.SegmentAnnotation[] r13 = new com.facebook.smartcapture.diagnostic.SegmentAnnotation[r3]
            com.facebook.smartcapture.diagnostic.DiagnosticInfo r9 = new com.facebook.smartcapture.diagnostic.DiagnosticInfo
            r9.<init>(r10, r11, r12, r13, r14)
            com.facebook.smartcapture.view.SelfieCaptureActivity r0 = (com.facebook.smartcapture.view.SelfieCaptureActivity) r0
            X.QCN r1 = r0.A01
            X.0qQ.A0A(r1)
            android.view.View r1 = r1.mView
            if (r1 != 0) goto L_0x01f7
            r1 = 0
        L_0x01d5:
            r9.previewHeight = r1
            X.QCN r0 = r0.A01
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L_0x01f2
            r0 = 0
        L_0x01e1:
            r9.previewWidth = r0
            r0 = 0
            X.0qQ.A0A(r0)
            X.0qQ.A0A(r9)
            java.lang.String r0 = "setDiagnosticInfo"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x01f2:
            int r0 = r0.getWidth()
            goto L_0x01e1
        L_0x01f7:
            int r1 = r1.getHeight()
            goto L_0x01d5
        L_0x01fc:
            boolean r0 = X.0qQ.A0K(r15, r9)
            if (r0 == 0) goto L_0x020e
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x020e
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x020e
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x00e1
        L_0x020e:
            boolean r9 = r13.A06
            if (r9 == 0) goto L_0x021a
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x021a
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x00e1
        L_0x021a:
            if (r9 == 0) goto L_0x00e1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x00e1
        L_0x0220:
            if (r0 == 0) goto L_0x0237
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.Integer r0 = r5.A0B
            if (r1 == r0) goto L_0x00ba
            r5.A0B = r1
            com.facebook.smartcapture.logging.InMemoryLogger r1 = r5.A0K
            java.lang.String r0 = "FACE_DETECTED"
        L_0x022e:
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r0 = r1.addEntry(r0)
            r0.submit()
            goto L_0x00ba
        L_0x0237:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Integer r0 = r5.A0B
            if (r1 == r0) goto L_0x00ba
            r5.A0B = r1
            com.facebook.smartcapture.logging.InMemoryLogger r1 = r5.A0K
            java.lang.String r0 = "LOOKING_FOR_FACE"
            goto L_0x022e
        L_0x0244:
            r9 = 1
            r13.A06 = r9
            int r15 = r13.A03
            int r14 = r13.A02
            int r1 = r13.A01
            int r0 = r13.A00
            android.graphics.Matrix r14 = X.C11321SMv.A00(r15, r14, r1, r0)
            java.lang.ThreadLocal r0 = X.C11321SMv.A00
            java.lang.Object r1 = r0.get()
            X.0qQ.A0A(r1)
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            r1.set(r11)
            r14.mapRect(r1)
            float r0 = r1.left
            int r0 = (int) r0
            r11.left = r0
            float r0 = r1.top
            int r0 = (int) r0
            r11.top = r0
            float r0 = r1.right
            int r0 = (int) r0
            r11.right = r0
            float r0 = r1.bottom
            int r0 = (int) r0
            r11.bottom = r0
            android.graphics.Rect r1 = r13.A07
            r1.set(r11)
            android.graphics.Rect r14 = r13.A08
            int r0 = r1.left
            r14.left = r0
            int r0 = r1.right
            r14.right = r0
            int r0 = r1.top
            r14.top = r0
            int r0 = r1.bottom
            r14.bottom = r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r0 = 1041865114(0x3e19999a, float:0.15)
            X.S9P.A00(r14, r1, r0, r0)
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x02bc
            android.graphics.Rect r0 = r13.A0A
        L_0x029e:
            boolean r0 = r0.contains(r14)
            r13.A04 = r0
            if (r0 == 0) goto L_0x02ba
            int r1 = r14.width()
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 >= r0) goto L_0x02ba
            int r1 = r14.height()
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L_0x02ba
        L_0x02b6:
            r13.A05 = r9
            goto L_0x007e
        L_0x02ba:
            r9 = 0
            goto L_0x02b6
        L_0x02bc:
            android.graphics.Rect r0 = r13.A09
            goto L_0x029e
        L_0x02bf:
            r13.A01 = r15
            r13.A00 = r14
            r13.A03 = r9
            r13.A02 = r1
            android.graphics.Rect r0 = r13.A09
            X.S9P.A01(r0, r9, r1)
            android.graphics.Rect r9 = r13.A0A
            int r1 = r13.A03
            int r0 = r13.A02
            r9.set(r3, r3, r1, r0)
            goto L_0x0078
        L_0x02d7:
            int r1 = r0.getHeight()
            goto L_0x0068
        L_0x02dd:
            int r9 = r0.getWidth()
            goto L_0x005e
        L_0x02e3:
            r0 = 212(0xd4, double:1.047E-321)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r8.setDuration(r0)
            android.widget.ImageView r9 = r2.A01
            if (r9 != 0) goto L_0x02fb
            java.lang.String r0 = "arrow"
        L_0x02f3:
            X.0qQ.A0F(r0)
        L_0x02f6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02fb:
            android.util.Property r11 = android.view.View.ALPHA
            r12 = 1
            float[] r1 = new float[r12]
            r0 = 0
            r1[r3] = r0
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r11, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = "checkView"
            android.widget.ImageView r10 = r2.A02
            if (r10 == 0) goto L_0x02f3
            r14 = 1050253722(0x3e99999a, float:0.3)
            android.util.Property r13 = android.view.View.SCALE_X
            float[] r0 = new float[r5]
            r0[r3] = r14
            r0[r12] = r17
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r13, r0)
            X.0qQ.A07(r0)
            r1.add(r0)
            android.util.Property r13 = android.view.View.SCALE_Y
            float[] r0 = new float[r5]
            r0[r3] = r14
            r0[r12] = r17
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r13, r0)
            X.0qQ.A07(r0)
            r1.add(r0)
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r11, r0)
            X.0qQ.A07(r0)
            r1.add(r0)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r1)
            android.animation.Animator[] r0 = new android.animation.Animator[]{r9, r0}
            r8.playTogether(r0)
            r1 = 6
            X.U0N r0 = new X.U0N
            r0.<init>(r2, r1)
            r8.addListener(r0)
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 125(0x7d, double:6.2E-322)
            android.animation.ValueAnimator r10 = r2.setDuration(r0)
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r1 = r7.A09
            java.lang.String r13 = "captureProgressView"
            if (r1 == 0) goto L_0x06a2
            android.util.Property r9 = com.facebook.smartcapture.ui.view.FaceCaptureProgressView.A0K
            float[] r0 = new float[r12]
            r16 = 0
            r0[r3] = r16
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r1, r9, r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r1 = r7.A09
            if (r1 == 0) goto L_0x06a2
            float[] r0 = new float[r12]
            r0[r3] = r17
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r9, r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[]{r2, r1}
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            r9.playSequentially(r0)
            r1 = 250(0xfa, double:1.235E-321)
            android.animation.AnimatorSet r9 = r9.setDuration(r1)
            com.facebook.smartcapture.ui.view.ArrowHintView r0 = r7.A08
            if (r0 == 0) goto L_0x0515
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            X.TGU r14 = new X.TGU
            r14.<init>(r4, r0)
            com.facebook.smartcapture.ui.view.ArrowHintView r13 = r7.A08
            if (r13 == 0) goto L_0x0515
            int r0 = r13.getVisibility()
            if (r0 == 0) goto L_0x0405
            X.C7927Qcy.A00(r6, r7)
            r13.setCaptureState(r6)
            float[] r0 = new float[r12]
            r0[r3] = r16
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            X.0qQ.A07(r3)
        L_0x03dc:
            android.animation.Animator[] r0 = new android.animation.Animator[]{r3, r9}
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            r1.playTogether(r0)
            r2 = 3
            android.animation.Animator[] r0 = new android.animation.Animator[]{r8, r10, r1}
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            r1.playSequentially(r0)
            r1.start()
            return
        L_0x0405:
            float[] r0 = new float[r12]
            r0[r3] = r16
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r13, r11, r0)
            X.TtS r0 = new X.TtS
            r18 = r0
            r19 = r5
            r20 = r13
            r21 = r14
            r22 = r6
            r23 = r7
            r18.<init>((int) r19, (java.lang.Object) r20, (java.lang.Object) r21, (java.lang.Object) r22, (java.lang.Object) r23)
            r4.addListener(r0)
            float[] r0 = new float[r12]
            r0[r3] = r17
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r13, r11, r0)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[]{r4, r0}
            r3.playSequentially(r0)
            r3.setDuration(r1)
            goto L_0x03dc
        L_0x0439:
            X.RFH r11 = r5.A02()
            r1 = 0
            r12 = r21
            if (r11 == r7) goto L_0x0447
            r12 = 0
            r0 = r20
            if (r11 == r6) goto L_0x0448
        L_0x0447:
            r0 = 0
        L_0x0448:
            float r12 = r12 + r0
            r0 = 0
            if (r11 != r4) goto L_0x044e
            r0 = r19
        L_0x044e:
            float r12 = r12 + r0
            if (r11 != r2) goto L_0x0453
            r1 = r18
        L_0x0453:
            float r12 = r12 + r1
            r17 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            boolean r16 = X.Pxf.A1R(r0)
            r1 = 0
            r13 = 1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0467
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r9 = 1
            if (r0 == 0) goto L_0x0468
        L_0x0467:
            r9 = 0
        L_0x0468:
            float r0 = r5.A00
            float r0 = X.AnonymousClass7TE.A00(r10, r0)
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0480
            float r0 = r5.A01
            float r0 = X.AnonymousClass7TE.A00(r8, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x0481
        L_0x0480:
            r1 = 0
        L_0x0481:
            X.RFH r0 = r5.A07
            if (r11 == r0) goto L_0x0486
            r13 = 0
        L_0x0486:
            if (r9 != 0) goto L_0x048c
            if (r1 == 0) goto L_0x064b
            if (r13 == 0) goto L_0x064b
        L_0x048c:
            X.Rys r9 = r5.A0M
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x0499
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0499
            X.C12061Slo.A00(r5)
        L_0x0499:
            java.lang.Object r8 = r22.get()
            X.Td6 r8 = (X.C13580Td6) r8
            if (r8 == 0) goto L_0x0540
            r0 = r8
            com.facebook.smartcapture.view.SelfieCaptureActivity r0 = (com.facebook.smartcapture.view.SelfieCaptureActivity) r0
            X.0qQ.A0B(r11, r3)
            X.Qcp r12 = r0.A04
            java.lang.String r15 = "cameraOverlayFragment"
            if (r12 == 0) goto L_0x0515
            boolean r0 = com.facebook.smartcapture.view.SelfieCaptureActivity.A01(r12)
            if (r0 != 0) goto L_0x0540
            X.Qcy r12 = (X.C7927Qcy) r12
            float[] r1 = r12.A0Q
            r1[r3] = r21
            r0 = 1
            r1[r0] = r20
            r0 = 2
            r1[r0] = r19
            r15 = 3
            r1[r15] = r18
            float[] r10 = r12.A0R
            r14 = 1
            boolean r0 = X.AnonymousClass7TF.A1W(r11, r7)
            r13 = r1[r3]
            if (r0 != 0) goto L_0x04d1
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r13 = r13 / r0
        L_0x04d1:
            android.view.animation.Interpolator r7 = X.C7927Qcy.A0S
            float r0 = r7.getInterpolation(r13)
            r10[r3] = r0
            boolean r0 = X.AnonymousClass7TF.A1W(r11, r6)
            r6 = r1[r14]
            if (r0 != 0) goto L_0x04e5
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r6 = r6 / r0
        L_0x04e5:
            float r0 = r7.getInterpolation(r6)
            r10[r14] = r0
            boolean r0 = X.AnonymousClass7TF.A1W(r11, r4)
            r6 = 2
            r4 = r1[r6]
            if (r0 != 0) goto L_0x04f8
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r4 = r4 / r0
        L_0x04f8:
            float r0 = r7.getInterpolation(r4)
            r10[r6] = r0
            if (r11 == r2) goto L_0x0501
            r14 = 0
        L_0x0501:
            r1 = r1[r15]
            if (r14 != 0) goto L_0x0509
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r1 = r1 / r0
        L_0x0509:
            float r0 = r7.getInterpolation(r1)
            r10[r15] = r0
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r4 = r12.A09
            if (r4 != 0) goto L_0x051a
            java.lang.String r15 = "captureProgressView"
        L_0x0515:
            X.0qQ.A0F(r15)
            goto L_0x02f6
        L_0x051a:
            int r1 = r11.ordinal()
            r2 = 3
            r0 = 1
            if (r1 == r3) goto L_0x0561
            if (r1 == r0) goto L_0x055f
            if (r1 != r6) goto L_0x0527
            r2 = 2
        L_0x0527:
            r4.A03()
            float[] r0 = r4.A09
            r0[r2] = r17
            float[] r1 = r4.A0B
            r0 = r10[r2]
            r1[r2] = r0
            float[] r1 = r4.A0A
            int r0 = r10.length
            java.lang.System.arraycopy(r10, r3, r1, r3, r0)
            r0 = 0
            r1[r2] = r0
            r4.invalidate()
        L_0x0540:
            long r6 = android.os.SystemClock.elapsedRealtime()
            r1 = 0
            if (r16 == 0) goto L_0x06a7
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x06a7
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x06a7
            java.lang.Integer r4 = r5.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 != r0) goto L_0x06a7
            long r9 = r5.A06
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0563
            r5.A06 = r6
            return
        L_0x055f:
            r2 = 1
            goto L_0x0527
        L_0x0561:
            r2 = 0
            goto L_0x0527
        L_0x0563:
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x059d
            r9 = 1
            r5.A0F = r9
            java.lang.ref.WeakReference r0 = r5.A0D
            java.lang.Object r4 = r0.get()
            X.S3Y r4 = (X.S3Y) r4
            if (r4 == 0) goto L_0x0598
            java.lang.String r10 = r4.A0E
            if (r10 == 0) goto L_0x0598
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0598
            X.SQQ.A01(r10)
            r4.A06 = r3
            r4.A06 = r9
            X.QCN r0 = r4.A0A
            X.Slu r9 = new X.Slu
            r9.<init>(r4)
            X.0qQ.A0B(r10, r3)
            X.AUb r4 = r0.A00()
            java.io.File r0 = X.AnonymousClass7TE.A0t(r10)
            r4.A07(r9, r0)
        L_0x0598:
            java.lang.ref.WeakReference r0 = r5.A0Q
            r0.get()
        L_0x059d:
            long r9 = r5.A06
            long r6 = r6 - r9
            long r9 = r5.A0H
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x06a9
            r5.A06 = r1
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x05d2
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            java.lang.Integer r0 = r5.A0B
            if (r1 == r0) goto L_0x05c1
            r5.A0B = r1
            com.facebook.smartcapture.logging.InMemoryLogger r1 = r5.A0K
            java.lang.String r0 = "CHALLENGE_FINISHED"
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r0 = r1.addEntry(r0)
            r0.submit()
        L_0x05c1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r5.A0A = r0
            X.RwJ r0 = r5.A0O
            if (r0 == 0) goto L_0x05ce
            X.Q7e r0 = r0.A01
            r0.cancel()
        L_0x05ce:
            X.C12061Slo.A01(r5)
            return
        L_0x05d2:
            java.lang.ref.WeakReference r0 = r5.A0Q
            java.lang.Object r4 = r0.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 == 0) goto L_0x05f5
            r1 = 50
            java.lang.String r0 = "vibrator"
            java.lang.Object r4 = r4.getSystemService(r0)
            boolean r0 = r4 instanceof android.os.Vibrator
            if (r0 == 0) goto L_0x05f5
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            if (r4 == 0) goto L_0x05f5
            r0 = -1
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r1, r0)
            r4.vibrate(r0)
        L_0x05f5:
            X.Q7t r0 = r5.A09
            if (r0 == 0) goto L_0x05fb
            r0.A00 = r3
        L_0x05fb:
            if (r8 == 0) goto L_0x06a9
            X.RFH r2 = r5.A02()
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x062d
            r6 = 0
        L_0x0608:
            X.TCi r4 = new X.TCi
            r4.<init>(r5)
            com.facebook.smartcapture.view.SelfieCaptureActivity r8 = (com.facebook.smartcapture.view.SelfieCaptureActivity) r8
            X.0qQ.A0B(r2, r3)
            X.Qcp r7 = r8.A04
            java.lang.String r13 = "cameraOverlayFragment"
            if (r7 == 0) goto L_0x06a2
            boolean r0 = com.facebook.smartcapture.view.SelfieCaptureActivity.A01(r7)
            if (r0 != 0) goto L_0x06a9
            X.Qcy r7 = (X.C7927Qcy) r7
            r5 = 2
            java.lang.Integer r1 = r7.A0C
            r0 = 0
            X.C7927Qcy.A01(r0, r7, r1)
            if (r6 != 0) goto L_0x0643
            r4.run()
            return
        L_0x062d:
            com.facebook.smartcapture.config.ChallengeProvider r0 = r5.A0I
            java.util.List r0 = r0.A03
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r1)
            int r0 = r5.A03
            int r0 = r0 + 1
            java.lang.Object r6 = r1.get(r0)
            X.RFH r6 = (X.RFH) r6
            goto L_0x0608
        L_0x0643:
            com.facebook.smartcapture.ui.view.ArrowHintView r2 = r7.A08
            java.lang.String r15 = "arrowHintView"
            if (r2 == 0) goto L_0x0515
            goto L_0x02e3
        L_0x064b:
            r5.A07 = r11
            r5.A00 = r10
            r5.A01 = r8
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r5.A0B = r0
            com.facebook.smartcapture.logging.InMemoryLogger r1 = r5.A0K
            java.lang.String r0 = "FACE_ALIGNED"
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r9 = r1.addEntry(r0)
            java.lang.String r1 = r11.A00
            java.lang.String r0 = "direction"
            r9.put((java.lang.String) r0, (java.lang.String) r1)
            double r0 = (double) r10
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.RoundingMode r13 = java.math.RoundingMode.HALF_UP
            r10 = 2
            java.math.BigDecimal r1 = r0.setScale(r10, r13)
            X.0qQ.A07(r1)
            java.lang.String r0 = "x"
            r9.put((java.lang.String) r0, (java.lang.Object) r1)
            double r0 = (double) r8
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r1 = r0.setScale(r10, r13)
            X.0qQ.A07(r1)
            java.lang.String r0 = "y"
            r9.put((java.lang.String) r0, (java.lang.Object) r1)
            double r0 = (double) r12
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r1 = r0.setScale(r10, r13)
            X.0qQ.A07(r1)
            java.lang.String r0 = "progress"
            r9.put((java.lang.String) r0, (java.lang.Object) r1)
            r9.submit()
            goto L_0x048c
        L_0x06a2:
            X.0qQ.A0F(r13)
            goto L_0x02f6
        L_0x06a7:
            r5.A06 = r1
        L_0x06a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q7t.handleMessage(android.os.Message):void");
    }

    public Q7t(C12061Slo slo) {
        super(Looper.getMainLooper());
        this.A01 = C51965G9l.A0v(slo);
    }
}
