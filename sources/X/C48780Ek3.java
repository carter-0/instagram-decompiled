package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ek3  reason: case insensitive filesystem */
public abstract class C48780Ek3 {
    public static C49876FBa parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C49876FBa fBa = new C49876FBa();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("is_answered".equals(A17)) {
                    fBa.A05 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("module_type".equals(A17)) {
                        fBa.A01 = AnonymousClass7TG.A0l(r4);
                    } else if ("qp_id".equals(A17)) {
                        fBa.A02 = AnonymousClass7TG.A0l(r4);
                    } else if ("questions".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                F3R parseFromJson = C48779Ek2.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        fBa.A04 = arrayList;
                    } else if ("tessa_survey_config_id".equals(A17)) {
                        fBa.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("extra_data_token".equals(A17)) {
                        fBa.A00 = AnonymousClass7TG.A0l(r4);
                    }
                }
                r4.A0z();
            }
            return fBa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
