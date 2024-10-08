package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cxl  reason: case insensitive filesystem */
public final class C45511Cxl {
    public static CEK parseFromJson(16F r6) {
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
                if ("active_bonus_deals".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C60981Jud parseFromJson = CV1.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A02 = arrayList;
                } else if ("available_bonus_deals".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C47194Dsg parseFromJson2 = CXB.parseFromJson(r6);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r5.A03 = arrayList;
                } else if ("inactive_bonus_deals".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C60981Jud parseFromJson3 = CV1.parseFromJson(r6);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else if ("is_within_24hr_bonus_tagging_window".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0S(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            List list = r5.A02;
            0qQ.A0A(list);
            List list2 = r5.A03;
            0qQ.A0A(list2);
            List list3 = r5.A04;
            0qQ.A0A(list3);
            r5.A00 = new C47190Dsc(r5.A01, list, list2, list3);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
