package X;

import com.instagram.api.schemas.ProfileThemeImpl;
import com.instagram.api.schemas.ProfileThemeType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcQ  reason: case insensitive filesystem */
public abstract class C44282CcQ {
    public static ProfileThemeImpl parseFromJson(16F r14) {
        String A00;
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            String str5 = null;
            ProfileThemeType profileThemeType = null;
            String str6 = null;
            while (true) {
                16L A1J = r14.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(619);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r14);
                if ("alternative_background_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("alternative_thumbnail_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("background_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("theme_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("theme_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    profileThemeType = (ProfileThemeType) ProfileThemeType.A01.get(str);
                    if (profileThemeType == null) {
                        profileThemeType = ProfileThemeType.UNRECOGNIZED;
                    }
                } else if ("thumbnail_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (arrayList == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r14, "ProfileThemeImpl");
            } else if (str5 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("theme_id", r14, "ProfileThemeImpl");
            } else if (profileThemeType != null || !(r14 instanceof 0c9)) {
                return new ProfileThemeImpl(profileThemeType, str2, str3, str4, str5, str6, arrayList);
            } else {
                AnonymousClass7TF.A1L("theme_type", r14, "ProfileThemeImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
