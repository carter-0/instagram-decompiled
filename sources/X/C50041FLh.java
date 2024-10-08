package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.FLh  reason: case insensitive filesystem */
public final class C50041FLh implements View.OnClickListener {
    public final /* synthetic */ FAY A00;

    public C50041FLh(FAY fay) {
        this.A00 = fay;
    }

    public final void onClick(View view) {
        User user;
        User CCd;
        int A05 = AnonymousClass0fD.A05(1028124436);
        FAY fay = this.A00;
        UserSession userSession = fay.A04;
        AnonymousClass0iw r6 = fay.A03;
        Integer num = AnonymousClass05K.A00;
        Reel reel = fay.A07;
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            user = r0.CCd();
        } else {
            user = null;
        }
        if (user != null) {
            C49176Eqh.A00(r6, userSession, user, num, (String) null, "story_tray");
            FragmentActivity fragmentActivity = fay.A02;
            1Ns r02 = reel.A0W;
            if (r02 == null || (CCd = r02.CCd()) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            C49811F7y.A00(fragmentActivity, r6, userSession, CCd, new C51035FnR(fay), AnonymousClass05K.A0C, (String) null, "story_tray");
            AnonymousClass0fD.A0C(1500516239, A05);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
