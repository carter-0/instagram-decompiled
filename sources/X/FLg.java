package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

public final class FLg implements View.OnClickListener {
    public final /* synthetic */ FAY A00;

    public FLg(FAY fay) {
        this.A00 = fay;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(143785597);
        FAY fay = this.A00;
        UserSession userSession = fay.A04;
        AnonymousClass0iw r6 = fay.A03;
        Integer num = AnonymousClass05K.A00;
        Reel reel = fay.A07;
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            User CCd = r0.CCd();
            if (CCd != null) {
                C49176Eqh.A00(r6, userSession, CCd, num, (String) null, "story_tray");
                Integer num2 = AnonymousClass05K.A1I;
                1Ns r02 = reel.A0W;
                if (r02 != null) {
                    User CCd2 = r02.CCd();
                    if (CCd2 != null) {
                        C49176Eqh.A00(r6, userSession, CCd2, num2, (String) null, "story_tray");
                        1Ns r03 = reel.A0W;
                        if (r03 != null) {
                            User CCd3 = r03.CCd();
                            if (CCd3 != null) {
                                FCW.A02(new C47696EDf(fay, 21), userSession, CCd3, r6.getModuleName());
                                AnonymousClass0fD.A0C(2122655060, A05);
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
