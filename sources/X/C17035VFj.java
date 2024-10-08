package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.VFj  reason: case insensitive filesystem */
public abstract class C17035VFj {
    public static void A00(Activity activity, Context context, UserSession userSession, String str, String str2) {
        Bundle A01 = C46447Df9.A02().A01(userSession, C46474Dfc.A01(userSession, str, "fundraiser_sticker", str2));
        Activity activity2 = activity;
        new AnonymousClass6W8(activity2, A01, userSession, ModalActivity.class, "profile").A0C(context);
    }
}
