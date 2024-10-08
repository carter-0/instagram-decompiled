package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final /* synthetic */ class FT7 implements AnonymousClass2hV {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ FT7(Activity activity, UserSession userSession, AnonymousClass4DU r3, User user, String str, String str2, String str3) {
        this.A00 = activity;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = user;
        this.A06 = str3;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final Object apply(Object obj) {
        Activity activity = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        User user = this.A03;
        String str3 = this.A06;
        AnonymousClass4DU r3 = this.A02;
        UserSession userSession = this.A01;
        String str4 = (String) obj;
        if (str4 == null) {
            return null;
        }
        C46395DeI.A03(activity, DbX.A0D(str4), userSession, r3, user, (String) null, "share_to_system_sheet", str4, str, str2, str3, true, false);
        return null;
    }
}
