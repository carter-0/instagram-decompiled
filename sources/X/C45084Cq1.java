package X;

import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cq1  reason: case insensitive filesystem */
public abstract class C45084Cq1 {
    public static C45319CuN parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45319CuN cuN = new C45319CuN();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1Q(A17)) {
                    cuN.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("rich_text_description".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            TextWithEntitiesBlockDict parseFromJson = C44534CgU.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cuN.A01 = arrayList;
                }
                r4.A0z();
            }
            return cuN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
