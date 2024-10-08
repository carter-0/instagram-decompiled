package com.instagram.video.live.mvvm.model.datasource.api;

import com.instagram.common.session.UserSession;

public final class IgLiveLikesApi {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C62876Knq r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r11 = this;
            r3 = 29
            boolean r0 = X.C66142MDu.A02(r3, r14)
            if (r0 == 0) goto L_0x00cb
            r4 = r14
            X.MDu r4 = (X.C66142MDu) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cb
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r2) goto L_0x00d6
            if (r0 != r6) goto L_0x00d1
            X.0eS.A00(r1)
        L_0x0027:
            r5 = r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00eb
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00e7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0035:
            X.0eS.A00(r1)
            boolean r0 = r12 instanceof X.C62174KbW
            if (r0 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r0 = r11.A00
            X.KbW r12 = (X.C62174KbW) r12
            java.lang.String r7 = r12.A02
            r6 = 0
            X.0qQ.A0B(r13, r2)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r13}
            java.lang.String r0 = "live/%s/react/"
            r3.A0K(r0, r1)
            java.lang.String r0 = "reaction_unicode"
            r3.A9m(r0, r7)
            java.lang.String r0 = "artifact_id"
            r3.A9m(r0, r6)
            java.lang.String r0 = "template_id"
            r3.A9m(r0, r6)
            java.lang.String r0 = "media_type"
            r3.A9m(r0, r6)
            java.lang.String r0 = "cdn_url"
            r3.A9m(r0, r6)
            X.1OC r1 = X.JTU.A0G(r3)
            r4.A00 = r2
            r0 = 214929959(0xccf9227, float:3.1981362E-31)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x00d9
            return r5
        L_0x007c:
            boolean r0 = r12 instanceof X.C62175KbX
            if (r0 == 0) goto L_0x00ec
            com.instagram.common.session.UserSession r1 = r11.A00
            X.KbX r12 = (X.C62175KbX) r12
            java.lang.String r10 = r12.A05
            java.lang.String r9 = r12.A06
            java.lang.String r8 = r12.A03
            com.instagram.common.typedurl.ImageUrl r0 = r12.A01
            java.lang.String r7 = r0.getUrl()
            java.lang.String r3 = ""
            X.0qQ.A0B(r13, r2)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r13}
            java.lang.String r0 = "live/%s/react/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "reaction_unicode"
            r2.A9m(r0, r3)
            java.lang.String r0 = "artifact_id"
            r2.A9m(r0, r10)
            java.lang.String r0 = "template_id"
            r2.A9m(r0, r9)
            java.lang.String r0 = "media_type"
            r2.A9m(r0, r8)
            java.lang.String r0 = "cdn_url"
            r2.A9m(r0, r7)
            X.1OC r1 = X.JTU.A0G(r2)
            r4.A00 = r6
            r0 = 214929959(0xccf9227, float:3.1981362E-31)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x0027
            return r5
        L_0x00cb:
            X.MDu r4 = X.C66142MDu.A00(r11, r14, r3)
            goto L_0x0016
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d6:
            X.0eS.A00(r1)
        L_0x00d9:
            r5 = r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00eb
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00e7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e7:
            X.5sO r5 = X.DbU.A0f()
        L_0x00eb:
            return r5
        L_0x00ec:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi.A00(X.Knq, java.lang.String, X.4D7):java.lang.Object");
    }

    public IgLiveLikesApi(UserSession userSession) {
        this.A00 = userSession;
    }
}
