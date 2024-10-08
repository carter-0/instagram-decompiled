package X;

/* renamed from: X.Inz  reason: case insensitive filesystem */
public final class C58195Inz extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58195Inz(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: X.NYd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: X.752} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: X.NYd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: X.NYd} */
    /* JADX WARNING: type inference failed for: r3v38, types: [X.NAW, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0449, code lost:
        if (r4 != null) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x044b, code lost:
        r1 = r3.A0M;
        X.0qQ.A0C(r1, X.C66579MXk.A00(373));
        r4.FKn(((X.C254763t0) r1).A00, java.lang.String.valueOf(r3.A0Q));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x047c, code lost:
        X.C71137Odf.A04(X.C69483NmR.A05, r2, r3, r4.CU2());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0639, code lost:
        r9.A07(r10, r11, r12, r13, r14);
        r3.A04.Cjb(java.lang.Integer.valueOf(r1), r8, (java.lang.String) null, (java.lang.String) null, X.C292845jc.A00(r3.A07), r3.A08, r5.size(), X.0oI.A0A(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0684, code lost:
        if (r2.A5f() != false) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x06a6, code lost:
        if (r1 == X.AnonymousClass05K.A00) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x06a8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x06ad, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x06ae, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x081a, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cd, code lost:
        if (r1.contains(r3.A06) == false) goto L_0x00cf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r41 = this;
            r2 = r41
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0062;
                case 1: goto L_0x01db;
                case 2: goto L_0x020a;
                case 3: goto L_0x0278;
                case 4: goto L_0x02a3;
                case 5: goto L_0x02e4;
                case 6: goto L_0x0304;
                case 7: goto L_0x0323;
                case 8: goto L_0x034f;
                case 9: goto L_0x03bb;
                case 10: goto L_0x03e3;
                case 11: goto L_0x03fc;
                case 12: goto L_0x0412;
                case 13: goto L_0x0432;
                case 14: goto L_0x0465;
                case 15: goto L_0x0487;
                case 16: goto L_0x0494;
                case 17: goto L_0x04dc;
                case 18: goto L_0x04ee;
                case 19: goto L_0x0505;
                case 20: goto L_0x0517;
                case 21: goto L_0x053f;
                case 22: goto L_0x0562;
                case 23: goto L_0x0585;
                case 24: goto L_0x05ac;
                case 25: goto L_0x05f4;
                case 26: goto L_0x065b;
                case 27: goto L_0x0689;
                case 28: goto L_0x06b2;
                case 29: goto L_0x06c8;
                case 30: goto L_0x0729;
                case 31: goto L_0x073c;
                case 32: goto L_0x074f;
                case 33: goto L_0x0767;
                case 34: goto L_0x077e;
                case 35: goto L_0x07a2;
                case 36: goto L_0x07b5;
                case 37: goto L_0x0021;
                case 38: goto L_0x07cb;
                case 39: goto L_0x0806;
                case 40: goto L_0x081b;
                case 41: goto L_0x0907;
                case 42: goto L_0x0923;
                case 43: goto L_0x0940;
                case 44: goto L_0x0007;
                case 45: goto L_0x095f;
                case 46: goto L_0x081b;
                case 47: goto L_0x0907;
                case 48: goto L_0x0923;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A03
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A07
            r0.getValue()
            java.lang.Object r1 = r2.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            int r0 = r1.A03
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0020:
            return r4
        L_0x0021:
            java.lang.Object r3 = r2.A03
            X.1Xl r3 = (X.1Xl) r3
            boolean r0 = r3 instanceof X.AnonymousClass3OA
            r1 = 0
            if (r0 == 0) goto L_0x004b
            r0 = r3
            X.3OA r0 = (X.AnonymousClass3OA) r0
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0034
            r3 = r1
        L_0x0034:
            X.3OA r3 = (X.AnonymousClass3OA) r3
            if (r3 == 0) goto L_0x0990
            com.google.common.collect.ImmutableList r1 = r3.A01()
            if (r1 == 0) goto L_0x0990
            java.lang.Object r0 = r2.A02
            X.GTG r0 = (X.GTG) r0
            int r0 = r0.A00
            java.lang.Object r4 = X.00k.A0O(r1, r0)
            if (r4 == 0) goto L_0x0990
            return r4
        L_0x004b:
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r1.A5D()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r2.A02
            X.GTG r0 = (X.GTG) r0
            int r0 = r0.A00
            X.1Xj r4 = r1.A1c(r0)
            if (r4 != 0) goto L_0x0020
        L_0x0061:
            return r1
        L_0x0062:
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r12 = r2.A03
            X.NJY r12 = (X.NJY) r12
            com.instagram.common.session.UserSession r3 = r12.A0N()
            androidx.fragment.app.FragmentActivity r23 = r12.requireActivity()
            java.lang.Object r15 = r2.A02
            X.N4P r15 = (X.N4P) r15
            X.Pv4 r14 = r12.A0Q
            if (r14 != 0) goto L_0x0084
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0084:
            X.1a8 r2 = r12.A0z
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.AnonymousClass7TG.A1P(r3, r15)
            r11 = 4
            r0 = 5
            X.0qQ.A0B(r2, r0)
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            int r21 = X.C330397Mp.A00(r15)
            r20 = 0
            r16 = r0
            r17 = r4
            r18 = r12
            r19 = r3
            r22 = r1
            boolean r0 = X.C71118OdC.A03(r16, r17, r18, r19, r20, r21, r22)
            if (r0 != 0) goto L_0x0818
            X.IwA r10 = new X.IwA
            r13 = r12
            r18 = r3
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = 1
            java.util.List r0 = r15.A09()
            boolean r2 = r0.isEmpty()
            java.util.List r1 = r15.A0S
            int r0 = r1.size()
            if (r0 != r4) goto L_0x00cf
            java.lang.String r0 = r3.A06
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            X.3t3 r6 = r15.A0L
            int r9 = r15.A09
            boolean r8 = r15.A0w
            X.Inz r7 = new X.Inz
            r7.<init>(r11, r10, r3, r15)
            if (r0 == 0) goto L_0x0166
            if (r2 != 0) goto L_0x0166
            X.8ab r5 = X.DbS.A0Y(r23)
            r0 = 2131959632(0x7f131f50, float:1.955591E38)
            r5.A09(r0)
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.182.A05(r0, r3)
            r0 = 2131959630(0x7f131f4e, float:1.9555906E38)
            if (r1 == 0) goto L_0x00f7
            r0 = 2131959631(0x7f131f4f, float:1.9555908E38)
        L_0x00f7:
            r5.A08(r0)
            r1 = 2131959624(0x7f131f48, float:1.9555894E38)
            r0 = 12
            X.C56719I8z.A01(r5, r12, r0, r1)
            r2 = 2131959629(0x7f131f4d, float:1.9555904E38)
            r0 = 13
            X.I8z r1 = X.C56719I8z.A00(r7, r0)
            X.8ae r0 = X.C358278ae.RED
            r5.A0O(r1, r0, r2)
            X.I8g r0 = X.C56700I8g.A00
            r5.A0C(r0)
            r5.A0r(r4)
            r5.A0s(r4)
        L_0x011b:
            X.DbT.A1V(r5)
            X.3sy r2 = r15.A08()
            X.0qQ.A0B(r2, r4)
            java.lang.String r7 = "direct_thread_leave_conversation_button"
            X.0xI r1 = X.0xI.A00(r12, r7)
            java.lang.String r0 = X.C66647MaG.A0A(r2)
            java.lang.String r6 = "thread_id"
            r1.A0C(r6, r0)
            boolean r0 = X.C66647MaG.A0E(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r5 = "is_e2ee"
            r1.A09(r5, r0)
            X.DbU.A1R(r1, r3)
            X.3sy r2 = r15.A08()
            X.0qQ.A0B(r2, r4)
            X.0xI r1 = X.0xI.A00(r12, r7)
            java.lang.String r0 = X.C66647MaG.A0A(r2)
            r1.A0C(r6, r0)
            boolean r0 = X.C66647MaG.A0E(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A09(r5, r0)
            X.DbU.A1R(r1, r3)
            goto L_0x0818
        L_0x0166:
            boolean r1 = X.AnonymousClass48O.A04(r9)
            X.8ab r5 = X.DbS.A0Y(r23)
            r0 = 2131959623(0x7f131f47, float:1.9555892E38)
            if (r1 == 0) goto L_0x0176
            r0 = 2131959622(0x7f131f46, float:1.955589E38)
        L_0x0176:
            r5.A09(r0)
            if (r1 == 0) goto L_0x01bd
            r1 = 2131959621(0x7f131f45, float:1.9555888E38)
        L_0x017e:
            r5.A08(r1)
            X.I8f r0 = X.C56699I8f.A00
            r5.A0C(r0)
            r5.A0r(r4)
            r5.A0s(r4)
            r0 = 29
            if (r9 != r0) goto L_0x01d1
            if (r8 != 0) goto L_0x01d1
            r0 = 2131959620(0x7f131f44, float:1.9555886E38)
            r5.A08(r0)
            r2 = 2131959618(0x7f131f42, float:1.9555882E38)
            r0 = 10
            X.I8z r1 = X.C56719I8z.A00(r7, r0)
            X.8ae r0 = X.C358278ae.RED
            r5.A0Q(r1, r0, r2)
            r1 = 2131959829(0x7f132015, float:1.955631E38)
            X.FJj r0 = new X.FJj
            r19 = r0
            r20 = r11
            r21 = r12
            r22 = r3
            r24 = r6
            r19.<init>((int) r20, (java.lang.Object) r21, (java.lang.Object) r22, (java.lang.Object) r23, (java.lang.Object) r24)
            r5.A0G(r0, r1)
            goto L_0x011b
        L_0x01bd:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324217754496907(0x810caf00002f8b, double:3.034919801604069E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131959626(0x7f131f4a, float:1.9555898E38)
            if (r0 == 0) goto L_0x017e
            r1 = 2131959627(0x7f131f4b, float:1.95559E38)
            goto L_0x017e
        L_0x01d1:
            r1 = 2131959618(0x7f131f42, float:1.9555882E38)
            r0 = 11
            X.C56719I8z.A01(r5, r7, r0, r1)
            goto L_0x011b
        L_0x01db:
            java.lang.Object r1 = r2.A03
            X.Ggt r1 = (X.C53002Ggt) r1
            java.lang.Object r0 = r2.A01
            X.JwA r0 = (X.C61072JwA) r0
            java.lang.Object r7 = r0.A02
            java.util.List r7 = (java.util.List) r7
            X.05G r3 = r1.A03
        L_0x01e9:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            X.JVH r4 = (X.JVH) r4
            r5 = 0
            r9 = 29
            r6 = r5
            r8 = r5
            X.JVH r0 = X.JVH.A00(r4, r5, r6, r7, r8, r9)
            boolean r0 = r3.AIY(r1, r0)
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r1 = r2.A02
            X.HqG r1 = (X.C55952HqG) r1
            X.HOn r0 = X.C54682HOn.TAP_EMOJI_GRADIENT
            r1.A00(r0, r5)
            goto L_0x0818
        L_0x020a:
            java.lang.Object r3 = r2.A03
            X.HqG r3 = (X.C55952HqG) r3
            java.lang.Object r1 = r2.A02
            if (r1 == 0) goto L_0x0256
            X.HOn r0 = X.C54682HOn.TAP_IMAGE_XOUT
        L_0x0214:
            r6 = 0
            r3.A00(r0, r6)
            java.lang.Object r0 = r2.A01
            X.OJf r0 = (X.OJf) r0
            X.NIZ r0 = r0.A00
            X.0eM r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.GhI r3 = (X.C53027GhI) r3
            X.05G r2 = r3.A06
            if (r1 == 0) goto L_0x0259
        L_0x022a:
            java.lang.Object r4 = r2.getValue()
            r5 = r4
            X.GnO r5 = (X.C53391GnO) r5
            java.lang.String r1 = r5.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            r12 = 1
            if (r0 != 0) goto L_0x0254
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0254
        L_0x0242:
            r11 = 220(0xdc, float:3.08E-43)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            X.GnO r0 = X.C53391GnO.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.AIY(r4, r0)
            if (r0 == 0) goto L_0x022a
            goto L_0x0818
        L_0x0254:
            r12 = 0
            goto L_0x0242
        L_0x0256:
            X.HOn r0 = X.C54682HOn.DEFAULT_IMAGE_XOUT
            goto L_0x0214
        L_0x0259:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            X.GnO r5 = (X.C53391GnO) r5
            com.instagram.common.typedurl.ImageUrl r0 = r3.A01
            boolean r12 = X.AnonymousClass7TF.A1V(r0)
            r11 = 219(0xdb, float:3.07E-43)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            X.GnO r0 = X.C53391GnO.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0259
            goto L_0x0818
        L_0x0278:
            java.lang.Object r6 = r2.A03
            X.QP8 r6 = (X.QP8) r6
            java.lang.Object r1 = r2.A01
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r5 = r1.getValue()
            X.QP8 r5 = (X.QP8) r5
            java.lang.Object r4 = r2.A02
            X.5Oz r4 = (X.C284945Oz) r4
            java.lang.Object r3 = r4.getValue()
            android.media.MediaPlayer r3 = (android.media.MediaPlayer) r3
            r0 = 24
            X.PmE r2 = new X.PmE
            r2.<init>(r1, r0)
            r1 = 25
            X.PmE r0 = new X.PmE
            r0.<init>(r4, r1)
            X.C56291Hw4.A00(r3, r6, r5, r2, r0)
            goto L_0x0818
        L_0x02a3:
            java.lang.Object r0 = r2.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7BY r5 = X.AnonymousClass7BY.A00(r0)
            X.0qQ.A07(r5)
            com.google.common.collect.ImmutableList r0 = r5.A01()
            X.0qQ.A07(r0)
            X.3kO r4 = r0.iterator()
            X.0qQ.A07(r4)
        L_0x02bc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r3 = r4.next()
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            java.lang.Object r0 = r2.A02
            X.N4P r0 = (X.N4P) r0
            X.3sy r1 = r0.A08()
            X.3sy r0 = r3.A02()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02bc
            r5.A03(r3)
        L_0x02dd:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
            goto L_0x0818
        L_0x02e4:
            java.lang.Object r3 = r2.A03
            X.LqK r3 = (X.C65265LqK) r3
            X.1Av r0 = r3.A02
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 658(0x292, float:9.22E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbW.A1L(r1, r0)
            java.lang.Object r1 = r2.A01
            com.instagram.model.direct.messageid.MessageIdentifier r1 = (com.instagram.model.direct.messageid.MessageIdentifier) r1
            java.lang.Object r0 = r2.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.C65265LqK.A00(r3, r1, r0)
            goto L_0x0818
        L_0x0304:
            java.lang.Object r0 = r2.A03
            X.0lg r0 = (X.0lg) r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Object r0 = r2.A02
            java.lang.String r1 = X.DbS.A0q(r0)
            X.Osn r0 = new X.Osn
            r0.<init>(r1)
            r3.A00(r0)
            java.lang.Object r0 = r2.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.onBackPressed()
            goto L_0x0818
        L_0x0323:
            java.lang.Object r0 = r2.A02
            X.Mm8 r0 = (X.C67332Mm8) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0336
            java.lang.Object r0 = r2.A03
            X.Mm1 r0 = (X.C67325Mm1) r0
            X.Pvl r0 = r0.A01
            r0.DU1()
            goto L_0x0818
        L_0x0336:
            X.1xC r4 = X.1xC.A01
            X.6ap r3 = X.DbV.A0X()
            java.lang.Object r0 = r2.A01
            X.3kE r0 = (X.C249703kE) r0
            android.content.Context r1 = X.DbS.A07(r0)
            r0 = 2131958840(0x7f131c38, float:1.9554304E38)
            X.DbS.A19(r1, r3, r0)
            X.DbY.A1K(r4, r3)
            goto L_0x0818
        L_0x034f:
            java.lang.Object r6 = r2.A01
            X.4AB r6 = (X.AnonymousClass4AB) r6
            java.lang.String r0 = r6.A0E
            if (r0 != 0) goto L_0x0818
            java.lang.Object r0 = r2.A03
            X.4AL r0 = (X.AnonymousClass4AL) r0
            X.4AF r0 = r0.A05
            java.lang.Object r2 = r2.A02
            X.6r6 r2 = (X.C319726r6) r2
            r5 = 1
            X.0qQ.A0B(r2, r5)
            com.instagram.common.session.UserSession r4 = r0.A03
            X.4AD r3 = r0.A04
            r8 = 0
            com.instagram.user.model.User r0 = r6.A0A
            java.lang.String r1 = r0.getId()
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r4)
            boolean r0 = X.DbV.A1Z(r0, r1)
            if (r0 != 0) goto L_0x0818
            boolean r0 = X.C71147Oe5.A05(r4, r6)
            if (r0 == 0) goto L_0x0818
            X.60k r0 = X.C3018660j.A01(r4)
            r0.A0I(r2, r6)
            java.util.List r0 = r6.A0J
            java.util.Iterator r2 = r0.iterator()
        L_0x038d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0818
            java.lang.Object r0 = r2.next()
            X.913 r0 = (X.AnonymousClass913) r0
            X.4zZ r0 = r0.BWY()
            java.lang.String r0 = r0.A0H
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.String r13 = "❤️"
            r3.AMU(r0, r13)
            X.60k r6 = X.C3018660j.A01(r4)
            X.Nmo r7 = X.C69506Nmo.A0O
            X.HOK r9 = X.HOK.DOUBLE_TAP
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            r10 = r8
            r12 = r8
            r14 = r8
            r6.A0E(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x038d
        L_0x03bb:
            java.lang.Object r0 = r2.A03
            X.7Ff r0 = (X.C328547Ff) r0
            X.7G5 r0 = (X.AnonymousClass7G5) r0
            com.instagram.direct.model.messaginguser.MessagingUser r4 = r0.A00
            java.lang.Object r0 = r2.A02
            X.7Fg r0 = (X.C328557Fg) r0
            com.instagram.common.typedurl.ImageUrl r3 = r0.A00
            java.lang.Object r2 = r2.A01
            X.7Wl r2 = (X.C332807Wl) r2
            com.instagram.api.schemas.IGAIAgentType r1 = r4.A01
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r1 != r0) goto L_0x03d8
            r2.CfT(r3, r4)
            goto L_0x0818
        L_0x03d8:
            r0 = 2276(0x8e4, float:3.19E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.CqM(r4, r0)
            goto L_0x0818
        L_0x03e3:
            java.lang.Object r4 = r2.A01
            X.752 r4 = (X.AnonymousClass752) r4
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = r4.A06
            if (r3 == 0) goto L_0x0818
            java.lang.Object r0 = r2.A02
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0818
            java.lang.Object r0 = r2.A03
            X.78H r0 = (X.AnonymousClass78H) r0
            com.instagram.common.session.UserSession r2 = r0.A02
            goto L_0x047c
        L_0x03fc:
            java.lang.Object r0 = r2.A02
            X.MzZ r0 = (X.C68068MzZ) r0
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r0 = r0.A07
            r0.A01()
            java.lang.Object r0 = r2.A03
            X.PAu r0 = (X.C72563PAu) r0
            X.7X0 r4 = r0.A08
            X.7Vf r4 = (X.C332487Vf) r4
            java.lang.Object r3 = r2.A01
            X.7Fr r3 = (X.C328667Fr) r3
            goto L_0x044b
        L_0x0412:
            java.lang.Object r3 = r2.A03
            X.OsF r3 = (X.C71872OsF) r3
            java.lang.Object r0 = r2.A02
            X.5yB r0 = (X.C300925yB) r0
            X.5g0 r0 = X.C71872OsF.A01(r3, r0)
            java.lang.Object r4 = r2.A01
            X.1iA r4 = (X.1iA) r4
            r2 = 0
            r7 = 0
            X.NQQ r1 = new X.NQQ
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A00 = r1
            X.1ES.A03(r0)
            goto L_0x0818
        L_0x0432:
            java.lang.Object r0 = r2.A02
            X.MzZ r0 = (X.C68068MzZ) r0
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r0 = r0.A07
            r0.A01()
            java.lang.Object r0 = r2.A01
            X.NYM r0 = (X.NYM) r0
            X.7Fr r3 = r0.A02
            if (r3 == 0) goto L_0x0818
            java.lang.Object r0 = r2.A03
            X.PAx r0 = (X.C72566PAx) r0
            X.7Vf r4 = r0.A02
            if (r4 == 0) goto L_0x0818
        L_0x044b:
            X.3t3 r1 = r3.A0M
            r0 = 373(0x175, float:5.23E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3t0 r1 = (X.C254763t0) r1
            java.lang.String r1 = r1.A00
            java.lang.Long r0 = r3.A0Q
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.FKn(r1, r0)
            goto L_0x0818
        L_0x0465:
            java.lang.Object r4 = r2.A01
            X.NYd r4 = (X.C68819NYd) r4
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = r4.A04
            if (r3 == 0) goto L_0x0818
            java.lang.Object r0 = r2.A02
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0818
            java.lang.Object r0 = r2.A03
            X.7RY r0 = (X.AnonymousClass7RY) r0
            com.instagram.common.session.UserSession r2 = r0.A01
        L_0x047c:
            boolean r1 = r4.CU2()
            X.NmR r0 = X.C69483NmR.IN_THREAD
            X.C71137Odf.A04(r0, r2, r3, r1)
            goto L_0x0818
        L_0x0487:
            java.lang.Object r3 = r2.A02
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r2.A03
            r3.invoke(r1, r0)
            goto L_0x0818
        L_0x0494:
            java.lang.Object r4 = r2.A03
            X.PPx r4 = (X.C72939PPx) r4
            java.util.HashMap r5 = r4.A0N
            if (r5 == 0) goto L_0x04af
            java.lang.Object r0 = r2.A01
            X.62u r0 = (X.C3023662u) r0
            X.NAW r3 = new X.NAW
            r3.<init>(r0)
            r1 = 30
            X.Opf r0 = new X.Opf
            r0.<init>((java.lang.Object) r4, (int) r1)
            r3.A00(r0, r5)
        L_0x04af:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0O
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0818
            java.lang.Object r0 = r2.A02
            X.2HN r0 = (X.AnonymousClass2HN) r0
            X.2HR r0 = r0.A18
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x04d7
            java.lang.Object r2 = r2.A01
            X.62u r2 = (X.C3023662u) r2
            r1 = 22
            X.PqK r0 = new X.PqK
            r0.<init>(r4, r1)
            X.C69685Nq7.A00(r2, r0)
            goto L_0x0818
        L_0x04d7:
            r0 = 0
            r4.A0C = r0
            goto L_0x0818
        L_0x04dc:
            java.lang.Object r3 = r2.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r2.A01
            com.instagram.direct.securityalert.data.room.SecurityAlertDatabase r1 = (com.instagram.direct.securityalert.data.room.SecurityAlertDatabase) r1
            java.lang.Object r0 = r2.A02
            X.KbC r0 = (X.C62154KbC) r0
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r4 = new com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource
            r4.<init>(r3, r0, r1)
            return r4
        L_0x04ee:
            java.lang.Object r3 = r2.A03
            X.Pvd r3 = (X.C74483Pvd) r3
            java.lang.Object r1 = r2.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r2.A01
            X.Glz r0 = (X.C53313Glz) r0
            X.4Yx r0 = r0.A07
            java.lang.String r0 = X.C51968G9o.A11(r1, r0)
            r3.DMk(r0)
            goto L_0x0818
        L_0x0505:
            java.lang.Object r3 = r2.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager) r1
            java.lang.Object r0 = r2.A01
            X.61K r0 = (X.AnonymousClass61K) r0
            X.Mh1 r4 = new X.Mh1
            r4.<init>(r3, r0, r1)
            return r4
        L_0x0517:
            java.lang.Object r5 = r2.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r2.A01
            X.4DU r4 = (X.AnonymousClass4DU) r4
            java.lang.Object r3 = r2.A02
            X.1L5 r3 = (X.1L5) r3
            r1 = 0
            X.IYx r0 = new X.IYx
            r0.<init>(r5, r4, r1)
            X.2pc r2 = X.C230432pc.EXPLORE
            X.5pZ r1 = new X.5pZ
            r1.<init>(r5, r2, r0)
            X.5pa r0 = new X.5pa
            r0.<init>(r2)
            X.5pc r0 = X.C296175pb.A00(r5, r3, r0)
            X.5lS r4 = new X.5lS
            r4.<init>(r0, r1)
            return r4
        L_0x053f:
            java.lang.Object r4 = r2.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r1 = r2.A01
            X.4DU r1 = (X.AnonymousClass4DU) r1
            java.lang.Object r3 = r2.A02
            X.1L5 r3 = (X.1L5) r3
            r0 = 0
            X.IYV r2 = new X.IYV
            r2.<init>(r4, r1, r0)
            X.2pc r0 = X.C230432pc.EXPLORE
            X.5pS r1 = new X.5pS
            r1.<init>(r4, r2, r0)
            X.5pU r0 = X.C296095pT.A00(r4, r3)
            X.IYd r4 = new X.IYd
            r4.<init>(r0, r1)
            return r4
        L_0x0562:
            java.lang.Object r4 = r2.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r1 = r2.A01
            X.4DU r1 = (X.AnonymousClass4DU) r1
            java.lang.Object r3 = r2.A02
            X.1L5 r3 = (X.1L5) r3
            r0 = 1
            X.IYV r2 = new X.IYV
            r2.<init>(r4, r1, r0)
            X.2pc r0 = X.C230432pc.EXPLORE_GRID
            X.5pS r1 = new X.5pS
            r1.<init>(r4, r2, r0)
            X.5pU r0 = X.C296095pT.A00(r4, r3)
            X.GWt r4 = new X.GWt
            r4.<init>(r0, r1)
            return r4
        L_0x0585:
            java.lang.Object r3 = r2.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r2.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.1OP r0 = X.1OP.$redex_init_class
            X.AnonymousClass7TG.A1N(r3, r1)
            com.instagram.model.reels.Reel r0 = X.AnonymousClass3PQ.A02(r3, r1)
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Object r0 = r2.A01
            X.MzF r0 = (X.C68048MzF) r0
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r0.A0G
            if (r1 == 0) goto L_0x05a7
            r0.A02()
            goto L_0x0818
        L_0x05a7:
            r0.A04()
            goto L_0x0818
        L_0x05ac:
            java.lang.Object r3 = r2.A03
            com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel r3 = (com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel) r3
            java.lang.Object r12 = r2.A02
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            X.AnonymousClass7TG.A1N(r12, r4)
            X.0Ud r1 = r3.A0A
            java.lang.Object r0 = r1.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r5 = r0.A06
            java.lang.Object r0 = r1.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            int r1 = r0.A00
            java.lang.Object r0 = X.00k.A0O(r5, r1)
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            r11 = 0
            if (r0 == 0) goto L_0x05f2
            java.lang.String r8 = r0.A03
        L_0x05d8:
            X.FGy r9 = X.C49965FGy.A00
            androidx.fragment.app.FragmentActivity r10 = r3.A00
            X.OMy r0 = r3.A03
            X.OLm r0 = r0.A00()
            X.4oc r2 = r0.A03
            if (r2 == 0) goto L_0x05ed
            X.4oe r0 = new X.4oe
            r0.<init>(r2)
            X.4oV r11 = r0.A01
        L_0x05ed:
            java.lang.String r13 = "headerCtaDestination"
            java.lang.String r14 = "tischu_header"
            goto L_0x0639
        L_0x05f2:
            r8 = r11
            goto L_0x05d8
        L_0x05f4:
            java.lang.Object r3 = r2.A03
            com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel r3 = (com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel) r3
            java.lang.Object r12 = r2.A02
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            X.AnonymousClass7TG.A1N(r12, r4)
            X.0Ud r1 = r3.A0A
            java.lang.Object r0 = r1.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r5 = r0.A06
            java.lang.Object r0 = r1.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            int r1 = r0.A00
            java.lang.Object r0 = X.00k.A0O(r5, r1)
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            r11 = 0
            if (r0 == 0) goto L_0x0659
            java.lang.String r8 = r0.A03
        L_0x0620:
            X.FGy r9 = X.C49965FGy.A00
            androidx.fragment.app.FragmentActivity r10 = r3.A00
            X.OMy r0 = r3.A03
            X.OLm r0 = r0.A00()
            X.4oc r2 = r0.A03
            if (r2 == 0) goto L_0x0635
            X.4oe r0 = new X.4oe
            r0.<init>(r2)
            X.4oV r11 = r0.A00
        L_0x0635:
            java.lang.String r13 = "endCardDestination"
            java.lang.String r14 = "tischu"
        L_0x0639:
            r9.A07(r10, r11, r12, r13, r14)
            X.GXx r6 = r3.A04
            int r13 = r5.size()
            boolean r14 = X.0oI.A0A(r4)
            java.lang.Integer r0 = r3.A07
            java.lang.String r11 = X.C292845jc.A00(r0)
            java.lang.String r12 = r3.A08
            r9 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r10 = r9
            r6.Cjb(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0818
        L_0x0659:
            r8 = r11
            goto L_0x0620
        L_0x065b:
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.A03
            X.1Xj r2 = r1.A1c(r0)
            if (r2 != 0) goto L_0x066c
            r2 = r1
        L_0x066c:
            X.4w4 r0 = r2.BQf()
            if (r0 == 0) goto L_0x06ae
            X.4w4 r0 = r2.BQf()
            if (r0 == 0) goto L_0x0687
            java.lang.Integer r1 = X.C52501GVd.A03(r0)
        L_0x067c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x06ae
            boolean r0 = r2.A5f()
            if (r0 == 0) goto L_0x06ae
            goto L_0x06a8
        L_0x0687:
            r1 = 0
            goto L_0x067c
        L_0x0689:
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.A03
            X.1Xj r0 = r1.A1c(r0)
            if (r0 != 0) goto L_0x069a
            r0 = r1
        L_0x069a:
            X.4w4 r0 = r0.BQf()
            if (r0 == 0) goto L_0x06b0
            java.lang.Integer r1 = X.C52501GVd.A03(r0)
        L_0x06a4:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x06ae
        L_0x06a8:
            r0 = 1
        L_0x06a9:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x06ae:
            r0 = 0
            goto L_0x06a9
        L_0x06b0:
            r1 = 0
            goto L_0x06a4
        L_0x06b2:
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.A03
            X.1Xj r0 = r1.A1c(r0)
            if (r0 != 0) goto L_0x06c3
            r0 = r1
        L_0x06c3:
            X.4w4 r4 = r0.BQf()
            return r4
        L_0x06c8:
            java.lang.Object r5 = r2.A03
            android.view.View r5 = (android.view.View) r5
            float r0 = X.AnonymousClass7TE.A02(r5)
            float r1 = -r0
            java.lang.Object r0 = r2.A02
            X.4ne r0 = (X.C274064ne) r0
            android.view.View r0 = r0.A03
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            int r0 = X.AnonymousClass0nB.A01(r0)
            float r0 = (float) r0
            float r1 = r1 + r0
            r0 = 0
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r4.<init>(r0, r1, r0, r0)
            java.lang.Object r1 = r2.A01
            X.JwC r1 = (X.C61074JwC) r1
            java.lang.Object r0 = r1.A00
            X.N4R r0 = (X.N4R) r0
            if (r0 == 0) goto L_0x0726
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0726
        L_0x06f7:
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0720;
                case 2: goto L_0x0723;
                default: goto L_0x06fe;
            }
        L_0x06fe:
            r2 = 2000(0x7d0, double:9.88E-321)
        L_0x0700:
            java.lang.Object r0 = r1.A03
            int r0 = X.DbS.A05(r0)
            long r0 = (long) r0
            long r2 = r2 * r0
            r4.setDuration(r2)
            r0 = 1
            r4.setFillAfter(r0)
            r0 = 0
            r4.setRepeatCount(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
            r5.startAnimation(r4)
            goto L_0x0818
        L_0x0720:
            r2 = 3000(0xbb8, double:1.482E-320)
            goto L_0x0700
        L_0x0723:
            r2 = 4000(0xfa0, double:1.9763E-320)
            goto L_0x0700
        L_0x0726:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x06f7
        L_0x0729:
            java.lang.Object r0 = r2.A03
            X.Hib r0 = (X.C55493Hib) r0
            X.32k r3 = r0.A00
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r3.DTi(r1, r0)
            goto L_0x0818
        L_0x073c:
            java.lang.Object r0 = r2.A03
            X.Hib r0 = (X.C55493Hib) r0
            X.32k r3 = r0.A00
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r3.D9M(r1, r0)
            goto L_0x0818
        L_0x074f:
            java.lang.Object r0 = r2.A03
            X.A4C r0 = (X.A4C) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3fg r3 = new X.3fg
            r3.<init>(r0)
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.3fk r4 = r3.A00(r1, r0)
            return r4
        L_0x0767:
            java.lang.Object r0 = r2.A03
            X.3Yc r0 = (X.C243273Yc) r0
            X.3Yb r0 = r0.A01
            X.41G r3 = r0.BRE()
            java.lang.Object r1 = r2.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            r3.Djh(r1, r0)
            goto L_0x0818
        L_0x077e:
            java.lang.Object r0 = r2.A03
            X.Gsg r0 = (X.C53689Gsg) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            java.lang.Object r3 = r2.A01
            X.IU4 r3 = (X.IU4) r3
            X.0Pk r1 = X.0Pl.A0n
            java.lang.Object r0 = r2.A02
            X.2Wb r0 = (X.2Wb) r0
            android.content.Context r0 = X.C51966G9m.A0O(r0)
            X.0Pl r2 = r1.A00(r0, r4)
            r1 = 1
            X.3Ws r0 = new X.3Ws
            r0.<init>(r4, r3, r2, r1)
            X.3Zn r4 = new X.3Zn
            r4.<init>(r0)
            return r4
        L_0x07a2:
            java.lang.Object r5 = r2.A02
            X.2V5 r5 = (X.2V5) r5
            java.lang.Object r3 = r2.A03
            X.2V5 r3 = (X.2V5) r3
            java.lang.Object r1 = r2.A01
            X.2V5 r1 = (X.2V5) r1
            r0 = 1
            X.GA2 r4 = new X.GA2
            r4.<init>(r5, r3, r1, r0)
            return r4
        L_0x07b5:
            java.lang.Object r0 = r2.A01
            X.7Pr r0 = (X.C331127Pr) r0
            X.7Pu r3 = r0.A00()
            java.lang.Object r0 = r2.A03
            X.33A r0 = (X.AnonymousClass33A) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3.A02(r1, r0)
            goto L_0x0818
        L_0x07cb:
            java.lang.Object r3 = r2.A03
            X.33r r3 = (X.C2364233r) r3
            java.lang.Object r1 = r2.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0iw r3 = r3.A01
            com.instagram.common.typedurl.ImageUrl r2 = r1.Bh3()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626879(0x7f0e0b7f, float:1.8881007E38)
            android.view.View r4 = X.DbU.A08(r1, r0)
            X.0qQ.A07(r4)
            java.lang.String r0 = r2.BZG()
            android.net.Uri r1 = android.net.Uri.parse(r0)
            X.0qQ.A07(r1)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A00(r1, r0, r0)
            r0 = 2131438499(0x7f0b2ba3, float:1.8498927E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbX.A0b(r4, r0)
            r0.setUrl(r1, r3)
            return r4
        L_0x0806:
            java.lang.Object r4 = r2.A01
            com.instagram.feed.widget.IgProgressImageView r4 = (com.instagram.feed.widget.IgProgressImageView) r4
            java.lang.Object r0 = r2.A03
            X.3fX r0 = (X.C246953fX) r0
            com.instagram.common.typedurl.ImageUrl r3 = r0.A02
            java.lang.Object r1 = r2.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            r0 = 1
            r4.A09(r1, r3, r0)
        L_0x0818:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x081b:
            java.lang.Object r1 = r2.A03
            X.33e r1 = (X.C2362933e) r1
            X.33Z r0 = r1.A05
            X.0eM r0 = r0.A0f
            java.lang.Object r5 = r0.getValue()
            com.instagram.common.session.UserSession r4 = r1.A02
            java.lang.Object r8 = r2.A01
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r7 = r2.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            X.2xS r3 = r1.A08
            X.AnonymousClass7TG.A1O(r8, r7)
            X.4bN r2 = X.C295375o3.A02(r8)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE
            X.4h3 r6 = X.C51965G9l.A0i(r0, r4)
            r1 = 0
            X.1se r0 = X.1sd.A00(r4)
            X.GDe r39 = X.C52057GDd.A01(r2, r4, r0, r7, r1)
            java.lang.String r0 = r8.getId()
            r6.A1C = r0
            com.instagram.clips.intf.ClipsViewerConfig r15 = r6.A00()
            X.GEG r38 = X.GEF.A00(r15, r2, r4)
            r0 = 39
            X.JGK r24 = X.JGK.A01(r3, r0)
            r0 = 6
            X.JK3 r14 = new X.JK3
            r14.<init>(r5, r0)
            r1 = 36
            X.J6H r13 = new X.J6H
            r13.<init>(r4, r1)
            r0 = 16
            X.JK0 r12 = new X.JK0
            r12.<init>(r5, r0)
            r0 = 37
            X.JJR r30 = X.JJR.A00(r5, r0)
            r0 = 41
            X.JGK r25 = X.JGK.A01(r5, r0)
            r0 = 42
            X.JGK r26 = X.JGK.A01(r5, r0)
            r0 = 17
            X.JK0 r11 = new X.JK0
            r11.<init>(r5, r0)
            r6 = 38
            X.JJR r31 = X.JJR.A00(r5, r6)
            r0 = 25
            X.JG2 r10 = new X.JG2
            r10.<init>(r0, r4, r5)
            r4 = 35
            X.JJR r32 = X.JJR.A00(r5, r4)
            r0 = 29
            X.Ivt r9 = new X.Ivt
            r9.<init>(r5, r0)
            r0 = 30
            X.Ivt r8 = new X.Ivt
            r8.<init>(r5, r0)
            r0 = 33
            X.J6H r7 = new X.J6H
            r7.<init>(r5, r0)
            X.JGK r28 = X.JGK.A01(r5, r6)
            r0 = 31
            X.Ivt r6 = new X.Ivt
            r6.<init>(r3, r0)
            r0 = 15
            X.JK0 r3 = new X.JK0
            r3.<init>(r5, r0)
            X.JJR r33 = X.JJR.A00(r5, r1)
            r0 = 34
            X.J6H r1 = new X.J6H
            r1.<init>(r5, r0)
            X.J6H r0 = new X.J6H
            r0.<init>(r5, r4)
            r4 = 40
            X.JGK r29 = X.JGK.A01(r5, r4)
            X.HpI r16 = new X.HpI
            r27 = r10
            r34 = r12
            r35 = r11
            r36 = r3
            r37 = r14
            r20 = r13
            r21 = r7
            r22 = r1
            r23 = r0
            r18 = r8
            r19 = r6
            r17 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r35 = 5
            X.GnX r4 = new X.GnX
            r34 = r4
            r36 = r16
            r37 = r2
            r40 = r15
            r34.<init>(r35, r36, r37, r38, r39, r40)
            return r4
        L_0x0907:
            java.lang.Object r0 = r2.A03
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A0g
            r0.getValue()
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = X.C248023hI.A00(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0923:
            java.lang.Object r5 = r2.A03
            X.33e r5 = (X.C2362933e) r5
            X.33Z r0 = r5.A05
            X.0eM r0 = r0.A0g
            java.lang.Object r4 = r0.getValue()
            X.3hI r4 = (X.C248023hI) r4
            java.lang.Object r3 = r2.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r2.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            X.4DU r0 = r5.A06
            X.9IV r4 = r4.A01(r3, r0, r1)
            return r4
        L_0x0940:
            java.lang.Object r0 = r2.A03
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A0c
            java.lang.Object r3 = r0.getValue()
            X.I0c r3 = (X.C56531I0c) r3
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.Gli r4 = r3.A01(r0, r1)
            return r4
        L_0x095f:
            java.lang.Object r0 = r2.A03
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A07
            r0.getValue()
            java.lang.Object r1 = r2.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r2.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            int r0 = r0.A03
            X.1Xj r0 = r1.A1c(r0)
            if (r0 != 0) goto L_0x097e
            r0 = r1
        L_0x097e:
            X.4g6 r0 = r0.A06
            if (r0 == 0) goto L_0x098e
            X.4hR r0 = r0.A01
            X.3ew r1 = r0.A01()
            r0 = 0
            X.68u r4 = X.C3034368u.A02(r0, r1)
            return r4
        L_0x098e:
            r4 = 0
            return r4
        L_0x0990:
            java.lang.Object r4 = r2.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58195Inz.invoke():java.lang.Object");
    }
}
