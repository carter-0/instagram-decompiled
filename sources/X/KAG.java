package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class KAG extends 1P0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public KAG(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1833288280);
        String A012 = C347037wA.A01(r5);
        Activity activity = this.A00;
        if (A012 == null || A012.length() == 0) {
            A012 = AnonymousClass7TE.A16(activity, 2131961756);
        }
        C59689JTv.A09(activity, A012);
        AnonymousClass0fD.A0A(221850661, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1048475728);
        C61290K1b k1b = (C61290K1b) obj;
        int A032 = AnonymousClass0fD.A03(-1123859966);
        0qQ.A0B(k1b, 0);
        UserSession userSession = this.A01;
        1E7.A00(userSession).A01(k1b.A00(), true, false).AE7(userSession);
        AnonymousClass0fD.A0A(-1939028117, A032);
        AnonymousClass0fD.A0A(-494041922, A03);
    }
}
