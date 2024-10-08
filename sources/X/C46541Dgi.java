package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Dgi  reason: case insensitive filesystem */
public abstract class C46541Dgi {
    public static C283175Gk parseFromJson(16F r27) {
        16F r5 = r27;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            C61076JwE jwE = null;
            String str16 = null;
            1Xj r8 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("lat".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("long".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if (Dbj.A04(0, 9, 98).equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("device_name".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("tf_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("loc".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                } else if ("time".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r5.A1P();
                    }
                } else if ("tip_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r5.A1P();
                    }
                } else if ("channel_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r5.A1P();
                    }
                } else if ("upcoming_event_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r5.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r5.A1P();
                    }
                } else if ("facepiles".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            SimpleImageUrl A00 = 16h.A00(r5);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("is_aggregated".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                } else if ("disable_truncation".equals(A0q)) {
                    bool2 = Boolean.valueOf(r5.A0d());
                } else if ("content".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r5.A1P();
                    }
                } else if ("context".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r5.A1P();
                    }
                } else if ("icon_name".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r5.A1P();
                    }
                } else if ("upcoming_event_reminder_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r5.A1P();
                    }
                } else if ("social_context".equals(A0q)) {
                    jwE = C44959Cnt.parseFromJson(r5);
                } else if ("override_profile_pic_icon_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r5.A1P();
                    }
                } else if ("media_dict".equals(A0q)) {
                    r8 = 1Xj.A00(r5);
                }
                r5.A0z();
            }
            return new C283175Gk(jwE, r8, bool, bool2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
