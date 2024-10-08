package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;

public abstract class QOk extends AnonymousClass0T0 {
    public static Bundle A00(UserSession userSession, ImageUrl imageUrl, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0eP[] r3 = new 0eP[28];
        System.arraycopy(new 0eP[]{AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), AnonymousClass7TE.A1L("mediaID", str11), AnonymousClass7TE.A1L("adID", str2), AnonymousClass7TE.A1L("formID", str10), AnonymousClass7TE.A1L("app", "instagram"), AnonymousClass7TE.A1L("trackingToken", str12), AnonymousClass7TE.A1L("ad_creation_source", str), AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7), AnonymousClass7TE.A1L("igUserName", str5), AnonymousClass7TE.A1L("advertiser_fbidv2", str3), AnonymousClass7TE.A1L("igUserId", str4), AnonymousClass7TE.A1L("profilePicURI", imageUrl), AnonymousClass7TE.A1L("brandingImageURI", extendedImageUrl), AnonymousClass7TE.A1L("advertiserFollowerCount", Integer.valueOf(i)), AnonymousClass7TE.A1L("carouselIndex", Integer.valueOf(i2)), AnonymousClass7TE.A1L("mediaPosition", Integer.valueOf(i3)), AnonymousClass7TE.A1L("dynamicItemID", str6), AnonymousClass7TE.A1L("submitted", Boolean.valueOf(z3)), AnonymousClass7TE.A1L(AnonymousClass000.A00(3459), Boolean.valueOf(z6)), AnonymousClass7TE.A1L("is_pharma_vertical_ad", Boolean.valueOf(z5)), AnonymousClass7TE.A1L("should_always_allow_phone_zip_ui", Boolean.valueOf(z7)), AnonymousClass7TE.A1L("is_partnership_ad", Boolean.valueOf(z4)), AnonymousClass7TE.A1L("should_force_full_page_context_card", Boolean.valueOf(z8)), AnonymousClass7TE.A1L("is_first_question_sticker", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("is_bottom_sheet_flow", Boolean.valueOf(z)), AnonymousClass7TE.A1L("first_question_sticker_mcq_answer_value", str8), AnonymousClass7TE.A1L("first_question_sticker_saq_answer_value", str9)}, 0, r3, 0, 27);
        System.arraycopy(DbW.A1b("is_from_lead_ad_activity", false), 0, r3, 27, 1);
        return Q21.A00(r3);
    }
}
