package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cfb  reason: case insensitive filesystem */
public abstract class C44479Cfb {
    public static N33 parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("channel_list".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            N5I parseFromJson = C44480Cfc.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if (C41845B3m.A17(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("ranking_request_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r11, num2, A17, "view_state_item_type");
                } else if (r11.A11() == 16L.A0G) {
                    str5 = null;
                } else {
                    str5 = r11.A1P();
                }
                r11.A0z();
            }
            return new N33(num, num2, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
