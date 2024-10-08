package X;

import java.io.IOException;
import java.util.ArrayList;

public final class OQ9 {
    public static NH6 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NH6 nh6 = new NH6();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("thread_details".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            O8D parseFromJson = C70154Ny8.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nh6.A01 = arrayList;
                } else if ("missing_ig_thread_ids".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nh6.A00 = arrayList;
                } else {
                    1XY.A01(r5, nh6, A17);
                }
                r5.A0z();
            }
            return nh6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
