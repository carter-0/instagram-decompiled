package X;

import com.instagram.model.keyword.Keyword;
import java.io.IOException;
import java.util.ArrayList;

public final class OR8 {
    public static NH4 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NH4 nh4 = new NH4();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("keywords".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            Keyword parseFromJson = C67385Mn1.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nh4.A00 = arrayList;
                } else {
                    1XY.A01(r5, nh4, A17);
                }
                r5.A0z();
            }
            return nh4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
