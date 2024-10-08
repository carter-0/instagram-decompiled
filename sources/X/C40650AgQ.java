package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.AgQ  reason: case insensitive filesystem */
public final class C40650AgQ implements C273414mX {
    public final /* synthetic */ C327797Cf A00;
    public final /* synthetic */ 0r1 A01;

    public final void Cyf() {
    }

    public C40650AgQ(C327797Cf r1, 0r1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Cyc() {
        String str;
        1Wj A002 = DcL.A00();
        C327797Cf r0 = this.A00;
        Activity activity = r0.A02;
        UserSession userSession = r0.A03;
        if (this.A01.A00) {
            str = "885781683067780";
        } else {
            str = "852935213635690";
        }
        A002.A03(userSession, activity, str);
    }
}
