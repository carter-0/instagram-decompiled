package com.instagram.quickpromotion.model;

import X.0oU;
import X.0se;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FilterType {
    SECONDS_SINCE_LAST_IMPRESSION("seconds_since_last_impression"),
    INSTAGRAM_USER_HAS_CAL_TOKEN("instagram_user_has_cal_token"),
    OTHER_PROMOTION_EVENT("other_promotion_event"),
    INSTAGRAM_PUSH_ENABLED("instagram_push_enabled"),
    BARCELONA_PUSH_ENABLED("barcelona_push_enabled"),
    IG_WIFI_CONNECTED("ig_wifi_connected"),
    INSTAGRAM_USER_HAS_MULTIPLE_PROFILE_BIO_LINKS_ENABLED("instagram_user_has_multiple_profile_bio_links_enabled"),
    INSTAGRAM_USER_HAS_MULTIPLE_ACCOUNTS_LOGGED_IN("instagram_user_has_multiple_accounts_logged_in"),
    INSTAGRAM_USER_HAS_NAV3_ENABLED_LOCALLY("instagram_user_has_nav3_enabled_locally"),
    INSTAGRAM_FACEBOOK_APP_INSTALLED("instagram_facebook_app_installed"),
    INSTAGRAM_USER_USED_APP_MORE_THAN_ONCE("instagram_user_used_app_more_than_once"),
    INSTAGRAM_USER_NEVER_DECLINED_RATING_THE_APP_USING_LEGACY_APPIRATER("instagram_user_never_declined_rating_the_app_using_legacy_appirater"),
    INSTAGRAM_USER_NEVER_RATED_THE_APP_USING_LEGACY_APPIRATER("instagram_user_never_rated_the_app_using_legacy_appirater"),
    INSTAGRAM_SHOPPING_CART_NUX("instagram_shopping_bag_nux"),
    INSTAGRAM_IGTVAPP_INSTALLED("instagram_igtvapp_installed"),
    INSTAGRAM_USER_INTEROP_GATING_STATUS("instagram_user_interop_gating_status"),
    INSTAGRAM_INTEROP_NUX_COOLDOWN("instagram_user_recently_saw_interop_nux"),
    HAS_LOGGED_IN_BUSINESS_ACCOUNT("has_logged_in_business_account"),
    IS_CURRENTLY_DARK_MODE("instagram_is_currently_dark_mode"),
    DARK_MODE_QE_ITERATION_ID("instagram_dark_mode_qe_iteration_id"),
    DARK_MODE_QE_PREVIOUS_ITERATION_ID("instagram_dark_mode_qe_previous_iteration_id"),
    VIDEO_CALL_ROOM_ELIGIBLE("instagram_user_is_eligible_for_video_call_room"),
    INSTAGRAM_USER_HAS_SEEN_INTEROP_MAIN_DISCLOSURE_HALF_SHEET("instagram_user_has_seen_interop_main_disclosure_half_sheet"),
    CONTACT_SYNC_ENABLED("contact_sync_enabled"),
    SUPPORT_RESOURCES_CSOM("support_resources_ssi_inbox_instagram"),
    INSTAGRAM_USER_HAS_LOCATION_SERVICES_ENABLED("instagram_user_has_location_services_enabled"),
    INSTAGRAM_USER_CAN_RECEIVE_VC_NOTIFICATION_UPSELL("instagram_user_can_receive_video_call_notification_upsell"),
    INSTAGRAM_DIRECT_THREAD_MEMBERS_WA_ADDRESSABLE("instagram_direct_thread_members_wa_addressable"),
    INSTAGRAM_DIRECT_CLIENT_E2EE_ENABLED("instagram_direct_client_e2ee_enabled"),
    INSTAGRAM_DIRECT_THREAD_IS_GROUP("instagram_direct_thread_is_group"),
    INSTAGRAM_DIRECT_THREAD_VIEWER_IS_PARTICIPANT("instagram_direct_thread_viewer_is_participant"),
    INSTAGRAM_DIRECT_THREAD_MAX_GROUP_PARTICIPANTS_SIZE("instagram_direct_thread_max_group_participants_size"),
    INSTAGRAM_DIRECT_THREAD_MEMBERS_ARMADILLO_GROUP_ELIGIBLE("instagram_direct_thread_members_armadillo_group_eligible"),
    INSTAGRAM_DIRECT_THREAD_MIN_GROUP_PARTICIPANTS_SIZE("instagram_direct_thread_min_group_participants_size"),
    INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_ARMADILLO_UPSELL("instagram_direct_thread_eligible_for_armadillo_upsell"),
    INSTAGRAM_USER_IS_THREAD_CO_PRESENT("instagram_user_is_thread_co_present"),
    INSTAGRAM_USER_IS_GROUP_THREAD_CO_PRESENT("instagram_user_is_group_thread_co_present"),
    INSTAGRAM_DIRECT_CLIENT_HIDDEN_WORDS_CONTROL_ENABLED("instagram_direct_client_hidden_words_control_enabled"),
    INSTAGRAM_DIRECT_CLIENT_ON_DEVICE_NUDITY_CONTROL_ENABLED("instagram_direct_client_on_device_nudity_control_enabled"),
    INSTAGRAM_DIRECT_CLIENT_ON_DEVICE_NUDITY_CONTROL_ON_BY_DEFAULT("instagram_direct_client_on_device_nudity_control_on_by_default"),
    INSTAGRAM_USER_LOGGED_IN_FROM_SWITCHER("instagram_user_logged_in_from_switcher"),
    INSTAGRAM_USER_LOGGED_IN_FROM_AYMH("instagram_user_logged_in_from_aymh"),
    INSTAGRAM_BROADCAST_CHAT_CREATION_ENABLED("instagram_broadcast_chat_creation_enabled"),
    INSTAGRAM_SUBSCRIBER_BROADCAST_CHANNEL_CREATION_ENABLED("instagram_subscriber_broadcast_channel_creation_enabled"),
    INSTAGRAM_CHANNEL_QP_ENABLED("instagram_channel_qp_enabled"),
    INSTAGRAM_USER_HAS_IGPC_MAIN_ACCOUNT_LOGGED_IN("instagram_user_has_igpc_main_account_logged_in"),
    INSTAGRAM_USER_SESSION_LENGTH("instagram_user_session_length"),
    FX_NATIVE_AUTH_TOKEN_EXISTENCE_FILTER("fx_native_auth_token_existence_filter"),
    INSTAGRAM_USER_HAS_ENABLED_TAKE_A_BREAK("instagram_user_has_enabled_take_a_break"),
    INSTAGRAM_USER_HAS_EVER_ENABLED_TAKE_A_BREAK("instagram_user_has_ever_enabled_take_a_break"),
    INSTAGRAM_USER_IS_ACTIVE_DURING_SPECIFIED_TIME("instagram_user_is_active_during_specified_time"),
    INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_ARMADILLO_BIZ_TOOLS_UPSELL("instagram_direct_thread_eligible_for_armadillo_biz_tools_upsell"),
    INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_DM_UPSELL("instagram_direct_thread_eligible_for_dm_upsell"),
    INSTAGRAM_NOTIFICATION_PROMPT_ENABLED("instagram_notification_prompt_enabled"),
    INSTAGRAM_DIRECT_THREAD_META_AI_COMMAND_ENABLED("instagram_user_is_thread_meta_ai_command_enabled"),
    INSTAGRAM_USER_AI_AGENTS_WAITLIST_ELIGIBLE("instagram_agents_waitist_eligible"),
    INSTAGRAM_USER_AI_AGENTS_ACCESS_GRANTED("instagram_user_ai_agents_access_granted"),
    INSTAGRAM_USER_HAS_ENABLED_DAILY_LIMIT("instagram_user_has_enabled_daily_limit"),
    INSTAGRAM_USER_HAS_META_AI_CLIENT_INITIALIZED("instagram_user_has_meta_ai_client_initialized"),
    INSTAGRAM_USER_DAILY_TIME_SPENT_LENGTH("instagram_user_daily_time_spent_length"),
    SAVE_PASSWORD_INTERSTITIAL("save_password_interstitial"),
    ACCOUNT_RECOVERY_SUCCESS("account_recovery_success"),
    INSTAGRAM_USER_HAS_VISITED_PARENTING_ACCOUNTS("instagram_user_has_visited_parenting_accounts"),
    INSTAGRAM_USER_HAS_FOLLOWED_PARENTING_ACCOUNTS("instagram_user_has_followed_parenting_accounts"),
    INSTAGRAM_USER_SUPERVISION_UPSELL_ELIGIBLE("instagram_user_supervision_upsell_eligible"),
    INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_PIN_UPSELL("instagram_direct_thread_eligible_for_pin_upsell"),
    LOGIN_MIS_AUTH_MEASUREMENT("login_mis_auth_measurement"),
    INSTAGRAM_DIRECT_CLIENT_THREAD_DELETION_REMINDER_ELIGIBLE("instagram_direct_client_thread_deletion_reminder_eligible"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        FilterType[] filterTypeArr;
        A02 = 0oU.A00(filterTypeArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (FilterType filterType : values()) {
            linkedHashMap.put(filterType.A00, filterType);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FilterType(String str) {
        this.A00 = str;
    }
}
