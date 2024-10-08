package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.Ae4  reason: case insensitive filesystem */
public final class C40557Ae4 implements MVB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C40557Ae4(Activity activity, AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A02;
        User A022 = 17h.A00(userSession).A02(this.A03);
        if (A022 != null) {
            1pE A012 = 1pE.A01(this.A00, this.A01, userSession, "direct_share_to_friends_story_production_confirmation_toast");
            A012.A0B = new C291175gg(AnonymousClass7TE.A1I(new PendingRecipient(A022)));
            A012.A06();
        }
    }
}
