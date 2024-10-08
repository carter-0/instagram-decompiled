package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.VBu  reason: case insensitive filesystem */
public abstract class C16942VBu {
    public static final X9Q A00(Context context, UserSession userSession, AnonymousClass4DU r5, String str, long j, boolean z, boolean z2) {
        X9Q wwe;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r3 = r5;
        String str2 = str;
        C51974G9v.A1O(context2, userSession2, r5, str);
        long j2 = j;
        if (z) {
            wwe = new C14322Ttx(context2, userSession2, r3, str2, j2, z2);
        } else {
            wwe = new WWE(context2, userSession2, r3, str2, j2);
        }
        return wwe;
    }
}
