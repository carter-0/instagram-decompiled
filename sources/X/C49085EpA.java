package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EpA  reason: case insensitive filesystem */
public abstract class C49085EpA {
    public static C17959Vis parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17959Vis vis = new C17959Vis();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("solutions".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C17958Vir parseFromJson = Ep9.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vis.A00 = arrayList;
                }
                r4.A0z();
            }
            return vis;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
