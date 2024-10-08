package X;

import android.os.FileObserver;
import com.facebook.msys.mca.MailboxCallback;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class MZG implements MailboxCallback {
    public final /* synthetic */ 1aD A00;

    public /* synthetic */ MZG(1aD r1) {
        this.A00 = r1;
    }

    public final void onCompletion(Object obj) {
        1aD r4 = this.A00;
        UserSession userSession = r4.A03;
        2Hz.A00(userSession).A04("db_setup_complete_callback_start");
        FileObserver fileObserver = r4.A04.A00;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        AnonymousClass1aS r0 = 1aD.A06;
        1aE r1 = 1aE.A01;
        r0.accept(r1);
        1xy.A00(userSession).A00.accept(r1);
        r4.A02.accept(obj);
        if (182.A06(0Tu.A05, userSession, 36328615801011668L)) {
            r4.A01.set(obj);
        }
        2Hz.A00(userSession).A04("db_setup_complete_callback_end");
    }
}
