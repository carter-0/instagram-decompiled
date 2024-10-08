package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Emd  reason: case insensitive filesystem */
public abstract class C48939Emd {
    public static Eu4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Eu4 eu4 = new Eu4();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("nodes".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C49481EwM parseFromJson = C48938Emc.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    eu4.A00 = arrayList;
                }
                r4.A0z();
            }
            return eu4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
