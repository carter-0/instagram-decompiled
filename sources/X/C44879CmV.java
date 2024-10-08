package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CmV  reason: case insensitive filesystem */
public abstract class C44879CmV {
    public static C42125BId parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            1Xj r5 = null;
            String str3 = null;
            String str4 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("header_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (AnonymousClass000.A00(1449).equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (AnonymousClass000.A00(1462).equals(A17)) {
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
                } else if ("reel_item".equals(A17)) {
                    r5 = 1Xj.A00(r11);
                } else if (AnonymousClass000.A00(1857).equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("template_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str4 != null || !(r11 instanceof 0c9)) {
                return new C42125BId(r5, str, str2, str3, str4, arrayList);
            }
            AnonymousClass7TF.A1L("template_id", r11, "EmptyStoryStateCardDataImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
