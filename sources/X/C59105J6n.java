package X;

/* renamed from: X.J6n  reason: case insensitive filesystem */
public final class C59105J6n extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A01(Object obj, C59105J6n j6n) {
        0qQ.A0B(obj, 0);
        return j6n.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59105J6n(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass2WG A00(C244463bE r5, C251273mq r6, Object obj, int i) {
        return new AnonymousClass2WG(r6, (C62320sa) null, new C59105J6n(obj, i), r5.A01());
    }

    public static C59105J6n A02(Object obj, int i) {
        return new C59105J6n(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.Gwo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.Gwb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.HIo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.Gwo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.Gwo} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        r5.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0335, code lost:
        r7 = r4.A02;
        r4 = new X.C54522HHj(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03d1, code lost:
        return r1.invoke(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03ea, code lost:
        return new X.C53668GsL(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0097, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d5, code lost:
        r2.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x020b, code lost:
        r5.append(X.C244013aV.A0E(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0228, code lost:
        r1.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0231, code lost:
        r1 = X.C54555HIq.A00(r1);
        r0 = X.HIS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0253, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0301, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006e, code lost:
        r0 = X.C59346JFy.A00(r3, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r2 = r21
            r5 = r22
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x037e;
                case 1: goto L_0x0358;
                case 2: goto L_0x0349;
                case 3: goto L_0x0349;
                case 4: goto L_0x03eb;
                case 5: goto L_0x02f7;
                case 6: goto L_0x0305;
                case 7: goto L_0x02d4;
                case 8: goto L_0x02af;
                case 9: goto L_0x0290;
                case 10: goto L_0x0269;
                case 11: goto L_0x0258;
                case 12: goto L_0x024f;
                case 13: goto L_0x03ad;
                case 14: goto L_0x0238;
                case 15: goto L_0x03dc;
                case 16: goto L_0x03d2;
                case 17: goto L_0x03c4;
                case 18: goto L_0x03be;
                case 19: goto L_0x03b0;
                case 20: goto L_0x022d;
                case 21: goto L_0x022d;
                case 22: goto L_0x0214;
                case 23: goto L_0x0200;
                case 24: goto L_0x01f4;
                case 25: goto L_0x01e8;
                case 26: goto L_0x01df;
                case 27: goto L_0x03ad;
                case 28: goto L_0x0148;
                case 29: goto L_0x0136;
                case 30: goto L_0x010d;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x0104;
                case 34: goto L_0x00fb;
                case 35: goto L_0x00da;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00b5;
                case 38: goto L_0x038b;
                case 39: goto L_0x00ad;
                case 40: goto L_0x00a2;
                case 41: goto L_0x009b;
                case 42: goto L_0x0091;
                case 43: goto L_0x008a;
                case 44: goto L_0x0083;
                case 45: goto L_0x0076;
                case 46: goto L_0x0057;
                case 47: goto L_0x0046;
                case 48: goto L_0x002e;
                case 49: goto L_0x0019;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.HQ4 r5 = (X.HQ4) r5
            java.lang.Object r0 = A01(r5, r2)
            X.Gta r0 = (X.C53745Gta) r0
            X.GgN r0 = r0.A00
            r0.A0F(r5)
        L_0x0016:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0019:
            X.2WE r4 = X.C51968G9o.A0f(r5)
            java.lang.Object r3 = r2.A01
            X.Gwk r3 = (X.C53940Gwk) r3
            java.lang.String r2 = r3.A00
            java.lang.String r0 = r3.A01
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            X.JGB.A01(r4, r3, r0, r1)
            goto L_0x0016
        L_0x002e:
            X.2WE r5 = (X.2WE) r5
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r2 = r2.A01
            X.GxH r2 = (X.C53973GxH) r2
            X.HMK r1 = r2.A02
            X.HLP r0 = r2.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            X.JGB r0 = new X.JGB
            r0.<init>(r2, r3)
            goto L_0x0072
        L_0x0046:
            X.2WE r5 = X.C51968G9o.A0f(r5)
            java.lang.Object r3 = r2.A01
            X.Gwb r3 = (X.C53931Gwb) r3
            X.Hsd r0 = r3.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = 49
            goto L_0x006e
        L_0x0057:
            X.2WE r5 = X.C51968G9o.A0f(r5)
            r0 = 1
            r5.A01 = r0
            java.lang.Object r3 = r2.A01
            X.Gwo r3 = (X.C53944Gwo) r3
            com.meta.foa.session.FoaUserSession r2 = r3.A00
            X.HlT r1 = r3.A02
            X.HjT r0 = r3.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            r0 = 48
        L_0x006e:
            X.JFy r0 = X.C59346JFy.A00(r3, r0)
        L_0x0072:
            r5.A02(r0, r1)
            goto L_0x0016
        L_0x0076:
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            java.lang.Object r1 = A01(r5, r2)
            X.2Wb r1 = (X.2Wb) r1
            r0 = 2131966348(0x7f13398c, float:1.9569532E38)
            goto L_0x020b
        L_0x0083:
            java.lang.Object r0 = r2.A01
            X.GwJ r0 = (X.C53913GwJ) r0
            X.0sa r0 = r0.A01
            goto L_0x0097
        L_0x008a:
            java.lang.Object r0 = r2.A01
            X.Guj r0 = (X.C53816Guj) r0
            X.0sa r0 = r0.A03
            goto L_0x0097
        L_0x0091:
            java.lang.Object r0 = r2.A01
            X.5tc r0 = (X.C298535tc) r0
            X.0sa r0 = r0.A07
        L_0x0097:
            if (r0 == 0) goto L_0x0016
            goto L_0x0253
        L_0x009b:
            java.lang.Object r1 = r2.A01
            X.Gh8 r1 = (X.C53017Gh8) r1
            java.lang.String r0 = "WriteWithAIBadReasonBottomSheet"
            goto L_0x00a8
        L_0x00a2:
            java.lang.Object r1 = r2.A01
            X.Gh8 r1 = (X.C53017Gh8) r1
            java.lang.String r0 = "WriteWithAIFeedbackBottomSheet"
        L_0x00a8:
            r1.A01(r0)
            goto L_0x0016
        L_0x00ad:
            java.lang.Object r0 = r2.A01
            X.Grr r0 = (X.C53638Grr) r0
            X.0sa r0 = r0.A00
            goto L_0x0253
        L_0x00b5:
            X.HtE r5 = (X.C56126HtE) r5
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r2 = r2.A01
            X.HIo r2 = (X.C54553HIo) r2
            X.Hzc r1 = r2.A01
            java.lang.String r0 = r5.A02
            X.C56506Hzc.A00(r1, r0, r3)
            X.0sP r1 = r2.A04
            X.HIm r0 = new X.HIm
            r0.<init>(r5)
            r1.invoke(r0)
            goto L_0x00d5
        L_0x00d1:
            java.lang.Object r2 = r2.A01
            X.I4d r2 = (X.C56604I4d) r2
        L_0x00d5:
            r2.A0D()
            goto L_0x0016
        L_0x00da:
            X.HQ7 r5 = (X.HQ7) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r0 = r5 instanceof X.C54551HIm
            java.lang.Object r1 = r2.A01
            X.JPd r1 = (X.C59583JPd) r1
            if (r0 == 0) goto L_0x00f5
            X.HIm r5 = (X.C54551HIm) r5
            if (r5 == 0) goto L_0x03fb
            java.lang.Object r0 = r5.A00
            if (r0 == 0) goto L_0x03fb
            r1.onSuccess(r0)
            goto L_0x0016
        L_0x00f5:
            r0 = 0
            r1.onFailure(r0)
            goto L_0x0016
        L_0x00fb:
            java.lang.Object r0 = r2.A01
            X.2Wa r0 = (X.2Wa) r0
            X.C51971G9r.A1I(r0)
            goto L_0x0016
        L_0x0104:
            java.lang.Object r0 = r2.A01
            X.2Wa r0 = (X.2Wa) r0
            r0.A00()
            goto L_0x0016
        L_0x010d:
            X.Kfj r0 = X.C62433Kfj.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0016
            X.0wj r3 = X.0wj.A01
            X.0qQ.A07(r3)
            r1 = 164832702(0x9d325be, float:5.0831895E-33)
            java.lang.String r0 = "memu_onboarding"
            X.0f9 r3 = r3.AEf(r0, r1)
            r1 = 0
            java.lang.String r0 = "camera_init"
            r3.ABR(r0, r1)
            r3.report()
            java.lang.Object r0 = r2.A01
            X.Guh r0 = (X.C53814Guh) r0
            X.0sP r7 = r0.A01
            X.HIY r4 = X.HIY.A00
            goto L_0x033c
        L_0x0136:
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.Object r0 = r2.A01
            X.Guh r0 = (X.C53814Guh) r0
            X.0sP r7 = r0.A01
            X.0qQ.A0A(r5)
            X.HIQ r4 = new X.HIQ
            r4.<init>(r5)
            goto L_0x033c
        L_0x0148:
            X.Hhf r5 = (X.C55435Hhf) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.Object r3 = r2.A01
            X.2Wa r3 = (X.2Wa) r3
            X.GoI r9 = X.C55303HfW.A00
            r2 = 3
            r12 = 3
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.GnR r0 = r5.A00
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            long r13 = r0.A00
            r0.A01 = r10
            r0.A00 = r13
            long r17 = X.C55305HfY.A00
            r8 = 0
            r16 = 0
            X.GoC r15 = new X.GoC
            r19 = r13
            r15.<init>(r16, r17, r19)
            r5 = -1
            X.Go9 r6 = new X.Go9
            r6.<init>(r5)
            X.Gnx r5 = new X.Gnx
            r5.<init>(r8, r6, r15, r2)
            r10.add(r5)
            long r5 = r0.A00
            float r16 = X.C51971G9r.A01(r5)
            r7 = 1047233823(0x3e6b851f, float:0.23)
            float r7 = r16 * r7
            float r6 = X.C51972G9s.A00(r5)
            r5 = 1041194025(0x3e0f5c29, float:0.14)
            float r6 = r6 * r5
            long r17 = X.C56192HuL.A00(r7, r6)
            r5 = 1057803469(0x3f0ccccd, float:0.55)
            float r6 = r16 * r5
            r5 = 1058977874(0x3f1eb852, float:0.62)
            float r5 = r16 * r5
            long r19 = X.HSV.A00(r6, r5)
            r5 = 1049918177(0x3e947ae1, float:0.29)
            float r16 = r16 * r5
            X.GoC r15 = new X.GoC
            r15.<init>(r16, r17, r19)
            boolean r5 = X.C51969G9p.A1V(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r5 == 0) goto L_0x01b8
            r3 = 0
        L_0x01b8:
            X.Go9 r6 = new X.Go9
            r6.<init>(r3)
            if (r5 == 0) goto L_0x01c0
            r2 = 7
        L_0x01c0:
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
            X.Gnx r3 = new X.Gnx
            r3.<init>(r8, r6, r15, r2)
            r5.add(r3)
            X.0qQ.A0B(r1, r4)
            r0.A01 = r1
            r0.A00 = r13
            r11 = 1065353216(0x3f800000, float:1.0)
            X.Gnz r7 = new X.Gnz
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.add(r7)
            goto L_0x0016
        L_0x01df:
            java.lang.Object r0 = r2.A01
            X.Gvy r0 = (X.C53893Gvy) r0
            X.GgN r1 = r0.A01
            X.HIR r0 = X.HIR.A00
            goto L_0x0228
        L_0x01e8:
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            java.lang.Object r1 = A01(r5, r2)
            X.2Wb r1 = (X.2Wb) r1
            r0 = 2131966044(0x7f13385c, float:1.9568915E38)
            goto L_0x020b
        L_0x01f4:
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            java.lang.Object r1 = A01(r5, r2)
            X.2Wb r1 = (X.2Wb) r1
            r0 = 2131965998(0x7f13382e, float:1.9568822E38)
            goto L_0x020b
        L_0x0200:
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            java.lang.Object r1 = A01(r5, r2)
            X.2Wb r1 = (X.2Wb) r1
            r0 = 2131965997(0x7f13382d, float:1.956882E38)
        L_0x020b:
            java.lang.String r0 = X.C244013aV.A0E(r1, r0)
            r5.append(r0)
            goto L_0x0016
        L_0x0214:
            java.lang.Object r1 = r2.A01
            X.HIq r1 = (X.C54555HIq) r1
            X.HtW r0 = r1.A06
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0231
            r0 = 0
            r1.A0H(r0)
            X.GgN r1 = X.C54555HIq.A00(r1)
            X.HIa r0 = X.C54539HIa.A00
        L_0x0228:
            r1.A0F(r0)
            goto L_0x0016
        L_0x022d:
            java.lang.Object r1 = r2.A01
            X.HIq r1 = (X.C54555HIq) r1
        L_0x0231:
            X.GgN r1 = X.C54555HIq.A00(r1)
            X.HIS r0 = X.HIS.A00
            goto L_0x0228
        L_0x0238:
            boolean r3 = X.AnonymousClass7TE.A1a(r5)
            java.lang.Object r0 = r2.A01
            X.GgP r0 = (X.C52972GgP) r0
            X.I44 r2 = r0.A0C
            java.lang.String r1 = r0.A05
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "model_response_received"
            X.I44.A01(r2, r0, r1, r3)
            goto L_0x0016
        L_0x024f:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0253:
            r0.invoke()
            goto L_0x0016
        L_0x0258:
            X.HsE r5 = (X.C56065HsE) r5
            java.lang.Object r0 = A01(r5, r2)
            X.GuR r0 = (X.C53798GuR) r0
            X.0sP r7 = r0.A00
            X.HHp r4 = new X.HHp
            r4.<init>(r5)
            goto L_0x033c
        L_0x0269:
            X.HqB r5 = (X.C55947HqB) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r0 = r5 instanceof X.C54518HHe
            if (r0 == 0) goto L_0x0016
            X.HHe r5 = (X.C54518HHe) r5
            if (r5 == 0) goto L_0x0016
            X.Icx r1 = r5.A01
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = r2.A01
            X.GuR r0 = (X.C53798GuR) r0
            X.KhO r1 = r1.A01
            X.0sP r7 = r0.A00
            X.KhO r0 = X.C62532KhO.MEMU
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            X.HHr r4 = new X.HHr
            r4.<init>(r0)
            goto L_0x033c
        L_0x0290:
            X.HqB r5 = (X.C55947HqB) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r0 = r5 instanceof X.C54518HHe
            if (r0 == 0) goto L_0x0016
            X.HHe r5 = (X.C54518HHe) r5
            if (r5 == 0) goto L_0x0016
            X.Icx r1 = r5.A01
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = r2.A01
            X.GuR r0 = (X.C53798GuR) r0
            X.0sP r7 = r0.A00
            X.HHq r4 = new X.HHq
            r4.<init>(r1)
            goto L_0x033c
        L_0x02af:
            X.HqB r5 = (X.C55947HqB) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r1 = r5 instanceof X.C54519HHf
            r0 = 0
            if (r1 == 0) goto L_0x02c0
            X.HHf r5 = (X.C54519HHf) r5
            if (r5 == 0) goto L_0x02c0
            X.I1k r0 = r5.A01
        L_0x02c0:
            java.lang.Object r1 = r2.A01
            X.GwI r1 = (X.C53912GwI) r1
            if (r0 == 0) goto L_0x0016
            X.HtY r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r0 = r0.A01
            X.0sP r7 = r1.A02
            X.HHn r4 = new X.HHn
            r4.<init>(r0)
            goto L_0x033c
        L_0x02d4:
            X.HqB r5 = (X.C55947HqB) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r1 = r5 instanceof X.C54519HHf
            r0 = 0
            if (r1 == 0) goto L_0x02e5
            X.HHf r5 = (X.C54519HHf) r5
            if (r5 == 0) goto L_0x02e5
            X.I1k r0 = r5.A01
        L_0x02e5:
            java.lang.Object r1 = r2.A01
            X.GwI r1 = (X.C53912GwI) r1
            if (r0 == 0) goto L_0x0016
            X.HtY r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            X.0sP r7 = r1.A02
            X.HHm r4 = new X.HHm
            r4.<init>(r0)
            goto L_0x033c
        L_0x02f7:
            X.I1k r5 = (X.C56556I1k) r5
            java.lang.Object r4 = A01(r5, r2)
            X.GwI r4 = (X.C53912GwI) r4
            X.HtY r2 = r5.A01
            if (r2 != 0) goto L_0x0335
            goto L_0x0016
        L_0x0305:
            X.HqB r5 = (X.C55947HqB) r5
            r6 = 0
            X.0qQ.A0B(r5, r6)
            boolean r0 = r5 instanceof X.C54519HHf
            r1 = 0
            if (r0 == 0) goto L_0x0316
            X.HHf r5 = (X.C54519HHf) r5
            if (r5 == 0) goto L_0x0316
            X.I1k r1 = r5.A01
        L_0x0316:
            java.lang.Object r4 = r2.A01
            X.GwI r4 = (X.C53912GwI) r4
            X.HI9 r0 = r4.A00
            X.I1t r3 = r0.A01
            if (r1 == 0) goto L_0x0016
            X.HtY r2 = r1.A01
            if (r2 == 0) goto L_0x0016
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0341
            boolean r0 = r4.A03
            r1 = 1
            if (r0 == 0) goto L_0x0341
            java.lang.String r0 = r2.A04
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r1) goto L_0x0341
        L_0x0335:
            X.0sP r7 = r4.A02
            X.HHj r4 = new X.HHj
            r4.<init>(r2)
        L_0x033c:
            r7.invoke(r4)
            goto L_0x0016
        L_0x0341:
            X.0sP r7 = r4.A02
            X.HHy r4 = new X.HHy
            r4.<init>(r2, r3, r6)
            goto L_0x033c
        L_0x0349:
            X.HQ1 r5 = (X.HQ1) r5
            java.lang.Object r0 = A01(r5, r2)
            X.GuQ r0 = (X.C53797GuQ) r0
            X.GgI r0 = r0.A00
            r0.A0E(r5)
            goto L_0x0016
        L_0x0358:
            java.lang.Object r2 = r2.A01
            X.Gw8 r2 = (X.C53902Gw8) r2
            X.HQ2 r1 = r2.A02
            boolean r0 = r1 instanceof X.HIE
            if (r0 == 0) goto L_0x036a
            X.HIE r1 = (X.HIE) r1
            X.HQ0 r0 = r1.A01
            boolean r0 = r0 instanceof X.C54520HHg
            if (r0 != 0) goto L_0x0377
        L_0x036a:
            X.I1q r0 = r2.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0377
            X.GbJ r0 = r2.A00
            r0.A03()
            goto L_0x0016
        L_0x0377:
            X.GbJ r0 = r2.A00
            r0.A02()
            goto L_0x0016
        L_0x037e:
            java.lang.Object r0 = A01(r5, r2)
            X.GwM r0 = (X.C53916GwM) r0
            X.0sP r0 = r0.A09
            r0.invoke(r5)
            goto L_0x0016
        L_0x038b:
            java.lang.Object r2 = r2.A01
            X.HIo r2 = (X.C54553HIo) r2
            com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r3 = r2.A00
            if (r3 != 0) goto L_0x039b
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x039b:
            r0 = 44
            X.IwN r1 = X.C58714IwN.A01(r2, r0)
            r0 = 37
            X.J6n r0 = A02(r2, r0)
            X.Gsv r2 = new X.Gsv
            r2.<init>(r3, r1, r0)
            return r2
        L_0x03ad:
            java.lang.Object r2 = r2.A01
            return r2
        L_0x03b0:
            java.lang.Object r1 = r2.A01
            r0 = 24
            X.IwN r0 = X.C58714IwN.A01(r1, r0)
            X.Gvo r2 = new X.Gvo
            r2.<init>(r0)
            return r2
        L_0x03be:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 1
            goto L_0x03c9
        L_0x03c4:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
        L_0x03c9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r2 = r1.invoke(r0)
            return r2
        L_0x03d2:
            java.lang.Object r0 = r2.A01
            X.HIq r0 = (X.C54555HIq) r0
            X.GgN r1 = X.C54555HIq.A00(r0)
            r0 = 0
            goto L_0x03e5
        L_0x03dc:
            java.lang.Object r0 = r2.A01
            X.HIq r0 = (X.C54555HIq) r0
            X.GgN r1 = X.C54555HIq.A00(r0)
            r0 = 1
        L_0x03e5:
            X.GsL r2 = new X.GsL
            r2.<init>(r1, r0)
            return r2
        L_0x03eb:
            X.2WX r5 = (X.2WX) r5
            java.lang.Object r1 = A01(r5, r2)
            X.2he r1 = (X.C226662he) r1
            X.Id6 r0 = X.C57579Id6.A00
            X.Gsq r2 = new X.Gsq
            r2.<init>(r1, r5, r0)
            return r2
        L_0x03fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59105J6n.invoke(java.lang.Object):java.lang.Object");
    }
}
