package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class O2Y {
    public static OAE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            OAE oae = new OAE();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("effect_search_entries".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass72J parseFromJson = O2Z.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    oae.A00 = arrayList;
                }
                r5.A0z();
            }
            return oae;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
