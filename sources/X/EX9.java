package X;

public enum EX9 {
    INLINE_UPSELL("inline_upsell"),
    REVISED_INLINE_UPSELL("revised_inline_upsell"),
    CI_INTERSTITIAL_UPSELL("ci_interstitial_upsell"),
    FEED_SUGGESTED_USERS_UPSELL("feed_suggested_users_netego"),
    FEED_SUGGESTED_PRODUCERS_UPSELL("feed_suggested_producers_netego"),
    SERP_USERS_CI_UPSELL("serp_users_ci_upsell"),
    SEARCH_NULLSTATE_UPSELL("search_null_state_upsell"),
    QP("qp"),
    NON_FEED_ACTIVATOR_CARD("non_feed_activator_card"),
    CI_NUX_STEP("find_friends_addressbook"),
    ACCOUNT_SETTINGS("account_settings"),
    PROFILE_DISCOVER_PEOPLE_CI_UPSELL("profile_discover_people_ci_upsell"),
    OTHERS_PROFILE_CHAINING("profile"),
    PARTIAL_CI_NUX("partial_ci_nux"),
    EMPTY_STORIES_STATE_CI_UPSELL("empty_stories_state_ci_upsell"),
    NEWSFEED_SU_EARLY_FRIENDING("newsfeed_su_early_friending"),
    PUSH_NOTIFICATION("push_notification"),
    ACTIVITY_FEED_NOTIFICATION("activity_feed_notification"),
    DIRECT_INBOX("direct_inbox"),
    UNKNOWN("unknown");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EX9[] ex9Arr;
        A01 = 0oU.A00(ex9Arr);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX9(String str) {
        this.A00 = str;
    }
}
