package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3jI  reason: invalid class name and case insensitive filesystem */
public final class C249203jI extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249203jI(2Lk r3) {
        super("SwitcherFetchLoggedInFBAccount", 121269570);
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.FGw] */
    public final void loggedRun() {
        if (AnonymousClass3EM.A05(18316656832955265L, true)) {
            2Lk r1 = this.A00;
            CallerContext callerContext = 2Lk.A08;
            Context context = r1.A01;
            UserSession userSession = r1.A04;
            0qQ.A0B(context, 0);
            0qQ.A0B(userSession, 1);
            Set singleton = Collections.singleton(new FAQ((String) null, (Map) null, C368108s5.A03, C368238sI.ACTIVE_ACCOUNT));
            0qQ.A07(singleton);
            if (Systrace.A0E(1)) {
                0fS.A01("SwitcherStartupHelper.fetchAndCacheLoggedInFBAccountName", -237401268);
            }
            try {
                C255183ti.A04(new FTJ(), new Object().A08(context, userSession, "fx_company_identity_switcher_linking_cache", "SwitcherStartupHelper", singleton), new 0nX(121269570));
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(285840538);
                }
            }
        }
    }
}
