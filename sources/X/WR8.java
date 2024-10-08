package X;

public final class WR8 implements AnonymousClass1FD {
    public static final WR8 A00 = new WR8();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.UKx, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 0
            X.UKx r1 = new X.UKx
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r0
            r1.A07 = r0
            r1.A08 = r0
            r1.A0A = r0
            r1.A02 = r0
            r1.A0B = r0
            r1.A03 = r0
            r1.A04 = r0
            r1.A09 = r0
            r1.A0C = r0
            r1.A05 = r0
            r1.A0D = r0
            r1.A0E = r0
            r1.A0F = r0
            r1.A06 = r0
            X.16L r2 = r4.A11()
            X.16L r0 = X.16L.A0D
            if (r2 == r0) goto L_0x003a
            java.lang.String r1 = "JSON string for MediaHashtag should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            X.16L r2 = r4.A1J()
            X.16L r0 = X.16L.A09
            if (r2 == r0) goto L_0x0159
            java.lang.String r2 = X.AnonymousClass7TE.A17(r4)
            if (r2 == 0) goto L_0x0154
            int r0 = r2.hashCode()
            switch(r0) {
                case -1948154558: goto L_0x0144;
                case -1548880689: goto L_0x0134;
                case -875391281: goto L_0x0124;
                case -9393932: goto L_0x0114;
                case 3355: goto L_0x0104;
                case 3373707: goto L_0x00f4;
                case 118114326: goto L_0x00e4;
                case 342632973: goto L_0x00d4;
                case 348451171: goto L_0x00c5;
                case 765915793: goto L_0x00b6;
                case 1013486691: goto L_0x00a7;
                case 1028143168: goto L_0x0098;
                case 1446562075: goto L_0x0089;
                case 1544060401: goto L_0x007a;
                case 1767727834: goto L_0x006b;
                case 1782139044: goto L_0x005c;
                default: goto L_0x004f;
            }
        L_0x004f:
            java.lang.String r2 = X.C13988Tno.A0g(r2)
            java.lang.String r0 = "MediaHashtagJsonHelper"
            X.0KC.A0C(r0, r2)
        L_0x0058:
            r4.A0z()
            goto L_0x003a
        L_0x005c:
            java.lang.String r0 = "profile_pic_url"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A0D = r0
            goto L_0x0058
        L_0x006b:
            java.lang.String r0 = "hide_use_hashtag_button"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A02 = r0
            goto L_0x0058
        L_0x007a:
            java.lang.String r0 = "formatted_media_count"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A0A = r0
            goto L_0x0058
        L_0x0089:
            java.lang.String r0 = "allow_following"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A00 = r0
            goto L_0x0058
        L_0x0098:
            java.lang.String r0 = "follow_status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r4)
            r1.A07 = r0
            goto L_0x0058
        L_0x00a7:
            java.lang.String r0 = "is_eligible_for_survey"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A03 = r0
            goto L_0x0058
        L_0x00b6:
            java.lang.String r0 = "following"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r4)
            r1.A08 = r0
            goto L_0x0058
        L_0x00c5:
            java.lang.String r0 = "search_result_subtitle"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A0E = r0
            goto L_0x0058
        L_0x00d4:
            java.lang.String r0 = "non_violating"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A05 = r0
            goto L_0x0058
        L_0x00e4:
            java.lang.String r0 = "is_local"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A04 = r0
            goto L_0x0058
        L_0x00f4:
            java.lang.String r0 = "name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A0C = r0
            goto L_0x0058
        L_0x0104:
            java.lang.String r0 = "id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A0B = r0
            goto L_0x0058
        L_0x0114:
            java.lang.String r0 = "media_count"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r4)
            r1.A09 = r0
            goto L_0x0058
        L_0x0124:
            java.lang.String r0 = "use_default_avatar"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A06 = r0
            goto L_0x0058
        L_0x0134:
            java.lang.String r0 = "search_subtitle"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A0F = r0
            goto L_0x0058
        L_0x0144:
            java.lang.String r0 = "allow_muting_story"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A01 = r0
            goto L_0x0058
        L_0x0154:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR8.invoke(X.16F):java.lang.Object");
    }
}
