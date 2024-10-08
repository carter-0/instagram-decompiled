package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Clj  reason: case insensitive filesystem */
public abstract class C44833Clj {
    public static GSY parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C53401GnY gnY = null;
            String str = null;
            String str2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("context_card_photo".equals(A17)) {
                    gnY = C44832Cli.parseFromJson(r9);
                } else if ("context_content".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("context_cta".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("context_title".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (arrayList != null || !(r9 instanceof 0c9)) {
                return new GSY(gnY, str, str2, (List) arrayList);
            }
            AnonymousClass7TF.A1L("context_content", r9, "GetLeadFormResponseContextPage");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
