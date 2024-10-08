package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.AKj  reason: case insensitive filesystem */
public final class C39943AKj implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ C335377cr A03;
    public final /* synthetic */ UserSession A04;

    public C39943AKj(Activity activity, 28D r2, AnonymousClass4DH r3, C335377cr r4, UserSession userSession) {
        this.A04 = userSession;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A04;
        1Au.A00(userSession).A0M();
        I4D.A00.A01(this.A00, this.A01, this.A02, this.A03, userSession);
    }
}
