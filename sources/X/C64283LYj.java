package X;

import android.view.View;

/* renamed from: X.LYj  reason: case insensitive filesystem */
public final class C64283LYj implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C64283LYj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r2.getId() == com.instagram.android.R.id.filmstrip_dimmer_left) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            r2 = r20
            r4 = r21
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x0039;
                case 2: goto L_0x0096;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.A02
            android.view.View r0 = (android.view.View) r0
            X.0nA.A0N(r0)
            java.lang.Object r2 = r1.A01
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r0 = r2.getText()
            if (r0 == 0) goto L_0x0022
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0037
        L_0x0022:
            java.lang.Object r0 = r1.A03
            X.E4V r0 = (X.E4V) r0
            X.EV0 r1 = X.E4V.A01(r0)
            X.EV0 r0 = X.EV0.Social
            if (r1 != r0) goto L_0x0037
            r0 = 2131959372(0x7f131e4c, float:1.9555383E38)
            r2.setText(r0)
            X.JTR.A1F(r2)
        L_0x0037:
            r6 = 0
            return r6
        L_0x0039:
            java.lang.Object r5 = r1.A03
            X.JcV r5 = (X.C59962JcV) r5
            X.0qQ.A0A(r2)
            X.0qQ.A0A(r4)
            java.lang.Object r3 = r1.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r1.A01
            X.Lkh r1 = (X.C64942Lkh) r1
            if (r1 == 0) goto L_0x0056
            java.lang.Object r0 = X.C61080JwI.A01(r5)
            if (r0 != 0) goto L_0x0056
            r1.CIj(r2, r4)
        L_0x0056:
            int r1 = r4.getActionMasked()
            r0 = 0
            if (r1 == 0) goto L_0x0061
            r0 = 1
            if (r1 != r0) goto L_0x0064
            r0 = 4
        L_0x0061:
            r3.setVisibility(r0)
        L_0x0064:
            java.lang.Object r0 = X.C61080JwI.A01(r5)
            X.MVo r0 = (X.C66534MVo) r0
            if (r0 == 0) goto L_0x0037
            boolean r6 = r0.CIj(r2, r4)
            return r6
        L_0x0071:
            java.lang.Object r3 = r1.A01
            X.JW9 r3 = (X.JW9) r3
            java.lang.Object r2 = r1.A02
            X.8ZW r2 = (X.AnonymousClass8ZW) r2
            java.lang.Object r1 = r1.A03
            X.8gN r1 = (X.C361528gN) r1
            int r0 = r4.getAction()
            r6 = 1
            if (r0 != r6) goto L_0x008e
            if (r2 == 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            com.instagram.ui.widget.trianglespinner.TriangleSpinner r0 = r3.A09
            r2.Cuz(r0, r1)
            return r6
        L_0x008e:
            int r1 = r4.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x0037
            return r6
        L_0x0096:
            int r3 = r2.getId()
            r0 = 2131443232(0x7f0b3e20, float:1.8508526E38)
            r5 = 1
            if (r3 == r0) goto L_0x00aa
            int r3 = r2.getId()
            r0 = 2131432836(0x7f0b1584, float:1.848744E38)
            r10 = 0
            if (r3 != r0) goto L_0x00ab
        L_0x00aa:
            r10 = 1
        L_0x00ab:
            int r0 = r4.getAction()
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x00d4
            if (r0 != r5) goto L_0x00f7
            java.lang.Object r8 = r1.A03
            X.KPj r8 = (X.C61870KPj) r8
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x00f7
            X.9Pn r0 = r8.A0G
            if (r0 == 0) goto L_0x00cf
            com.instagram.pendingmedia.model.ClipInfo r3 = r8.A0H
            if (r3 != 0) goto L_0x00e3
            java.lang.String r0 = "clipInfo"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x00d4:
            java.lang.Object r3 = r1.A03
            X.KPj r3 = (X.C61870KPj) r3
            r0 = 0
            r3.A0I = r0
            X.9Pn r0 = r3.A0G
            if (r0 == 0) goto L_0x00f7
            r0.A09(r5)
            goto L_0x00f7
        L_0x00e3:
            double r6 = X.C61870KPj.A01(r8)
            int r0 = (int) r6
            r3.A05 = r0
            X.9Pn r0 = r8.A0G
            if (r10 == 0) goto L_0x012d
            if (r0 == 0) goto L_0x00f7
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x00f7
            r0.A0C()
        L_0x00f7:
            long r11 = r4.getDownTime()
            long r13 = r4.getEventTime()
            int r15 = r4.getAction()
            float r16 = r4.getRawX()
            float r17 = r4.getRawY()
            int r18 = r4.getMetaState()
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r11, r13, r15, r16, r17, r18)
            if (r10 == 0) goto L_0x012a
            java.lang.Object r0 = r1.A01
        L_0x0117:
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r6 = r0.onTouchEvent(r3)
            r3.recycle()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0137
            r0.requestDisallowInterceptTouchEvent(r5)
            return r6
        L_0x012a:
            java.lang.Object r0 = r1.A02
            goto L_0x0117
        L_0x012d:
            if (r0 == 0) goto L_0x00f7
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x00f7
            r0.A0B()
            goto L_0x00f7
        L_0x0137:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64283LYj.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
