package X;

public final class WRH implements AnonymousClass1FD {
    public static final WRH A00 = new WRH();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ULz, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r2 = 0
            java.lang.String r0 = ""
            X.ULz r1 = new X.ULz
            r1.<init>()
            r1.A05 = r3
            r1.A08 = r3
            r1.A0X = r0
            X.C15056ULz.A01(r1)
            r1.A0E = r2
            X.C15056ULz.A00(r1)
            r1.A0e = r2
            X.C15056ULz.A02(r1)
            r1.A0F = r2
            X.16L r2 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r2 == r0) goto L_0x0031
            java.lang.String r1 = "JSON string for MediaMedium should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0031:
            X.16L r2 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r2 == r0) goto L_0x0372
            java.lang.String r2 = X.AnonymousClass7TE.A17(r5)
            if (r2 == 0) goto L_0x036d
            int r0 = r2.hashCode()
            switch(r0) {
                case -2133328134: goto L_0x035d;
                case -2015477765: goto L_0x034d;
                case -1997591781: goto L_0x033d;
                case -1720921762: goto L_0x032d;
                case -1648385670: goto L_0x0319;
                case -1519424279: goto L_0x0305;
                case -1477316012: goto L_0x02f5;
                case -1439978388: goto L_0x02e5;
                case -1221029593: goto L_0x02d5;
                case -1024402354: goto L_0x02bd;
                case -846372261: goto L_0x02ad;
                case -732008740: goto L_0x029d;
                case -722729565: goto L_0x028d;
                case -508615000: goto L_0x027d;
                case -207337714: goto L_0x0269;
                case -77151997: goto L_0x0259;
                case -40300674: goto L_0x0249;
                case 3355: goto L_0x0239;
                case 116076: goto L_0x0229;
                case 3433509: goto L_0x020f;
                case 3575610: goto L_0x01ff;
                case 55068821: goto L_0x01ef;
                case 97187254: goto L_0x01c8;
                case 113126854: goto L_0x01b8;
                case 137365935: goto L_0x01a8;
                case 283610048: goto L_0x0194;
                case 315759889: goto L_0x0184;
                case 350554534: goto L_0x0174;
                case 467635131: goto L_0x0164;
                case 486246909: goto L_0x0150;
                case 687554429: goto L_0x0140;
                case 759857048: goto L_0x0130;
                case 767106195: goto L_0x011c;
                case 826313696: goto L_0x010c;
                case 857618735: goto L_0x00fc;
                case 875082998: goto L_0x00ec;
                case 959377421: goto L_0x00dc;
                case 1209016884: goto L_0x00cc;
                case 1338308189: goto L_0x00b9;
                case 1461081577: goto L_0x00a6;
                case 1481386388: goto L_0x0097;
                case 1488689860: goto L_0x0084;
                case 1621027513: goto L_0x0071;
                case 1837164432: goto L_0x0062;
                case 1900805475: goto L_0x0053;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r2 = X.C13988Tno.A0g(r2)
            java.lang.String r0 = "MediaMediumJsonHelper"
            X.0KC.A0C(r0, r2)
        L_0x004f:
            r5.A0z()
            goto L_0x0031
        L_0x0053:
            java.lang.String r0 = "locality"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0V = r0
            goto L_0x004f
        L_0x0062:
            java.lang.String r0 = "bucket_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A02 = r0
            goto L_0x004f
        L_0x0071:
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0I = r0
            goto L_0x004f
        L_0x0084:
            r0 = 4192(0x1060, float:5.874E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A09 = r0
            goto L_0x004f
        L_0x0097:
            java.lang.String r0 = "country_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0R = r0
            goto L_0x004f
        L_0x00a6:
            r0 = 282(0x11a, float:3.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0S = r0
            goto L_0x004f
        L_0x00b9:
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0M = r0
            goto L_0x004f
        L_0x00cc:
            java.lang.String r0 = "feature_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0T = r0
            goto L_0x004f
        L_0x00dc:
            java.lang.String r0 = "is_meta_gallery"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.A0d()
            r1.A0h = r0
            goto L_0x004f
        L_0x00ec:
            java.lang.String r0 = "date_taken"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            long r2 = r5.A0y()
            r1.A0D = r2
            goto L_0x004f
        L_0x00fc:
            java.lang.String r0 = "date_added"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            long r2 = r5.A0y()
            r1.A0C = r2
            goto L_0x004f
        L_0x010c:
            java.lang.String r0 = "has_lat_lng"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.A0d()
            r1.A0f = r0
            goto L_0x004f
        L_0x011c:
            r0 = 540(0x21c, float:7.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0Q = r0
            goto L_0x004f
        L_0x0130:
            java.lang.String r0 = "thumbnail_path"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0a = r0
            goto L_0x004f
        L_0x0140:
            java.lang.String r0 = "admin_area"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0G = r0
            goto L_0x004f
        L_0x0150:
            r0 = 508(0x1fc, float:7.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0J = r0
            goto L_0x004f
        L_0x0164:
            java.lang.String r0 = "wearables_media_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0d = r0
            goto L_0x004f
        L_0x0174:
            java.lang.String r0 = "app_attribution_raw_namespace"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0K = r0
            goto L_0x004f
        L_0x0184:
            java.lang.String r0 = "is_favorite"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.A0d()
            r1.A0g = r0
            goto L_0x004f
        L_0x0194:
            r0 = 1145(0x479, float:1.604E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0O = r0
            goto L_0x004f
        L_0x01a8:
            java.lang.String r0 = "longitude"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            double r2 = r5.A0U()
            r1.A01 = r2
            goto L_0x004f
        L_0x01b8:
            java.lang.String r0 = "width"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A0B = r0
            goto L_0x004f
        L_0x01c8:
            java.lang.String r0 = "faces"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r2 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r2 != r0) goto L_0x01eb
        L_0x01dd:
            X.16L r2 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r2 == r0) goto L_0x01eb
            X.WQz r0 = X.C19240WQz.A00
            X.C13988Tno.A1I(r5, r0, r3)
            goto L_0x01dd
        L_0x01eb:
            r1.A0e = r3
            goto L_0x004f
        L_0x01ef:
            java.lang.String r0 = "duration_in_ms"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A03 = r0
            goto L_0x004f
        L_0x01ff:
            java.lang.String r0 = "type"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A08 = r0
            goto L_0x004f
        L_0x020f:
            java.lang.String r0 = "path"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.16L r2 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r2 == r0) goto L_0x004f
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x004f
            r1.A0X = r0
            goto L_0x004f
        L_0x0229:
            java.lang.String r0 = "uri"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0c = r0
            goto L_0x004f
        L_0x0239:
            java.lang.String r0 = "id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A05 = r0
            goto L_0x004f
        L_0x0249:
            java.lang.String r0 = "rotation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A07 = r0
            goto L_0x004f
        L_0x0259:
            java.lang.String r0 = "camera_position"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0P = r0
            goto L_0x004f
        L_0x0269:
            r0 = 3990(0xf96, float:5.591E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.A0d()
            r1.A0i = r0
            goto L_0x004f
        L_0x027d:
            java.lang.String r0 = "friendly_duration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0U = r0
            goto L_0x004f
        L_0x028d:
            java.lang.String r0 = "original_media_uri"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0W = r0
            goto L_0x004f
        L_0x029d:
            java.lang.String r0 = "sub_admin_area"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0Z = r0
            goto L_0x004f
        L_0x02ad:
            java.lang.String r0 = "album_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0H = r0
            goto L_0x004f
        L_0x02bd:
            r0 = 260(0x104, float:3.64E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.WR0 r0 = X.WR0.A00
            java.lang.Object r0 = X.16P.A01(r5, r0)
            X.Gms r0 = (X.C53368Gms) r0
            r1.A0E = r0
            goto L_0x004f
        L_0x02d5:
            java.lang.String r0 = "height"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A04 = r0
            goto L_0x004f
        L_0x02e5:
            java.lang.String r0 = "latitude"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            double r2 = r5.A0U()
            r1.A00 = r2
            goto L_0x004f
        L_0x02f5:
            java.lang.String r0 = "upload_media_source"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0b = r0
            goto L_0x004f
        L_0x0305:
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0N = r0
            goto L_0x004f
        L_0x0319:
            r0 = 4193(0x1061, float:5.876E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A0A = r0
            goto L_0x004f
        L_0x032d:
            java.lang.String r0 = "is_motion_photo"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r5)
            r1.A0F = r0
            goto L_0x004f
        L_0x033d:
            java.lang.String r0 = "max_sample_size"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r5.A1D()
            r1.A06 = r0
            goto L_0x004f
        L_0x034d:
            java.lang.String r0 = "ar_effect_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0L = r0
            goto L_0x004f
        L_0x035d:
            java.lang.String r0 = "source_media_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r1.A0Y = r0
            goto L_0x004f
        L_0x036d:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0372:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRH.invoke(X.16F):java.lang.Object");
    }
}
