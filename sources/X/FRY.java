package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class FRY implements CallerContextable {
    public static final CallerContext A08 = CallerContext.A00(FRY.class);
    public static final String A09 = ESS.class.getName();
    public static final String __redex_internal_original_name = "BusinessOptionsController";
    public final BaseFragmentActivity A00;
    public final C227812jx A01;
    public final UserSession A02;
    public final MonetizationRepository A03;
    public final C49915FEp A04;
    public final ESS A05;
    public final ESS A06;
    public final User A07;

    public FRY(C227812jx r20, UserSession userSession, ESS ess, ESS ess2) {
        BaseFragmentActivity baseFragmentActivity;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        C227812jx r2 = r20;
        this.A01 = r2;
        this.A02 = userSession2;
        BaseFragmentActivity activity = r2.getActivity();
        if (activity instanceof BaseFragmentActivity) {
            baseFragmentActivity = activity;
        } else {
            baseFragmentActivity = null;
        }
        this.A00 = baseFragmentActivity;
        this.A07 = AnonymousClass7TF.A0Q(userSession2);
        this.A05 = ess;
        this.A06 = ess2;
        this.A04 = new C49915FEp(r2, userSession2);
        if (A01()) {
            OyN.A00(this.A02).A05();
        }
        if (A00(this)) {
            C48834Ekw.A00(this.A01, this.A02).A00();
        }
        UserSession userSession3 = this.A02;
        if (DcS.A00(userSession3, false)) {
            C50331FYl A002 = C69864NtS.A00(userSession3);
            UserSession userSession4 = A002.A00;
            1vn A012 = 1vm.A01(userSession4);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            A042.A01(C66579MXk.A00(137));
            A042.A01(C66579MXk.A00(335));
            ArrayList A1C = AnonymousClass7TE.A1C();
            1Ef ensureCacheWrite = new PandoGraphQLRequest(DbU.A0J(A042, "business_ig_id", userSession4.A06), C66579MXk.A00(202), A042.getParamsCopy(), A043.getParamsCopy(), C42705Bh2.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, C66579MXk.A00(414), A1C).setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false);
            A012.ATL(C50161FRt.A00, new FSC(A002, 7), ensureCacheWrite);
        }
        this.A03 = AnonymousClass2o3.A00(userSession2);
    }

    public static final boolean A00(FRY fry) {
        Bundle bundle = fry.A01.mArguments;
        if (bundle != null) {
            bundle.getBoolean("is_entered_from_QP", false);
        }
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = fry.A02;
        if (!2Ek.A03(r0.A01(userSession)) || !182.A06(0Tu.A06, userSession, 36314055862061441L)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A02;
        if (!2Ek.A03(r0.A01(userSession)) || !182.A06(0Tu.A05, userSession, 36311332852662779L)) {
            return false;
        }
        return true;
    }
}
