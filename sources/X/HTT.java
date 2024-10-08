package X;

import com.instagram.api.schemas.ChallengeButtonAction;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import java.io.IOException;

public abstract class HTT {
    public static ChallengeButtonInfoImpl parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            ChallengeButtonAction challengeButtonAction = null;
            String str2 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("button_action".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    challengeButtonAction = (ChallengeButtonAction) ChallengeButtonAction.A01.get(str);
                    if (challengeButtonAction == null) {
                        challengeButtonAction = ChallengeButtonAction.UNRECOGNIZED;
                    }
                } else if ("button_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("deeplink_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (challengeButtonAction == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_action", r10, "ChallengeButtonInfoImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_text", r10, "ChallengeButtonInfoImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new ChallengeButtonInfoImpl(challengeButtonAction, str2, str3);
            } else {
                AnonymousClass7TF.A1L("deeplink_url", r10, "ChallengeButtonInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
