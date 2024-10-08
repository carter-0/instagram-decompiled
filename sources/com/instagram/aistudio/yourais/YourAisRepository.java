package com.instagram.aistudio.yourais;

import X.0Tu;
import X.182;
import X.1vn;
import X.AnonymousClass7TG;
import com.instagram.common.session.UserSession;

public final class YourAisRepository {
    public final boolean A00;
    public final UserSession A01;
    public final 1vn A02;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r3.getCoercedBooleanField(0, "is_ig_creator_ai") != true) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (X.0sr.A1P(new X.C62629Kj0[]{X.C62629Kj0.A06, X.C62629Kj0.A07, X.C62629Kj0.A08}).contains(r9) != true) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (X.0sr.A1P(new java.lang.String[]{"ANYONE_WITH_LINK", "CLOSE_FRIENDS", "PUBLIC", "PUBLIC_FOR_IG_PRIVATE_ACCOUNTS"}).contains(r3.name()) == false) goto L_0x017e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r30) {
        /*
            r29 = this;
            r5 = 32
            r6 = r30
            boolean r0 = X.C66144MDw.A02(r5, r6)
            r4 = r29
            if (r0 == 0) goto L_0x01ec
            r3 = r6
            X.MDw r3 = (X.C66144MDw) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01ec
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r2 = r3.A00
            r0 = 1
            if (r2 == 0) goto L_0x01af
            if (r2 != r0) goto L_0x01f8
            java.lang.Object r13 = r3.A01
            com.instagram.aistudio.yourais.YourAisRepository r13 = (com.instagram.aistudio.yourais.YourAisRepository) r13
            X.0eS.A00(r5)
        L_0x002c:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r1 = r5 instanceof X.C297815sO
            if (r1 != 0) goto L_0x01fd
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x01f3
            X.3lr r5 = X.C41846B3n.A0R(r5)
            if (r5 == 0) goto L_0x01fd
            java.lang.Class<X.Buh> r3 = X.C43219Buh.class
            r4 = 0
            r1 = 1955(0x7a3, float:2.74E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 1429211505(0x55300971, float:1.20971623E13)
            X.3lr r5 = r5.getOptionalTreeField(r4, r2, r3, r1)
            if (r5 == 0) goto L_0x01fd
            java.lang.Class<X.Bug> r3 = X.C43218Bug.class
            java.lang.String r2 = "edges"
            r1 = 309397760(0x12710900, float:7.6057285E-28)
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r4, r2, r3, r1)
            if (r2 == 0) goto L_0x01fd
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r2.iterator()
        L_0x0063:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x01fe
            X.3lr r6 = X.C41845B3m.A0V(r16)
            java.lang.Class<X.C84> r5 = X.C84.class
            java.lang.String r3 = "node"
            r2 = 2100952824(0x7d39fef8, float:1.5451941E37)
            X.3lr r7 = r6.getOptionalTreeField(r4, r3, r5, r2)
            X.C84 r7 = (X.C84) r7
            if (r7 == 0) goto L_0x0063
            java.lang.String r2 = "id"
            java.lang.String r20 = r7.getOptionalStringField(r4, r2)
            if (r20 == 0) goto L_0x0063
            java.lang.Class<X.Buc> r9 = X.C43214Buc.class
            r8 = 4
            java.lang.String r6 = "ig_messaging_data"
            r5 = 264917626(0xfca527a, float:1.9950507E-29)
            X.3lr r3 = r7.getOptionalTreeField(r8, r6, r9, r5)
            if (r3 == 0) goto L_0x01ab
            java.lang.String r2 = "thread_id"
            java.lang.String r24 = r3.getOptionalStringField(r0, r2)
        L_0x0098:
            X.3lr r3 = r7.getOptionalTreeField(r8, r6, r9, r5)
            if (r3 == 0) goto L_0x01a8
            java.lang.String r2 = "bot_id"
            java.lang.String r6 = r3.getOptionalStringField(r4, r2)
        L_0x00a4:
            java.lang.Class<X.Bud> r11 = X.C43215Bud.class
            r8 = 3
            java.lang.String r10 = "XIGGenAIIGCreatorPersona"
            r9 = 1997139001(0x7709ec39, float:2.7974056E33)
            X.3lr r3 = r7.reinterpretIfFulfillsType(r8, r10, r11, r9)
            if (r3 == 0) goto L_0x01a5
            java.lang.String r2 = "creator_igid"
            java.lang.String r5 = r3.getOptionalStringField(r0, r2)
        L_0x00b8:
            X.3lr r3 = r7.reinterpretIfFulfillsType(r8, r10, r11, r9)
            if (r3 == 0) goto L_0x00c7
            java.lang.String r2 = "is_ig_creator_ai"
            boolean r2 = r3.getCoercedBooleanField(r4, r2)
            r15 = 1
            if (r2 == r0) goto L_0x00c8
        L_0x00c7:
            r15 = 0
        L_0x00c8:
            X.Bue r3 = r7.A0E()
            if (r3 == 0) goto L_0x0063
            java.lang.String r2 = "name"
            java.lang.String r21 = r3.getOptionalStringField(r4, r2)
            if (r21 == 0) goto L_0x0063
            X.Kj0 r3 = X.C62629Kj0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "status"
            java.lang.Enum r9 = r7.getOptionalEnumField(r0, r2, r3)
            if (r9 == 0) goto L_0x00f6
            X.Kj0 r10 = X.C62629Kj0.PUBLISHED_EDITS_REJECTED
            X.Kj0 r3 = X.C62629Kj0.REJECTED
            X.Kj0 r2 = X.C62629Kj0.REQUIRES_CHANGES
            X.Kj0[] r2 = new X.C62629Kj0[]{r10, r3, r2}
            java.util.List r2 = X.0sr.A1P(r2)
            boolean r2 = r2.contains(r9)
            r26 = 1
            if (r2 == r0) goto L_0x00f8
        L_0x00f6:
            r26 = 0
        L_0x00f8:
            X.Bue r3 = r7.A0E()
            if (r3 == 0) goto L_0x01a2
            java.lang.String r2 = "profile_image_url"
            java.lang.String r14 = r3.A09(r2)
        L_0x0104:
            X.Bue r3 = r7.A0E()
            if (r3 == 0) goto L_0x019e
            java.lang.String r2 = "tagline"
            java.lang.String r22 = r3.getOptionalStringField(r0, r2)
        L_0x0110:
            java.lang.Class<X.Buf> r11 = X.C43217Buf.class
            r9 = 5
            r2 = 395(0x18b, float:5.54E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -582879698(0xffffffffdd41f62e, float:-8.7352557E17)
            X.3lr r10 = r7.getOptionalTreeField(r9, r3, r11, r2)
            if (r10 == 0) goto L_0x019b
            r12 = 4039(0xfc7, float:5.66E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r12)
            java.lang.String r23 = r10.getOptionalStringField(r4, r12)
        L_0x012c:
            X.3lr r9 = r7.getOptionalTreeField(r9, r3, r11, r2)
            if (r9 == 0) goto L_0x0199
            X.Kix r3 = X.C62626Kix.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "audience_enum"
            java.lang.Enum r3 = r9.getOptionalEnumField(r0, r2, r3)
            X.Kix r3 = (X.C62626Kix) r3
        L_0x013c:
            X.Bue r9 = r7.A0E()
            if (r9 == 0) goto L_0x0196
            java.lang.String r2 = "welcome_message"
            java.lang.String r25 = r9.getOptionalStringField(r8, r2)
        L_0x0148:
            r8 = 2
            java.lang.String r2 = "is_verified"
            boolean r27 = r7.getCoercedBooleanField(r8, r2)
            if (r15 == 0) goto L_0x018e
            if (r5 == 0) goto L_0x0063
            X.K0Y r2 = new X.K0Y
            r2.<init>(r5)
        L_0x0158:
            com.instagram.common.typedurl.SimpleImageUrl r19 = X.DbS.A0V(r14)
            if (r3 == 0) goto L_0x017e
            boolean r5 = r13.A00
            if (r5 == 0) goto L_0x017e
            java.lang.String r8 = "ANYONE_WITH_LINK"
            java.lang.String r7 = "CLOSE_FRIENDS"
            java.lang.String r6 = "PUBLIC"
            java.lang.String r5 = "PUBLIC_FOR_IG_PRIVATE_ACCOUNTS"
            java.lang.String[] r5 = new java.lang.String[]{r8, r7, r6, r5}
            java.util.List r5 = X.0sr.A1P(r5)
            java.lang.String r3 = r3.name()
            boolean r3 = r5.contains(r3)
            r28 = 1
            if (r3 != 0) goto L_0x0180
        L_0x017e:
            r28 = 0
        L_0x0180:
            X.Gm2 r3 = new X.Gm2
            r17 = r3
            r18 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.add(r3)
            goto L_0x0063
        L_0x018e:
            if (r6 == 0) goto L_0x0063
            X.K0Z r2 = new X.K0Z
            r2.<init>(r6, r4)
            goto L_0x0158
        L_0x0196:
            r25 = 0
            goto L_0x0148
        L_0x0199:
            r3 = 0
            goto L_0x013c
        L_0x019b:
            r23 = 0
            goto L_0x012c
        L_0x019e:
            r22 = 0
            goto L_0x0110
        L_0x01a2:
            r14 = 0
            goto L_0x0104
        L_0x01a5:
            r5 = 0
            goto L_0x00b8
        L_0x01a8:
            r6 = 0
            goto L_0x00a4
        L_0x01ab:
            r24 = 0
            goto L_0x0098
        L_0x01af:
            X.0eS.A00(r5)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r2.getParamsCopy()
            java.lang.Class<X.Bui> r10 = X.C43220Bui.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "AiStudioYourAisQuery"
            r11 = 0
            r2 = 1955(0x7a3, float:2.74E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r2)
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r2 = r4.A02
            r3.A01 = r4
            r3.A00 = r0
            java.lang.Object r5 = r2.A04(r5, r3)
            if (r5 == r1) goto L_0x01fe
            r13 = r4
            goto L_0x002c
        L_0x01ec:
            X.MDw r3 = new X.MDw
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x01f3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01fd:
            r1 = 0
        L_0x01fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.yourais.YourAisRepository.A00(X.4D7):java.lang.Object");
    }

    public YourAisRepository(UserSession userSession, 1vn r5) {
        AnonymousClass7TG.A1O(userSession, r5);
        this.A01 = userSession;
        this.A02 = r5;
        this.A00 = 182.A06(0Tu.A05, userSession, 36330479817212563L);
    }
}
