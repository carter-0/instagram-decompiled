package com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content;

import X.0nA;
import X.0qQ;
import X.AnonymousClass0fD;
import X.C64379Lav;
import X.JTT;
import X.MQO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BottomSheetView extends ConstraintLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public MQO A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public GestureDetector.OnGestureListener A0A;
    public GestureDetector A0B;
    public final double A0C;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return A00(motionEvent, true);
    }

    public final MQO getDelegate() {
        return this.A04;
    }

    public /* synthetic */ BottomSheetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01dd, code lost:
        if (r7 == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1 != 3) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(android.view.MotionEvent r18, boolean r19) {
        /*
            r17 = this;
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r18)
            float r1 = r18.getRawX()
            float r0 = r18.getRawY()
            r13.setLocation(r1, r0)
            int r1 = r13.getActionMasked()
            r5 = 1
            r4 = 0
            r6 = r17
            if (r1 == 0) goto L_0x0186
            if (r1 == r5) goto L_0x002c
            r0 = 2
            if (r1 == r0) goto L_0x01a1
            r0 = 3
            if (r1 == r0) goto L_0x002c
        L_0x0021:
            r13.recycle()
            if (r19 == 0) goto L_0x002b
            boolean r0 = r6.A06
            if (r0 != 0) goto L_0x002b
            r5 = 0
        L_0x002b:
            return r5
        L_0x002c:
            android.view.GestureDetector r0 = r6.A0B
            r0.onTouchEvent(r13)
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0160
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0160
            X.MQO r1 = r6.A04
            if (r1 == 0) goto L_0x0160
            float r0 = r6.A03
            X.Lmk r1 = (X.C65066Lmk) r1
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r7 = r1.A00
            r7.A01 = r0
            double r2 = (double) r0
            r8 = 0
            r0 = -9223372036854775808
            double r0 = java.lang.Math.max(r2, r0)
            double r0 = java.lang.Math.min(r0, r8)
            float r2 = (float) r0
            android.view.ViewGroup r10 = r7.A07
            float r0 = X.JTP.A00(r2, r10)
            X.2cs r9 = r7.A02
            double r2 = (double) r0
            double r0 = -r2
            r9.A07(r0)
            java.util.List r0 = com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController.A01(r7)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()
            X.Khs r0 = (X.C62562Khs) r0
            float r0 = r0.A00
            X.JTP.A1V(r2, r0)
            goto L_0x006c
        L_0x007e:
            java.util.ArrayList r3 = X.00k.A0U(r2)
            X.Khs r1 = com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController.A00(r7)
            X.Khs r0 = X.C62562Khs.DEFAULT
            if (r1 != r0) goto L_0x017d
            r0 = 1057565232(0x3f092a30, float:0.5358)
        L_0x008d:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.remove(r0)
        L_0x0094:
            r8 = 0
            android.content.Context r11 = r7.A06
            android.content.res.Resources r0 = r11.getResources()
            int r2 = X.JTP.A05(r0)
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r0.getDimensionPixelSize(r1)
            int r2 = r2 + r0
            int r0 = X.AnonymousClass7TG.A03(r11)
            int r2 = r2 + r0
            int r0 = X.AnonymousClass7TF.A02(r11, r1)
            int r2 = r2 + r0
            int r0 = X.AnonymousClass7TG.A05(r11)
            int r2 = r2 + r0
            float r0 = (float) r2
            float r12 = X.JTP.A00(r0, r10)
            java.util.List r1 = com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController.A01(r7)
            X.Khs r0 = X.C62562Khs.FULL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00f0
            r0 = 1063994262(0x3f6b4396, float:0.919)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.remove(r0)
            java.lang.Object r0 = X.00k.A0K(r3)
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r0 = r12 - r0
            double r0 = (double) r0
            r10 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            r3.add(r4, r0)
        L_0x00f0:
            r16 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            r3.add(r4, r0)
            java.util.List r10 = X.00k.A0Z(r3)
            java.lang.Object r0 = X.00k.A0K(r10)
            float r0 = X.AnonymousClass7TE.A04(r0)
            r7.A00 = r0
            boolean r0 = r10.isEmpty()
            r11 = 0
            if (r0 != 0) goto L_0x0154
            X.2ct r0 = r9.A09
            double r2 = r0.A00
            java.lang.Object r0 = X.00k.A0I(r10)
            float r0 = X.AnonymousClass7TE.A04(r0)
            double r0 = (double) r0
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x0154
            int r0 = r10.size()
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x0174
            r11 = 0
        L_0x0128:
            float r14 = X.AnonymousClass7TG.A00(r10, r8)
            int r8 = r8 + 1
            float r0 = X.AnonymousClass7TG.A00(r10, r8)
            double r0 = (double) r0
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 > 0) goto L_0x0170
            double r0 = (double) r14
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0170
            float r11 = X.AnonymousClass7TG.A00(r10, r11)
            float r8 = X.AnonymousClass7TG.A00(r10, r8)
            float r1 = r7.A01
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0169
            float r0 = X.C51967G9n.A00(r8, r11)
            float r0 = r0 + r11
            double r0 = (double) r0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x016e
        L_0x0154:
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r9.A06 = r0
            double r0 = (double) r11
            r9.A06(r0)
        L_0x0160:
            r6.A07 = r4
            r6.A08 = r4
            r6.requestDisallowInterceptTouchEvent(r4)
            goto L_0x0021
        L_0x0169:
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            goto L_0x0154
        L_0x016e:
            r11 = r8
            goto L_0x0154
        L_0x0170:
            if (r11 == r12) goto L_0x0174
            r11 = r8
            goto L_0x0128
        L_0x0174:
            int r0 = X.DbT.A02(r10, r5)
            float r11 = X.AnonymousClass7TG.A00(r10, r0)
            goto L_0x0154
        L_0x017d:
            X.Khs r0 = X.C62562Khs.HALF
            if (r1 != r0) goto L_0x0094
            r0 = 1053961486(0x3ed22d0e, float:0.4105)
            goto L_0x008d
        L_0x0186:
            android.view.GestureDetector r0 = r6.A0B
            r0.onTouchEvent(r13)
            r6.A05 = r4
            r6.A06 = r4
            r6.A09 = r4
            r0 = 0
            r6.A03 = r0
            float r0 = r13.getRawX()
            r6.A00 = r0
            float r0 = r13.getRawY()
            r6.A01 = r0
            goto L_0x01df
        L_0x01a1:
            android.view.GestureDetector r0 = r6.A0B
            r0.onTouchEvent(r13)
            boolean r7 = r6.A06
            if (r7 != 0) goto L_0x01d9
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x01d9
            float r9 = r6.A00
            float r0 = r13.getRawX()
            float r9 = r9 - r0
            float r8 = r6.A01
            float r0 = r13.getRawY()
            float r8 = r8 - r0
            double r3 = X.JTR.A00(r9, r8)
            double r1 = r6.A0C
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            double r3 = X.JTS.A00(r8, r9)
            if (r0 == 0) goto L_0x01d9
            r1 = 4630474473122824192(0x4042c00000000000, double:37.5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e4
            r6.A06 = r5
        L_0x01d9:
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0021
            if (r7 != 0) goto L_0x0021
        L_0x01df:
            r6.requestDisallowInterceptTouchEvent(r5)
            goto L_0x0021
        L_0x01e4:
            r6.A05 = r5
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView.A00(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(680043681);
        0qQ.A0B(motionEvent, 0);
        boolean A002 = A00(motionEvent, false);
        if (A002) {
            performClick();
        }
        AnonymousClass0fD.A0C(-1768615237, A052);
        return A002;
    }

    public final void setDelegate(MQO mqo) {
        this.A04 = mqo;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        C64379Lav lav = new C64379Lav(this);
        this.A0A = lav;
        GestureDetector gestureDetector = new GestureDetector(context, lav);
        this.A0B = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0C = (double) 0nA.A04(context, 16);
    }
}
