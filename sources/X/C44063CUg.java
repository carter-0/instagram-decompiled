package X;

import com.instagram.api.schemas.AudienceValidationActionImpl;
import com.instagram.api.schemas.AudienceValidationActionType;
import java.io.IOException;

/* renamed from: X.CUg  reason: case insensitive filesystem */
public abstract class C44063CUg {
    public static AudienceValidationActionImpl parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            AudienceValidationActionType audienceValidationActionType = null;
            String str2 = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("action_type".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    audienceValidationActionType = (AudienceValidationActionType) AudienceValidationActionType.A01.get(str);
                    if (audienceValidationActionType == null) {
                        audienceValidationActionType = AudienceValidationActionType.UNRECOGNIZED;
                    }
                } else if ("cta_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (audienceValidationActionType == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action_type", r9, "AudienceValidationActionImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new AudienceValidationActionImpl(audienceValidationActionType, str2, str3);
            } else {
                AnonymousClass7TF.A1L("cta_text", r9, "AudienceValidationActionImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
