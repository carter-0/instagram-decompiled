package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.LTy  reason: case insensitive filesystem */
public final class C64208LTy implements DialogInterface.OnCancelListener {
    public final /* synthetic */ AnonymousClass6SP A00;
    public final /* synthetic */ String A01;

    public C64208LTy(AnonymousClass6SP r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        UserSession userSession = this.A00.A00;
        String str = this.A01;
        0qQ.A0B(userSession, 0);
        C63400KwL.A00(userSession, "cancel", str);
    }
}
