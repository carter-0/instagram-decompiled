package X;

public abstract class GBR extends C320886t7 {
    public final JSx A00;
    public final C51987GAk A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.GDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.GDy} */
    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0118, code lost:
        if (X.182.A06(X.DbS.A0J(r2, 0), r2, 36327013778208891L) != false) goto L_0x011a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C249703kE r20, X.C320876t6 r21) {
        /*
            r19 = this;
            r1 = r19
            r13 = r20
            r2 = r21
            boolean r0 = r1 instanceof X.C52007GBe
            if (r0 == 0) goto L_0x01a0
            r5 = r1
            X.GBe r5 = (X.C52007GBe) r5
            X.GDg r2 = (X.C52060GDg) r2
            X.GDz r13 = (X.C52079GDz) r13
            r9 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r9, r2, r13)
            X.4bN r6 = r2.A00
            X.JSx r7 = r5.A0L
            X.GDe r0 = r7.BzC(r6)
            X.3W1 r8 = r0.A0E
            X.5o2 r11 = r6.A01
            X.5o2 r0 = X.C295365o2.AD
            if (r11 != r0) goto L_0x0033
            com.instagram.common.session.UserSession r0 = r5.A0N
            X.1wP r1 = X.1wN.A00(r0)
            X.3OA r0 = r6.A06()
            r1.A01(r0)
        L_0x0033:
            X.HQV r1 = r13.A08
            if (r1 == 0) goto L_0x0040
            X.HrW r0 = r13.A09
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
        L_0x0040:
            r13.A01 = r6
            X.GDy r3 = r13.A07
            r13.getBindingAdapterPosition()
            r3.A00 = r6
            r3.A03 = r8
            X.Jvg r0 = r2.A00
            boolean r0 = r0.A01
            float r1 = X.C51970G9q.A01(r0)
            X.2V5 r0 = r13.A04
            X.C51967G9n.A19(r0, r1)
            r1 = 0
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r2 = r13.A06
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.0qQ.A0C(r2, r0)
            r2.setTag(r13)
            boolean r2 = r6.A0F()
            r13.A02 = r2
            boolean r10 = r6.A0G()
            r13.A03 = r10
            X.5o2 r0 = X.C295365o2.MIDCARD
            if (r11 != r0) goto L_0x00a7
            X.GmI r0 = r6.A01()
            com.instagram.api.schemas.InstagramMidcardType r0 = r0.A05
        L_0x0079:
            r13.A00 = r0
            if (r0 == 0) goto L_0x00c1
            X.GEE r0 = X.C52213GJe.A01
            X.0eP r0 = r0.A01(r6)
            int r2 = X.C51970G9q.A0B(r0)
            java.lang.Object r0 = r0.A01
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00a9
            java.util.List r3 = r13.A0D
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0233
            r1 = 1
            if (r4 > r2) goto L_0x022a
        L_0x009a:
            X.Hlk r0 = new X.Hlk
            r0.<init>()
            r3.add(r0)
            if (r1 == r2) goto L_0x022a
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00a7:
            r0 = r1
            goto L_0x0079
        L_0x00a9:
            java.util.List r3 = r13.A0C
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0233
            r1 = 1
            if (r4 > r2) goto L_0x0198
        L_0x00b4:
            X.Iaz r0 = new X.Iaz
            r0.<init>()
            r3.add(r0)
            if (r1 == r2) goto L_0x0198
            int r1 = r1 + 1
            goto L_0x00b4
        L_0x00c1:
            if (r2 == 0) goto L_0x00fa
            java.util.List r3 = r13.A0B
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0233
            java.util.List r0 = X.C57031ILx.A02(r6)
            java.util.Iterator r1 = r0.iterator()
        L_0x00d3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r1.next()
            X.3OA r0 = (X.AnonymousClass3OA) r0
            X.1Xj r0 = r0.A0K
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x00f0
            X.Idc r0 = new X.Idc
            r0.<init>()
        L_0x00ec:
            r3.add(r0)
            goto L_0x00d3
        L_0x00f0:
            X.Idb r0 = new X.Idb
            r0.<init>()
            goto L_0x00ec
        L_0x00f6:
            java.util.HashMap r1 = r5.A0f
            goto L_0x022c
        L_0x00fa:
            com.instagram.common.session.UserSession r2 = r5.A0N
            boolean r0 = X.C52076GDw.A05(r6, r2)
            if (r0 == 0) goto L_0x0150
            java.util.HashMap r1 = r5.A0i
            java.lang.String r0 = r6.getId()
            r1.put(r0, r3)
            X.0Tu r3 = X.DbS.A0J(r2, r9)
            r0 = 36327013778208891(0x810f3a0000387b, double:3.0366880182582116E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0233
        L_0x011a:
            java.util.List r0 = X.C52076GDw.A01(r6)
            int r12 = X.C51971G9r.A0H(r0)
        L_0x0122:
            java.util.List r3 = r13.A0A
            int r0 = r3.size()
            if (r0 >= r12) goto L_0x0194
            com.instagram.clips.intf.ClipsViewerConfig r10 = r5.A0K
            android.content.Context r1 = r5.A0G
            com.facebook.litho.LithoView r0 = new com.facebook.litho.LithoView
            r0.<init>(r1)
            X.GDy r11 = new X.GDy
            r11.<init>(r0, r10, r2, r9)
            X.0Tu r10 = X.0Tu.A05
            r0 = 36319776759881360(0x8108a500181e90, double:3.032111298726747E-306)
            boolean r0 = X.182.A06(r10, r2, r0)
            if (r0 == 0) goto L_0x014c
            r13.getBindingAdapterPosition()
            r11.A00 = r6
            r11.A03 = r8
        L_0x014c:
            r3.add(r11)
            goto L_0x0122
        L_0x0150:
            boolean r0 = X.C52076GDw.A02(r6)
            if (r0 != 0) goto L_0x011a
            if (r10 == 0) goto L_0x019c
            X.GmE r2 = r6.A02()
            if (r2 == 0) goto L_0x0160
            java.lang.String r1 = r2.A0B
        L_0x0160:
            java.lang.String r0 = "ad4ad_in_reels"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x019c
            if (r2 == 0) goto L_0x0192
            java.util.List r0 = r2.A0F
            if (r0 == 0) goto L_0x0192
            int r0 = r0.size()
        L_0x0172:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            java.util.List r3 = r13.A0C
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0233
            r1 = 1
            if (r4 > r2) goto L_0x0198
        L_0x0185:
            X.Iaz r0 = new X.Iaz
            r0.<init>()
            r3.add(r0)
            if (r1 == r2) goto L_0x0198
            int r1 = r1 + 1
            goto L_0x0185
        L_0x0192:
            r0 = 0
            goto L_0x0172
        L_0x0194:
            java.util.HashMap r1 = r5.A0e
            goto L_0x022c
        L_0x0198:
            java.util.HashMap r1 = r5.A0g
            goto L_0x022c
        L_0x019c:
            java.util.HashMap r1 = r5.A0i
            goto L_0x022c
        L_0x01a0:
            boolean r0 = r1 instanceof X.GBV
            if (r0 == 0) goto L_0x01df
            X.GBV r1 = (X.GBV) r1
            X.DhK r13 = (X.C46578DhK) r13
            X.AnonymousClass7TG.A1N(r2, r13)
            X.4bN r0 = r2.A00
            X.GmE r2 = r0.A02()
            if (r2 == 0) goto L_0x025d
            X.DSL r0 = r2.A00
            if (r0 == 0) goto L_0x025d
            X.DSQ r0 = r0.C2o()
            if (r0 == 0) goto L_0x025d
            java.util.List r0 = r0.C2t()
            if (r0 == 0) goto L_0x025d
            X.DhH r9 = X.GBV.A09
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1D(r0)
            com.instagram.common.session.UserSession r12 = r1.A02
            X.0iw r11 = r1.A01
            android.app.Activity r10 = r1.A00
            X.GAe r14 = r1.A03
            java.lang.String r15 = r2.A09
            java.lang.String r1 = r2.A0E
            java.lang.String r0 = r2.A0B
            r16 = r1
            r17 = r0
            r9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x01df:
            boolean r0 = r1 instanceof X.GBT
            if (r0 == 0) goto L_0x01fb
            X.AnonymousClass7TG.A1N(r2, r13)
            X.4bN r0 = r2.A00
            X.1Xj r1 = r0.A02
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x01f6
            r1.A3p()
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01fb:
            boolean r0 = r1 instanceof X.GBU
            if (r0 == 0) goto L_0x025d
            X.GBU r1 = (X.GBU) r1
            X.HJs r13 = (X.C54583HJs) r13
            X.AnonymousClass7TG.A1N(r2, r13)
            X.4bN r0 = r2.A00
            X.GmE r0 = r0.A02()
            if (r0 == 0) goto L_0x025d
            X.DSL r0 = r0.A00
            if (r0 == 0) goto L_0x025d
            X.DSQ r0 = r0.C2o()
            if (r0 == 0) goto L_0x025d
            java.util.List r14 = r0.C2t()
            if (r14 == 0) goto L_0x025d
            X.I6n r9 = X.GBU.A0B
            com.instagram.common.session.UserSession r12 = r1.A02
            X.0iw r11 = r1.A01
            android.app.Activity r10 = r1.A00
            r9.A06(r10, r11, r12, r13, r14)
            return
        L_0x022a:
            java.util.HashMap r1 = r5.A0h
        L_0x022c:
            java.lang.String r0 = r6.getId()
            r1.put(r0, r3)
        L_0x0233:
            com.instagram.common.session.UserSession r3 = r5.A0N
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312874746840364(0x81025e000f052c, double:3.0277464378874456E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x025d
            X.GDe r0 = r7.BzC(r6)
            java.lang.Integer r0 = r0.A0H
            X.3WR r2 = r6.A09(r3, r0)
            if (r2 == 0) goto L_0x025d
            android.content.Context r0 = r5.A0G
            android.content.Context r1 = X.DbT.A05(r0)
            X.GAc r0 = r5.A0Z
            java.lang.String r0 = r0.getModuleName()
            X.C51973G9u.A0w(r1, r3, r2, r0, r4)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBR.A03(X.3kE, X.6t6):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x005e A[EDGE_INSN: B:71:0x005e->B:14:0x005e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0038  */
    /* renamed from: A04 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bind(X.C249703kE r15, X.C320876t6 r16) {
        /*
            r14 = this;
            r0 = r16
            boolean r8 = X.AnonymousClass7TG.A1Z(r0, r15)
            r14.A03(r15, r0)
            X.4bN r10 = r0.A00
            X.GAk r2 = r14.A01
            android.view.View r9 = r15.itemView
            X.0qQ.A06(r9)
            X.JSx r0 = r14.A00
            X.GDe r11 = r0.BzC(r10)
            int r13 = r15.getBindingAdapterPosition()
            r0 = 2
            X.0qQ.A0B(r11, r0)
            X.GBi r5 = r2.A00
            if (r5 == 0) goto L_0x0103
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x0103
            X.GD6 r0 = r5.A01
            X.GBg r6 = r0.A0A
            int r4 = r6.A0B(r10)
            r3 = r4
        L_0x0033:
            int r3 = r3 + -1
            r7 = -1
            if (r7 >= r3) goto L_0x005e
            X.4bN r0 = r6.A0E(r3)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.AD
            if (r1 == r0) goto L_0x0056
            X.4bN r0 = r6.A0E(r3)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x0056
            X.4bN r0 = r6.A0E(r3)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 != r0) goto L_0x0033
        L_0x0056:
            X.JRO r1 = r5.A00
            int r0 = r4 - r3
            int r0 = r0 - r8
            r1.EXM(r10, r0)
        L_0x005e:
            r3 = r4
        L_0x005f:
            int r3 = r3 + -1
            if (r7 >= r3) goto L_0x0132
            X.4bN r0 = r6.A0E(r3)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 != r0) goto L_0x005f
        L_0x006d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x008a
            if (r0 == 0) goto L_0x008a
            X.JRO r1 = r5.A00
            int r0 = r4 - r3
            int r0 = r0 - r8
            r1.EXO(r10, r0)
            X.4bN r0 = r6.A0E(r3)
            X.ILx r0 = r0.A03()
            int r0 = r0.A00
            r1.Eam(r10, r0)
        L_0x008a:
            boolean r0 = r10.A0F()
            if (r0 == 0) goto L_0x0103
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            int r3 = X.C52011GBi.A00(r5, r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x00a6
            if (r0 == 0) goto L_0x00a6
            X.JRO r1 = r5.A00
            int r0 = r4 - r3
            int r0 = r0 - r8
            r1.EXR(r10, r0)
        L_0x00a6:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            int r3 = X.C52011GBi.A00(r5, r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x00bc
            if (r0 == 0) goto L_0x00bc
            X.JRO r1 = r5.A00
            int r0 = r4 - r3
            int r0 = r0 - r8
            r1.EXQ(r10, r0)
        L_0x00bc:
            r3 = r4
        L_0x00bd:
            int r3 = r3 + -1
            if (r7 >= r3) goto L_0x0130
            X.4bN r0 = r6.A0E(r3)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r1 != r0) goto L_0x00bd
        L_0x00cb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x00db
            if (r0 == 0) goto L_0x00db
            X.JRO r1 = r5.A00
            int r0 = r4 - r3
            int r0 = r0 - r8
            r1.EXP(r10, r0)
        L_0x00db:
            r3 = r4
        L_0x00dc:
            int r3 = r3 + -1
            if (r3 <= 0) goto L_0x012e
            X.4bN r0 = r6.A0E(r3)
            X.5o2 r0 = r0.A01
            X.5o2 r1 = X.C295365o2.AD
            if (r0 != r1) goto L_0x00dc
            int r0 = r3 + -1
            X.4bN r0 = r6.A0E(r0)
            X.5o2 r0 = r0.A01
            if (r0 != r1) goto L_0x00dc
        L_0x00f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x0103
            if (r0 == 0) goto L_0x0103
            X.JRO r0 = r5.A00
            int r4 = r4 - r3
            int r4 = r4 - r8
            r0.EXN(r10, r4)
        L_0x0103:
            X.5o2 r0 = r10.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x012b;
                case 1: goto L_0x0125;
                case 2: goto L_0x0125;
                case 3: goto L_0x0122;
                case 4: goto L_0x011c;
                case 5: goto L_0x0116;
                case 6: goto L_0x0128;
                case 7: goto L_0x010c;
                case 8: goto L_0x011f;
                case 9: goto L_0x0119;
                case 10: goto L_0x010c;
                case 11: goto L_0x010c;
                case 12: goto L_0x010c;
                case 13: goto L_0x010c;
                case 14: goto L_0x010c;
                case 15: goto L_0x0116;
                default: goto L_0x010c;
            }
        L_0x010c:
            X.ILl r8 = r2.A02
        L_0x010e:
            X.JNr r8 = (X.C59545JNr) r8
            X.2el r12 = r2.A04
            r8.EBO(r9, r10, r11, r12, r13)
            return
        L_0x0116:
            X.GB4 r8 = r2.A0H
            goto L_0x010e
        L_0x0119:
            X.GB3 r8 = r2.A0F
            goto L_0x010e
        L_0x011c:
            X.GB1 r8 = r2.A0D
            goto L_0x010e
        L_0x011f:
            X.GAt r8 = r2.A0B
            goto L_0x010e
        L_0x0122:
            X.GAy r8 = r2.A0E
            goto L_0x010e
        L_0x0125:
            X.GAu r8 = r2.A08
            goto L_0x010e
        L_0x0128:
            X.GAr r8 = r2.A0I
            goto L_0x010e
        L_0x012b:
            X.GAo r8 = r2.A0G
            goto L_0x010e
        L_0x012e:
            r3 = -1
            goto L_0x00f4
        L_0x0130:
            r3 = -1
            goto L_0x00cb
        L_0x0132:
            r3 = -1
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBR.bind(X.3kE, X.6t6):void");
    }

    public GBR(JSx jSx, C51987GAk gAk) {
        this.A01 = gAk;
        this.A00 = jSx;
    }
}
