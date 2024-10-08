package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

public abstract class HTV {
    public static Challenge parseFromJson(16F r42) {
        String A00;
        String A002;
        String A003;
        String str;
        String str2;
        16F r1 = r42;
        0qQ.A0B(r1, 0);
        try {
            Long l = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl = null;
            String str5 = null;
            String str6 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl2 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl3 = null;
            String str7 = null;
            String str8 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl4 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Integer num = null;
            ChallengeName challengeName = null;
            Integer num2 = null;
            String str13 = null;
            ChallengeState challengeState = null;
            String str14 = null;
            Integer num3 = null;
            while (true) {
                16L A1J = r1.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(3264);
                A002 = AnonymousClass000.A00(3210);
                A003 = AnonymousClass000.A00(2142);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r1);
                if (AnonymousClass000.A00(2556).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(2716).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(2717).equals(A17)) {
                    challengeButtonInfoImpl = HTT.parseFromJson(r1);
                } else if (AnonymousClass000.A00(2718).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(2779).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("challenge_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r1);
                } else if (AnonymousClass000.A00(2780).equals(A17)) {
                    challengeButtonInfoImpl2 = HTT.parseFromJson(r1);
                } else if (AnonymousClass000.A00(2781).equals(A17)) {
                    challengeButtonInfoImpl3 = HTT.parseFromJson(r1);
                } else if (AnonymousClass000.A00(1164).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if (A002.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if (AnonymousClass000.A00(3261).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(3262).equals(A17)) {
                    challengeButtonInfoImpl4 = HTT.parseFromJson(r1);
                } else if (AnonymousClass000.A00(3263).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(3265).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("image_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(1543).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                    challengeName = (ChallengeName) ChallengeName.A01.get(str2);
                    if (challengeName == null) {
                        challengeName = ChallengeName.UNRECOGNIZED;
                    }
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r1);
                } else if (AnonymousClass000.A00(354).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r1.A1P();
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    challengeState = (ChallengeState) ChallengeState.A01.get(str);
                    if (challengeState == null) {
                        challengeState = ChallengeState.UNRECOGNIZED;
                    }
                } else if (!DialogModule.KEY_TITLE.equals(A17)) {
                    num3 = C41847B3o.A13(r1, num3, A17, "total");
                } else if (r1.A11() == 16L.A0G) {
                    str14 = null;
                } else {
                    str14 = r1.A1P();
                }
                r1.A0z();
            }
            if (l == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("challenge_id", r1, A003);
            } else if (bool == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r1, A003);
            } else if (str10 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r1, A003);
            } else if (str12 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r1, A003);
            } else if (challengeName == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1, A003);
            } else if (num2 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(ReactProgressBarViewManager.PROP_PROGRESS, r1, A003);
            } else if (challengeState == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, r1, A003);
            } else if (str14 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r1, A003);
            } else if (num3 != null || !(r1 instanceof 0c9)) {
                return new Challenge(challengeButtonInfoImpl, challengeButtonInfoImpl2, challengeButtonInfoImpl3, challengeButtonInfoImpl4, challengeName, challengeState, num, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, num2.intValue(), num3.intValue(), l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("total", r1, A003);
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
