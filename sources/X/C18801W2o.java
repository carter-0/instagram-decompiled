package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.W2o  reason: case insensitive filesystem */
public final class C18801W2o {
    public static final int[] A09 = {0, 0};
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = -1;
    public Map A04;
    public Set A05 = new HashSet();
    public Map A06;
    public Map A07;
    public final ViewGroup A08;

    public static ArrayList A00(C16483Uvd uvd, C16483Uvd uvd2, List list, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        if (!z) {
            boolean z2 = false;
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = ((C17964Viy) list.get(size)).A01;
                if (!z2) {
                    if (!C18670VwT.A00(view, uvd2) && !C18670VwT.A00(view, uvd)) {
                        arrayList.remove(size);
                    } else if (C18670VwT.A00(view, uvd2)) {
                        z2 = true;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.view.MotionEvent r12, X.C20877X2e r13, X.V45 r14, int r15) {
        /*
            r11 = this;
            int r4 = r14.A00
            r3 = -1
            if (r15 == r3) goto L_0x0078
            java.util.Map r0 = r14.A05
            java.lang.Object r6 = X.C51968G9o.A10(r0, r4)
            java.util.List r6 = (java.util.List) r6
        L_0x000d:
            java.util.Map r0 = r11.A07
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0072
            java.util.Map r0 = r11.A07
            java.util.List r1 = X.C66580MXl.A13(r1, r0)
        L_0x0021:
            r2 = 0
            r7 = 0
            r5 = 0
            r9 = 0
        L_0x0025:
            int r8 = r6.size()
            int r0 = r1.size()
            int r0 = java.lang.Math.min(r8, r0)
            r8 = 1
            if (r7 >= r0) goto L_0x007e
            int r0 = X.DbT.A02(r6, r8)
            int r0 = r0 - r7
            java.lang.Object r10 = r6.get(r0)
            int r0 = X.DbT.A02(r1, r8)
            int r0 = r0 - r7
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x007e
            int r0 = X.DbT.A02(r6, r8)
            int r0 = r0 - r7
            java.lang.Object r0 = r6.get(r0)
            X.Viy r0 = (X.C17964Viy) r0
            android.view.View r8 = r0.A01
            if (r5 != 0) goto L_0x0064
            X.Uvd r0 = X.C16483Uvd.ENTER_CAPTURE
            boolean r0 = X.C18670VwT.A00(r8, r0)
            if (r0 == 0) goto L_0x0064
            r5 = 1
        L_0x0064:
            if (r9 != 0) goto L_0x006f
            X.Uvd r0 = X.C16483Uvd.LEAVE_CAPTURE
            boolean r0 = X.C18670VwT.A00(r8, r0)
            if (r0 == 0) goto L_0x006f
            r9 = 1
        L_0x006f:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0072:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0078:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x000d
        L_0x007e:
            int r8 = r6.size()
            int r0 = r1.size()
            int r0 = java.lang.Math.max(r8, r0)
            if (r7 >= r0) goto L_0x0103
            int r0 = r11.A01
            int r8 = r0 + 1
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r8 % r0
            r11.A01 = r8
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00d2
            java.lang.Object r0 = r1.get(r2)
            X.Viy r0 = (X.C17964Viy) r0
            int r8 = r0.A00
            X.Uvd r10 = X.C16483Uvd.OUT
            X.Uvd r0 = X.C16483Uvd.OUT_CAPTURE
            boolean r0 = A03(r10, r0, r1)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "topPointerOut"
            X.UTO r0 = X.UTO.A01(r12, r14, r0, r8)
            r13.APe(r0)
        L_0x00b7:
            int r0 = X.DbT.A02(r1, r7)
            java.util.List r8 = r1.subList(r2, r0)
            X.Uvd r1 = X.C16483Uvd.LEAVE
            X.Uvd r0 = X.C16483Uvd.LEAVE_CAPTURE
            java.util.ArrayList r1 = A00(r1, r0, r8, r9)
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00d2
            java.lang.String r0 = "topPointerLeave"
            A02(r12, r13, r14, r0, r1)
        L_0x00d2:
            X.Uvd r1 = X.C16483Uvd.OVER
            X.Uvd r0 = X.C16483Uvd.OVER_CAPTURE
            boolean r0 = A03(r1, r0, r6)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "topPointerOver"
            X.UTO r0 = X.UTO.A01(r12, r14, r0, r15)
            r13.APe(r0)
        L_0x00e5:
            int r0 = X.DbT.A02(r6, r7)
            java.util.List r2 = r6.subList(r2, r0)
            X.Uvd r1 = X.C16483Uvd.ENTER
            X.Uvd r0 = X.C16483Uvd.ENTER_CAPTURE
            java.util.ArrayList r1 = A00(r1, r0, r2, r5)
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0103
            java.util.Collections.reverse(r1)
            java.lang.String r0 = "topPointerEnter"
            A02(r12, r13, r14, r0, r1)
        L_0x0103:
            java.util.Map r0 = r14.A05
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            if (r15 != r3) goto L_0x0113
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.remove(r0)
        L_0x0113:
            r11.A07 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18801W2o.A01(android.view.MotionEvent, X.X2e, X.V45, int):void");
    }

    public final void A04(MotionEvent motionEvent, View view, C20877X2e x2e) {
        if (this.A00 == -1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int[] iArr = new int[2];
            this.A08.getLocationOnScreen(iArr);
            obtain.setLocation(motionEvent.getRawX() - ((float) iArr[0]), motionEvent.getRawY() - ((float) iArr[1]));
            obtain.setAction(3);
            A05(obtain, x2e, false);
            this.A00 = view.getId();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.V45] */
    /* JADX WARNING: type inference failed for: r5v19, types: [java.lang.Object, X.V45] */
    /* JADX WARNING: type inference failed for: r4v16, types: [java.util.List] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0189, code lost:
        if (r8 != false) goto L_0x03db;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.view.MotionEvent r22, X.C20877X2e r23, boolean r24) {
        /*
            r21 = this;
            r14 = r21
            int r0 = r14.A00
            r12 = -1
            if (r0 != r12) goto L_0x043c
            r13 = r22
            int r11 = r13.getActionMasked()
            int r0 = r13.getActionIndex()
            int r20 = r13.getPointerId(r0)
            r10 = 0
            if (r11 != 0) goto L_0x00db
            int r0 = r13.getPointerId(r10)
            r14.A03 = r0
        L_0x001e:
            java.util.HashMap r19 = new java.util.HashMap
            r19.<init>()
            java.util.HashMap r18 = new java.util.HashMap
            r18.<init>()
            java.util.HashMap r17 = new java.util.HashMap
            r17.<init>()
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            r9 = 0
        L_0x0033:
            int r0 = r13.getPointerCount()
            if (r9 >= r0) goto L_0x00e9
            r8 = 2
            float[] r7 = new float[r8]
            float[] r6 = new float[r8]
            float r0 = r13.getX(r9)
            r6[r10] = r0
            float r2 = r13.getY(r9)
            r16 = 1
            r6[r16] = r2
            r1 = r6[r10]
            android.view.ViewGroup r5 = r14.A08
            float[] r0 = X.C18797W2f.A01
            r7[r10] = r1
            r7[r16] = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.view.View r3 = X.C18797W2f.A02(r5, r4, r7)
            if (r3 == 0) goto L_0x00a1
            r1 = 0
        L_0x0062:
            int r0 = r3.getId()
            if (r0 > 0) goto L_0x0073
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            int r1 = r1 + 1
            if (r3 == 0) goto L_0x0073
            goto L_0x0062
        L_0x0073:
            if (r1 <= 0) goto L_0x0083
            int r0 = r4.size()
            if (r1 > r0) goto L_0x0083
            int r0 = r4.size()
            java.util.List r4 = r4.subList(r1, r0)
        L_0x0083:
            r2 = r7[r10]
            r1 = r7[r16]
            boolean r0 = r3 instanceof X.X2Z
            if (r0 == 0) goto L_0x00d6
            r0 = r3
            X.X2Z r0 = (X.X2Z) r0
            int r1 = r0.E66(r2, r1)
        L_0x0092:
            int r0 = r3.getId()
            if (r1 == r0) goto L_0x00a1
            r2 = 0
            X.Viy r0 = new X.Viy
            r0.<init>(r2, r1)
            r4.add(r10, r0)
        L_0x00a1:
            int r0 = r13.getPointerId(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r19
            r0.put(r1, r7)
            r0 = r18
            r0.put(r1, r4)
            r0 = r17
            r0.put(r1, r6)
            float[] r3 = new float[r8]
            int[] r4 = A09
            r5.getLocationOnScreen(r4)
            r2 = r6[r10]
            r0 = r4[r10]
            float r0 = (float) r0
            float r2 = r2 + r0
            r3[r10] = r2
            r2 = r6[r16]
            r0 = r4[r16]
            float r0 = (float) r0
            float r2 = r2 + r0
            r3[r16] = r2
            r15.put(r1, r3)
            int r9 = r9 + 1
            goto L_0x0033
        L_0x00d6:
            int r1 = r3.getId()
            goto L_0x0092
        L_0x00db:
            r0 = 7
            if (r11 != r0) goto L_0x001e
            java.util.Set r1 = r14.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1.add(r0)
            goto L_0x001e
        L_0x00e9:
            android.view.ViewGroup r3 = r14.A08
            int r5 = com.facebook.react.uimanager.UIManagerHelper.A01(r3)
            int r0 = r14.A03
            int r4 = r14.A02
            java.util.Set r1 = r14.A05
            X.V45 r2 = new X.V45
            r2.<init>()
            r2.A02 = r0
            r0 = r20
            r2.A00 = r0
            r2.A01 = r4
            r2.A03 = r5
            r0 = r19
            r2.A06 = r0
            r0 = r18
            r2.A05 = r0
            r0 = r17
            r2.A04 = r0
            r2.A07 = r15
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.A08 = r0
            r9 = 1
            if (r24 == 0) goto L_0x016b
            int r4 = r13.getActionMasked()
            r0 = 10
            if (r4 != r0) goto L_0x016b
            r8 = 1
            java.util.Map r4 = r14.A07
            if (r4 == 0) goto L_0x043c
            int r0 = r2.A00
            java.lang.Object r4 = X.C51968G9o.A10(r4, r0)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x043c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x043c
            int r0 = X.DbT.A02(r4, r9)
            java.lang.Object r4 = r4.get(r0)
            X.Viy r4 = (X.C17964Viy) r4
            int r0 = r4.A00
            android.view.View r6 = r4.A01
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Map r4 = r2.A05
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            r4.put(r5, r7)
        L_0x0155:
            r4 = r23
            r14.A01(r13, r4, r2, r0)
            switch(r11) {
                case 0: goto L_0x018d;
                case 1: goto L_0x01f2;
                case 2: goto L_0x03db;
                case 3: goto L_0x02a2;
                case 4: goto L_0x015d;
                case 5: goto L_0x018d;
                case 6: goto L_0x01f2;
                case 7: goto L_0x03a6;
                case 8: goto L_0x015d;
                case 9: goto L_0x043c;
                case 10: goto L_0x0189;
                default: goto L_0x015d;
            }
        L_0x015d:
            java.lang.String r2 = "Motion Event was ignored. Action="
            java.lang.String r1 = " Target="
            java.lang.String r1 = X.002.A02(r11, r0, r2, r1)
            java.lang.String r0 = "ReactNative"
            X.0I1.A04(r0, r1)
            return
        L_0x016b:
            r8 = 0
            java.util.Map r0 = r2.A05
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            java.util.List r4 = X.C66580MXl.A13(r5, r0)
            if (r4 == 0) goto L_0x043c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x043c
            java.lang.Object r4 = r4.get(r10)
            X.Viy r4 = (X.C17964Viy) r4
            int r0 = r4.A00
            android.view.View r6 = r4.A01
            goto L_0x0155
        L_0x0189:
            if (r8 == 0) goto L_0x0424
            goto L_0x03db
        L_0x018d:
            java.util.Map r5 = r2.A05
            int r3 = r2.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.util.List r6 = X.C66580MXl.A13(r7, r5)
            int r3 = r14.A01
            int r5 = r3 + 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r5 % r3
            r14.A01 = r5
            boolean r3 = r1.contains(r7)
            if (r3 != 0) goto L_0x01cc
            X.Uvd r5 = X.C16483Uvd.OVER
            X.Uvd r3 = X.C16483Uvd.OVER_CAPTURE
            boolean r3 = A03(r5, r3, r6)
            if (r3 == 0) goto L_0x01bc
            java.lang.String r3 = "topPointerOver"
            X.UTO r3 = X.UTO.A01(r13, r2, r3, r0)
            r4.APe(r3)
        L_0x01bc:
            X.Uvd r5 = X.C16483Uvd.ENTER
            X.Uvd r3 = X.C16483Uvd.ENTER_CAPTURE
            java.util.ArrayList r5 = A00(r5, r3, r6, r10)
            java.util.Collections.reverse(r5)
            java.lang.String r3 = "topPointerEnter"
            A02(r13, r4, r2, r3, r5)
        L_0x01cc:
            X.Uvd r5 = X.C16483Uvd.CLICK
            X.Uvd r3 = X.C16483Uvd.CLICK_CAPTURE
            boolean r3 = A03(r5, r3, r6)
            if (r3 == 0) goto L_0x01e0
            java.util.Map r5 = r14.A04
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r5.put(r7, r3)
        L_0x01e0:
            X.Uvd r5 = X.C16483Uvd.DOWN
            X.Uvd r3 = X.C16483Uvd.DOWN_CAPTURE
            boolean r3 = A03(r5, r3, r6)
            if (r3 == 0) goto L_0x0424
            java.lang.String r3 = "topPointerDown"
            X.UTO r7 = X.UTO.A01(r13, r2, r3, r0)
            goto L_0x0421
        L_0x01f2:
            int r3 = r14.A01
            int r5 = r3 + 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r5 % r3
            r14.A01 = r5
            int r5 = r2.A00
            java.util.Map r3 = r2.A05
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.util.List r3 = X.C66580MXl.A13(r6, r3)
            X.Uvd r7 = X.C16483Uvd.UP
            X.Uvd r5 = X.C16483Uvd.UP_CAPTURE
            boolean r5 = A03(r7, r5, r3)
            if (r5 == 0) goto L_0x021b
            java.lang.String r5 = "topPointerUp"
            X.UTO r5 = X.UTO.A01(r13, r2, r5, r0)
            r4.APe(r5)
        L_0x021b:
            boolean r5 = r1.contains(r6)
            if (r5 != 0) goto L_0x0241
            X.Uvd r7 = X.C16483Uvd.OUT
            X.Uvd r5 = X.C16483Uvd.OUT_CAPTURE
            boolean r5 = A03(r7, r5, r3)
            if (r5 == 0) goto L_0x0234
            java.lang.String r5 = "topPointerOut"
            X.UTO r0 = X.UTO.A01(r13, r2, r5, r0)
            r4.APe(r0)
        L_0x0234:
            X.Uvd r5 = X.C16483Uvd.LEAVE
            X.Uvd r0 = X.C16483Uvd.LEAVE_CAPTURE
            java.util.ArrayList r5 = A00(r5, r0, r3, r10)
            java.lang.String r0 = "topPointerLeave"
            A02(r13, r4, r2, r0, r5)
        L_0x0241:
            java.util.Map r0 = r14.A04
            java.lang.Object r7 = r0.remove(r6)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0295
            X.Uvd r5 = X.C16483Uvd.CLICK
            X.Uvd r0 = X.C16483Uvd.CLICK_CAPTURE
            boolean r0 = A03(r5, r0, r3)
            if (r0 == 0) goto L_0x0295
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0279
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0279
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x026f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x027e
            X.C13991Tnr.A1M(r5, r7, r3)
            goto L_0x026f
        L_0x0279:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x027e:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0295
            java.lang.Object r0 = r7.get(r10)
            X.Viy r0 = (X.C17964Viy) r0
            int r3 = r0.A00
            java.lang.String r0 = "topClick"
            X.UTO r0 = X.UTO.A01(r13, r2, r0, r3)
            r4.APe(r0)
        L_0x0295:
            int r0 = r13.getActionMasked()
            if (r0 != r9) goto L_0x029d
            r14.A03 = r12
        L_0x029d:
            r1.remove(r6)
            goto L_0x0424
        L_0x02a2:
            int r0 = r14.A00
            boolean r5 = X.AnonymousClass7TF.A1S(r0, r12)
            r0 = 487(0x1e7, float:6.82E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0Sd.A03(r5, r0)
            int r5 = r2.A00
            java.util.Map r0 = r2.A05
            java.lang.Object r7 = X.C51968G9o.A10(r0, r5)
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x03a2
            if (r6 == 0) goto L_0x03a2
            X.Uvd r5 = X.C16483Uvd.CANCEL
            X.Uvd r0 = X.C16483Uvd.CANCEL_CAPTURE
            boolean r0 = A03(r5, r0, r7)
            if (r0 == 0) goto L_0x0396
            java.lang.Object r0 = r7.get(r10)
            X.Viy r0 = (X.C17964Viy) r0
            int r0 = r0.A00
            r17 = r0
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r10, r10, r9, r9)
            r3.offsetDescendantRectToMyCoords(r6, r5)
            r6 = 2
            int r0 = r5.top
            int r7 = r5.left
            int[] r0 = new int[]{r0, r7}
            r0 = r0[r10]
            float r5 = (float) r0
            float r0 = (float) r7
            java.util.Map r7 = r2.A06
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>(r7)
            java.util.Map r7 = r2.A04
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>(r7)
            java.util.Map r15 = r2.A07
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>(r15)
            float[] r15 = new float[r6]
            r15[r10] = r5
            r15[r9] = r0
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r11)
        L_0x030b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0319
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)
            r0.setValue(r15)
            goto L_0x030b
        L_0x0319:
            float[] r5 = new float[r6]
            r5 = {0, 0} // fill-array
            java.util.Iterator r16 = X.AnonymousClass7TF.A0s(r8)
        L_0x0322:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0330
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r16)
            r0.setValue(r5)
            goto L_0x0322
        L_0x0330:
            float[] r5 = new float[r6]
            int[] r6 = A09
            r3.getLocationOnScreen(r6)
            r3 = r15[r10]
            r0 = r6[r10]
            float r0 = (float) r0
            float r3 = r3 + r0
            r5[r10] = r3
            r3 = r15[r9]
            r0 = r6[r9]
            float r0 = (float) r0
            float r3 = r3 + r0
            r5[r9] = r3
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r7)
        L_0x034b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0359
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            r0.setValue(r5)
            goto L_0x034b
        L_0x0359:
            int r15 = r2.A02
            int r10 = r2.A00
            int r9 = r2.A01
            int r6 = r2.A03
            java.util.Map r3 = r2.A05
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            java.util.Set r5 = r2.A08
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r5)
            X.V45 r5 = new X.V45
            r5.<init>()
            r5.A02 = r15
            r5.A00 = r10
            r5.A01 = r9
            r5.A03 = r6
            r5.A06 = r11
            r5.A05 = r0
            r5.A04 = r8
            r5.A07 = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            r5.A08 = r0
            java.lang.String r3 = "topPointerCancel"
            r0 = r17
            X.UTO r0 = X.UTO.A01(r13, r5, r3, r0)
            r4.APe(r0)
        L_0x0396:
            int r0 = r14.A01
            int r3 = r0 + 1
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 % r0
            r14.A01 = r3
            r14.A03 = r12
        L_0x03a2:
            r14.A01(r13, r4, r2, r12)
            goto L_0x0424
        L_0x03a6:
            java.util.Map r3 = r2.A04
            java.lang.Object r7 = r3.get(r5)
            float[] r7 = (float[]) r7
            java.util.Map r3 = r14.A06
            if (r3 == 0) goto L_0x043d
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L_0x043d
            java.util.Map r3 = r14.A06
            java.lang.Object r8 = r3.get(r5)
            float[] r8 = (float[]) r8
        L_0x03c0:
            r5 = r8[r10]
            r3 = r7[r10]
            float r3 = X.AnonymousClass7TE.A00(r5, r3)
            r6 = 1036831949(0x3dcccccd, float:0.1)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x03db
            r5 = r8[r9]
            r3 = r7[r9]
            float r3 = X.AnonymousClass7TE.A00(r5, r3)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x043c
        L_0x03db:
            int r5 = r2.A00
            java.util.Map r3 = r2.A05
            java.lang.Object r6 = X.C51968G9o.A10(r3, r5)
            java.util.List r6 = (java.util.List) r6
            X.Uvd r5 = X.C16483Uvd.MOVE
            X.Uvd r3 = X.C16483Uvd.MOVE_CAPTURE
            boolean r3 = A03(r5, r3, r6)
            if (r3 == 0) goto L_0x0424
            int r5 = r14.A01
            r3 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r3
            short r10 = (short) r5
            java.lang.String r8 = "topPointerMove"
            X.0l2 r3 = X.UTO.A06
            java.lang.Object r7 = r3.A7A()
            X.UTO r7 = (X.UTO) r7
            if (r7 != 0) goto L_0x0407
            X.UTO r7 = new X.UTO
            r7.<init>()
        L_0x0407:
            int r3 = r2.A03
            long r5 = r13.getEventTime()
            r7.A00 = r3
            r7.A02 = r0
            r7.A03 = r5
            r7.A04 = r9
            r7.A03 = r8
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
            r7.A00 = r0
            r7.A05 = r10
            r7.A02 = r2
        L_0x0421:
            r4.APe(r7)
        L_0x0424:
            java.util.Map r2 = r2.A04
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r14.A06 = r0
            int r0 = r13.getButtonState()
            r14.A02 = r0
            java.util.Map r0 = r14.A06
            java.util.Set r0 = r0.keySet()
            r1.retainAll(r0)
        L_0x043c:
            return
        L_0x043d:
            r3 = 2
            float[] r8 = new float[r3]
            r8 = {0, 0} // fill-array
            goto L_0x03c0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18801W2o.A05(android.view.MotionEvent, X.X2e, boolean):void");
    }

    public C18801W2o(ViewGroup viewGroup) {
        this.A08 = viewGroup;
        this.A04 = new HashMap();
    }

    public static void A02(MotionEvent motionEvent, C20877X2e x2e, V45 v45, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x2e.APe(UTO.A01(motionEvent, v45, str, ((C17964Viy) it.next()).A00));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C16483Uvd r3, X.C16483Uvd r4, java.util.List r5) {
        /*
            java.util.Iterator r2 = r5.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r2.next()
            X.Viy r0 = (X.C17964Viy) r0
            android.view.View r1 = r0.A01
            boolean r0 = X.C18670VwT.A00(r1, r3)
            if (r0 != 0) goto L_0x001e
            boolean r0 = X.C18670VwT.A00(r1, r4)
            if (r0 == 0) goto L_0x0004
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18801W2o.A03(X.Uvd, X.Uvd, java.util.List):boolean");
    }
}
