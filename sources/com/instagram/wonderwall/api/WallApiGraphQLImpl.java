package com.instagram.wonderwall.api;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.C297815sO;
import X.C45325CuT;
import X.C56485HzH;
import X.DIS;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallText;

public final class WallApiGraphQLImpl {
    public final UserSession A00;
    public final 1vn A01;

    public WallApiGraphQLImpl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1vm.A01(userSession);
    }

    public static DIS A00(int i) {
        WallText.Res res = new WallText.Res(i, new String[0]);
        if (!(!res.equals(C56485HzH.A00))) {
            res = new WallText.Res(2131976762, new String[0]);
        }
        return new DIS(new C297815sO(new C45325CuT(res, false)));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C61046Jvk r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r21 = this;
            r3 = 33
            r5 = r24
            boolean r0 = X.ME5.A03(r3, r5)
            r6 = r21
            if (r0 == 0) goto L_0x008c
            r4 = r5
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r15 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r15) goto L_0x0094
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            X.0eS.A00(r1)
            X.1vn r3 = r6.A01
            r16 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            java.lang.String r0 = "post_id"
            r1 = r23
            boolean r7 = X.C41848B3p.A1Z(r8, r0, r1)
            r2 = 0
            r10 = r22
            X.0qQ.A0B(r10, r2)
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "emoji"
            X.0Df r6 = X.C41845B3m.A03(r6, r1, r0)
            boolean r0 = r10.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_reacted"
            X.0Df.A00(r6, r1, r0)
            X.C41848B3p.A1L(r6, r8)
            X.1vR r10 = X.C41845B3m.A06(r7)
            java.util.Map r12 = r8.getParamsCopy()
            java.util.Map r13 = r9.getParamsCopy()
            java.lang.Class<X.C6Q> r14 = X.C6Q.class
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r11 = "PostWallReactionMutation"
            java.lang.String r19 = "xdt_react_to_wall_post"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r16
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.A00 = r15
            java.lang.Object r1 = r3.A04(r9, r4)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x008c:
            r0 = 42
            X.ME5 r4 = new X.ME5
            r4.<init>(r6, r5, r3, r0)
            goto L_0x001a
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A01(X.Jvk, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cf A[Catch:{ DIS -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da A[Catch:{ DIS -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0128 A[Catch:{ DIS -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.wonderwall.model.WallPostItem r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r17 = this;
            r4 = r18
            r6 = 21
            r7 = r20
            boolean r0 = X.C66147MDz.A02(r6, r7)
            r3 = r17
            if (r0 == 0) goto L_0x0032
            r0 = r7
            X.MDz r0 = (X.C66147MDz) r0
            int r5 = r0.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r2
            if (r1 == 0) goto L_0x0032
            int r5 = r5 - r2
            r0.A00 = r5
        L_0x001c:
            java.lang.Object r1 = r0.A04
            X.1Hj r2 = X.1Hj.A02
            int r5 = r0.A00
            r12 = 0
            r11 = 1
            if (r5 == 0) goto L_0x003d
            if (r5 != r11) goto L_0x0038
            java.lang.Object r4 = r0.A02
            com.instagram.wonderwall.model.WallPostItem r4 = (com.instagram.wonderwall.model.WallPostItem) r4
            java.lang.Object r6 = r0.A01
            com.instagram.wonderwall.api.WallApiGraphQLImpl r6 = (com.instagram.wonderwall.api.WallApiGraphQLImpl) r6
            goto L_0x00d1
        L_0x0032:
            X.MDz r0 = new X.MDz
            r0.<init>(r3, r7, r6)
            goto L_0x001c
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003d:
            X.0eS.A00(r1)
            r13 = 0
            X.0qQ.A0B(r4, r13)     // Catch:{ DIS -> 0x013a }
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02     // Catch:{ DIS -> 0x013a }
            com.instagram.wonderwall.model.WallPostInfo r1 = r4.BeB()     // Catch:{ DIS -> 0x013a }
            java.lang.String r5 = r1.A07     // Catch:{ DIS -> 0x013a }
            java.lang.String r1 = "text"
            X.0Df r6 = X.C41845B3m.A03(r7, r5, r1)     // Catch:{ DIS -> 0x013a }
            boolean r1 = r4 instanceof com.instagram.wonderwall.model.WallMediaPostItem     // Catch:{ DIS -> 0x013a }
            if (r1 == 0) goto L_0x0082
            r1 = r4
            com.instagram.wonderwall.model.WallMediaPostItem r1 = (com.instagram.wonderwall.model.WallMediaPostItem) r1     // Catch:{ DIS -> 0x013a }
            X.1Xj r1 = r1.A01     // Catch:{ DIS -> 0x013a }
            X.1Xy r1 = r1.A0C     // Catch:{ DIS -> 0x013a }
            java.lang.String r5 = r1.getPk()     // Catch:{ DIS -> 0x013a }
            java.lang.String r1 = "media_id"
            X.0Df.A00(r6, r5, r1)     // Catch:{ DIS -> 0x013a }
            java.lang.String r5 = "MEDIA"
        L_0x0068:
            java.lang.String r1 = "post_type"
            X.0Df.A00(r6, r5, r1)     // Catch:{ DIS -> 0x013a }
        L_0x006d:
            X.1vn r1 = r3.A01     // Catch:{ DIS -> 0x013a }
            X.2IS r8 = X.C41845B3m.A04()     // Catch:{ DIS -> 0x013a }
            X.2IS r7 = X.C41845B3m.A04()     // Catch:{ DIS -> 0x013a }
            X.C41848B3p.A1L(r6, r8)     // Catch:{ DIS -> 0x013a }
            java.lang.String r5 = "wall_id"
            r6 = r19
            r8.A04(r5, r6)     // Catch:{ DIS -> 0x013a }
            goto L_0x00a1
        L_0x0082:
            boolean r1 = r4 instanceof com.instagram.wonderwall.model.WallGifPostItem     // Catch:{ DIS -> 0x013a }
            if (r1 == 0) goto L_0x0099
            r1 = r4
            com.instagram.wonderwall.model.WallGifPostItem r1 = (com.instagram.wonderwall.model.WallGifPostItem) r1     // Catch:{ DIS -> 0x013a }
            java.lang.String r5 = r1.A02     // Catch:{ DIS -> 0x013a }
            java.lang.String r1 = "gif_media_id"
            X.0Df r5 = X.C41845B3m.A03(r7, r5, r1)     // Catch:{ DIS -> 0x013a }
            java.lang.String r1 = "gif_params"
            r6.A0E(r5, r1)     // Catch:{ DIS -> 0x013a }
            java.lang.String r5 = "GIF"
            goto L_0x0068
        L_0x0099:
            java.lang.String r5 = "TEXT"
            java.lang.String r1 = "post_type"
            X.0Df.A00(r6, r5, r1)     // Catch:{ DIS -> 0x013a }
            goto L_0x006d
        L_0x00a1:
            boolean r5 = X.AnonymousClass7TF.A1V(r6)
            X.1vR r6 = X.C41845B3m.A06(r5)     // Catch:{ DIS -> 0x013a }
            java.util.Map r8 = r8.getParamsCopy()     // Catch:{ DIS -> 0x013a }
            java.util.Map r9 = r7.getParamsCopy()     // Catch:{ DIS -> 0x013a }
            java.lang.Class<X.C6S> r10 = X.C6S.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()     // Catch:{ DIS -> 0x013a }
            java.lang.String r7 = "PublishWallPostMutation"
            java.lang.String r15 = "xdt_post_to_wall"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ DIS -> 0x013a }
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ DIS -> 0x013a }
            r0.A01 = r3     // Catch:{ DIS -> 0x013a }
            r0.A02 = r4     // Catch:{ DIS -> 0x013a }
            r0.A03 = r12     // Catch:{ DIS -> 0x013a }
            r0.A00 = r11     // Catch:{ DIS -> 0x013a }
            java.lang.Object r1 = r1.A04(r5, r0)     // Catch:{ DIS -> 0x013a }
            if (r1 == r2) goto L_0x0146
            r6 = r3
            goto L_0x00d4
        L_0x00d1:
            X.0eS.A00(r1)     // Catch:{ DIS -> 0x013a }
        L_0x00d4:
            X.3Ii r1 = (X.C239803Ii) r1     // Catch:{ DIS -> 0x013a }
            boolean r0 = r1 instanceof X.C239793Ih     // Catch:{ DIS -> 0x013a }
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r1 instanceof X.C297815sO     // Catch:{ DIS -> 0x013a }
            if (r0 == 0) goto L_0x0135
            X.5sO r1 = (X.C297815sO) r1     // Catch:{ DIS -> 0x013a }
            java.lang.Object r1 = r1.A00     // Catch:{ DIS -> 0x013a }
            X.4dm r1 = (X.C268654dm) r1     // Catch:{ DIS -> 0x013a }
            r0 = 2131976782(0x7f13624e, float:1.9590694E38)
            X.CuT r0 = X.D35.A00(r1, r0)     // Catch:{ DIS -> 0x013a }
            X.5sO r1 = X.C41845B3m.A0c(r0)     // Catch:{ DIS -> 0x013a }
        L_0x00ef:
            java.lang.Object r0 = X.C45161CrO.A00(r1)     // Catch:{ DIS -> 0x013a }
            X.3JC r0 = (X.AnonymousClass3JC) r0     // Catch:{ DIS -> 0x013a }
            java.lang.Object r5 = r0.A01     // Catch:{ DIS -> 0x013a }
            X.3lr r5 = (X.C250663lr) r5     // Catch:{ DIS -> 0x013a }
            if (r5 == 0) goto L_0x012d
            java.lang.Class<X.C6R> r2 = X.C6R.class
            r3 = 0
            java.lang.String r1 = "xdt_post_to_wall(data:$data,wall_id:$wall_id)"
            r0 = -108988024(0xfffffffff980f988, float:-8.370939E34)
            X.3lr r2 = r5.getRequiredTreeField(r3, r1, r2, r0)     // Catch:{ DIS -> 0x013a }
            if (r2 == 0) goto L_0x012d
            java.lang.Class<X.C6l> r1 = X.C43715C6l.class
            r0 = 1804051236(0x6b87a324, float:3.279508E26)
            X.3lr r3 = r2.reinterpretRequired(r3, r1, r0)     // Catch:{ DIS -> 0x013a }
            X.C6l r3 = (X.C43715C6l) r3     // Catch:{ DIS -> 0x013a }
            if (r3 == 0) goto L_0x012d
            com.instagram.common.session.UserSession r2 = r6.A00     // Catch:{ DIS -> 0x013a }
            com.instagram.wonderwall.model.WallPostInfo r0 = r4.BeB()     // Catch:{ DIS -> 0x013a }
            com.instagram.wonderwall.model.WallInfo r1 = r0.A04     // Catch:{ DIS -> 0x013a }
            X.1E5 r0 = X.1E4.A00(r2)     // Catch:{ DIS -> 0x013a }
            com.instagram.wonderwall.model.WallPostItem r0 = X.D35.A01(r0, r2, r1, r3)     // Catch:{ DIS -> 0x013a }
            if (r0 == 0) goto L_0x012d
            X.3Ih r2 = X.C41845B3m.A0d(r0)     // Catch:{ DIS -> 0x013a }
            return r2
        L_0x012d:
            r0 = 2131976782(0x7f13624e, float:1.9590694E38)
            X.DIS r0 = A00(r0)     // Catch:{ DIS -> 0x013a }
            goto L_0x0139
        L_0x0135:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ DIS -> 0x013a }
        L_0x0139:
            throw r0     // Catch:{ DIS -> 0x013a }
        L_0x013a:
            r0 = move-exception
            X.5sO r2 = r0.A00
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
        L_0x0146:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A02(com.instagram.wonderwall.model.WallPostItem, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r4 = 32
            r5 = r19
            boolean r0 = X.ME5.A03(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x006b
            r2 = r5
            X.ME5 r2 = (X.ME5) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x006b
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r11) goto L_0x0073
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A01
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r0 = "post_id"
            r6 = r18
            boolean r0 = X.C41848B3p.A1Z(r5, r0, r6)
            X.1vR r6 = X.C41845B3m.A06(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.C6H> r10 = X.C6H.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "DeleteWallPostMutation"
            r13 = 0
            java.lang.String r15 = "xdt_delete_wall_post"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A00 = r11
            java.lang.Object r1 = r1.A04(r5, r2)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x006b:
            r0 = 42
            X.ME5 r2 = new X.ME5
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A03(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f A[Catch:{ DIS -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00be A[Catch:{ DIS -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0154 A[Catch:{ DIS -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r3 = 12
            r6 = r20
            boolean r0 = X.C66131MDj.A01(r3, r6)
            r5 = r18
            if (r0 == 0) goto L_0x002b
            r4 = r6
            X.MDj r4 = (X.C66131MDj) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r13 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r0) goto L_0x0031
            java.lang.Object r5 = r4.A01
            com.instagram.wonderwall.api.WallApiGraphQLImpl r5 = (com.instagram.wonderwall.api.WallApiGraphQLImpl) r5
            goto L_0x0086
        L_0x002b:
            X.MDj r4 = new X.MDj
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            X.0eS.A00(r2)
            X.1vn r2 = r5.A01     // Catch:{ DIS -> 0x015c }
            X.2IS r9 = X.C41845B3m.A04()     // Catch:{ DIS -> 0x015c }
            X.2IS r8 = X.C41845B3m.A04()     // Catch:{ DIS -> 0x015c }
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02     // Catch:{ DIS -> 0x015c }
            r1 = 30
            java.lang.Integer r6 = new java.lang.Integer     // Catch:{ DIS -> 0x015c }
            r6.<init>(r1)     // Catch:{ DIS -> 0x015c }
            java.lang.String r1 = "page_size"
            X.0Df r6 = X.C41845B3m.A03(r7, r6, r1)     // Catch:{ DIS -> 0x015c }
            java.lang.String r1 = "serialized_cursor"
            r7 = r19
            X.0Df.A00(r6, r7, r1)     // Catch:{ DIS -> 0x015c }
            java.lang.String r1 = "data"
            X.1vR r7 = X.C41847B3o.A04(r6, r9, r1)     // Catch:{ DIS -> 0x015c }
            java.util.Map r9 = r9.getParamsCopy()     // Catch:{ DIS -> 0x015c }
            java.util.Map r10 = r8.getParamsCopy()     // Catch:{ DIS -> 0x015c }
            java.lang.Class<X.C6K> r11 = X.C6K.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()     // Catch:{ DIS -> 0x015c }
            java.lang.String r8 = "GetAggregatedWallFeed"
            r12 = 0
            java.lang.String r16 = "xdt_get_friend_wall_activity"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ DIS -> 0x015c }
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ DIS -> 0x015c }
            r4.A01 = r5     // Catch:{ DIS -> 0x015c }
            r4.A02 = r13     // Catch:{ DIS -> 0x015c }
            r4.A00 = r0     // Catch:{ DIS -> 0x015c }
            java.lang.Object r2 = r2.A04(r6, r4)     // Catch:{ DIS -> 0x015c }
            if (r2 != r3) goto L_0x0089
            return r3
        L_0x0086:
            X.0eS.A00(r2)     // Catch:{ DIS -> 0x015c }
        L_0x0089:
            X.3Ii r2 = (X.C239803Ii) r2     // Catch:{ DIS -> 0x015c }
            boolean r1 = r2 instanceof X.C239793Ih     // Catch:{ DIS -> 0x015c }
            if (r1 != 0) goto L_0x00a4
            boolean r1 = r2 instanceof X.C297815sO     // Catch:{ DIS -> 0x015c }
            if (r1 == 0) goto L_0x014f
            X.5sO r2 = (X.C297815sO) r2     // Catch:{ DIS -> 0x015c }
            java.lang.Object r2 = r2.A00     // Catch:{ DIS -> 0x015c }
            X.4dm r2 = (X.C268654dm) r2     // Catch:{ DIS -> 0x015c }
            r1 = 2131976750(0x7f13622e, float:1.959063E38)
            X.CuT r1 = X.D35.A00(r2, r1)     // Catch:{ DIS -> 0x015c }
            X.5sO r2 = X.C41845B3m.A0c(r1)     // Catch:{ DIS -> 0x015c }
        L_0x00a4:
            java.lang.Object r1 = X.C45161CrO.A00(r2)     // Catch:{ DIS -> 0x015c }
            X.3JC r1 = (X.AnonymousClass3JC) r1     // Catch:{ DIS -> 0x015c }
            java.lang.Object r4 = r1.A01     // Catch:{ DIS -> 0x015c }
            X.3lr r4 = (X.C250663lr) r4     // Catch:{ DIS -> 0x015c }
            if (r4 == 0) goto L_0x0154
            java.lang.Class<X.C6J> r3 = X.C6J.class
            r15 = 0
            java.lang.String r2 = "xdt_get_friend_wall_activity(data:$data)"
            r1 = 891204159(0x351eb23f, float:5.911897E-7)
            X.3lr r4 = r4.getRequiredTreeField(r15, r2, r3, r1)     // Catch:{ DIS -> 0x015c }
            if (r4 == 0) goto L_0x0154
            com.instagram.common.session.UserSession r5 = r5.A00     // Catch:{ DIS -> 0x015c }
            java.lang.Class<X.C6I> r3 = X.C6I.class
            java.lang.String r2 = "posts"
            r1 = 912126529(0x365df241, float:3.3072577E-6)
            com.google.common.collect.ImmutableList r1 = X.C41845B3m.A0X(r4, r3, r2, r15, r1)     // Catch:{ DIS -> 0x015c }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ DIS -> 0x015c }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ DIS -> 0x015c }
        L_0x00d3:
            boolean r1 = r9.hasNext()     // Catch:{ DIS -> 0x015c }
            if (r1 == 0) goto L_0x0138
            X.3lr r6 = X.C41845B3m.A0V(r9)     // Catch:{ DIS -> 0x015c }
            java.lang.Class<X.C6l> r2 = X.C43715C6l.class
            r1 = 1804051236(0x6b87a324, float:3.279508E26)
            X.3lr r6 = r6.reinterpretRequired(r15, r2, r1)     // Catch:{ DIS -> 0x015c }
            X.C6l r6 = (X.C43715C6l) r6     // Catch:{ DIS -> 0x015c }
            X.0qQ.A07(r6)     // Catch:{ DIS -> 0x015c }
            java.lang.Class<X.C6k> r8 = X.C43714C6k.class
            r7 = 5
            java.lang.String r2 = "wall_owner"
            r1 = 2073878205(0x7b9cdebd, float:1.629032E36)
            X.3lr r7 = r6.getRequiredTreeField(r7, r2, r8, r1)     // Catch:{ DIS -> 0x015c }
            java.lang.Class<X.C8P> r2 = X.C8P.class
            r1 = 632736148(0x25b6c994, float:3.1708562E-16)
            X.3lr r2 = r7.reinterpretRequired(r15, r2, r1)     // Catch:{ DIS -> 0x015c }
            X.C8P r2 = (X.C8P) r2     // Catch:{ DIS -> 0x015c }
            X.1E5 r1 = X.1E4.A00(r5)     // Catch:{ DIS -> 0x015c }
            com.instagram.user.model.User r11 = r2.A0E(r1)     // Catch:{ DIS -> 0x015c }
            X.0qQ.A07(r11)     // Catch:{ DIS -> 0x015c }
            r2 = 4
            java.lang.String r1 = "wall_id"
            java.lang.String r12 = r6.getRequiredStringField(r2, r1)     // Catch:{ DIS -> 0x015c }
            X.0qQ.A07(r12)     // Catch:{ DIS -> 0x015c }
            java.lang.String r13 = r11.getUsername()     // Catch:{ DIS -> 0x015c }
            java.lang.String r2 = r11.getId()     // Catch:{ DIS -> 0x015c }
            java.lang.String r1 = r5.A06     // Catch:{ DIS -> 0x015c }
            boolean r14 = X.0qQ.A0K(r2, r1)     // Catch:{ DIS -> 0x015c }
            com.instagram.wonderwall.model.WallInfo r10 = new com.instagram.wonderwall.model.WallInfo     // Catch:{ DIS -> 0x015c }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ DIS -> 0x015c }
            X.1E5 r1 = X.1E4.A00(r5)     // Catch:{ DIS -> 0x015c }
            com.instagram.wonderwall.model.WallPostItem r1 = X.D35.A01(r1, r5, r10, r6)     // Catch:{ DIS -> 0x015c }
            if (r1 == 0) goto L_0x00d3
            r3.add(r1)     // Catch:{ DIS -> 0x015c }
            goto L_0x00d3
        L_0x0138:
            r2 = 2
            java.lang.String r1 = "has_more_available"
            boolean r2 = r4.getRequiredBooleanField(r2, r1)     // Catch:{ DIS -> 0x015c }
            java.lang.String r1 = "cursor"
            java.lang.String r1 = r4.getOptionalStringField(r0, r1)     // Catch:{ DIS -> 0x015c }
            X.Hmf r0 = new X.Hmf     // Catch:{ DIS -> 0x015c }
            r0.<init>(r1, r3, r2)     // Catch:{ DIS -> 0x015c }
            X.3Ih r3 = X.C41845B3m.A0d(r0)     // Catch:{ DIS -> 0x015c }
            return r3
        L_0x014f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ DIS -> 0x015c }
            goto L_0x015b
        L_0x0154:
            r0 = 2131976750(0x7f13622e, float:1.959063E38)
            X.DIS r0 = A00(r0)     // Catch:{ DIS -> 0x015c }
        L_0x015b:
            throw r0     // Catch:{ DIS -> 0x015c }
        L_0x015c:
            r0 = move-exception
            X.5sO r3 = r0.A00
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A04(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[Catch:{ DIS -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0 A[Catch:{ DIS -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015b A[Catch:{ DIS -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r5 = 13
            r6 = r20
            boolean r0 = X.C66131MDj.A01(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x002b
            r3 = r6
            X.MDj r3 = (X.C66131MDj) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r13 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r12) goto L_0x0031
            java.lang.Object r4 = r3.A01
            com.instagram.wonderwall.api.WallApiGraphQLImpl r4 = (com.instagram.wonderwall.api.WallApiGraphQLImpl) r4
            goto L_0x0078
        L_0x002b:
            X.MDj r3 = new X.MDj
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            X.0eS.A00(r1)
            X.1vn r1 = r4.A01     // Catch:{ DIS -> 0x0163 }
            X.2IS r6 = X.C41845B3m.A04()     // Catch:{ DIS -> 0x0163 }
            X.2IS r5 = X.C41845B3m.A04()     // Catch:{ DIS -> 0x0163 }
            java.lang.String r0 = "user_id"
            r7 = r19
            r6.A04(r0, r7)     // Catch:{ DIS -> 0x0163 }
            boolean r0 = X.AnonymousClass7TF.A1V(r7)
            X.1vR r7 = X.C41845B3m.A06(r0)     // Catch:{ DIS -> 0x0163 }
            java.util.Map r9 = r6.getParamsCopy()     // Catch:{ DIS -> 0x0163 }
            java.util.Map r10 = r5.getParamsCopy()     // Catch:{ DIS -> 0x0163 }
            java.lang.Class<X.C6O> r11 = X.C6O.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()     // Catch:{ DIS -> 0x0163 }
            java.lang.String r8 = "GetOrCreateWallMutation"
            r14 = 0
            java.lang.String r16 = "xdt_get_or_create_user_wall"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ DIS -> 0x0163 }
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ DIS -> 0x0163 }
            r3.A01 = r4     // Catch:{ DIS -> 0x0163 }
            r3.A02 = r13     // Catch:{ DIS -> 0x0163 }
            r3.A00 = r12     // Catch:{ DIS -> 0x0163 }
            java.lang.Object r1 = r1.A04(r6, r3)     // Catch:{ DIS -> 0x0163 }
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x0078:
            X.0eS.A00(r1)     // Catch:{ DIS -> 0x0163 }
        L_0x007b:
            X.3Ii r1 = (X.C239803Ii) r1     // Catch:{ DIS -> 0x0163 }
            boolean r0 = r1 instanceof X.C239793Ih     // Catch:{ DIS -> 0x0163 }
            if (r0 != 0) goto L_0x0096
            boolean r0 = r1 instanceof X.C297815sO     // Catch:{ DIS -> 0x0163 }
            if (r0 == 0) goto L_0x0156
            X.5sO r1 = (X.C297815sO) r1     // Catch:{ DIS -> 0x0163 }
            java.lang.Object r1 = r1.A00     // Catch:{ DIS -> 0x0163 }
            X.4dm r1 = (X.C268654dm) r1     // Catch:{ DIS -> 0x0163 }
            r0 = 2131976750(0x7f13622e, float:1.959063E38)
            X.CuT r0 = X.D35.A00(r1, r0)     // Catch:{ DIS -> 0x0163 }
            X.5sO r1 = X.C41845B3m.A0c(r0)     // Catch:{ DIS -> 0x0163 }
        L_0x0096:
            java.lang.Object r0 = X.C45161CrO.A00(r1)     // Catch:{ DIS -> 0x0163 }
            X.3JC r0 = (X.AnonymousClass3JC) r0     // Catch:{ DIS -> 0x0163 }
            java.lang.Object r3 = r0.A01     // Catch:{ DIS -> 0x0163 }
            X.3lr r3 = (X.C250663lr) r3     // Catch:{ DIS -> 0x0163 }
            if (r3 == 0) goto L_0x015b
            java.lang.Class<X.C6N> r2 = X.C6N.class
            r7 = 0
            java.lang.String r1 = "xdt_get_or_create_user_wall(user_id:$user_id)"
            r0 = -1036942193(0xffffffffc231848f, float:-44.37945)
            X.3lr r5 = r3.getRequiredTreeField(r7, r1, r2, r0)     // Catch:{ DIS -> 0x0163 }
            if (r5 == 0) goto L_0x015b
            com.instagram.common.session.UserSession r4 = r4.A00     // Catch:{ DIS -> 0x0163 }
            java.lang.String r0 = "id"
            java.lang.String r14 = r5.getRequiredStringField(r7, r0)     // Catch:{ DIS -> 0x0163 }
            X.0qQ.A07(r14)     // Catch:{ DIS -> 0x0163 }
            java.lang.Class<X.C6L> r10 = X.C6L.class
            java.lang.String r9 = "owner"
            r8 = -2025429620(0xffffffff8746658c, float:-1.4925706E-34)
            X.3lr r0 = r5.getRequiredTreeField(r12, r9, r10, r8)     // Catch:{ DIS -> 0x0163 }
            java.lang.Class<X.C8P> r6 = X.C8P.class
            r3 = 632736148(0x25b6c994, float:3.1708562E-16)
            X.3lr r11 = r0.reinterpretRequired(r7, r6, r3)     // Catch:{ DIS -> 0x0163 }
            r2 = 52
            r1 = 8
            r0 = 53
            java.lang.String r0 = X.AnonymousClass9NE.A01(r2, r1, r0)     // Catch:{ DIS -> 0x0163 }
            java.lang.String r15 = X.C41846B3n.A0i(r11, r0, r12)     // Catch:{ DIS -> 0x0163 }
            X.3lr r0 = r5.getRequiredTreeField(r12, r9, r10, r8)     // Catch:{ DIS -> 0x0163 }
            X.3lr r1 = r0.reinterpretRequired(r7, r6, r3)     // Catch:{ DIS -> 0x0163 }
            X.C8P r1 = (X.C8P) r1     // Catch:{ DIS -> 0x0163 }
            X.1E5 r0 = X.1E4.A00(r4)     // Catch:{ DIS -> 0x0163 }
            com.instagram.user.model.User r13 = r1.A0E(r0)     // Catch:{ DIS -> 0x0163 }
            X.0qQ.A07(r13)     // Catch:{ DIS -> 0x0163 }
            java.lang.String r2 = r4.A06     // Catch:{ DIS -> 0x0163 }
            X.3lr r0 = r5.getRequiredTreeField(r12, r9, r10, r8)     // Catch:{ DIS -> 0x0163 }
            X.3lr r1 = r0.reinterpretRequired(r7, r6, r3)     // Catch:{ DIS -> 0x0163 }
            java.lang.String r0 = "pk"
            java.lang.String r0 = r1.getOptionalStringField(r7, r0)     // Catch:{ DIS -> 0x0163 }
            boolean r16 = X.0qQ.A0K(r2, r0)     // Catch:{ DIS -> 0x0163 }
            r1 = 2
            java.lang.String r0 = "can_post"
            boolean r17 = r5.getRequiredBooleanField(r1, r0)     // Catch:{ DIS -> 0x0163 }
            com.instagram.wonderwall.model.WallInfo r12 = new com.instagram.wonderwall.model.WallInfo     // Catch:{ DIS -> 0x0163 }
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ DIS -> 0x0163 }
            java.lang.Class<X.C6M> r3 = X.C6M.class
            r2 = 3
            java.lang.String r1 = "posts"
            r0 = -1127826671(0xffffffffbcc6bb11, float:-0.024259122)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r3, r1, r2, r0)     // Catch:{ DIS -> 0x0163 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ DIS -> 0x0163 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ DIS -> 0x0163 }
        L_0x0126:
            boolean r0 = r3.hasNext()     // Catch:{ DIS -> 0x0163 }
            if (r0 == 0) goto L_0x014c
            X.3lr r2 = X.C41845B3m.A0V(r3)     // Catch:{ DIS -> 0x0163 }
            java.lang.Class<X.C6l> r1 = X.C43715C6l.class
            r0 = 1804051236(0x6b87a324, float:3.279508E26)
            X.3lr r1 = r2.A01(r1, r0)     // Catch:{ DIS -> 0x0163 }
            X.C6l r1 = (X.C43715C6l) r1     // Catch:{ DIS -> 0x0163 }
            X.0qQ.A07(r1)     // Catch:{ DIS -> 0x0163 }
            X.1E5 r0 = X.1E4.A00(r4)     // Catch:{ DIS -> 0x0163 }
            com.instagram.wonderwall.model.WallPostItem r0 = X.D35.A01(r0, r4, r12, r1)     // Catch:{ DIS -> 0x0163 }
            if (r0 == 0) goto L_0x0126
            r5.add(r0)     // Catch:{ DIS -> 0x0163 }
            goto L_0x0126
        L_0x014c:
            X.HlL r0 = new X.HlL     // Catch:{ DIS -> 0x0163 }
            r0.<init>(r12, r5)     // Catch:{ DIS -> 0x0163 }
            X.3Ih r2 = X.C41845B3m.A0d(r0)     // Catch:{ DIS -> 0x0163 }
            return r2
        L_0x0156:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ DIS -> 0x0163 }
            goto L_0x0162
        L_0x015b:
            r0 = 2131976750(0x7f13622e, float:1.959063E38)
            X.DIS r0 = A00(r0)     // Catch:{ DIS -> 0x0163 }
        L_0x0162:
            throw r0     // Catch:{ DIS -> 0x0163 }
        L_0x0163:
            r0 = move-exception
            X.5sO r2 = r0.A00
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.api.WallApiGraphQLImpl.A05(java.lang.String, X.4D7):java.lang.Object");
    }
}
