package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

public final class AOA implements View.OnClickListener {
    public final /* synthetic */ C391629tO A00;
    public final /* synthetic */ ADB A01;
    public final /* synthetic */ User A02;

    public AOA(C391629tO r1, ADB adb, User user) {
        this.A02 = user;
        this.A01 = adb;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(363981442);
        User user = this.A02;
        if (user != null) {
            ADB.A00(this.A01, user);
        }
        AnonymousClass7SY r0 = this.A01.A04;
        C391629tO r4 = this.A00;
        AnonymousClass9H7 r2 = r0.A00;
        AnonymousClass9H7.A01(r2).A0L().CyM(user);
        AnonymousClass9H7.A01(r2).A0R();
        UserSession userSession = r2.A10;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        boolean z = r2.A0j;
        AnonymousClass4DU r6 = r2.A1Q;
        0qQ.A0B(r6, 7);
        C3265677h.A05(r4, (C391549tG) null, r6, userSession, str, AnonymousClass9H7.A07(r2), 5, r2.A0b instanceof MsysThreadId, z);
        AnonymousClass0fD.A0C(-305037192, A05);
    }
}
