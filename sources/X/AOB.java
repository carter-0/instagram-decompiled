package X;

import android.view.View;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

public final class AOB implements View.OnClickListener {
    public final /* synthetic */ C391629tO A00;
    public final /* synthetic */ ADB A01;
    public final /* synthetic */ User A02;

    public AOB(C391629tO r1, ADB adb, User user) {
        this.A02 = user;
        this.A01 = adb;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-197008361);
        User user = this.A02;
        if (user != null) {
            ADB.A00(this.A01, user);
        }
        AnonymousClass7SY r0 = this.A01.A04;
        C391629tO r3 = this.A00;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        AnonymousClass9H7 r1 = r0.A00;
        AnonymousClass9H7.A01(r1).A0R();
        boolean z = r1.A0j;
        AnonymousClass4DU r5 = r1.A1Q;
        0qQ.A0B(r5, 7);
        C3265677h.A05(r3, (C391549tG) null, r5, r1.A10, str, AnonymousClass9H7.A07(r1), 26, r1.A0b instanceof MsysThreadId, z);
        AnonymousClass0fD.A0C(-481883723, A05);
    }
}
