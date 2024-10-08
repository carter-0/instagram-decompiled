package X;

/* renamed from: X.5Gm  reason: invalid class name and case insensitive filesystem */
public enum C283195Gm {
    USER_SINGLE_MEDIA(1),
    ENTITY_MULTI_MEDIA(2),
    USER_FOLLOW(3),
    USER_SIMPLE(4),
    FOLLOW_REQUEST(5),
    GROUPED_FRIEND_REQUEST(6),
    DIRECT_SHARE(9),
    COPYRIGHT_VIDEO_REMOVED(10),
    COPYRIGHT_VIDEO_REINSTATED(11),
    CAMPAIGN_MESSAGE(13),
    USER_COMMENT_LIKED_SINGLE_MEDIA(14),
    INSIGHTS_ENTRY(15),
    CANVAS_PREVIEW(16),
    USER_REEL(17),
    BUNDLE_WITH_ICON(18),
    ICON_WITH_INLINE_BUTTON(19);
    
    public static final 01s A01 = null;
    public int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new 01s();
        for (C283195Gm r2 : values()) {
            A01.A07(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C283195Gm(int i) {
        this.A00 = i;
    }
}
