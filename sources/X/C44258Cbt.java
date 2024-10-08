package X;

import com.instagram.api.schemas.ProductArtsLabelInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cbt  reason: case insensitive filesystem */
public abstract class C44258Cbt {
    public static ProductArtsLabelsDict parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("labels".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            ProductArtsLabelInformationDictImpl parseFromJson = C44256Cbr.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            return new ProductArtsLabelsDict(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
