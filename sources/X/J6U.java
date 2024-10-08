package X;

public final class J6U extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6U(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static J6U A00(C286575Wy r1, Object obj, Object obj2, int i) {
        J6U j6u = new J6U(i, obj, obj2);
        r1.FLL(j6u);
        return j6u;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.GRI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.I4f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.I4f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.I4O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: X.GRI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: X.GRI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: X.GRI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: X.GRI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v100, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: X.I0h} */
    /* JADX WARNING: type inference failed for: r2v18, types: [X.JNY, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0475, code lost:
        r0 = (X.C284945Oz) r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x047e, code lost:
        r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0502, code lost:
        r1 = (X.0sP) r3.A01;
        r0 = java.lang.Float.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x050a, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05c7, code lost:
        r0.AQm((X.C304786Ff) r3.A01, (X.C288195bW) null, r2, X.C289635dw.A00, 1.0f, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if (X.C51971G9r.A1W(r7.A0I) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07a4, code lost:
        return java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07f6, code lost:
        return new X.C52355GOz(r1, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0837, code lost:
        return new X.C52355GOz(r1, r2, (java.lang.Object) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08b5, code lost:
        return java.lang.Float.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
        if (r2.hasMimeType("text/*") != true) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08f2, code lost:
        return X.I74.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r27) {
        /*
            r26 = this;
            r3 = r26
            r0 = r27
            int r1 = r3.A00
            switch(r1) {
                case 0: goto L_0x061e;
                case 1: goto L_0x05d9;
                case 2: goto L_0x08c4;
                case 3: goto L_0x0892;
                case 4: goto L_0x0866;
                case 5: goto L_0x0838;
                case 6: goto L_0x0820;
                case 7: goto L_0x0804;
                case 8: goto L_0x07f7;
                case 9: goto L_0x07ec;
                case 10: goto L_0x07df;
                case 11: goto L_0x05bc;
                case 12: goto L_0x05b2;
                case 13: goto L_0x08f3;
                case 14: goto L_0x05a5;
                case 15: goto L_0x0556;
                case 16: goto L_0x052e;
                case 17: goto L_0x050f;
                case 18: goto L_0x04f4;
                case 19: goto L_0x04e6;
                case 20: goto L_0x04e6;
                case 21: goto L_0x04d4;
                case 22: goto L_0x04c2;
                case 23: goto L_0x07b7;
                case 24: goto L_0x0483;
                case 25: goto L_0x0395;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x02d3;
                case 29: goto L_0x0256;
                case 30: goto L_0x022a;
                case 31: goto L_0x021b;
                case 32: goto L_0x0211;
                case 33: goto L_0x01f3;
                case 34: goto L_0x0774;
                case 35: goto L_0x0745;
                case 36: goto L_0x01b8;
                case 37: goto L_0x06a1;
                case 38: goto L_0x069a;
                case 39: goto L_0x068c;
                case 40: goto L_0x0163;
                case 41: goto L_0x0668;
                case 42: goto L_0x012a;
                case 43: goto L_0x0086;
                case 44: goto L_0x005d;
                case 45: goto L_0x0647;
                case 46: goto L_0x004d;
                case 47: goto L_0x0022;
                case 48: goto L_0x0634;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.5b4 r0 = (X.AnonymousClass5b4) r0
            java.lang.Object r1 = r3.A01
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r1
            float r0 = X.C51975G9x.A00(r0)
            r1.A05(r0)
            java.lang.Object r0 = r3.A02
            X.I4b r0 = (X.C56602I4b) r0
            X.0sa r0 = r0.A0D
            r0.invoke()
        L_0x001f:
            X.0gF r0 = X.C60340gF.A00
        L_0x0021:
            return r0
        L_0x0022:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r5 = r3.A02
            androidx.compose.runtime.Recomposer r5 = (androidx.compose.runtime.Recomposer) r5
            X.05G r1 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r4 = r5.A0D
            java.lang.Object r2 = r3.A01
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            monitor-enter(r4)
            r1 = 0
            if (r2 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x0042
            goto L_0x0039
        L_0x0037:
            r2 = r1
            goto L_0x0042
        L_0x0039:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x08fa }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0042
            X.2Og.A01(r2, r0)     // Catch:{ all -> 0x08fa }
        L_0x0042:
            r5.A02 = r2     // Catch:{ all -> 0x08fa }
            X.05G r1 = r5.A0K     // Catch:{ all -> 0x08fa }
            X.4e5 r0 = X.AnonymousClass4e5.ShutDown     // Catch:{ all -> 0x08fa }
            r1.Epw(r0)     // Catch:{ all -> 0x08fa }
            monitor-exit(r4)
            goto L_0x001f
        L_0x004d:
            java.lang.Object r0 = r3.A02
            X.5PU r0 = (X.AnonymousClass5PU) r0
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r3.A01
            monitor-enter(r2)
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x08fd }
            r0.remove(r1)     // Catch:{ all -> 0x08fd }
            monitor-exit(r2)
            goto L_0x001f
        L_0x005d:
            X.Hs1 r0 = (X.C56052Hs1) r0
            long r5 = r0.A00
            java.lang.Object r4 = r3.A02
            X.5Oz r4 = (X.C284945Oz) r4
            java.lang.Object r2 = r3.A01
            X.4cd r2 = (X.C268024cd) r2
            float r0 = X.C51971G9r.A01(r5)
            int r1 = r2.EJS(r0)
            float r0 = X.C51972G9s.A00(r5)
            int r0 = r2.EJS(r0)
            long r1 = X.C289155d7.A00(r1, r0)
            X.5cr r0 = new X.5cr
            r0.<init>(r1)
            r4.Epw(r0)
            goto L_0x001f
        L_0x0086:
            X.HrQ r0 = (X.C56018HrQ) r0
            java.lang.Object r7 = r3.A02
            X.Gb5 r7 = (X.C52693Gb5) r7
            X.5Oz r10 = r7.A0K
            long r1 = X.C51968G9o.A0G(r10)
            boolean r1 = X.C285965Tk.A03(r1)
            r11 = 1
            r5 = r1 ^ 1
            java.lang.Object r8 = r3.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r5 == 0) goto L_0x00a8
            X.5Oz r1 = r7.A0I
            boolean r1 = X.C51971G9r.A1W(r1)
            r4 = 1
            if (r1 != 0) goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            r9 = 9
            X.JFw r3 = new X.JFw
            r3.<init>(r2, r9)
            r2 = 12
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r7)
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            r0.A01(r6, r1, r3, r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r4 = X.AnonymousClass7TF.A1P(r5)
            X.JFw r3 = new X.JFw
            r3.<init>(r1, r9)
            r2 = 13
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r7)
            r0.A01(r6, r1, r3, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            X.5Oz r1 = r7.A0I
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 == 0) goto L_0x00f2
            X.5TC r1 = r7.A06
            if (r1 == 0) goto L_0x00f2
            X.5TB r1 = (X.AnonymousClass5TB) r1
            android.content.ClipboardManager r1 = r1.A00
            android.content.ClipDescription r2 = r1.getPrimaryClipDescription()
            if (r2 == 0) goto L_0x00f2
            java.lang.String r1 = "text/*"
            boolean r1 = r2.hasMimeType(r1)
            r4 = 1
            if (r1 == r11) goto L_0x00f3
        L_0x00f2:
            r4 = 0
        L_0x00f3:
            X.JFw r3 = new X.JFw
            r3.<init>(r5, r9)
            r2 = 14
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r7)
            r0.A01(r6, r1, r3, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            long r3 = X.C51968G9o.A0G(r10)
            int r2 = X.C285965Tk.A00(r3)
            int r1 = X.C285965Tk.A01(r3)
            int r2 = r2 - r1
            int r1 = X.C51973G9u.A05(r10)
            r4 = 0
            if (r2 == r1) goto L_0x0119
            r4 = 1
        L_0x0119:
            X.JFw r3 = new X.JFw
            r3.<init>(r5, r9)
            r2 = 15
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r7)
            r0.A01(r6, r1, r3, r4)
            goto L_0x001f
        L_0x012a:
            X.GPU r0 = (X.GPU) r0
            java.lang.Object r4 = r3.A01
            X.JLM r4 = (X.JLM) r4
            long r7 = r0.A06
            java.lang.Object r5 = r3.A02
            X.JRo r5 = (X.C59646JRo) r5
            X.IFe r4 = (X.C56857IFe) r4
            X.Gb5 r3 = r4.A00
            X.5Oz r1 = r3.A0J
            boolean r1 = X.C51971G9r.A1W(r1)
            r9 = 0
            if (r1 == 0) goto L_0x001f
            X.5Oz r2 = r3.A0K
            int r1 = X.C51973G9u.A05(r2)
            if (r1 == 0) goto L_0x001f
            X.Gc7 r1 = r3.A03
            if (r1 == 0) goto L_0x001f
            X.5Oz r1 = r1.A0C
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x001f
            X.5Tl r6 = X.C51966G9m.A0i(r2)
            r4.A00(r5, r6, r7, r9)
            r0.A01()
            goto L_0x001f
        L_0x0163:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r9 = r3.A01
            java.util.List r9 = (java.util.List) r9
            r7 = 0
            if (r9 == 0) goto L_0x018a
            int r8 = r9.size()
            r6 = 0
        L_0x0171:
            if (r6 >= r8) goto L_0x018a
            java.lang.Object r1 = r9.get(r6)
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r2 = r1.A00
            X.4cY r2 = (X.C267974cY) r2
            java.lang.Object r1 = r1.A01
            X.5d8 r1 = (X.C289165d8) r1
            long r4 = r1.A00
            r1 = 0
            r0.A06(r2, r1, r4)
            int r6 = r6 + 1
            goto L_0x0171
        L_0x018a:
            java.lang.Object r6 = r3.A02
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x001f
            int r5 = r6.size()
        L_0x0194:
            if (r7 >= r5) goto L_0x001f
            java.lang.Object r1 = r6.get(r7)
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r4 = r1.A00
            X.4cY r4 = (X.C267974cY) r4
            java.lang.Object r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x01b5
            java.lang.Object r1 = r1.invoke()
            X.5d8 r1 = (X.C289165d8) r1
            long r2 = r1.A00
        L_0x01ae:
            r1 = 0
            r0.A06(r4, r1, r2)
            int r7 = r7 + 1
            goto L_0x0194
        L_0x01b5:
            r2 = 0
            goto L_0x01ae
        L_0x01b8:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A02
            X.IGI r1 = (X.IGI) r1
            X.0sa r1 = r1.A00
            java.util.ArrayList r7 = X.C291525hS.A00(r2, r1)
            if (r7 == 0) goto L_0x001f
            r6 = 0
            int r5 = r7.size()
        L_0x01cf:
            if (r6 >= r5) goto L_0x001f
            java.lang.Object r1 = r7.get(r6)
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r4 = r1.A00
            X.4cY r4 = (X.C267974cY) r4
            java.lang.Object r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x01f0
            java.lang.Object r1 = r1.invoke()
            X.5d8 r1 = (X.C289165d8) r1
            long r2 = r1.A00
        L_0x01e9:
            r1 = 0
            r0.A06(r4, r1, r2)
            int r6 = r6 + 1
            goto L_0x01cf
        L_0x01f0:
            r2 = 0
            goto L_0x01e9
        L_0x01f3:
            X.5dM r0 = (X.C289295dM) r0
            long r4 = r0.A00
            java.lang.Object r0 = r3.A01
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            X.62f r0 = (X.C3022462f) r0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            X.62d r0 = r0.A03
            int r0 = r0.A08(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x050a
        L_0x0211:
            java.lang.Object r1 = r3.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r1.Epw(r0)
            java.lang.Object r1 = r3.A02
            goto L_0x0225
        L_0x021b:
            java.lang.Object r1 = r3.A02
            boolean r1 = X.0qQ.A0K(r1, r0)
            if (r1 != 0) goto L_0x001f
            java.lang.Object r1 = r3.A01
        L_0x0225:
            X.C51965G9l.A1W(r1, r0)
            goto L_0x001f
        L_0x022a:
            float r1 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r0 = r3.A02
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r0
            X.GZF r2 = r0.A00
            int r0 = r2.A05()
            if (r0 == 0) goto L_0x0254
            int r0 = r2.A05()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0240:
            int r1 = X.AnonymousClass1GB.A01(r1)
            int r0 = r2.A03()
            int r1 = r1 + r0
            int r1 = X.GZF.A00(r2, r1)
            X.5dh r0 = r2.A0O
            r0.EZz(r1)
            goto L_0x001f
        L_0x0254:
            r1 = 0
            goto L_0x0240
        L_0x0256:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r11 = r3.A02
            java.util.List r11 = (java.util.List) r11
            int r13 = r11.size()
            r10 = 0
        L_0x0261:
            if (r10 >= r13) goto L_0x0475
            java.lang.Object r9 = r11.get(r10)
            X.GaE r9 = (X.C52640GaE) r9
            int r2 = r9.A00
            r8 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r1) goto L_0x0900
            java.util.List r12 = r9.A07
            int r7 = r12.size()
        L_0x0276:
            if (r8 >= r7) goto L_0x02d0
            java.lang.Object r6 = r12.get(r8)
            X.4cY r6 = (X.C267974cY) r6
            int[] r4 = r9.A0A
            int r1 = r8 * 2
            r2 = r4[r1]
            int r1 = r1 + 1
            r1 = r4[r1]
            long r4 = X.AnonymousClass5TW.A00(r2, r1)
            boolean r1 = r9.A09
            if (r1 == 0) goto L_0x02a6
            boolean r1 = r9.A08
            int r14 = X.C51965G9l.A04(r4)
            if (r1 == 0) goto L_0x02c4
            int r1 = X.C51968G9o.A02(r4)
            int r2 = r9.A00
            int r2 = r2 - r1
            int r1 = r6.A00
            int r2 = r2 - r1
        L_0x02a2:
            long r4 = X.AnonymousClass5TW.A00(r14, r2)
        L_0x02a6:
            long r1 = r9.A05
            long r1 = X.C289165d8.A01(r4, r1)
            boolean r4 = r9.A08
            if (r4 == 0) goto L_0x02be
            r17 = 0
            X.0sP r16 = X.AnonymousClass5SD.A01
            r14 = r0
            r15 = r6
            r18 = r1
            r14.A0A(r15, r16, r17, r18)
        L_0x02bb:
            int r8 = r8 + 1
            goto L_0x0276
        L_0x02be:
            X.0sP r4 = X.AnonymousClass5SD.A01
            r0.A0C(r6, r4, r1)
            goto L_0x02bb
        L_0x02c4:
            int r2 = r9.A00
            int r2 = r2 - r14
            int r1 = r6.A01
            int r14 = r2 - r1
            int r2 = X.C51968G9o.A02(r4)
            goto L_0x02a2
        L_0x02d0:
            int r10 = r10 + 1
            goto L_0x0261
        L_0x02d3:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r15 = r3.A01
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r10 = r3.A02
            X.HrL r10 = (X.C56013HrL) r10
            int r17 = r15.size()
            r9 = 0
        L_0x02e2:
            r1 = r17
            if (r9 >= r1) goto L_0x047a
            java.lang.Object r8 = r15.get(r9)
            X.IFH r8 = (X.IFH) r8
            int r2 = r8.A00
            r7 = 0
            r1 = -1
            if (r2 == r1) goto L_0x090b
            java.util.List r1 = r8.A0E
            r19 = r1
            int r16 = r19.size()
        L_0x02fa:
            r1 = r16
            if (r7 >= r1) goto L_0x0391
            r1 = r19
            java.lang.Object r6 = r1.get(r7)
            X.4cY r6 = (X.C267974cY) r6
            int r11 = r8.A02
            boolean r12 = r8.A0F
            if (r12 == 0) goto L_0x038d
            int r1 = r6.A00
        L_0x030e:
            int r11 = r11 - r1
            int r1 = r8.A01
            r18 = r1
            long r1 = r8.A03
            r4 = r1
            X.6H4 r13 = r8.A0C
            java.lang.Object r3 = r8.A0D
            X.I4b r3 = r13.A05(r3, r7)
            if (r3 == 0) goto L_0x038b
            X.5Oz r13 = r3.A0C
            java.lang.Object r13 = r13.getValue()
            X.5d8 r13 = (X.C289165d8) r13
            long r13 = r13.A00
            long r1 = X.C289165d8.A01(r1, r13)
            long r4 = X.C51975G9x.A07(r12, r4)
            int r13 = (int) r4
            if (r13 > r11) goto L_0x033c
            long r4 = X.C51975G9x.A07(r12, r1)
            int r14 = (int) r4
            if (r14 <= r11) goto L_0x0349
        L_0x033c:
            r4 = r18
            if (r13 < r4) goto L_0x034c
            long r4 = X.C51975G9x.A07(r12, r1)
            int r11 = (int) r4
            r4 = r18
            if (r11 < r4) goto L_0x034c
        L_0x0349:
            r3.A02()
        L_0x034c:
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = r3.A04
            r4 = r1
        L_0x034f:
            boolean r13 = r10.A0H
            if (r13 == 0) goto L_0x0367
            int r4 = X.C51965G9l.A04(r1)
            if (r12 == 0) goto L_0x037f
            int r1 = X.C51968G9o.A02(r1)
            int r2 = r8.A00
            int r2 = r2 - r1
            int r1 = r6.A00
            int r2 = r2 - r1
        L_0x0363:
            long r4 = X.AnonymousClass5TW.A00(r4, r2)
        L_0x0367:
            long r1 = r10.A06
            long r1 = X.C289165d8.A01(r4, r1)
            if (r3 == 0) goto L_0x0371
            r3.A00 = r1
        L_0x0371:
            if (r11 == 0) goto L_0x0379
            r0.A04(r11, r6, r1)
        L_0x0376:
            int r7 = r7 + 1
            goto L_0x02fa
        L_0x0379:
            X.0sP r3 = X.AnonymousClass5SD.A01
            r0.A0C(r6, r3, r1)
            goto L_0x0376
        L_0x037f:
            int r5 = r8.A00
            int r5 = r5 - r4
            int r4 = r6.A01
            int r4 = r5 - r4
            int r2 = X.C51968G9o.A02(r1)
            goto L_0x0363
        L_0x038b:
            r11 = 0
            goto L_0x034f
        L_0x038d:
            int r1 = r6.A01
            goto L_0x030e
        L_0x0391:
            int r9 = r9 + 1
            goto L_0x02e2
        L_0x0395:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r1 = r3.A02
            r18 = r1
            r1 = r18
            java.util.List r1 = (java.util.List) r1
            r18 = r1
            int r17 = r18.size()
            r14 = 0
        L_0x03a6:
            r1 = r17
            if (r14 >= r1) goto L_0x0475
            r1 = r18
            java.lang.Object r8 = r1.get(r14)
            X.IFG r8 = (X.IFG) r8
            int r2 = r8.A01
            r7 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r1) goto L_0x0916
            java.util.List r1 = r8.A0F
            r25 = r1
            int r16 = r25.size()
        L_0x03c1:
            r1 = r16
            if (r7 >= r1) goto L_0x0471
            r1 = r25
            java.lang.Object r6 = r1.get(r7)
            X.4cY r6 = (X.C267974cY) r6
            int r11 = r8.A03
            boolean r10 = r8.A0G
            if (r10 == 0) goto L_0x046d
            int r1 = r6.A00
        L_0x03d5:
            int r11 = r11 - r1
            int r15 = r8.A02
            long r4 = r8.A05
            r1 = r4
            X.6H4 r12 = r8.A0D
            java.lang.Object r9 = r8.A0E
            X.I4b r9 = r12.A05(r9, r7)
            if (r9 == 0) goto L_0x046b
            X.5Oz r12 = r9.A0C
            java.lang.Object r12 = r12.getValue()
            X.5d8 r12 = (X.C289165d8) r12
            long r12 = r12.A00
            long r4 = X.C289165d8.A01(r4, r12)
            long r1 = X.C51975G9x.A07(r10, r1)
            int r12 = (int) r1
            if (r12 > r11) goto L_0x0401
            long r1 = X.C51975G9x.A07(r10, r4)
            int r13 = (int) r1
            if (r13 <= r11) goto L_0x040a
        L_0x0401:
            if (r12 < r15) goto L_0x040d
            long r1 = X.C51975G9x.A07(r10, r4)
            int r11 = (int) r1
            if (r11 < r15) goto L_0x040d
        L_0x040a:
            r9.A02()
        L_0x040d:
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = r9.A04
            r1 = r4
        L_0x0410:
            boolean r12 = r8.A0H
            if (r12 == 0) goto L_0x0428
            int r12 = X.C51965G9l.A04(r4)
            if (r10 == 0) goto L_0x045f
            int r1 = X.C51968G9o.A02(r4)
            int r2 = r8.A01
            int r2 = r2 - r1
            int r1 = r6.A00
            int r2 = r2 - r1
        L_0x0424:
            long r1 = X.AnonymousClass5TW.A00(r12, r2)
        L_0x0428:
            long r4 = r8.A0C
            long r1 = X.C289165d8.A01(r1, r4)
            if (r9 == 0) goto L_0x0432
            r9.A00 = r1
        L_0x0432:
            if (r10 == 0) goto L_0x0453
            r22 = 0
            if (r11 == 0) goto L_0x0447
            r19 = r0
            r20 = r11
            r21 = r6
            r23 = r1
            r19.A03(r20, r21, r22, r23)
        L_0x0443:
            int r7 = r7 + 1
            goto L_0x03c1
        L_0x0447:
            X.0sP r21 = X.AnonymousClass5SD.A01
            r19 = r0
            r20 = r6
            r23 = r1
            r19.A0A(r20, r21, r22, r23)
            goto L_0x0443
        L_0x0453:
            if (r11 == 0) goto L_0x0459
            r0.A04(r11, r6, r1)
            goto L_0x0443
        L_0x0459:
            X.0sP r4 = X.AnonymousClass5SD.A01
            r0.A0C(r6, r4, r1)
            goto L_0x0443
        L_0x045f:
            int r2 = r8.A01
            int r2 = r2 - r12
            int r1 = r6.A01
            int r12 = r2 - r1
            int r2 = X.C51968G9o.A02(r4)
            goto L_0x0424
        L_0x046b:
            r11 = 0
            goto L_0x0410
        L_0x046d:
            int r1 = r6.A01
            goto L_0x03d5
        L_0x0471:
            int r14 = r14 + 1
            goto L_0x03a6
        L_0x0475:
            java.lang.Object r0 = r3.A01
            X.5Oz r0 = (X.C284945Oz) r0
            goto L_0x047e
        L_0x047a:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = r10.A0C
            X.5Oz r0 = r0.A0I
        L_0x047e:
            r0.getValue()
            goto L_0x001f
        L_0x0483:
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A02
            X.I1v r0 = (X.C56566I1v) r0
            X.Hjy r0 = r0.A03(r1)
            int r11 = r0.A00
            java.util.List r10 = r0.A01
            java.util.ArrayList r0 = X.C51970G9q.A0m(r10)
            java.lang.Object r9 = r3.A01
            X.Hro r9 = (X.C56041Hro) r9
            int r8 = r10.size()
            r7 = 0
            r6 = 0
        L_0x04a1:
            if (r7 >= r8) goto L_0x0021
            java.lang.Object r1 = r10.get(r7)
            X.Hrx r1 = (X.C56048Hrx) r1
            long r1 = r1.A00
            int r5 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            long r2 = r9.A00(r6, r5)
            androidx.compose.ui.unit.Constraints r1 = new androidx.compose.ui.unit.Constraints
            r1.<init>(r2)
            X.AnonymousClass7TF.A1I(r4, r1, r0)
            int r11 = r11 + 1
            int r6 = r6 + r5
            int r7 = r7 + 1
            goto L_0x04a1
        L_0x04c2:
            X.4cY r0 = (X.C267974cY) r0
            if (r0 == 0) goto L_0x04cc
            r0.A0H()
            r0.A0G()
        L_0x04cc:
            java.lang.Object r1 = r3.A02
            X.Hti r1 = (X.C56155Hti) r1
            r1.A02 = r0
            goto L_0x001f
        L_0x04d4:
            X.4cY r0 = (X.C267974cY) r0
            if (r0 == 0) goto L_0x04de
            r0.A0H()
            r0.A0G()
        L_0x04de:
            java.lang.Object r1 = r3.A02
            X.Hti r1 = (X.C56155Hti) r1
            r1.A03 = r0
            goto L_0x001f
        L_0x04e6:
            float r1 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r0 = r3.A02
            X.0rh r0 = (X.0rh) r0
            float r2 = r0.A00
            float r2 = r2 - r1
            r0.A00 = r2
            goto L_0x0502
        L_0x04f4:
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            java.lang.Object r1 = r3.A02
            androidx.compose.foundation.gestures.UpdatableAnimationState r1 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r1
            float r2 = r1.A00
            r0 = 0
            r1.A00 = r0
        L_0x0502:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
        L_0x050a:
            r1.invoke(r0)
            goto L_0x001f
        L_0x050f:
            X.GQP r0 = (X.GQP) r0
            java.lang.Object r6 = r3.A01
            X.6IX r6 = (X.AnonymousClass6IX) r6
            java.lang.Object r1 = r3.A02
            androidx.compose.foundation.gestures.ScrollingLogic r1 = (androidx.compose.foundation.gestures.ScrollingLogic) r1
            long r4 = r0.A00
            X.6Gj r3 = r1.A03
            X.6Gj r2 = X.AnonymousClass6Gj.Horizontal
            r1 = 0
            r0 = 2
            if (r3 != r2) goto L_0x0524
            r0 = 1
        L_0x0524:
            long r1 = X.C289295dM.A03(r1, r0, r4)
            r0 = 1
            r6.EKY(r1, r0)
            goto L_0x001f
        L_0x052e:
            X.GQP r0 = (X.GQP) r0
            java.lang.Object r5 = r3.A01
            X.JNO r5 = (X.JNO) r5
            java.lang.Object r4 = r3.A02
            X.GeO r4 = (X.C52888GeO) r4
            long r1 = r0.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            long r2 = X.C289295dM.A05(r0, r1)
            X.6Gj r1 = r4.A01
            X.0sK r0 = X.GQV.A00
            X.6Gj r0 = X.AnonymousClass6Gj.Vertical
            if (r1 != r0) goto L_0x0551
            float r0 = X.C289295dM.A02(r2)
        L_0x054c:
            r5.AQD(r0)
            goto L_0x001f
        L_0x0551:
            float r0 = X.C289295dM.A01(r2)
            goto L_0x054c
        L_0x0556:
            X.GPU r0 = (X.GPU) r0
            java.lang.Object r4 = r3.A01
            X.GQN r4 = (X.GQN) r4
            X.GQL.A00(r0, r4)
            java.lang.Object r2 = r3.A02
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            X.4bM r0 = X.AnonymousClass5YA.A0D
            java.lang.Object r0 = X.C288795cU.A00(r0, r2)
            X.5RG r0 = (X.AnonymousClass5RG) r0
            float r0 = r0.BPY()
            long r0 = X.GQF.A00(r0, r0)
            long r5 = r4.A00(r0)
            r4.A01()
            X.3ju r4 = r2.A02
            if (r4 == 0) goto L_0x001f
            X.0sK r0 = X.GQV.A00
            float r3 = X.C51971G9r.A01(r5)
            boolean r0 = java.lang.Float.isNaN(r3)
            r2 = 0
            if (r0 == 0) goto L_0x058c
            r3 = 0
        L_0x058c:
            float r1 = X.C51972G9s.A00(r5)
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0597
            r2 = r1
        L_0x0597:
            long r1 = X.GQF.A00(r3, r2)
            X.GQQ r0 = new X.GQQ
            r0.<init>(r1)
            r4.FIG(r0)
            goto L_0x001f
        L_0x05a5:
            java.lang.Object r0 = r3.A02
            X.6Ib r0 = (X.C305456Ib) r0
            X.5Pl r1 = r0.A00
            java.lang.Object r0 = r3.A01
            r1.A0B(r0)
            goto L_0x001f
        L_0x05b2:
            X.5Q4 r0 = (X.AnonymousClass5Q4) r0
            r0.AQW()
            java.lang.Object r2 = r3.A02
            X.60d r2 = (X.C3018060d) r2
            goto L_0x05c7
        L_0x05bc:
            X.5Q4 r0 = (X.AnonymousClass5Q4) r0
            r0.AQW()
            java.lang.Object r1 = r3.A02
            X.5dQ r1 = (X.C289335dQ) r1
            X.60d r2 = r1.A00
        L_0x05c7:
            java.lang.Object r1 = r3.A01
            X.6Ff r1 = (X.C304786Ff) r1
            r5 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            X.5dw r7 = X.C289635dw.A00
            r9 = 3
            r3 = r0
            r4 = r1
            r6 = r2
            r3.AQm(r4, r5, r6, r7, r8, r9)
            goto L_0x001f
        L_0x05d9:
            X.JQ8 r0 = (X.JQ8) r0
            java.lang.Object r1 = r3.A01
            X.IES r1 = (X.IES) r1
            X.0vr r2 = r1.A02
            java.lang.Object r1 = r0.BH7()
            long r6 = X.C51976G9y.A02(r2, r1)
            java.lang.Object r0 = r0.C4Q()
            long r4 = X.C51976G9y.A02(r2, r0)
            java.lang.Object r0 = r3.A02
            X.IGE r0 = (X.IGE) r0
            X.4gU r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.JL3 r0 = (X.JL3) r0
            if (r0 == 0) goto L_0x0613
            X.IEO r0 = (X.IEO) r0
            X.0sL r2 = r0.A00
            X.5cr r1 = new X.5cr
            r1.<init>(r6)
            X.5cr r0 = new X.5cr
            r0.<init>(r4)
            java.lang.Object r0 = r2.invoke(r1, r0)
            if (r0 != 0) goto L_0x0021
        L_0x0613:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 1153138688(0x44bb8000, float:1500.0)
            r0 = 0
            X.5b7 r0 = X.C51965G9l.A0F(r0, r2, r1)
            return r0
        L_0x061e:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r4 = r3.A01
            X.4cY r4 = (X.C267974cY) r4
            java.lang.Object r1 = r3.A02
            X.Hzp r1 = (X.C56518Hzp) r1
            X.5PZ r1 = r1.A03
            float r2 = r1.B6X()
            r1 = 0
            r0.A05(r4, r2, r1, r1)
            goto L_0x001f
        L_0x0634:
            X.4cl r0 = (X.C268104cl) r0
            java.lang.Object r4 = r3.A01
            X.4cY r4 = (X.C267974cY) r4
            java.lang.Object r1 = r3.A02
            X.Gej r1 = (X.C52909Gej) r1
            float r2 = r1.A00
            r1 = 0
            r0.A05(r4, r2, r1, r1)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0647:
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            r1 = 18
            X.J6M r5 = X.J6M.A00(r0, r1)
            java.lang.Object r4 = r3.A01
            java.lang.Object r1 = r3.A02
            r0 = 44
            X.J6U r2 = new X.J6U
            r2.<init>(r0, r4, r1)
            X.JS1 r1 = X.I3Q.A00()
            androidx.compose.foundation.MagnifierElement r0 = new androidx.compose.foundation.MagnifierElement
            r0.<init>(r1, r5, r2)
            androidx.compose.ui.Modifier r0 = r6.Ezh(r0)
            return r0
        L_0x0668:
            X.5gs r0 = (X.C291265gs) r0
            java.lang.Object r4 = r3.A01
            X.0rk r4 = (X.0rk) r4
            int r2 = r4.A00
            r1 = -1
            if (r2 != r1) goto L_0x067b
            X.2HY r1 = r0.A01()
            int r1 = r1.A00
            r4.A00 = r1
        L_0x067b:
            java.lang.Object r1 = r3.A02
            X.0rk r1 = (X.0rk) r1
            X.2HY r0 = r0.A01()
            int r0 = r0.A01
            int r0 = r0 + 1
            r1.A00 = r0
            java.lang.String r0 = ""
            return r0
        L_0x068c:
            java.lang.Object r4 = r3.A02
            X.I0h r4 = (X.I0h) r4
            X.6HD r0 = r4.A02
            java.lang.Object r2 = r3.A01
            r0.add(r2)
            r1 = 7
            goto L_0x07f1
        L_0x069a:
            java.lang.Object r4 = r3.A02
            java.lang.Object r2 = r3.A01
            r1 = 6
            goto L_0x07f1
        L_0x06a1:
            X.Hry r0 = (X.C56049Hry) r0
            android.view.KeyEvent r5 = r0.A00
            android.view.InputDevice r1 = r5.getDevice()
            r6 = 0
            if (r1 == 0) goto L_0x07a0
            r0 = 513(0x201, float:7.19E-43)
            boolean r0 = r1.supportsSource(r0)
            if (r0 == 0) goto L_0x07a0
            boolean r0 = r1.isVirtual()
            if (r0 != 0) goto L_0x07a0
            int r1 = X.HRR.A00(r5)
            r0 = 2
            if (r1 != r0) goto L_0x07a0
            int r1 = r5.getSource()
            r0 = 257(0x101, float:3.6E-43)
            if (r1 == r0) goto L_0x07a0
            r4 = 19
            int r0 = r5.getKeyCode()
            long r1 = (long) r0
            r7 = 32
            long r1 = r1 << r7
            long r1 = r1 >> r7
            int r0 = (int) r1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            if (r0 == 0) goto L_0x06e6
            java.lang.Object r1 = r3.A01
            X.5Qa r1 = (X.C285165Qa) r1
            r0 = 5
        L_0x06e0:
            boolean r6 = r1.Coe(r0)
            goto L_0x07a0
        L_0x06e6:
            r4 = 20
            int r0 = r5.getKeyCode()
            long r1 = (long) r0
            long r1 = r1 << r7
            long r1 = r1 >> r7
            int r0 = (int) r1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            if (r0 == 0) goto L_0x06fc
            java.lang.Object r1 = r3.A01
            X.5Qa r1 = (X.C285165Qa) r1
            r0 = 6
            goto L_0x06e0
        L_0x06fc:
            r4 = 21
            int r0 = r5.getKeyCode()
            long r1 = (long) r0
            long r1 = r1 << r7
            long r1 = r1 >> r7
            int r0 = (int) r1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            if (r0 == 0) goto L_0x0712
            java.lang.Object r1 = r3.A01
            X.5Qa r1 = (X.C285165Qa) r1
            r0 = 3
            goto L_0x06e0
        L_0x0712:
            r4 = 22
            int r0 = r5.getKeyCode()
            long r1 = (long) r0
            long r1 = r1 << r7
            long r1 = r1 >> r7
            int r0 = (int) r1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            if (r0 == 0) goto L_0x0728
            java.lang.Object r1 = r3.A01
            X.5Qa r1 = (X.C285165Qa) r1
            r0 = 4
            goto L_0x06e0
        L_0x0728:
            r4 = 23
            int r0 = r5.getKeyCode()
            long r1 = (long) r0
            long r1 = r1 << r7
            long r1 = r1 >> r7
            int r0 = (int) r1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            if (r0 == 0) goto L_0x07a0
            java.lang.Object r0 = r3.A02
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.5Uk r0 = r0.A0L
            if (r0 == 0) goto L_0x0743
            r0.show()
        L_0x0743:
            r6 = 1
            goto L_0x07a0
        L_0x0745:
            X.Hry r0 = (X.C56049Hry) r0
            android.view.KeyEvent r4 = r0.A00
            java.lang.Object r0 = r3.A02
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.5Oz r0 = r0.A09
            java.lang.Object r1 = r0.getValue()
            X.HL2 r0 = X.HL2.Selection
            r2 = 1
            if (r1 != r0) goto L_0x0772
            int r1 = r4.getKeyCode()
            r0 = 4
            if (r1 != r0) goto L_0x0772
            int r0 = X.HRR.A00(r4)
            if (r0 != r2) goto L_0x0772
            java.lang.Object r1 = r3.A01
            X.Gb5 r1 = (X.C52693Gb5) r1
            r0 = 0
            r1.A0C(r0)
        L_0x076d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0772:
            r2 = 0
            goto L_0x076d
        L_0x0774:
            X.5Tq r0 = (X.C286025Tq) r0
            java.lang.Object r3 = r3.A01
            X.Gc7 r3 = (X.C52754Gc7) r3
            X.Hpq r5 = r3.A04
            r6 = 1
            if (r5 == 0) goto L_0x07a5
            X.IGk r2 = new X.IGk
            r2.<init>()
            X.IGr r1 = new X.IGr
            r1.<init>((X.C286025Tq) r0, (int) r6)
            X.JNY[] r0 = new X.JNY[]{r2, r1}
            java.util.List r1 = X.0sr.A1P(r0)
            X.Hpp r0 = r3.A0M
            X.0sP r4 = r3.A0O
            X.5Tl r3 = r0.A00(r1)
            r0 = 0
            r5.A00(r0, r3)
        L_0x079d:
            r4.invoke(r3)
        L_0x07a0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L_0x07a5:
            X.0sP r4 = r3.A0O
            java.lang.String r2 = r0.A00
            int r0 = r2.length()
            long r0 = X.C3026964x.A00(r0, r0)
            X.5Tl r3 = new X.5Tl
            r3.<init>(r2, r0)
            goto L_0x079d
        L_0x07b7:
            java.lang.Object r4 = r3.A01
            X.I4O r4 = (X.I4O) r4
            java.lang.Object r2 = r3.A02
            android.view.View r2 = (android.view.View) r2
            int r0 = r4.A00
            if (r0 != 0) goto L_0x07d7
            X.Gg6 r1 = r4.A06
            X.AnonymousClass03j.A00(r2, r1)
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L_0x07d1
            r2.requestApplyInsets()
        L_0x07d1:
            r2.addOnAttachStateChangeListener(r1)
            X.04a.A01(r2, r1)
        L_0x07d7:
            int r0 = r4.A00
            int r0 = r0 + 1
            r4.A00 = r0
            r1 = 4
            goto L_0x0832
        L_0x07df:
            java.lang.Object r4 = r3.A01
            X.I4f r4 = (X.C56606I4f) r4
            java.lang.Object r2 = r3.A02
            X.6HD r0 = r4.A09
            r0.add(r2)
            r1 = 3
            goto L_0x0832
        L_0x07ec:
            java.lang.Object r4 = r3.A02
            java.lang.Object r2 = r3.A01
            r1 = 2
        L_0x07f1:
            X.GOz r0 = new X.GOz
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            return r0
        L_0x07f7:
            java.lang.Object r4 = r3.A01
            X.I4f r4 = (X.C56606I4f) r4
            java.lang.Object r2 = r3.A02
            X.6HD r0 = r4.A0A
            r0.add(r2)
            r1 = 1
            goto L_0x0832
        L_0x0804:
            java.lang.Object r5 = r3.A01
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            java.lang.Object r2 = r3.A02
            X.I4f r2 = (X.C56606I4f) r2
            r0 = 0
            androidx.compose.animation.core.Transition$animateTo$1$1$1 r1 = new androidx.compose.animation.core.Transition$animateTo$1$1$1
            r1.<init>(r2, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r4, r0, r1, r5)
            r1 = 0
            X.Gc5 r0 = new X.Gc5
            r0.<init>(r1)
            return r0
        L_0x0820:
            java.lang.Object r4 = r3.A01
            X.GRI r4 = (X.GRI) r4
            java.lang.Object r2 = r3.A02
            X.5Pl r0 = r4.A03
            r0.A09(r2)
            r1 = 1
            X.5Oz r0 = r4.A02
            X.C51967G9n.A16(r0, r1)
            r1 = 0
        L_0x0832:
            X.GOz r0 = new X.GOz
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r4)
            return r0
        L_0x0838:
            X.HL0 r0 = (X.HL0) r0
            int r1 = r0.ordinal()
            r0 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x08b1
            r0 = 0
            if (r1 == r0) goto L_0x0858
            r0 = 2
            if (r1 != r0) goto L_0x0861
            java.lang.Object r0 = r3.A02
            X.Hte r0 = (X.C56152Hte) r0
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
        L_0x0851:
            X.Hsm r0 = r0.A02
            if (r0 == 0) goto L_0x08b1
            float r2 = r0.A00
            goto L_0x08b1
        L_0x0858:
            java.lang.Object r0 = r3.A01
            X.Htd r0 = (X.C56151Htd) r0
            X.GeF r0 = (X.C52879GeF) r0
            X.I1o r0 = r0.A00
            goto L_0x0851
        L_0x0861:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0866:
            X.JQ8 r0 = (X.JQ8) r0
            X.HL0 r1 = X.HL0.PreEnter
            X.HL0 r2 = X.HL0.Visible
            boolean r1 = r0.CdX(r1, r2)
            if (r1 == 0) goto L_0x0881
            java.lang.Object r0 = r3.A01
            X.Htd r0 = (X.C56151Htd) r0
            X.GeF r0 = (X.C52879GeF) r0
            X.I1o r0 = r0.A00
        L_0x087a:
            X.Hsm r0 = r0.A02
            if (r0 == 0) goto L_0x08f0
            X.5b8 r0 = r0.A02
            return r0
        L_0x0881:
            X.HL0 r1 = X.HL0.PostExit
            boolean r0 = r0.CdX(r2, r1)
            if (r0 == 0) goto L_0x08f0
            java.lang.Object r0 = r3.A02
            X.Hte r0 = (X.C56152Hte) r0
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            goto L_0x087a
        L_0x0892:
            X.HL0 r0 = (X.HL0) r0
            int r1 = r0.ordinal()
            r0 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x08b1
            r0 = 0
            if (r1 == r0) goto L_0x08b6
            r0 = 2
            if (r1 != r0) goto L_0x08bf
            java.lang.Object r0 = r3.A02
            X.Hte r0 = (X.C56152Hte) r0
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
        L_0x08ab:
            X.HsH r0 = r0.A01
            if (r0 == 0) goto L_0x08b1
            float r2 = r0.A00
        L_0x08b1:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            return r0
        L_0x08b6:
            java.lang.Object r0 = r3.A01
            X.Htd r0 = (X.C56151Htd) r0
            X.GeF r0 = (X.C52879GeF) r0
            X.I1o r0 = r0.A00
            goto L_0x08ab
        L_0x08bf:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08c4:
            X.JQ8 r0 = (X.JQ8) r0
            X.HL0 r1 = X.HL0.PreEnter
            X.HL0 r2 = X.HL0.Visible
            boolean r1 = r0.CdX(r1, r2)
            if (r1 == 0) goto L_0x08df
            java.lang.Object r0 = r3.A01
            X.Htd r0 = (X.C56151Htd) r0
            X.GeF r0 = (X.C52879GeF) r0
            X.I1o r0 = r0.A00
        L_0x08d8:
            X.HsH r0 = r0.A01
            if (r0 == 0) goto L_0x08f0
            X.5b8 r0 = r0.A01
            return r0
        L_0x08df:
            X.HL0 r1 = X.HL0.PostExit
            boolean r0 = r0.CdX(r2, r1)
            if (r0 == 0) goto L_0x08f0
            java.lang.Object r0 = r3.A02
            X.Hte r0 = (X.C56152Hte) r0
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            goto L_0x08d8
        L_0x08f0:
            X.5b7 r0 = X.I74.A00
            return r0
        L_0x08f3:
            java.lang.String r0 = "setName"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x08fa:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x08fd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0900:
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x090b:
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0916:
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6U.invoke(java.lang.Object):java.lang.Object");
    }
}
