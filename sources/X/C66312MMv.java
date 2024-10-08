package X;

/* renamed from: X.MMv  reason: case insensitive filesystem */
public final class C66312MMv extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66312MMv(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x058a, code lost:
        if (r7 != null) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0749, code lost:
        r2.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0770, code lost:
        X.C353498Hw.A13(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0784, code lost:
        X.C353498Hw.A14(r4, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x099b, code lost:
        r0 = "clipsCreationViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x09ae, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x09b5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0a36, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x03bf, code lost:
        r0 = android.graphics.BitmapFactory.decodeFile(r0.AvM());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x03c7, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03cc, code lost:
        r0 = (X.0sP) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03d0, code lost:
        r0.invoke(r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r40) {
        /*
            r39 = this;
            r0 = r39
            r10 = r40
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0068;
                case 2: goto L_0x0081;
                case 3: goto L_0x0009;
                case 4: goto L_0x001c;
                case 5: goto L_0x0009;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00ef;
                case 9: goto L_0x014e;
                case 10: goto L_0x0163;
                case 11: goto L_0x0181;
                case 12: goto L_0x0190;
                case 13: goto L_0x01b2;
                case 14: goto L_0x01cf;
                case 15: goto L_0x01f5;
                case 16: goto L_0x0204;
                case 17: goto L_0x0217;
                case 18: goto L_0x023a;
                case 19: goto L_0x024e;
                case 20: goto L_0x0262;
                case 21: goto L_0x0273;
                case 22: goto L_0x028b;
                case 23: goto L_0x02b5;
                case 24: goto L_0x038d;
                case 25: goto L_0x03a6;
                case 26: goto L_0x03b3;
                case 27: goto L_0x03d5;
                case 28: goto L_0x03ef;
                case 29: goto L_0x0408;
                case 30: goto L_0x0450;
                case 31: goto L_0x058d;
                case 32: goto L_0x05ac;
                case 33: goto L_0x05c9;
                case 34: goto L_0x05e5;
                case 35: goto L_0x061d;
                case 36: goto L_0x0636;
                case 37: goto L_0x064a;
                case 38: goto L_0x0663;
                case 39: goto L_0x06b0;
                case 40: goto L_0x06f4;
                case 41: goto L_0x071a;
                case 42: goto L_0x0789;
                case 43: goto L_0x07af;
                case 44: goto L_0x080b;
                case 45: goto L_0x08dd;
                case 46: goto L_0x0901;
                case 47: goto L_0x0916;
                case 48: goto L_0x0955;
                case 49: goto L_0x099e;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = X.AnonymousClass7TE.A0M(r10)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            java.lang.Object r0 = X.C51966G9m.A19(r0, r2)
            java.lang.Object r2 = r1.invoke(r0)
            return r2
        L_0x001c:
            android.view.View r2 = X.C51969G9p.A0O(r10)
            java.lang.Object r1 = r0.A01
            X.JPH r1 = (X.JPH) r1
            java.lang.Object r0 = r0.A02
            r1.ADn(r2, r0)
            goto L_0x0a34
        L_0x002b:
            X.SDe r10 = (X.C11167SDe) r10
            if (r10 == 0) goto L_0x0058
            java.util.List r1 = r10.A00
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.Object r5 = r0.A02
            X.Ryl r5 = (X.C10825Ryl) r5
            java.util.Iterator r4 = r1.iterator()
        L_0x003f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r4.next()
            X.Rwg r1 = (X.C10702Rwg) r1
            android.graphics.Rect r3 = r1.A00
            java.util.List r2 = r5.A04
            X.L3V r1 = new X.L3V
            r1.<init>(r3)
            r2.add(r1)
            goto L_0x003f
        L_0x0058:
            java.lang.Object r1 = r0.A01
            X.C51965G9l.A1W(r1, r10)
            java.lang.Object r0 = r0.A02
            X.Ryl r0 = (X.C10825Ryl) r0
            X.0sa r0 = r0.A08
            r0.invoke()
            goto L_0x0a34
        L_0x0068:
            java.lang.Object r1 = r0.A02
            X.07V r3 = X.JTO.A0J(r1)
            java.lang.Object r2 = r0.A01
            r0 = 1
            X.LZg r1 = new X.LZg
            r1.<init>(r2, r0)
            r3.A09(r1)
            r0 = 15
            X.GOz r2 = new X.GOz
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r3)
            return r2
        L_0x0081:
            X.5SW r10 = (X.AnonymousClass5SW) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r0.A01
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x0095:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r3 = r4.next()
            X.62b r3 = (X.C3022062b) r3
            java.lang.Object r2 = r3.A02
            java.lang.String r2 = (java.lang.String) r2
            r0 = 14
            X.GNG r1 = new X.GNG
            r1.<init>(r0, r3, r6)
            X.6Eq r0 = new X.6Eq
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0095
        L_0x00b5:
            X.5Sb r0 = X.C290125en.A03
            r10.ENH(r0, r5)
            goto L_0x0a34
        L_0x00bc:
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            goto L_0x03c7
        L_0x00c4:
            X.6GH r10 = (X.AnonymousClass6GH) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            X.5VC r1 = r10.A00
            long r1 = r1.Bwg()
            float r1 = X.C288025bF.A02(r1)
            int r3 = (int) r1
            X.5VC r1 = r10.A00
            long r1 = r1.Bwg()
            float r1 = X.C288025bF.A00(r1)
            int r5 = (int) r1
            java.lang.Object r2 = r0.A01
            java.lang.Object r4 = r0.A02
            r6 = 3
            X.J6Y r1 = new X.J6Y
            r1.<init>((java.lang.Object) r2, (int) r3, (java.lang.Object) r4, (int) r5, (int) r6)
            X.64W r2 = r10.A00(r1)
            return r2
        L_0x00ef:
            X.Hhf r10 = (X.C55435Hhf) r10
            r15 = 0
            X.0qQ.A0B(r10, r15)
            java.lang.Object r6 = r0.A02
            X.Gvu r6 = (X.C53889Gvu) r6
            java.lang.Object r5 = r0.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            X.JLY r4 = X.C53889Gvu.A00(r5, r6)
            r0 = 2131100283(0x7f06027b, float:1.7812943E38)
            int r0 = X.C244013aV.A02(r5, r0)
            X.Go9 r3 = new X.Go9
            r3.<init>(r0)
            r14 = 3
            X.GnR r2 = r10.A00
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            r7 = 0
            X.Gnx r0 = new X.Gnx
            r0.<init>(r7, r3, r4, r14)
            r1.add(r0)
            X.JLY r9 = X.C53889Gvu.A00(r5, r6)
            r0 = 2131100861(0x7f0604bd, float:1.7814115E38)
            int r0 = X.C244013aV.A02(r5, r0)
            X.Go9 r8 = new X.Go9
            r8.<init>(r0)
            X.2V1 r0 = r5.A05
            android.content.Context r1 = r0.A0C
            X.0qQ.A07(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = X.C61380mr.A00(r1, r0)
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            r12 = 1082130432(0x40800000, float:4.0)
            r13 = 0
            X.Go0 r6 = new X.Go0
            r10 = r7
            r16 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r6)
            goto L_0x0a34
        L_0x014e:
            X.JLq r10 = (X.C59492JLq) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r2 = r0.A02
            X.GMH r2 = (X.GMH) r2
            boolean r1 = r2.A0I
            java.lang.Object r0 = r0.A01
            X.2Wa r0 = (X.2Wa) r0
            X.GMH.A00(r0, r10, r2, r1)
            goto L_0x0a34
        L_0x0163:
            X.2WE r5 = X.C51968G9o.A0f(r10)
            java.lang.Object r4 = r0.A02
            X.Gx1 r4 = (X.C53957Gx1) r4
            com.instagram.common.session.UserSession r2 = r4.A00
            X.4DU r1 = r4.A04
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r1}
            java.lang.Object r2 = r0.A01
            r1 = 28
            X.JG1 r0 = new X.JG1
            r0.<init>(r1, r2, r4)
            r5.A02(r0, r3)
            goto L_0x0a34
        L_0x0181:
            java.lang.Object r2 = r0.A02
            X.GwL r2 = (X.C53915GwL) r2
            java.lang.Object r1 = r0.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.Gmw r0 = r2.A00
            X.C53915GwL.A00(r0, r1, r2)
            goto L_0x0a34
        L_0x0190:
            X.2Uy r10 = (X.C70762Uy) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r0.A01
            X.GMQ r1 = (X.GMQ) r1
            java.lang.Object r2 = r1.A05
            X.3Zt r2 = (X.C243673Zt) r2
            android.view.View r1 = r10.A01
            r2.A00(r1)
            java.lang.Object r1 = r0.A02
            android.view.GestureDetector r1 = (android.view.GestureDetector) r1
            android.view.MotionEvent r0 = r10.A00
            boolean r0 = r1.onTouchEvent(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x01b2:
            java.lang.Object r1 = r0.A02
            X.Gtv r1 = (X.C53766Gtv) r1
            X.0sK r5 = r1.A02
            java.lang.String r4 = r1.A00
            java.lang.String r3 = r1.A01
            boolean r2 = r1.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r5.invoke(r4, r3, r1)
            java.lang.Object r1 = r0.A01
            X.5xz r1 = (X.C300835xz) r1
            r0 = 0
            r1.A02(r2, r0, r0)
            goto L_0x0a34
        L_0x01cf:
            X.JQD r10 = (X.JQD) r10
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.lang.Object r2 = r0.A02
            X.GMs r2 = (X.C52302GMs) r2
            X.3fL r6 = r2.A04
            X.HOy r10 = (X.C54693HOy) r10
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r1 = r2.A03
            java.lang.String r1 = r1.A09
            X.0qQ.A0B(r1, r3)
            long r11 = X.DbZ.A07(r1)
            com.instagram.common.session.UserSession r9 = r2.A02
            X.0iw r8 = r2.A01
            java.lang.Object r7 = r0.A01
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            r6.DPG(r7, r8, r9, r10, r11)
            goto L_0x0a34
        L_0x01f5:
            java.lang.Object r2 = r0.A02
            X.GMs r2 = (X.C52302GMs) r2
            java.lang.Object r1 = r0.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r0 = r2.A03
            X.C52302GMs.A05(r1, r0, r2)
            goto L_0x0a34
        L_0x0204:
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r0.A01
            X.2Wa r1 = (X.2Wa) r1
            r1.A00()
            java.lang.Object r0 = r0.A02
            X.GMs r0 = (X.C52302GMs) r0
            X.0sP r0 = r0.A06
            goto L_0x03d0
        L_0x0217:
            java.lang.Object r3 = r0.A01
            X.3fL r3 = (X.C246853fL) r3
            java.lang.Object r2 = r0.A02
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r2 = (com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState) r2
            java.lang.String r1 = r2.A09
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r7 = X.DbZ.A07(r1)
            int r6 = r2.A00
            com.instagram.api.schemas.SocialContextType r4 = r2.A02
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY
            if (r4 != r0) goto L_0x0238
            java.lang.String r5 = r2.A08
        L_0x0233:
            r3.DG5(r4, r5, r6, r7)
            goto L_0x0a34
        L_0x0238:
            r5 = 0
            goto L_0x0233
        L_0x023a:
            java.lang.String r2 = X.C41847B3o.A1E(r10)
            java.lang.Object r1 = r0.A02
            android.view.GestureDetector r1 = (android.view.GestureDetector) r1
            X.I4F.A00(r1)
            java.lang.Object r0 = r0.A01
            X.3fL r0 = (X.C246853fL) r0
            r0.DwK(r2)
            goto L_0x0a34
        L_0x024e:
            java.lang.String r2 = X.C41847B3o.A1E(r10)
            java.lang.Object r1 = r0.A02
            android.view.GestureDetector r1 = (android.view.GestureDetector) r1
            X.I4F.A00(r1)
            java.lang.Object r0 = r0.A01
            X.3fL r0 = (X.C246853fL) r0
            r0.DIf(r2)
            goto L_0x0a34
        L_0x0262:
            java.lang.Object r2 = r0.A02
            android.os.Handler r2 = (android.os.Handler) r2
            r1 = 0
            r2.removeCallbacksAndMessages(r1)
            java.lang.Object r0 = r0.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacksAndMessages(r1)
            goto L_0x0a34
        L_0x0273:
            java.lang.String r3 = X.C41847B3o.A1E(r10)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0280
            r1.invoke(r3)
        L_0x0280:
            java.lang.Object r2 = r0.A02
            X.K9K r2 = (X.K9K) r2
            r0 = -1
            r2.A04(r3, r0)
            goto L_0x0a34
        L_0x028b:
            X.4ch r10 = (X.C268064ch) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r4 = r0.A02
            X.5Oz r4 = (X.C284945Oz) r4
            long r2 = r10.Bwh()
            X.5cr r1 = new X.5cr
            r1.<init>(r2)
            r4.Epw(r1)
            java.lang.Object r3 = r0.A01
            X.5Oz r3 = (X.C284945Oz) r3
            r0 = 0
            long r1 = r10.CgY(r0)
            X.5dM r0 = new X.5dM
            r0.<init>(r1)
            r3.Epw(r0)
            goto L_0x0a34
        L_0x02b5:
            java.lang.Object r8 = r0.A02
            X.JW8 r8 = (X.JW8) r8
            X.JWm r1 = r8.A0H
            X.JW7 r7 = r1.A00
            X.JW8 r3 = r7.A14
            X.JWk r1 = r3.A0I
            X.JWj r1 = r1.A02
            X.JWl r1 = r1.A03
            com.instagram.common.ui.base.IgTextView r10 = r1.A01
            com.instagram.common.session.UserSession r1 = r7.A0z
            X.8gT r2 = X.C361578gS.A00(r1)
            boolean r1 = X.JW7.A0S(r7)
            if (r1 == 0) goto L_0x0359
            boolean r1 = r7.A1P
            if (r1 != 0) goto L_0x0359
            X.0Ud r1 = r2.A06
            boolean r1 = X.JTS.A1a(r1)
            if (r1 == 0) goto L_0x0359
            X.JWe r6 = r7.A16
            android.content.Context r2 = r7.getContext()
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.Object r9 = X.0mE.A01(r2, r1)
            android.app.Activity r9 = (android.app.Activity) r9
            if (r10 != 0) goto L_0x02f3
            X.JWb r1 = r7.A11
            com.instagram.ui.widget.trianglespinner.TriangleSpinner r10 = r1.A01
        L_0x02f3:
            android.view.View r10 = (android.view.View) r10
            X.8gT r1 = r3.A0J
            X.0Ud r1 = r1.A06
            java.util.List r1 = X.JTO.A17(r1)
            java.util.List r12 = X.AnonymousClass9Q0.A01(r1)
            android.content.res.Resources r11 = r7.getResources()
            X.0qQ.A07(r11)
            X.8ZW r1 = r7.A17
            X.2fy r5 = r1.B6f()
            X.0qQ.A07(r5)
            r3 = 0
            X.0qQ.A0B(r9, r3)
            boolean r1 = r6.A02
            if (r1 != 0) goto L_0x0359
            if (r10 == 0) goto L_0x0359
            com.instagram.common.session.UserSession r4 = r6.A04
            X.0xa r2 = X.AnonymousClass7TE.A0q(r4)
            r1 = 1598(0x63e, float:2.239E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            int r2 = r2.getInt(r1, r3)
            r1 = 1
            if (r2 >= r1) goto L_0x0359
            boolean r1 = X.JTS.A1Y(r4)
            if (r1 == 0) goto L_0x0359
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r12)
            java.util.Iterator r2 = r12.iterator()
        L_0x033c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x034e
            java.lang.Object r1 = r2.next()
            X.Lzo r1 = (X.C65796Lzo) r1
            java.lang.String r1 = r1.A02
            r3.add(r1)
            goto L_0x033c
        L_0x034e:
            java.lang.String r1 = X.F5J.A01(r11, r3)
            X.5Gv r1 = X.F5J.A00(r9, r10, r4, r5, r1)
            r6.A00(r1)
        L_0x0359:
            java.lang.Object r2 = r0.A01
            X.JWb r2 = (X.C59743JWb) r2
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = X.JW8.A00(r8)
            r1.addAll(r0)
            X.8gT r0 = r8.A0J
            X.0Ud r0 = r0.A06
            java.util.List r0 = X.JTO.A17(r0)
            java.util.List r0 = X.AnonymousClass9Q0.A01(r0)
            r1.addAll(r0)
            java.util.ArrayList r0 = X.JW8.A00(r8)
            r1.addAll(r0)
            r2.A00(r1)
            X.8Xf r0 = r8.A0B()
            r8.A0J(r0)
            X.JW7.A0F(r7)
            goto L_0x0a34
        L_0x038d:
            java.lang.Object r2 = r0.A02
            X.JW7 r2 = (X.JW7) r2
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r2)
            X.C63138Ks6.A00(r1)
            java.lang.Object r1 = r0.A01
            com.instagram.common.gallery.model.GalleryItem r0 = r2.A0B
            if (r1 != r0) goto L_0x0a34
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 1
            r2.A0a(r1, r0)
            goto L_0x0a34
        L_0x03a6:
            if (r40 != 0) goto L_0x03cc
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            X.LoT r0 = (X.C65164LoT) r0
            X.8m2 r0 = r0.A0I
            goto L_0x03bf
        L_0x03b3:
            if (r40 != 0) goto L_0x03cc
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            X.LkA r0 = (X.C64910LkA) r0
            X.8m2 r0 = r0.A09
        L_0x03bf:
            java.lang.String r0 = r0.AvM()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
        L_0x03c7:
            r1.invoke(r0)
            goto L_0x0a34
        L_0x03cc:
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
        L_0x03d0:
            r0.invoke(r10)
            goto L_0x0a34
        L_0x03d5:
            X.LFx r10 = (X.C63970LFx) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r2 = r0.A02
            X.JlP r2 = (X.C60432JlP) r2
            X.KzI r1 = r10.A02
            r2.A01(r1)
            java.lang.Object r1 = r0.A01
            X.JlP r1 = (X.C60432JlP) r1
            X.KzI r0 = r10.A00
            r1.A01(r0)
            goto L_0x0a34
        L_0x03ef:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r2 = r10.booleanValue()
            java.lang.Object r1 = r0.A02
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            r1.A0I = r10
            java.lang.Object r1 = r0.A01
            X.3oV r1 = (X.C252063oV) r1
            int r0 = X.DbW.A01(r2)
            r1.setVisibility(r0)
            goto L_0x0a34
        L_0x0408:
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r1 = 1
            X.0qQ.A0B(r3, r1)
            r1 = 28
            X.G2c r2 = new X.G2c
            r2.<init>(r3, r1)
            java.lang.Class<X.3Np> r1 = X.C241033Np.class
            java.lang.Object r1 = r3.A01(r1, r2)
            X.3Nm r1 = (X.C241003Nm) r1
            X.3Np r1 = (X.C241033Np) r1
            X.0eM r1 = r1.A00
            java.lang.Object r7 = r1.getValue()
            X.3Nr r7 = (X.C241053Nr) r7
            X.1E8 r5 = X.1E7.A00(r3)
            X.1OP r1 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r9 = com.instagram.reels.store.ReelStore.A03(r3)
            X.0qQ.A07(r9)
            X.8WT r6 = X.AnonymousClass8WT.A00
            X.1Am r2 = X.1Al.A01(r3)
            X.1An r1 = X.1An.A2A
            X.0xa r8 = X.C51969G9p.A0n(r2, r1, r10)
            java.lang.Object r4 = r0.A01
            X.8Yz r4 = (X.C357638Yz) r4
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r2 = new com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0450:
            java.lang.Object r5 = r0.A02
            X.8Kx r5 = (X.C354168Kx) r5
            r5.A00()
            if (r40 == 0) goto L_0x0a34
            java.lang.Object r2 = r0.A01
            X.8Cl r2 = (X.C352218Cl) r2
            r6 = 0
            X.0qQ.A0B(r2, r6)
            X.9YA r4 = r5.A00
            if (r4 == 0) goto L_0x0a34
            java.lang.String r3 = r2.A06()
            int r1 = r2.A09
            int r0 = r2.A06
            android.util.Size r9 = new android.util.Size
            r9.<init>(r1, r0)
            X.0qQ.A0B(r3, r6)
            android.util.ArrayMap r0 = r4.A00
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            r7 = 0
            if (r0 == 0) goto L_0x0a34
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x0488:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04a2
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.9ZC r0 = (X.AnonymousClass9ZC) r0
            float r1 = r0.A00
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0488
            r6.add(r3)
            goto L_0x0488
        L_0x04a2:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x04aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04bc
            java.lang.Object r0 = r1.next()
            X.9ZC r0 = (X.AnonymousClass9ZC) r0
            android.graphics.RectF r0 = r0.A01
            r3.add(r0)
            goto L_0x04aa
        L_0x04bc:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r13 = r3.iterator()
        L_0x04c4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0522
            java.lang.Object r11 = r13.next()
            android.graphics.RectF r11 = (android.graphics.RectF) r11
            r1 = 1084227584(0x40a00000, float:5.0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            int r0 = r9.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r12 = (int) r0
            int r10 = r9.getHeight()
            int r10 = r10 - r12
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r3 = r9.getWidth()
            int r3 = r3 - r0
            float r1 = r11.left
            float r0 = (float) r0
            r6 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r4 = (int) r1
            if (r0 >= 0) goto L_0x04f7
            r4 = 1
        L_0x04f7:
            float r1 = r11.top
            float r0 = (float) r12
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x04ff
            int r6 = (int) r1
        L_0x04ff:
            float r1 = r11.right
            float r0 = (float) r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0520
            int r3 = r9.getWidth()
        L_0x050a:
            float r1 = r11.bottom
            float r0 = (float) r10
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x051e
            int r1 = r9.getHeight()
        L_0x0515:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r6, r3, r1)
            r8.add(r0)
            goto L_0x04c4
        L_0x051e:
            int r1 = (int) r1
            goto L_0x0515
        L_0x0520:
            int r3 = (int) r1
            goto L_0x050a
        L_0x0522:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0568
            android.graphics.Rect r7 = X.AnonymousClass7TE.A0W()
        L_0x052c:
            int r0 = r7.left
            r8 = 0
            r1 = 1
            boolean r6 = X.AnonymousClass7TF.A1S(r0, r1)
            int r0 = r7.top
            boolean r4 = X.AnonymousClass7TF.A1S(r0, r1)
            int r1 = r7.right
            int r0 = r2.A09
            boolean r3 = X.AnonymousClass7TF.A1S(r1, r0)
            int r1 = r7.bottom
            int r0 = r2.A06
            if (r1 != r0) goto L_0x0549
            r8 = 1
        L_0x0549:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r6, r4, r3, r8)
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            boolean r0 = r0.equals(r7)
            X.8B2 r1 = r5.A05
            if (r1 == 0) goto L_0x0a34
            r0 = r0 ^ 1
            r1.A01 = r0
            X.05G r1 = r1.A05
        L_0x0560:
            boolean r0 = X.JTP.A1b(r2, r1)
            if (r0 == 0) goto L_0x0560
            goto L_0x0a34
        L_0x0568:
            java.util.Iterator r1 = r8.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0588
            java.lang.Object r7 = r1.next()
        L_0x0576:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0588
            java.lang.Object r0 = r1.next()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r7.union(r0)
            goto L_0x0576
        L_0x0588:
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            if (r7 == 0) goto L_0x0a34
            goto L_0x052c
        L_0x058d:
            X.8Cl r10 = (X.C352218Cl) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r0.A02
            X.Ly5 r1 = (X.C65690Ly5) r1
            X.80W r3 = r1.A03
            X.8nh r2 = new X.8nh
            r2.<init>((X.C352218Cl) r10)
            java.lang.Object r1 = r0.A01
            X.MWx r1 = (X.C66569MWx) r1
            X.8Uy r0 = new X.8Uy
            r0.<init>(r2, r1)
            r3.A04(r0)
            goto L_0x0a34
        L_0x05ac:
            java.io.File r10 = (java.io.File) r10
            r2 = 0
            X.0qQ.A0B(r10, r2)
            java.lang.Object r3 = r0.A02
            X.JiP r3 = (X.C60268JiP) r3
            r1 = 1
            com.instagram.common.gallery.Medium r2 = X.C282665Eg.A03(r10, r1, r2)
            java.lang.Object r1 = r0.A01
            X.MWx r1 = (X.C66569MWx) r1
            X.KL8 r0 = new X.KL8
            r0.<init>(r2, r1)
            X.C60268JiP.A00(r0, r3)
            goto L_0x0a34
        L_0x05c9:
            java.lang.Object r1 = r0.A02
            X.7vS r1 = (X.C346607vS) r1
            X.8Be r1 = r1.A0F
            java.lang.Object r0 = r0.A01
            X.7va r0 = (X.C346687va) r0
            java.lang.String r0 = r0.A01
            X.8Wk r2 = X.JTT.A0O(r1)
            if (r2 == 0) goto L_0x0a34
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 1
            X.C357088Wk.A0A(r2, r1, r0)
            goto L_0x0a34
        L_0x05e5:
            java.lang.Object r1 = r0.A02
            X.7vS r1 = (X.C346607vS) r1
            X.8Be r1 = r1.A0F
            java.lang.Object r0 = r0.A01
            X.7va r0 = (X.C346687va) r0
            java.lang.String r5 = r0.A01
            java.lang.String r6 = r0.A02
            boolean r8 = r0.A05
            X.8Wk r2 = X.JTT.A0O(r1)
            if (r2 == 0) goto L_0x0a34
            r7 = 0
            com.instagram.api.schemas.AudienceList r4 = new com.instagram.api.schemas.AudienceList
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            com.instagram.common.session.UserSession r3 = r2.A05
            X.81T r0 = r2.A0G
            X.LFo r1 = new X.LFo
            r1.<init>(r0, r3)
            X.KkX r0 = X.C62671KkX.AUDIENCE_LONG_PRESS
            r1.A02(r0, r5, r6)
            X.4DH r2 = r2.A02
            r1 = 9413(0x24c5, float:1.319E-41)
            boolean r0 = X.AnonymousClass7TF.A1U(r7, r3, r2)
            X.LPM.A02(r4, r2, r3, r1, r0)
            goto L_0x0a34
        L_0x061d:
            java.lang.Object r1 = r0.A02
            X.7vS r1 = (X.C346607vS) r1
            com.instagram.common.session.UserSession r3 = r1.A0C
            android.app.Activity r2 = r1.A08
            java.lang.Object r0 = r0.A01
            X.82k r0 = (X.C3499182k) r0
            java.lang.String r1 = r0.BAL()
            java.lang.String r0 = r0.getName()
            X.C49957FGp.A05(r2, r3, r1, r0)
            goto L_0x0a34
        L_0x0636:
            java.lang.Object r1 = r0.A02
            X.7vS r1 = (X.C346607vS) r1
            X.8Be r2 = r1.A0F
            java.lang.Object r0 = r0.A01
            X.82k r0 = (X.C3499182k) r0
            java.lang.String r1 = r0.BAL()
            r0 = 0
            r2.A0G(r1, r0)
            goto L_0x0a34
        L_0x064a:
            java.lang.Object r1 = r0.A02
            X.7vS r1 = (X.C346607vS) r1
            X.8Be r2 = r1.A0F
            java.lang.Object r0 = r0.A01
            X.82k r0 = (X.C3499182k) r0
            java.lang.String r1 = r0.BAL()
            X.8Wk r0 = X.JTT.A0O(r2)
            if (r0 == 0) goto L_0x0a34
            r0.A0F(r1)
            goto L_0x0a34
        L_0x0663:
            java.lang.Object r4 = r0.A02
            X.8bk r4 = (X.C358958bk) r4
            java.lang.Object r5 = r0.A01
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r4.A02
            float r2 = r3.A0F(r5)
            r1 = 9
            X.Iwv r0 = new X.Iwv
            r0.<init>(r5, r4, r2, r1)
            X.C358958bk.A02(r5, r4, r0)
            float r2 = r3.A0G(r5)
            r1 = 10
            X.Iwv r0 = new X.Iwv
            r0.<init>(r5, r4, r2, r1)
            X.C358958bk.A02(r5, r4, r0)
            float r2 = r3.A0H(r5)
            r1 = 8
            X.Iwg r0 = new X.Iwg
            r0.<init>(r4, r2, r1)
            X.C358958bk.A02(r5, r4, r0)
            java.lang.Float r0 = r3.A0R(r5)
            if (r0 == 0) goto L_0x06ad
            float r2 = r0.floatValue()
        L_0x06a1:
            r1 = 9
            X.Iwg r0 = new X.Iwg
            r0.<init>(r4, r2, r1)
            X.C358958bk.A02(r5, r4, r0)
            goto L_0x0a34
        L_0x06ad:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x06a1
        L_0x06b0:
            X.2YQ r10 = (X.AnonymousClass2YQ) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            X.8B5 r1 = X.AnonymousClass8B5.A00
            java.lang.Object r1 = r10.A00(r1)
            X.8Z0 r1 = (X.AnonymousClass8Z0) r1
            if (r1 == 0) goto L_0x06ed
            X.8C2 r6 = new X.8C2
            r6.<init>()
            java.lang.Object r5 = r0.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A01
            X.80W r4 = (X.AnonymousClass80W) r4
            X.8Z1 r3 = r1.Bmt()
            java.lang.Class<X.8C4> r2 = X.AnonymousClass8C4.class
            r1 = 16
            X.9LJ r0 = new X.9LJ
            r0.<init>(r6, r1)
            X.3pa r2 = r3.A00(r2, r0)
            X.8C4 r2 = (X.AnonymousClass8C4) r2
            X.0sl r1 = X.0sl.A00
            X.8C5 r0 = new X.8C5
            r0.<init>(r5, r2, r1)
            X.9YC r2 = new X.9YC
            r2.<init>(r5, r0, r4)
            return r2
        L_0x06ed:
            java.lang.String r0 = "No repository store owner found"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x06f4:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r3 = r0.A01
            X.7zv r3 = (X.C349307zv) r3
            java.util.List r1 = X.00k.A0X(r10)
            r3.A0u = r1
            java.lang.Object r4 = r0.A02
            X.8Hw r4 = (X.C353498Hw) r4
            X.8Yz r1 = r4.A1F
            X.8aL r0 = X.C358088aL.A0z
            boolean r0 = X.C357638Yz.A03(r0, r1)
            if (r0 == 0) goto L_0x0763
            X.8Gz r2 = r4.A0C
            if (r2 == 0) goto L_0x0763
            X.C353498Hw.A0r(r4)
            goto L_0x0749
        L_0x071a:
            r3 = r10
            X.7zv r3 = (X.C349307zv) r3
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.Object r4 = r0.A02
            X.8Hw r4 = (X.C353498Hw) r4
            boolean r1 = X.C353498Hw.A1V(r4)
            if (r1 != 0) goto L_0x072e
            X.C353498Hw.A0h(r4)
        L_0x072e:
            X.8Yz r2 = r4.A1F
            X.8aL r1 = X.C358088aL.A0z
            boolean r1 = X.C357638Yz.A03(r1, r2)
            if (r1 == 0) goto L_0x074e
            X.8Gz r2 = r4.A0C
            if (r2 == 0) goto L_0x074e
            com.instagram.common.session.UserSession r0 = r4.A1D
            X.27r r0 = X.27p.A01(r0)
            X.29L r1 = r0.A0J
            X.50r r0 = r4.A1t
            r1.A00(r0)
        L_0x0749:
            r2.A00(r3)
            goto L_0x0a34
        L_0x074e:
            X.8IQ r1 = r4.A1k
            X.87s r1 = r1.A03
            boolean r1 = r1.A0N()
            if (r1 != 0) goto L_0x0770
            boolean r1 = X.C353498Hw.A1V(r4)
            if (r1 != 0) goto L_0x0a34
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0784
        L_0x0763:
            X.8IQ r0 = r4.A1k
            X.87s r0 = r0.A03
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0775
            X.C353498Hw.A0r(r4)
        L_0x0770:
            X.C353498Hw.A13(r4, r3)
            goto L_0x0a34
        L_0x0775:
            java.lang.String r0 = r4.A0T
            if (r0 == 0) goto L_0x0a34
            X.C353498Hw.A0r(r4)
            boolean r0 = X.C353498Hw.A1V(r4)
            if (r0 != 0) goto L_0x0a34
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0784:
            X.C353498Hw.A14(r4, r3, r0)
            goto L_0x0a34
        L_0x0789:
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r7 = r0.A02
            X.8Hw r7 = (X.C353498Hw) r7
            java.lang.Object r6 = r0.A01
            boolean r5 = r7.A0j
            r0 = 1
            X.C353498Hw.A1F(r7, r1, r0, r0)
            com.instagram.common.session.UserSession r4 = r7.A1D
            X.4MS r3 = r7.A18
            if (r5 == 0) goto L_0x07ac
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
        L_0x07a1:
            r1 = 5
            X.GL3 r0 = new X.GL3
            r0.<init>(r1, r6, r7, r5)
            X.C64170LRv.A02(r3, r4, r2, r0)
            goto L_0x0a34
        L_0x07ac:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x07a1
        L_0x07af:
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 2131436377(0x7f0b2359, float:1.8494623E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r2, r1)
            android.content.Context r6 = r2.getContext()
            android.content.res.Resources r2 = r6.getResources()
            X.8YU r5 = X.AnonymousClass8YU.PAUSED
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r10 != r5) goto L_0x07cc
            r1 = 2131165203(0x7f070013, float:1.7944616E38)
        L_0x07cc:
            float r1 = r2.getDimension(r1)
            X.C63167Ksa.A00(r3, r1)
            java.lang.Object r1 = r0.A02
            X.K5P r1 = (X.K5P) r1
            X.Jfa r4 = r1.A05
            if (r4 != 0) goto L_0x07df
            java.lang.String r0 = "miniTimelineViewModel"
            goto L_0x09ae
        L_0x07df:
            r1.requireContext()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A04
            if (r0 == 0) goto L_0x099b
            X.0Ud r0 = r0.A0c
            java.lang.Object r0 = r0.getValue()
            X.831 r0 = (X.AnonymousClass831) r0
            java.util.ArrayList r3 = r0.A05()
            int r0 = r1.A00
            int r2 = r0 / 2
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = X.DbS.A03(r1, r0)
            int r2 = r2 - r0
            boolean r0 = X.AnonymousClass7TF.A1W(r10, r5)
            r4.A0E(r2, r0, r3)
            goto L_0x0a34
        L_0x080b:
            android.util.LruCache r10 = (android.util.LruCache) r10
            java.lang.Object r2 = r0.A02
            X.Lgk r2 = (X.C64711Lgk) r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0N
            boolean r1 = r1.A0s()
            if (r1 != 0) goto L_0x0a34
            java.lang.Object r0 = r0.A01
            X.8RF r0 = (X.AnonymousClass8RF) r0
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RS
            if (r0 == 0) goto L_0x08cf
            X.KM0 r2 = r2.A0J
            X.0qQ.A0A(r10)
            X.8RS r1 = (X.AnonymousClass8RS) r1
            int r6 = r1.getSegmentIndex()
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.util.List r0 = r2.A03
            java.lang.Object r1 = r0.get(r6)
            X.Klz r1 = (X.C62761Klz) r1
            boolean r0 = r1 instanceof X.KMM
            if (r0 == 0) goto L_0x0a34
            X.KMM r1 = (X.KMM) r1
            X.51P r7 = r1.A00
            r12 = 0
            if (r7 == 0) goto L_0x08c6
            java.util.List r0 = r2.A05
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)
            X.89w r5 = r2.A0A
            X.89v r1 = r5.A00()
            X.9Km r0 = new X.9Km
            r0.<init>(r1, r4)
            java.lang.Object r4 = r0.invoke(r7)
            java.lang.String r4 = (java.lang.String) r4
            X.89v r0 = r5.A00()
            X.0sP r0 = r0.A05
            java.lang.Object r0 = r0.invoke(r7)
            int r13 = X.AnonymousClass7TE.A0M(r0)
            X.89v r0 = r5.A00()
            int r14 = r0.A02
            X.89v r0 = r5.A00()
            int r15 = r0.A01
            r16 = 1
            X.Juv r11 = new X.Juv
            r11.<init>(r12, r13, r14, r15, r16)
            r9 = 0
        L_0x0880:
            if (r9 >= r13) goto L_0x08a8
            X.89v r0 = r5.A00()
            X.0sL r1 = r0.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r1.invoke(r0, r7)
            int r8 = X.AnonymousClass7TE.A0M(r0)
            r1 = 2
            X.9Ir r0 = new X.9Ir
            r0.<init>(r4, r8, r1)
            java.lang.Object r0 = r10.get(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x08a5
            r11.A00(r9, r0)
        L_0x08a5:
            int r9 = r9 + 1
            goto L_0x0880
        L_0x08a8:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r4, r11)
            r3.set(r6, r0)
            java.util.List r1 = r2.A05
            X.Jk2 r0 = new X.Jk2
            r0.<init>(r1, r3)
            X.2ta r1 = X.C232332tX.A00(r0)
            r2.A05 = r3
            X.LaB r0 = new X.LaB
            r0.<init>(r2)
            r1.A02(r0)
            goto L_0x0a34
        L_0x08c6:
            java.lang.String r1 = "ThumbnailRecyclerViewAdapterV3"
            java.lang.String r0 = "video segment is null"
            X.0kD.A07(r1, r0, r12)
            goto L_0x0a34
        L_0x08cf:
            boolean r0 = r1 instanceof X.C355878Rs
            if (r0 == 0) goto L_0x0a34
            X.KM0 r0 = r2.A0J
            X.0qQ.A0A(r10)
            r0.A07(r10)
            goto L_0x0a34
        L_0x08dd:
            float r2 = X.AnonymousClass7TE.A04(r10)
            java.lang.Object r1 = r0.A01
            X.8RF r1 = (X.AnonymousClass8RF) r1
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RS
            java.lang.Object r0 = r0.A02
            X.Lgk r0 = (X.C64711Lgk) r0
            if (r1 == 0) goto L_0x08fc
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r0 = r0.A04()
            if (r0 == 0) goto L_0x0a34
            r0.setSeekPosition(r2)
            goto L_0x0a34
        L_0x08fc:
            r0.A05()
            goto L_0x0a34
        L_0x0901:
            java.util.List r3 = X.JTQ.A0i(r10)
            java.lang.Object r2 = r0.A02
            X.KMt r2 = (X.C61805KMt) r2
            X.LTY r1 = r2.A01
            java.lang.String r1 = r1.A02
            java.lang.Object r0 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            X.C61805KMt.A00(r2, r0, r1, r3)
            goto L_0x0a34
        L_0x0916:
            X.5kq r10 = (X.C293505kq) r10
            r2 = 0
            X.0qQ.A0B(r10, r2)
            java.lang.Object r6 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r6
            com.instagram.common.session.UserSession r1 = r6.A04
            X.8A2 r1 = X.AnonymousClass8A1.A01(r1)
            java.lang.String r5 = r10.A0T
            X.0qQ.A0B(r5, r2)
            X.1QP r4 = r1.A0J
            long r1 = r1.A07
            X.AE4 r3 = new X.AE4
            r3.<init>(r4)
            r3.A01 = r1
            r1 = 2167(0x877, float:3.037E-42)
            java.lang.String r2 = X.C273654mx.A00(r1)
            java.util.Map r1 = r3.A04
            r1.put(r2, r5)
            java.lang.String r1 = "draft_update_tried"
            r3.A04(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = r6.A07
            java.lang.Object r0 = r0.A01
            X.JXe r0 = (X.C59765JXe) r0
            X.5kq r0 = r0.A01(r10)
            r1.A0N(r0)
            goto L_0x0a34
        L_0x0955:
            float r2 = X.AnonymousClass7TE.A04(r10)
            r3 = 1
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0976
            java.lang.Object r1 = r0.A02
            X.K6O r1 = (X.K6O) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r1.A02
            if (r1 == 0) goto L_0x099b
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            X.05G r1 = r1.A0S
            java.lang.Object r1 = r1.getValue()
            boolean r1 = X.G9w.A1b(r1)
            if (r1 != 0) goto L_0x0976
            r3 = 0
        L_0x0976:
            java.lang.Object r2 = r0.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r3 == 0) goto L_0x0990
            java.lang.Object r1 = r0.A02
            X.K6O r1 = (X.K6O) r1
            int r1 = r1.A00
        L_0x0982:
            r2.setText(r1)
            java.lang.Object r0 = r0.A02
            X.K6O r0 = (X.K6O) r0
            X.JlJ r0 = r0.A03
            if (r0 != 0) goto L_0x0994
            java.lang.String r0 = "voiceEffectsGridAdapter"
            goto L_0x09ae
        L_0x0990:
            r1 = 2131953286(0x7f130686, float:1.9543039E38)
            goto L_0x0982
        L_0x0994:
            r0.A00 = r3
            r0.notifyDataSetChanged()
            goto L_0x0a34
        L_0x099b:
            java.lang.String r0 = "clipsCreationViewModel"
            goto L_0x09ae
        L_0x099e:
            com.instagram.common.gallery.Medium r10 = (com.instagram.common.gallery.Medium) r10
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.lang.Object r1 = r0.A02
            com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment r1 = (com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment) r1
            X.LYp r6 = r1.A04
            if (r6 != 0) goto L_0x09b6
            java.lang.String r0 = "peekController"
        L_0x09ae:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09b6:
            java.lang.Object r0 = r0.A01
            X.JuE r0 = (X.C60956JuE) r0
            java.lang.String r1 = r0.A05
            X.0qQ.A0B(r1, r3)
            r4 = 1
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0a34
            java.lang.String r0 = r6.A06
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0a34
            r37 = 0
            X.4Nf r2 = new X.4Nf
            r2.<init>((java.lang.Object) r10, (int) r3)
            r2.A00 = r4
            java.lang.String r5 = r10.A0X
            java.lang.Integer r13 = X.AnonymousClass05K.A1F
            java.lang.String r15 = X.AnonymousClass7TG.A0j()
            r8 = 0
            if (r5 == 0) goto L_0x09e8
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x09e8
            r37 = 1
        L_0x09e8:
            r27 = -1
            r29 = -1
            X.3WR r7 = new X.3WR
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r16 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r28 = r27
            r31 = r3
            r32 = r3
            r33 = r3
            r34 = r4
            r35 = r3
            r36 = r3
            r38 = r3
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38)
            X.Tol r1 = r6.A0J
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r6.A0H
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r13 = "giphy_peek_video_player"
            r8 = r1
            r9 = r0
            r10 = r7
            r11 = r2
            r12 = r5
            r15 = r27
            r16 = r3
            r17 = r4
            r18 = r4
            r8.A09(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0a34:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66312MMv.invoke(java.lang.Object):java.lang.Object");
    }
}
