package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ELz  reason: case insensitive filesystem */
public final class C47905ELz extends C47666ECa {
    public final UserSession A00;
    public final DialogInterface.OnDismissListener A01;
    public final AnonymousClass4DH A02;
    public final 1Xj A03;

    public C47905ELz(DialogInterface.OnDismissListener onDismissListener, AnonymousClass4DH r8, UserSession userSession, 1Xj r10) {
        super(onDismissListener, r8, userSession, r10, "isUpdating");
        this.A02 = r8;
        this.A00 = userSession;
        this.A03 = r10;
        this.A01 = onDismissListener;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(453962196);
        int A033 = AnonymousClass0fD.A03(-2039300790);
        1Xj r1 = this.A00;
        DbX.A1Q(r1, 0);
        UserSession userSession = this.A00;
        r1.AE7(userSession);
        User A0j = DbT.A0j(userSession);
        A0j.A03.Ep1(Integer.valueOf(AnonymousClass7TG.A0A(A0j.A03.C8l()) + 1));
        DbT.A1S(userSession, A0j);
        AnonymousClass0fD.A0A(-965204429, A033);
        AnonymousClass0fD.A0A(1364862331, A032);
    }
}
