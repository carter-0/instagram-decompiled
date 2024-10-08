package X;

import com.instagram.android.R;

/* renamed from: X.3aK  reason: invalid class name and case insensitive filesystem */
public enum C243923aK {
    SMALL(R.drawable.following_avatar, R.drawable.follow_avatar, R.drawable.requested_avatar, R.drawable.follow_avatar, false),
    MEDIUM(R.drawable.following_icon, 0, R.drawable.requested_icon, 0, true),
    LARGE(R.drawable.following_icon, 0, R.drawable.requested_icon, R.drawable.follow_icon, true),
    ACTIONABLE_TEXT(R.drawable.actionable_chevron_down, 0, 0, 0, true),
    ACTIONBARICON(R.drawable.following_avatar, R.drawable.follow_avatar, R.drawable.requested_avatar, R.drawable.follow_avatar, false),
    INLINE_ICON(R.drawable.instagram_user_following_pano_filled_24, R.drawable.instagram_user_follow_pano_outline_24, R.drawable.instagram_user_requested_pano_filled_24, R.drawable.instagram_user_follow_pano_outline_24, false),
    COLLABORATOR_TEXT(R.drawable.collaborator_chevron_down, 0, 0, R.drawable.collaborator_chevron_down, true),
    MESSAGE_OPTION(0, 0, 0, 0, true),
    TEXT_ONLY(R.drawable.following_icon, 0, R.drawable.requested_icon, R.drawable.follow_icon, true);
    
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    /* access modifiers changed from: public */
    static {
        C243923aK[] r0;
        A05 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    C243923aK(int i, int i2, int i3, int i4, boolean z) {
        this.A04 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
