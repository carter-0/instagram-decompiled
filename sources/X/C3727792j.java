package X;

import java.util.regex.Pattern;

/* renamed from: X.92j  reason: invalid class name and case insensitive filesystem */
public enum C3727792j {
    PROFILE_FEED("profile_feed"),
    GRAPHQL_PROFILE_FEED("graphql_profile_feed"),
    USER_INFO("user_info"),
    GRAPHQL_USER_INFO("graphql_user_info"),
    STORY_HIGHLIGHTS("story_highlights"),
    USER_STORY("user_story");
    
    public static final Pattern A01 = null;
    public static final Pattern A02 = null;
    public static final Pattern A03 = null;
    public static final Pattern A04 = null;
    public static final Pattern A05 = null;
    public static final Pattern A06 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C3727792j[] r0;
        A07 = 0oU.A00(r0);
        A03 = Pattern.compile(002.A0C("profile_feed", '$'));
        A01 = Pattern.compile(002.A0C("graphql_profile_feed", '$'));
        A05 = Pattern.compile(002.A0C("user_info", '$'));
        A02 = Pattern.compile(002.A0C("graphql_user_info", '$'));
        A04 = Pattern.compile(002.A0C("story_highlights", '$'));
        A06 = Pattern.compile(002.A0C("user_story", '$'));
    }

    /* access modifiers changed from: public */
    C3727792j(String str) {
        this.A00 = str;
    }
}
