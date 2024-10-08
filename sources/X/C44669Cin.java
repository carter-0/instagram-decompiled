package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cin  reason: case insensitive filesystem */
public abstract class C44669Cin {
    public static C45341Cuj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45341Cuj cuj = new C45341Cuj();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("invited_moderators".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    cuj.A01 = arrayList;
                } else if ("joined_moderators".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    cuj.A02 = arrayList;
                } else if ("input_mode".equals(A17)) {
                    cuj.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return cuj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
