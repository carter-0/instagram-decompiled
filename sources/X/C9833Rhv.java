package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Rhv  reason: case insensitive filesystem */
public abstract class C9833Rhv {
    public static C10308Rq6 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C10308Rq6 rq6 = new C10308Rq6();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("custom_error_message".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("single_value".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("validation_condition".equals(A17)) {
                    EnumHelper.A00(r4.A1Q(), XRF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("validation_type".equals(A17)) {
                    EnumHelper.A00(r4.A1Q(), RGI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("range".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    rq6.A00 = arrayList;
                }
                r4.A0z();
            }
            return rq6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
