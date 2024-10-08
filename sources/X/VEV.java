package X;

public abstract class VEV {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse} */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.VSp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v2, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C15260UXv A00(X.AnonymousClass3JD r13, java.lang.String r14) {
        /*
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r13, r14)
            X.3lr r5 = X.C41845B3m.A0U(r13)
            if (r5 == 0) goto L_0x0265
            java.lang.Class<X.UQm> r2 = X.C15123UQm.class
            java.lang.String r1 = "xfb_one_link_logged_out_page_info_monoschema(input:$input)"
            r0 = 1476144464(0x57fc2d50, float:5.54543092E14)
            X.3lr r13 = r5.getOptionalTreeField(r4, r1, r2, r0)
            if (r13 == 0) goto L_0x0265
            r10 = 0
            java.lang.Class<X.UQj> r5 = X.C15120UQj.class
            r2 = 10
            java.lang.String r1 = "hours"
            r0 = 866919609(0x33ac24b9, float:8.016054E-8)
            X.3lr r8 = r13.getOptionalTreeField(r2, r1, r5, r0)
            if (r8 == 0) goto L_0x0033
            java.lang.Class<X.UQi> r2 = X.C15119UQi.class
            java.lang.String r1 = "schedule"
            r0 = 266670642(0xfe51232, float:2.2588152E-29)
            X.3lr r10 = r8.A04(r2, r1, r0)
        L_0x0033:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r10 == 0) goto L_0x0069
            r9 = 0
            java.lang.String r6 = "days_in_a_week"
            com.google.common.collect.ImmutableList r0 = r10.getRequiredCompactedStringListField(r4, r6)
            int r5 = r0.size()
        L_0x0045:
            if (r9 >= r5) goto L_0x0069
            com.google.common.collect.ImmutableList r0 = r10.getRequiredCompactedStringListField(r4, r6)
            java.lang.Object r2 = r0.get(r9)
            X.0qQ.A07(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "hours_in_a_day"
            com.google.common.collect.ImmutableList r1 = r10.getRequiredCompactedStringListField(r3, r0)
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour r0 = new com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r7.add(r0)
            int r9 = r9 + 1
            goto L_0x0045
        L_0x0069:
            if (r8 == 0) goto L_0x025e
            java.lang.String r0 = "status"
            java.lang.String r6 = r8.A0B(r0)
            java.lang.String r1 = ""
            if (r6 != 0) goto L_0x0076
            r6 = r1
        L_0x0076:
            java.lang.String r0 = "current_status"
            java.lang.String r5 = r8.getOptionalStringField(r4, r0)
            if (r5 != 0) goto L_0x007f
            r5 = r1
        L_0x007f:
            java.lang.String r0 = "hours_today"
            java.lang.String r2 = r8.getOptionalStringField(r3, r0)
            if (r2 != 0) goto L_0x0088
            r2 = r1
        L_0x0088:
            r1 = 3
            java.lang.String r0 = "is_open"
            boolean r0 = r8.getCoercedBooleanField(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r11 = new com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse
            r11.<init>()
            r11.A03 = r6
            r11.A04 = r7
            r11.A01 = r5
            r11.A02 = r2
            r11.A00 = r0
        L_0x00a2:
            java.lang.Class<X.UQk> r2 = X.C15121UQk.class
            r7 = 16
            java.lang.String r1 = "ig_business"
            r0 = 923728526(0x370efa8e, float:8.522196E-6)
            X.3lr r5 = r13.getOptionalTreeField(r7, r1, r2, r0)
            if (r5 == 0) goto L_0x025b
            java.lang.Class<X.Bpt> r2 = X.C43003Bpt.class
            java.lang.String r1 = "profile"
            r0 = 731783318(0x2b9e2096, float:1.123562E-12)
            X.3lr r5 = r5.getOptionalTreeField(r4, r1, r2, r0)
        L_0x00bc:
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r1 = "location_id"
            java.lang.String r0 = r13.A0C(r1)
            com.instagram.user.model.User r10 = new com.instagram.user.model.User
            r10.<init>(r14, r0)
            if (r5 == 0) goto L_0x01e3
            java.lang.String r0 = "pk"
            java.lang.String r2 = r5.getOptionalStringField(r4, r0)
            r6 = 18
            r0 = 8
            java.lang.String r0 = X.C66654MaN.A01(r6, r0, r7)
            java.lang.String r0 = r5.getOptionalStringField(r3, r0)
            com.instagram.user.model.User r10 = new com.instagram.user.model.User
            r10.<init>(r2, r0)
            java.lang.String r0 = "full_name"
            java.lang.String r0 = r5.A09(r0)
            r10.A0t(r0)
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r5.A0B(r0)
            r10.A0u(r0)
            r2 = 5
            java.lang.String r0 = "is_verified"
            boolean r0 = r5.getCoercedBooleanField(r2, r0)
            r10.A1F(r0)
            r2 = 6
            r0 = 4811(0x12cb, float:6.742E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getCoercedBooleanField(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.4Cl r0 = r10.A03
            r0.EXv(r2)
            r2 = 7
            r0 = 4435(0x1153, float:6.215E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x0124
            X.4Cl r0 = r10.A03
            r0.EO1(r2)
        L_0x0124:
            r2 = 9
            java.lang.String r0 = "category"
            java.lang.String r2 = r5.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x0133
            X.4Cl r0 = r10.A03
            r0.ERG(r2)
        L_0x0133:
            r2 = 11
            r0 = 2786(0xae2, float:3.904E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x0146
            X.4Cl r0 = r10.A03
            r0.ERW(r2)
        L_0x0146:
            r2 = 13
            r0 = 3420(0xd5c, float:4.792E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getCoercedBooleanField(r2, r0)
            X.4Cl r2 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.EQH(r0)
            r2 = 15
            r0 = 5153(0x1421, float:7.221E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x016e
            X.4Cl r0 = r10.A03
            r0.EhP(r2)
        L_0x016e:
            r0 = 3817(0xee9, float:5.349E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getOptionalStringField(r7, r0)
            if (r2 == 0) goto L_0x017f
            X.4Cl r0 = r10.A03
            r0.EhR(r2)
        L_0x017f:
            r2 = 17
            r0 = 3818(0xeea, float:5.35E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x0192
            X.4Cl r0 = r10.A03
            r0.EhS(r2)
        L_0x0192:
            java.lang.String r0 = "zip"
            java.lang.String r2 = r5.getOptionalStringField(r6, r0)
            if (r2 == 0) goto L_0x019f
            X.4Cl r0 = r10.A03
            r0.Er7(r2)
        L_0x019f:
            r2 = 19
            r0 = 1497(0x5d9, float:2.098E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getCoercedBooleanField(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.4Cl r0 = r10.A03
            r0.EQB(r2)
            X.16V r0 = X.16V.A05
            r10.A0o(r0)
            r2 = 22
            r0 = 5241(0x1479, float:7.344E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getCoercedBooleanField(r2, r0)
            X.4Cl r2 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.Ekg(r0)
            r2 = 23
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getCoercedBooleanField(r2, r0)
            X.4Cl r2 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.Eko(r0)
        L_0x01e3:
            java.lang.String r0 = "name"
            java.lang.String r12 = r13.getOptionalStringField(r4, r0)
            java.lang.String r14 = ""
            if (r12 != 0) goto L_0x01ee
            r12 = r14
        L_0x01ee:
            java.lang.String r0 = "phone"
            java.lang.String r9 = r13.getOptionalStringField(r3, r0)
            java.lang.String r0 = "website"
            java.lang.String r8 = r13.A09(r0)
            java.lang.String r0 = "category"
            java.lang.String r7 = r13.A0A(r0)
            r2 = 6
            java.lang.String r0 = "location_address"
            java.lang.String r6 = r13.getOptionalStringField(r2, r0)
            if (r6 != 0) goto L_0x020a
            r6 = r14
        L_0x020a:
            r2 = 7
            java.lang.String r0 = "location_city"
            java.lang.String r5 = r13.getOptionalStringField(r2, r0)
            r2 = 8
            java.lang.String r0 = "location_region"
            java.lang.Integer r4 = X.C41846B3n.A0g(r13, r0, r2)
            r2 = 9
            java.lang.String r0 = "location_zip"
            java.lang.String r3 = r13.getOptionalStringField(r2, r0)
            if (r3 != 0) goto L_0x0224
            r3 = r14
        L_0x0224:
            java.lang.String r0 = "has_menu"
            boolean r2 = r13.hasFieldValue(r0)
            r0 = 5
            r13.getOptionalStringField(r0, r1)
            r1 = 13
            java.lang.String r0 = "num_guides"
            java.lang.Integer r1 = X.C41846B3n.A0g(r13, r0, r1)
            X.UXv r13 = new X.UXv
            r13.<init>()
            r13.A08 = r12
            r13.A09 = r9
            r13.A0A = r8
            r13.A06 = r7
            r13.A05 = r6
            r13.A07 = r5
            r13.A04 = r4
            r13.A0B = r3
            X.VSp r0 = new X.VSp
            r0.<init>()
            r13.A00 = r0
            r0.A01 = r10
            r13.A01 = r11
            r13.A0C = r2
            r13.A02 = r1
            return r13
        L_0x025b:
            r5 = 0
            goto L_0x00bc
        L_0x025e:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r11 = new com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse
            r11.<init>()
            goto L_0x00a2
        L_0x0265:
            X.UXv r13 = new X.UXv
            r13.<init>()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VEV.A00(X.3JD, java.lang.String):X.UXv");
    }
}
