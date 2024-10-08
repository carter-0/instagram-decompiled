package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.OPr  reason: case insensitive filesystem */
public final class C70877OPr {
    public static NHM parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NHM nhm = new NHM();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("poll_question_id".equals(A17)) {
                    nhm.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("poll_question_text".equals(A17)) {
                    nhm.A02 = AnonymousClass7TG.A0l(r5);
                } else if (C273654mx.A00(64).equals(A17)) {
                    nhm.A00 = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(3237).equals(A17)) {
                    r5.A0d();
                } else if ("options".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            OHQ parseFromJson = C70062Nwe.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nhm.A03 = arrayList;
                } else {
                    1XY.A01(r5, nhm, A17);
                }
                r5.A0z();
            }
            return nhm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
