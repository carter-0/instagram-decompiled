package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Jdi  reason: case insensitive filesystem */
public final class C60032Jdi extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;

    public C60032Jdi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r0.DP0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        super.onLongPress(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLongPress(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 3: goto L_0x004d;
                case 4: goto L_0x0044;
                case 5: goto L_0x0005;
                case 6: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onLongPress(r6)
        L_0x0008:
            return
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r5.A01
            X.37F r3 = (X.AnonymousClass37F) r3
            X.0lg r4 = r3.A0v
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321584939804198(0x810a4a00042626, double:3.033254798990906E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0008
            X.Pzn r0 = r3.A0D
            if (r0 == 0) goto L_0x0005
            r2 = 1
            int r1 = r0.A09
            r0 = 2
            if (r1 == r0) goto L_0x0005
            X.Tht r0 = r3.A0G
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.DPO()
            if (r0 != r2) goto L_0x0005
            float r0 = r6.getY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Integer r0 = r3.A0a(r0)
            r3.A0T(r0)
            goto L_0x0005
        L_0x0044:
            java.lang.Object r0 = r5.A01
            com.instagram.creation.photo.crop.LayoutImageView r0 = (com.instagram.creation.photo.crop.LayoutImageView) r0
            X.MUq r0 = r0.A00
            if (r0 == 0) goto L_0x0008
            goto L_0x0051
        L_0x004d:
            java.lang.Object r0 = r5.A01
            X.MUq r0 = (X.C66512MUq) r0
        L_0x0051:
            r0.DP0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60032Jdi.onLongPress(android.view.MotionEvent):void");
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (6 - this.A00 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        0qQ.A0B(motionEvent, 0);
        AnonymousClass37F r2 = (AnonymousClass37F) this.A01;
        C7218Pzn pzn = r2.A0D;
        if (pzn == null || pzn.A09 == 2) {
            return false;
        }
        r2.A0T(r2.A0a(Float.valueOf(motionEvent.getY())));
        C13823Tht tht = r2.A0G;
        if (tht == null) {
            return false;
        }
        tht.Dkz();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00be;
                case 1: goto L_0x0097;
                case 2: goto L_0x002b;
                case 3: goto L_0x0022;
                case 4: goto L_0x0019;
                case 5: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.onSingleTapUp(r10)
            return r0
        L_0x000a:
            java.lang.Object r0 = r9.A01
            X.Vjm r0 = (X.C18010Vjm) r0
            X.0sa r0 = r0.A00
            if (r0 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            r0.invoke()
            goto L_0x00cd
        L_0x0019:
            java.lang.Object r0 = r9.A01
            com.instagram.creation.photo.crop.LayoutImageView r0 = (com.instagram.creation.photo.crop.LayoutImageView) r0
            X.MUq r0 = r0.A00
            if (r0 == 0) goto L_0x00cd
            goto L_0x0026
        L_0x0022:
            java.lang.Object r0 = r9.A01
            X.MUq r0 = (X.C66512MUq) r0
        L_0x0026:
            r0.Dl1()
            goto L_0x00cd
        L_0x002b:
            r5 = 0
            X.0qQ.A0B(r10, r5)
            java.lang.Object r4 = r9.A01
            X.Ryl r4 = (X.C10825Ryl) r4
            float r8 = r10.getX()
            float r7 = r10.getY()
            java.util.List r0 = r4.A04
            java.util.Iterator r3 = r0.iterator()
        L_0x0041:
            boolean r0 = r3.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.Object r6 = r3.next()
            r0 = r6
            X.L3V r0 = (X.L3V) r0
            android.graphics.Rect r2 = r0.A01
            int r1 = (int) r8
            int r0 = (int) r7
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L_0x0041
        L_0x0059:
            X.L3V r6 = (X.L3V) r6
            if (r6 == 0) goto L_0x0092
            boolean r0 = r6.A00
            r0 = r0 ^ 1
            r6.A00 = r0
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 1
            r2.A05(r0)
            X.0sa r0 = r4.A08
            r0.invoke()
            X.02m r3 = X.C51965G9l.A0l()
            boolean r0 = r6.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_redacted"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r0, r1)
            r1 = 391258595(0x175221e3, float:6.789743E-25)
            r3.markerStart(r1, r5)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x008e
            X.C67571Mq5.A00(r3, r2, r1)
        L_0x008e:
            r0 = 2
            r3.markerEnd(r1, r5, r0)
        L_0x0092:
            X.REI r0 = X.REI.NONE
            r4.A02 = r0
            goto L_0x00cd
        L_0x0097:
            java.lang.Object r2 = r9.A01
            X.KB6 r2 = (X.KB6) r2
            X.KiN r1 = r2.A03
            X.KiN r0 = X.C62590KiN.A08
            if (r1 != r0) goto L_0x00ae
            X.LYn r1 = r2.A0J
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x00cd
            r0 = 0
            r1.A04(r0)
            goto L_0x00cd
        L_0x00ae:
            int r0 = r2.A02
            int r1 = r0 + 1
            X.KiR[] r0 = X.C62594KiR.values()
            int r0 = r0.length
            int r1 = r1 % r0
            r2.A02 = r1
            X.KB6.A03(r2)
            goto L_0x00cd
        L_0x00be:
            java.lang.Object r2 = r9.A01
            X.KB6 r2 = (X.KB6) r2
            int r0 = r2.A00
            int r1 = r0 + 1
            r0 = 5
            int r1 = r1 % r0
            r2.A00 = r1
            X.KB6.A06(r2)
        L_0x00cd:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60032Jdi.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
