package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.KwV  reason: case insensitive filesystem */
public abstract class C63409KwV {
    public static final void A00(Activity activity, 28D r5, UserSession userSession, C387339m3 r7) {
        AnonymousClass7TG.A1O(userSession, r7);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("group_mention_sticker_model", r7.A00());
        A0a.putSerializable(AnonymousClass000.A00(117), r5);
        DbU.A0x(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(3219));
    }
}
