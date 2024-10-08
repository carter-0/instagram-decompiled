package com.instagram.direct.inbox.birthdays;

import X.0qQ;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class BirthdayPogsApi {
    public final UserSession A00;
    public final 1vn A01;

    public BirthdayPogsApi(UserSession userSession, 1vn r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 31
            boolean r0 = X.C66129MDh.A01(r3, r9)
            if (r0 == 0) goto L_0x0090
            r6 = r9
            X.MDh r6 = (X.C66129MDh) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0090
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r6.A00
            r5 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0063
            if (r1 != r3) goto L_0x00aa
            java.lang.Object r7 = r6.A01
            com.instagram.direct.inbox.birthdays.BirthdayPogsApi r7 = (com.instagram.direct.inbox.birthdays.BirthdayPogsApi) r7
            X.0eS.A00(r0)
        L_0x0029:
            r4 = r0
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a0
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.CFE r0 = (X.CFE) r0
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x0096
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.common.session.UserSession r0 = r7.A00
            X.17i r0 = X.17h.A00(r0)
            com.instagram.user.model.User r0 = r0.A01(r1, r5, r3)
            r6.add(r0)
            goto L_0x0049
        L_0x0063:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "notes/get_birthday_pogs/"
            r2.A0A(r0)
            java.lang.Class<X.CFE> r1 = X.CFE.class
            java.lang.Class<X.D0v> r0 = X.C45670D0v.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r6.A01 = r8
            r6.A00 = r3
            r0 = 144008893(0x89566bd, float:8.991765E-34)
            java.lang.Object r0 = r1.A00(r0, r6)
            if (r0 == r4) goto L_0x00ce
            r7 = r8
            goto L_0x0029
        L_0x0090:
            X.MDh r6 = new X.MDh
            r6.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x0096:
            java.lang.String r0 = "users"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a0:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00b7
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00aa:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            X.3Ih r4 = new X.3Ih
            r4.<init>(r6)
        L_0x00b7:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00cf
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Throwable r0 = r0.A01()
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x00ce:
            return r4
        L_0x00cf:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.birthdays.BirthdayPogsApi.A00(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r5 = 32
            r6 = r19
            boolean r0 = X.AnonymousClass9JX.A00(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x00da
            r3 = r6
            X.9JX r3 = (X.AnonymousClass9JX) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00da
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x009c
            if (r0 != r2) goto L_0x00eb
            java.lang.Object r5 = r3.A01
            com.instagram.direct.inbox.birthdays.BirthdayPogsApi r5 = (com.instagram.direct.inbox.birthdays.BirthdayPogsApi) r5
            X.0eS.A00(r6)
        L_0x002c:
            r1 = r6
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00e1
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x00f3
            java.lang.Class<X.B7h> r2 = X.C41930B7h.class
            r6 = 0
            java.lang.String r1 = "xdt_get_birthday_pogs"
            r0 = -2075564771(0xffffffff8449651d, float:-2.3673865E-36)
            X.3lr r3 = r3.getRequiredTreeField(r6, r1, r2, r0)
            if (r3 == 0) goto L_0x00f3
            java.lang.Class<X.BiM> r2 = X.C42786BiM.class
            java.lang.String r1 = "users"
            r0 = -998660781(0xffffffffc479a553, float:-998.5832)
            com.google.common.collect.ImmutableList r1 = r3.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            if (r1 == 0) goto L_0x00f3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x0063:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00f5
            java.lang.Object r3 = r7.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.BiL> r2 = X.C42785BiL.class
            r1 = -858618116(0xffffffffccd286fc, float:-1.10376928E8)
            X.3lr r2 = r3.reinterpretRequired(r6, r2, r1)
            com.instagram.common.session.UserSession r1 = r5.A00
            X.1E5 r4 = X.1E4.A00(r1)
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r1)
            com.instagram.user.model.ImmutablePandoUserDict r3 = (com.instagram.user.model.ImmutablePandoUserDict) r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.1E9 r1 = new X.1E9
            r1.<init>(r4, r2, r6)
            com.instagram.user.model.User r1 = X.1aC.A01(r1, r3)
            if (r1 == 0) goto L_0x0063
            r0.add(r1)
            goto L_0x0063
        L_0x009c:
            X.0eS.A00(r6)
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.B7g> r11 = X.C41929B7g.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "GetBirthdayPogs"
            r12 = 0
            java.lang.String r16 = "xdt_get_birthday_pogs"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r4.A01
            r3.A01 = r4
            r3.A00 = r2
            java.lang.Object r6 = r0.A04(r6, r3)
            if (r6 == r1) goto L_0x0111
            r5 = r4
            goto L_0x002c
        L_0x00da:
            X.9JX r3 = new X.9JX
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00e1:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00fa
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00eb:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00f3:
            X.0sn r0 = X.0sn.A00
        L_0x00f5:
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x00fa:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0111
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0112
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Throwable r0 = r0.A01()
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0111:
            return r1
        L_0x0112:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.birthdays.BirthdayPogsApi.A01(X.4D7):java.lang.Object");
    }
}
