package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ELx  reason: case insensitive filesystem */
public final class C47903ELx extends C47666ECa {
    public final UserSession A00;
    public final C311526cp A01;

    public C47903ELx(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, 1Xj r12) {
        super(onDismissListener, fragment, userSession, r12, "isDeleting");
        this.A00 = userSession;
        this.A01 = new C311526cp(userSession, fragment.requireActivity());
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1755980763);
        int A032 = AnonymousClass0fD.A03(1755957368);
        1Xj r0 = this.A00;
        DbX.A1Q(r0, 1);
        UserSession userSession = this.A00;
        r0.AE7(userSession);
        User A0j = DbT.A0j(userSession);
        A0j.A03.Ep1(Integer.valueOf(AnonymousClass7TG.A0A(A0j.A03.C8l()) - 1));
        DbT.A1S(userSession, A0j);
        this.A01.A00((DialogInterface.OnDismissListener) null, false);
        AnonymousClass0fD.A0A(-1999145642, A032);
        AnonymousClass0fD.A0A(1692862402, A03);
    }
}
