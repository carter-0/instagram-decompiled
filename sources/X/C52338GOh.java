package X;

/* renamed from: X.GOh  reason: case insensitive filesystem */
public abstract class C52338GOh {
    public static final boolean A01(C2809354u r2) {
        String text;
        String id;
        0qQ.A0B(r2, 0);
        if (r2.getId() == null || r2.CCd() == null || (text = r2.getText()) == null || 00l.A0W(text) || r2.getUserId() == null || (id = r2.getId()) == null || 00l.A0W(id)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0245, code lost:
        if (r7 > (java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MINUTES.toMillis((long) X.DbS.A04(r2, r1, 36604636170359880L)))) goto L_0x0146;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState A00(X.C2809354u r55, X.AnonymousClass0iw r56, com.instagram.common.session.UserSession r57, X.C245893de r58, java.lang.Integer r59, java.util.List r60, int r61, int r62, int r63, boolean r64, boolean r65) {
        /*
            r4 = r63
            r52 = r65
            r0 = r4 & 256(0x100, float:3.59E-43)
            r1 = r57
            if (r0 == 0) goto L_0x00f3
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326713130629050(0x810ef4000237ba, double:3.0364978875181095E-306)
            boolean r48 = X.182.A06(r0, r1, r2)
        L_0x0015:
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00ef
            X.3jK r0 = X.C249223jK.A00
            boolean r49 = r0.A09(r1)
        L_0x001f:
            r0 = r4 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00eb
            X.3jK r0 = X.C249223jK.A00
            boolean r50 = r0.A08(r1)
        L_0x0029:
            r0 = r4 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00e7
            X.3jK r0 = X.C249223jK.A00
            boolean r51 = r0.A09(r1)
        L_0x0033:
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0042
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326713131284420(0x810ef4000c37c4, double:3.036497887932568E-306)
            boolean r52 = X.182.A06(r0, r1, r2)
        L_0x0042:
            r0 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00e3
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326713131153346(0x810ef4000a37c2, double:3.0364978878496764E-306)
            boolean r53 = X.182.A06(r0, r1, r2)
        L_0x0051:
            r0 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00df
            boolean r54 = X.C249223jK.A05(r1)
        L_0x0059:
            r9 = 0
            r25 = r55
            r0 = r25
            X.0qQ.A0B(r0, r9)
            r14 = 1
            com.instagram.user.model.User r23 = r25.CCd()
            boolean r0 = A01(r25)
            if (r0 == 0) goto L_0x025f
            if (r23 == 0) goto L_0x025f
            java.lang.String r11 = r25.getId()
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x0077
            r11 = r0
        L_0x0077:
            r5 = r58
            X.1Xj r6 = r5.A00
            java.lang.String r29 = r6.getId()
            if (r29 != 0) goto L_0x0083
            r29 = r0
        L_0x0083:
            java.lang.String r2 = r25.getText()
            if (r2 == 0) goto L_0x008a
            r0 = r2
        L_0x008a:
            com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent r15 = new com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent
            r15.<init>(r0)
            com.instagram.common.typedurl.ImageUrl r20 = r23.Bh3()
            com.instagram.common.typedurl.ImageUrl r21 = r6.A1Q()
            java.lang.String r0 = r25.getUserId()
            java.lang.String r30 = java.lang.String.valueOf(r0)
            java.lang.Boolean r0 = r25.BCJ()
            boolean r42 = X.AnonymousClass7TF.A1Y(r0, r14)
            java.lang.Long r28 = r25.AsC()
            java.lang.Integer r24 = r25.AdI()
            java.lang.String r32 = r56.getModuleName()
            java.lang.String r33 = X.C51965G9l.A0t(r6)
            java.lang.String r34 = X.DbT.A0x(r6)
            java.util.List r0 = r25.Bjr()
            if (r0 == 0) goto L_0x00f7
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x00c9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r2.next()
            com.instagram.api.schemas.NoteEmojiReactionInfoIntf r0 = (com.instagram.api.schemas.NoteEmojiReactionInfoIntf) r0
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x00c9
            r13.add(r0)
            goto L_0x00c9
        L_0x00df:
            r54 = 0
            goto L_0x0059
        L_0x00e3:
            r53 = 0
            goto L_0x0051
        L_0x00e7:
            r51 = 0
            goto L_0x0033
        L_0x00eb:
            r50 = 0
            goto L_0x0029
        L_0x00ef:
            r49 = 0
            goto L_0x001f
        L_0x00f3:
            r48 = 0
            goto L_0x0015
        L_0x00f7:
            X.0sn r13 = X.0sn.A00
        L_0x00f9:
            java.lang.String r0 = r25.getUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.2R8.A05(r1, r0)
            r43 = r0 ^ 1
            X.0Tu r2 = X.0Tu.A05
            r3 = 36323161193327543(0x810bb9000c2bb7, double:3.034251628066133E-306)
            boolean r44 = X.182.A06(r2, r1, r3)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            java.lang.String r0 = r5.A02
            r22 = r0
            boolean r46 = r6.CeS()
            java.lang.String r0 = r25.getUserId()
            X.3gC r4 = X.C247333gA.A00(r1)
            r39 = r61
            if (r61 != 0) goto L_0x0144
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r0 == 0) goto L_0x0144
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0144
            java.lang.String r3 = r1.A06
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x0168
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0168
        L_0x0144:
            r27 = r12
        L_0x0146:
            com.instagram.api.schemas.NoteCustomTheme r19 = r25.Auz()
            r36 = 0
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r18 = new com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState
            r25 = r59
            r37 = r60
            r45 = r64
            r40 = r62
            r26 = r12
            r31 = r11
            r35 = r22
            r38 = r13
            r41 = r14
            r47 = r9
            r22 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return r18
        L_0x0168:
            java.lang.Integer r0 = r4.A00
            r3 = r12
            r27 = r12
            if (r0 == r12) goto L_0x0172
            r27 = r0
            goto L_0x0146
        L_0x0172:
            r6 = 36323161193589691(0x810bb900102bbb, double:3.0342516282319164E-306)
            boolean r0 = X.182.A06(r2, r1, r6)
            if (r0 == 0) goto L_0x025b
            r6 = 36320652937405179(0x810971005822fb, double:3.032665396920894E-306)
            boolean r3 = X.182.A06(r2, r1, r6)
            r0 = 2
            X.GP4[] r0 = new X.GP4[r0]
            if (r3 == 0) goto L_0x024b
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.GP4 r3 = X.GP3.A00(r1, r3)
            r0[r9] = r3
        L_0x0193:
            X.GP4 r3 = X.GP3.A00(r1, r5)
            r0[r14] = r3
            java.util.List r3 = X.0sr.A1P(r0)
            X.Ijv r0 = new X.Ijv
            r0.<init>(r9)
            java.util.List r19 = X.00k.A0g(r3, r0)
            java.util.Iterator r18 = r19.iterator()
        L_0x01aa:
            boolean r3 = r18.hasNext()
            r0 = 0
            if (r3 == 0) goto L_0x0249
            java.lang.Object r3 = r18.next()
            r5 = r3
            X.GP4 r5 = (X.GP4) r5
            boolean r6 = r5.A03
            if (r6 != 0) goto L_0x01aa
            int r10 = r5.A00
            r6 = 36604636170425417(0x820bb900121449, double:3.212257536991587E-306)
            long r6 = X.182.A01(r2, r1, r6)
            int r8 = (int) r6
            if (r10 >= r8) goto L_0x01aa
            long r16 = java.lang.System.currentTimeMillis()
            long r5 = r5.A01
            long r16 = r16 - r5
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            r5 = 36604636170359880(0x820bb900111448, double:3.2122575369501414E-306)
            long r5 = X.182.A01(r2, r1, r5)
            int r7 = (int) r5
            long r5 = (long) r7
            long r6 = r8.toMillis(r5)
            int r5 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x01aa
        L_0x01e7:
            X.GP4 r3 = (X.GP4) r3
            if (r3 == 0) goto L_0x0255
            java.lang.Integer r3 = r3.A02
            if (r3 == 0) goto L_0x0255
            if (r3 == r12) goto L_0x025b
            java.util.Iterator r17 = r19.iterator()
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x0221
            java.lang.Object r0 = r17.next()
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x0221
            r5 = r0
            X.GP4 r5 = (X.GP4) r5
            long r7 = r5.A01
        L_0x020a:
            java.lang.Object r16 = r17.next()
            r5 = r16
            X.GP4 r5 = (X.GP4) r5
            long r5 = r5.A01
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x021b
            r0 = r16
            r7 = r5
        L_0x021b:
            boolean r5 = r17.hasNext()
            if (r5 != 0) goto L_0x020a
        L_0x0221:
            X.GP4 r0 = (X.GP4) r0
            if (r0 == 0) goto L_0x0257
            long r7 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            if (r0 == 0) goto L_0x0257
            long r16 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            r5 = 36604636170359880(0x820bb900111448, double:3.2122575369501414E-306)
            int r0 = X.DbS.A04(r2, r1, r5)
            long r0 = (long) r0
            long r0 = r10.toMillis(r0)
            long r16 = r16 - r0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0257
            goto L_0x0146
        L_0x0249:
            r3 = r0
            goto L_0x01e7
        L_0x024b:
            X.GP4 r3 = X.GP3.A00(r1, r5)
            r0[r9] = r3
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x0193
        L_0x0255:
            r3 = r12
            goto L_0x025b
        L_0x0257:
            r4.A01 = r11
            r4.A00 = r3
        L_0x025b:
            r27 = r3
            goto L_0x0146
        L_0x025f:
            r18 = 0
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52338GOh.A00(X.54u, X.0iw, com.instagram.common.session.UserSession, X.3de, java.lang.Integer, java.util.List, int, int, int, boolean, boolean):com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState");
    }
}
