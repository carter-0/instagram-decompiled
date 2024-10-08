package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cfw  reason: case insensitive filesystem */
public abstract class C44500Cfw {
    public static C42108BHl parseFromJson(16F r30) {
        16F r1 = r30;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            Integer num3 = null;
            String str5 = null;
            C42038BEq bEq = null;
            String str6 = null;
            Integer num4 = null;
            String str7 = null;
            Integer num5 = null;
            String str8 = null;
            BHm bHm = null;
            ArrayList arrayList = null;
            String str9 = null;
            ArrayList arrayList2 = null;
            String str10 = null;
            while (r1.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r1);
                if ("allow_following".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if ("allow_muting_story".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r1);
                } else if ("challenge_id".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("debug_info".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if (C41845B3m.A1Q(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("follow_button_text".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(608).equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r1);
                } else if ("following".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r1);
                } else if ("formatted_media_count".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("fresh_topic_metadata".equals(A17)) {
                    bEq = C44153CXs.parseFromJson(r1);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("media_count".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r1);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("non_violating".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r1);
                } else if ("profile_pic_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("promo_banner".equals(A17)) {
                    bHm = C44501Cfx.parseFromJson(r1);
                } else if (AnonymousClass000.A00(3872).equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r1, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("show_follow_drop_down".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("social_context".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("social_context_profile_links".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            C253813rS parseFromJson = C253803rR.parseFromJson(r1);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (str6 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r1, "TagInfo");
            } else if (str7 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1, "TagInfo");
            } else if (bool != null || !(r1 instanceof 0c9)) {
                return new C42108BHl(bEq, bHm, bool2, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, arrayList2, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("show_follow_drop_down", r1, "TagInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
