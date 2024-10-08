package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Haf  reason: case insensitive filesystem */
public abstract class C55008Haf {
    public static final void A00(SpannableStringBuilder spannableStringBuilder, UserSession userSession, 1Xj r13, C242813Wa r14, int i) {
        boolean A1X = DbW.A1X(r13);
        int length = spannableStringBuilder.length();
        User A2A = r13.A2A(userSession);
        if (A2A != null) {
            String C9e = A2A.A03.C9e();
            if (C9e != null) {
                spannableStringBuilder.append(C9e);
                spannableStringBuilder.setSpan(new C54491HFx(r13, r14, i), length, spannableStringBuilder.length(), 33);
                AnonymousClass70U r5 = new AnonymousClass70U(userSession);
                String id = A2A.getId();
                String C9f = A2A.A03.C9f();
                C8956RIv rIv = C8956RIv.FEED;
                String A2n = r13.A2n();
                if (A2n != null) {
                    r5.A00(rIv, id, C9f, A2n, A1X);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
