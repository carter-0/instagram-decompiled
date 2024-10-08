package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.ELy  reason: case insensitive filesystem */
public final class C47904ELy extends C47666ECa {
    public final UserSession A00;
    public final DialogInterface.OnDismissListener A01;
    public final AnonymousClass4DH A02;
    public final 1Xj A03;

    public C47904ELy(DialogInterface.OnDismissListener onDismissListener, AnonymousClass4DH r8, UserSession userSession, 1Xj r10) {
        super(onDismissListener, r8, userSession, r10, "isDeleting");
        this.A02 = r8;
        this.A00 = userSession;
        this.A03 = r10;
        this.A01 = onDismissListener;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-937031344);
        int A033 = AnonymousClass0fD.A03(-106077553);
        1Xj r1 = this.A00;
        r1.A00 = 2;
        r1.AE7(this.A00);
        AnonymousClass0fD.A0A(521469954, A033);
        AnonymousClass0fD.A0A(1808879901, A032);
    }
}
