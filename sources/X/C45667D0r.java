package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D0r  reason: case insensitive filesystem */
public final class C45667D0r {
    public static CEV parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("gating_decisions".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C53439GoX parseFromJson = C44111CWc.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else if ("ineligible_tools_section_title".equals(A17)) {
                    r5.A02 = AnonymousClass7TG.A0l(r6);
                } else if (AnonymousClass000.A00(3451).equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0S(r6);
                } else if ("tools_to_setup_section_title".equals(A17)) {
                    r5.A03 = AnonymousClass7TG.A0l(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            List list = r5.A04;
            0qQ.A0A(list);
            String str = r5.A02;
            0qQ.A0A(str);
            boolean A14 = C41845B3m.A14(r5.A01);
            String str2 = r5.A03;
            0qQ.A0A(str2);
            r5.A00 = new C53540GqB(list, A14, str, str2);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
