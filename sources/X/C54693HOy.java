package X;

import com.instagram.android.R;

/* renamed from: X.HOy  reason: case insensitive filesystem */
public enum C54693HOy implements JQD {
    DOGFOOD_ASSISTANT(2131956646, R.drawable.instagram_info_pano_outline_24, false),
    LAUNCHER_FLAGS(2131956643, R.drawable.instagram_settings_pano_outline_24, false),
    VIEW_PROFILE(2131956647, R.drawable.instagram_user_circle_pano_outline_24, false),
    BLOCK(2131956605, R.drawable.instagram_block_pano_outline_24, true),
    UNFOLLOW(2131956606, R.drawable.instagram_user_unfollow_pano_outline_24, true);
    
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* access modifiers changed from: public */
    static {
        C54693HOy[] hOyArr;
        A03 = 0oU.A00(hOyArr);
    }

    public final int BEI() {
        return this.A00;
    }

    public final int BKN() {
        return this.A01;
    }

    public final boolean isNegative() {
        return this.A02;
    }

    /* access modifiers changed from: public */
    C54693HOy(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }
}
