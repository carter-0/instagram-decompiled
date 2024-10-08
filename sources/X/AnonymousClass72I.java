package X;

import android.app.Activity;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.72I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass72I implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C323366xN A01;
    public final /* synthetic */ User A02;

    public /* synthetic */ AnonymousClass72I(Activity activity, C323366xN r2, User user) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = user;
    }

    public final void onClick(View view) {
        C323366xN r1 = this.A01;
        C49070Eoo.A00(r1.A0E, this.A00, this.A02.getId());
    }
}
