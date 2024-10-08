package X;

import com.instagram.common.session.UserSession;
import com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity;

/* renamed from: X.Ffp  reason: case insensitive filesystem */
public final class C50630Ffp implements G6A {
    public final /* synthetic */ OnboardingActivity A00;

    public C50630Ffp(OnboardingActivity onboardingActivity) {
        this.A00 = onboardingActivity;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0iw, com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity, android.app.Activity] */
    public final void onFinished() {
        ? r1 = this.A00;
        UserSession userSession = r1.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        } else {
            C46413Dea.A08(r1, r1, userSession);
        }
    }
}
