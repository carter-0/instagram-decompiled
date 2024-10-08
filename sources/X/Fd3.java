package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final class Fd3 implements MVB {
    public final /* synthetic */ C3250870z A00;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd3(C3250870z r1) {
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        C3250870z r2 = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(r2.A04, "unfollow_reciprocal_toast_tap");
        A0e.AAJ("target_id", DbX.A0r(r2.A09.A03));
        A0e.Cgf();
        UserDetailFragment userDetailFragment = r2.A07;
        Context context = userDetailFragment.getContext();
        Dc6 dc6 = userDetailFragment.A10;
        User user = dc6.A03;
        if (context != null && user != null) {
            String A0h = DbW.A0h(context, dc6.A04(), 2131972020);
            C49382Euk euk = userDetailFragment.A0w;
            if (euk == null) {
                euk = new C49382Euk(userDetailFragment.A0I);
                userDetailFragment.A0w = euk;
            }
            String A03 = userDetailFragment.A10.A03();
            0qQ.A0B(A03, 0);
            0Aj A0e2 = AnonymousClass7TE.A0e(euk.A00, "remove_follower_dialog_impression");
            A0e2.AAJ("target_id", A03);
            A0e2.Cgf();
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131972021);
            A0Y.A0q(A0h);
            A0Y.A0n(user.Bh3(), userDetailFragment);
            C50025FJk.A01(A0Y, userDetailFragment, user, 44, 2131972017);
            A0Y.A0C(C50021FJg.A00(userDetailFragment, 13));
            Dialog A02 = A0Y.A02();
            userDetailFragment.mRemoveFollowerDialog = A02;
            AnonymousClass0fN.A00(A02);
        }
    }

    public final void onShow() {
        C3250870z r3 = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(r3.A04, "unfollow_reciprocal_toast_impression");
        A0e.AAJ("target_id", DbX.A0r(r3.A09.A03));
        A0e.Cgf();
    }
}
