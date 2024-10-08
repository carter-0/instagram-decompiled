package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EC2 extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ FAG A01;
    public final /* synthetic */ C46410DeX A02;
    public final /* synthetic */ User A03;

    public EC2(UserSession userSession, FAG fag, C46410DeX deX, User user) {
        this.A02 = deX;
        this.A01 = fag;
        this.A00 = userSession;
        this.A03 = user;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(-527531793);
        C46465DfT dfT = this.A02.A02;
        String id = this.A03.getId();
        0Aj A0e = AnonymousClass7TE.A0e(dfT.A00, "unfollow_chaining_failed_to_show");
        A0e.AAJ("target_id", id);
        A0e.AAJ("reason", "api_failure");
        A0e.Cgf();
        Throwable A012 = r6.A01();
        if (A012 != null) {
            FAG.A00(this.A01, A012);
        } else {
            FAG.A00(this.A01, AnonymousClass7TE.A0z("Unable to fetch unfollow count."));
        }
        AnonymousClass0fD.A0A(-2049338128, A032);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.EbL, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ? obj2;
        Iterator it;
        int A032 = AnonymousClass0fD.A03(-2097517196);
        int A033 = AnonymousClass0fD.A03(2027897467);
        FAG fag = this.A01;
        UserSession userSession = this.A00;
        User user = this.A03;
        C51941G8k g8k = ((C47311Due) obj).A00;
        if (g8k == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        int i = ((C47221Dt8) g8k).A00;
        CopyOnWriteArrayList copyOnWriteArrayList = fag.A00;
        synchronized (copyOnWriteArrayList) {
            obj2 = new Object();
            obj2.A01 = userSession;
            obj2.A02 = user;
            obj2.A00 = i;
            fag.A02.set(obj2);
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
        }
        while (it.hasNext()) {
            ((C46469DfX) it.next()).A00(obj2.A00);
        }
        AnonymousClass0fD.A0A(752867596, A033);
        AnonymousClass0fD.A0A(-116092230, A032);
    }
}
