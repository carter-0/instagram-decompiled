package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6xk  reason: invalid class name and case insensitive filesystem */
public abstract class C323586xk {
    public final Context context;
    public final String entryPoint;
    public final UserSession userSession;

    public C323586xk(Context context2, UserSession userSession2, String str) {
        0qQ.A0B(context2, 1);
        0qQ.A0B(userSession2, 2);
        0qQ.A0B(str, 3);
        this.context = context2;
        this.userSession = userSession2;
        this.entryPoint = str;
    }

    public abstract C66543MVx getUpsellContent();

    public boolean isUpsellEligible() {
        return false;
    }

    public abstract void showUpsell(C66520MUy mUy, Activity activity);

    public void showUpsellWithoutPrescreen(Activity activity) {
        0qQ.A0B(activity, 0);
        C48920EmK.A00().A00(activity, this.userSession, new C51126Foy()).A06(this.entryPoint, (List) null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public boolean isKillswitchEnabled() {
        0Tu r2;
        long j;
        String str = this.entryPoint;
        UserSession userSession2 = this.userSession;
        0qQ.A0B(str, 0);
        0qQ.A0B(userSession2, 1);
        if (str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
            r2 = 0Tu.A06;
            j = 2342158392220454043L;
        } else if (!str.equals("IG_LOGOUT_UPSELL")) {
            return false;
        } else {
            r2 = 0Tu.A06;
            j = 2342156442305300443L;
        }
        return 182.A06(r2, userSession2, j);
    }

    public final boolean isLinked() {
        if (2Lv.A00(this.userSession).A00(CallerContext.A01("FxIgUnifiedACUpsellBaseImpl"), "ig_android_linking_cache_fx_ac_eligibility_linkage_check") || AnonymousClass8PU.A04(this.userSession)) {
            return true;
        }
        return false;
    }

    public void prefetchEligibility() {
        if (!isKillswitchEnabled()) {
            C317826nu A00 = C317816nt.A00(this.userSession);
            Context applicationContext = this.context.getApplicationContext();
            0qQ.A07(applicationContext);
            UserSession userSession2 = this.userSession;
            String str = this.entryPoint;
            A00.A09(applicationContext, userSession2, (G75) null, str, (String) null, C323596xl.A00(str), false);
        }
    }
}
