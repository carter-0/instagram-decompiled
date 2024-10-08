package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8zX  reason: invalid class name and case insensitive filesystem */
public final class C372018zX extends C372028zY {
    public C372038zZ A00 = null;
    public C372048za A01 = new C372048za(false, false, false, false, false, false, false);
    public WeakReference A02;
    public final List A03 = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0449, code lost:
        if (r0.A08 == -1) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04e1, code lost:
        if (X.C372038zZ.A08(r10, r3) != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r5 == r0.A08) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (r6 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(android.view.MotionEvent r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            X.8zZ r2 = r0.A00
            if (r2 == 0) goto L_0x058e
            java.lang.ref.WeakReference r0 = r2.A0C
            r9 = 0
            if (r0 == 0) goto L_0x058e
            X.ALp r0 = r2.A07
            if (r0 == 0) goto L_0x058e
            X.A5w r0 = r2.A06
            if (r0 == 0) goto L_0x058e
            X.A8p r0 = r2.A08
            if (r0 == 0) goto L_0x058e
            android.view.ScaleGestureDetector r0 = r2.A05
            if (r0 == 0) goto L_0x058e
            X.A87 r0 = r2.A09
            if (r0 == 0) goto L_0x058e
            X.AH8 r0 = r2.A0A
            if (r0 == 0) goto L_0x058e
            java.util.Set r0 = r2.A0N
            r1 = r29
            boolean r0 = r0.remove(r1)
            if (r0 != 0) goto L_0x058e
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r1)
            int r0 = r1.getAction()
            if (r0 != 0) goto L_0x004f
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r2.A02
            long r7 = r5 - r3
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r3 = (long) r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            X.C372038zZ.A02(r2)
        L_0x004b:
            r2.A02 = r5
            r2.A0E = r9
        L_0x004f:
            java.util.List r0 = r2.A0H
            r0.add(r1)
            r8 = 1
            java.lang.ref.WeakReference r0 = r2.A0C
            java.lang.Object r5 = r0.get()
            android.view.View r5 = (android.view.View) r5
            r4 = 0
            if (r5 == 0) goto L_0x058b
            int r0 = r5.getWidth()
            float r3 = (float) r0
            int r0 = r5.getHeight()
            float r4 = (float) r0
        L_0x006a:
            X.ALp r0 = r2.A07
            r0.A01 = r3
            r0.A02 = r4
            X.A5w r0 = r2.A06
            r0.A00 = r3
            r0.A01 = r4
            X.A8p r0 = r2.A08
            r0.A00 = r3
            r0.A01 = r4
            android.view.ScaleGestureDetector r0 = r2.A05
            r0.onTouchEvent(r1)
            X.A87 r0 = r2.A09
            int r10 = r1.getActionMasked()
            java.lang.Boolean r3 = r0.A09
            r7 = 2
            r11 = 0
            if (r3 == 0) goto L_0x0521
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0521
            int r3 = r1.getActionIndex()
            int r5 = r1.getPointerId(r3)
            int r4 = r0.A07
            if (r5 == r4) goto L_0x00a4
            int r3 = r0.A08
            r6 = 0
            if (r5 != r3) goto L_0x00a5
        L_0x00a4:
            r6 = 1
        L_0x00a5:
            if (r10 == 0) goto L_0x00b1
            r3 = 3
            if (r10 == r3) goto L_0x00b1
            if (r10 == r8) goto L_0x00b1
            r3 = 6
            if (r10 != r3) goto L_0x0441
            if (r6 == 0) goto L_0x00dc
        L_0x00b1:
            r3 = -1
            r0.A07 = r3
            r0.A08 = r3
            X.A5w r14 = r0.A0A
            X.8zZ r13 = r14.A02
            java.util.Map r4 = r13.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r6 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE
            boolean r3 = r4.containsKey(r6)
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r4.get(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            boolean r5 = X.C372038zZ.A08(r13, r3)
            if (r5 == 0) goto L_0x041e
            java.util.Set r3 = r13.A0O
            r3.add(r6)
        L_0x00d9:
            r3 = 0
        L_0x00da:
            r0.A09 = r3
        L_0x00dc:
            X.AH8 r0 = r2.A0A
            int r5 = r1.getActionMasked()
            r6 = 0
            if (r5 == 0) goto L_0x03e4
            if (r5 == r7) goto L_0x02f0
            r3 = 5
            if (r5 != r3) goto L_0x011e
            java.lang.Boolean r3 = r0.A08
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x011c
            int r7 = r1.getActionIndex()
            int r3 = r1.getPointerId(r7)
            long r3 = (long) r3
            float r15 = r1.getX(r7)
            float r14 = r1.getY(r7)
            java.util.Map r13 = r0.A0J
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            java.lang.Float r11 = java.lang.Float.valueOf(r15)
            java.lang.Float r10 = java.lang.Float.valueOf(r14)
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r11, r10)
            r13.put(r12, r7)
            r0.A02(r3, r15, r14)
        L_0x011c:
            r0.A0E = r9
        L_0x011e:
            android.view.GestureDetector r3 = r0.A0G
            r3.onTouchEvent(r1)
            if (r5 == r8) goto L_0x01ee
            r3 = 3
            if (r5 == r3) goto L_0x01ee
            r3 = 6
            if (r5 != r3) goto L_0x0167
            java.lang.Boolean r3 = r0.A08
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0167
            int r7 = r1.getActionIndex()
            int r3 = r1.getPointerId(r7)
            long r3 = (long) r3
            java.util.Map r6 = r0.A0J
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r6 = r6.get(r5)
            android.util.Pair r6 = (android.util.Pair) r6
            if (r6 == 0) goto L_0x0167
            java.lang.Object r5 = r6.first
            java.lang.Number r5 = (java.lang.Number) r5
            float r10 = r5.floatValue()
            java.lang.Object r5 = r6.second
            java.lang.Number r5 = (java.lang.Number) r5
            float r11 = r5.floatValue()
            float r12 = r1.getX(r7)
            float r13 = r1.getY(r7)
            r14 = r3
            r9 = r0
            X.AH8.A00(r9, r10, r11, r12, r13, r14)
        L_0x0167:
            int r0 = r2.A00
            if (r0 != 0) goto L_0x018f
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x018a
            int r0 = r2.A01
            if (r0 > 0) goto L_0x018a
            java.util.List r3 = r2.A0I
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x058e
            r3.add(r1)
            android.os.Handler r1 = r2.A0F
            X.AiH r0 = new X.AiH
            r0.<init>(r2)
            r1.post(r0)
        L_0x0188:
            r0 = 1
            return r0
        L_0x018a:
            java.util.List r0 = r2.A0I
            r0.add(r1)
        L_0x018f:
            java.util.Set r4 = r2.A0O
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x01c2
            java.util.Iterator r3 = r4.iterator()
        L_0x019b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r1 = r3.next()
            java.util.Map r0 = r2.A0K
            java.lang.Object r1 = r0.remove(r1)
            if (r1 == 0) goto L_0x019b
            java.util.Map r0 = r2.A0L
            java.lang.Object r1 = r0.remove(r1)
            if (r1 == 0) goto L_0x019b
            X.9rt r0 = X.C390819rt.GESTURE_IS_HANDLED_BY_ENGINE
            if (r1 != r0) goto L_0x019b
            int r0 = r2.A00
            int r0 = r0 - r8
            r2.A00 = r0
            goto L_0x019b
        L_0x01bf:
            r4.clear()
        L_0x01c2:
            java.util.Set r4 = r2.A0P
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0188
            java.util.Iterator r3 = r4.iterator()
        L_0x01ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r3.next()
            java.util.Map r0 = r2.A0L
            java.lang.Object r1 = r0.remove(r1)
            if (r1 == 0) goto L_0x01ce
            X.9rt r0 = X.C390819rt.GESTURE_IS_HANDLED_BY_ENGINE
            if (r1 != r0) goto L_0x01ce
            int r0 = r2.A00
            int r0 = r0 - r8
            r2.A00 = r0
            goto L_0x01ce
        L_0x01ea:
            r4.clear()
            goto L_0x0188
        L_0x01ee:
            java.lang.Boolean r3 = r0.A08
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x022a
            int r10 = r1.getActionIndex()
            int r3 = r1.getPointerId(r10)
            long r3 = (long) r3
            java.util.Map r7 = r0.A0J
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r7 = r7.get(r5)
            android.util.Pair r7 = (android.util.Pair) r7
            if (r7 == 0) goto L_0x022a
            java.lang.Object r5 = r7.first
            java.lang.Number r5 = (java.lang.Number) r5
            float r11 = r5.floatValue()
            java.lang.Object r5 = r7.second
            java.lang.Number r5 = (java.lang.Number) r5
            float r12 = r5.floatValue()
            float r13 = r1.getX(r10)
            float r14 = r1.getY(r10)
            r15 = r3
            r10 = r0
            X.AH8.A00(r10, r11, r12, r13, r14, r15)
        L_0x022a:
            java.lang.Float r4 = r0.A0C
            if (r4 == 0) goto L_0x0269
            java.lang.Float r3 = r0.A0A
            if (r3 == 0) goto L_0x0269
            X.A8p r5 = r0.A0H
            float r16 = r3.floatValue()
            java.lang.Float r3 = r0.A0B
            float r17 = r3.floatValue()
            float r13 = r4.floatValue()
            java.lang.Float r3 = r0.A0D
            float r12 = r3.floatValue()
            X.8zZ r7 = r5.A02
            java.util.Map r4 = r7.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r11 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.PAN
            boolean r3 = r4.containsKey(r11)
            if (r3 == 0) goto L_0x0269
            java.lang.Object r3 = r4.get(r11)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            boolean r10 = X.C372038zZ.A08(r7, r3)
            if (r10 == 0) goto L_0x02d5
            java.util.Set r3 = r7.A0O
            r3.add(r11)
        L_0x0269:
            r0.A09 = r6
            float r12 = r0.A00
            float r11 = r0.A01
            java.lang.Boolean r3 = r0.A06
            boolean r4 = r3.booleanValue()
            r3 = 0
            if (r4 == 0) goto L_0x0279
            r3 = 1
        L_0x0279:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            if (r3 == 0) goto L_0x02a4
            r0.A06 = r10
            X.A8p r7 = r0.A0H
            X.8zZ r13 = r7.A02
            java.util.Map r4 = r13.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r9 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.LONG_PRESS
            boolean r3 = r4.containsKey(r9)
            if (r3 == 0) goto L_0x02a4
            java.lang.Object r3 = r4.get(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            boolean r5 = X.C372038zZ.A08(r13, r3)
            if (r5 == 0) goto L_0x02ba
            java.util.Set r3 = r13.A0O
            r3.add(r9)
        L_0x02a4:
            android.os.Handler r4 = r0.A0F
            java.lang.Runnable r3 = r0.A0I
            r4.removeCallbacks(r3)
            r0.A07 = r10
            r0.A0E = r8
            r3 = 0
            r0.A02 = r3
            r0.A03 = r3
            r0.A0C = r6
            r0.A0D = r6
            goto L_0x0167
        L_0x02ba:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r19 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            float r9 = r7.A00
            float r7 = r7.A01
            com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture r5 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture
            r14 = r5
            r15 = r3
            r17 = r12
            r18 = r11
            r20 = r8
            r21 = r9
            r22 = r7
            r14.<init>(r15, r17, r18, r19, r20, r21, r22)
            X.C372038zZ.A05(r13, r5)
            goto L_0x02a4
        L_0x02d5:
            float r14 = r16 - r13
            float r15 = r17 - r12
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r18 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            float r10 = r5.A00
            float r5 = r5.A01
            com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture r11 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture
            r12 = r3
            r19 = r8
            r20 = r10
            r21 = r5
            r11.<init>(r12, r14, r15, r16, r17, r18, r19, r20, r21)
            X.C372038zZ.A05(r7, r11)
            goto L_0x0269
        L_0x02f0:
            java.lang.Boolean r3 = r0.A08
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x038e
            r3 = 0
        L_0x02f9:
            int r4 = r1.getPointerCount()
            if (r3 >= r4) goto L_0x038e
            int r4 = r1.getPointerId(r3)
            long r13 = (long) r4
            java.util.Map r7 = r0.A0J
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            java.lang.Object r7 = r7.get(r4)
            android.util.Pair r7 = (android.util.Pair) r7
            if (r7 == 0) goto L_0x0371
            java.lang.Object r4 = r7.first
            java.lang.Number r4 = (java.lang.Number) r4
            float r16 = r4.floatValue()
            java.lang.Object r4 = r7.second
            java.lang.Number r4 = (java.lang.Number) r4
            float r15 = r4.floatValue()
            float r18 = r1.getX(r3)
            float r19 = r1.getY(r3)
            X.A8p r4 = r0.A0H
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent$TouchEventType r22 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent.TouchEventType.MOVE
            long r23 = java.lang.System.currentTimeMillis()
            float r11 = r4.A00
            float r7 = r4.A01
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent r10 = new com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent
            r17 = r10
            r20 = r13
            r25 = r8
            r26 = r11
            r27 = r7
            r17.<init>(r18, r19, r20, r22, r23, r25, r26, r27)
            X.8zZ r7 = r4.A02
            X.C372038zZ.A06(r7, r10)
            java.util.Map r12 = r7.A0J
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r10 = r12.containsKey(r11)
            if (r10 == 0) goto L_0x0371
            java.lang.Object r13 = r12.get(r11)
            java.lang.Number r13 = (java.lang.Number) r13
            long r10 = r13.longValue()
            int r12 = r12.size()
            if (r12 != r8) goto L_0x0374
            boolean r12 = X.C372038zZ.A08(r7, r10)
            if (r12 == 0) goto L_0x0374
            java.util.Set r4 = r7.A0P
            r4.add(r13)
        L_0x0371:
            int r3 = r3 + 1
            goto L_0x02f9
        L_0x0374:
            float r16 = r18 - r16
            float r17 = r19 - r15
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r20 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CHANGED
            float r12 = r4.A00
            float r4 = r4.A01
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture r13 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture
            r14 = r10
            r21 = r8
            r22 = r12
            r23 = r4
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23)
            X.C372038zZ.A05(r7, r13)
            goto L_0x0371
        L_0x038e:
            int r3 = r1.getPointerCount()
            if (r3 <= r8) goto L_0x0396
            r0.A0E = r9
        L_0x0396:
            java.lang.Boolean r3 = r0.A07
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x03c8
            android.view.MotionEvent r10 = r0.A05
            float r4 = r1.getX()
            float r3 = r10.getX()
            float r4 = r4 - r3
            int r7 = (int) r4
            float r4 = r1.getY()
            float r3 = r10.getY()
            float r4 = r4 - r3
            int r3 = (int) r4
            int r7 = r7 * r7
            int r3 = r3 * r3
            int r7 = r7 + r3
            int r3 = r0.A04
            if (r7 <= r3) goto L_0x03c8
            android.os.Handler r4 = r0.A0F
            java.lang.Runnable r3 = r0.A0I
            r4.removeCallbacks(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r0.A07 = r3
        L_0x03c8:
            java.lang.Boolean r3 = r0.A06
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x011e
            int r3 = r1.getPointerId(r9)
            if (r3 != 0) goto L_0x011e
            float r3 = r1.getX()
            r0.A00 = r3
            float r3 = r1.getY()
            r0.A01 = r3
            goto L_0x011e
        L_0x03e4:
            java.lang.Boolean r3 = r0.A08
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0412
            int r3 = r1.getPointerId(r9)
            long r3 = (long) r3
            float r15 = r1.getX()
            float r14 = r1.getY()
            java.util.Map r13 = r0.A0J
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            java.lang.Float r11 = java.lang.Float.valueOf(r15)
            java.lang.Float r10 = java.lang.Float.valueOf(r14)
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r11, r10)
            r13.put(r12, r7)
            r0.A02(r3, r15, r14)
        L_0x0412:
            r0.A0E = r8
            r0.A09 = r6
            r0.A0A = r6
            r0.A0C = r6
            r0.A0D = r6
            goto L_0x011e
        L_0x041e:
            float r12 = r0.A02
            float r11 = r0.A00
            float r10 = r0.A01
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r20 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            float r6 = r14.A00
            float r5 = r14.A01
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture r14 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture
            r15 = r3
            r17 = r12
            r18 = r11
            r19 = r10
            r21 = r8
            r22 = r6
            r23 = r5
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23)
            X.C372038zZ.A05(r13, r14)
            goto L_0x00d9
        L_0x0441:
            if (r10 != r7) goto L_0x00dc
            r5 = -1
            if (r4 == r5) goto L_0x044b
            int r3 = r0.A08
            r4 = 1
            if (r3 != r5) goto L_0x044c
        L_0x044b:
            r4 = 0
        L_0x044c:
            int r3 = r1.getPointerCount()
            if (r3 < r7) goto L_0x0453
            r11 = 1
        L_0x0453:
            if (r6 == 0) goto L_0x00dc
            if (r11 == 0) goto L_0x00dc
            if (r4 == 0) goto L_0x00dc
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r11 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r10 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r17 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r16 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r15 = r0.A04
            float r3 = r0.A03
            float r15 = r15 - r3
            float r14 = r0.A06
            float r3 = r0.A05
            float r14 = r14 - r3
            float r13 = r17 - r11
            float r12 = r16 - r10
            float r4 = r15 * r12
            float r3 = r14 * r13
            float r4 = r4 - r3
            double r5 = (double) r4
            float r15 = r15 * r13
            float r14 = r14 * r12
            float r15 = r15 + r14
            double r3 = (double) r15
            double r3 = java.lang.Math.atan2(r5, r3)
            float r5 = (float) r3
            r0.A02 = r5
            float r11 = r11 + r17
            r3 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r3
            r0.A00 = r11
            float r10 = r10 + r16
            float r10 = r10 / r3
            r0.A01 = r10
            X.A5w r12 = r0.A0A
            X.8zZ r10 = r12.A02
            java.util.Map r13 = r10.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r4 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE
            boolean r3 = r13.containsKey(r4)
            if (r3 != 0) goto L_0x04c7
            float r6 = java.lang.Math.abs(r5)
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x04c7
            goto L_0x00dc
        L_0x04c7:
            r10.A0E = r8
            float r6 = r0.A00
            float r11 = r0.A01
            boolean r0 = r13.containsKey(r4)
            if (r0 == 0) goto L_0x04e5
            java.lang.Object r0 = r13.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            boolean r0 = X.C372038zZ.A08(r10, r3)
            if (r0 == 0) goto L_0x0504
            goto L_0x00dc
        L_0x04e5:
            long r3 = X.C372038zZ.A00(r10, r4)
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r20 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.BEGAN
            float r13 = r12.A00
            float r0 = r12.A01
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture r14 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture
            r15 = r3
            r17 = r5
            r18 = r6
            r19 = r11
            r21 = r8
            r22 = r13
            r23 = r0
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23)
            X.C372038zZ.A05(r10, r14)
        L_0x0504:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r20 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CHANGED
            float r13 = r12.A00
            float r0 = r12.A01
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture r14 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture
            r15 = r3
            r17 = r5
            r18 = r6
            r19 = r11
            r21 = r8
            r22 = r13
            r23 = r0
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23)
            X.C372038zZ.A05(r10, r14)
            goto L_0x00dc
        L_0x0521:
            r3 = 5
            if (r10 != r3) goto L_0x00dc
            int r3 = r1.getPointerCount()
            if (r3 != r7) goto L_0x00dc
            int r3 = r1.getPointerId(r9)
            r0.A07 = r3
            int r3 = r1.getPointerId(r8)
            r0.A08 = r3
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r3 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            r0.A03 = r3     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r3 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            r0.A05 = r3     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r3 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            r0.A04 = r3     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x00dc }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            float r6 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x00dc }
            r0.A06 = r6     // Catch:{ IllegalArgumentException -> 0x00dc }
            r3 = 0
            r0.A02 = r3
            float r5 = r0.A03
            float r3 = r0.A04
            float r5 = r5 + r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r4
            r0.A00 = r5
            float r3 = r0.A05
            float r3 = r3 + r6
            float r3 = r3 / r4
            r0.A01 = r3
            X.A5w r3 = r0.A0A
            X.8zZ r3 = r3.A02
            java.util.Set r4 = r3.A0Q
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r3 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE
            boolean r3 = r4.contains(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x00da
        L_0x058b:
            r3 = 0
            goto L_0x006a
        L_0x058e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372018zX.A03(android.view.MotionEvent, int):boolean");
    }
}
