package X;

/* renamed from: X.End  reason: case insensitive filesystem */
public abstract class C49001End {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Date] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:71|(3:73|74|75)|76|77|178) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x016a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.F1D parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.F1D r1 = new X.F1D     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.<init>()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r2 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0343
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r2 == r0) goto L_0x0344
            java.lang.String r2 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            java.lang.String r0 = "pk"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r3 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0G = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
        L_0x0031:
            r5.A0z()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0016
        L_0x0035:
            java.lang.String r0 = X.Dbj.A03()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0O = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0046:
            java.lang.String r0 = "trusted_username"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0N = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0055:
            java.lang.String r0 = "trust_days"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0064
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A01 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0064:
            java.lang.String r0 = "full_name"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0F = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0073:
            java.lang.String r0 = "biography"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0A = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0082:
            r0 = 524(0x20c, float:7.34E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0095
            X.3qs r0 = X.C253473qq.parseFromJson(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A04 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0095:
            java.lang.String r0 = "pronouns"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x00b9
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r2 != r0) goto L_0x00b5
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
        L_0x00a9:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r2 == r0) goto L_0x00b5
            X.AnonymousClass7TG.A1F(r5, r3)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x00a9
        L_0x00b5:
            r1.A0R = r3     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x00b9:
            r0 = 523(0x20b, float:7.33E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x00e7
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r2 != r0) goto L_0x00e3
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
        L_0x00d1:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r2 == r0) goto L_0x00e3
            X.3qm r0 = X.C253393qi.parseFromJson(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x00d1
            r3.add(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x00d1
        L_0x00e3:
            r1.A0Q = r3     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x00e7:
            java.lang.String r0 = "external_url"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0E = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x00f7:
            java.lang.String r0 = X.Dbj.A00()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0M = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0109:
            java.lang.String r0 = "email"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0D = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0119:
            java.lang.String r0 = "country_code"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0B = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0129:
            java.lang.String r0 = "national_number"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0H = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0139:
            java.lang.String r0 = "gender"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0149
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A00 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0149:
            java.lang.String r0 = "text_app_should_see_autoimported_ig_profile_picture_dialog"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 != 0) goto L_0x033e
            java.lang.String r0 = "birthday"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r4 = r5.A1Q()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r4 == 0) goto L_0x016a
            java.lang.String r2 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            java.util.Date r3 = r0.parse(r4)     // Catch:{ ParseException -> 0x016a }
        L_0x016a:
            r1.A0P = r3     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x016e:
            java.lang.String r0 = "custom_gender"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0C = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x017e:
            java.lang.String r0 = "needs_email_confirm"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x018e
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A07 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x018e:
            java.lang.String r0 = "needs_phone_confirm"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x019e
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0Z = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x019e:
            java.lang.String r0 = "profile_pic_url"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x01ae
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A05 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x01ae:
            java.lang.String r0 = "page_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0I = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x01be:
            java.lang.String r0 = "page_name"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0J = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x01ce:
            java.lang.String r0 = "ads_page_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A08 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x01de:
            r0 = 4438(0x1156, float:6.219E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A09 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x01f2:
            r0 = 3737(0xe99, float:5.237E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0206
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0K = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0206:
            r0 = 3738(0xe9a, float:5.238E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x021a
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0L = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x021a:
            java.lang.String r0 = "profile_edit_params"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x022a
            X.EbC r0 = X.C48999Enb.parseFromJson(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A06 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x022a:
            java.lang.String r0 = "is_eligible_for_music_tab_settings"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 != 0) goto L_0x033e
            r0 = 190(0xbe, float:2.66E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0246
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0b = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0246:
            r0 = 191(0xbf, float:2.68E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x025a
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0c = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x025a:
            r0 = 349(0x15d, float:4.89E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x027a
            java.lang.String r2 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            java.util.Map r0 = com.instagram.api.schemas.PrimaryProfileLinkType.A01     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            com.instagram.api.schemas.PrimaryProfileLinkType r0 = (com.instagram.api.schemas.PrimaryProfileLinkType) r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 != 0) goto L_0x0276
            com.instagram.api.schemas.PrimaryProfileLinkType r0 = com.instagram.api.schemas.PrimaryProfileLinkType.UNRECOGNIZED     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
        L_0x0276:
            r1.A02 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x027a:
            r0 = 4832(0x12e0, float:6.771E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x028e
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0V = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x028e:
            r0 = 4826(0x12da, float:6.763E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x02a2
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0T = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x02a2:
            r0 = 4831(0x12df, float:6.77E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x02b6
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0U = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x02b6:
            r0 = 4949(0x1355, float:6.935E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x02ca
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0Y = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x02ca:
            r0 = 4948(0x1354, float:6.934E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x02de
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0X = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x02de:
            r0 = 4947(0x1353, float:6.932E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x02f2
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0W = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x02f2:
            java.lang.String r0 = "should_show_not_confirmed_birthday_button"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0302
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0a = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0302:
            r0 = 3051(0xbeb, float:4.275E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0316
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0S = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0316:
            r0 = 4006(0xfa6, float:5.614E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x032a
            X.5uD r0 = X.C292635jH.parseFromJson(r5)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A03 = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x032a:
            r0 = 5254(0x1486, float:7.362E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0031
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            r1.A0d = r0     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x033e:
            r5.A0d()     // Catch:{ IOException -> 0x034b, Exception -> 0x0345 }
            goto L_0x0031
        L_0x0343:
            r1 = 0
        L_0x0344:
            return r1
        L_0x0345:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x034b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49001End.parseFromJson(X.16F):X.F1D");
    }
}
