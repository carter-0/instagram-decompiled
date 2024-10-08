package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nvr  reason: case insensitive filesystem */
public abstract class C70013Nvr {
    public static final NdJ A00(Context context, UserSession userSession, String str, String str2, int i, int i2) {
        String str3 = str;
        AnonymousClass7TF.A1H(context, userSession);
        if (str == null) {
            str3 = "";
        }
        return new NdJ(context, userSession, C317966o8.A00(DbS.A0V(str2), str3, "", (float) i, (float) i2, 1.0f), false);
    }
}
