package X;

public final class DIJ implements 02o {
    public final int A00;
    public final Object A01;

    public DIJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: X.ME5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: X.ME5} */
    /* JADX WARNING: type inference failed for: r5v9, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0234, code lost:
        if (r0 != null) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0304, code lost:
        r0 = r8.emit(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0308, code lost:
        if (r0 != r4) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x030a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0376, code lost:
        X.0eS.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037b, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r20, X.AnonymousClass4D7 r21) {
        /*
            r19 = this;
            r2 = r19
            r9 = r20
            int r0 = r2.A00
            r3 = r21
            switch(r0) {
                case 0: goto L_0x031e;
                case 1: goto L_0x0249;
                case 2: goto L_0x01ca;
                case 3: goto L_0x0169;
                default: goto L_0x000b;
            }
        L_0x000b:
            r6 = 49
            boolean r0 = X.ME5.A03(r6, r3)
            if (r0 == 0) goto L_0x0031
            r5 = r3
            X.ME5 r5 = (X.ME5) r5
            int r4 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0031
            int r4 = r4 - r1
            r5.A00 = r4
        L_0x0021:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r3) goto L_0x0376
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.ME5 r5 = new X.ME5
            r5.<init>(r2, r3, r6)
            goto L_0x0021
        L_0x0037:
            X.0eS.A00(r1)
            java.lang.Object r2 = r2.A01
            X.02o r2 = (X.02o) r2
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0156
            X.3lr r7 = X.C41848B3p.A16(r9)
            if (r7 == 0) goto L_0x015f
            java.lang.Class<X.BWI> r6 = X.BWI.class
            java.lang.String r1 = "xfb_genai_imagine_memu_spotlight"
            r0 = -1667504316(0xffffffff9c9be744, float:-1.031682E-21)
            X.3lr r7 = r7.getOptionalTreeField(r3, r1, r6, r0)
            if (r7 == 0) goto L_0x015f
            java.lang.Class<X.BWH> r6 = X.BWH.class
            java.lang.String r1 = "units"
            r0 = 309554819(0x12736e83, float:7.6813496E-28)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r3, r1, r6, r0)
            if (r0 == 0) goto L_0x015f
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x006c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0161
            X.3lr r8 = X.C41845B3m.A0V(r12)
            java.lang.Class<X.BWG> r6 = X.BWG.class
            java.lang.String r1 = "medias"
            r0 = -1980297294(0xffffffff89f70fb2, float:-5.9477847E-33)
            com.google.common.collect.ImmutableList r0 = r8.A06(r6, r1, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x008c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r6 = r9.next()
            r8 = r6
            X.3lr r8 = (X.C250663lr) r8
            java.lang.String r0 = "uri"
            java.lang.String r0 = r8.getOptionalStringField(r3, r0)
            if (r0 == 0) goto L_0x008c
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "prompt"
            java.lang.String r0 = r8.A09(r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x00c4
        L_0x00b5:
            java.lang.String r0 = "short_prompt"
            java.lang.String r0 = r8.A0A(r0)
            if (r0 == 0) goto L_0x008c
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x00c4
            goto L_0x008c
        L_0x00c4:
            r1.add(r6)
            goto L_0x008c
        L_0x00c8:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x00d0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0142
            X.3lr r9 = X.C41845B3m.A0V(r11)
            java.lang.String r0 = "uri"
            java.lang.String r16 = r9.getOptionalStringField(r3, r0)
            java.lang.String r10 = "Required value was null."
            if (r16 == 0) goto L_0x0151
            X.Uyn r8 = X.C16651Uyn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "media_type"
            java.lang.Enum r0 = r9.getOptionalEnumField(r1, r0, r8)
            X.Uyn r0 = (X.C16651Uyn) r0
            if (r0 == 0) goto L_0x013f
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x013f
            java.lang.Integer r15 = X.AnonymousClass05K.A01
        L_0x00fa:
            java.lang.String r1 = "prompt"
            java.lang.String r17 = r9.A09(r1)
            if (r17 == 0) goto L_0x014c
            java.lang.String r0 = "short_prompt"
            java.lang.String r18 = r9.A0A(r0)
            if (r18 != 0) goto L_0x0115
            java.lang.String r18 = r9.A09(r1)
            if (r18 != 0) goto L_0x0115
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0115:
            java.lang.Class<X.BWF> r10 = X.BWF.class
            r8 = 4
            java.lang.String r1 = "creator_attribution"
            r0 = 708468668(0x2a3a5fbc, float:1.6553333E-13)
            X.3lr r8 = r9.getOptionalTreeField(r8, r1, r10, r0)
            if (r8 == 0) goto L_0x013d
            java.lang.Class<X.BWK> r1 = X.BWK.class
            r0 = 1836089852(0x6d7081fc, float:4.6520965E27)
            X.3lr r0 = r8.A01(r1, r0)
            X.BWK r0 = (X.BWK) r0
            if (r0 == 0) goto L_0x013d
            X.HtD r14 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A00(r0)
        L_0x0134:
            X.HtM r13 = new X.HtM
            r13.<init>(r14, r15, r16, r17, r18)
            r6.add(r13)
            goto L_0x00d0
        L_0x013d:
            r14 = 0
            goto L_0x0134
        L_0x013f:
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            goto L_0x00fa
        L_0x0142:
            X.HsE r0 = new X.HsE
            r0.<init>(r6)
            r7.add(r0)
            goto L_0x006c
        L_0x014c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0151:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0156:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x015f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x015f:
            X.0sn r7 = X.0sn.A00
        L_0x0161:
            r5.A00 = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            goto L_0x0308
        L_0x0169:
            r5 = 31
            boolean r0 = X.ME5.A03(r5, r3)
            if (r0 == 0) goto L_0x018f
            r6 = r3
            X.ME5 r6 = (X.ME5) r6
            int r4 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x018f
            int r4 = r4 - r1
            r6.A00 = r4
        L_0x017f:
            java.lang.Object r1 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0195
            if (r0 == r3) goto L_0x0376
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x018f:
            X.ME5 r6 = new X.ME5
            r6.<init>(r2, r3, r5)
            goto L_0x017f
        L_0x0195:
            X.0eS.A00(r1)
            java.lang.Object r8 = r2.A01
            X.02o r8 = (X.02o) r8
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01b5
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r0 = r9.A00
            X.CuS r0 = (X.C45324CuS) r0
            java.lang.Integer r2 = r0.A00
            java.lang.Integer r1 = r0.A01
        L_0x01ac:
            X.HlK r0 = new X.HlK
            r0.<init>(r2, r1)
            r6.A00 = r3
            goto L_0x0304
        L_0x01b5:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01c5
            r0 = 0
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            goto L_0x01ac
        L_0x01c5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ca:
            r5 = 30
            boolean r0 = X.ME5.A03(r5, r3)
            if (r0 == 0) goto L_0x01f0
            r6 = r3
            X.ME5 r6 = (X.ME5) r6
            int r4 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x01f0
            int r4 = r4 - r1
            r6.A00 = r4
        L_0x01e0:
            java.lang.Object r1 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x01f6
            if (r0 == r5) goto L_0x0376
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01f0:
            X.ME5 r6 = new X.ME5
            r6.<init>(r2, r3, r5)
            goto L_0x01e0
        L_0x01f6:
            X.0eS.A00(r1)
            java.lang.Object r8 = r2.A01
            X.02o r8 = (X.02o) r8
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0240
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r0 = r9.A00
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x0236
            X.3lr r3 = X.C41845B3m.A0U(r0)
            if (r3 == 0) goto L_0x0236
            java.lang.Class<X.C6E> r2 = X.C6E.class
            java.lang.String r1 = "xdt_users__info(user_id:$user_id)"
            r0 = -332158032(0xffffffffec33abb0, float:-8.68834E26)
            X.3lr r3 = r3.A05(r2, r1, r0)
            if (r3 == 0) goto L_0x0236
            java.lang.Class<X.C6D> r2 = X.C6D.class
            java.lang.String r1 = "user"
            r0 = -675052497(0xffffffffd7c3842f, float:-4.29944983E14)
            X.3lr r3 = r3.A05(r2, r1, r0)
            if (r3 == 0) goto L_0x0236
            X.Uz1 r2 = X.C16665Uz1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "likes_visibility_setting"
            java.lang.Enum r0 = r3.getOptionalEnumField(r1, r0, r2)
            if (r0 != 0) goto L_0x0238
        L_0x0236:
            X.Uz1 r0 = X.C16665Uz1.EVERYONE
        L_0x0238:
            X.3Ih r0 = X.C41845B3m.A0d(r0)
            r6.A00 = r5
            goto L_0x0304
        L_0x0240:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0236
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0249:
            r5 = 29
            boolean r0 = X.ME5.A03(r5, r3)
            if (r0 == 0) goto L_0x026f
            r6 = r3
            X.ME5 r6 = (X.ME5) r6
            int r4 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x026f
            int r4 = r4 - r1
            r6.A00 = r4
        L_0x025f:
            java.lang.Object r1 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L_0x0275
            if (r0 == r7) goto L_0x0376
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x026f:
            X.ME5 r6 = new X.ME5
            r6.<init>(r2, r3, r5)
            goto L_0x025f
        L_0x0275:
            X.0eS.A00(r1)
            java.lang.Object r8 = r2.A01
            X.02o r8 = (X.02o) r8
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            r5 = 0
            if (r0 == 0) goto L_0x030f
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r0 = r9.A00
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x030d
            X.3lr r11 = X.C41845B3m.A0U(r0)
        L_0x028f:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.wellbeing.upsells.fragment.likevisibilitysetting.LikesVisibilityQueryResponse"
            X.0qQ.A0C(r11, r0)
            java.lang.Class<X.C6E> r10 = X.C6E.class
            java.lang.String r3 = "xdt_users__info(user_id:$user_id)"
            r0 = -332158032(0xffffffffec33abb0, float:-8.68834E26)
            X.3lr r9 = r11.A05(r10, r3, r0)
            if (r9 == 0) goto L_0x030b
            java.lang.Class<X.C6D> r2 = X.C6D.class
            java.lang.String r1 = "user"
            r0 = -675052497(0xffffffffd7c3842f, float:-4.29944983E14)
            X.3lr r1 = r9.A05(r2, r1, r0)
            if (r1 == 0) goto L_0x030b
            java.lang.String r0 = "besties_count"
            int r0 = r1.getCoercedIntField(r7, r0)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
        L_0x02b9:
            r0 = -332158032(0xffffffffec33abb0, float:-8.68834E26)
            X.3lr r12 = r11.A05(r10, r3, r0)
            if (r12 == 0) goto L_0x02db
            java.lang.Class<X.C6D> r2 = X.C6D.class
            java.lang.String r1 = "user"
            r0 = -675052497(0xffffffffd7c3842f, float:-4.29944983E14)
            X.3lr r2 = r12.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x02db
            r1 = 0
            java.lang.String r0 = "following_count"
            int r0 = r2.getCoercedIntField(r1, r0)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
        L_0x02db:
            r0 = -332158032(0xffffffffec33abb0, float:-8.68834E26)
            X.3lr r3 = r11.A05(r10, r3, r0)
            if (r3 == 0) goto L_0x02f9
            java.lang.Class<X.C6D> r2 = X.C6D.class
            java.lang.String r1 = "user"
            r0 = -675052497(0xffffffffd7c3842f, float:-4.29944983E14)
            X.3lr r3 = r3.A05(r2, r1, r0)
            if (r3 == 0) goto L_0x02f9
            X.Uz1 r2 = X.C16665Uz1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "likes_visibility_setting"
            r3.getOptionalEnumField(r1, r0, r2)
        L_0x02f9:
            X.CuS r0 = new X.CuS
            r0.<init>(r9, r5)
        L_0x02fe:
            X.3Ih r0 = X.C41845B3m.A0d(r0)
            r6.A00 = r7
        L_0x0304:
            java.lang.Object r0 = r8.emit(r0, r6)
        L_0x0308:
            if (r0 != r4) goto L_0x0379
            return r4
        L_0x030b:
            r9 = r5
            goto L_0x02b9
        L_0x030d:
            r11 = r5
            goto L_0x028f
        L_0x030f:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0319
            X.CuS r0 = new X.CuS
            r0.<init>(r5, r5)
            goto L_0x02fe
        L_0x0319:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x031e:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0360
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r0 = r9.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r1 = r0.FH3()
            X.0qQ.A07(r1)
            X.DRB r1 = (X.DRB) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.BEt r1 = (X.C42041BEt) r1
            java.util.List r11 = r1.A06
            java.lang.String r7 = r1.A02
            java.lang.String r8 = r1.A03
            com.instagram.api.schemas.AchievementButtonInfoImpl r5 = r1.A00
            com.instagram.api.schemas.AchievementButtonInfoImpl r6 = r1.A01
            java.lang.String r9 = r1.A04
            java.lang.String r10 = r1.A05
            X.QP7 r4 = new X.QP7
            r4.<init>((com.instagram.api.schemas.AchievementButtonInfo) r5, (com.instagram.api.schemas.AchievementButtonInfo) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.util.List) r11)
            java.lang.Object r0 = r2.A01
            X.GgY r0 = (X.C52981GgY) r0
            X.0V2 r2 = r0.A01
            X.CHN r1 = new X.CHN
            r1.<init>(r4)
        L_0x0357:
            java.lang.Object r4 = r2.emit(r1, r3)
            X.1Hj r0 = X.1Hj.A02
            if (r4 != r0) goto L_0x0379
            return r4
        L_0x0360:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x037c
            java.lang.Object r0 = r2.A01
            X.GgY r0 = (X.C52981GgY) r0
            X.0V2 r2 = r0.A01
            X.5sO r9 = (X.C297815sO) r9
            java.lang.Object r0 = r9.A00
            java.lang.String r0 = (java.lang.String) r0
            X.CHM r1 = new X.CHM
            r1.<init>(r0)
            goto L_0x0357
        L_0x0376:
            X.0eS.A00(r1)
        L_0x0379:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x037c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DIJ.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
