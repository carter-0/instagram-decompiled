package X;

import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import java.io.IOException;

/* renamed from: X.Cdr  reason: case insensitive filesystem */
public abstract class C44371Cdr {
    public static BGW parseFromJson(16F r30) {
        String str;
        String str2;
        16F r8 = r30;
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Long l = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus = null;
            String str8 = null;
            UserRoleOnFundraiser userRoleOnFundraiser = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("can_viewer_donate".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("charity_ig_username".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("end_time".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                } else if ("formatted_fundraiser_progress_info_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("fundraiser_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r8.A1P();
                    }
                } else if ("fundraiser_title".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r8.A1P();
                    }
                } else if ("fundraiser_visibility_status_on_user_profile".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    fundraiserVisibilityOnProfileStatus = (FundraiserVisibilityOnProfileStatus) FundraiserVisibilityOnProfileStatus.A01.get(str2);
                    if (fundraiserVisibilityOnProfileStatus == null) {
                        fundraiserVisibilityOnProfileStatus = FundraiserVisibilityOnProfileStatus.UNRECOGNIZED;
                    }
                } else if ("owner_username".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r8.A1P();
                    }
                } else if ("percent_raised".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("user_role".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    userRoleOnFundraiser = (UserRoleOnFundraiser) UserRoleOnFundraiser.A01.get(str);
                    if (userRoleOnFundraiser == null) {
                        userRoleOnFundraiser = UserRoleOnFundraiser.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_viewer_donate", r8, "StandaloneFundraiserDictV2Impl");
            } else if (l == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_time", r8, "StandaloneFundraiserDictV2Impl");
            } else if (str4 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("formatted_fundraiser_progress_info_text", r8, "StandaloneFundraiserDictV2Impl");
            } else if (str5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("formatted_goal_amount", r8, "StandaloneFundraiserDictV2Impl");
            } else if (str6 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("fundraiser_id", r8, "StandaloneFundraiserDictV2Impl");
            } else if (str7 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("fundraiser_title", r8, "StandaloneFundraiserDictV2Impl");
            } else if (fundraiserVisibilityOnProfileStatus == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("fundraiser_visibility_status_on_user_profile", r8, "StandaloneFundraiserDictV2Impl");
            } else if (str8 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("owner_username", r8, "StandaloneFundraiserDictV2Impl");
            } else if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("percent_raised", r8, "StandaloneFundraiserDictV2Impl");
            } else if (userRoleOnFundraiser != null || !(r8 instanceof 0c9)) {
                return new BGW(fundraiserVisibilityOnProfileStatus, userRoleOnFundraiser, str3, str4, str5, str6, str7, str8, num.intValue(), l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("user_role", r8, "StandaloneFundraiserDictV2Impl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
