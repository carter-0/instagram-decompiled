package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0nA;
import X.0qQ;
import X.AnonymousClass030;
import X.AnonymousClass0fD;
import X.C64380Law;
import X.JTT;
import X.MQP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsTimelineBottomSheetView extends ConstraintLayout {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public MQP A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public GestureDetector.OnGestureListener A0B;
    public AnonymousClass030 A0C;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return A00(motionEvent, true);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public final MQP getDelegate() {
        return this.A05;
    }

    public /* synthetic */ ClipsTimelineBottomSheetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        if (r4.A0H != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1 != 3) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fb, code lost:
        if (r4.A0H == false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(android.view.MotionEvent r19, boolean r20) {
        /*
            r18 = this;
            android.view.MotionEvent r14 = android.view.MotionEvent.obtain(r19)
            float r1 = r19.getRawX()
            float r0 = r19.getRawY()
            r14.setLocation(r1, r0)
            int r1 = r14.getActionMasked()
            r6 = 1
            r5 = 0
            r7 = r18
            if (r1 == 0) goto L_0x01ff
            if (r1 == r6) goto L_0x006a
            r0 = 2
            if (r1 == r0) goto L_0x002c
            r0 = 3
            if (r1 == r0) goto L_0x006a
        L_0x0021:
            r14.recycle()
            if (r20 == 0) goto L_0x002b
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x002b
            r6 = 0
        L_0x002b:
            return r6
        L_0x002c:
            X.030 r0 = r7.A0C
            android.view.GestureDetector r0 = r0.A00
            r0.onTouchEvent(r14)
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x0021
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0021
            float r8 = r7.A01
            float r0 = r14.getRawX()
            float r8 = r8 - r0
            float r5 = r7.A02
            float r0 = r14.getRawY()
            float r5 = r5 - r0
            double r3 = X.JTR.A00(r8, r5)
            double r1 = r7.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            double r3 = X.JTS.A00(r5, r8)
            if (r0 == 0) goto L_0x0021
            r1 = 4630474473122824192(0x4042c00000000000, double:37.5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            r7.A07 = r6
            goto L_0x0021
        L_0x0067:
            r7.A06 = r6
            goto L_0x0021
        L_0x006a:
            X.030 r0 = r7.A0C
            android.view.GestureDetector r0 = r0.A00
            r0.onTouchEvent(r14)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x01cd
            X.MQP r1 = r7.A05
            if (r1 == 0) goto L_0x01cd
            float r0 = r7.A04
            X.Lmp r1 = (X.C65069Lmp) r1
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r4 = r1.A00
            r4.A0A = r5
            r4.A01 = r0
            double r2 = (double) r0
            r8 = 0
            r0 = -9223372036854775808
            double r0 = java.lang.Math.max(r2, r0)
            double r0 = java.lang.Math.min(r0, r8)
            float r2 = (float) r0
            android.view.ViewGroup r8 = r4.A0C
            float r0 = X.JTP.A00(r2, r8)
            X.2cs r9 = r4.A05
            double r2 = (double) r0
            double r0 = -r2
            r9.A07(r0)
            java.util.List r0 = r4.A08
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r2.next()
            X.KiB r1 = (X.C62578KiB) r1
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x00c2
            float r0 = r1.A01
        L_0x00be:
            X.JTP.A1V(r3, r0)
            goto L_0x00ac
        L_0x00c2:
            float r0 = r1.A00
            goto L_0x00be
        L_0x00c5:
            java.util.ArrayList r3 = X.00k.A0U(r3)
            float r0 = r4.A02
            X.KiB r1 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController.A00(r4, r0)
            X.KiB r0 = X.C62578KiB.VIDEO_PREVIEW_LARGE
            if (r1 != r0) goto L_0x01f2
            boolean r0 = r4.A0H
            r1 = 1057565232(0x3f092a30, float:0.5358)
            if (r0 == 0) goto L_0x00dd
        L_0x00da:
            r1 = 1053961486(0x3ed22d0e, float:0.4105)
        L_0x00dd:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.remove(r0)
        L_0x00e4:
            X.MXK r0 = r4.A07
            if (r0 == 0) goto L_0x01ef
            int r2 = r0.B8T()
        L_0x00ec:
            android.content.Context r10 = r4.A0B
            android.content.res.Resources r0 = r10.getResources()
            int r11 = X.JTP.A05(r0)
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r0.getDimensionPixelSize(r1)
            int r11 = r11 + r0
            int r0 = X.AnonymousClass7TG.A03(r10)
            int r11 = r11 + r0
            int r0 = X.AnonymousClass7TF.A02(r10, r1)
            int r11 = r11 + r0
            int r0 = X.AnonymousClass7TG.A05(r10)
            int r11 = r11 + r0
            int r2 = r2 + r11
            float r0 = (float) r2
            float r8 = X.JTP.A00(r0, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x011f
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x011f:
            java.util.List r1 = r4.A08
            X.KiB r0 = X.C62578KiB.FULL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0152
            r0 = 1063994262(0x3f6b4396, float:0.919)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.remove(r0)
            java.lang.Object r0 = X.00k.A0L(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0152
            float r0 = r0.floatValue()
            float r0 = r8 - r0
            double r0 = (double) r0
            r10 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0152
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r3.add(r5, r0)
        L_0x0152:
            r17 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            r3.add(r5, r0)
            java.util.List r12 = X.00k.A0Z(r3)
            java.lang.Object r0 = X.00k.A0L(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x016d
            float r0 = r0.floatValue()
            r4.A00 = r0
        L_0x016d:
            boolean r0 = r12.isEmpty()
            r8 = 0
            if (r0 != 0) goto L_0x01ca
            X.2ct r0 = r9.A09
            double r2 = r0.A00
            java.lang.Object r0 = X.00k.A0J(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01ca
            float r0 = r0.floatValue()
            double r0 = (double) r0
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x01ca
            int r0 = r12.size()
            int r13 = r0 + -2
            if (r13 < 0) goto L_0x01de
            r11 = 0
        L_0x0192:
            java.lang.Object r10 = X.00k.A0O(r12, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r15 = r11 + 1
            java.lang.Object r9 = X.00k.A0O(r12, r15)
            java.lang.Number r9 = (java.lang.Number) r9
            if (r10 == 0) goto L_0x01da
            if (r9 == 0) goto L_0x01da
            float r0 = r10.floatValue()
            double r0 = (double) r0
            int r16 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r16 > 0) goto L_0x01da
            float r9 = r9.floatValue()
            double r0 = (double) r9
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x01da
            float r8 = r10.floatValue()
            float r1 = r4.A01
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x01d3
            float r0 = X.C51967G9n.A00(r9, r8)
            float r0 = r0 + r8
            double r0 = (double) r0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x01d8
        L_0x01ca:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController.A01(r4, r8, r6)
        L_0x01cd:
            r7.A08 = r5
            r7.A09 = r5
            goto L_0x0021
        L_0x01d3:
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d8
            goto L_0x01ca
        L_0x01d8:
            r8 = r9
            goto L_0x01ca
        L_0x01da:
            if (r11 == r13) goto L_0x01de
            r11 = r15
            goto L_0x0192
        L_0x01de:
            int r0 = X.DbT.A02(r12, r6)
            java.lang.Object r0 = X.00k.A0O(r12, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01ca
            float r8 = r0.floatValue()
            goto L_0x01ca
        L_0x01ef:
            r2 = 0
            goto L_0x00ec
        L_0x01f2:
            X.KiB r0 = X.C62578KiB.VIDEO_PREVIEW_SMALL
            if (r1 != r0) goto L_0x00e4
            boolean r0 = r4.A0H
            r1 = 1050924810(0x3ea3d70a, float:0.32)
            if (r0 != 0) goto L_0x00dd
            goto L_0x00da
        L_0x01ff:
            X.030 r0 = r7.A0C
            android.view.GestureDetector r0 = r0.A00
            r0.onTouchEvent(r14)
            r7.A06 = r5
            r7.A07 = r5
            r7.A0A = r5
            r0 = 0
            r7.A04 = r0
            float r0 = r14.getRawX()
            r7.A01 = r0
            float r0 = r14.getRawY()
            r7.A02 = r0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetView.A00(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-1094566501);
        0qQ.A0B(motionEvent, 0);
        boolean A002 = A00(motionEvent, false);
        if (A002) {
            performClick();
        }
        AnonymousClass0fD.A0C(231961860, A052);
        return A002;
    }

    public final void setDelegate(MQP mqp) {
        this.A05 = mqp;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsTimelineBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        C64380Law law = new C64380Law(this);
        this.A0B = law;
        AnonymousClass030 r0 = new AnonymousClass030(context, law);
        this.A0C = r0;
        r0.A00.setIsLongpressEnabled(false);
        this.A00 = (double) 0nA.A04(context, 16);
    }
}
