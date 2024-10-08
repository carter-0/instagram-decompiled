package X;

import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.UntaggableReason;
import java.io.IOException;

/* renamed from: X.Cgq  reason: case insensitive filesystem */
public abstract class C44556Cgq {
    public static UntaggableReason parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            LinkWithText linkWithText = null;
            String str2 = null;
            LinkWithText linkWithText2 = null;
            InstagramProductTaggabilityState instagramProductTaggabilityState = null;
            String str3 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("action".equals(A17)) {
                    linkWithText = C44206CZt.parseFromJson(r8);
                } else if (C41845B3m.A1Q(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("help_link".equals(A17)) {
                    linkWithText2 = C44206CZt.parseFromJson(r8);
                } else if ("taggability_state".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    instagramProductTaggabilityState = (InstagramProductTaggabilityState) InstagramProductTaggabilityState.A01.get(str);
                    if (instagramProductTaggabilityState == null) {
                        instagramProductTaggabilityState = InstagramProductTaggabilityState.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new UntaggableReason(instagramProductTaggabilityState, linkWithText, linkWithText2, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
