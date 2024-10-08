package com.instagram.direct.prompts.dailyprompts.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.C51970G9q;
import X.C51971G9r;
import X.C69275Nib;
import X.C69909NuB;
import X.DbS;
import X.JTO;
import X.LP4;
import com.instagram.common.session.UserSession;

public final class DirectDailyPromptsResponseListRepository implements AnonymousClass0lh {
    public final UserSession A00;
    public final LP4 A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;

    public DirectDailyPromptsResponseListRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C69909NuB.A00(userSession);
        02z A10 = DbS.A10(C69275Nib.LOADING);
        this.A0E = A10;
        02z A012 = 106.A01((Object) null);
        this.A0D = A012;
        02z A013 = 106.A01((Object) null);
        this.A0B = A013;
        02z A102 = DbS.A10(C51971G9r.A0m());
        this.A0C = A102;
        02z A103 = C51970G9q.A10(false);
        this.A02 = A103;
        02z A1J = JTO.A1J();
        this.A03 = A1J;
        02z A014 = 106.A01((Object) null);
        this.A0F = A014;
        this.A08 = 10b.A03(A10);
        this.A06 = 10b.A03(A012);
        this.A04 = 10b.A03(A013);
        this.A05 = 10b.A03(A102);
        this.A07 = 10b.A03(A103);
        this.A09 = 10b.A03(A014);
        this.A0A = 10b.A03(A1J);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            r4 = 2
            boolean r0 = X.JUN.A00(r4, r14)
            if (r0 == 0) goto L_0x010a
            r3 = r14
            X.JUN r3 = (X.JUN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010a
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x009b
            if (r0 != r2) goto L_0x011a
            boolean r15 = r3.A04
            java.lang.Object r3 = r3.A01
            com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository r3 = (com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository) r3
            X.0eS.A00(r1)
        L_0x0029:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0111
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r4 = r1.A00
            X.371 r4 = (X.AnonymousClass371) r4
            X.05G r1 = r3.A0E
            X.Nib r0 = X.C69275Nib.LOADED
            r1.Epw(r0)
            java.lang.Object r6 = r4.FH3()
            X.0qQ.A07(r6)
            X.N3N r6 = (X.N3N) r6
            X.05G r1 = r3.A0D
            java.lang.String r0 = r6.A0B
            r1.Epw(r0)
            X.05G r1 = r3.A0B
            com.instagram.user.model.User r0 = r6.A01
            r1.Epw(r0)
            X.05G r7 = r3.A0C
            java.lang.Double r0 = r6.A07
            if (r0 == 0) goto L_0x0098
            double r4 = r0.doubleValue()
            long r0 = (long) r4
        L_0x005e:
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r0)
            r7.Epw(r4)
            X.05G r1 = r3.A02
            java.lang.Boolean r0 = r6.A04
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            X.AnonymousClass7TF.A1O(r1, r0)
            X.05G r1 = r3.A0F
            java.lang.String r0 = r6.A0D
            r1.Epw(r0)
            java.util.List r0 = r6.A0E
            if (r0 == 0) goto L_0x0120
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0084:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r1.next()
            X.N3B r0 = (X.N3B) r0
            X.N3F r0 = X.C69906Nu8.A00(r0)
            r2.add(r0)
            goto L_0x0084
        L_0x0098:
            r0 = 0
            goto L_0x005e
        L_0x009b:
            X.0eS.A00(r1)
            X.05G r5 = r10.A0F
            if (r15 == 0) goto L_0x00ff
            r0 = 0
            r5.Epw(r0)
            X.05G r1 = r10.A0E
            if (r16 == 0) goto L_0x00fc
            java.lang.Object r0 = r1.getValue()
        L_0x00ae:
            r1.Epw(r0)
            com.instagram.common.session.UserSession r7 = r10.A00
            java.lang.Object r8 = r5.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r0 = 20
            java.lang.Integer r9 = X.JTO.A0w(r0)
            java.lang.String r1 = ""
            r6 = 3
            X.0qQ.A0B(r11, r6)
            r0 = 4
            X.DbW.A1O(r12, r0, r13)
            r5 = 0
            X.1NY r7 = X.AnonymousClass7TG.A0a(r7)
            X.C66584MXp.A12(r7, r13, r1, r12, r11)
            int r1 = r9.intValue()
            java.lang.String r0 = "batch_size"
            r7.A0C(r0, r1)
            if (r8 == 0) goto L_0x00e1
            java.lang.String r0 = "cursor"
            r7.A9m(r0, r8)
        L_0x00e1:
            X.1OC r1 = r7.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetCollectionGridItemsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetCollectionGridItemsResponse>>"
            X.0qQ.A0C(r1, r0)
            r3.A01 = r10
            r3.A04 = r15
            r3.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r1 = r1.A02(r3, r0, r6, r5)
            if (r1 == r4) goto L_0x011f
            r3 = r10
            goto L_0x0029
        L_0x00fc:
            X.Nib r0 = X.C69275Nib.LOADING
            goto L_0x00ae
        L_0x00ff:
            java.lang.Object r0 = r5.getValue()
            if (r0 == 0) goto L_0x013c
            X.05G r1 = r10.A0E
            X.Nib r0 = X.C69275Nib.PAGINATING
            goto L_0x00ae
        L_0x010a:
            X.JUN r3 = new X.JUN
            r3.<init>(r10, r14, r4)
            goto L_0x0015
        L_0x0111:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x012d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x011f:
            return r4
        L_0x0120:
            X.0sn r2 = X.0sn.A00
        L_0x0122:
            X.05G r1 = r3.A03
            if (r15 == 0) goto L_0x013f
            r1.Epw(r2)
        L_0x0129:
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x012d:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x013c
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x014d
            X.05G r1 = r3.A0E
            X.Nib r0 = X.C69275Nib.LOADED
            r1.Epw(r0)
        L_0x013c:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x013f:
            java.lang.Object r0 = r1.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.00k.A0S(r2, r0)
            r1.Epw(r0)
            goto L_0x0129
        L_0x014d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.A01(java.lang.String, java.lang.String, java.lang.String, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.model.direct.DirectThreadKey r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r10 = this;
            r3 = 22
            boolean r0 = X.C66145MDx.A02(r3, r14)
            if (r0 == 0) goto L_0x0089
            r4 = r14
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0070
            if (r1 != r2) goto L_0x00b2
            java.lang.Object r13 = r4.A02
            java.lang.Object r7 = r4.A01
            com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository r7 = (com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository) r7
            X.0eS.A00(r0)
        L_0x002a:
            boolean r1 = r0 instanceof X.C239793Ih
            r5 = 0
            if (r1 == 0) goto L_0x00b7
            X.05G r9 = r7.A03
            java.util.Iterator r1 = X.C66583MXo.A0l(r9)
        L_0x0035:
            boolean r0 = r1.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x006e
            java.lang.Object r8 = r1.next()
            r0 = r8
            X.N3F r0 = (X.N3F) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x0035
        L_0x004b:
            X.N3F r8 = (X.N3F) r8
            java.lang.Object r0 = r9.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x005b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.N3F r0 = (X.N3F) r0
            java.lang.String r0 = r0.A05
            X.DbY.A1T(r0, r13, r1, r4)
            goto L_0x005b
        L_0x006e:
            r8 = r6
            goto L_0x004b
        L_0x0070:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r10.A00
            r0 = 163(0xa3, float:2.28E-43)
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A01(r1, r11, r12, r13, r0)
            X.C66145MDx.A00(r10, r13, r4, r2)
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 == r3) goto L_0x00c0
            r7 = r10
            goto L_0x002a
        L_0x0089:
            X.MDx r4 = new X.MDx
            r4.<init>(r10, r14, r3)
            goto L_0x0016
        L_0x008f:
            java.util.ArrayList r0 = X.00k.A0U(r4)
            r9.Epw(r0)
            X.05G r1 = r7.A02
            if (r8 == 0) goto L_0x00a2
            com.instagram.user.model.User r0 = r8.A02
            if (r0 == 0) goto L_0x00a2
            java.lang.String r6 = X.AnonymousClass3ZA.A00(r0)
        L_0x00a2:
            com.instagram.common.session.UserSession r0 = r7.A00
            boolean r0 = X.C51966G9m.A1W(r0, r6)
            if (r0 != 0) goto L_0x00ae
            boolean r5 = X.DbX.A1b(r1)
        L_0x00ae:
            X.AnonymousClass7TF.A1O(r1, r5)
            goto L_0x00bc
        L_0x00b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b7:
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c1
            r2 = 0
        L_0x00bc:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
        L_0x00c0:
            return r3
        L_0x00c1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.A00(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 23
            boolean r0 = X.ME7.A02(r3, r8)
            if (r0 == 0) goto L_0x0049
            r4 = r8
            X.ME7 r4 = (X.ME7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x0056
            X.0eS.A00(r0)
        L_0x0024:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x002d
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0051
            r2 = 0
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.String r0 = "daily_prompt"
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A0A(r1, r7, r6, r0)
            r4.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0049:
            r0 = 42
            X.ME7 r4 = new X.ME7
            r4.<init>(r5, r8, r3, r0)
            goto L_0x0016
        L_0x0051:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.A02(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A00.A03(DirectDailyPromptsResponseListRepository.class);
    }
}
