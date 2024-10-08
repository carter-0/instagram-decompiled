package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.OiZ  reason: case insensitive filesystem */
public final class C71328OiZ implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public C71328OiZ(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1985266587);
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        AnonymousClass6W8.A02(activity, AnonymousClass7TE.A0a(), userSession, TransparentModalActivity.class, C273654mx.A00(3224)).A0C(activity);
        AnonymousClass0fD.A0C(1047829222, A05);
    }
}
