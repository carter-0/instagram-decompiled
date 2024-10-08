package X;

/* renamed from: X.Ivr  reason: case insensitive filesystem */
public final class C58682Ivr extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58682Ivr(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass5TX A00(C284895Os r2, Object obj, int i) {
        return new AnonymousClass5TX(r2, new C58682Ivr(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r2.A03.B6X() < r2.A02.B6X()) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f4, code lost:
        return X.C51965G9l.A0M(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (r2.A03.BI6() < r2.A01.BI6()) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        if (r0 <= 0) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        if (r2.A07.getValue() == r1) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0145, code lost:
        r1.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0155, code lost:
        r0 = ((X.C289295dM) r1.getValue()).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x0308;
                case 2: goto L_0x02fb;
                case 3: goto L_0x02dc;
                case 4: goto L_0x00b9;
                case 5: goto L_0x02ca;
                case 6: goto L_0x02b8;
                case 7: goto L_0x00ac;
                case 8: goto L_0x0099;
                case 9: goto L_0x02a8;
                case 10: goto L_0x008d;
                case 11: goto L_0x029a;
                case 12: goto L_0x028c;
                case 13: goto L_0x0280;
                case 14: goto L_0x0275;
                case 15: goto L_0x0267;
                case 16: goto L_0x0258;
                case 17: goto L_0x024b;
                case 18: goto L_0x024b;
                case 19: goto L_0x022f;
                case 20: goto L_0x01e3;
                case 21: goto L_0x01d4;
                case 22: goto L_0x0079;
                case 23: goto L_0x01c7;
                case 24: goto L_0x01c0;
                case 25: goto L_0x01b5;
                case 26: goto L_0x01aa;
                case 27: goto L_0x0070;
                case 28: goto L_0x0067;
                case 29: goto L_0x005e;
                case 30: goto L_0x0055;
                case 31: goto L_0x01a1;
                case 32: goto L_0x0198;
                case 33: goto L_0x0047;
                case 34: goto L_0x0031;
                case 35: goto L_0x0016;
                case 36: goto L_0x0186;
                case 37: goto L_0x016c;
                case 38: goto L_0x015f;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0151;
                case 42: goto L_0x014a;
                case 43: goto L_0x013d;
                case 44: goto L_0x0135;
                case 45: goto L_0x012d;
                case 46: goto L_0x0124;
                case 47: goto L_0x011b;
                case 48: goto L_0x010c;
                case 49: goto L_0x0100;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.JNV r0 = (X.JNV) r0
            long r0 = r0.E4j()
            boolean r1 = X.C289325dP.A02(r0)
        L_0x0011:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
        L_0x0015:
            return r4
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.I0h r0 = (X.I0h) r0
            X.5Tq r1 = r0.A00
            X.5Oz r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.62f r0 = (X.C3022462f) r0
            if (r0 == 0) goto L_0x002f
            X.62Y r0 = r0.A04
            X.5Tq r0 = r0.A03
        L_0x002a:
            boolean r1 = X.0qQ.A0K(r1, r0)
            goto L_0x0011
        L_0x002f:
            r0 = 0
            goto L_0x002a
        L_0x0031:
            java.lang.Object r2 = r5.A01
            X.I4L r2 = (X.I4L) r2
            X.5PZ r0 = r2.A03
            float r1 = r0.B6X()
            X.5PZ r0 = r2.A02
            float r0 = r0.B6X()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fd
            goto L_0x00fa
        L_0x0047:
            java.lang.Object r0 = r5.A01
            X.I4L r0 = (X.I4L) r0
            X.5PZ r0 = r0.A03
            float r1 = r0.B6X()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            goto L_0x00b6
        L_0x0055:
            java.lang.Object r0 = r5.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A07()
            goto L_0x00fa
        L_0x005e:
            java.lang.Object r0 = r5.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r1 = 1
            r0.A0D(r1)
            goto L_0x0011
        L_0x0067:
            java.lang.Object r0 = r5.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r1 = 1
            r0.A0E(r1)
            goto L_0x0011
        L_0x0070:
            java.lang.Object r0 = r5.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A09()
            goto L_0x00fa
        L_0x0079:
            java.lang.Object r2 = r5.A01
            if (r2 == 0) goto L_0x00fd
            r1 = 35
            X.Ivr r0 = new X.Ivr
            r0.<init>(r2, r1)
            java.lang.Object r0 = r0.invoke()
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x0011
        L_0x008d:
            java.lang.Object r0 = r5.A01
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            boolean r0 = r0.A0O()
            r1 = r0 ^ 1
            goto L_0x0011
        L_0x0099:
            java.lang.Object r2 = r5.A01
            X.IEj r2 = (X.C56838IEj) r2
            X.5dh r0 = r2.A03
            int r1 = r0.BI6()
            X.5dh r0 = r2.A01
            int r0 = r0.BI6()
            if (r1 >= r0) goto L_0x00fd
            goto L_0x00fa
        L_0x00ac:
            java.lang.Object r0 = r5.A01
            X.IEj r0 = (X.C56838IEj) r0
            X.5dh r0 = r0.A03
            int r0 = r0.BI6()
        L_0x00b6:
            if (r0 <= 0) goto L_0x00fd
            goto L_0x00fa
        L_0x00b9:
            java.lang.Object r3 = r5.A01
            X.5WU r3 = (X.AnonymousClass5WU) r3
            X.5dh r2 = r3.A07
            int r1 = r2.BI6()
            X.5dh r0 = r3.A06
            int r0 = r0.BI6()
            r4 = 0
            if (r1 <= r0) goto L_0x0015
            X.5Oz r0 = r3.A08
            r0.getValue()
            int r1 = r2.BI6()
            X.4gU r0 = r3.A0B
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r1 + r0
            float r0 = (float) r1
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x00e6:
            java.lang.Object r2 = r5.A01
            X.I4f r2 = (X.C56606I4f) r2
            java.lang.Object r0 = r2.A04()
            X.HL0 r1 = X.HL0.PostExit
            if (r0 != r1) goto L_0x00fd
            X.5Oz r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            if (r0 != r1) goto L_0x00fd
        L_0x00fa:
            r1 = 1
            goto L_0x0011
        L_0x00fd:
            r1 = 0
            goto L_0x0011
        L_0x0100:
            java.lang.Object r0 = r5.A01
            androidx.compose.ui.platform.AndroidPlatformTextInputSession r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) r0
            X.4Cq r1 = r0.A03
            r0 = 0
            X.19E.A05(r0, r1)
            goto L_0x02b5
        L_0x010c:
            java.lang.Object r1 = r5.A01
            X.4e0 r1 = (X.C268794e0) r1
            X.4cD r0 = r1.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x02b5
            X.C288925ci.A01(r1)
            goto L_0x02b5
        L_0x011b:
            java.lang.Object r0 = r5.A01
            X.4e0 r0 = (X.C268794e0) r0
            r0.A0H()
            goto L_0x02b5
        L_0x0124:
            java.lang.Object r0 = r5.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A0A()
            goto L_0x02b5
        L_0x012d:
            java.lang.Object r1 = r5.A01
            X.Gb5 r1 = (X.C52693Gb5) r1
            r1.A09()
            goto L_0x0145
        L_0x0135:
            java.lang.Object r1 = r5.A01
            X.Gb5 r1 = (X.C52693Gb5) r1
            r1.A07()
            goto L_0x0145
        L_0x013d:
            java.lang.Object r1 = r5.A01
            X.Gb5 r1 = (X.C52693Gb5) r1
            r0 = 1
            r1.A0D(r0)
        L_0x0145:
            r1.A08()
            goto L_0x02b5
        L_0x014a:
            java.lang.Object r1 = r5.A01
            X.4gU r1 = (X.C270284gU) r1
            X.5b7 r0 = X.C55412HhI.A02
            goto L_0x0155
        L_0x0151:
            java.lang.Object r1 = r5.A01
            X.4gU r1 = (X.C270284gU) r1
        L_0x0155:
            java.lang.Object r0 = r1.getValue()
            X.5dM r0 = (X.C289295dM) r0
            long r0 = r0.A00
            goto L_0x02f0
        L_0x015f:
            java.lang.Object r0 = r5.A01
            X.IGf r0 = (X.C56884IGf) r0
            android.view.View r1 = r0.A09
            r0 = 0
            android.view.inputmethod.BaseInputConnection r4 = new android.view.inputmethod.BaseInputConnection
            r4.<init>(r1, r0)
            return r4
        L_0x016c:
            java.lang.Object r0 = r5.A01
            X.IFb r0 = (X.C56854IFb) r0
            android.view.View r0 = r0.A00
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r4 = r1.getSystemService(r0)
            r0 = 11
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x0186:
            java.lang.Object r0 = r5.A01
            X.I1m r0 = (X.C56558I1m) r0
            int r1 = r0.A01
            int r0 = r0.A03
            long r0 = X.AnonymousClass5TW.A00(r1, r0)
            X.5d8 r4 = new X.5d8
            r4.<init>(r0)
            return r4
        L_0x0198:
            java.lang.Object r0 = r5.A01
            X.JQx r0 = (X.C59629JQx) r0
            r0.onCancel()
            goto L_0x02b5
        L_0x01a1:
            java.lang.Object r0 = r5.A01
            X.JQx r0 = (X.C59629JQx) r0
            r0.onStop()
            goto L_0x02b5
        L_0x01aa:
            java.lang.Object r1 = r5.A01
            X.6Gj r1 = (X.AnonymousClass6Gj) r1
            r0 = 0
            X.I4L r4 = new X.I4L
            r4.<init>(r1, r0)
            return r4
        L_0x01b5:
            java.lang.Object r0 = r5.A01
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.5Oz r0 = r0.A0C
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x01c0:
            java.lang.Object r0 = r5.A01
            java.lang.Object r4 = X.C51966G9m.A18(r0)
            return r4
        L_0x01c7:
            java.lang.Object r0 = r5.A01
            X.I1S r0 = (X.I1S) r0
            X.GeN r1 = X.C52887GeN.A00
            X.5Oz r0 = r0.A00
            r0.Epw(r1)
            goto L_0x02b5
        L_0x01d4:
            java.lang.Object r0 = r5.A01
            X.GeK r0 = (X.C52884GeK) r0
            X.0sP r1 = r0.A00
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            X.C51968G9o.A1O(r1, r0)
            goto L_0x02b5
        L_0x01e3:
            java.lang.Object r3 = r5.A01
            X.GZF r3 = (X.GZF) r3
            X.6Gn r0 = r3.A0G
            boolean r0 = r0.CbH()
            if (r0 == 0) goto L_0x022a
            X.5dh r2 = r3.A0O
            int r1 = r2.BI6()
            r0 = -1
            if (r1 == r0) goto L_0x0205
            int r1 = r2.BI6()
        L_0x01fc:
            int r0 = X.GZF.A00(r3, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0205:
            X.GZm r0 = r3.A0N
            X.5PZ r0 = r0.A04
            float r0 = r0.B6X()
            float r1 = java.lang.Math.abs(r0)
            float r0 = r3.A02()
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x022a
            X.5Oz r0 = r3.A0T
            boolean r0 = X.C51971G9r.A1W(r0)
            int r1 = r3.A02
            if (r0 == 0) goto L_0x01fc
            int r1 = r1 + 1
            goto L_0x01fc
        L_0x022a:
            int r1 = r3.A03()
            goto L_0x01fc
        L_0x022f:
            java.lang.Object r1 = r5.A01
            X.GZF r1 = (X.GZF) r1
            X.6Gn r0 = r1.A0G
            boolean r0 = r0.CbH()
            if (r0 == 0) goto L_0x0246
            X.5dh r0 = r1.A0P
            int r0 = r0.BI6()
        L_0x0241:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0246:
            int r0 = r1.A03()
            goto L_0x0241
        L_0x024b:
            java.lang.Object r0 = r5.A01
            X.GZF r0 = (X.GZF) r0
            int r0 = r0.A04()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0258:
            java.lang.Object r1 = r5.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 2
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x0267:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.0sP r0 = (X.0sP) r0
            X.GeU r4 = new X.GeU
            r4.<init>(r0)
            return r4
        L_0x0275:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0280:
            java.lang.Object r0 = r5.A01
            X.6H4 r0 = (X.AnonymousClass6H4) r0
            X.4cG r0 = r0.A02
            if (r0 == 0) goto L_0x02b5
            X.C288785cT.A00(r0)
            goto L_0x02b5
        L_0x028c:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.0sP r0 = (X.0sP) r0
            X.GeT r4 = new X.GeT
            r4.<init>(r0)
            return r4
        L_0x029a:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.0sP r0 = (X.0sP) r0
            X.6Ga r4 = new X.6Ga
            r4.<init>(r0)
            return r4
        L_0x02a8:
            java.lang.Object r0 = r5.A01
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            X.3ju r1 = r0.A02
            if (r1 == 0) goto L_0x02b5
            X.GTu r0 = X.C52468GTu.A00
            r1.FIG(r0)
        L_0x02b5:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x02b8:
            java.lang.Object r0 = r5.A01
            X.Geo r0 = (X.C52914Geo) r0
            X.IEj r0 = r0.A00
            X.5dh r0 = r0.A01
            int r0 = r0.BI6()
            float r0 = (float) r0
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x02ca:
            java.lang.Object r0 = r5.A01
            X.Geo r0 = (X.C52914Geo) r0
            X.IEj r0 = r0.A00
            X.5dh r0 = r0.A03
            int r0 = r0.BI6()
            float r0 = (float) r0
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x02dc:
            java.lang.Object r0 = r5.A01
            X.5WT r0 = (X.AnonymousClass5WT) r0
            X.5Oz r0 = r0.A0G
            java.lang.Object r2 = r0.getValue()
            X.4ch r2 = (X.C268064ch) r2
            if (r2 == 0) goto L_0x02f5
            r0 = 0
            long r0 = r2.CgY(r0)
        L_0x02f0:
            X.5dM r4 = X.C51965G9l.A0M(r0)
            return r4
        L_0x02f5:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L_0x02f0
        L_0x02fb:
            java.lang.Object r0 = r5.A01
            X.I4f r0 = (X.C56606I4f) r0
            long r0 = X.C56606I4f.A00(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L_0x0308:
            java.lang.Object r0 = r5.A01
            X.4Cq r0 = (X.C262224Cq) r0
            X.4Cc r0 = r0.ArX()
            float r0 = androidx.compose.animation.core.SuspendAnimationKt.A00(r0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58682Ivr.invoke():java.lang.Object");
    }
}
