package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9iv  reason: invalid class name and case insensitive filesystem */
public final class C385429iv extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;

    public C385429iv(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-239620046, AnonymousClass0fD.A03(1646451490));
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(-388746547, AnonymousClass0fD.A03(-1338268293));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-975752712);
        int A032 = AnonymousClass0fD.A03(-1424890812);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass0iw r7 = this.A01;
        0qQ.A0B(userSession, 0);
        new EES(fragmentActivity).A00(new RectF(), fragmentActivity, r7, userSession, ((C39778A8x) userSession.A01(C39778A8x.class, new C66300MMj(userSession, 9))).A00((C384619hc) obj), AnonymousClass3BQ.BLOKS);
        AnonymousClass0fD.A0A(733653502, A032);
        AnonymousClass0fD.A0A(807119411, A03);
    }
}
