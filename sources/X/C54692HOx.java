package X;

import com.instagram.android.R;

/* renamed from: X.HOx  reason: case insensitive filesystem */
public enum C54692HOx implements JQD {
    ADD_NOTE(2131956641, R.drawable.instagram_add_pano_outline_24, false),
    VIEW_PROFILE(2131956647, R.drawable.instagram_user_circle_pano_outline_24, false),
    MUTE(2131956644, R.drawable.instagram_eye_off_pano_outline_24, false),
    REPORT(2131956645, R.drawable.instagram_report_pano_outline_24, true),
    DELETE_NOTE(2131956642, R.drawable.instagram_delete_pano_outline_24, true);
    
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* access modifiers changed from: public */
    static {
        C54692HOx[] hOxArr;
        A03 = 0oU.A00(hOxArr);
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
    C54692HOx(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }
}
