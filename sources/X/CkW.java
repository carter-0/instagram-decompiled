package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CkW {
    public static C45379CvL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45379CvL cvL = new C45379CvL();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("context_cta".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("context_title".equals(A17)) {
                    cvL.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("context_content_style".equals(A17)) {
                    cvL.A01 = (C16643Uyf) EnumHelper.A00(r4.A1Q(), C16643Uyf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("context_card_photo".equals(A17)) {
                    cvL.A00 = C44759CkV.parseFromJson(r4);
                } else if ("context_content".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    cvL.A03 = arrayList;
                }
                r4.A0z();
            }
            return cvL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
