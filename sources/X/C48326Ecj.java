package X;

import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import java.io.IOException;

/* renamed from: X.Ecj  reason: case insensitive filesystem */
public abstract class C48326Ecj {
    public static C61104JxF parseFromJson(16F r26) {
        String A00;
        String str;
        String str2;
        16F r1 = r26;
        0qQ.A0B(r1, 0);
        try {
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            FanClubNextStepsCompletionState fanClubNextStepsCompletionState = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = null;
            while (true) {
                16L A1J = r1.A1J();
                16L r3 = 16L.A09;
                A00 = C273654mx.A00(91);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r1);
                if ("completion_state".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                    fanClubNextStepsCompletionState = (FanClubNextStepsCompletionState) FanClubNextStepsCompletionState.A01.get(str2);
                    if (fanClubNextStepsCompletionState == null) {
                        fanClubNextStepsCompletionState = FanClubNextStepsCompletionState.UNRECOGNIZED;
                    }
                } else if ("contextual_recommendation_creator_username".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_cta".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_description".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_learn_more_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_title".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_video_fbid".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("contextual_recommendation_text".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("contextual_recommendation_thumbnail".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if ("main_recommendation_cta".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("main_recommendation_dark_mode_icon".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r1.A1P();
                    }
                } else if ("main_recommendation_icon".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r1.A1P();
                    }
                } else if ("main_recommendation_name".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r1.A1P();
                    }
                } else if ("recommendation_description".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r1.A1P();
                    }
                } else if ("recommendation_extra".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r1.A1P();
                    }
                } else if ("recommendation_icon".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r1.A1P();
                    }
                } else if ("recommendation_name".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r1.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    fanClubNextStepsRecommendationsType = (FanClubNextStepsRecommendationsType) FanClubNextStepsRecommendationsType.A01.get(str);
                    if (fanClubNextStepsRecommendationsType == null) {
                        fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.UNRECOGNIZED;
                    }
                }
                r1.A0z();
            }
            if (fanClubNextStepsCompletionState == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("completion_state", r1, "FanClubNextStepsRecommendation");
            } else if (str15 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("recommendation_description", r1, "FanClubNextStepsRecommendation");
            } else if (str17 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("recommendation_icon", r1, "FanClubNextStepsRecommendation");
            } else if (str18 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("recommendation_name", r1, "FanClubNextStepsRecommendation");
            } else if (fanClubNextStepsRecommendationsType != null || !(r1 instanceof 0c9)) {
                return new C61104JxF(fanClubNextStepsCompletionState, fanClubNextStepsRecommendationsType, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
            } else {
                AnonymousClass7TF.A1L(A00, r1, "FanClubNextStepsRecommendation");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
