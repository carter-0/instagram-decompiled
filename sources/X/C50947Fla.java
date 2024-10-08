package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fla  reason: case insensitive filesystem */
public final class C50947Fla implements G6O {
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1T(context, userSession, fragmentActivity);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("entrypoint", "search");
        DbW.A0W(fragmentActivity, A0a, userSession, ModalActivity.class, "quiet_mode_settings").A0C(context);
    }
}
