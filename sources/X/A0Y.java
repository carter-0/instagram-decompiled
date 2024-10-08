package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

public abstract class A0Y {
    public static final void A00(Activity activity, Fragment fragment, AnonymousClass0iw r12, UserSession userSession, AnonymousClass3N4 r14) {
        AnonymousClass3N4 r6 = r14;
        Reel A00 = C241023No.A00(userSession, C241003Nm.A00, false);
        if (A00 != null) {
            AnonymousClass32A r3 = new AnonymousClass32A(r12, userSession, new AnonymousClass328(fragment));
            r3.A0C = AnonymousClass7TF.A0b();
            r3.A05 = new C16165Upq(activity, r14.AhX(), (C230222pE) null);
            if (r14 instanceof XC0) {
                List A1I = AnonymousClass7TE.A1I(A00);
                List A1I2 = AnonymousClass7TE.A1I(A00);
                r3.A06(A00, AnonymousClass3BQ.ARCHIVE, (XC0) r6, A1I, A1I2, 0);
            } else if (r14 instanceof AnonymousClass3N3) {
                r3.A03(A00, AnonymousClass3BQ.ARCHIVE, (AnonymousClass3N3) r6);
            } else {
                r3.A03(A00, AnonymousClass3BQ.ARCHIVE, (AnonymousClass3N3) null);
            }
        }
    }
}
