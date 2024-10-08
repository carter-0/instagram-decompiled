package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class IZS implements C295005nO {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass3TW A03;

    public IZS(Activity activity, View view, UserSession userSession, AnonymousClass3TW r4) {
        this.A03 = r4;
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = view;
    }

    public final void onFinish() {
        UserSession userSession;
        Activity activity;
        AnonymousClass3TW r10 = this.A03;
        Runnable runnable = r10.A09;
        if (runnable != null) {
            r10.A0B.postDelayed(runnable, 3000);
        }
        AnonymousClass4DU r3 = r10.A06;
        AnonymousClass3W1 r2 = r10.A08;
        AnonymousClass9J0 r0 = r10.A04;
        if (r0 != null && r0.A02 && (userSession = this.A02) != null && !I56.A03(userSession) && I7Q.A08(userSession) && !AnonymousClass7TE.A0q(userSession).getBoolean(AnonymousClass000.A00(3234), false) && (activity = this.A00) != null && r3 != null && r2 != null) {
            View A002 = r10.A00();
            String A0d = AnonymousClass7TF.A0d(DbU.A05(r10.A00()), 2131972519);
            int width = this.A01.getWidth() / 10;
            int i = -((int) r10.A0A);
            C226262fy r22 = C226262fy.ABOVE_ANCHOR;
            KSO kso = new KSO(r10, 7);
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, A0d);
            A0f.A04(A002, width, i, false);
            A0f.A0B = true;
            A0f.A05 = r22;
            A0f.A0A = true;
            A0f.A04 = kso;
            DbU.A1T(A0f);
        }
    }
}
