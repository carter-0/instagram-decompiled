package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Cc2 {
    public static C42070BFy parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            String str = null;
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                if (C41846B3n.A1Z(r7, A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C42069BFx parseFromJson = Cc1.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1V(A0q)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if (!"next_max_id".equals(A0q)) {
                    num = C41847B3o.A13(r7, num, A0q, "num_results");
                } else if (r7.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r7.A1P();
                }
                r7.A0z();
            }
            return new C42070BFy(bool, num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
