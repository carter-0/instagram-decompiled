package com.instagram.schools.management.data;

import com.instagram.common.session.UserSession;

public final class SchoolSettingsDataSource {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v2, types: [X.Gm0] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071 A[Catch:{ DIS -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0183 A[Catch:{ DIS -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.schools.management.data.SchoolSettingsDataSource r20, X.AnonymousClass4D7 r21) {
        /*
            r5 = 42
            r6 = r21
            boolean r0 = X.C66138MDq.A02(r5, r6)
            r4 = r20
            if (r0 == 0) goto L_0x0067
            r3 = r6
            X.MDq r3 = (X.C66138MDq) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r2 = r3.A00
            r0 = 1
            if (r2 == 0) goto L_0x002c
            if (r2 != r0) goto L_0x01b7
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            r1 = 0
            goto L_0x006d
        L_0x002c:
            X.0eS.A00(r5)
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r2.getParamsCopy()
            java.lang.Class<com.instagram.schools.management.data.SchoolSettingsResponseImpl> r10 = com.instagram.schools.management.data.SchoolSettingsResponseImpl.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "SchoolSettings"
            r11 = 0
            r12 = 0
            java.lang.String r15 = "xdt_school_settings"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r2 = r4.A00
            X.1vn r2 = X.1vm.A01(r2)
            r3.A01 = r4
            r3.A00 = r0
            java.lang.Object r5 = r2.A04(r5, r3)
            if (r5 != r1) goto L_0x0028
            return r1
        L_0x0067:
            X.MDq r3 = new X.MDq
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x006d:
            boolean r2 = r5 instanceof X.C239793Ih     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0183
            X.3lr r5 = X.C41846B3n.A0R(r5)     // Catch:{ DIS -> 0x0199 }
            r17 = 0
            if (r5 == 0) goto L_0x018c
            java.lang.Class<com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings> r4 = com.instagram.schools.management.data.SchoolSettingsResponseImpl.XdtSchoolSettings.class
            X.3sh r2 = X.C250663lr.Companion     // Catch:{ DIS -> 0x0199 }
            r3 = -152575241(0xfffffffff6e7e2f7, float:-2.3516093E33)
            r7 = 0
            java.lang.String r2 = "xdt_school_settings"
            X.3lr r4 = r5.getOptionalTreeField(r7, r2, r4, r3)     // Catch:{ DIS -> 0x0199 }
            com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings r4 = (com.instagram.schools.management.data.SchoolSettingsResponseImpl.XdtSchoolSettings) r4     // Catch:{ DIS -> 0x0199 }
            if (r4 == 0) goto L_0x018c
            com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings$School r3 = r4.A0E()     // Catch:{ DIS -> 0x0199 }
            java.lang.String r2 = "city"
            java.lang.String r6 = r3.getOptionalStringField(r0, r2)     // Catch:{ DIS -> 0x0199 }
            java.lang.String r11 = ""
            if (r6 != 0) goto L_0x009a
            r6 = r11
        L_0x009a:
            com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings$School r3 = r4.A0E()     // Catch:{ DIS -> 0x0199 }
            java.lang.String r2 = "state"
            java.lang.String r5 = r3.A09(r2)     // Catch:{ DIS -> 0x0199 }
            if (r5 != 0) goto L_0x00a7
            r5 = r11
        L_0x00a7:
            com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings$School r3 = r4.A0E()     // Catch:{ DIS -> 0x0199 }
            java.lang.String r2 = "county"
            java.lang.String r2 = r3.A0A(r2)     // Catch:{ DIS -> 0x0199 }
            if (r2 != 0) goto L_0x00b4
            r2 = r11
        L_0x00b4:
            com.instagram.schools.management.data.SchoolAddress r12 = new com.instagram.schools.management.data.SchoolAddress     // Catch:{ DIS -> 0x0199 }
            r12.<init>(r6, r5, r2)     // Catch:{ DIS -> 0x0199 }
            java.lang.Class<com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings$BadgeVisibilityMenuItems> r6 = com.instagram.schools.management.data.SchoolSettingsResponseImpl.XdtSchoolSettings.BadgeVisibilityMenuItems.class
            r5 = -1240993684(0xffffffffb607f06c, float:-2.0256512E-6)
            r3 = 8
            java.lang.String r2 = "badge_visibility_menu_items"
            com.google.common.collect.ImmutableList r2 = r4.getOptionalCompactedTreeListField(r3, r2, r6, r5)     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0107
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ DIS -> 0x0199 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ DIS -> 0x0199 }
        L_0x00d0:
            boolean r2 = r10.hasNext()     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0108
            X.3lr r5 = X.C41845B3m.A0V(r10)     // Catch:{ DIS -> 0x0199 }
            X.Uya r9 = X.C16638Uya.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ DIS -> 0x0199 }
            java.lang.String r2 = "setting"
            java.lang.Enum r8 = r5.getOptionalEnumField(r7, r2, r9)     // Catch:{ DIS -> 0x0199 }
            X.Uya r8 = (X.C16638Uya) r8     // Catch:{ DIS -> 0x0199 }
            if (r8 == 0) goto L_0x00d0
            java.lang.String r2 = "description"
            java.lang.String r6 = r5.getOptionalStringField(r0, r2)     // Catch:{ DIS -> 0x0199 }
            if (r6 != 0) goto L_0x00ef
            r6 = r11
        L_0x00ef:
            r5 = 7
            r2 = 1129(0x469, float:1.582E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ DIS -> 0x0199 }
            java.lang.Enum r2 = r4.getOptionalEnumField(r5, r2, r9)     // Catch:{ DIS -> 0x0199 }
            r5 = 0
            if (r8 != r2) goto L_0x00fe
            r5 = 1
        L_0x00fe:
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r2 = new com.instagram.schools.management.data.BadgeVisibilitySettingItem     // Catch:{ DIS -> 0x0199 }
            r2.<init>(r8, r6, r5)     // Catch:{ DIS -> 0x0199 }
            r3.add(r2)     // Catch:{ DIS -> 0x0199 }
            goto L_0x00d0
        L_0x0107:
            r3 = r1
        L_0x0108:
            com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings$School r5 = r4.A0E()     // Catch:{ DIS -> 0x0199 }
            java.lang.String r2 = "name"
            java.lang.String r13 = r5.getOptionalStringField(r7, r2)     // Catch:{ DIS -> 0x0199 }
            if (r13 != 0) goto L_0x0115
            r13 = r11
        L_0x0115:
            java.lang.String r2 = "selected_grad_month"
            java.lang.String r2 = r4.A0B(r2)     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0159
            java.lang.Integer r2 = X.00y.A0l(r2)     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0159
            int r18 = r2.intValue()     // Catch:{ DIS -> 0x0199 }
        L_0x0127:
            java.lang.String r2 = "selected_grad_year"
            java.lang.String r2 = r4.A0C(r2)     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0156
            java.lang.Integer r2 = X.00y.A0l(r2)     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0156
            int r19 = r2.intValue()     // Catch:{ DIS -> 0x0199 }
        L_0x0139:
            com.instagram.schools.management.data.SchoolSettingsResponseImpl$XdtSchoolSettings$School r6 = r4.A0E()     // Catch:{ DIS -> 0x0199 }
            r5 = 4
            java.lang.String r2 = "badge_names"
            com.google.common.collect.ImmutableList r2 = r6.getOptionalCompactedStringListField(r5, r2)     // Catch:{ DIS -> 0x0199 }
            if (r2 == 0) goto L_0x0153
            X.62P r16 = X.AnonymousClass62Q.A00(r2)     // Catch:{ DIS -> 0x0199 }
        L_0x014a:
            java.lang.String r2 = "saved_name_for_badge"
            java.lang.String r14 = r4.getOptionalStringField(r0, r2)     // Catch:{ DIS -> 0x0199 }
            if (r14 != 0) goto L_0x015d
            goto L_0x015c
        L_0x0153:
            r16 = r1
            goto L_0x014a
        L_0x0156:
            r19 = 0
            goto L_0x0139
        L_0x0159:
            r18 = 0
            goto L_0x0127
        L_0x015c:
            r14 = r11
        L_0x015d:
            r2 = 3
            java.lang.String r0 = "can_update_grad_year"
            boolean r21 = r4.getCoercedBooleanField(r2, r0)     // Catch:{ DIS -> 0x0199 }
            r2 = 2
            java.lang.String r0 = "can_update_school"
            boolean r20 = r4.getCoercedBooleanField(r2, r0)     // Catch:{ DIS -> 0x0199 }
            r2 = 6
            java.lang.String r0 = "learn_more_url"
            java.lang.String r15 = r4.getOptionalStringField(r2, r0)     // Catch:{ DIS -> 0x0199 }
            if (r15 != 0) goto L_0x0175
            r15 = r11
        L_0x0175:
            if (r3 == 0) goto L_0x017b
            X.62P r17 = X.AnonymousClass62Q.A00(r3)     // Catch:{ DIS -> 0x0199 }
        L_0x017b:
            X.Gm0 r11 = new X.Gm0     // Catch:{ DIS -> 0x0199 }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ DIS -> 0x0199 }
            r17 = r11
            goto L_0x018c
        L_0x0183:
            boolean r0 = r5 instanceof X.C297815sO     // Catch:{ DIS -> 0x0199 }
            if (r0 != 0) goto L_0x0190
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ DIS -> 0x0199 }
            throw r0     // Catch:{ DIS -> 0x0199 }
        L_0x018c:
            X.3Ih r5 = X.C41845B3m.A0d(r17)     // Catch:{ DIS -> 0x0199 }
        L_0x0190:
            java.lang.Object r0 = X.C45161CrO.A00(r5)     // Catch:{ DIS -> 0x0199 }
            X.3Ih r2 = X.C41845B3m.A0d(r0)     // Catch:{ DIS -> 0x0199 }
            goto L_0x01a5
        L_0x0199:
            r0 = move-exception
            X.5sO r2 = r0.A00
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
        L_0x01a5:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01ae
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
        L_0x01ad:
            return r1
        L_0x01ae:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01ad
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.management.data.SchoolSettingsDataSource.A00(com.instagram.schools.management.data.SchoolSettingsDataSource, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 45
            boolean r0 = X.MEA.A03(r3, r6)
            if (r0 == 0) goto L_0x0038
            r4 = r6
            X.MEA r4 = (X.MEA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r0 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x002c
            if (r2 != r1) goto L_0x004e
            X.0eS.A00(r3)
        L_0x0024:
            if (r3 == 0) goto L_0x0040
            X.JTj r0 = new X.JTj
            r0.<init>(r3, r1)
            return r0
        L_0x002c:
            X.0eS.A00(r3)
            r4.A00 = r1
            java.lang.Object r3 = A00(r5, r4)
            if (r3 != r0) goto L_0x0024
            return r0
        L_0x0038:
            r0 = 42
            X.MEA r4 = new X.MEA
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "Failed to load data"
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r0)
            r1 = 0
            X.JTj r0 = new X.JTj
            r0.<init>(r2, r1)
            return r0
        L_0x004e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.management.data.SchoolSettingsDataSource.A01(X.4D7):java.lang.Object");
    }

    public SchoolSettingsDataSource(UserSession userSession) {
        this.A00 = userSession;
    }
}
