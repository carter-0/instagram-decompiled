package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.B3q  reason: case insensitive filesystem */
public abstract class C41849B3q {
    public static AnonymousClass4Kx A00() {
        AnonymousClass4Kz r6 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(new AnonymousClass4L3(r6), "asset_id"), new AnonymousClass4L7(new AnonymousClass4L3(r6), "asset_name"), new AnonymousClass4L7(new AnonymousClass4L3(r6), "asset_type"), new AnonymousClass4L7(r6, "cover_artwork_thumbnail_uri"), new AnonymousClass4L7(r6, "extra")});
    }

    public static AnonymousClass4Kx A01() {
        AnonymousClass4L7 r3 = new AnonymousClass4L7(C342787pA.A00, "animation_time_sec");
        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r2, "cta_bar_type"), new AnonymousClass4L7(r2, "destination"), new AnonymousClass4L7(r2, "dominant_color"), new AnonymousClass4L7(AnonymousClass4L8.A00, "dwell_time_sec"), new AnonymousClass4L7(r2, DialogModule.KEY_TITLE), new AnonymousClass4L7(r2, "toggled_destination"), new AnonymousClass4L7(r2, "toggled_title")});
    }

    public static AnonymousClass4Kx A02() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "full_name");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r2, "has_onboarded_to_text_post_app"), new AnonymousClass4L7(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r2, "is_private"), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "pk_id"), new AnonymousClass4L7(r1, "profile_pic_id"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, AnonymousClass9PN.A00())});
    }

    public static AnonymousClass4Kx A03() {
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(new AnonymousClass4L3(r2), "can_toggle_mashups_allowed"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "has_been_mashed_up"), new AnonymousClass4L7(r2, "has_nonmimicable_additional_audio"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "is_creator_requesting_mashup"), new AnonymousClass4L7(r2, "is_light_weight_check"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "is_pivot_page_available"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "mashups_allowed")});
    }

    public static AnonymousClass4Kx A04() {
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r2, "disabled_sharing_products_to_guides");
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, AnonymousClass9PN.A00())});
    }

    public static AnonymousClass4Kx A05() {
        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r3, "background_color");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r3, "emoji");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r4, r5, new AnonymousClass4L7(r2, "is_interactive_music_sticker"), new AnonymousClass4L7(r3, "question"), new AnonymousClass4L7(r3, "slider_id"), new AnonymousClass4L7(C342787pA.A00, "slider_vote_average"), new AnonymousClass4L7(AnonymousClass4L8.A00, "slider_vote_count"), new AnonymousClass4L7(r3, "text_color"), new AnonymousClass4L7(r2, "viewer_can_vote")});
    }

    public static AnonymousClass4Kx A06() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "full_name");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r2, "has_onboarded_to_text_post_app"), new AnonymousClass4L7(r2, "is_private"), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "pk_id"), new AnonymousClass4L7(r1, "profile_pic_id"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, C46476Dff.A01())});
    }

    public static AnonymousClass4Kx A07() {
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r1, "blocking"), new AnonymousClass4L7(r1, "followed_by"), new AnonymousClass4L7(r1, "following"), new AnonymousClass4L7(r1, "incoming_request"), new AnonymousClass4L7(r1, "is_bestie"), new AnonymousClass4L7(r1, "is_feed_favorite"), new AnonymousClass4L7(r1, "is_private"), new AnonymousClass4L7(r1, "is_restricted"), new AnonymousClass4L7(r1, "muting"), new AnonymousClass4L7(r1, "outgoing_request")});
    }

    public static AnonymousClass4Kx A08() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "full_name");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r2, "is_private"), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "pk_id"), new AnonymousClass4L7(r1, "profile_pic_id"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, C46476Dff.A01())});
    }

    public static AnonymousClass4Kx A09() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "full_name");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r2, "is_private"), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "pk_id"), new AnonymousClass4L7(r1, "profile_pic_id"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, Dbm.A01())});
    }

    public static AnonymousClass4Kx A0A() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "full_name");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, r4, new AnonymousClass4L7(r2, "is_private"), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "pk_id"), new AnonymousClass4L7(r1, "profile_pic_id"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, AnonymousClass9PN.A00())});
    }

    public static AnonymousClass4Kx A0B() {
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r2, "disabled_sharing_products_to_guides");
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, new AnonymousClass4L7(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r2, "is_verified"), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(r1, "storefront_attribution_username"), new AnonymousClass4L7(r1, AnonymousClass9PN.A00())});
    }

    public static AnonymousClass4Kx A0C() {
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(new AnonymousClass4L3(r2), "appearance_effect");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(new AnonymousClass4L3(r2), "camera_tool");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4Kz.A00), "color_filters");
        C342787pA r1 = C342787pA.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, r4, r5, new AnonymousClass4L7(r1, "duration_selector_seconds"), new AnonymousClass4L7(r1, "speed_selector"), new AnonymousClass4L7(r1, "timer_selector_seconds")});
    }

    public static AnonymousClass4Kx A0D() {
        C342787pA r6 = C342787pA.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(new AnonymousClass4L3(r6), "crop_bottom"), new AnonymousClass4L7(new AnonymousClass4L3(r6), "crop_left"), new AnonymousClass4L7(new AnonymousClass4L3(r6), "crop_right"), new AnonymousClass4L7(new AnonymousClass4L3(r6), "crop_top")});
    }

    public static AnonymousClass4Kx A0E() {
        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(new AnonymousClass4L3(r2), "app_id"), new AnonymousClass4L7(r2, "button_label"), new AnonymousClass4L7(r2, "category_type"), new AnonymousClass4L7(r2, "display_category_name"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "partner_name"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "partner_type"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "url")});
    }

    public static AnonymousClass4Kx A0F(AnonymousClass4L0 r6, AnonymousClass4L0 r7, AnonymousClass4Kr r8, AnonymousClass4Kr r9, AnonymousClass4Kr r10) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r8, r9, r10, new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4LF.A00), "reminder_enabled"), new AnonymousClass4L7(new AnonymousClass4L3(r6), TraceFieldType.StartTime), new AnonymousClass4L7(r7, "strong_id__"), new AnonymousClass4L7(new AnonymousClass4L3(r7), DialogModule.KEY_TITLE), new AnonymousClass4L7(new AnonymousClass4L3(r7), "upcoming_event_id_type")});
    }

    public static AnonymousClass4Kx A0G(AnonymousClass4L0 r7, AnonymousClass4L1 r8) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r8, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4LF.A00), "is_preselected"), new AnonymousClass4L7(new AnonymousClass4L3(r7), PublicKeyCredentialControllerUtility.JSON_KEY_NAME), new AnonymousClass4L7(r7, "normalized_value"), new AnonymousClass4L7(new AnonymousClass4L3(r7), IntentModule.EXTRA_MAP_KEY_FOR_VALUE), new AnonymousClass4L7(new AnonymousClass4L3(r7), "visual_style")});
    }

    public static AnonymousClass4Kx A0H(AnonymousClass4L0 r9, AnonymousClass4L1 r10, AnonymousClass4Kr r11, AnonymousClass4Kr r12, AnonymousClass4Kr r13) {
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r10, "offset_y");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(new AnonymousClass4L3(r9), "rotation_degree");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(new AnonymousClass4L3(r9), "scale");
        AnonymousClass4L7 r6 = new AnonymousClass4L7(new AnonymousClass4L3(r9), "start_time_ms");
        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r11, r12, r13, r3, r4, r5, r6, new AnonymousClass4L7(new AnonymousClass4L3(r2), "sticker_id"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "sticker_type"), new AnonymousClass4L7(new AnonymousClass4L3(r9), IgReactMediaPickerNativeModule.WIDTH), new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4L8.A00), "z_index")});
    }

    public static AnonymousClass4Kx A0I(AnonymousClass4L1 r13) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r13, "blocking"), new AnonymousClass4L7(r13, "followed_by"), new AnonymousClass4L7(r13, "following"), new AnonymousClass4L7(r13, "incoming_request"), new AnonymousClass4L7(r13, "is_bestie"), new AnonymousClass4L7(r13, "is_eligible_to_subscribe"), new AnonymousClass4L7(r13, "is_feed_favorite"), new AnonymousClass4L7(r13, "is_private"), new AnonymousClass4L7(r13, "is_restricted"), new AnonymousClass4L7(r13, "muting"), new AnonymousClass4L7(r13, "outgoing_request"), new AnonymousClass4L7(r13, "subscribed")});
    }

    public static AnonymousClass4Kx A0J(AnonymousClass4L1 r13, AnonymousClass4L1 r14) {
        AnonymousClass4L7 r2 = new AnonymousClass4L7(r13, "end_time_ms");
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r13, IgReactMediaPickerNativeModule.HEIGHT);
        AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, r3, new AnonymousClass4L7(r1, "is_fb_sticker"), new AnonymousClass4L7(r1, "is_hidden"), new AnonymousClass4L7(r1, "is_pinned"), new AnonymousClass4L7(r1, "is_sticker"), new AnonymousClass4L7(r14, "rotation"), new AnonymousClass4L7(r14, "start_time_ms"), new AnonymousClass4L7(r14, IgReactMediaPickerNativeModule.WIDTH), new AnonymousClass4L7(r14, "x"), new AnonymousClass4L7(r14, "y"), new AnonymousClass4L7(r14, "z")});
    }

    public static AnonymousClass4Kx A0K(AnonymousClass4L1 r13, AnonymousClass4L1 r14) {
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r13, "address");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r13, ServerW3CShippingAddressConstants.CITY);
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r13, "external_source");
        AnonymousClass69U r1 = AnonymousClass69U.A00;
        AnonymousClass4L7 r6 = new AnonymousClass4L7(r1, "facebook_places_id");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        AnonymousClass4L7 r7 = new AnonymousClass4L7(r2, "has_viewer_saved");
        AnonymousClass4L7 r8 = new AnonymousClass4L7(r2, "is_eligible_for_guides");
        C342787pA r22 = C342787pA.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, r4, r5, r6, r7, r8, new AnonymousClass4L7(r22, "lat"), new AnonymousClass4L7(r22, "lng"), new AnonymousClass4L7(r14, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), new AnonymousClass4L7(r1, "pk"), new AnonymousClass4L7(r14, "short_name")});
    }

    public static AnonymousClass4Kx A0L(AnonymousClass4L1 r9, AnonymousClass4L1 r10, AnonymousClass4Kr r11, AnonymousClass4Kr r12, AnonymousClass4Kr r13) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r11, r12, r13, new AnonymousClass4L7(r9, "is_private"), new AnonymousClass4L7(r9, "is_verified"), new AnonymousClass4L7(r10, "pk"), new AnonymousClass4L7(r10, "pk_id"), new AnonymousClass4L7(r10, "profile_pic_id"), new AnonymousClass4L7(r10, "profile_pic_url"), new AnonymousClass4L7(r10, C46367Ddj.A00())});
    }

    public static AnonymousClass4Kx A0M(AnonymousClass4L1 r8, AnonymousClass4L1 r9, AnonymousClass4Kr r10, AnonymousClass4Kr r11, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r10, r11, new AnonymousClass4L7(r8, str), new AnonymousClass4L7(r8, "is_verified"), new AnonymousClass4L7(r9, "pk"), new AnonymousClass4L7(r9, "pk_id"), new AnonymousClass4L7(r9, "profile_pic_id"), new AnonymousClass4L7(r9, "profile_pic_url"), new AnonymousClass4L7(r9, C46367Ddj.A00())});
    }

    public static AnonymousClass4Kx A0N(AnonymousClass4L1 r12, AnonymousClass4L1 r13, AnonymousClass4Kr r14, AnonymousClass4Kr r15, String str) {
        AnonymousClass4L7 r2 = new AnonymousClass4L7(r12, str);
        AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r14, r15, r2, new AnonymousClass4L7(r1, "is_fb_sticker"), new AnonymousClass4L7(r1, "is_hidden"), new AnonymousClass4L7(r1, "is_pinned"), new AnonymousClass4L7(r1, "is_sticker"), new AnonymousClass4L7(r13, "rotation"), new AnonymousClass4L7(r13, "start_time_ms"), new AnonymousClass4L7(r13, IgReactMediaPickerNativeModule.WIDTH), new AnonymousClass4L7(r13, "x"), new AnonymousClass4L7(r13, "y"), new AnonymousClass4L7(r13, "z")});
    }

    public static AnonymousClass4Kx A0O(AnonymousClass4Kr r10, Class cls, int i) {
        AnonymousClass4Kp r2 = new AnonymousClass4Kp(cls, "consumption_sheet_config", i);
        AnonymousClass4L7 r3 = new AnonymousClass4L7(AnonymousClass4L8.A00, "donations_count");
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r10, r2, r3, new AnonymousClass4L7(r1, "formatted_amount_raised"), new AnonymousClass4L7(r1, "formatted_amount_raised_of_goal_amount_str"), new AnonymousClass4L7(r1, "formatted_donations_count"), new AnonymousClass4L7(r1, "formatted_goal_amount"), new AnonymousClass4L7(r1, "fundraiser_title"), new AnonymousClass4L7(AnonymousClass69U.A00, "standalone_fundraiser_id")});
    }

    public static AnonymousClass4Kr[] A0P(AnonymousClass4L0 r8, AnonymousClass4L0 r9, AnonymousClass4L0 r10, AnonymousClass4Kr r11, AnonymousClass4Kr r12) {
        AnonymousClass4L7 r3 = new AnonymousClass4L7(new AnonymousClass4L3(r8), "display_artist");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(new AnonymousClass4L3(r8), "display_title");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(new AnonymousClass4L3(r9), "duration_in_ms");
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kr[]{r11, r12, r3, r4, r5, new AnonymousClass4L7(new AnonymousClass4L3(r2), "is_bookmarked"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "is_explicit"), new AnonymousClass4L7(new AnonymousClass4L3(r10), "music_canonical_id"), new AnonymousClass4L7(new AnonymousClass4L3(r9), "parent_start_time_in_ms"), new AnonymousClass4L7(new AnonymousClass4L3(r10), "thumbnail_uri")};
    }
}
