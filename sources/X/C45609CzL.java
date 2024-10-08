package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CzL  reason: case insensitive filesystem */
public final class C45609CzL {
    public static C43809CEb parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("fb_close_friends_count".equals(A17)) {
                    r2.A02 = AnonymousClass7TF.A0X(r8);
                } else if ("friend_list".equals(A17)) {
                    r2.A00 = C44252Cbn.parseFromJson(r8);
                } else {
                    ArrayList arrayList = null;
                    if ("members".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r8.A1J() != 16L.A08) {
                                C41846B3n.A1E(r8, arrayList);
                            }
                        }
                        r2.A04 = arrayList;
                    } else if ("suggested_users".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r8.A1J() != 16L.A08) {
                                C41846B3n.A1E(r8, arrayList);
                            }
                        }
                        r2.A05 = arrayList;
                    } else if (AnonymousClass000.A00(374).equals(A17)) {
                        r2.A03 = AnonymousClass7TG.A0l(r8);
                    } else {
                        1XY.A01(r8, r2, A17);
                    }
                }
                r8.A0z();
            }
            Integer num = r2.A02;
            C61113JxP jxP = r2.A00;
            List list = r2.A04;
            0qQ.A0A(list);
            r2.A01 = new C61115JxR(jxP, num, r2.A03, list, r2.A05);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
