package X;

public final class MI6 extends AnonymousClass1Ek implements 0sH {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MI6(Object obj, AnonymousClass4D7 r3, int i) {
        super(6, r3);
        this.A05 = i;
        this.A06 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        MI6 mi6;
        if (this.A05 != 0) {
            boolean A1a = AnonymousClass7TE.A1a(obj);
            int A0M = AnonymousClass7TE.A0M(obj2);
            boolean A1a2 = AnonymousClass7TE.A1a(obj5);
            mi6 = new MI6(this.A06, (AnonymousClass4D7) obj6, 1);
            mi6.A03 = A1a;
            mi6.A00 = A0M;
            mi6.A01 = obj3;
            mi6.A02 = obj4;
            mi6.A04 = A1a2;
        } else {
            boolean A1a3 = AnonymousClass7TE.A1a(obj2);
            boolean A1a4 = AnonymousClass7TE.A1a(obj3);
            int A0M2 = AnonymousClass7TE.A0M(obj4);
            mi6 = new MI6(this.A06, (AnonymousClass4D7) obj6, 0);
            mi6.A01 = obj;
            mi6.A03 = A1a3;
            mi6.A04 = A1a4;
            mi6.A00 = A0M2;
            mi6.A02 = obj5;
        }
        return mi6.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017e, code lost:
        r43 = X.AnonymousClass7TF.A1W(r0, X.C62629Kj0.PUBLISHED);
        r44 = X.AnonymousClass7TF.A1W(r0, X.C62629Kj0.PUBLISHED_EDITS_IN_REVIEW);
        r0 = r0.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018f, code lost:
        if (r0 == 7) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0192, code lost:
        if (r0 == 3) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0194, code lost:
        r45 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0198, code lost:
        if (r0 != 11) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x019a, code lost:
        r45 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019d, code lost:
        if (r0 == 3) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x019f, code lost:
        r46 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a3, code lost:
        if (r0 != 11) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01a5, code lost:
        r46 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a7, code lost:
        if (r3 == null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a9, code lost:
        r17 = r3.A00;
        r15 = r3.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01af, code lost:
        r6 = X.JTR.A0z(r1, r4);
        r0 = X.C62626Kix.ONLY_ME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01b5, code lost:
        if (r6 == r0) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b7, code lost:
        if (r3 == null) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b9, code lost:
        r49 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01bd, code lost:
        if (r3.A0J != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01bf, code lost:
        r49 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c1, code lost:
        if (r3 == null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c3, code lost:
        r9 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01c5, code lost:
        if (r9 != null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01c7, code lost:
        r9 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c9, code lost:
        r34 = X.DbT.A10(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01cd, code lost:
        if (r3 == null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01cf, code lost:
        r8 = r3.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d1, code lost:
        if (r8 != null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d3, code lost:
        r8 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d5, code lost:
        if (r3 == null) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01d7, code lost:
        r3 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01d9, code lost:
        r6 = X.C51966G9m.A0P(r23);
        r5 = X.JTR.A0z(r3, r4);
        r4 = X.JTO.A19(r4);
        r12 = r2.A0G;
        r3 = X.JTP.A0M(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01eb, code lost:
        if (r3 == null) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ed, code lost:
        r3 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01f3, code lost:
        if (r4.get(r3) == r0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f5, code lost:
        if (r5 != r0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f7, code lost:
        r0 = X.JTP.A0M(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01fb, code lost:
        if (r0 == null) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01fd, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ff, code lost:
        r3 = 2131952814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0204, code lost:
        if (r0 != X.C62629Kj0.IN_REVIEW) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0206, code lost:
        r3 = 2131972502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0209, code lost:
        r6 = X.C51967G9n.A0p(r6, r3);
        r0 = X.JTP.A0M(r2.A08);
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0215, code lost:
        if (r0 == null) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0217, code lost:
        r12 = r0.A03;
        r3 = r2.A02;
        r4 = X.LST.A00(r3);
        r14 = r0.A09;
        r5 = X.LST.A02(r3);
        r13 = r0.A06;
        r3 = X.LST.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x022f, code lost:
        if (X.C51966G9m.A1X(r12) == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0235, code lost:
        if (r12.length() > r4) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x023b, code lost:
        if (X.C51966G9m.A1X(r14) == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0241, code lost:
        if (r14.length() > r5) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0247, code lost:
        if (X.C51966G9m.A1X(r13) == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x024d, code lost:
        if (r13.length() > r3) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x024f, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0250, code lost:
        if (r16 == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0252, code lost:
        r0 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r1 == X.AnonymousClass3NV.A05) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0256, code lost:
        if (r0 == null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0258, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x025b, code lost:
        if (r0.A0K != false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x025d, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x025e, code lost:
        r0 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0262, code lost:
        if (r0 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0264, code lost:
        r2 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0268, code lost:
        if (r2 == X.C62629Kj0.PUBLISHED_EDITS_DRAFT) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x026a, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x026b, code lost:
        if (r3 != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x026d, code lost:
        if (r4 == false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x026f, code lost:
        r7 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0271, code lost:
        r29 = r20;
        r30 = r19;
        r31 = r18;
        r32 = r1;
        r33 = r11;
        r35 = r10;
        r36 = r9;
        r37 = r8;
        r38 = r24;
        r47 = r26;
        r48 = r15;
        r51 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02a9, code lost:
        return new X.C61014JvE(new X.C61081JwJ(r6, r7, 6), r17, r21, r27, r22, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, X.182.A06(X.0Tu.A05, r23, 36330204939239946L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02aa, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02ac, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02b2, code lost:
        r3 = 2131952809;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02b5, code lost:
        if (r5 != r0) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02b9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02bc, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02bf, code lost:
        r17 = null;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02c4, code lost:
        r43 = false;
        r44 = false;
        r45 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02cc, code lost:
        r42 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02d0, code lost:
        r40 = false;
        r41 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02de, code lost:
        if (r6 != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r5 <= 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r10 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (X.JTR.A0z(r1, r4) == X.C62626Kix.ANYONE_WITH_LINK) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (((X.C62414KfP) r6.A06).A06 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0133, code lost:
        if (r6 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        if (r3 != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013f, code lost:
        r6 = r3.A09;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0143, code lost:
        if (r6 != null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0145, code lost:
        r19 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0147, code lost:
        if (r3 == null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0149, code lost:
        r6 = r3.A0B;
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014d, code lost:
        if (r6 != null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014f, code lost:
        r18 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0151, code lost:
        if (r0 == null) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0153, code lost:
        r8 = r0.ordinal();
        r40 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015a, code lost:
        if (r8 == 5) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015d, code lost:
        if (r8 == 6) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0160, code lost:
        if (r8 == 7) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0164, code lost:
        if (r8 == 8) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0166, code lost:
        r40 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0168, code lost:
        r41 = X.AnonymousClass7TF.A1W(r0, X.C62629Kj0.IN_REVIEW);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0170, code lost:
        if (r8 == 8) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0174, code lost:
        if (r8 == 11) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0178, code lost:
        if (r8 == 12) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        r42 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017c, code lost:
        if (r0 == null) goto L_0x02c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            r53 = this;
            r6 = r53
            int r0 = r6.A05
            if (r0 == 0) goto L_0x0078
            X.0eS.A00(r54)
            boolean r7 = r6.A03
            int r5 = r6.A00
            java.lang.Object r4 = r6.A01
            X.9I5 r4 = (X.AnonymousClass9I5) r4
            java.lang.Object r8 = r6.A02
            X.JvD r8 = (X.C61013JvD) r8
            boolean r2 = r6.A04
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r6.A06
            X.KfP r0 = (X.C62414KfP) r0
            boolean r0 = r0.A06
            r33 = 1
            if (r0 != 0) goto L_0x0027
        L_0x0025:
            r33 = 0
        L_0x0027:
            java.lang.Object r3 = r6.A06
            X.KfP r3 = (X.C62414KfP) r3
            r31 = 1
            if (r8 == 0) goto L_0x0076
            X.3NV r1 = r8.A06
        L_0x0031:
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r1 == r0) goto L_0x003f
            if (r8 == 0) goto L_0x0074
            X.3NV r1 = r8.A06
        L_0x0039:
            X.3NV r0 = X.AnonymousClass3NV.A05
            r35 = 1
            if (r1 != r0) goto L_0x0041
        L_0x003f:
            r35 = 0
        L_0x0041:
            if (r7 == 0) goto L_0x0047
            r37 = 1
            if (r5 > 0) goto L_0x0049
        L_0x0047:
            r37 = 0
        L_0x0049:
            r0 = 9
            java.lang.String r24 = r3.getFormattedBadgeCount(r5, r0)
            int r1 = r4.A00
            boolean r38 = X.AnonymousClass7TF.A1R(r1)
            r0 = 99
            java.lang.String r25 = r3.getFormattedBadgeCount(r1, r0)
            r27 = 0
            r26 = 2131237850(0x7f081bda, float:1.8091962E38)
            X.JvC r23 = new X.JvC
            r28 = r27
            r29 = r27
            r30 = r27
            r32 = r27
            r34 = r31
            r36 = r2
            r39 = r27
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r23
        L_0x0074:
            r1 = 0
            goto L_0x0039
        L_0x0076:
            r1 = 0
            goto L_0x0031
        L_0x0078:
            X.0eS.A00(r54)
            java.lang.Object r3 = r6.A01
            X.Jvz r3 = (X.C61061Jvz) r3
            boolean r0 = r6.A03
            r26 = r0
            boolean r0 = r6.A04
            r25 = r0
            int r0 = r6.A00
            r24 = r0
            java.lang.Object r11 = r6.A02
            java.lang.String r11 = (java.lang.String) r11
            if (r3 == 0) goto L_0x00ed
            X.Kj0 r0 = r3.A02
            java.util.List r10 = r3.A0C
            if (r10 != 0) goto L_0x0099
        L_0x0097:
            X.0sn r10 = X.0sn.A00
        L_0x0099:
            if (r3 == 0) goto L_0x00eb
            java.lang.String r1 = r3.A08
        L_0x009d:
            java.lang.String r14 = ""
            if (r1 != 0) goto L_0x00a2
            r1 = r14
        L_0x00a2:
            java.lang.Object r6 = r6.A06
            X.JjI r6 = (X.C60315JjI) r6
            X.0Ud r4 = r6.A0B
            java.lang.Object r2 = X.JTR.A0z(r1, r4)
            X.Kix r12 = X.C62626Kix.PUBLIC
            if (r2 == r12) goto L_0x00ba
            java.lang.Object r5 = X.JTR.A0z(r1, r4)
            X.Kix r2 = X.C62626Kix.ANYONE_WITH_LINK
            r39 = 0
            if (r5 != r2) goto L_0x00bc
        L_0x00ba:
            r39 = 1
        L_0x00bc:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            if (r3 == 0) goto L_0x00ef
            java.util.List r2 = r3.A0E
            if (r2 == 0) goto L_0x00ef
            java.util.Iterator r8 = r2.iterator()
        L_0x00ca:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r7 = r8.next()
            X.Jvt r7 = (X.C61055Jvt) r7
            boolean r2 = r7.A03
            if (r2 == 0) goto L_0x00ca
            int r2 = r5.length()
            if (r2 <= 0) goto L_0x00e5
            java.lang.String r2 = ", "
            r5.append(r2)
        L_0x00e5:
            java.lang.String r2 = r7.A01
            r5.append(r2)
            goto L_0x00ca
        L_0x00eb:
            r1 = 0
            goto L_0x009d
        L_0x00ed:
            r0 = 0
            goto L_0x0097
        L_0x00ef:
            com.instagram.common.session.UserSession r2 = r6.A01
            r23 = r2
            java.lang.Integer r2 = X.JTS.A0e(r23)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            boolean r13 = X.AnonymousClass7TF.A1W(r2, r7)
            com.instagram.aistudio.editor.AiSettingsRepository r2 = r6.A00
            X.0Ud r6 = r2.A0Y
            java.util.Map r8 = X.JTO.A19(r6)
            if (r3 == 0) goto L_0x02e6
            java.lang.String r6 = r3.A08
        L_0x0109:
            java.lang.Object r9 = r8.get(r6)
            java.lang.Integer r6 = X.JTS.A0e(r23)
            int r8 = r6.intValue()
            r50 = 0
            r6 = 1
            if (r8 == r6) goto L_0x011f
            r6 = 2
            if (r8 != r6) goto L_0x0123
            X.Kix r12 = X.C62626Kix.PUBLIC_FOR_IG_PRIVATE_ACCOUNTS
        L_0x011f:
            if (r9 != r12) goto L_0x0123
            r50 = 1
        L_0x0123:
            if (r13 != 0) goto L_0x02e2
            X.4Cl r6 = X.DbX.A0m(r23)
            java.lang.Integer r27 = r6.B6v()
        L_0x012d:
            if (r3 == 0) goto L_0x0135
            java.lang.String r6 = r3.A06
            r22 = r6
            if (r6 != 0) goto L_0x02d6
        L_0x0135:
            r22 = r14
            if (r3 != 0) goto L_0x02d6
            r21 = 0
        L_0x013b:
            r20 = r14
            if (r3 == 0) goto L_0x0145
        L_0x013f:
            java.lang.String r6 = r3.A09
            r19 = r6
            if (r6 != 0) goto L_0x0149
        L_0x0145:
            r19 = r14
            if (r3 == 0) goto L_0x014f
        L_0x0149:
            java.lang.String r6 = r3.A0B
            r18 = r6
            if (r6 != 0) goto L_0x0151
        L_0x014f:
            r18 = r14
        L_0x0151:
            if (r0 == 0) goto L_0x02d0
            int r8 = r0.ordinal()
            r40 = 1
            r6 = 5
            if (r8 == r6) goto L_0x0168
            r6 = 6
            if (r8 == r6) goto L_0x0168
            r6 = 7
            if (r8 == r6) goto L_0x0168
            r6 = 8
            if (r8 == r6) goto L_0x0168
            r40 = 0
        L_0x0168:
            X.Kj0 r6 = X.C62629Kj0.IN_REVIEW
            boolean r41 = X.AnonymousClass7TF.A1W(r0, r6)
            r6 = 8
            if (r8 == r6) goto L_0x02cc
            r6 = 11
            if (r8 == r6) goto L_0x02cc
            r6 = 12
            if (r8 == r6) goto L_0x02cc
        L_0x017a:
            r42 = 0
        L_0x017c:
            if (r0 == 0) goto L_0x02c4
            X.Kj0 r6 = X.C62629Kj0.PUBLISHED
            boolean r43 = X.AnonymousClass7TF.A1W(r0, r6)
            X.Kj0 r6 = X.C62629Kj0.PUBLISHED_EDITS_IN_REVIEW
            boolean r44 = X.AnonymousClass7TF.A1W(r0, r6)
            int r0 = r0.ordinal()
            r6 = 7
            if (r0 == r6) goto L_0x019a
            r6 = 3
            if (r0 == r6) goto L_0x019a
            r6 = 11
            r45 = 0
            if (r0 != r6) goto L_0x019c
        L_0x019a:
            r45 = 1
        L_0x019c:
            r6 = 3
            if (r0 == r6) goto L_0x01a5
            r6 = 11
            r46 = 1
            if (r0 != r6) goto L_0x01a7
        L_0x01a5:
            r46 = 0
        L_0x01a7:
            if (r3 == 0) goto L_0x02bf
            X.JwB r0 = r3.A00
            r17 = r0
            boolean r15 = r3.A0L
        L_0x01af:
            java.lang.Object r6 = X.JTR.A0z(r1, r4)
            X.Kix r0 = X.C62626Kix.ONLY_ME
            if (r6 == r0) goto L_0x01bf
            if (r3 == 0) goto L_0x01bf
            boolean r6 = r3.A0J
            r49 = 1
            if (r6 != 0) goto L_0x01c3
        L_0x01bf:
            r49 = 0
            if (r3 == 0) goto L_0x01c7
        L_0x01c3:
            java.util.List r9 = r3.A0E
            if (r9 != 0) goto L_0x01c9
        L_0x01c7:
            X.0sn r9 = X.0sn.A00
        L_0x01c9:
            java.lang.String r34 = X.DbT.A10(r5)
            if (r3 == 0) goto L_0x01d3
            java.util.List r8 = r3.A0D
            if (r8 != 0) goto L_0x01d5
        L_0x01d3:
            X.0sn r8 = X.0sn.A00
        L_0x01d5:
            if (r3 == 0) goto L_0x02bc
            java.lang.String r3 = r3.A08
        L_0x01d9:
            android.content.Context r6 = X.C51966G9m.A0P(r23)
            java.lang.Object r5 = X.JTR.A0z(r3, r4)
            java.util.Map r4 = X.JTO.A19(r4)
            X.05G r12 = r2.A0G
            X.Jvz r3 = X.JTP.A0M(r12)
            if (r3 == 0) goto L_0x02b9
            java.lang.String r3 = r3.A08
        L_0x01ef:
            java.lang.Object r3 = r4.get(r3)
            if (r3 == r0) goto L_0x02b2
            if (r5 != r0) goto L_0x02b2
            X.Jvz r0 = X.JTP.A0M(r12)
            if (r0 == 0) goto L_0x02af
            X.Kj0 r0 = r0.A02
        L_0x01ff:
            X.Kj0 r4 = X.C62629Kj0.IN_REVIEW
            r3 = 2131952814(0x7f1304ae, float:1.9542081E38)
            if (r0 != r4) goto L_0x0209
        L_0x0206:
            r3 = 2131972502(0x7f135196, float:1.9582013E38)
        L_0x0209:
            java.lang.String r6 = X.C51967G9n.A0p(r6, r3)
            X.05G r0 = r2.A08
            X.Jvz r0 = X.JTP.A0M(r0)
            r16 = 1
            if (r0 == 0) goto L_0x024f
            java.lang.String r12 = r0.A03
            com.instagram.common.session.UserSession r3 = r2.A02
            int r4 = X.LST.A00(r3)
            java.lang.String r14 = r0.A09
            int r5 = X.LST.A02(r3)
            java.lang.String r13 = r0.A06
            int r3 = X.LST.A01(r3)
            boolean r0 = X.C51966G9m.A1X(r12)
            if (r0 == 0) goto L_0x02ac
            int r0 = r12.length()
            if (r0 > r4) goto L_0x02ac
            boolean r0 = X.C51966G9m.A1X(r14)
            if (r0 == 0) goto L_0x02ac
            int r0 = r14.length()
            if (r0 > r5) goto L_0x02ac
            boolean r0 = X.C51966G9m.A1X(r13)
            if (r0 == 0) goto L_0x02ac
            int r0 = r13.length()
            if (r0 > r3) goto L_0x02ac
        L_0x024f:
            r4 = 1
            if (r16 == 0) goto L_0x025d
            X.Jvz r0 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r2)
            if (r0 == 0) goto L_0x025d
            boolean r0 = r0.A0K
            r3 = 1
            if (r0 != 0) goto L_0x025e
        L_0x025d:
            r3 = 0
        L_0x025e:
            X.Jvz r0 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r2)
            if (r0 == 0) goto L_0x02aa
            X.Kj0 r2 = r0.A02
        L_0x0266:
            X.Kj0 r0 = X.C62629Kj0.PUBLISHED_EDITS_DRAFT
            if (r2 == r0) goto L_0x026b
            r4 = 0
        L_0x026b:
            if (r3 != 0) goto L_0x026f
            if (r4 == 0) goto L_0x0271
        L_0x026f:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0271:
            r0 = 6
            X.JwJ r5 = new X.JwJ
            r5.<init>((java.lang.String) r6, (java.lang.Integer) r7, (int) r0)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36330204939239946(0x8112210005420a, double:3.038706121344025E-306)
            r0 = r23
            boolean r52 = X.182.A06(r4, r0, r2)
            X.JvE r23 = new X.JvE
            r29 = r20
            r30 = r19
            r31 = r18
            r32 = r1
            r33 = r11
            r35 = r10
            r36 = r9
            r37 = r8
            r38 = r24
            r47 = r26
            r48 = r15
            r51 = r25
            r24 = r5
            r25 = r17
            r26 = r21
            r28 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r23
        L_0x02aa:
            r2 = 0
            goto L_0x0266
        L_0x02ac:
            r16 = 0
            goto L_0x024f
        L_0x02af:
            r0 = 0
            goto L_0x01ff
        L_0x02b2:
            r3 = 2131952809(0x7f1304a9, float:1.9542071E38)
            if (r5 != r0) goto L_0x0209
            goto L_0x0206
        L_0x02b9:
            r3 = 0
            goto L_0x01ef
        L_0x02bc:
            r3 = 0
            goto L_0x01d9
        L_0x02bf:
            r17 = 0
            r15 = 1
            goto L_0x01af
        L_0x02c4:
            r43 = 0
            r44 = 0
            r45 = 0
            goto L_0x01a5
        L_0x02cc:
            r42 = 1
            goto L_0x017c
        L_0x02d0:
            r40 = 0
            r41 = 0
            goto L_0x017a
        L_0x02d6:
            com.instagram.common.typedurl.ImageUrl r6 = r3.A01
            r21 = r6
            java.lang.String r6 = r3.A03
            r20 = r6
            if (r6 != 0) goto L_0x013f
            goto L_0x013b
        L_0x02e2:
            r27 = 0
            goto L_0x012d
        L_0x02e6:
            r6 = 0
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MI6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
