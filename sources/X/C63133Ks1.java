package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ks1  reason: case insensitive filesystem */
public abstract class C63133Ks1 {
    public static final KKN A00(UserSession userSession, C63705L3p l3p) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("args_below_status_bar", true);
        A0a.putBoolean("has_album_picker_config", true);
        A0a.putBoolean("args_apc__meta_gallery_enabled", l3p.A01);
        A0a.putBoolean("args_is_photo_only", l3p.A00);
        AnonymousClass0Dg.A00(A0a, userSession);
        Fragment k5k = new K5K();
        k5k.setArguments(A0a);
        return k5k;
    }
}
