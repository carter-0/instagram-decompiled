package X;

public final class JJR extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJR(Object obj, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
    }

    public static JJR A00(Object obj, int i) {
        return new JJR(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: X.HnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: X.Cw1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: X.Cvw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: X.A9t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: X.N2G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v42, resolved type: X.HnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v43, resolved type: X.HnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v44, resolved type: X.HnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v45, resolved type: X.HnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v46, resolved type: X.HnA} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0606, code lost:
        r0 = (X.1Xj) r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0652, code lost:
        if (r0 == null) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0654, code lost:
        r1 = new com.instagram.model.mediasize.ExtendedImageUrl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x066e, code lost:
        return new X.C61078JwG(X.AnonymousClass7TE.A1I(X.C71152OeO.A0E(r1, r3, r2, X.I6A.A02(X.C69421Nl3.NOTE, r10))), 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x066f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06c0, code lost:
        return X.I6A.A00(r11, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x09c0, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x09c7, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0b26, code lost:
        r10.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0baf, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0926  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x092e A[SYNTHETIC, Splitter:B:288:0x092e] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0c21  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            r42 = this;
            r1 = r42
            r0 = r43
            r10 = r44
            r11 = r45
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0078;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00ea;
                case 4: goto L_0x01a4;
                case 5: goto L_0x01d7;
                case 6: goto L_0x0234;
                case 7: goto L_0x026d;
                case 8: goto L_0x031f;
                case 9: goto L_0x0368;
                case 10: goto L_0x039d;
                case 11: goto L_0x03e4;
                case 12: goto L_0x0675;
                case 13: goto L_0x0440;
                case 14: goto L_0x0499;
                case 15: goto L_0x04bd;
                case 16: goto L_0x058c;
                case 17: goto L_0x05d9;
                case 18: goto L_0x000d;
                case 19: goto L_0x000d;
                case 20: goto L_0x05e9;
                case 21: goto L_0x05f7;
                case 22: goto L_0x000d;
                case 23: goto L_0x000d;
                case 24: goto L_0x060c;
                case 25: goto L_0x0619;
                case 26: goto L_0x062a;
                case 27: goto L_0x0637;
                case 28: goto L_0x0644;
                case 29: goto L_0x000d;
                case 30: goto L_0x06a1;
                case 31: goto L_0x06af;
                case 32: goto L_0x05d9;
                case 33: goto L_0x05d9;
                case 34: goto L_0x06c1;
                case 35: goto L_0x06ca;
                case 36: goto L_0x06e0;
                case 37: goto L_0x06f5;
                case 38: goto L_0x070b;
                case 39: goto L_0x0721;
                case 40: goto L_0x076a;
                case 41: goto L_0x077a;
                case 42: goto L_0x07a7;
                case 43: goto L_0x07db;
                case 44: goto L_0x0801;
                case 45: goto L_0x08b9;
                case 46: goto L_0x0a76;
                case 47: goto L_0x0ac5;
                case 48: goto L_0x0aeb;
                case 49: goto L_0x0b2b;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.3FZ r11 = (X.AnonymousClass3FZ) r11
            r0 = 2
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = X.AnonymousClass9NF.A00()
            java.lang.String r2 = r11.A05(r0)
            X.Nl3 r1 = X.C69421Nl3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "content_type"
            java.lang.Enum r0 = r11.A04(r0, r1)
            X.Nl3 r0 = (X.C69421Nl3) r0
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "target_url"
            java.lang.String r0 = r11.A05(r0)
            X.3tC r0 = X.C71152OeO.A0J(r2, r1, r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 9
            X.JwG r2 = new X.JwG
            r2.<init>((java.util.List) r1, (int) r0)
            return r2
        L_0x003f:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x004f
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x004f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005d
            r2 = -250036106(0xfffffffff118c076, float:-7.563903E29)
            java.lang.String r0 = "com.instagram.creation.genai.memu.settings.MemuSettingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MemuSettingsFragment.kt:170)"
            X.0fL.A01(r2, r0)
        L_0x005d:
            r0 = 2131966071(0x7f133877, float:1.956897E38)
            java.lang.String r3 = X.C304346Dc.A00(r10, r0)
            r0 = 2131966072(0x7f133878, float:1.9568972E38)
            java.lang.String r2 = X.C304346Dc.A00(r10, r0)
            java.lang.Object r0 = r1.A01
            boolean r0 = X.I6P.A05(r10, r0, r3, r2)
            if (r0 == 0) goto L_0x0bad
            r0 = 1402958888(0x539f7428, float:1.36969716E12)
            goto L_0x0b21
        L_0x0078:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x0088
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0088:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0096
            r2 = 1625370778(0x60e1309a, float:1.2981311E20)
            java.lang.String r0 = "com.instagram.creation.genai.memu.settings.MemuSettingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MemuSettingsFragment.kt:191)"
            X.0fL.A01(r2, r0)
        L_0x0096:
            r3 = 2131966090(0x7f13388a, float:1.9569008E38)
            r0 = -305553787(0xffffffffedc99e85, float:-7.7997657E27)
            r10.ExS(r0)
            java.lang.Object r2 = r1.A01
            boolean r0 = r10.AGw(r2)
            java.lang.Object r1 = r10.ECw()
            if (r0 != 0) goto L_0x00af
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x00b5
        L_0x00af:
            r0 = 28
            X.Ivh r1 = X.C58672Ivh.A00(r10, r2, r0)
        L_0x00b5:
            X.0sa r1 = (X.C62320sa) r1
            boolean r0 = X.C51968G9o.A1Y(r10)
            X.I6P.A03(r10, r1, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 1049902511(0x3e943daf, float:0.2895331)
            goto L_0x0b21
        L_0x00c9:
            boolean r0 = X.G9w.A1a(r11)
            if (r0 == 0) goto L_0x00d7
            r2 = 879840031(0x34714b1f, float:2.2472203E-7)
            java.lang.String r0 = "com.instagram.creation.genai.themes.ui.AiThemesAnimatedContentForStates.<anonymous> (AiThemesScreen.kt:186)"
            X.0fL.A01(r2, r0)
        L_0x00d7:
            java.lang.Object r1 = r1.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 0
            X.C51967G9n.A1P(r10, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 643485781(0x265ad055, float:7.5916286E-16)
            goto L_0x0b21
        L_0x00ea:
            X.5Wy r10 = (X.C286575Wy) r10
            int r3 = X.AnonymousClass7TE.A0M(r11)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            r3 = r3 & 17
            r0 = 16
            if (r3 != r0) goto L_0x0100
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0100:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x010e
            r3 = -5952520(0xffffffffffa52bf8, float:NaN)
            java.lang.String r0 = "com.instagram.creator.achievements.modules.fragments.AboutAchievementsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutAchievementsFragment.kt:125)"
            X.0fL.A01(r3, r0)
        L_0x010e:
            X.5Zr r8 = X.C287215Zl.A00
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            r0 = 1107296256(0x42000000, float:32.0)
            r4 = 0
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A09(r7, r4, r0)
            java.lang.Object r6 = r1.A01
            X.QP7 r6 = (X.QP7) r6
            X.5Zx r0 = X.C287275Zs.A07
            r3 = 48
            X.5RD r1 = X.C291495hO.A02(r0, r10, r8, r3)
            int r9 = X.C287425a7.A00(r10)
            r8 = r10
            X.5Wx r8 = (X.C286565Wx) r8
            X.5RM r0 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r10, r5)
            X.C51973G9u.A0y(r10, r8)
            X.C51971G9r.A12(r10, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x0146
            boolean r0 = X.C51972G9s.A1Q(r10, r9)
            if (r0 != 0) goto L_0x0149
        L_0x0146:
            X.C51971G9r.A13(r10, r1, r9)
        L_0x0149:
            X.C51965G9l.A18(r10, r5)
            java.lang.String r0 = r6.A04
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r25 = 0
            r11 = 0
            X.2DN r5 = X.1zC.A00(r10, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r7, r4, r4, r4, r0)
            r1 = 1132756992(0x43848000, float:265.0)
            r0 = 1122107392(0x42e20000, float:113.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0G(r4, r1, r0)
            X.AnonymousClass6G3.A05(r10, r0, r5)
            java.lang.String r1 = r6.A06
            X.5ZE r0 = X.AnonymousClass5aQ.A01(r10)
            X.5Z4 r12 = r0.A08
            r0 = 24
            long r27 = X.AnonymousClass5Z7.A01(r0)
            r0 = 30
            long r29 = X.AnonymousClass5Z7.A01(r0)
            r18 = 3
            r22 = 3072(0xc00, float:4.305E-42)
            r24 = 14198(0x3776, float:1.9896E-41)
            r13 = r11
            r14 = r11
            r15 = r11
            r17 = r11
            r19 = r2
            r20 = r2
            r21 = r2
            r23 = r3
            r31 = r2
            r16 = r1
            X.AnonymousClass5ZZ.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31)
            boolean r0 = X.C51967G9n.A1R(r10)
            if (r0 == 0) goto L_0x0bad
            r0 = -240927773(0xfffffffff1a3bbe3, float:-1.6215423E30)
            goto L_0x0b21
        L_0x01a4:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x01b4
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x01b4:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01c2
            r2 = 663456326(0x278b8a46, float:3.8730166E-15)
            java.lang.String r0 = "com.instagram.creator.agent.exampledialog.getExamplesSection.<anonymous> (ExampleDialogComponent.kt:59)"
            X.0fL.A01(r2, r0)
        L_0x01c2:
            java.lang.Object r1 = r1.A01
            X.JLy r1 = (X.C59500JLy) r1
            X.Gq1 r1 = (X.C53531Gq1) r1
            r0 = 0
            X.C56492HzO.A00(r10, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 1398267696(0x5357df30, float:9.2716243E11)
            goto L_0x0b21
        L_0x01d7:
            X.5Wy r10 = (X.C286575Wy) r10
            int r3 = X.AnonymousClass7TE.A0M(r11)
            r15 = 0
            X.0qQ.A0B(r0, r15)
            r2 = r3 & 6
            if (r2 != 0) goto L_0x01ea
            int r0 = X.G9t.A0O(r10, r0)
            r3 = r3 | r0
        L_0x01ea:
            r2 = r3 & 19
            r0 = 18
            if (r2 != r0) goto L_0x01f6
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x01f6:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0204
            r2 = -492099781(0xffffffffe2ab273b, float:-1.57861E21)
            java.lang.String r0 = "com.instagram.creator.agent.settings.audience.Layout.<anonymous>.<anonymous>.<anonymous> (SelectAccountsFragment.kt:203)"
            X.0fL.A01(r2, r0)
        L_0x0204:
            java.lang.Object r0 = r1.A01
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            r0 = 2131966740(0x7f133b14, float:1.9570327E38)
            if (r1 != 0) goto L_0x0218
            r0 = 2131974662(0x7f135a06, float:1.9586394E38)
        L_0x0218:
            java.lang.String r14 = X.C288035bG.A00(r10, r0)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r12 = 0
            androidx.compose.ui.Modifier r11 = r0.Ezh(new androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement(X.C51976G9y.A0A()))
            r16 = 60
            r13 = r12
            X.C52747Gbz.A00(r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = -219972883(0xfffffffff2e37aed, float:-9.011418E30)
            goto L_0x0b21
        L_0x0234:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x0244
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0244:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0252
            r2 = 795385349(0x2f689e05, float:2.1156417E-10)
            java.lang.String r0 = "com.instagram.creator.agent.settings.audience.Layout.<anonymous>.<anonymous>.<anonymous> (SelectAccountsFragment.kt:214)"
            X.0fL.A01(r2, r0)
        L_0x0252:
            java.lang.Object r12 = r1.A01
            X.0sa r12 = (X.C62320sa) r12
            androidx.compose.ui.Modifier r11 = X.C51969G9p.A0U()
            r15 = 0
            r13 = 48
            r14 = 4
            X.HXX.A00(r10, r11, r12, r13, r14, r15)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = -658232363(0xffffffffd8c42bd5, float:-1.72554029E15)
            goto L_0x0b21
        L_0x026d:
            X.5Wy r10 = (X.C286575Wy) r10
            int r3 = X.AnonymousClass7TE.A0M(r11)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            r0 = r3 & 17
            r4 = 16
            if (r0 != r4) goto L_0x0283
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0283:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0291
            r3 = 385620353(0x16fc1981, float:4.072889E-25)
            java.lang.String r0 = "com.instagram.creator.agent.settings.avoidedtopics.fragment.avoidedTopicsList.<anonymous> (AvoidedTopicsFragment.kt:240)"
            X.0fL.A01(r3, r0)
        L_0x0291:
            r0 = -1275029430(0xffffffffb400984a, float:-1.1976331E-7)
            r10.ExS(r0)
            X.6Bd r11 = new X.6Bd
            r11.<init>(r4)
            r0 = 2131953550(0x7f13078e, float:1.9543574E38)
            java.lang.String r13 = X.C288035bG.A00(r10, r0)
            r0 = 2131953549(0x7f13078d, float:1.9543572E38)
            java.lang.String r6 = X.C288035bG.A00(r10, r0)
            r0 = 2131953547(0x7f13078b, float:1.9543568E38)
            java.lang.String r12 = X.C288035bG.A00(r10, r0)
            r11.A09(r12)
            java.lang.String r14 = "learn_more"
            r0 = 872(0x368, float:1.222E-42)
            java.lang.String r15 = X.C66579MXk.A00(r0)
            r16 = 27656(0x6c08, float:3.8754E-41)
            X.C56580I2k.A00(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r7 = "community_guidelines"
            r0 = 78
            java.lang.String r8 = X.C273654mx.A00(r0)
            r3 = r10
            r4 = r11
            r5 = r12
            r9 = r16
            X.C56580I2k.A00(r3, r4, r5, r6, r7, r8, r9)
            X.5Tq r12 = r11.A02()
            X.5Wx r4 = X.C51965G9l.A0H(r10, r2)
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r3 = 1098907648(0x41800000, float:16.0)
            r2 = 0
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r5, r3, r2, r3, r0)
            X.5Z4 r13 = X.C51966G9m.A0b(r10)
            long r15 = X.C51966G9m.A0M(r10)
            r0 = -1275003428(0xffffffffb400fddc, float:-1.2013282E-7)
            boolean r3 = X.C51967G9n.A1Y(r10, r12, r0)
            java.lang.Object r2 = r1.A01
            boolean r0 = r10.AGu(r2)
            r0 = r0 | r3
            java.lang.Object r1 = r10.ECw()
            if (r0 != 0) goto L_0x0304
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x030d
        L_0x0304:
            r0 = 1
            X.PqX r1 = new X.PqX
            r1.<init>((int) r0, (java.lang.Object) r12, (java.lang.Object) r2)
            r10.FLL(r1)
        L_0x030d:
            X.0sP r14 = X.C51965G9l.A0z(r4, r1)
            com.instagram.compose.core.ui.IgClickableTextKt.A08(r10, r11, r12, r13, r14, r15)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 408518082(0x18597dc2, float:2.8110084E-24)
            goto L_0x0b21
        L_0x031f:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x032f
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x032f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x033d
            r2 = 630118191(0x258ed72f, float:2.4778887E-16)
            java.lang.String r0 = "com.instagram.creator.agent.settings.avoidedtopics.fragment.avoidedTopicsList.<anonymous> (AvoidedTopicsFragment.kt:271)"
            X.0fL.A01(r2, r0)
        L_0x033d:
            r0 = 2131953552(0x7f130790, float:1.9543578E38)
            r15 = 0
            java.lang.String r14 = X.C304346Dc.A00(r10, r0)
            r11 = 0
            r0 = 2131952266(0x7f13028a, float:1.954097E38)
            java.lang.String r2 = X.C304346Dc.A00(r10, r0)
            java.lang.Object r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            r0 = 1
            X.IPk r12 = new X.IPk
            r12.<init>(r2, r1, r0)
            r16 = 46
            r13 = r11
            X.C52747Gbz.A00(r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 865494571(0x3396662b, float:7.0035036E-8)
            goto L_0x0b21
        L_0x0368:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x0378
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0378:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0386
            r2 = 214392822(0xcc75ff6, float:3.071856E-31)
            java.lang.String r0 = "com.instagram.creator.agent.settings.fragment.CreatorAiSettings.<anonymous>.<anonymous>.<anonymous> (CreatorAISettingsComposableFragment.kt:344)"
            X.0fL.A01(r2, r0)
        L_0x0386:
            java.lang.Object r0 = r1.A01
            X.GnI r0 = (X.C53386GnI) r0
            java.lang.String r2 = r0.A06
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01
            r0 = 0
            X.C56651I6g.A03(r10, r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 1684629743(0x646968ef, float:1.722261E22)
            goto L_0x0b21
        L_0x039d:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x03ad
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x03ad:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x03bb
            r2 = -1092124844(0xffffffffbee77f54, float:-0.4521433)
            java.lang.String r0 = "com.instagram.creator.agent.settings.fragment.CreatorAiSettings.<anonymous>.<anonymous>.<anonymous> (CreatorAISettingsComposableFragment.kt:347)"
            X.0fL.A01(r2, r0)
        L_0x03bb:
            r4 = 0
            r14 = 5
            int r13 = X.C51972G9s.A05(r4, r14)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r3 = 0
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A04(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r2, r3, r3, r3, r0)
            java.lang.Object r12 = r1.A01
            X.0sa r12 = (X.C62320sa) r12
            r15 = 432(0x1b0, float:6.05E-43)
            r16 = r4
            X.HZL.A00(r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 507369368(0x1e3dd798, float:1.00501604E-20)
            goto L_0x0b21
        L_0x03e4:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.AnonymousClass7TE.A0M(r11)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            r2 = r2 & 17
            r0 = 16
            if (r2 != r0) goto L_0x03fa
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x03fa:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0408
            r2 = 912934735(0x366a474f, float:3.4910224E-6)
            java.lang.String r0 = "com.instagram.creator.agent.settings.keyword.KeywordLinkScreen.<anonymous>.<anonymous>.<anonymous> (KeywordResponsesListFragment.kt:177)"
            X.0fL.A01(r2, r0)
        L_0x0408:
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r0 = 1107296256(0x42000000, float:32.0)
            androidx.compose.ui.Modifier r2 = X.C51967G9n.A0D(r2, r0)
            java.lang.Object r1 = r1.A01
            if (r1 != 0) goto L_0x0432
            r0 = 1656308582(0x62b94366, float:1.7087521E21)
            r10.ExS(r0)
            r0 = 2131956990(0x7f1314fe, float:1.9550551E38)
            java.lang.String r0 = X.C288035bG.A00(r10, r0)
        L_0x0421:
            X.C51965G9l.A1X(r10, r3)
            X.C52747Gbz.A02(r10, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = -1535691019(0xffffffffa47736f5, float:-5.3606138E-17)
            goto L_0x0b21
        L_0x0432:
            r0 = 1656311032(0x62b94cf8, float:1.7090969E21)
            r10.ExS(r0)
            r0 = 2131956991(0x7f1314ff, float:1.9550553E38)
            java.lang.String r0 = X.C51968G9o.A14(r10, r1, r0)
            goto L_0x0421
        L_0x0440:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x0450
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0450:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x045e
            r2 = 1701442754(0x6569f4c2, float:6.905165E22)
            java.lang.String r0 = "com.instagram.direct.fragment.managefolders.AddChats.<anonymous>.<anonymous> (DirectManageFoldersCreateFolderFragment.kt:243)"
            X.0fL.A01(r2, r0)
        L_0x045e:
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            java.lang.Object r0 = X.00k.A0O(r4, r3)
            X.2Er r0 = (X.2Er) r0
            r2 = 0
            if (r0 == 0) goto L_0x0497
            com.instagram.user.model.User r0 = r0.BZK()
            if (r0 == 0) goto L_0x0497
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
        L_0x0476:
            r0 = 1
            java.lang.Object r0 = X.00k.A0O(r4, r0)
            X.2Er r0 = (X.2Er) r0
            if (r0 == 0) goto L_0x0489
            com.instagram.user.model.User r0 = r0.BZK()
            if (r0 == 0) goto L_0x0489
            com.instagram.common.typedurl.ImageUrl r2 = r0.Bh3()
        L_0x0489:
            X.C56290Hw3.A00(r10, r1, r2, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 1407310398(0x53e1da3e, float:1.94005828E12)
            goto L_0x0b21
        L_0x0497:
            r1 = r2
            goto L_0x0476
        L_0x0499:
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r10 = (java.util.List) r10
            X.NmO r11 = (X.C69480NmO) r11
            X.AnonymousClass7TG.A1T(r0, r10, r11)
            java.lang.Object r1 = r1.A01
            X.OHJ r1 = (X.OHJ) r1
            X.P3E r1 = r1.A03
            com.instagram.common.session.UserSession r3 = r1.A0G
            X.0iw r2 = r1.A0F
            java.lang.String r1 = r1.A0U
            r14 = 0
            r18 = 0
            r12 = r2
            r13 = r3
            r15 = r0
            r16 = r1
            r17 = r10
            X.C71048OaQ.A03(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0bad
        L_0x04bd:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.AnonymousClass7TE.A0M(r11)
            r5 = 0
            X.0qQ.A0B(r0, r5)
            r0 = r2 & 17
            r3 = 16
            if (r0 != r3) goto L_0x04d3
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x04d3:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x04e1
            r2 = 1328547280(0x4f3005d0, float:2.95317094E9)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedUserList.<anonymous>.<anonymous>.<anonymous> (EncryptedUserList.kt:36)"
            X.0fL.A01(r2, r0)
        L_0x04e1:
            r0 = 1177840352(0x46346ae0, float:11546.719)
            boolean r0 = X.C51967G9n.A1U(r10, r0)
            if (r0 == 0) goto L_0x04f2
            r2 = -732490058(0xffffffffd45716b6, float:-3.69519598E12)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.learnMoreText (EncryptedUserList.kt:74)"
            X.0fL.A01(r2, r0)
        L_0x04f2:
            X.6Bd r6 = new X.6Bd
            r6.<init>(r3)
            r0 = 2131958983(0x7f131cc7, float:1.9554594E38)
            java.lang.String r3 = X.C304346Dc.A00(r10, r0)
            r0 = 2131958982(0x7f131cc6, float:1.9554592E38)
            java.lang.String r2 = X.C304346Dc.A00(r10, r0)
            r6.A09(r2)
            java.lang.String r0 = " "
            r6.A09(r0)
            r6.A09(r3)
            int r0 = X.DbX.A05(r2)
            int r4 = r0 + 1
            int r3 = X.DbX.A05(r3)
            int r3 = r3 + r4
            X.C51974G9v.A0i(r10, r6, r4, r3)
            java.lang.String r2 = "learn_more"
            java.lang.String r0 = "Clickable learn more link"
            X.5Tq r12 = X.C51967G9n.A0K(r6, r2, r0, r4, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0532
            r0 = 1759845925(0x68e51e25, float:8.655824E24)
            X.0fL.A00(r0)
        L_0x0532:
            X.5Wx r3 = X.C51965G9l.A0H(r10, r5)
            X.5Z4 r13 = X.C51966G9m.A0b(r10)
            long r16 = X.C51966G9m.A0M(r10)
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r5 = X.C287645aX.A01(r10, r0)
            float r4 = X.C287645aX.A00(r10)
            float r2 = X.C287645aX.A00(r10)
            float r0 = X.C287645aX.A00(r10)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r6, r4, r5, r2, r0)
            r0 = -1539919576(0xffffffffa436b128, float:-3.9615016E-17)
            r10.ExS(r0)
            java.lang.Object r2 = r1.A01
            boolean r1 = r10.AGu(r2)
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x056d
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0577
        L_0x056d:
            r1 = 12
            X.PmE r0 = new X.PmE
            r0.<init>(r2, r1)
            r10.FLL(r0)
        L_0x0577:
            X.0sP r14 = X.C51965G9l.A0z(r3, r0)
            r15 = 112632(0x1b7f8, float:1.57831E-40)
            com.instagram.compose.core.ui.IgClickableTextKt.A05(r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = -2011444183(0xffffffff881bcc29, float:-4.6883605E-34)
            goto L_0x0b21
        L_0x058c:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0D(r11)
            r0 = 16
            if (r2 != r0) goto L_0x059c
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x059c:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x05aa
            r2 = -592181789(0xffffffffdcb405e3, float:-4.05375747E17)
            java.lang.String r0 = "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.ThreadList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ThreadDeletionFragment.kt:195)"
            X.0fL.A01(r2, r0)
        L_0x05aa:
            java.lang.Object r0 = r1.A01
            X.Nof r0 = (X.C69597Nof) r0
            X.NWo r0 = (X.C68779NWo) r0
            java.util.List r0 = r0.A00
            X.62P r13 = X.AnonymousClass62Q.A00(r0)
            X.GS7 r0 = X.GS7.A03
            X.JSI r0 = r0.A02
            float r14 = r0.AeN()
            r11 = 0
            r15 = 0
            r18 = 0
            r17 = 252(0xfc, float:3.53E-43)
            r12 = r11
            r16 = r15
            r20 = r15
            r21 = r15
            X.HXN.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = -576010667(0xffffffffddaac655, float:-1.53820206E18)
            goto L_0x0b21
        L_0x05d9:
            X.1Xj r10 = (X.1Xj) r10
            X.N1Z r11 = (X.N1Z) r11
            X.AnonymousClass7TG.A1O(r10, r11)
            java.lang.Object r0 = r1.A01
            X.I6A r0 = (X.I6A) r0
            X.JwG r2 = X.I6A.A00(r11, r0, r10)
            return r2
        L_0x05e9:
            X.1dS r10 = (X.AnonymousClass1dS) r10
            X.N1Z r11 = (X.N1Z) r11
            X.AnonymousClass7TG.A1O(r10, r11)
            java.lang.Object r1 = r1.A01
            X.I6A r1 = (X.I6A) r1
            X.9JI r0 = r10.A00
            goto L_0x0606
        L_0x05f7:
            X.1dq r10 = (X.1dq) r10
            X.N1Z r11 = (X.N1Z) r11
            X.AnonymousClass7TG.A1O(r10, r11)
            java.lang.Object r1 = r1.A01
            X.I6A r1 = (X.I6A) r1
            X.9JI r0 = r10.A07()
        L_0x0606:
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            goto L_0x06bc
        L_0x060c:
            X.N2G r10 = (X.N2G) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.String r3 = r10.A06
            java.lang.String r2 = r10.A05
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A00
            goto L_0x0652
        L_0x0619:
            X.A9t r10 = (X.C39798A9t) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.String r3 = r10.A02()
            java.lang.String r2 = r10.A01()
            com.instagram.common.typedurl.ImageUrl r0 = r10.A01
            goto L_0x0652
        L_0x062a:
            X.Cvw r10 = (X.C45416Cvw) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.String r3 = r10.A05
            java.lang.String r2 = r10.A06
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A01
            goto L_0x0652
        L_0x0637:
            X.Cw1 r10 = (X.C45421Cw1) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.String r3 = r10.A03
            java.lang.String r2 = r10.A04
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A01
            goto L_0x0652
        L_0x0644:
            X.HnA r10 = (X.C55775HnA) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.String r3 = r10.A02
            if (r3 == 0) goto L_0x0671
            java.lang.String r2 = r10.A03
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A01
        L_0x0652:
            if (r0 == 0) goto L_0x066f
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>(r0)
        L_0x0659:
            X.Nl3 r0 = X.C69421Nl3.NOTE
            java.lang.String r0 = X.I6A.A02(r0, r10)
            X.3tC r0 = X.C71152OeO.A0E(r1, r3, r2, r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 9
            X.JwG r2 = new X.JwG
            r2.<init>((java.util.List) r1, (int) r0)
            return r2
        L_0x066f:
            r1 = 0
            goto L_0x0659
        L_0x0671:
            java.lang.String r0 = "noteAuthorUsername"
            goto L_0x09c0
        L_0x0675:
            java.lang.String r3 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r1.A01
            X.E5l r0 = (X.E5l) r0
            X.FEo r2 = r0.A02
            if (r2 != 0) goto L_0x0685
            java.lang.String r0 = "composerController"
            goto L_0x09c0
        L_0x0685:
            X.G5f r0 = r2.A05
            if (r0 == 0) goto L_0x068c
            r0.Dj9(r3)
        L_0x068c:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r2.A00
            if (r1 != 0) goto L_0x0694
            java.lang.String r0 = "composerEditTextView"
            goto L_0x09c0
        L_0x0694:
            java.lang.String r0 = ""
            r1.setText(r0)
            r2.A02()
            X.FEo.A01(r2)
            goto L_0x0bad
        L_0x06a1:
            X.Gl8 r10 = (X.C53260Gl8) r10
            X.N1Z r11 = (X.N1Z) r11
            X.AnonymousClass7TG.A1O(r10, r11)
            java.lang.Object r1 = r1.A01
            X.I6A r1 = (X.I6A) r1
            X.1Xj r0 = r10.A00
            goto L_0x06bc
        L_0x06af:
            X.9bk r10 = (X.C381429bk) r10
            X.N1Z r11 = (X.N1Z) r11
            X.AnonymousClass7TG.A1O(r10, r11)
            java.lang.Object r1 = r1.A01
            X.I6A r1 = (X.I6A) r1
            X.1Xj r0 = r10.A00
        L_0x06bc:
            X.JwG r2 = X.I6A.A00(r11, r1, r0)
            return r2
        L_0x06c1:
            java.lang.Object r0 = r1.A01
            X.4D7 r0 = (X.AnonymousClass4D7) r0
            r0.resumeWith(r10)
            goto L_0x0bad
        L_0x06ca:
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r10 = (X.AnonymousClass3W1) r10
            boolean r2 = X.AnonymousClass7TE.A1a(r11)
            X.AnonymousClass7TG.A1N(r0, r10)
            java.lang.Object r1 = r1.A01
            X.Hou r1 = (X.C55873Hou) r1
            X.3Wa r1 = r1.A06
            r1.D3I(r0, r10, r2)
            goto L_0x0bad
        L_0x06e0:
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            int r3 = X.AnonymousClass7TE.A0M(r10)
            boolean r2 = X.AnonymousClass7TE.A1a(r11)
            java.lang.Object r1 = r1.A01
            X.Hou r1 = (X.C55873Hou) r1
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r1.A00
            r1.onProgressChanged(r0, r3, r2)
            goto L_0x0bad
        L_0x06f5:
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r10 = (X.AnonymousClass3W1) r10
            int r2 = X.AnonymousClass7TE.A0M(r11)
            X.AnonymousClass7TG.A1N(r0, r10)
            java.lang.Object r1 = r1.A01
            X.Hou r1 = (X.C55873Hou) r1
            X.41G r1 = r1.A05
            r1.Dji(r0, r10, r2)
            goto L_0x0bad
        L_0x070b:
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r10 = (X.AnonymousClass3W1) r10
            int r2 = X.AnonymousClass7TE.A0M(r11)
            X.AnonymousClass7TG.A1N(r0, r10)
            java.lang.Object r1 = r1.A01
            X.Hou r1 = (X.C55873Hou) r1
            X.3eR r1 = r1.A04
            r1.D2m(r0, r10, r2)
            goto L_0x0bad
        L_0x0721:
            android.view.View r0 = (android.view.View) r0
            int r2 = X.AnonymousClass7TE.A0M(r10)
            X.MXT r11 = (X.MXT) r11
            X.DbY.A1S(r0, r11)
            java.lang.Object r1 = r1.A01
            X.K8M r1 = (X.K8M) r1
            X.0eM r1 = r1.A02
            java.lang.Object r5 = r1.getValue()
            X.Hnp r5 = (X.C55809Hnp) r5
            X.His r4 = new X.His
            r4.<init>(r2)
            java.lang.String r3 = r11.Aml()
            r2 = 95
            X.4gL r1 = r11.Ahy()
            if (r1 == 0) goto L_0x0768
            java.lang.String r1 = r1.getId()
        L_0x074d:
            java.lang.String r1 = X.002.A0T(r3, r1, r2)
            X.30a r2 = X.AnonymousClass30Y.A00(r11, r4, r1)
            X.H8f r1 = r5.A01
            r2.A00(r1)
            X.Hzy r1 = r5.A02
            X.IPB r1 = r1.A01
            r2.A00(r1)
            X.2el r1 = r5.A00
            X.C51967G9n.A0z(r0, r2, r1)
            goto L_0x0bad
        L_0x0768:
            r1 = 0
            goto L_0x074d
        L_0x076a:
            java.lang.Object r2 = r1.A01
            X.DlB r2 = (X.C46783DlB) r2
            X.05G r1 = r2.A07
            r1.Epw(r0)
            X.05G r0 = r2.A08
            r0.Epw(r10)
            goto L_0x0bad
        L_0x077a:
            X.5Wy r3 = X.C51966G9m.A0R(r10, r11)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0790
            r2 = -97103739(0xfffffffffa365085, float:-2.3665779E35)
            java.lang.String r0 = "com.instagram.invite.view.ContactList.<anonymous>.<anonymous> (InviteContactContent.kt:140)"
            X.0fL.A01(r2, r0)
        L_0x0790:
            java.lang.Object r2 = r1.A01
            r1 = 44
            X.MPA r0 = new X.MPA
            r0.<init>(r2, r1)
            X.AnonymousClass6HY.A09(r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 648225812(0x26a32414, float:1.1320176E-15)
            goto L_0x0b21
        L_0x07a7:
            X.4um r0 = (X.C277274um) r0
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r2 = X.AnonymousClass7TE.A0M(r11)
            X.AnonymousClass7TG.A1N(r0, r10)
            java.lang.Object r4 = r1.A01
            r1 = 2131440757(0x7f0b3475, float:1.8503506E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r10, r1)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            int r1 = r3.getProgress()
            boolean r1 = X.AnonymousClass7TF.A1T(r1, r2)
            r3.setProgress(r2, r1)
            int r1 = r3.getMax()
            X.C53989GxX.A00(r10, r1, r2)
            r2 = 24
            X.Iw4 r1 = new X.Iw4
            r1.<init>((int) r2, (java.lang.Object) r10, (java.lang.Object) r4, (java.lang.Object) r3)
            X.4uo r2 = r0.A00(r1)
            return r2
        L_0x07db:
            X.4um r0 = (X.C277274um) r0
            com.instagram.ui.widget.textview.IgTextLayoutView r10 = (com.instagram.ui.widget.textview.IgTextLayoutView) r10
            int r3 = X.AnonymousClass7TE.A0M(r11)
            X.AnonymousClass7TG.A1N(r0, r10)
            android.text.Layout r2 = r10.A00
            if (r2 == 0) goto L_0x07f3
            android.text.TextPaint r2 = r2.getPaint()
            if (r2 == 0) goto L_0x07f3
            r2.setColor(r3)
        L_0x07f3:
            java.lang.Object r3 = r1.A01
            r2 = 43
            X.Wvt r1 = new X.Wvt
            r1.<init>(r2, r10, r3)
            X.4uo r2 = r0.A00(r1)
            return r2
        L_0x0801:
            X.GRC r10 = (X.GRC) r10
            X.0sa r11 = (X.C62320sa) r11
            X.AnonymousClass7TG.A1T(r0, r10, r11)
            boolean r2 = r10 instanceof X.C52388GQn
            if (r2 == 0) goto L_0x085f
            X.GQn r10 = (X.C52388GQn) r10
            X.GQo r2 = r10.A01
            X.5Gi r4 = r2.A01
            java.lang.Object r3 = r1.A01
            X.Dcv r3 = (X.C46352Dcv) r3
            X.0eM r1 = r3.A0G
            java.lang.Object r1 = r1.getValue()
            X.DdG r1 = (X.DdG) r1
            com.instagram.model.reels.Reel r5 = r1.A00(r4)
            if (r5 != 0) goto L_0x083c
            X.0eM r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            X.JS9 r0 = (X.JS9) r0
            X.EVf r3 = X.C48087EVf.START_AVATAR
            int r5 = r10.A00
            r1 = 0
            java.lang.Object r2 = r11.invoke()
            X.JV7 r2 = (X.JV7) r2
            r0.D29(r1, r2, r3, r4, r5)
            goto L_0x0bad
        L_0x083c:
            X.5Oz r2 = r3.A03
            java.lang.Object r1 = r2.getValue()
            if (r1 != 0) goto L_0x0bad
            int r1 = r10.A00
            X.C51967G9n.A15(r2, r1)
            X.0xx r2 = X.DbV.A0J(r3)
            r8 = 0
            r9 = 33
            X.MGh r1 = new X.MGh
            r4 = r1
            r6 = r0
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            X.1Er r2 = X.C51966G9m.A1L(r1, r2)
            r0 = 9
            goto L_0x089b
        L_0x085f:
            boolean r2 = r10 instanceof X.GSV
            if (r2 == 0) goto L_0x08a5
            X.GSV r10 = (X.GSV) r10
            X.GSY r2 = r10.A01
            java.lang.Object r3 = r1.A01
            X.Dcv r3 = (X.C46352Dcv) r3
            com.instagram.common.session.UserSession r1 = r3.getSession()
            com.instagram.model.reels.Reel r5 = r2.A03(r1)
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.util.ArrayList r6 = r2.A04(r1)
            X.5Oz r2 = r3.A03
            java.lang.Object r1 = r2.getValue()
            if (r1 != 0) goto L_0x0bad
            int r1 = r10.A00
            X.C51967G9n.A15(r2, r1)
            X.0xx r1 = X.DbV.A0J(r3)
            r9 = 0
            r10 = 7
            X.MHL r4 = new X.MHL
            r7 = r0
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.1Er r2 = X.C51966G9m.A1L(r4, r1)
            r0 = 10
        L_0x089b:
            X.G4U r1 = new X.G4U
            r1.<init>(r3, r0)
            r2.CO3(r1)
            goto L_0x0bad
        L_0x08a5:
            X.0wj r4 = X.0wj.A01
            r3 = 817901067(0x30c02e0b, float:1.3982925E-9)
            java.lang.String r2 = "Unhandled avatar click: ActivityFeedItem type ["
            java.lang.String r1 = r10.A00
            r0 = 93
            java.lang.String r0 = X.002.A0S(r2, r1, r0)
            r4.AEf(r0, r3)
            goto L_0x0bad
        L_0x08b9:
            java.lang.String r0 = (java.lang.String) r0
            int r31 = X.AnonymousClass7TE.A0M(r10)
            X.HLK r11 = (X.HLK) r11
            r2 = 0
            X.0qQ.A0B(r0, r2)
            r3 = 2
            r6 = 1
            X.0qQ.A0B(r11, r3)
            java.lang.Object r1 = r1.A01
            X.EO2 r1 = (X.EO2) r1
            com.instagram.common.session.UserSession r4 = r1.A07()
            java.lang.String r3 = r1.A05
            boolean r20 = X.2R8.A05(r4, r3)
            int r3 = r11.ordinal()
            java.lang.String r9 = ""
            if (r3 == r2) goto L_0x0956
            if (r3 != r6) goto L_0x0951
            X.DlJ r4 = X.EO2.A00(r1)
            com.instagram.opal.impl.data.OpalRepository r4 = r4.A02
            X.2nF r5 = r4.A00
            java.lang.String r4 = r4.A06
            X.5nC r4 = r5.A02(r4)
            java.util.List r4 = r4.A03
            java.util.Iterator r6 = r4.iterator()
        L_0x08f6:
            boolean r4 = r6.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0910
            java.lang.Object r5 = r6.next()
            r4 = r5
            X.4bN r4 = (X.C267324bN) r4
            X.1Xj r4 = r4.A02
            java.lang.String r4 = X.C51969G9p.A0u(r4)
            boolean r4 = X.0qQ.A0K(r4, r0)
            if (r4 == 0) goto L_0x08f6
        L_0x0910:
            X.4bN r5 = (X.C267324bN) r5
            if (r5 == 0) goto L_0x0a56
            X.1Xj r8 = r5.A02
            if (r8 == 0) goto L_0x0a56
            androidx.fragment.app.FragmentActivity r10 = r1.requireActivity()
            com.instagram.common.session.UserSession r11 = r1.A07()
            java.lang.String r15 = "opal_fragment"
            java.lang.String r7 = r1.A05
            if (r7 != 0) goto L_0x0927
            r7 = r9
        L_0x0927:
            java.lang.String r6 = r1.A0G
            java.lang.String r0 = r1.A06
            r14 = 0
            if (r0 == 0) goto L_0x093a
            java.lang.String r0 = X.C51965G9l.A0u(r0)     // Catch:{ NumberFormatException -> 0x093a }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x093a }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x093a }
        L_0x093a:
            java.lang.String r0 = r1.A07
            boolean r22 = r1.Ez8()
            r19 = r31
            r21 = r2
            r12 = r8
            r13 = r1
            r16 = r7
            r17 = r6
            r18 = r0
            X.I6Y.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0a56
        L_0x0951:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0956:
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            java.lang.String r5 = r1.A06
            if (r5 == 0) goto L_0x0967
            r4 = 2182(0x886, float:3.058E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r11.putString(r4, r5)
        L_0x0967:
            boolean r4 = r1.Ez8()
            if (r4 == 0) goto L_0x0972
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_SUPPORTS_OPAL_CREATION"
            r11.putBoolean(r4, r6)
        L_0x0972:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            X.DlJ r4 = X.EO2.A00(r1)
            X.0Ud r4 = r4.A06
            java.lang.Object r4 = r4.getValue()
            X.Dry r4 = (X.C47183Dry) r4
            X.Jw2 r4 = r4.A03
            java.lang.Object r4 = r4.A00
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x0990:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x09a2
            java.lang.Object r4 = r5.next()
            X.Glx r4 = (X.C53311Glx) r4
            java.lang.String r4 = r4.A04
            r8.add(r4)
            goto L_0x0990
        L_0x09a2:
            r7.addAll(r8)
            com.instagram.common.session.UserSession r4 = r1.A07()
            X.17i r5 = X.17h.A00(r4)
            java.lang.String r4 = r1.A05
            com.instagram.user.model.User r8 = r5.A02(r4)
            if (r20 == 0) goto L_0x09c8
            java.lang.String r20 = "opal_feed_contextual_self_profile"
        L_0x09b7:
            r12 = 0
            java.lang.String r16 = "User_Feed"
            X.3kK r4 = r1.A04
            if (r4 != 0) goto L_0x09cf
            java.lang.String r0 = "sessionIdProvider"
        L_0x09c0:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09c8:
            r4 = 861(0x35d, float:1.207E-42)
            java.lang.String r20 = X.C273654mx.A00(r4)
            goto L_0x09b7
        L_0x09cf:
            java.lang.String r28 = r4.getSessionId()
            r4 = 2131968882(0x7f134372, float:1.9574671E38)
            java.lang.String r17 = r1.getString(r4)
            java.lang.String r25 = "opal_fragment"
            X.DlJ r4 = X.EO2.A00(r1)
            X.0Ud r4 = r4.A06
            java.lang.Object r4 = r4.getValue()
            X.Dry r4 = (X.C47183Dry) r4
            X.Jw2 r4 = r4.A03
            java.lang.String r5 = r4.A02
            java.lang.String r4 = r1.A05
            if (r4 != 0) goto L_0x09f1
            r4 = r9
        L_0x09f1:
            if (r8 == 0) goto L_0x0a73
            java.lang.String r35 = r8.getUsername()
        L_0x09f7:
            r38 = 7
            com.instagram.feed.intf.ContextualFeedNetworkConfig r13 = new com.instagram.feed.intf.ContextualFeedNetworkConfig
            r32 = r13
            r33 = r5
            r34 = r4
            r36 = r12
            r37 = r12
            r32.<init>(r33, r34, r35, r36, r37, r38)
            X.To7 r4 = r1.A0F
            android.os.Bundle r10 = X.DbV.A0B(r4, r2)
            r4.A01(r10)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            com.instagram.common.session.UserSession r4 = r1.A07()
            X.6Yo r5 = X.DbS.A0M(r5, r4)
            instagram.features.feed.fragment.ContextualFeedFragment r4 = new instagram.features.feed.fragment.ContextualFeedFragment
            r4.<init>()
            r14 = r12
            r15 = r12
            r18 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r24 = r12
            r26 = r12
            r27 = r0
            r29 = r25
            r30 = r7
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r6
            r36 = r2
            r37 = r2
            r38 = r6
            r39 = r2
            r40 = r6
            r41 = r2
            r19 = r0
            android.os.Bundle r0 = X.C46424Del.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r4.setArguments(r0)
            X.Dba.A0w(r12, r4, r5)
        L_0x0a56:
            if (r3 == r2) goto L_0x0a70
            java.lang.String r4 = "reel_media"
        L_0x0a5a:
            java.lang.String r3 = "tap"
            java.lang.String r5 = X.EO2.A01(r1)
            java.lang.String r0 = r1.A05
            if (r0 != 0) goto L_0x0a65
            r0 = r9
        L_0x0a65:
            com.instagram.common.session.UserSession r2 = r1.A07()
            r7 = 0
            r6 = r0
            X.C49049EoT.A00(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0bad
        L_0x0a70:
            java.lang.String r4 = "post_media"
            goto L_0x0a5a
        L_0x0a73:
            r35 = r9
            goto L_0x09f7
        L_0x0a76:
            X.4cb r0 = (X.C268004cb) r0
            X.4ci r10 = (X.C268074ci) r10
            androidx.compose.ui.unit.Constraints r11 = (androidx.compose.ui.unit.Constraints) r11
            long r2 = r11.A00
            r6 = 0
            X.AnonymousClass7TF.A1H(r0, r10)
            X.4cY r5 = r10.Cnz(r2)
            java.lang.Object r3 = r1.A01
            X.I4K r3 = (X.I4K) r3
            int r1 = r5.A00
            float r1 = (float) r1
            float r2 = -r1
            X.5Oz r1 = r3.A01
            X.C51967G9n.A14(r1, r2)
            X.5Oz r4 = r3.A00
            float r3 = X.C51971G9r.A02(r4)
            float r2 = X.C51971G9r.A02(r1)
            r1 = 0
            float r1 = X.C229632nm.A02(r3, r2, r1)
            X.C51967G9n.A14(r4, r1)
            int r1 = r5.A00
            float r2 = (float) r1
            float r1 = X.C51971G9r.A02(r4)
            float r2 = r2 + r1
            int r2 = X.AnonymousClass1GB.A01(r2)
            int r1 = r5.A00
            int r4 = X.C229632nm.A03(r2, r6, r1)
            int r3 = r5.A01
            r2 = 25
            X.Iwi r1 = new X.Iwi
            r1.<init>(r4, r2, r5)
            X.5d6 r2 = X.C51969G9p.A0a(r0, r1, r3, r4)
            return r2
        L_0x0ac5:
            boolean r0 = X.AnonymousClass7TE.A1a(r10)
            if (r0 == 0) goto L_0x0bad
            java.lang.Object r0 = r1.A01
            X.Dl2 r0 = (X.C46775Dl2) r0
            X.05G r5 = r0.A08
        L_0x0ad1:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.Drv r0 = (X.C47180Drv) r0
            r3 = 1
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            boolean r0 = r0.A04
            X.Drv r0 = X.C47180Drv.A00(r2, r1, r0, r3)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0ad1
            goto L_0x0bad
        L_0x0aeb:
            X.5Wy r10 = (X.C286575Wy) r10
            int r2 = X.C51968G9o.A0E(r11)
            r0 = 16
            if (r2 != r0) goto L_0x0afb
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0b26
        L_0x0afb:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0b09
            r2 = 1974698423(0x75b381b7, float:4.5510355E32)
            java.lang.String r0 = "com.instagram.potato.reply.PotatoReplyLikesList.<anonymous>.<anonymous>.<anonymous> (PotatoReplyLikesList.kt:44)"
            X.0fL.A01(r2, r0)
        L_0x0b09:
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.typedurl.ImageUrl r2 = r0.Bh3()
            r1 = 28
            r0 = 48
            X.C55084Hbt.A00(r10, r2, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bad
            r0 = 768039122(0x2dc758d2, float:2.2663125E-11)
        L_0x0b21:
            X.0fL.A00(r0)
            goto L_0x0bad
        L_0x0b26:
            r10.Evl()
            goto L_0x0bad
        L_0x0b2b:
            X.DtX r0 = (X.C47246DtX) r0
            boolean r12 = X.AnonymousClass7TE.A1a(r10)
            android.widget.CompoundButton r11 = (android.widget.CompoundButton) r11
            r7 = 0
            int r13 = X.DbW.A02(r7, r0, r11)
            if (r12 == 0) goto L_0x0bb0
            java.lang.Object r4 = r1.A01
            X.E2V r4 = (X.E2V) r4
            X.0eM r2 = r4.A04
            java.lang.Object r2 = r2.getValue()
            X.Dkw r2 = (X.C46769Dkw) r2
            X.FF6 r2 = r2.A03
            java.util.List r2 = r2.A02()
            int r3 = r2.size()
            r2 = 5
            if (r3 < r2) goto L_0x0bb0
            r11.setChecked(r7)
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = X.DbV.A0X()
            java.lang.String r0 = "max_channels_error"
            r1.A0H = r0
            r0 = 2131969924(0x7f134784, float:1.9576785E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0D = r0
            X.DbY.A1K(r2, r1)
            X.0eM r0 = r4.A02
            java.lang.Object r3 = r0.getValue()
            X.FYs r3 = (X.C50336FYs) r3
            X.0wc r1 = r3.A02
            r0 = 28
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0bad
            java.lang.String r1 = "instagram"
            java.lang.String r0 = "parent_surface"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "edit_profile_channels"
            X.DbS.A1M(r2, r0)
            java.lang.String r1 = "channels_settings_item"
            java.lang.String r0 = "source"
            X.Dba.A1B(r2, r0, r1)
            java.lang.String r0 = "max_channel_error"
            X.C50336FYs.A00(r2, r3, r0)
            X.Dba.A18(r2)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = X.AnonymousClass9NF.A01()
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x0bad:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0bb0:
            r6 = 0
            java.lang.Object r4 = r1.A01
            X.E2V r4 = (X.E2V) r4
            X.0eM r1 = r4.A02
            java.lang.Object r5 = r1.getValue()
            X.FYs r5 = (X.C50336FYs) r5
            java.lang.String r14 = r0.A08
            java.lang.Integer r11 = r0.A04
            if (r12 == 0) goto L_0x0c90
            if (r11 == 0) goto L_0x0bc9
            java.lang.Long r6 = X.C51969G9p.A0r(r11)
        L_0x0bc9:
            X.0qQ.A0B(r14, r7)
            X.0wc r2 = r5.A02
            r1 = 28
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0c13
            java.lang.String r2 = "instagram"
            java.lang.String r1 = "parent_surface"
            r3.AAJ(r1, r2)
            java.lang.String r1 = "edit_profile_channels"
            X.DbS.A1M(r3, r1)
            java.lang.String r2 = "channels_settings_item"
            java.lang.String r1 = "source"
            X.Dba.A1B(r3, r1, r2)
            java.lang.String r1 = "pin_channel"
            X.C50336FYs.A00(r3, r5, r1)
            X.Dba.A18(r3)
            java.lang.String r1 = "ig_thread_id"
            r3.AAJ(r1, r14)
            r1 = 61
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r3.A9F(r1, r6)
        L_0x0c07:
            java.lang.String r2 = r5.A00
            java.lang.String r1 = X.AnonymousClass9NF.A01()
            r3.AAJ(r1, r2)
            r3.Cgf()
        L_0x0c13:
            X.0eM r1 = r4.A04
            java.lang.Object r1 = r1.getValue()
            X.Dkw r1 = (X.C46769Dkw) r1
            X.FF6 r7 = r1.A03
            boolean r1 = r0.A0B
            if (r1 == r12) goto L_0x0bad
            java.util.LinkedHashMap r10 = r7.A05
            int r1 = r14.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.remove(r2)
            java.util.TreeMap r1 = r7.A00
            r1.remove(r2)
            com.instagram.common.typedurl.ImageUrl r9 = r0.A01
            com.instagram.common.typedurl.ImageUrl r8 = r0.A02
            java.lang.String r6 = r0.A06
            java.lang.String r5 = r0.A07
            boolean r4 = r0.A09
            java.lang.String r3 = r0.A05
            boolean r2 = r0.A0A
            java.lang.Integer r1 = r0.A03
            X.47m r0 = r0.A00
            X.0qQ.A0B(r6, r13)
            X.DtX r13 = new X.DtX
            r16 = r8
            r17 = r11
            r18 = r1
            r19 = r6
            r20 = r5
            r21 = r14
            r22 = r3
            r23 = r12
            r24 = r4
            r25 = r2
            r15 = r9
            r14 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r12 == 0) goto L_0x0c80
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = r13.A08
            int r0 = r0.hashCode()
            X.C51967G9n.A1O(r13, r1, r0)
            r1.putAll(r10)
            r10.clear()
            r10.putAll(r1)
        L_0x0c7b:
            X.FF6.A00(r7)
            goto L_0x0bad
        L_0x0c80:
            java.util.TreeMap r1 = r7.A00
            java.lang.String r0 = r13.A08
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r0, r13)
            goto L_0x0c7b
        L_0x0c90:
            if (r11 == 0) goto L_0x0c96
            java.lang.Long r6 = X.C51969G9p.A0r(r11)
        L_0x0c96:
            X.0qQ.A0B(r14, r7)
            X.0wc r2 = r5.A02
            r1 = 28
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0c13
            java.lang.String r2 = "instagram"
            java.lang.String r1 = "parent_surface"
            r3.AAJ(r1, r2)
            java.lang.String r1 = "edit_profile_channels"
            X.DbS.A1M(r3, r1)
            java.lang.String r2 = "channels_settings_item"
            java.lang.String r1 = "source"
            X.Dba.A1B(r3, r1, r2)
            java.lang.String r1 = "unpin_channel"
            X.C50336FYs.A00(r3, r5, r1)
            X.Dba.A18(r3)
            r1 = 61
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r3.A9F(r1, r6)
            java.lang.String r1 = "ig_thread_id"
            r3.AAJ(r1, r14)
            goto L_0x0c07
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JJR.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
