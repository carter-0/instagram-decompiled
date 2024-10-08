package X;

import android.view.View;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* renamed from: X.OjC  reason: case insensitive filesystem */
public final class C71357OjC implements View.OnClickListener {
    public final /* synthetic */ C69460Nm4 A00;
    public final /* synthetic */ C3261175l A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C71357OjC(C69460Nm4 nm4, C3261175l r2, User user, String str, String str2) {
        this.A01 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = nm4;
        this.A02 = user;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-15583841);
        C3261175l r3 = this.A01;
        C3261175l.A00(this.A00, r3, this.A04, this.A03);
        C48838El0.A00(r3.A01, r3.A02, r3.A03, MessagingUser.A00(this.A02), "business_chat_action_bar", (String) null, false, false);
        AnonymousClass0fD.A0C(58484293, A05);
    }
}
