package X;

import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MkG  reason: case insensitive filesystem */
public enum C67220MkG {
    DEFAULT(0, 0, 0, 0, false, false),
    NEW_THREADS_THROTTLED_BANNER(1, R.drawable.instagram_warning_pano_outline_24, 2131968312, 2, true, true),
    NEW_THREADS_THROTTLED_LIGHT_BANNER(2, 0, 2131968315, 2, false, false),
    GENERAL_FOLDER_HMPS_BANNER(3, R.drawable.instagram_error_pano_outline_24, 2131963478, 4, true, true),
    GENERAL_FOLDER_HMPS_LIGHT_BANNER(4, 0, 2131963480, 4, false, false),
    GENERAL_FOLDER_RECOVERED_BANNER(5, R.drawable.instagram_info_pano_outline_24, 2131963482, 0, true, true);
    
    public static final Map A06 = null;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;

    /* access modifiers changed from: public */
    static {
        C67220MkG[] mkGArr;
        A07 = 0oU.A00(mkGArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (C67220MkG mkG : values()) {
            A0x.put(Integer.valueOf(mkG.A02), mkG);
        }
        A06 = A0x;
    }

    /* access modifiers changed from: public */
    C67220MkG(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A02 = i;
        this.A04 = z;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = z2;
        this.A03 = i4;
    }
}
