package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cfj  reason: case insensitive filesystem */
public abstract class C44487Cfj {
    public static C42101BHe parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            Integer num = null;
            String str3 = null;
            C42102BHf bHf = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("card_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (C41845B3m.A1J(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (AnonymousClass000.A00(1664).equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C42102BHf parseFromJson = D07.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("taken_at".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("template_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("user_data".equals(A17)) {
                    bHf = D07.parseFromJson(r11);
                }
                r11.A0z();
            }
            if (str3 != null || !(r11 instanceof 0c9)) {
                return new C42101BHe(bHf, num, str, str2, str3, arrayList);
            }
            AnonymousClass7TF.A1L("template_id", r11, "SuperlativeCardData");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
