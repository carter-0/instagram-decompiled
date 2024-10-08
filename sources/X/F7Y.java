package X;

import java.io.IOException;
import java.util.ArrayList;

public final class F7Y {
    public static C47364Dvy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C47364Dvy dvy = new C47364Dvy();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("mutual_followers".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    dvy.A00 = arrayList;
                } else if ("show_see_all_followers_button".equals(A17)) {
                    dvy.A02 = r4.A0d();
                } else if ("suggested_users".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass3UL parseFromJson = B7G.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    dvy.A01 = arrayList;
                } else {
                    1XY.A01(r4, dvy, A17);
                }
                r4.A0z();
            }
            return dvy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
