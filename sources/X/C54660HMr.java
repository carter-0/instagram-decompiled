package X;

/* renamed from: X.HMr  reason: case insensitive filesystem */
public enum C54660HMr {
    UNKNOWN("unknown"),
    SINGLE_UNTAG("single_untag"),
    SINGLE_UNTAG_CONFIRMATION_DIALOG("single_untag_confirmation_dialog"),
    MULTI_UNTAG("multi_untag"),
    TAG_DIRECT("tag_direct"),
    DISABLE_REMIX_CONFIRMATION_DIALOG("disable_remix_confirmation_dialog"),
    INBOX_DELETE("delete_from_inbox"),
    MULTI_INBOX_DELETE("multi_delete_from_inbox"),
    ALL_INBOX_DELETE("delete_all_from_inbox"),
    COMPOSER_DELETE("delete_from_composer"),
    UNLIKED_MEDIA("unliked_media"),
    UNLIKED_CLIPS("unliked_clips"),
    UNLIKED_FEED("feed"),
    DELETE_POST("delete_post"),
    DELETE_CLIPS("delete_clips"),
    EDIT_PROFILE("edit_profile"),
    SECURITY_SETTINGS("security_settings"),
    ACCOUNT_SETTINGS("account_settings"),
    DISMISS_INBOX_NUDGE("dismiss_inbox_nudge_thread_view"),
    COMMENT_OFF("comment_off"),
    COMMENT_SPIKE("comment_spike"),
    COMMENTS_CONTROLS("comment_controls_entrypoint"),
    BC_COMMENTS_CONTROLS("broadcast_chat_comment_controls"),
    COMMENT_HIDE_MORE_COMMENTS("comment_hide_more_comments"),
    COMMENT_CUSTOM_FILTER("comment_custom_filter"),
    COMMENT_DELETION_BLOCK("comment_deletion_block"),
    COMMENT_SUGGESTED_HIDDEN_WORDS("comment_suggested_hidden_words"),
    COMMENT_SUGGESTED_HIDDEN_WORDS_V2("comment_suggested_hidden_words_v2"),
    COMMENT_RESTRICT_ON_POST("comment_restrict_on_post"),
    COMMENT_BLOCK_COMMENTS_FROM("comment_block_comments_from");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C54660HMr[] hMrArr;
        A01 = 0oU.A00(hMrArr);
    }

    /* access modifiers changed from: public */
    C54660HMr(String str) {
        this.A00 = str;
    }
}
