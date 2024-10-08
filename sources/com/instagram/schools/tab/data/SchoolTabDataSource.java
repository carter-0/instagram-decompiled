package com.instagram.schools.tab.data;

import X.C4O;
import com.instagram.common.session.UserSession;

public final class SchoolTabDataSource {
    public C4O A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[Catch:{ DIS -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012c A[Catch:{ DIS -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.schools.tab.data.SchoolTabDataSource r13, java.lang.String r14, java.lang.String r15, X.AnonymousClass4D7 r16, int r17) {
        /*
            r1 = r13
            r5 = 44
            r6 = r16
            boolean r0 = X.C66138MDq.A02(r5, r6)
            if (r0 == 0) goto L_0x008c
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x008c
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x0019:
            java.lang.Object r5 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 != r2) goto L_0x0167
            java.lang.Object r1 = r4.A01
            com.instagram.schools.tab.data.SchoolTabDataSource r1 = (com.instagram.schools.tab.data.SchoolTabDataSource) r1
            X.0eS.A00(r5)
        L_0x002c:
            X.3Ii r5 = (X.C239803Ii) r5
            goto L_0x0092
        L_0x002f:
            X.0eS.A00(r5)
            r1.A00 = r13
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Integer r5 = new java.lang.Integer
            r0 = r17
            r5.<init>(r0)
            java.lang.String r0 = "selected_grad_year"
            X.0Df r7 = X.C41845B3m.A03(r6, r5, r0)
            r0 = 3931(0xf5b, float:5.509E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Df.A00(r7, r14, r0)
            if (r15 == 0) goto L_0x0053
            java.lang.String r0 = "serialized_current_cursor"
            X.0Df.A00(r7, r15, r0)
        L_0x0053:
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "request"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.C4U> r11 = X.C4U.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "SchoolsUserDirectory"
            r12 = 0
            java.lang.String r16 = "xdt_schools_user_directory"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r1.A01
            X.1vn r0 = X.1vm.A01(r0)
            r4.A01 = r1
            r4.A00 = r2
            java.lang.Object r5 = r0.A04(r6, r4)
            if (r5 != r3) goto L_0x002c
            return r3
        L_0x008c:
            X.MDq r4 = new X.MDq
            r4.<init>(r13, r6, r5)
            goto L_0x0019
        L_0x0092:
            boolean r0 = r5 instanceof X.C239793Ih     // Catch:{ DIS -> 0x0149 }
            if (r0 == 0) goto L_0x012c
            X.3Ih r5 = (X.C239793Ih) r5     // Catch:{ DIS -> 0x0149 }
            java.lang.Object r0 = r5.A00     // Catch:{ DIS -> 0x0149 }
            X.3JC r0 = (X.AnonymousClass3JC) r0     // Catch:{ DIS -> 0x0149 }
            r6 = 0
            if (r0 == 0) goto L_0x0135
            java.lang.Object r5 = r0.A01     // Catch:{ DIS -> 0x0149 }
            X.3lr r5 = (X.C250663lr) r5     // Catch:{ DIS -> 0x0149 }
            if (r5 == 0) goto L_0x0135
            java.lang.Class<X.C4T> r4 = X.C4T.class
            java.lang.String r3 = "xdt_schools_user_directory(input:$request)"
            r0 = -1043523647(0xffffffffc1cd17c1, float:-25.636599)
            X.3lr r7 = r5.A03(r4, r3, r0)     // Catch:{ DIS -> 0x0149 }
            if (r7 == 0) goto L_0x0135
            r3 = 4
            java.lang.String r0 = "available_grad_years"
            com.google.common.collect.ImmutableList r4 = r7.getOptionalCompactedStringListField(r3, r0)     // Catch:{ DIS -> 0x0149 }
            if (r4 != 0) goto L_0x00bd
            X.0sn r4 = X.0sn.A00     // Catch:{ DIS -> 0x0149 }
        L_0x00bd:
            java.lang.String r0 = "selected_grad_year"
            java.lang.String r3 = r7.A0C(r0)     // Catch:{ DIS -> 0x0149 }
            java.lang.String r8 = ""
            if (r3 != 0) goto L_0x00c8
            r3 = r8
        L_0x00c8:
            r0 = 12
            X.JwE r5 = new X.JwE     // Catch:{ DIS -> 0x0149 }
            r5.<init>((java.util.List) r4, (java.lang.String) r3, (int) r0)     // Catch:{ DIS -> 0x0149 }
            java.lang.Class<X.C4N> r9 = X.C4N.class
            r4 = 6
            java.lang.String r3 = "empty_state_response"
            r0 = -1094110453(0xffffffffbec9330b, float:-0.39296755)
            X.3lr r4 = r7.getOptionalTreeField(r4, r3, r9, r0)     // Catch:{ DIS -> 0x0149 }
            if (r4 == 0) goto L_0x00f5
            java.lang.String r0 = "title"
            java.lang.String r3 = r4.A07(r0)     // Catch:{ DIS -> 0x0149 }
            if (r3 != 0) goto L_0x00e6
            r3 = r8
        L_0x00e6:
            java.lang.String r0 = "body"
            java.lang.String r0 = r4.getOptionalStringField(r2, r0)     // Catch:{ DIS -> 0x0149 }
            if (r0 == 0) goto L_0x00ef
            r8 = r0
        L_0x00ef:
            r0 = 7
            X.ULg r6 = new X.ULg     // Catch:{ DIS -> 0x0149 }
            r6.<init>(r3, r8, r0)     // Catch:{ DIS -> 0x0149 }
        L_0x00f5:
            java.lang.Class<X.C4O> r4 = X.C4O.class
            java.lang.String r3 = "page_info"
            r0 = -480620103(0xffffffffe35a51b9, float:-4.027279E21)
            X.3lr r0 = r7.getOptionalTreeField(r2, r3, r4, r0)     // Catch:{ DIS -> 0x0149 }
            X.C4O r0 = (X.C4O) r0     // Catch:{ DIS -> 0x0149 }
            r1.A00 = r0     // Catch:{ DIS -> 0x0149 }
            java.lang.Class<X.C4S> r3 = X.C4S.class
            r2 = 2
            java.lang.String r1 = "users"
            r0 = -333147505(0xffffffffec24928f, float:-7.9582375E26)
            com.google.common.collect.ImmutableList r0 = r7.getOptionalCompactedTreeListField(r2, r1, r3, r0)     // Catch:{ DIS -> 0x0149 }
            if (r0 != 0) goto L_0x0114
            X.0sn r0 = X.0sn.A00     // Catch:{ DIS -> 0x0149 }
        L_0x0114:
            X.62P r4 = X.AnonymousClass62Q.A00(r0)     // Catch:{ DIS -> 0x0149 }
            java.lang.Class<X.C4P> r3 = X.C4P.class
            r2 = 3
            java.lang.String r1 = "school"
            r0 = 2058406070(0x7ab0c8b6, float:4.5895757E35)
            X.3lr r0 = r7.getRequiredTreeField(r2, r1, r3, r0)     // Catch:{ DIS -> 0x0149 }
            X.C4P r0 = (X.C4P) r0     // Catch:{ DIS -> 0x0149 }
            X.JwC r1 = new X.JwC     // Catch:{ DIS -> 0x0149 }
            r1.<init>((X.C61076JwE) r5, (X.C15050ULg) r6, (X.C4P) r0, (X.AnonymousClass62P) r4)     // Catch:{ DIS -> 0x0149 }
            goto L_0x013c
        L_0x012c:
            boolean r0 = r5 instanceof X.C297815sO     // Catch:{ DIS -> 0x0149 }
            if (r0 != 0) goto L_0x0140
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ DIS -> 0x0149 }
            throw r0     // Catch:{ DIS -> 0x0149 }
        L_0x0135:
            X.62M r0 = X.AnonymousClass62M.A01     // Catch:{ DIS -> 0x0149 }
            X.JwC r1 = new X.JwC     // Catch:{ DIS -> 0x0149 }
            r1.<init>((X.C61076JwE) r13, (X.C15050ULg) r13, (X.C4P) r13, (X.AnonymousClass62P) r0)     // Catch:{ DIS -> 0x0149 }
        L_0x013c:
            X.3Ih r5 = X.C41845B3m.A0d(r1)     // Catch:{ DIS -> 0x0149 }
        L_0x0140:
            java.lang.Object r0 = X.C45161CrO.A00(r5)     // Catch:{ DIS -> 0x0149 }
            X.3Ih r1 = X.C41845B3m.A0d(r0)     // Catch:{ DIS -> 0x0149 }
            goto L_0x0155
        L_0x0149:
            r0 = move-exception
            X.5sO r1 = r0.A00
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
        L_0x0155:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x015e
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r13 = r1.A00
        L_0x015d:
            return r13
        L_0x015e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x015d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0167:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabDataSource.A00(com.instagram.schools.tab.data.SchoolTabDataSource, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.schools.tab.data.SchoolTabDataSource r5, java.lang.String r6, X.AnonymousClass4D7 r7, int r8) {
        /*
            r3 = 46
            boolean r0 = X.MEA.A03(r3, r7)
            if (r0 == 0) goto L_0x0041
            r4 = r7
            X.MEA r4 = (X.MEA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0041
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r1) goto L_0x0049
            X.0eS.A00(r0)
        L_0x0024:
            if (r0 != 0) goto L_0x002e
            java.lang.String r1 = "Failed to load data"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r1 = 0
        L_0x002e:
            X.JTj r3 = new X.JTj
            r3.<init>(r0, r1)
            return r3
        L_0x0034:
            X.0eS.A00(r0)
            r0 = 0
            r4.A00 = r1
            java.lang.Object r0 = A00(r5, r6, r0, r4, r8)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0041:
            r0 = 42
            X.MEA r4 = new X.MEA
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabDataSource.A01(com.instagram.schools.tab.data.SchoolTabDataSource, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.schools.tab.data.SchoolTabDataSource r6, java.lang.String r7, X.AnonymousClass4D7 r8, int r9) {
        /*
            r3 = 47
            boolean r0 = X.MEA.A03(r3, r8)
            if (r0 == 0) goto L_0x004d
            r5 = r8
            X.MEA r5 = (X.MEA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r3) goto L_0x0063
            X.0eS.A00(r1)
        L_0x0024:
            if (r1 == 0) goto L_0x0055
            X.JTj r4 = new X.JTj
            r4.<init>(r1, r3)
            return r4
        L_0x002c:
            X.0eS.A00(r1)
            X.C4O r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L_0x0068
            java.lang.String r2 = "end_cursor"
            java.lang.String r1 = r1.getOptionalStringField(r3, r2)
            if (r1 == 0) goto L_0x0068
            X.C4O r1 = r6.A00
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r1.getOptionalStringField(r3, r2)
        L_0x0044:
            r5.A00 = r3
            java.lang.Object r1 = A00(r6, r7, r0, r5, r9)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x004d:
            r0 = 42
            X.MEA r5 = new X.MEA
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0016
        L_0x0055:
            java.lang.String r0 = "Failed to load data"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r0 = 0
            X.JTj r4 = new X.JTj
            r4.<init>(r1, r0)
            return r4
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0068:
            java.lang.String r0 = "No next data"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r0 = 0
            X.JTj r4 = new X.JTj
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabDataSource.A02(com.instagram.schools.tab.data.SchoolTabDataSource, java.lang.String, X.4D7, int):java.lang.Object");
    }

    public SchoolTabDataSource(UserSession userSession) {
        this.A01 = userSession;
    }
}
