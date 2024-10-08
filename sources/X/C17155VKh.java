package X;

import com.instagram.android.R;
import java.util.HashMap;

/* renamed from: X.VKh  reason: case insensitive filesystem */
public abstract class C17155VKh {
    public static final C16550Uwx A00;
    public static final HashMap A01;

    static {
        C16550Uwx uwx = C16550Uwx.GOOGLE_PLAY_STORE_DARK;
        A00 = uwx;
        C16550Uwx uwx2 = C16550Uwx.GOOGLE_PLAY_STORE_LIGHT;
        Integer valueOf = Integer.valueOf(R.drawable.google_play_store);
        A01 = 0Yt.A02(new 0eP[]{new 0eP(uwx2, valueOf), new 0eP(uwx, valueOf), AnonymousClass7TF.A0x(C16550Uwx.APPLE_APP_STORE_LIGHT, R.drawable.apple_app_store_light), AnonymousClass7TF.A0x(C16550Uwx.APPLE_APP_STORE_DARK, R.drawable.apple_app_store_dark)});
    }
}
