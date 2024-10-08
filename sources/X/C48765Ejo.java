package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ejo  reason: case insensitive filesystem */
public abstract class C48765Ejo {
    public static final ES2 A00(UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(userSession, 0);
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("is_surface_elevated", z);
        A09.putString("entrypoint", str);
        A09.putString("media_id", str2);
        A09.putBoolean("media_has_caption_translations", z2);
        A09.putBoolean("media_has_sticker_dubbing", z3);
        A09.putBoolean("media_has_dubbing", z4);
        ES2 es2 = new ES2();
        es2.setArguments(A09);
        return es2;
    }
}
