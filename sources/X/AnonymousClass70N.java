package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.70N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70N implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass70F A00;
    public final /* synthetic */ C323286xF A01;
    public final /* synthetic */ C319896rP A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ AnonymousClass70N(AnonymousClass70F r1, C323286xF r2, C319896rP r3, User user) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = user;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        AnonymousClass70F r4 = this.A00;
        C323286xF r3 = this.A01;
        User user = this.A03;
        r3.D2v(0nA.A0F(view), r4, this.A02, user);
    }
}
