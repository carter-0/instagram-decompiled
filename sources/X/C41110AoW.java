package X;

/* renamed from: X.AoW  reason: case insensitive filesystem */
public final class C41110AoW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AS3 A01;
    public final /* synthetic */ boolean A02;

    public C41110AoW(AS3 as3, long j, boolean z) {
        this.A01 = as3;
        this.A00 = j;
        this.A02 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            X.AS3 r0 = r7.A01
            X.8zZ r5 = r0.A00
            long r3 = r7.A00
            boolean r2 = r7.A02
            r1 = 1
            r5.A0E = r1
            int r0 = r5.A01
            int r0 = r0 - r1
            r5.A01 = r0
            if (r2 == 0) goto L_0x00d4
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            java.util.Map r2 = r5.A0L
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.9rt r0 = X.C390819rt.GESTURE_IS_HANDLED_BY_ENGINE
            r2.put(r1, r0)
            java.util.Map r0 = r5.A0M
            java.lang.Object r6 = r0.remove(r1)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007a
            r2 = 0
            r3 = 0
        L_0x002f:
            int r0 = r6.size()
            if (r3 >= r0) goto L_0x0058
            java.lang.Object r2 = r6.get(r3)
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture r2 = (com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture) r2
            X.8zY r0 = r5.A0G
            java.util.List r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r1.next()
            X.B2h r0 = (X.C41826B2h) r0
            r0.addGestureEvent(r2)
            goto L_0x0045
        L_0x0055:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0058:
            if (r2 == 0) goto L_0x0095
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r1 = r2.gestureState
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            if (r1 == r0) goto L_0x0068
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CANCELLED
            if (r1 == r0) goto L_0x0068
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.FAILED
            if (r1 != r0) goto L_0x0095
        L_0x0068:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = r2.getGestureType()
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.RAW_TOUCH
            if (r1 != r0) goto L_0x0092
            long r0 = r2.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C372038zZ.A07(r5, r0)
            goto L_0x0095
        L_0x007a:
            java.util.Map r2 = r5.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r2.get(r1)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0095
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
        L_0x0092:
            X.C372038zZ.A04(r5, r1)
        L_0x0095:
            java.util.List r0 = r5.A0I
            r0.clear()
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x011d
            java.util.List r0 = r5.A0H
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r0.clear()
            r0 = 0
            r5.A0D = r0
            java.util.Set r0 = r5.A0N
            r0.addAll(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x00b4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r2 = r3.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            java.lang.ref.WeakReference r1 = r5.A0C
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r1.get()
            android.view.View r0 = (android.view.View) r0
            r0.dispatchTouchEvent(r2)
            goto L_0x00b4
        L_0x00d4:
            java.util.Map r2 = r5.A0L
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.9rt r0 = X.C390819rt.GESTURE_IS_HANDLED_BY_CLIENT
            r2.put(r1, r0)
            java.util.Map r0 = r5.A0M
            java.lang.Object r1 = r0.remove(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x011e
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r2 = r1.get(r0)
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture r2 = (com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture) r2
            if (r2 == 0) goto L_0x0116
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r1 = r2.gestureState
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            if (r1 == r0) goto L_0x0105
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CANCELLED
            if (r1 == r0) goto L_0x0105
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.FAILED
            if (r1 != r0) goto L_0x0116
        L_0x0105:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = r2.getGestureType()
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.RAW_TOUCH
            if (r1 != r0) goto L_0x0136
            long r0 = r2.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C372038zZ.A07(r5, r0)
        L_0x0116:
            int r0 = r5.A01
            if (r0 != 0) goto L_0x011d
            X.C372038zZ.A01(r5)
        L_0x011d:
            return
        L_0x011e:
            java.util.Map r2 = r5.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r2.get(r1)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
        L_0x0136:
            X.C372038zZ.A04(r5, r1)
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41110AoW.run():void");
    }
}
