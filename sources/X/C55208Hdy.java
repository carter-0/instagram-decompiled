package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Hdy  reason: case insensitive filesystem */
public abstract class C55208Hdy {
    public static final void A00(Activity activity, HOV hov, UserSession userSession, 1Xj r7) {
        AnonymousClass7TG.A1U(userSession, r7, hov);
        if (182.A06(0Tu.A05, userSession, 36329083952447258L)) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("arg_entry_media_id", r7.getId());
            A0a.putSerializable("arg_entry_surface", hov);
            AnonymousClass6W8.A03(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(1417)).A0C(activity);
        }
    }
}
