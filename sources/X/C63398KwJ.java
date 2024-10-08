package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.KwJ  reason: case insensitive filesystem */
public abstract class C63398KwJ {
    public static final void A00(Activity activity, AnonymousClass87I r4, UserSession userSession, String str, String str2, String str3) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("dial_type", r4.A00);
        A0a.putString("list_id", str);
        A0a.putString("list_name", str2);
        A0a.putString("emoji", str3);
        Dbb.A0i(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(3198));
    }
}
