package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CzF  reason: case insensitive filesystem */
public final class C45603CzF {
    public static CES parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("count_per_row".equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0X(r6);
                } else if ("enable_scroll_animation".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0S(r6);
                } else if ("row_count".equals(A17)) {
                    r5.A03 = AnonymousClass7TF.A0X(r6);
                } else if ("suggestions".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            N5G parseFromJson = C69752Nrb.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            Integer num = r5.A02;
            0qQ.A0A(num);
            int intValue = num.intValue();
            boolean A14 = C41845B3m.A14(r5.A01);
            Integer num2 = r5.A03;
            0qQ.A0A(num2);
            int intValue2 = num2.intValue();
            List list = r5.A04;
            0qQ.A0A(list);
            r5.A00 = new N5H(list, intValue, intValue2, A14);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
