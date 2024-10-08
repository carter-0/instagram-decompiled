package X;

public final class J6M extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6M(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static J6M A00(Object obj, int i) {
        return new J6M(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0364, code lost:
        r0.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04ab, code lost:
        if (r2 < r4.A01) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04b7, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04cf, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04e0, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04f4, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04fb, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        if (r2.A00 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        if (r2.A00 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x002c;
                case 2: goto L_0x03a2;
                case 3: goto L_0x0046;
                case 4: goto L_0x0055;
                case 5: goto L_0x03ab;
                case 6: goto L_0x005f;
                case 7: goto L_0x0067;
                case 8: goto L_0x00da;
                case 9: goto L_0x0118;
                case 10: goto L_0x0125;
                case 11: goto L_0x013c;
                case 12: goto L_0x03ca;
                case 13: goto L_0x0005;
                case 14: goto L_0x014b;
                case 15: goto L_0x0156;
                case 16: goto L_0x0189;
                case 17: goto L_0x019b;
                case 18: goto L_0x0404;
                case 19: goto L_0x01b6;
                case 20: goto L_0x0413;
                case 21: goto L_0x0428;
                case 22: goto L_0x0428;
                case 23: goto L_0x0432;
                case 24: goto L_0x043e;
                case 25: goto L_0x01c1;
                case 26: goto L_0x01cd;
                case 27: goto L_0x04d0;
                case 28: goto L_0x045c;
                case 29: goto L_0x01f2;
                case 30: goto L_0x04e0;
                case 31: goto L_0x0201;
                case 32: goto L_0x046f;
                case 33: goto L_0x0486;
                case 34: goto L_0x020e;
                case 35: goto L_0x022a;
                case 36: goto L_0x04b9;
                case 37: goto L_0x04b9;
                case 38: goto L_0x0369;
                case 39: goto L_0x0298;
                case 40: goto L_0x02a2;
                case 41: goto L_0x02ad;
                case 42: goto L_0x02b8;
                case 43: goto L_0x02d6;
                case 44: goto L_0x02e8;
                case 45: goto L_0x0005;
                case 46: goto L_0x02fd;
                case 47: goto L_0x0319;
                case 48: goto L_0x033d;
                case 49: goto L_0x04e2;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.4cl r10 = (X.C268104cl) r10
            java.lang.Object r1 = r9.A01
            X.4cY r1 = (X.C267974cY) r1
            r0 = 0
            r10.A07(r1, r0, r0)
        L_0x000f:
            X.0gF r2 = X.C60340gF.A00
        L_0x0011:
            return r2
        L_0x0012:
            X.5SW r10 = (X.AnonymousClass5SW) r10
            X.5Sb r1 = X.C55298HfR.A00
            X.HL1 r3 = X.HL1.Cursor
            java.lang.Object r0 = r9.A01
            X.JNV r0 = (X.JNV) r0
            long r5 = r0.E4j()
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r7 = 1
            X.Ht4 r2 = new X.Ht4
            r2.<init>(r3, r4, r5, r7)
            r10.ENH(r1, r2)
            goto L_0x000f
        L_0x002c:
            X.4cl r10 = (X.C268104cl) r10
            java.lang.Object r4 = r9.A01
            java.util.List r4 = (java.util.List) r4
            int r3 = r4.size()
            r2 = 0
        L_0x0037:
            if (r2 >= r3) goto L_0x000f
            java.lang.Object r1 = r4.get(r2)
            X.4cY r1 = (X.C267974cY) r1
            r0 = 0
            r10.A07(r1, r0, r0)
            int r2 = r2 + 1
            goto L_0x0037
        L_0x0046:
            X.4ch r10 = (X.C268064ch) r10
            java.lang.Object r0 = r9.A01
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.I1h r0 = X.C52754Gc7.A00(r0)
            if (r0 == 0) goto L_0x000f
            r0.A00 = r10
            goto L_0x000f
        L_0x0055:
            java.lang.Object r0 = r9.A01
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.5Oz r0 = r0.A0B
            r0.Epw(r10)
            goto L_0x000f
        L_0x005f:
            java.lang.Object r0 = r9.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A0B()
            goto L_0x000f
        L_0x0067:
            androidx.compose.ui.text.input.ImeAction r10 = (androidx.compose.ui.text.input.ImeAction) r10
            int r1 = r10.A00
            java.lang.Object r0 = r9.A01
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.Hlp r2 = r0.A07
            r0 = 7
            if (r1 != r0) goto L_0x0098
            X.I4S r0 = r2.A00
            if (r0 == 0) goto L_0x04ef
            X.0sP r0 = r0.A00
        L_0x007a:
            if (r0 == 0) goto L_0x0080
            r0.invoke(r2)
            goto L_0x000f
        L_0x0080:
            r0 = 6
            if (r1 != r0) goto L_0x0089
            X.5Qa r1 = r2.A01
            if (r1 == 0) goto L_0x04ec
            r0 = 1
            goto L_0x00b1
        L_0x0089:
            r0 = 5
            if (r1 == r0) goto L_0x00ac
            r0 = 7
            if (r1 != r0) goto L_0x000f
            X.5Uk r0 = r2.A02
            if (r0 == 0) goto L_0x000f
            r0.hide()
            goto L_0x000f
        L_0x0098:
            r0 = 2
            if (r1 == r0) goto L_0x00d4
            r0 = 6
            if (r1 != r0) goto L_0x00a5
            X.I4S r0 = r2.A00
            if (r0 == 0) goto L_0x04ef
            X.0sP r0 = r0.A01
            goto L_0x007a
        L_0x00a5:
            r0 = 5
            if (r1 != r0) goto L_0x00b6
            X.I4S r0 = r2.A00
            if (r0 == 0) goto L_0x04ef
        L_0x00ac:
            X.5Qa r1 = r2.A01
            if (r1 == 0) goto L_0x04ec
            r0 = 2
        L_0x00b1:
            r1.Coe(r0)
            goto L_0x000f
        L_0x00b6:
            r0 = 3
            if (r1 == r0) goto L_0x00d4
            r0 = 4
            if (r1 != r0) goto L_0x00c3
            X.I4S r0 = r2.A00
            if (r0 == 0) goto L_0x04ef
            X.0sP r0 = r0.A02
            goto L_0x007a
        L_0x00c3:
            r0 = 1
            if (r1 == r0) goto L_0x000f
            r0 = 0
            if (r1 == r0) goto L_0x000f
            r0 = 1488(0x5d0, float:2.085E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00d4:
            X.I4S r0 = r2.A00
            if (r0 == 0) goto L_0x04ef
            goto L_0x000f
        L_0x00da:
            X.5Tl r10 = (X.C285975Tl) r10
            X.5Tq r0 = r10.A01
            java.lang.String r1 = r0.A00
            java.lang.Object r3 = r9.A01
            X.Gc7 r3 = (X.C52754Gc7) r3
            X.5Tq r0 = r3.A03
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r0.A00
        L_0x00ea:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00f7
            X.HL2 r1 = X.HL2.None
            X.5Oz r0 = r3.A09
            r0.Epw(r1)
        L_0x00f7:
            long r1 = X.C285965Tk.A01
            X.5Oz r0 = r3.A0E
            X.G9w.A16(r0, r1)
            X.5Oz r0 = r3.A08
            X.G9w.A16(r0, r1)
            X.0sP r0 = r3.A05
            r0.invoke(r10)
            X.5Xe r2 = r3.A0J
            X.5Xd r2 = (X.C286625Xd) r2
            X.5Wo r1 = r2.A05
            if (r1 == 0) goto L_0x000f
            r0 = 0
            r1.CNl(r2, r0)
            goto L_0x000f
        L_0x0116:
            r0 = 0
            goto L_0x00ea
        L_0x0118:
            X.5dM r10 = (X.C289295dM) r10
            long r1 = r10.A00
            java.lang.Object r0 = r9.A01
            X.JQx r0 = (X.C59629JQx) r0
            r0.DmN(r1)
            goto L_0x000f
        L_0x0125:
            X.5S4 r10 = (X.AnonymousClass5S4) r10
            float[] r2 = r10.A00
            java.lang.Object r1 = r9.A01
            X.4ch r1 = (X.C268064ch) r1
            boolean r0 = r1.COx()
            if (r0 == 0) goto L_0x000f
            X.4ch r0 = X.C289425dZ.A02(r1)
            r0.FHn(r1, r2)
            goto L_0x000f
        L_0x013c:
            X.5dM r10 = (X.C289295dM) r10
            long r1 = r10.A00
            java.lang.Object r0 = r9.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.C51971G9r.A1N(r0, r1)
            goto L_0x000f
        L_0x014b:
            X.JNY r10 = (X.JNY) r10
            java.lang.Object r0 = r9.A01
            X.IE8 r0 = (X.IE8) r0
            X.IE8.A00(r0, r10)
            goto L_0x000f
        L_0x0156:
            X.GPU r10 = (X.GPU) r10
            java.lang.Object r3 = r9.A01
            X.JLM r3 = (X.JLM) r3
            long r6 = r10.A06
            X.IFe r3 = (X.C56857IFe) r3
            X.Gb5 r2 = r3.A00
            X.5Oz r0 = r2.A0J
            boolean r0 = X.C51971G9r.A1W(r0)
            r8 = 0
            if (r0 == 0) goto L_0x000f
            X.5Oz r1 = r2.A0K
            int r0 = X.C51973G9u.A05(r1)
            if (r0 == 0) goto L_0x000f
            X.Gc7 r0 = r2.A03
            if (r0 == 0) goto L_0x000f
            X.5Oz r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x000f
            X.5Tl r5 = X.C51966G9m.A0i(r1)
            X.JRo r4 = X.C56491HzN.A01
            r3.A00(r4, r5, r6, r8)
            goto L_0x0196
        L_0x0189:
            X.GPU r10 = (X.GPU) r10
            java.lang.Object r2 = r9.A01
            X.JQx r2 = (X.C59629JQx) r2
            long r0 = X.GPS.A00(r10)
            r2.DAT(r0)
        L_0x0196:
            r10.A01()
            goto L_0x000f
        L_0x019b:
            X.4cl r10 = (X.C268104cl) r10
            java.lang.Object r5 = r9.A01
            java.util.List r5 = (java.util.List) r5
            int r4 = r5.size()
            r3 = 0
        L_0x01a6:
            if (r3 >= r4) goto L_0x000f
            java.lang.Object r2 = r5.get(r3)
            X.4cY r2 = (X.C267974cY) r2
            r1 = 0
            r0 = 0
            r10.A05(r2, r0, r1, r1)
            int r3 = r3 + 1
            goto L_0x01a6
        L_0x01b6:
            android.view.Choreographer r1 = X.C56863IFk.A00
            java.lang.Object r0 = r9.A01
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r1.removeFrameCallback(r0)
            goto L_0x000f
        L_0x01c1:
            X.5Q4 r10 = (X.AnonymousClass5Q4) r10
            java.lang.Object r0 = r9.A01
            X.C51965G9l.A1W(r0, r10)
            r10.AQW()
            goto L_0x000f
        L_0x01cd:
            X.5RU r10 = (X.AnonymousClass5RU) r10
            java.lang.Object r2 = r9.A01
            androidx.compose.ui.draw.ShadowGraphicsLayerElement r2 = (androidx.compose.ui.draw.ShadowGraphicsLayerElement) r2
            float r0 = r2.A00
            float r0 = r10.F06(r0)
            r10.Ek7(r0)
            X.5S2 r0 = r2.A03
            r10.Ek8(r0)
            boolean r0 = r2.A04
            r10.ERg(r0)
            long r0 = r2.A01
            r10.EOc(r0)
            long r0 = r2.A02
            r10.Elm(r0)
            goto L_0x000f
        L_0x01f2:
            X.Gb8 r10 = (X.C52696Gb8) r10
            X.GRZ r2 = X.GRZ.ContinueTraversal
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r9.A01
            X.0rm r0 = (X.0rm) r0
            r0.A00 = r10
            return r2
        L_0x0201:
            java.lang.Object r0 = r9.A01
            X.5bk r0 = (X.C288335bk) r0
            X.0sP r0 = r0.A01
            if (r0 == 0) goto L_0x04f2
            r0.invoke(r10)
            goto L_0x000f
        L_0x020e:
            X.4cl r10 = (X.C268104cl) r10
            java.lang.Object r5 = r9.A01
            java.util.List r5 = (java.util.List) r5
            int r4 = r5.size()
            r3 = 0
        L_0x0219:
            if (r3 >= r4) goto L_0x000f
            java.lang.Object r2 = r5.get(r3)
            X.4cY r2 = (X.C267974cY) r2
            r1 = 0
            X.0sP r0 = X.AnonymousClass5SD.A01
            r10.A0B(r2, r0, r1, r1)
            int r3 = r3 + 1
            goto L_0x0219
        L_0x022a:
            X.5SK r10 = (X.AnonymousClass5SK) r10
            boolean r0 = r10.CZK()
            if (r0 == 0) goto L_0x000f
            X.5SM r1 = r10.Aal()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x023d
            r10.Cfl()
        L_0x023d:
            java.util.Map r0 = r1.A08
            java.lang.Object r4 = r9.A01
            X.5SM r4 = (X.AnonymousClass5SM) r4
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x0247:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0267
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getKey()
            X.5ia r2 = (X.C292215ia) r2
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass7TE.A0M(r0)
            X.4e4 r0 = r10.BHL()
            X.AnonymousClass5SM.A00(r2, r4, r0, r1)
            goto L_0x0247
        L_0x0267:
            X.4e4 r3 = r10.BHL()
        L_0x026b:
            X.4cg r3 = r3.A07
            X.0qQ.A0A(r3)
            X.5SK r0 = r4.A07
            X.4e4 r0 = r0.BHL()
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x000f
            java.util.Map r0 = r4.A03(r3)
            java.util.Iterator r2 = X.DbV.A16(r0)
        L_0x0284:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x026b
            java.lang.Object r1 = r2.next()
            X.5ia r1 = (X.C292215ia) r1
            int r0 = r4.A01(r1, r3)
            X.AnonymousClass5SM.A00(r1, r4, r3, r0)
            goto L_0x0284
        L_0x0298:
            java.lang.Object r1 = r9.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 0
            r1.invoke(r10, r0)
            goto L_0x000f
        L_0x02a2:
            if (r10 == 0) goto L_0x000f
            java.lang.Object r0 = r9.A01
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            r0.cancel()
            goto L_0x000f
        L_0x02ad:
            X.4cd r10 = (X.C268024cd) r10
            java.lang.Object r0 = r9.A01
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            r0.EUC(r10)
            goto L_0x000f
        L_0x02b8:
            X.4co r10 = (X.C268124co) r10
            boolean r0 = r10 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r0 == 0) goto L_0x02cd
            androidx.compose.ui.platform.AndroidComposeView r10 = (androidx.compose.ui.platform.AndroidComposeView) r10
            if (r10 == 0) goto L_0x02cd
            java.lang.Object r2 = r9.A01
            r1 = 6
            X.9M0 r0 = new X.9M0
            r0.<init>(r1, r2, r10)
            r10.EBs(r0)
        L_0x02cd:
            java.lang.Object r0 = r9.A01
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViewsInLayout()
            goto L_0x000f
        L_0x02d6:
            X.4ch r10 = (X.C268064ch) r10
            X.4ch r1 = r10.Bab()
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r9.A01
            androidx.compose.ui.window.PopupLayout r0 = (androidx.compose.ui.window.PopupLayout) r0
            r0.A0A(r1)
            goto L_0x000f
        L_0x02e8:
            X.5cr r10 = (X.C289005cr) r10
            long r2 = r10.A00
            java.lang.Object r1 = r9.A01
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.ui.window.PopupLayout) r1
            X.5cr r0 = new X.5cr
            r0.<init>(r2)
            r1.m66setPopupContentSizefhxjrPA(r0)
            r1.A09()
            goto L_0x000f
        L_0x02fd:
            X.4cl r10 = (X.C268104cl) r10
            java.lang.Object r4 = r9.A01
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            int r2 = X.C51970G9q.A0A(r4)
            if (r2 < 0) goto L_0x000f
            r1 = 0
        L_0x030b:
            java.lang.Object r0 = r4.get(r1)
            X.4cY r0 = (X.C267974cY) r0
            r10.A07(r0, r3, r3)
            if (r1 == r2) goto L_0x000f
            int r1 = r1 + 1
            goto L_0x030b
        L_0x0319:
            X.0sa r10 = (X.C62320sa) r10
            java.lang.Object r2 = r9.A01
            android.view.View r2 = (android.view.View) r2
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto L_0x033b
            android.os.Looper r1 = r0.getLooper()
        L_0x0329:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 == r0) goto L_0x0398
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto L_0x000f
            X.If6 r1 = new X.If6
            r1.<init>(r10)
            goto L_0x0364
        L_0x033b:
            r1 = 0
            goto L_0x0329
        L_0x033d:
            X.0sa r10 = (X.C62320sa) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0398
            java.lang.Object r1 = r9.A01
            X.IFl r1 = (X.C56864IFl) r1
            android.os.Handler r0 = r1.A00
            if (r0 != 0) goto L_0x035f
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r1.A00 = r0
        L_0x035f:
            X.If7 r1 = new X.If7
            r1.<init>(r10)
        L_0x0364:
            r0.post(r1)
            goto L_0x000f
        L_0x0369:
            X.JSc r10 = (X.C59658JSc) r10
            r1 = r10
            X.IGt r1 = (X.C56898IGt) r1
            android.view.inputmethod.InputConnection r0 = r1.A00
            if (r0 == 0) goto L_0x0378
            r0.closeConnection()
            r0 = 0
            r1.A00 = r0
        L_0x0378:
            java.lang.Object r5 = r9.A01
            X.Hnb r5 = (X.C55795Hnb) r5
            X.5Pl r4 = r5.A00
            int r3 = r4.A00
            if (r3 <= 0) goto L_0x0392
            r2 = 0
            java.lang.Object[] r1 = r4.A02
        L_0x0385:
            r0 = r1[r2]
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x039d
            if (r2 < 0) goto L_0x0392
            r4.A00(r2)
        L_0x0392:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x000f
            X.0sa r10 = r5.A04
        L_0x0398:
            r10.invoke()
            goto L_0x000f
        L_0x039d:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0385
            goto L_0x0392
        L_0x03a2:
            java.lang.Object r1 = r9.A01
            r0 = 6
            X.GP2 r2 = new X.GP2
            r2.<init>(r1, r0)
            return r2
        L_0x03ab:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = r9.A01
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.5Oz r1 = r0.A0C
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x04b7
            java.lang.Object r0 = r1.getValue()
            X.I1h r0 = (X.C56553I1h) r0
            X.0qQ.A0A(r0)
            X.62f r0 = r0.A02
            r10.add(r0)
            r0 = 1
            goto L_0x04cb
        L_0x03ca:
            float r4 = X.AnonymousClass7TE.A04(r10)
            java.lang.Object r0 = r9.A01
            X.I4L r0 = (X.I4L) r0
            X.5PZ r3 = r0.A03
            float r2 = r3.B6X()
            float r2 = r2 + r4
            X.5PZ r1 = r0.A02
            float r0 = r1.B6X()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f9
            float r4 = r1.B6X()
            float r0 = r3.B6X()
            float r4 = r4 - r0
        L_0x03ec:
            float r0 = r3.B6X()
            float r0 = r0 + r4
            r3.EWt(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r4)
            return r2
        L_0x03f9:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ec
            float r0 = r3.B6X()
            float r4 = -r0
            goto L_0x03ec
        L_0x0404:
            java.lang.Object r0 = r9.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            X.5dM r0 = (X.C289295dM) r0
            long r0 = r0.A00
            X.5dM r2 = X.C51965G9l.A0M(r0)
            return r2
        L_0x0413:
            long r3 = X.AnonymousClass7TE.A0R(r10)
            java.lang.Object r2 = r9.A01
            X.0sP r2 = (X.0sP) r2
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.invoke(r0)
            return r2
        L_0x0428:
            java.lang.Object r0 = r9.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.contains(r10)
            goto L_0x04cb
        L_0x0432:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = r9.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r10.retainAll(r0)
            goto L_0x04cb
        L_0x043e:
            X.5Qq r10 = (X.C285295Qq) r10
            X.4cD r0 = r10.A03
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0449
            X.GRZ r2 = X.GRZ.SkipSubtreeAndContinueTraversal
            return r2
        L_0x0449:
            X.5Qt r1 = r10.A01
            if (r1 == 0) goto L_0x0454
            java.lang.Object r0 = r9.A01
            X.HhZ r0 = (X.C55429HhZ) r0
            r1.DCE(r0)
        L_0x0454:
            r0 = 0
            r10.A01 = r0
            r10.A00 = r0
            X.GRZ r2 = X.GRZ.ContinueTraversal
            return r2
        L_0x045c:
            X.Gb8 r10 = (X.C52696Gb8) r10
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x046c
            java.lang.Object r1 = r9.A01
            X.0r1 r1 = (X.0r1) r1
            r0 = 0
            r1.A00 = r0
            X.GRZ r2 = X.GRZ.CancelTraversal
            return r2
        L_0x046c:
            X.GRZ r2 = X.GRZ.ContinueTraversal
            return r2
        L_0x046f:
            android.view.MotionEvent r10 = (android.view.MotionEvent) r10
            int r1 = r10.getActionMasked()
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            switch(r1) {
                case 0: goto L_0x0481;
                case 1: goto L_0x0481;
                case 2: goto L_0x0481;
                case 3: goto L_0x0481;
                case 4: goto L_0x0481;
                case 5: goto L_0x0481;
                case 6: goto L_0x0481;
                default: goto L_0x047c;
            }
        L_0x047c:
            boolean r0 = r0.dispatchGenericMotionEvent(r10)
            goto L_0x04cb
        L_0x0481:
            boolean r0 = r0.dispatchTouchEvent(r10)
            goto L_0x04cb
        L_0x0486:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r6 = r10.getKey()
            java.lang.Object r5 = r10.getValue()
            X.JQZ r5 = (X.JQZ) r5
            java.lang.Object r4 = r9.A01
            X.6IJ r4 = (X.AnonymousClass6IJ) r4
            X.5Pl r0 = r4.A06
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x04ad
            r2 = 0
            java.lang.Object[] r1 = r0.A02
        L_0x049f:
            r0 = r1[r2]
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x04b2
            if (r2 < 0) goto L_0x04ad
            int r0 = r4.A01
            if (r2 < r0) goto L_0x04b7
        L_0x04ad:
            r5.dispose()
            r0 = 1
            goto L_0x04cb
        L_0x04b2:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x049f
            goto L_0x04ad
        L_0x04b7:
            r0 = 0
            goto L_0x04cb
        L_0x04b9:
            X.4e0 r10 = (X.C268794e0) r10
            java.lang.Object r0 = r9.A01
            X.I1T r0 = (X.I1T) r0
            int r0 = r0.A00
            java.lang.Boolean r0 = X.C56664I6t.A00(r10, r0)
            if (r0 == 0) goto L_0x04e0
            boolean r0 = r0.booleanValue()
        L_0x04cb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x04d0:
            X.Gb8 r10 = (X.C52696Gb8) r10
            java.lang.Object r1 = r9.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r0 = r1.A00
            if (r0 != 0) goto L_0x04e0
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x04e0
            r1.A00 = r10
        L_0x04e0:
            r0 = 1
            goto L_0x04cb
        L_0x04e2:
            java.lang.Object r1 = r9.A01
            X.IFl r1 = (X.C56864IFl) r1
            r0 = 1
            r1.A01 = r0
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x04ec:
            java.lang.String r0 = "focusManager"
            goto L_0x04f4
        L_0x04ef:
            java.lang.String r0 = "keyboardActions"
            goto L_0x04f4
        L_0x04f2:
            java.lang.String r0 = "onTouchEvent"
        L_0x04f4:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6M.invoke(java.lang.Object):java.lang.Object");
    }
}
