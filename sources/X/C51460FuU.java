package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.user.model.User;

/* renamed from: X.FuU  reason: case insensitive filesystem */
public final class C51460FuU implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;
    public final /* synthetic */ User A02;

    public C51460FuU(UserSession userSession, InstagramMainActivity instagramMainActivity, User user) {
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
        this.A02 = user;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.WNI, java.lang.Object, X.4bz] */
    public final void run() {
        2Zg r5 = this.A01;
        if (r5.A09 != null) {
            r5.A02++;
            C46656Dib A04 = C46447Df9.A02().A04("profile");
            Bundle bundle = A04.mArguments;
            if (bundle != null) {
                bundle.putBoolean("is_complete_your_profile", true);
            }
            UserSession userSession = this.A00;
            C323246xB r2 = r5.A0A;
            if (r2 == null) {
                2Zg r0 = null;
                if (r5 instanceof 2Zg) {
                    r0 = r5;
                }
                r2 = new C323246xB(r5, userSession, r0);
            }
            r5.A0A = r2;
            r2.A03(A04, "edit_profile", false);
            r2.A01();
            r2.A02();
            String id = this.A02.getId();
            ? obj = new Object();
            obj.A00 = id;
            r2.A04(obj);
            r2.A00();
        }
    }
}
