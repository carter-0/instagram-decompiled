package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Chr  reason: case insensitive filesystem */
public abstract class C44619Chr {
    public static C45427Cw7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45427Cw7 cw7 = new C45427Cw7();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("ad_id".equals(A17)) {
                    cw7.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("is_demo".equals(A17)) {
                    cw7.A01 = AnonymousClass7TF.A0S(r5);
                } else if ("learn_more".equals(A17)) {
                    cw7.A00 = C44621Cht.parseFromJson(r5);
                } else if ("primer_message".equals(A17)) {
                    cw7.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("questions".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45397Cvd parseFromJson = C44622Chu.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cw7.A09 = arrayList;
                } else if ("show_primer".equals(A17)) {
                    cw7.A02 = AnonymousClass7TF.A0S(r5);
                } else if ("show_results".equals(A17)) {
                    cw7.A03 = AnonymousClass7TF.A0S(r5);
                } else if ("survey_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    cw7.A06 = A0l;
                } else if ("survey_type".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    cw7.A07 = A0l2;
                } else if (C41845B3m.A1W(A17)) {
                    cw7.A08 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return cw7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
