package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cqc  reason: case insensitive filesystem */
public abstract class C45118Cqc {
    public static C45423Cw3 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45423Cw3 cw3 = new C45423Cw3();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("creation_time".equals(A17)) {
                    cw3.A00 = r4.A0y();
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A1J(A17)) {
                        cw3.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("like_intention".equals(A17)) {
                        cw3.A02 = AnonymousClass7TG.A0l(r4);
                    } else if ("is_double_tap_media".equals(A17)) {
                        cw3.A07 = r4.A0d();
                    } else if (AnonymousClass000.A00(246).equals(A17)) {
                        cw3.A01 = AnonymousClass7TG.A0l(r4);
                    } else if ("module_values_list".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        cw3.A05 = arrayList;
                    } else if ("radio_type".equals(A17)) {
                        cw3.A04 = AnonymousClass7TG.A0l(r4);
                    }
                }
                r4.A0z();
            }
            return cw3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
