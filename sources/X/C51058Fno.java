package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fno  reason: case insensitive filesystem */
public final class C51058Fno implements C267694c3 {
    public final /* synthetic */ C47525E6l A00;
    public final /* synthetic */ User A01;

    public C51058Fno(C47525E6l e6l, User user) {
        this.A00 = e6l;
        this.A01 = user;
    }

    public final void DwS(int i) {
        int i2;
        1Wj r3 = 1Wj.A00;
        if (r3 != null) {
            C47525E6l e6l = this.A00;
            FragmentActivity requireActivity = e6l.requireActivity();
            UserSession A0l = AnonymousClass7TE.A0l(e6l.A0C);
            if (this.A01.CPm()) {
                i2 = 2067;
            } else {
                i2 = 2066;
            }
            r3.A03(A0l, requireActivity, AnonymousClass000.A00(i2));
        }
    }
}
