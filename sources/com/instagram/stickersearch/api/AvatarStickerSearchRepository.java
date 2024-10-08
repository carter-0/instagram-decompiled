package com.instagram.stickersearch.api;

import X.05G;
import X.106;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7g1;
import X.C252733pa;
import X.C317866ny;
import X.C337287g2;
import X.C61082JwK;
import X.L2X;
import X.L2Y;
import X.MG5;
import com.instagram.common.session.UserSession;

public final class AvatarStickerSearchRepository extends C252733pa {
    public final C61082JwK A00;
    public final C317866ny A01;
    public final UserSession A02;
    public final C337287g2 A03 = new AnonymousClass7g1();
    public final L2X A04;
    public final L2Y A05;
    public final 05G A06 = 106.A01((Object) null);
    public final 05G A07 = 106.A01((Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarStickerSearchRepository(C61082JwK jwK, C317866ny r7, UserSession userSession) {
        super("AvatarStickerSearchRepository", AnonymousClass43D.A00(218726426));
        L2X l2x = new L2X(userSession);
        L2Y l2y = new L2Y(userSession);
        AnonymousClass7TG.A1O(userSession, r7);
        this.A02 = userSession;
        this.A01 = r7;
        this.A00 = jwK;
        this.A04 = l2x;
        this.A05 = l2y;
        AnonymousClass7TE.A1Z(new MG5(this, (AnonymousClass4D7) null, 22), this.A01);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C61076JwE r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r4 = 44
            boolean r0 = X.ME9.A03(r4, r11)
            if (r0 == 0) goto L_0x00ae
            r2 = r11
            X.ME9 r2 = (X.ME9) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00ae
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r5 = r2.A03
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r0 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 != r0) goto L_0x00b7
            java.lang.Object r10 = r2.A02
            X.JwE r10 = (X.C61076JwE) r10
            java.lang.Object r1 = r2.A01
            com.instagram.stickersearch.api.AvatarStickerSearchRepository r1 = (com.instagram.stickersearch.api.AvatarStickerSearchRepository) r1
            X.0eS.A00(r5)
        L_0x002c:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b4
            X.7g2 r4 = r1.A03
            java.lang.String r3 = r10.A01
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r2 = r5.A00
            X.K1h r2 = (X.C61294K1h) r2
            java.util.List r1 = r2.A00()
            r0 = 0
            r4.A9z(r3, r0, r1)
            java.util.List r3 = r2.A00()
        L_0x0048:
            return r3
        L_0x0049:
            X.0eS.A00(r5)
            com.instagram.common.session.UserSession r7 = r9.A02
            X.6ny r6 = r9.A01
            java.lang.Object r4 = r10.A00
            X.6nw r4 = (X.C317846nw) r4
            java.lang.String r8 = r10.A01
            X.JwK r5 = r9.A00
            X.ME9.A01(r9, r10, r2, r0)
            X.AnonymousClass7TG.A1Q(r4, r8)
            X.6nx r1 = X.C317846nw.A01
            if (r5 == 0) goto L_0x00ac
            boolean r0 = r5.A01
        L_0x0064:
            java.lang.String r1 = r1.A00(r4, r6, r7, r0)
            X.1NY r4 = X.AnonymousClass7TG.A0b(r7)
            java.lang.String r0 = "creatives/search_avatar_sticker_pack/"
            r4.A0A(r0)
            java.lang.String r0 = "sticker_pack_id"
            r4.A9m(r0, r1)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "surface"
            r4.A9m(r0, r1)
            java.lang.String r0 = "query_string"
            r4.A9m(r0, r8)
            X.0bH r1 = new X.0bH
            r1.<init>(r7)
            X.KAg r0 = new X.KAg
            r0.<init>(r6, r1)
            r4.A02 = r0
            if (r5 == 0) goto L_0x009f
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r5.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "user_ids"
            r4.A9m(r0, r1)
        L_0x009f:
            X.1OC r1 = r4.A0M()
            r0 = -5
            java.lang.Object r5 = r1.A00(r0, r2)
            if (r5 == r3) goto L_0x0048
            r1 = r9
            goto L_0x002c
        L_0x00ac:
            r0 = 0
            goto L_0x0064
        L_0x00ae:
            X.ME9 r2 = X.ME9.A00(r9, r11, r4)
            goto L_0x0016
        L_0x00b4:
            X.0sn r3 = X.0sn.A00
            return r3
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.api.AvatarStickerSearchRepository.A00(X.JwE, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C317846nw r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r10 = this;
            r3 = 45
            boolean r0 = X.ME9.A03(r3, r13)
            if (r0 == 0) goto L_0x002f
            r4 = r13
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 4
            r9 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 == r7) goto L_0x00a4
            if (r0 == r8) goto L_0x00a4
            if (r0 == r9) goto L_0x0084
            if (r0 == r6) goto L_0x00a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.ME9 r4 = X.ME9.A00(r10, r13, r3)
            goto L_0x0016
        L_0x0034:
            X.0eS.A00(r3)
            X.7g2 r0 = r10.A03
            X.9P5 r0 = r0.BiX(r12)
            java.util.List r3 = r0.A06
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0059
            if (r3 == 0) goto L_0x0059
            X.05G r2 = r10.A06
            r1 = 23
            X.JwE r0 = new X.JwE
            r0.<init>((java.util.List) r3, (int) r1, (java.lang.String) r12)
            r4.A00 = r7
            java.lang.Object r0 = r2.emit(r0, r4)
        L_0x0056:
            if (r0 != r5) goto L_0x00a7
            return r5
        L_0x0059:
            X.JwE r7 = new X.JwE
            r7.<init>((X.C317846nw) r11, (java.lang.String) r12)
            X.L2Y r0 = r10.A05
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325463295013859(0x810dd1000033e3, double:3.0357074864423786E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0078
            X.05G r0 = r10.A07
            r4.A00 = r8
            java.lang.Object r0 = r0.emit(r7, r4)
            goto L_0x0056
        L_0x0078:
            X.05G r2 = r10.A06
            X.ME9.A01(r2, r12, r4, r9)
            java.lang.Object r3 = r10.A00(r7, r4)
            if (r3 != r5) goto L_0x008f
            return r5
        L_0x0084:
            java.lang.Object r12 = r4.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r4.A01
            X.0V2 r2 = (X.0V2) r2
            X.0eS.A00(r3)
        L_0x008f:
            java.util.List r3 = (java.util.List) r3
            r0 = 23
            X.JwE r1 = new X.JwE
            r1.<init>((java.util.List) r3, (int) r0, (java.lang.String) r12)
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r6
            java.lang.Object r0 = r2.emit(r1, r4)
            goto L_0x0056
        L_0x00a4:
            X.0eS.A00(r3)
        L_0x00a7:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.api.AvatarStickerSearchRepository.A01(X.6nw, java.lang.String, X.4D7):java.lang.Object");
    }
}
