package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vvo  reason: case insensitive filesystem */
public abstract class C18645Vvo {
    public static final Map A04;
    public int A00;
    public int A01;
    public Interpolator A02;
    public Integer A03;

    static {
        UwF uwF = UwF.LINEAR;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        UwF uwF2 = UwF.EASE_IN;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        UwF uwF3 = UwF.EASE_OUT;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        UwF uwF4 = UwF.EASE_IN_EASE_OUT;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        HashMap A0p = C13991Tnr.A0p(uwF, linearInterpolator, uwF2, accelerateInterpolator);
        A0p.put(uwF3, decelerateInterpolator);
        A0p.put(uwF4, accelerateDecelerateInterpolator);
        A04 = A0p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (((int) r3.getY()) != r5) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.animation.Animation A00(android.view.View r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1 instanceof X.UTS
            r3 = r18
            if (r0 == 0) goto L_0x003b
            float r0 = r3.getX()
            int r0 = (int) r0
            r2 = 0
            r4 = r19
            r5 = r20
            if (r0 != r4) goto L_0x001c
            float r0 = r3.getY()
            int r0 = (int) r0
            r1 = 0
            if (r0 == r5) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            int r0 = r3.getWidth()
            r6 = r21
            r7 = r22
            if (r0 != r6) goto L_0x002d
            int r0 = r3.getHeight()
            if (r0 == r7) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            if (r1 != 0) goto L_0x0034
            if (r2 != 0) goto L_0x0034
            r1 = 0
            return r1
        L_0x0034:
            X.U3y r1 = new X.U3y
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        L_0x003b:
            r2 = r1
            X.UTR r2 = (X.UTR) r2
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x00be
            int r1 = r0.intValue()
            r6 = 1
            r0 = 0
            r7 = 0
            if (r1 == r0) goto L_0x00aa
            r0 = 3
            if (r1 == r0) goto L_0x0093
            if (r1 == r6) goto L_0x0078
            r0 = 2
            if (r1 != r0) goto L_0x006a
            boolean r0 = r2 instanceof X.UTQ
            if (r0 == 0) goto L_0x0066
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
        L_0x005a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r9 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r3 = r2
            r8 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0066:
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x005a
        L_0x006a:
            java.lang.String r1 = "Missing animation for property : "
            java.lang.String r0 = "OPACITY"
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.QZA r0 = new X.QZA
            r0.<init>(r1)
            throw r0
        L_0x0078:
            boolean r0 = r2 instanceof X.UTQ
            if (r0 == 0) goto L_0x008f
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
        L_0x007f:
            r11 = 1065353216(0x3f800000, float:1.0)
            r14 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r8 = r1
            r12 = r11
            r13 = r6
            r15 = r6
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x008f:
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x007f
        L_0x0093:
            boolean r0 = r2 instanceof X.UTQ
            if (r0 == 0) goto L_0x00a6
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
        L_0x009a:
            r7 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r4 = r2
            r5 = r3
            r8 = r6
            r9 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x00a6:
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x009a
        L_0x00aa:
            boolean r0 = r2 instanceof X.UTQ
            if (r0 == 0) goto L_0x00b8
            float r0 = r3.getAlpha()
        L_0x00b2:
            X.U3x r1 = new X.U3x
            r1.<init>(r3, r0, r7)
            return r1
        L_0x00b8:
            r0 = 0
            float r7 = r3.getAlpha()
            goto L_0x00b2
        L_0x00be:
            java.lang.String r1 = "Missing animated property from animation config"
            X.QZA r0 = new X.QZA
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18645Vvo.A00(android.view.View, int, int, int, int):android.view.animation.Animation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        throw X.AnonymousClass7TF.A0W("Unsupported interpolation type : ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        if (r2.equals(X.UwF.A06) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        if (r6.getType("springDamping") != com.facebook.react.bridge.ReadableType.Number) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r1 = (float) r6.getDouble("springDamping");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dc, code lost:
        r0 = new X.C18906WCa(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
        r4.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        if (A02() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        r1 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        r0 = (android.view.animation.Interpolator) A04.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f5, code lost:
        if (r0 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        throw X.C51973G9u.A0g(r2, "Missing interpolator for type : ", new java.lang.StringBuilder());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        throw X.AnonymousClass7TF.A0W("Unsupported animated property: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0116, code lost:
        throw new X.QZA(X.AnonymousClass7TG.A0m(r6, "Invalid layout animation : ", new java.lang.StringBuilder()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            r4 = this;
            r0 = 3816(0xee8, float:5.347E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r6.hasKey(r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = r6.getString(r1)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1267206133: goto L_0x0022;
                case -908189618: goto L_0x002d;
                case -908189617: goto L_0x0038;
                case 1910893003: goto L_0x0045;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.String r0 = "Unsupported animated property: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TF.A0W(r0, r1)
            throw r1
        L_0x0022:
            java.lang.String r0 = "opacity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x004f
        L_0x002d:
            java.lang.String r0 = "scaleX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x004f
        L_0x0038:
            java.lang.String r0 = "scaleY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x004f
        L_0x0043:
            r0 = 0
            goto L_0x004f
        L_0x0045:
            java.lang.String r0 = "scaleXY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x004f:
            r4.A03 = r0
            java.lang.String r1 = "duration"
            boolean r0 = r6.hasKey(r1)
            if (r0 == 0) goto L_0x005d
            int r5 = r6.getInt(r1)
        L_0x005d:
            r4.A01 = r5
            java.lang.String r1 = "delay"
            boolean r0 = r6.hasKey(r1)
            if (r0 == 0) goto L_0x0103
            int r0 = r6.getInt(r1)
        L_0x006b:
            r4.A00 = r0
            java.lang.String r1 = "type"
            boolean r0 = r6.hasKey(r1)
            if (r0 == 0) goto L_0x0117
            java.lang.String r2 = r6.getString(r1)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1965056864: goto L_0x008f;
                case -1310315117: goto L_0x009a;
                case -1102672091: goto L_0x00a5;
                case -895679987: goto L_0x00b0;
                case 1164546989: goto L_0x00bb;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.String r0 = "Unsupported interpolation type : "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r1
        L_0x008f:
            java.lang.String r0 = "easeout"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            X.UwF r2 = X.UwF.EASE_OUT
            goto L_0x00c5
        L_0x009a:
            java.lang.String r0 = "easein"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            X.UwF r2 = X.UwF.EASE_IN
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r0 = "linear"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            X.UwF r2 = X.UwF.LINEAR
            goto L_0x00c5
        L_0x00b0:
            java.lang.String r0 = "spring"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            X.UwF r2 = X.UwF.SPRING
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r0 = "easeineaseout"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            X.UwF r2 = X.UwF.EASE_IN_EASE_OUT
        L_0x00c5:
            X.UwF r0 = X.UwF.SPRING
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r2 = "springDamping"
            com.facebook.react.bridge.ReadableType r1 = r6.getType(r2)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x00ea
            double r2 = r6.getDouble(r2)
            float r1 = (float) r2
        L_0x00dc:
            X.WCa r0 = new X.WCa
            r0.<init>(r1)
        L_0x00e1:
            r4.A02 = r0
            boolean r0 = r4.A02()
            if (r0 == 0) goto L_0x0106
            return
        L_0x00ea:
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x00dc
        L_0x00ed:
            java.util.Map r0 = A04
            java.lang.Object r0 = r0.get(r2)
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            if (r0 != 0) goto L_0x00e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Missing interpolator for type : "
            java.lang.IllegalArgumentException r1 = X.C51973G9u.A0g(r2, r0, r1)
            throw r1
        L_0x0103:
            r0 = 0
            goto L_0x006b
        L_0x0106:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid layout animation : "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            X.QZA r1 = new X.QZA
            r1.<init>(r0)
            throw r1
        L_0x0117:
            java.lang.String r0 = "Missing interpolation type."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18645Vvo.A01(int, com.facebook.react.bridge.ReadableMap):void");
    }

    public final boolean A02() {
        if (this instanceof UTS) {
            return AnonymousClass7TF.A1R(this.A01);
        }
        if (this.A01 <= 0 || this.A03 == null) {
            return false;
        }
        return true;
    }
}
