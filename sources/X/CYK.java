package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CYK {
    public static C61079JwH parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            AnonymousClass5FS r3 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                if (C41846B3n.A1Z(r6, A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            BBH parseFromJson = CYO.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("next_max_id".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("summary".equals(A0q)) {
                    r3 = C44745CkE.parseFromJson(r6);
                }
                r6.A0z();
            }
            return new C61079JwH((Object) r3, (Object) arrayList, str, 2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
