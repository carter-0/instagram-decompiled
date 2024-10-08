package com.instagram.direct.avatar.reactions.api;

import X.0qQ;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class AvatarReactionsApi {
    public final UserSession A00;
    public final 1vn A01;

    public AvatarReactionsApi(UserSession userSession, 1vn r3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0175, code lost:
        r11 = X.Bo7.class;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r24) {
        /*
            r23 = this;
            r5 = 21
            r6 = r24
            boolean r0 = X.C66129MDh.A01(r5, r6)
            r4 = r23
            if (r0 == 0) goto L_0x010b
            r3 = r6
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x00cf
            if (r1 != r0) goto L_0x0252
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0220
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r1 = r5.A00
            X.3JC r1 = (X.AnonymousClass3JC) r1
            java.lang.Object r5 = r1.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x022a
            java.lang.Class<X.BoE> r4 = X.BoE.class
            r2 = 0
            java.lang.String r3 = "me"
            r1 = 884649648(0x34baaeb0, float:3.4772302E-7)
            X.3lr r5 = r5.getOptionalTreeField(r2, r3, r4, r1)
            if (r5 == 0) goto L_0x022a
            java.lang.Class<X.BoD> r4 = X.BoD.class
            java.lang.String r3 = "user_avatar"
            r1 = -1797485986(0xffffffff94dc8a5e, float:-2.22689E-26)
            X.3lr r5 = r5.getOptionalTreeField(r2, r3, r4, r1)
            if (r5 == 0) goto L_0x022a
            java.lang.Class<X.BoC> r4 = X.BoC.class
            r1 = 358(0x166, float:5.02E-43)
            java.lang.String r3 = X.C66579MXk.A00(r1)
            r1 = -1363449617(0xffffffffaebb68ef, float:-8.5224154E-11)
            X.3lr r9 = r5.getOptionalTreeField(r2, r3, r4, r1)
            if (r9 == 0) goto L_0x022a
            java.lang.Class<X.BoA> r4 = X.BoA.class
            java.lang.String r3 = "entries"
            r1 = -987368235(0xffffffffc525f4d5, float:-2655.302)
            com.google.common.collect.ImmutableList r1 = r9.getRequiredCompactedTreeListField(r0, r3, r4, r1)
            X.0qQ.A07(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x007d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0112
            java.lang.Object r3 = r7.next()
            X.3lr r3 = (X.C250663lr) r3
            X.0qQ.A0A(r3)
            java.lang.String r1 = "pack_name"
            java.lang.String r11 = r3.getOptionalStringField(r2, r1)
            if (r11 == 0) goto L_0x007d
            java.lang.String r1 = "template_name"
            java.lang.String r12 = r3.getOptionalStringField(r0, r1)
            if (r12 == 0) goto L_0x007d
            java.lang.String r1 = "accessibility_label"
            java.lang.String r13 = r3.A09(r1)
            if (r13 == 0) goto L_0x007d
            java.lang.String r1 = "item_json"
            java.lang.String r6 = r3.A0C(r1)
            if (r6 == 0) goto L_0x007d
            X.3mC r5 = X.C250863mB.A03
            X.3u9 r3 = X.C255453u9.A01
            X.3zM r1 = new X.3zM
            r1.<init>(r3, r3)
            java.lang.Object r3 = r5.A00(r6, r1)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r1 = "emoji"
            java.lang.Object r14 = r3.get(r1)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x007d
            r15 = 7
            X.QP5 r10 = new X.QP5
            r10.<init>(r11, r12, r13, r14, r15)
            r4.add(r10)
            goto L_0x007d
        L_0x00cf:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.BoF> r11 = X.BoF.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGAvatarReactionsQuery"
            r12 = 0
            java.lang.String r16 = "me"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r1 = r4.A01
            r3.A01 = r4
            r3.A00 = r0
            java.lang.Object r5 = r1.A04(r6, r3)
            if (r5 != r2) goto L_0x0028
            return r2
        L_0x010b:
            X.MDh r3 = new X.MDh
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x0112:
            r8 = 10
            int r1 = X.0Yv.A1E(r4, r8)
            int r3 = X.0se.A0L(r1)
            r7 = 16
            if (r3 >= r7) goto L_0x0122
            r3 = 16
        L_0x0122:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r3)
            java.util.Iterator r5 = r4.iterator()
        L_0x012b:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x013e
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.QP5 r3 = (X.QP5) r3
            java.lang.String r3 = r3.A03
            r1.put(r3, r4)
            goto L_0x012b
        L_0x013e:
            java.lang.Class<X.Bo9> r6 = X.Bo9.class
            r5 = 2
            java.lang.String r4 = "artifacts"
            r3 = 70265504(0x4302aa0, float:2.0708273E-36)
            com.google.common.collect.ImmutableList r3 = r9.getRequiredCompactedTreeListField(r5, r4, r6, r3)
            X.0qQ.A07(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r14 = r3.iterator()
        L_0x0156:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x01b8
            java.lang.Object r10 = r14.next()
            X.3lr r10 = (X.C250663lr) r10
            X.0qQ.A0A(r10)
            java.lang.String r3 = "pack_name"
            java.lang.String r16 = r10.getOptionalStringField(r2, r3)
            if (r16 == 0) goto L_0x0156
            java.lang.String r3 = "template_name"
            java.lang.String r17 = r10.getOptionalStringField(r0, r3)
            if (r17 == 0) goto L_0x0156
            java.lang.Class<X.Bo7> r11 = X.Bo7.class
            r9 = 6
            java.lang.String r5 = "large_artifact"
            r4 = -993052595(0xffffffffc4cf384d, float:-1657.7594)
            X.3lr r12 = r10.getOptionalTreeField(r9, r5, r11, r4)
            if (r12 == 0) goto L_0x0156
            java.lang.String r3 = "url"
            java.lang.String r18 = r12.getOptionalStringField(r2, r3)
            if (r18 == 0) goto L_0x0156
            X.3lr r12 = r10.getOptionalTreeField(r9, r5, r11, r4)
            if (r12 == 0) goto L_0x0156
            r13 = 3
            java.lang.String r3 = "width"
            int r19 = r12.getCoercedIntField(r13, r3)
            X.3lr r5 = r10.getOptionalTreeField(r9, r5, r11, r4)
            if (r5 == 0) goto L_0x0156
            r4 = 4
            java.lang.String r3 = "height"
            int r20 = r5.getCoercedIntField(r4, r3)
            java.lang.String r3 = "content_cache_key"
            java.lang.String r21 = r10.A0C(r3)
            if (r21 == 0) goto L_0x0156
            X.ULw r15 = new X.ULw
            r22 = r2
            r15.<init>((java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (int) r19, (int) r20, (java.lang.String) r21, (int) r22)
            r6.add(r15)
            goto L_0x0156
        L_0x01b8:
            int r0 = X.0Yv.A1E(r6, r8)
            int r0 = X.0se.A0L(r0)
            if (r0 >= r7) goto L_0x01c4
            r0 = 16
        L_0x01c4:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r4 = r6.iterator()
        L_0x01cd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.ULw r0 = (X.ULw) r0
            java.lang.String r0 = r0.A04
            r3.put(r0, r2)
            goto L_0x01cd
        L_0x01e0:
            java.util.Set r0 = r1.keySet()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x01ed:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x022c
            java.lang.Object r0 = r5.next()
            java.lang.Object r2 = r1.get(r0)
            X.QP5 r2 = (X.QP5) r2
            java.lang.Object r0 = r3.get(r0)
            X.ULw r0 = (X.ULw) r0
            if (r2 == 0) goto L_0x01ed
            if (r0 == 0) goto L_0x01ed
            java.lang.String r7 = r2.A02
            java.lang.String r8 = r2.A03
            java.lang.String r9 = r2.A00
            java.lang.String r10 = r2.A01
            java.lang.String r11 = r0.A05
            int r13 = r0.A01
            int r14 = r0.A00
            java.lang.String r12 = r0.A02
            X.JuF r6 = new X.JuF
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.add(r6)
            goto L_0x01ed
        L_0x0220:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0231
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x022a:
            X.0sn r4 = X.0sn.A00
        L_0x022c:
            X.3Ih r5 = new X.3Ih
            r5.<init>(r4)
        L_0x0231:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x024b
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x024c
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r0 = r5.A00
            java.lang.String r1 = r0.toString()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x024b:
            return r5
        L_0x024c:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0252:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.reactions.api.AvatarReactionsApi.A00(X.4D7):java.lang.Object");
    }
}
