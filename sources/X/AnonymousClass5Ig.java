package X;

import com.instagram.api.schemas.StoryLinkInfoDict;
import java.io.IOException;

/* renamed from: X.5Ig  reason: invalid class name */
public abstract class AnonymousClass5Ig {
    public static StoryLinkInfoDict parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num = null;
            String str6 = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("click_id".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("custom_cta".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("display_url".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("is_dynamic_dwell_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r14.A0d());
                } else if ("is_universal_link".equals(A0q)) {
                    bool2 = Boolean.valueOf(r14.A0d());
                } else if ("link_title".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("link_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("open_external_browser".equals(A0q)) {
                    bool3 = Boolean.valueOf(r14.A0d());
                } else if ("should_read_creator_dynamic_dwell_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(r14.A0d());
                } else if ("tap_state".equals(A0q)) {
                    num = Integer.valueOf(r14.A1D());
                } else if ("url".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            return new StoryLinkInfoDict(bool, bool2, bool3, bool4, num, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, StoryLinkInfoDict storyLinkInfoDict, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = storyLinkInfoDict.A05;
        if (str != null) {
            r2.A0R("click_id", str);
        }
        String str2 = storyLinkInfoDict.A06;
        if (str2 != null) {
            r2.A0R("custom_cta", str2);
        }
        String str3 = storyLinkInfoDict.A07;
        if (str3 != null) {
            r2.A0R("display_url", str3);
        }
        Boolean bool = storyLinkInfoDict.A00;
        if (bool != null) {
            r2.A0S("is_dynamic_dwell_enabled", bool.booleanValue());
        }
        Boolean bool2 = storyLinkInfoDict.A01;
        if (bool2 != null) {
            r2.A0S("is_universal_link", bool2.booleanValue());
        }
        String str4 = storyLinkInfoDict.A08;
        if (str4 != null) {
            r2.A0R("link_title", str4);
        }
        String str5 = storyLinkInfoDict.A09;
        if (str5 != null) {
            r2.A0R("link_type", str5);
        }
        Boolean bool3 = storyLinkInfoDict.A02;
        if (bool3 != null) {
            r2.A0S("open_external_browser", bool3.booleanValue());
        }
        Boolean bool4 = storyLinkInfoDict.A03;
        if (bool4 != null) {
            r2.A0S("should_read_creator_dynamic_dwell_enabled", bool4.booleanValue());
        }
        Integer num = storyLinkInfoDict.A04;
        if (num != null) {
            r2.A0P("tap_state", num.intValue());
        }
        String str6 = storyLinkInfoDict.A0A;
        if (str6 != null) {
            r2.A0R("url", str6);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
