package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MeL  reason: case insensitive filesystem */
public final class C66883MeL implements C74410PuQ {
    public final /* synthetic */ C66870Me6 A00;

    public final String AUf(UserSession userSession) {
        return "message sent time before thread read time";
    }

    public C66883MeL(C66870Me6 me6) {
        this.A00 = me6;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        AnonymousClass3SZ Aue;
        String str;
        C66871Me7 me7 = (C66871Me7) obj;
        AnonymousClass7TG.A1N(me7, userSession);
        long j = me7.A00;
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        2Eq r3 = me7.A01;
        if (!((r3 == null && ((str = me7.A06) == null || (r3 = (2Eq) this.A00.A02.invoke(userSession, str)) == null)) || (Aue = r3.Aue(userSession.A06)) == null)) {
            j2 = TimeUnit.MICROSECONDS.toMillis(Aue.A00);
        }
        if (j <= j2) {
            return false;
        }
        return true;
    }
}
