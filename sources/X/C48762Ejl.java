package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ejl  reason: case insensitive filesystem */
public abstract class C48762Ejl {
    public static final ES1 A00(UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("should_show_captions_toggle_description", z);
        A09.putBoolean("is_surface_elevated", z2);
        A09.putString("entrypoint", str);
        A09.putString("media_id", str2);
        A09.putBoolean("media_has_caption_translations", z3);
        A09.putBoolean("media_has_sticker_dubbing", z4);
        A09.putBoolean("media_has_dubbing", z5);
        ES1 es1 = new ES1();
        es1.setArguments(A09);
        return es1;
    }
}
