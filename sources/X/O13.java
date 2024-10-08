package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class O13 {
    public static OCT parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            OCT oct = new OCT();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("primary_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C66584MXp.A11(r4, arrayList);
                        }
                    }
                    oct.A00 = arrayList;
                } else if ("secondary_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C66584MXp.A11(r4, arrayList);
                        }
                    }
                    oct.A01 = arrayList;
                }
                r4.A0z();
            }
            return oct;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
