package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.ToG  reason: case insensitive filesystem */
public abstract class C14014ToG {
    public static C14015ToH parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool = null;
            String str8 = null;
            String str9 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("accessibility_label".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("avatar_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("avatar_revision_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("avatar_sticker_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("avatar_style".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("custom_avatar_cdn_url".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("expression_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                } else if ("has_avatar".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("media_type".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r13.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new C14015ToH(bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C14015ToH toH) {
        r2.A0c();
        String str = toH.A01;
        if (str != null) {
            r2.A0R("accessibility_label", str);
        }
        String str2 = toH.A02;
        if (str2 != null) {
            r2.A0R("avatar_id", str2);
        }
        String str3 = toH.A03;
        if (str3 != null) {
            r2.A0R("avatar_revision_id", str3);
        }
        String str4 = toH.A04;
        if (str4 != null) {
            r2.A0R("avatar_sticker_id", str4);
        }
        String str5 = toH.A05;
        if (str5 != null) {
            r2.A0R("avatar_style", str5);
        }
        String str6 = toH.A06;
        if (str6 != null) {
            r2.A0R("custom_avatar_cdn_url", str6);
        }
        String str7 = toH.A07;
        if (str7 != null) {
            r2.A0R("expression_id", str7);
        }
        Boolean bool = toH.A00;
        if (bool != null) {
            r2.A0S("has_avatar", bool.booleanValue());
        }
        String str8 = toH.A08;
        if (str8 != null) {
            r2.A0R("media_type", str8);
        }
        String str9 = toH.A09;
        if (str9 != null) {
            r2.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
        }
        r2.A0Z();
    }
}
