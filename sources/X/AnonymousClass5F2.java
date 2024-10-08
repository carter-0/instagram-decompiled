package X;

import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5F2  reason: invalid class name */
public final class AnonymousClass5F2 {
    public final UserSession A00;
    public final AnonymousClass5F3 A01;
    public final HashMap A02 = new HashMap();
    public final AnonymousClass5F4 A03 = new AnonymousClass5F5(0, TimeUnit.HOURS.toMillis(24));

    /* JADX WARNING: type inference failed for: r0v4, types: [X.5F4, X.5F5] */
    public AnonymousClass5F2(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new AnonymousClass5F3(userSession);
    }

    public final void A00(AnonymousClass3W1 r4) {
        int hashCode = r4.hashCode();
        HashMap hashMap = this.A02;
        Integer valueOf = Integer.valueOf(hashCode);
        CountDownTimer countDownTimer = (CountDownTimer) hashMap.get(valueOf);
        if (countDownTimer != null) {
            countDownTimer.cancel();
            hashMap.remove(valueOf);
        }
    }
}
