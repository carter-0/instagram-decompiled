package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

public abstract class HTU {
    public static ChallengeDetails parseFromJson(16F r32) {
        String A00;
        String A002;
        String str;
        String str2;
        16F r3 = r32;
        0qQ.A0B(r3, 0);
        try {
            Boolean bool = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Integer num = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ChallengeName challengeName = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl2 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl3 = null;
            ChallengeState challengeState = null;
            String str9 = null;
            String str10 = null;
            Integer num2 = null;
            while (true) {
                16L A1J = r3.A1J();
                16L r9 = 16L.A09;
                A00 = AnonymousClass000.A00(3211);
                A002 = AnonymousClass000.A00(2143);
                if (A1J == r9) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r3);
                if ("challenge_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("image_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                    challengeName = (ChallengeName) ChallengeName.A01.get(str2);
                    if (challengeName == null) {
                        challengeName = ChallengeName.UNRECOGNIZED;
                    }
                } else if ("primary_button".equals(A17)) {
                    challengeButtonInfoImpl = HTT.parseFromJson(r3);
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if (AnonymousClass000.A00(3806).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(3808).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(354).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(3809).equals(A17)) {
                    challengeButtonInfoImpl2 = HTT.parseFromJson(r3);
                } else if ("secondary_button".equals(A17)) {
                    challengeButtonInfoImpl3 = HTT.parseFromJson(r3);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    challengeState = (ChallengeState) ChallengeState.A01.get(str);
                    if (challengeState == null) {
                        challengeState = ChallengeState.UNRECOGNIZED;
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r3.A1P();
                    }
                } else if (!DialogModule.KEY_TITLE.equals(A17)) {
                    num2 = C41847B3o.A13(r3, num2, A17, "total");
                } else if (r3.A11() == 16L.A0G) {
                    str10 = null;
                } else {
                    str10 = r3.A1P();
                }
                r3.A0z();
            }
            if (str3 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("challenge_id", r3, A002);
            } else if (bool == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r3, A002);
            } else if (str5 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r3, A002);
            } else if (challengeName == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3, A002);
            } else if (num == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(ReactProgressBarViewManager.PROP_PROGRESS, r3, A002);
            } else if (challengeState == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, r3, A002);
            } else if (str10 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r3, A002);
            } else if (num2 != null || !(r3 instanceof 0c9)) {
                return new ChallengeDetails(challengeButtonInfoImpl, challengeButtonInfoImpl2, challengeButtonInfoImpl3, challengeName, challengeState, str3, str4, str5, str6, str7, str8, str9, str10, num.intValue(), num2.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("total", r3, A002);
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
