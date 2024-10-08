package com.instagram.stickersearch.api;

import X.0qQ;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class AvatarStickerGraphQLApi {
    public final UserSession A00;
    public final 1vn A01;

    public AvatarStickerGraphQLApi(UserSession userSession, 1vn r3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C61082JwK r19, X.C317846nw r20, X.C317866ny r21, java.lang.Integer r22, X.AnonymousClass4D7 r23, boolean r24) {
        /*
            r18 = this;
            r6 = r21
            r5 = 0
            r3 = 42
            r4 = r23
            boolean r0 = X.ME9.A03(r3, r4)
            r9 = r18
            if (r0 == 0) goto L_0x01c5
            r8 = r4
            X.ME9 r8 = (X.ME9) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01c5
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001d:
            java.lang.Object r1 = r8.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r4 = 1
            if (r0 == 0) goto L_0x014f
            if (r0 != r4) goto L_0x01f3
            java.lang.Object r6 = r8.A02
            X.6ny r6 = (X.C317866ny) r6
            X.0eS.A00(r1)
        L_0x002f:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01ce
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.C7u r0 = (X.C43750C7u) r0
            r8 = 0
            if (r0 == 0) goto L_0x01cc
            X.C7t r0 = r0.A0E()
            if (r0 == 0) goto L_0x01cc
            X.C7s r0 = r0.A0E()
            if (r0 == 0) goto L_0x01cc
            X.C7r r7 = r0.A0E()
            if (r7 == 0) goto L_0x01cc
            X.K1h r2 = new X.K1h
            r2.<init>()
            java.lang.String r0 = "sticker_pack_id"
            java.lang.String r0 = r7.A09(r0)
            r2.A07 = r0
            java.lang.String r0 = "has_next_page"
            boolean r0 = r7.getCoercedBooleanField(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            r1 = 0
            java.lang.String r0 = "next_item_cursor"
            int r0 = r7.getCoercedIntField(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            java.lang.String r0 = "avatar_revision_id"
            java.lang.String r0 = r7.A0A(r0)
            r2.A04 = r0
            java.lang.String r0 = "config_hash"
            java.lang.String r0 = r7.A0B(r0)
            r2.A06 = r0
            java.lang.String r0 = "avatar_id"
            java.lang.String r0 = r7.A0C(r0)
            r2.A03 = r0
            X.5kA r3 = X.C293115kA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 6
            java.lang.String r0 = "avatar_style"
            java.lang.Enum r0 = r7.getOptionalEnumField(r1, r0, r3)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r8 = r0.toString()
        L_0x00a1:
            r2.A05 = r8
            r2.A00 = r6
            com.google.common.collect.ImmutableList r0 = r7.A0E()
            X.0qQ.A07(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x00b5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r6 = r11.next()
            X.3lr r6 = (X.C250663lr) r6
            java.lang.String r0 = "id"
            java.lang.String r13 = r6.A07(r0)
            java.lang.String r0 = "cdn_url"
            java.lang.String r10 = r6.getOptionalStringField(r4, r0)
            if (r13 == 0) goto L_0x00b5
            if (r10 == 0) goto L_0x00b5
            r0 = 6
            java.lang.String r9 = "width"
            int r8 = r6.getCoercedIntField(r0, r9)
            r7 = 7
            java.lang.String r1 = "height"
            int r0 = r6.getCoercedIntField(r7, r1)
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r10, r8, r0)
            r0 = 6
            int r0 = r6.getCoercedIntField(r0, r9)
            float r15 = (float) r0
            int r0 = r6.getCoercedIntField(r7, r1)
            float r0 = (float) r0
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r14 = "avatar_sticker"
            r16 = r0
            X.6o8 r7 = X.C317966o8.A00(r12, r13, r14, r15, r16, r17)
            r1 = 9
            java.lang.String r0 = "accessibility_label"
            java.lang.String r0 = r6.getOptionalStringField(r1, r0)
            r7.A0M = r0
            X.Kip r8 = X.C62618Kip.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 10
            java.lang.String r0 = "media_type"
            java.lang.Enum r1 = r6.getOptionalEnumField(r1, r0, r8)
            X.Kip r0 = X.C62618Kip.CLIP
            if (r1 != r0) goto L_0x014c
            java.lang.String r0 = "animation"
        L_0x0113:
            r7.A0h = r0
            r1 = 11
            java.lang.String r0 = "number_of_avatars"
            int r0 = r6.getCoercedIntField(r1, r0)
            r7.A0C = r0
            java.lang.String r0 = "instruction_key_id"
            java.lang.String r0 = r6.A0B(r0)
            if (r0 == 0) goto L_0x0129
            r7.A0a = r0
        L_0x0129:
            java.lang.String r0 = "template"
            java.lang.String r0 = r6.A09(r0)
            if (r0 == 0) goto L_0x0133
            r7.A0b = r0
        L_0x0133:
            r1 = 12
            java.lang.String r0 = "tags"
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedStringListField(r1, r0)
            r7.A0j = r0
            java.lang.String r0 = "expression_id"
            java.lang.String r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x0147
            r7.A0Q = r0
        L_0x0147:
            r3.add(r7)
            goto L_0x00b5
        L_0x014c:
            java.lang.String r0 = "image"
            goto L_0x0113
        L_0x014f:
            X.0eS.A00(r1)
            X.6nx r1 = X.C317846nw.A01
            com.instagram.common.session.UserSession r11 = r9.A00
            r0 = 0
            r2 = r20
            java.lang.String r1 = r1.A00(r2, r6, r11, r0)
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r0 = "sticker_pack_id"
            r10.A09(r1, r0)
            java.lang.String r0 = "item_cursor"
            r10.A07(r5, r0)
            java.lang.String r0 = "page_size"
            r1 = r22
            r10.A07(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            java.lang.String r0 = "fetch_tags"
            r10.A08(r0, r1)
            r3 = r19
            boolean r2 = r3.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "fetch_social_stickers"
            r10.A08(r0, r1)
            if (r2 == 0) goto L_0x019c
            java.lang.Object r1 = r3.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = "user_ids"
            r10.A05(r0, r1)
        L_0x019c:
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.2IS r2 = new X.2IS
            r2.<init>()
            java.lang.String r1 = r11.A06
            java.lang.String r0 = "user_id"
            r3.A04(r0, r1)
            java.lang.String r0 = "query_params"
            r3.A00(r10, r0)
            com.facebook.pando.PandoGraphQLRequest r1 = X.C64405LbM.A00(r3, r2, r4)
            X.1vn r0 = r9.A01
            r8.A01 = r9
            r8.A02 = r6
            r8.A00 = r4
            java.lang.Object r1 = r0.A04(r1, r8)
            if (r1 != r7) goto L_0x002f
            return r7
        L_0x01c5:
            X.ME9 r8 = new X.ME9
            r8.<init>(r9, r4, r3)
            goto L_0x001d
        L_0x01cc:
            r2 = r5
            goto L_0x01da
        L_0x01ce:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01df
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01d8:
            r2.A08 = r3
        L_0x01da:
            X.3Ih r1 = new X.3Ih
            r1.<init>(r2)
        L_0x01df:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01ec
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01ed
            X.5sO r1 = new X.5sO
            r1.<init>(r5)
        L_0x01ec:
            return r1
        L_0x01ed:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01f3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.api.AvatarStickerGraphQLApi.A00(X.JwK, X.6nw, X.6ny, java.lang.Integer, X.4D7, boolean):java.lang.Object");
    }
}
