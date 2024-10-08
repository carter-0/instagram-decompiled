package X;

import android.content.Context;
import java.security.InvalidParameterException;

/* renamed from: X.Eqt  reason: case insensitive filesystem */
public abstract class C49188Eqt {
    public static final String A00(Context context, C48104EVw eVw) {
        int i;
        boolean A1U = AnonymousClass7TF.A1U(0, context, eVw);
        int ordinal = eVw.ordinal();
        if (ordinal == 0) {
            i = 2131962568;
        } else if (ordinal == A1U) {
            i = 2131962567;
        } else if (ordinal == 2) {
            i = 2131962566;
        } else {
            throw new InvalidParameterException(AnonymousClass7TG.A0m(eVw, "Invalid sorting option in FollowFragment", AnonymousClass7TE.A1A()));
        }
        return AnonymousClass7TE.A16(context, i);
    }
}
