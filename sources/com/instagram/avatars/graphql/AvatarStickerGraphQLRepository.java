package com.instagram.avatars.graphql;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.2IS;
import X.2IV;
import X.AnonymousClass4D7;
import X.C310386ax;
import X.C310396ay;
import X.C64405LbM;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.stickersearch.api.AvatarStickerGraphQLApi;
import java.util.Collections;
import java.util.List;

public final class AvatarStickerGraphQLRepository {
    public final UserSession A00;
    public final C310396ay A01;
    public final 1vn A02;
    public final AvatarStickerGraphQLApi A03;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r3 = 25
            boolean r0 = X.ME4.A03(r3, r12)
            if (r0 == 0) goto L_0x00a7
            r6 = r12
            X.ME4 r6 = (X.ME4) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a7
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A01
            X.1Hj r8 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 != r7) goto L_0x00b0
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x005f
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.C7u r0 = (X.C43750C7u) r0
            if (r0 == 0) goto L_0x005e
            X.C7t r0 = r0.A0E()
            if (r0 == 0) goto L_0x005e
            X.C7s r0 = r0.A0E()
            if (r0 == 0) goto L_0x005e
            X.C7r r0 = r0.A0E()
            if (r0 == 0) goto L_0x005e
            com.google.common.collect.ImmutableList r2 = r0.A0E()
            if (r2 == 0) goto L_0x005e
            r0 = 0
            java.lang.Object r2 = X.00k.A0O(r2, r0)
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x005e
            java.lang.String r0 = "cdn_url"
            java.lang.String r1 = r2.getOptionalStringField(r7, r0)
        L_0x005e:
            return r1
        L_0x005f:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005e
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0069:
            X.0eS.A00(r2)
            r6.A00 = r7
            X.1vn r5 = r9.A02
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.0qQ.A0B(r11, r7)
            X.2IS r4 = new X.2IS
            r4.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            java.lang.String r0 = "user_id"
            r4.A04(r0, r10)
            X.2IV r2 = new X.2IV
            r2.<init>()
            java.lang.String r1 = ""
            java.lang.String r0 = "sticker_pack_id"
            r2.A09(r1, r0)
            java.lang.String r0 = "expression_id"
            r2.A09(r11, r0)
            java.lang.String r0 = "query_params"
            r4.A00(r2, r0)
            com.facebook.pando.PandoGraphQLRequest r0 = X.C64405LbM.A00(r4, r3, r7)
            java.lang.Object r2 = r5.A04(r0, r6)
            if (r2 != r8) goto L_0x0024
            return r8
        L_0x00a7:
            r0 = 42
            X.ME4 r6 = new X.ME4
            r6.<init>(r9, r12, r3, r0)
            goto L_0x0016
        L_0x00b0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarStickerGraphQLRepository.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final Object A01(String str, String str2, AnonymousClass4D7 r9) {
        AvatarStickerGraphQLApi avatarStickerGraphQLApi = this.A03;
        2IV r4 = new 2IV();
        r4.A09("", "sticker_pack_id");
        List singletonList = Collections.singletonList(str);
        0qQ.A07(singletonList);
        r4.A05("instruction_key_ids", singletonList);
        2IS r3 = new 2IS();
        2IS r2 = new 2IS();
        r3.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        boolean z = false;
        if (str2 != null) {
            z = true;
        }
        r3.A00(r4, "query_params");
        return avatarStickerGraphQLApi.A01.A04(C64405LbM.A00(r3, r2, z), r9);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r3 = 26
            r5 = r20
            boolean r0 = X.ME4.A03(r3, r5)
            r6 = r18
            if (r0 == 0) goto L_0x00e7
            r4 = r5
            X.ME4 r4 = (X.ME4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x007b
            if (r0 != r5) goto L_0x00f0
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x0071
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0070
            java.lang.Class<X.BoI> r2 = X.BoI.class
            java.lang.String r1 = "fetch__IGUser(igid:$user_id)"
            r0 = -1868170221(0xffffffff90a5fc13, float:-6.5469407E-29)
            X.3lr r4 = r4.A03(r2, r1, r0)
            if (r4 == 0) goto L_0x0070
            java.lang.Class<X.BoH> r2 = X.BoH.class
            java.lang.String r1 = "user_avatar"
            r0 = 149489004(0x8e9056c, float:1.4024452E-33)
            X.3lr r4 = r4.A03(r2, r1, r0)
            if (r4 == 0) goto L_0x0070
            java.lang.Class<X.BoG> r2 = X.BoG.class
            java.lang.String r1 = "ig_stickers_for_keys(query_params:$query_params)"
            r0 = -109197463(0xfffffffff97dc769, float:-8.2355976E34)
            com.google.common.collect.ImmutableList r0 = r4.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = X.00k.A0J(r0)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = "cdn_url"
            java.lang.String r3 = r1.getOptionalStringField(r5, r0)
        L_0x0070:
            return r3
        L_0x0071:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0070
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x007b:
            X.0eS.A00(r1)
            r4.A00 = r5
            X.1vn r2 = r6.A02
            r12 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r12)
            r0 = 0
            r13 = 0
            X.2IS r9 = new X.2IS
            r9.<init>()
            X.2IS r11 = new X.2IS
            r11.<init>()
            com.instagram.common.session.UserSession r6 = r6.A00
            java.lang.String r7 = r6.A06
            java.lang.String r6 = "user_id"
            r9.A04(r6, r7)
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.util.List r7 = java.util.Collections.singletonList(r19)
            X.0qQ.A07(r7)
            java.lang.String r6 = "instruction_key_ids"
            r8.A05(r6, r7)
            java.lang.String r6 = "refresh_only"
            r8.A08(r6, r10)
            java.lang.String r6 = "query_params"
            r9.A00(r8, r6)
            X.2IY r6 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r11.getParamsCopy()
            java.lang.Class<X.BoJ> r11 = X.BoJ.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGAvatarStickersForKeysQuery"
            java.lang.String r16 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1Ef r6 = r6.setFreshCacheAgeMs(r0)
            X.1Ef r0 = r6.setMaxToleratedCacheAgeMs(r0)
            java.lang.Object r1 = r2.A04(r0, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00e7:
            r0 = 42
            X.ME4 r4 = new X.ME4
            r4.<init>(r6, r5, r3, r0)
            goto L_0x001a
        L_0x00f0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarStickerGraphQLRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 27
            boolean r0 = X.ME4.A03(r3, r11)
            if (r0 == 0) goto L_0x00a5
            r5 = r11
            X.ME4 r5 = (X.ME4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r7 = X.1Hj.A02
            int r1 = r5.A00
            r6 = 1
            if (r1 == 0) goto L_0x006f
            if (r1 != r6) goto L_0x00ae
            X.0eS.A00(r0)
        L_0x0024:
            r7 = r0
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0065
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r0 = r7.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.C7u r0 = (X.C43750C7u) r0
            if (r0 == 0) goto L_0x0063
            X.C7t r0 = r0.A0E()
            if (r0 == 0) goto L_0x0063
            X.C7s r0 = r0.A0E()
            if (r0 == 0) goto L_0x0063
            X.C7r r0 = r0.A0E()
            if (r0 == 0) goto L_0x0063
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r1 = X.00k.A0J(r0)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r1.getOptionalStringField(r6, r0)
        L_0x005d:
            X.3Ih r7 = new X.3Ih
            r7.<init>(r0)
        L_0x0062:
            return r7
        L_0x0063:
            r0 = 0
            goto L_0x005d
        L_0x0065:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0062
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x006f:
            X.0eS.A00(r0)
            com.instagram.stickersearch.api.AvatarStickerGraphQLApi r8 = r9.A03
            r5.A00 = r6
            X.2IV r4 = new X.2IV
            r4.<init>()
            java.lang.String r0 = "sticker_pack_id"
            r4.A09(r10, r0)
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.2IS r2 = new X.2IS
            r2.<init>()
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "user_id"
            r3.A04(r0, r1)
            java.lang.String r0 = "query_params"
            r3.A00(r4, r0)
            com.facebook.pando.PandoGraphQLRequest r1 = X.C64405LbM.A00(r3, r2, r6)
            X.1vn r0 = r8.A01
            java.lang.Object r0 = r0.A04(r1, r5)
            if (r0 != r7) goto L_0x0024
            return r7
        L_0x00a5:
            r0 = 42
            X.ME4 r5 = new X.ME4
            r5.<init>(r9, r11, r3, r0)
            goto L_0x0016
        L_0x00ae:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarStickerGraphQLRepository.A03(java.lang.String, X.4D7):java.lang.Object");
    }

    public /* synthetic */ AvatarStickerGraphQLRepository(UserSession userSession) {
        AvatarStickerGraphQLApi avatarStickerGraphQLApi = new AvatarStickerGraphQLApi(userSession, 1vm.A01(userSession));
        C310396ay A002 = C310386ax.A00(userSession);
        1vn A012 = 1vm.A01(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 3);
        0qQ.A0B(A012, 4);
        this.A00 = userSession;
        this.A03 = avatarStickerGraphQLApi;
        this.A01 = A002;
        this.A02 = A012;
    }
}
