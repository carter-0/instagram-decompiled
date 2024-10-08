package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;

/* renamed from: X.DfS  reason: case insensitive filesystem */
public final class C46464DfS extends C48203Eaj {
    public final Context A00;
    public final UserSession A01;
    public final UserDetailLaunchConfig A02;

    public C46464DfS(Context context, UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        AnonymousClass7TG.A1P(userSession, userDetailLaunchConfig);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = userDetailLaunchConfig;
    }
}
