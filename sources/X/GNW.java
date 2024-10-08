package X;

import com.instagram.android.R;

public enum GNW {
    CLIPS_LAYOUT(r0.A00, 0, R.drawable.instagram_layout_pano_outline_24, 2131953223, 2131976214),
    DUAL(r0.A00, 1, R.drawable.instagram_dual_camera_pano_outline_24, 2131953218, 2131976212),
    SOUND_SYNC(r0.A00, 2, R.drawable.instagram_dual_camera_pano_outline_24, 2131953221, 2131976213);
    
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    /* access modifiers changed from: public */
    static {
        GNW[] gnwArr;
        A05 = 0oU.A00(gnwArr);
    }

    /* access modifiers changed from: public */
    GNW(String str, int i, int i2, int i3, int i4) {
        this.A04 = r2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = str;
    }
}
