package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lrs  reason: case insensitive filesystem */
public final class C65352Lrs implements C66491MTu {
    public final int A00;
    public final Object A01;

    public C65352Lrs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D1x(Context context) {
        if (this.A00 != 0) {
            FragmentActivity A06 = 2MD.A01().A06();
            if (A06 != null) {
                C48732EjH.A00().A02(A06, (UserSession) this.A01, "notification", (String) null, false);
                return;
            }
            return;
        }
        C64501Ld2 ld2 = (C64501Ld2) this.A01;
        UserSession userSession = ld2.A02;
        Bundle A012 = C46447Df9.A02().A01(userSession, C46474Dfc.A01(userSession, userSession.A06, AnonymousClass000.A00(297), "inline_add_to_highlight"));
        Context context2 = ld2.A00;
        DbS.A0b((Activity) context2, A012, userSession, ModalActivity.class, "profile").A0C(context2);
    }

    public final void onDismiss() {
    }
}
