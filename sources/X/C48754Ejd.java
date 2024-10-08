package X;

/* renamed from: X.Ejd  reason: case insensitive filesystem */
public abstract class C48754Ejd {
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.1P0 r17, com.instagram.common.session.UserSession r18, X.AnonymousClass4D6 r19, com.instagram.model.business.BusinessInfo r20) {
        /*
            r7 = r18
            r5 = r20
            X.AnonymousClass7TG.A1O(r7, r5)
            r2 = 0
            com.instagram.model.business.PublicPhoneContact r0 = r5.A01     // Catch:{ IOException -> 0x00ca }
            if (r0 == 0) goto L_0x0011
            java.lang.String r6 = X.C48992EnU.A00(r0)     // Catch:{ IOException -> 0x00ca }
            goto L_0x0012
        L_0x0011:
            r6 = r2
        L_0x0012:
            com.instagram.model.business.Address r0 = r5.A00     // Catch:{ IOException -> 0x00c8 }
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = X.C48990EnS.A00(r0)     // Catch:{ IOException -> 0x00c8 }
            goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            java.util.List r9 = r5.A0M     // Catch:{ IOException -> 0x00cc }
            if (r9 == 0) goto L_0x00d3
            java.io.StringWriter r8 = new java.io.StringWriter     // Catch:{ IOException -> 0x00bd }
            r8.<init>()     // Catch:{ IOException -> 0x00bd }
            X.15p r4 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x00bd }
            X.17W r1 = r4.A0A(r8)     // Catch:{ IOException -> 0x00bd }
            r1.A0b()     // Catch:{ IOException -> 0x00bd }
            java.util.Iterator r16 = r9.iterator()     // Catch:{ IOException -> 0x00bd }
            r10 = 0
        L_0x0033:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x00bd }
            if (r0 == 0) goto L_0x00b2
            int r15 = r10 + 1
            java.lang.Object r11 = r16.next()     // Catch:{ IOException -> 0x00bd }
            com.instagram.model.business.ProfileAddressData r11 = (com.instagram.model.business.ProfileAddressData) r11     // Catch:{ IOException -> 0x00bd }
            java.io.StringWriter r13 = new java.io.StringWriter     // Catch:{ IOException -> 0x00bd }
            r13.<init>()     // Catch:{ IOException -> 0x00bd }
            X.17W r12 = r4.A0A(r13)     // Catch:{ IOException -> 0x00bd }
            r12.A0c()     // Catch:{ IOException -> 0x00bd }
            java.lang.String r14 = r11.A02     // Catch:{ IOException -> 0x00bd }
            if (r14 == 0) goto L_0x005a
            r0 = 1079(0x437, float:1.512E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00bd }
            r12.A0R(r0, r14)     // Catch:{ IOException -> 0x00bd }
        L_0x005a:
            java.lang.String r14 = r11.A03     // Catch:{ IOException -> 0x00bd }
            if (r14 == 0) goto L_0x0063
            java.lang.String r0 = "address_street"
            r12.A0R(r0, r14)     // Catch:{ IOException -> 0x00bd }
        L_0x0063:
            java.lang.String r14 = r11.A04     // Catch:{ IOException -> 0x00bd }
            if (r14 == 0) goto L_0x006c
            java.lang.String r0 = "city_id"
            r12.A0R(r0, r14)     // Catch:{ IOException -> 0x00bd }
        L_0x006c:
            java.lang.String r14 = r11.A05     // Catch:{ IOException -> 0x00bd }
            if (r14 == 0) goto L_0x0079
            r0 = 2786(0xae2, float:3.904E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00bd }
            r12.A0R(r0, r14)     // Catch:{ IOException -> 0x00bd }
        L_0x0079:
            java.lang.String r14 = r11.A08     // Catch:{ IOException -> 0x00bd }
            if (r14 == 0) goto L_0x0082
            java.lang.String r0 = "zip"
            r12.A0R(r0, r14)     // Catch:{ IOException -> 0x00bd }
        L_0x0082:
            java.lang.Float r0 = r11.A00     // Catch:{ IOException -> 0x00bd }
            if (r0 == 0) goto L_0x008f
            float r14 = r0.floatValue()     // Catch:{ IOException -> 0x00bd }
            java.lang.String r0 = "latitude"
            r12.A0O(r0, r14)     // Catch:{ IOException -> 0x00bd }
        L_0x008f:
            java.lang.Float r0 = r11.A01     // Catch:{ IOException -> 0x00bd }
            if (r0 == 0) goto L_0x009c
            float r11 = r0.floatValue()     // Catch:{ IOException -> 0x00bd }
            java.lang.String r0 = "longitude"
            r12.A0O(r0, r11)     // Catch:{ IOException -> 0x00bd }
        L_0x009c:
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r12, r13)     // Catch:{ IOException -> 0x00bd }
            r1.A0s(r0)     // Catch:{ IOException -> 0x00bd }
            int r0 = r9.size()     // Catch:{ IOException -> 0x00bd }
            int r0 = r0 + -1
            if (r10 >= r0) goto L_0x00b0
            java.lang.String r0 = ","
            r1.A0s(r0)     // Catch:{ IOException -> 0x00bd }
        L_0x00b0:
            r10 = r15
            goto L_0x0033
        L_0x00b2:
            r1.A0Y()     // Catch:{ IOException -> 0x00bd }
            r1.close()     // Catch:{ IOException -> 0x00bd }
            java.lang.String r2 = X.DbT.A10(r8)     // Catch:{ IOException -> 0x00bd }
            goto L_0x00d3
        L_0x00bd:
            r4 = move-exception
            java.lang.String r1 = "ProfileAddressData"
            java.lang.String r0 = "Error serializing list of address data to Json format"
            X.0KC.A0F(r1, r0, r4)     // Catch:{ IOException -> 0x00cc }
            java.lang.String r2 = "[]"
            goto L_0x00d3
        L_0x00c8:
            r3 = r2
            goto L_0x00cc
        L_0x00ca:
            r6 = r2
            r3 = r2
        L_0x00cc:
            java.lang.String r1 = "EditProfessionalAccountContact"
            java.lang.String r0 = "Couldn't serialize edit business parameters"
            X.0wb.A03(r1, r0)
        L_0x00d3:
            X.1NY r4 = X.AnonymousClass7TG.A0a(r7)
            java.lang.String r0 = "accounts/update_business_info/"
            r4.A0A(r0)
            java.lang.Class<X.92k> r1 = X.C3727892k.class
            java.lang.Class<X.92l> r0 = X.C3727992l.class
            X.DbV.A1N(r4, r1, r0)
            java.lang.String r1 = r5.A0B
            java.lang.String r0 = "public_email"
            r4.A9m(r0, r1)
            java.lang.String r0 = "public_phone_contact"
            r4.A9m(r0, r6)
            java.lang.String r0 = "business_address"
            r4.A9m(r0, r3)
            r0 = 4434(0x1152, float:6.213E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A9m(r0, r2)
            boolean r0 = r5.A0S
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            r1 = r2
            if (r0 == 0) goto L_0x0107
            r1 = r3
        L_0x0107:
            java.lang.String r0 = "should_show_public_contacts"
            r4.A9m(r0, r1)
            java.lang.String r1 = r5.A0J
            java.lang.String r0 = "page_id"
            r4.A9m(r0, r1)
            boolean r0 = r5.A0P
            r1 = r2
            if (r0 == 0) goto L_0x0119
            r1 = r3
        L_0x0119:
            java.lang.String r0 = "is_profile_audio_call_enabled"
            r4.A9m(r0, r1)
            boolean r0 = r5.A0N
            if (r0 != 0) goto L_0x0123
            r3 = r2
        L_0x0123:
            r0 = 3420(0xd5c, float:4.792E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A9m(r0, r3)
            r0 = r19
            r1 = r17
            X.DbW.A1E(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48754Ejd.A00(X.1P0, com.instagram.common.session.UserSession, X.4D6, com.instagram.model.business.BusinessInfo):void");
    }
}
