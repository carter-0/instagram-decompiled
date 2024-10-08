package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class LHn {
    public static C61066Jw4 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61066Jw4 jw4 = new C61066Jw4();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("is_audio_translations_enabled".equals(A17)) {
                    jw4.A01 = r5.A0d();
                } else if ("is_lip_sync_translations_enabled".equals(A17)) {
                    jw4.A02 = r5.A0d();
                } else if ("selected_languages".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C60909JtT parseFromJson = C63109Krc.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jw4.A00 = arrayList;
                }
                r5.A0z();
            }
            return jw4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C61066Jw4 jw4, 17Z r4) {
        r4.A0c();
        r4.A0S("is_audio_translations_enabled", jw4.A01);
        r4.A0S("is_lip_sync_translations_enabled", jw4.A02);
        if (jw4.A00 != null) {
            16P.A03(r4, "selected_languages");
            Iterator A1H = C51966G9m.A1H(jw4.A00);
            while (A1H.hasNext()) {
                C60909JtT jtT = (C60909JtT) A1H.next();
                if (jtT != null) {
                    r4.A0c();
                    String str = jtT.A01;
                    if (str != null) {
                        r4.A0R("iso3_language_code", str);
                    }
                    String str2 = jtT.A00;
                    if (str2 != null) {
                        r4.A0R("display_name", str2);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
