package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import java.io.IOException;

/* renamed from: X.3qi  reason: invalid class name and case insensitive filesystem */
public abstract class C253393qi {
    public static C253433qm parseFromJson(16F r24) {
        String str;
        16F r3 = r24;
        0qQ.A0B(r3, 0);
        try {
            Boolean bool = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str2 = null;
            C282075Bi r12 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            IgUserBioLinkTypeEnum igUserBioLinkTypeEnum = null;
            String str7 = null;
            Boolean bool3 = null;
            String str8 = null;
            String str9 = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("click_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("fb_biolink_social_context".equals(A0q)) {
                    r12 = C282065Bg.parseFromJson(r3);
                } else if ("group_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("icon_url".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("image_url".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("is_pinned".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                } else if ("is_verified".equals(A0q)) {
                    bool2 = Boolean.valueOf(r3.A0d());
                } else if ("link_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("link_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    igUserBioLinkTypeEnum = (IgUserBioLinkTypeEnum) IgUserBioLinkTypeEnum.A01.get(str);
                    if (igUserBioLinkTypeEnum == null) {
                        igUserBioLinkTypeEnum = IgUserBioLinkTypeEnum.UNRECOGNIZED;
                    }
                } else if ("lynx_url".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if ("open_external_url_with_in_app_browser".equals(A0q)) {
                    bool3 = Boolean.valueOf(r3.A0d());
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if ("url".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            if (bool == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("is_pinned", "UserBioLinkDictImpl");
            } else if (bool2 == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("is_verified", "UserBioLinkDictImpl");
            } else if (str6 == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("link_id", "UserBioLinkDictImpl");
            } else if (igUserBioLinkTypeEnum == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("link_type", "UserBioLinkDictImpl");
            } else if (str8 == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00(DialogModule.KEY_TITLE, "UserBioLinkDictImpl");
            } else if (str9 != null || !(r3 instanceof 0c9)) {
                return new C253433qm(r12, igUserBioLinkTypeEnum, bool3, str2, str3, str4, str5, str6, str7, str8, str9, bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r3).A03.A00("url", "UserBioLinkDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
