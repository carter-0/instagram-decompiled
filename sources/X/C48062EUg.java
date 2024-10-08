package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.EUg  reason: case insensitive filesystem */
public final class C48062EUg extends ECF {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C267324bN A02;
    public final Dc2 A03;
    public final boolean A04 = true;

    public C48062EUg(FragmentActivity fragmentActivity, C267324bN r5, UserSession userSession, GBE gbe) {
        super(fragmentActivity, r5, userSession, gbe);
        ImageUrl A1Q;
        this.A00 = fragmentActivity;
        this.A02 = r5;
        this.A01 = userSession;
        C310336ap A0a = DbS.A0a();
        DbS.A19(fragmentActivity.getBaseContext(), A0a, 2131957622);
        A0a.A06();
        1Xj r0 = r5.A02;
        if (!(r0 == null || (A1Q = r0.A1Q()) == null)) {
            A0a.A09 = A1Q;
            A0a.A03();
        }
        this.A03 = A0a.A00();
    }

    public final void A00(C61284K0v k0v) {
        int A032 = AnonymousClass0fD.A03(-1414865409);
        0qQ.A0B(k0v, 0);
        super.A00(k0v);
        if (!k0v.FH3().A01) {
            C59689JTv.A01(this.A00.getBaseContext(), "clips_delete_failed_response_did_deleted_not_true", 2131955358, 0);
        } else if (this.A04) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0B((Bundle) null, C55243HeY.A00((C59725JVj) null, userSession, false));
            A0Q.A04();
        }
        AnonymousClass0fD.A0A(439754385, A032);
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(488937449);
        0qQ.A0B(r6, 0);
        super.onFail(r6);
        C59689JTv.A01(this.A00.getBaseContext(), AnonymousClass000.A00(1178), 2131955358, 0);
        AnonymousClass0fD.A0A(-1538873546, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-2143105587);
        1xC.A01.A00(new AnonymousClass3GR(this.A03));
        AnonymousClass0fD.A0A(194662920, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-858047578);
        1xC.A01.A00(new AnonymousClass3GP(this.A03));
        AnonymousClass0fD.A0A(-1746993380, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1590832933);
        A00((C61284K0v) obj);
        AnonymousClass0fD.A0A(-713853021, A032);
    }
}
