package com.instagram.direct.avatar.stickers.search;

import X.1vm;
import X.AnonymousClass7TG;
import X.C317846nw;
import X.JTQ;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.AvatarStickerGraphQLApi;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AvatarLocalStickerSearchRepository {
    public List A00;
    public final C317846nw A01;
    public final UserSession A02;
    public final AvatarStickerGraphQLApi A03;
    public final AtomicBoolean A04 = JTQ.A0k();

    /* JADX WARNING: type inference failed for: r9v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 23
            boolean r0 = X.C66129MDh.A01(r3, r12)
            if (r0 == 0) goto L_0x006b
            r9 = r12
            X.MDh r9 = (X.C66129MDh) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r9.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r9.A00
            r2 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r10) goto L_0x0071
            java.lang.Object r11 = r9.A01
            com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository r11 = (com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository) r11
            X.0eS.A00(r4)
        L_0x0029:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x003c
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.K1h r0 = (X.C61294K1h) r0
            if (r0 == 0) goto L_0x003c
            java.util.List r1 = r0.A00()
        L_0x003c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A04
            r0.set(r2)
            if (r1 != 0) goto L_0x0045
            X.0sn r1 = X.0sn.A00
        L_0x0045:
            r11.A00 = r1
            return r1
        L_0x0048:
            X.0eS.A00(r4)
            com.instagram.stickersearch.api.AvatarStickerGraphQLApi r4 = r11.A03
            X.6ny r7 = X.C317866ny.DIRECT
            X.6nw r6 = r11.A01
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r8 = X.JTO.A0w(r0)
            X.0sn r1 = X.0sn.A00
            r0 = 20
            X.JwK r5 = new X.JwK
            r5.<init>((boolean) r2, (java.util.List) r1, (int) r0)
            r9.A01 = r11
            r9.A00 = r10
            java.lang.Object r4 = r4.A00(r5, r6, r7, r8, r9, r10)
            if (r4 != r3) goto L_0x0029
            return r3
        L_0x006b:
            X.MDh r9 = new X.MDh
            r9.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository.A00(com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository, X.4D7):java.lang.Object");
    }

    public /* synthetic */ AvatarLocalStickerSearchRepository(C317846nw r3, UserSession userSession) {
        AvatarStickerGraphQLApi avatarStickerGraphQLApi = new AvatarStickerGraphQLApi(userSession, 1vm.A01(userSession));
        AnonymousClass7TG.A1O(userSession, r3);
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = avatarStickerGraphQLApi;
    }
}
