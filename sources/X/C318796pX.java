package X;

import android.app.Activity;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.6pX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C318796pX implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C323366xN A01;
    public final /* synthetic */ User A02;

    public /* synthetic */ C318796pX(Activity activity, C323366xN r2, User user) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = user;
    }

    public final void onClick(View view) {
        C323366xN r1 = this.A01;
        C49070Eoo.A00(r1.A0E, this.A00, this.A02.getId());
    }
}
