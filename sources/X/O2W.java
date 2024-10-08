package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class O2W {
    public static OAD parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            OAD oad = new OAD();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("tracks".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C69159Nfi parseFromJson = O2X.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    oad.A00 = arrayList;
                }
                r5.A0z();
            }
            return oad;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
