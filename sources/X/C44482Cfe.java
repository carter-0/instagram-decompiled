package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cfe  reason: case insensitive filesystem */
public abstract class C44482Cfe {
    public static C42100BHd parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("is_unit_dismissable".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if ("landing_site_title".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("landing_site_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("pk".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("shuffle_enabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r11);
                } else if ("suggestions".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            AnonymousClass3UJ parseFromJson = C41907B6f.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("view_all_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new C42100BHd(bool, bool2, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
