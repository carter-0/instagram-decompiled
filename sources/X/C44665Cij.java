package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cij  reason: case insensitive filesystem */
public abstract class C44665Cij {
    public static C45340Cui parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45340Cui cui = new C45340Cui();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("invited_collaborators".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    cui.A01 = arrayList;
                } else if ("joined_collaborators".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    cui.A02 = arrayList;
                } else if ("input_mode".equals(A17)) {
                    cui.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return cui;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
