package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cy2  reason: case insensitive filesystem */
public final class C45528Cy2 {
    public static C43810CEc parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("fb_gift_count".equals(A17)) {
                    r1.A04 = AnonymousClass7TF.A0Z(r8);
                } else {
                    ArrayList arrayList = null;
                    if ("filters".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r8.A1J() != 16L.A08) {
                                C60954JuC parseFromJson = CWJ.parseFromJson(r8);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A05 = arrayList;
                    } else if ("gift_transactions".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r8.A1J() != 16L.A08) {
                                C60932Jtq parseFromJson2 = CWG.parseFromJson(r8);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r1.A06 = arrayList;
                    } else if ("has_non_recorded_transactions".equals(A17)) {
                        r1.A02 = AnonymousClass7TF.A0S(r8);
                    } else if ("is_creator_onboarded".equals(A17)) {
                        r1.A03 = AnonymousClass7TF.A0S(r8);
                    } else if ("page_info".equals(A17)) {
                        r1.A01 = CbI.parseFromJson(r8);
                    } else {
                        1XY.A01(r8, r1, A17);
                    }
                }
                r8.A0z();
            }
            Long l = r1.A04;
            List list = r1.A05;
            0qQ.A0A(list);
            List list2 = r1.A06;
            0qQ.A0A(list2);
            r1.A00 = new C60942Ju0(r1.A01, l, list, list2, C41845B3m.A14(r1.A02), C41845B3m.A14(r1.A03));
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
