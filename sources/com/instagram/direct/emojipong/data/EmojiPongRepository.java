package com.instagram.direct.emojipong.data;

import X.05G;
import X.JTO;
import X.L1D;
import X.L1E;

public final class EmojiPongRepository {
    public final 05G A00 = JTO.A1J();
    public final L1D A01;
    public final L1E A02;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDk, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22, int r23) {
        /*
            r19 = this;
            r1 = r20
            r5 = r23
            r7 = 2
            r8 = r22
            boolean r0 = X.C66132MDk.A01(r7, r8)
            r4 = r19
            if (r0 == 0) goto L_0x00d1
            r3 = r8
            X.MDk r3 = (X.C66132MDk) r3
            int r6 = r3.A01
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r2
            if (r0 == 0) goto L_0x00d1
            int r6 = r6 - r2
            r3.A01 = r6
        L_0x001d:
            java.lang.Object r0 = r3.A04
            X.1Hj r2 = X.1Hj.A02
            int r6 = r3.A01
            r12 = 1
            if (r6 == 0) goto L_0x007e
            if (r6 != r12) goto L_0x00e1
            int r5 = r3.A00
            java.lang.Object r1 = r3.A03
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r3.A02
            com.instagram.direct.emojipong.data.EmojiPongRepository r3 = (com.instagram.direct.emojipong.data.EmojiPongRepository) r3
            X.0eS.A00(r0)
        L_0x0035:
            boolean r2 = r0 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x00d8
            X.05G r8 = r3.A00
            java.util.List r0 = X.JTO.A16(r8)
            boolean r7 = X.DbW.A1S(r12, r0, r1)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r2 = r4.next()
            com.instagram.direct.emojipong.data.EmojiPongUser r2 = (com.instagram.direct.emojipong.data.EmojiPongUser) r2
            java.lang.String r14 = r2.A03
            boolean r0 = r1.equals(r14)
            if (r0 == 0) goto L_0x007b
            r0 = r5
        L_0x0060:
            java.lang.String r15 = r2.A04
            java.lang.String r3 = r2.A01
            java.lang.String r2 = r2.A02
            X.0qQ.A0B(r14, r7)
            X.0qQ.A0B(r15, r12)
            com.instagram.direct.emojipong.data.EmojiPongUser r13 = new com.instagram.direct.emojipong.data.EmojiPongUser
            r16 = r3
            r17 = r2
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r6.add(r13)
            goto L_0x004b
        L_0x007b:
            int r0 = r2.A00
            goto L_0x0060
        L_0x007e:
            X.0eS.A00(r0)
            X.L1E r0 = r4.A02
            r3.A02 = r4
            r3.A03 = r1
            r3.A00 = r5
            r3.A01 = r12
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1vn r0 = X.1vm.A01(r0)
            r13 = 0
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            java.lang.Integer r7 = X.JTO.A0w(r5)
            java.lang.String r6 = "highscore"
            r9.A03(r6, r7)
            java.lang.String r6 = "threadId"
            r7 = r21
            X.1vR r7 = X.DbU.A0J(r9, r6, r7)
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.BhL> r11 = X.C42724BhL.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGEmojiPongSetHighscoreMutation"
            r14 = 0
            java.lang.String r16 = "xdt_set_emoji_pong_high_score"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1Ef r6 = X.JTS.A0G(r6)
            java.lang.Object r0 = r0.A04(r6, r3)
            if (r0 == r2) goto L_0x00eb
            r3 = r4
            goto L_0x0035
        L_0x00d1:
            X.MDk r3 = new X.MDk
            r3.<init>(r4, r8, r7)
            goto L_0x001d
        L_0x00d8:
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00e9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e6:
            r8.Epw(r6)
        L_0x00e9:
            X.0gF r2 = X.C60340gF.A00
        L_0x00eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.emojipong.data.EmojiPongRepository.A00(java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r21, java.lang.String r22, X.AnonymousClass4D7 r23, java.lang.String[] r24) {
        /*
            r20 = this;
            r1 = r21
            r2 = r22
            r7 = 33
            r8 = r23
            boolean r0 = X.MED.A04(r7, r8)
            r5 = r20
            if (r0 == 0) goto L_0x0176
            r0 = r8
            X.MED r0 = (X.MED) r0
            int r6 = r0.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r6 & r4
            if (r3 == 0) goto L_0x0176
            int r6 = r6 - r4
            r0.A00 = r6
        L_0x001e:
            java.lang.Object r8 = r0.A04
            X.1Hj r4 = X.1Hj.A02
            int r7 = r0.A00
            r6 = 2
            r3 = 1
            if (r7 == 0) goto L_0x0032
            if (r7 == r3) goto L_0x0099
            if (r7 != r6) goto L_0x017d
            X.0eS.A00(r8)
        L_0x002f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0032:
            X.0eS.A00(r8)
            X.L1E r10 = r5.A02
            java.util.List r9 = X.AnonymousClass7TE.A1I(r1)
            r11 = r24
            X.0qQ.A0B(r11, r3)
            int r8 = r9.size()
            int r7 = r11.length
            int r8 = r8 + r7
            java.util.ArrayList r12 = X.DbS.A0v(r8)
            r12.addAll(r9)
            X.018.A18(r12, r11)
            X.MED.A00(r5, r1, r2, r0, r3)
            com.instagram.common.session.UserSession r7 = r10.A00
            X.1vn r7 = X.1vm.A01(r7)
            r15 = 0
            X.2IS r11 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            X.2IV r9 = new X.2IV
            r9.<init>()
            java.lang.String r8 = "user_ids"
            r9.A05(r8, r12)
            java.lang.String r8 = "request"
            X.1vR r9 = X.JTP.A0L(r9, r11, r8)
            java.util.Map r11 = r11.getParamsCopy()
            java.util.Map r12 = r10.getParamsCopy()
            java.lang.Class<X.BhJ> r13 = X.C42722BhJ.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGEmojiPongHighScoresQuery"
            r14 = 0
            java.lang.String r18 = "xdt_get_emoji_pong_high_scores"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1Ef r8 = X.JTS.A0G(r8)
            java.lang.Object r8 = r7.A04(r8, r0)
            if (r8 != r4) goto L_0x00a8
            return r4
        L_0x0099:
            java.lang.Object r2 = r0.A03
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r0.A01
            com.instagram.direct.emojipong.data.EmojiPongRepository r5 = (com.instagram.direct.emojipong.data.EmojiPongRepository) r5
            X.0eS.A00(r8)
        L_0x00a8:
            X.3Ii r8 = (X.C239803Ii) r8
            boolean r7 = r8 instanceof X.C239793Ih
            if (r7 == 0) goto L_0x016d
            X.3lr r10 = X.C41846B3n.A0R(r8)
            if (r10 == 0) goto L_0x002f
            java.lang.Class<X.BhI> r9 = X.C42721BhI.class
            r7 = 4233(0x1089, float:5.932E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r7)
            r7 = -848168956(0xffffffffcd71f804, float:-2.53722688E8)
            X.3lr r10 = r10.A05(r9, r8, r7)
            if (r10 == 0) goto L_0x002f
            java.lang.Class<X.BhH> r9 = X.C42720BhH.class
            java.lang.String r8 = "users"
            r7 = 260455820(0xf863d8c, float:1.3237127E-29)
            com.google.common.collect.ImmutableList r7 = r10.A06(r9, r8, r7)
            if (r7 == 0) goto L_0x002f
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r11 = r7.iterator()
        L_0x00da:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L_0x011c
            X.3lr r10 = X.C41845B3m.A0V(r11)
            java.lang.String r7 = "strong_id__"
            java.lang.String r13 = r10.getOptionalStringField(r6, r7)
            java.lang.String r14 = ""
            if (r13 != 0) goto L_0x00ef
            r13 = r14
        L_0x00ef:
            java.lang.String r7 = X.C67009Mgh.A00()
            java.lang.String r7 = r10.A0B(r7)
            if (r7 == 0) goto L_0x00fa
            r14 = r7
        L_0x00fa:
            java.lang.String r7 = "full_name"
            java.lang.String r15 = r10.getOptionalStringField(r3, r7)
            r9 = 7
            java.lang.String r7 = "profile_pic_url"
            java.lang.String r16 = r10.getOptionalStringField(r9, r7)
            r9 = 8
            r7 = 3049(0xbe9, float:4.273E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            int r17 = r10.getCoercedIntField(r9, r7)
            com.instagram.direct.emojipong.data.EmojiPongUser r12 = new com.instagram.direct.emojipong.data.EmojiPongUser
            r12.<init>(r13, r14, r15, r16, r17)
            r8.add(r12)
            goto L_0x00da
        L_0x011c:
            X.05G r3 = r5.A00
            r3.Epw(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x0125:
            boolean r3 = r8.hasNext()
            r7 = 0
            if (r3 == 0) goto L_0x013b
            java.lang.Object r7 = r8.next()
            r3 = r7
            com.instagram.direct.emojipong.data.EmojiPongUser r3 = (com.instagram.direct.emojipong.data.EmojiPongUser) r3
            java.lang.String r3 = r3.A03
            boolean r3 = X.0qQ.A0K(r3, r1)
            if (r3 == 0) goto L_0x0125
        L_0x013b:
            com.instagram.direct.emojipong.data.EmojiPongUser r7 = (com.instagram.direct.emojipong.data.EmojiPongUser) r7
            if (r7 == 0) goto L_0x002f
            int r10 = r7.A00
            X.L1D r3 = r5.A01
            X.1Av r3 = r3.A00
            X.0xa r9 = r3.A01
            r3 = 127(0x7f, float:1.78E-43)
            java.lang.String r8 = X.C66579MXk.A00(r3)
            r7 = 0
            int r3 = r9.getInt(r8, r7)
            if (r10 <= r3) goto L_0x0159
            X.AnonymousClass7TG.A1M(r9, r8, r10)
            goto L_0x002f
        L_0x0159:
            int r3 = r9.getInt(r8, r7)
            if (r10 >= r3) goto L_0x002f
            int r3 = r9.getInt(r8, r7)
            X.MED.A03(r0, r6)
            java.lang.Object r0 = r5.A00(r1, r2, r0, r3)
            if (r0 != r4) goto L_0x002f
            return r4
        L_0x016d:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0176:
            X.MED r0 = new X.MED
            r0.<init>(r5, r8, r7)
            goto L_0x001e
        L_0x017d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.emojipong.data.EmojiPongRepository.A01(java.lang.String, java.lang.String, X.4D7, java.lang.String[]):java.lang.Object");
    }

    public EmojiPongRepository(L1D l1d, L1E l1e) {
        this.A02 = l1e;
        this.A01 = l1d;
    }
}
