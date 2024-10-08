package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class F4N {
    public static C47324Dur parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("follower_count".equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0X(r6);
                } else if ("hallpass_admin".equals(A17)) {
                    r5.A01 = C41845B3m.A0a(r6, false);
                } else {
                    ArrayList arrayList = null;
                    if ("members".equals(A17)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                C41846B3n.A1E(r6, arrayList);
                            }
                        }
                        r5.A03 = arrayList;
                    } else if ("suggested_users".equals(A17)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                C41846B3n.A1E(r6, arrayList);
                            }
                        }
                        r5.A04 = arrayList;
                    } else {
                        1XY.A01(r6, r5, A17);
                    }
                }
                r6.A0z();
            }
            Integer num = r5.A02;
            0qQ.A0A(num);
            int intValue = num.intValue();
            User user = r5.A01;
            List list = r5.A03;
            0qQ.A0A(list);
            r5.A00 = new C47200Dsm(user, list, r5.A04, intValue);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
