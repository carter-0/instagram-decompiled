package X;

/* renamed from: X.Df5  reason: case insensitive filesystem */
public enum C46443Df5 {
    FOLLOWERS(0, false),
    FOLLOWING(1, false),
    FOLLOWING_SIMPLIFIED(2, false),
    MUTUAL(3, false),
    SIMILAR(4, false),
    UNFOLLOW_CHAIN(5, false),
    GROUPS(6, true),
    GROUP_FOLLOWERS(7, true),
    GROUP_FOLLOWING(8, true),
    MISINFORMATION(9, false),
    GROUP_PROFILE_MEMBERS(10, false),
    GROUP_PROFILE_ADMINS(11, false),
    GROUP_PROFILE_BLOCKED(12, false),
    SUBSCRIBED(13, false),
    SELF_FOLLOWERS(14, false),
    SELF_FOLLOWING(15, false),
    SPAM_FOLLOWERS(16, false),
    UNKNOWN(17, false);
    
    public final String A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        C46443Df5[] df5Arr;
        A02 = 0oU.A00(df5Arr);
    }

    /* access modifiers changed from: public */
    C46443Df5(int i, boolean z) {
        this.A00 = r2;
        this.A01 = z;
    }
}
