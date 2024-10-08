package X;

public final class Y03 implements AnonymousClass1FD {
    public static final Y03 A00 = new Y03();

    /* JADX WARNING: type inference failed for: r2v0, types: [X.XMC, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 0
            X.XMC r2 = new X.XMC
            r2.<init>()
            r2.A0E = r0
            r2.A0F = r0
            r2.A0G = r0
            r2.A04 = r0
            r2.A05 = r0
            r2.A06 = r0
            r2.A0A = r0
            r2.A0H = r0
            r2.A0I = r0
            r2.A0B = r0
            r2.A0C = r0
            r2.A0J = r0
            r2.A00 = r0
            r2.A01 = r0
            r2.A02 = r0
            r2.A03 = r0
            r2.A07 = r0
            r2.A0K = r0
            r2.A0D = r0
            r2.A0L = r0
            r2.A0M = r0
            r2.A08 = r0
            r2.A09 = r0
            r2.A0N = r0
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0049
            java.lang.String r0 = "JSON string for MediaLocation should start with a left brace"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0049:
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0216
            java.lang.String r1 = X.16P.A02(r6)
            if (r1 == 0) goto L_0x020b
            int r0 = r1.hashCode()
            switch(r0) {
                case -2076227591: goto L_0x01fb;
                case -1650699556: goto L_0x01eb;
                case -1573145462: goto L_0x01db;
                case -1376148536: goto L_0x01c7;
                case -1153075697: goto L_0x01b3;
                case -1147692044: goto L_0x01a3;
                case -971305057: goto L_0x018f;
                case -907032317: goto L_0x017f;
                case 3579: goto L_0x016b;
                case 106911: goto L_0x0156;
                case 107301: goto L_0x0141;
                case 3053931: goto L_0x0131;
                case 3373707: goto L_0x0121;
                case 50511102: goto L_0x0111;
                case 302331970: goto L_0x0101;
                case 384633781: goto L_0x00ed;
                case 575682319: goto L_0x00de;
                case 669651456: goto L_0x00cb;
                case 1008566606: goto L_0x00bc;
                case 1241239627: goto L_0x00ad;
                case 1369680106: goto L_0x009e;
                case 1565793390: goto L_0x008f;
                case 1725551537: goto L_0x0080;
                case 1782139044: goto L_0x0071;
                default: goto L_0x005e;
            }
        L_0x005e:
            r0 = 4409(0x1139, float:6.178E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "MediaLocationJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x006d:
            r6.A0z()
            goto L_0x0049
        L_0x0071:
            java.lang.String r0 = "profile_pic_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0L = r0
            goto L_0x006d
        L_0x0080:
            java.lang.String r0 = "end_time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r6)
            r2.A05 = r0
            goto L_0x006d
        L_0x008f:
            java.lang.String r0 = "short_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0M = r0
            goto L_0x006d
        L_0x009e:
            java.lang.String r0 = "created_at"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r6)
            r2.A04 = r0
            goto L_0x006d
        L_0x00ad:
            java.lang.String r0 = "external_id_source"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0H = r0
            goto L_0x006d
        L_0x00bc:
            java.lang.String r0 = "minimum_age"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r6)
            r2.A07 = r0
            goto L_0x006d
        L_0x00cb:
            java.lang.String r0 = "is_eligible_for_guides"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            goto L_0x006d
        L_0x00de:
            java.lang.String r0 = "external_source"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0I = r0
            goto L_0x006d
        L_0x00ed:
            java.lang.String r0 = "facebook_places_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            long r0 = r6.A0y()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            goto L_0x006d
        L_0x0101:
            java.lang.String r0 = "foursquare_v2_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0J = r0
            goto L_0x006d
        L_0x0111:
            java.lang.String r0 = "category"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0F = r0
            goto L_0x006d
        L_0x0121:
            java.lang.String r0 = "name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0K = r0
            goto L_0x006d
        L_0x0131:
            java.lang.String r0 = "city"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0G = r0
            goto L_0x006d
        L_0x0141:
            java.lang.String r0 = "lng"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            double r3 = r6.A0U()
            float r0 = (float) r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.A03 = r0
            goto L_0x006d
        L_0x0156:
            java.lang.String r0 = "lat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            double r3 = r6.A0U()
            float r0 = (float) r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.A02 = r0
            goto L_0x006d
        L_0x016b:
            java.lang.String r0 = "pk"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            long r0 = r6.A0y()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            goto L_0x006d
        L_0x017f:
            java.lang.String r0 = "event_category"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r6)
            r2.A06 = r0
            goto L_0x006d
        L_0x018f:
            java.lang.String r0 = "has_viewer_saved"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            goto L_0x006d
        L_0x01a3:
            java.lang.String r0 = "address"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0E = r0
            goto L_0x006d
        L_0x01b3:
            java.lang.String r0 = "external_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            long r0 = r6.A0y()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0A = r0
            goto L_0x006d
        L_0x01c7:
            java.lang.String r0 = "facebook_events_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            long r0 = r6.A0y()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            goto L_0x006d
        L_0x01db:
            java.lang.String r0 = "start_time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r6)
            r2.A08 = r0
            goto L_0x006d
        L_0x01eb:
            java.lang.String r0 = "time_granularity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r6)
            r2.A09 = r0
            goto L_0x006d
        L_0x01fb:
            java.lang.String r0 = "timezone"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r2.A0N = r0
            goto L_0x006d
        L_0x020b:
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0216:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y03.invoke(X.16F):java.lang.Object");
    }
}
