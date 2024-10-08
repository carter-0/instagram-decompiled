package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.DeW  reason: case insensitive filesystem */
public final class C46409DeW implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;

    public C46409DeW(AnonymousClass70J r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onClick(View view) {
        C50672FgX A02;
        int A05 = AnonymousClass0fD.A05(-1272335497);
        AnonymousClass70J r0 = this.A00;
        if (!(r0 == null || (A02 = r0.A02()) == null)) {
            A02.A07(AnonymousClass7TE.A0S(view), this.A01, "user_profile_header");
        }
        AnonymousClass0fD.A0C(126828079, A05);
    }
}
