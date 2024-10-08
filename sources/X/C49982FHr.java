package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FHr  reason: case insensitive filesystem */
public final class C49982FHr implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass35M A00;

    public final void onClick(DialogInterface dialogInterface, int i) {
        User user;
        0qQ.A0B(dialogInterface, 0);
        AnonymousClass35M r0 = this.A00;
        UserSession userSession = r0.A01;
        if (userSession != null && (user = r0.A02) != null) {
            W3r.A0F(userSession, "instagram_shopping_post_onboarding_nux_not_now_button_clicked", user.A03.Btq());
            dialogInterface.dismiss();
        }
    }

    public C49982FHr(AnonymousClass35M r1) {
        this.A00 = r1;
    }
}
