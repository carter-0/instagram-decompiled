package X;

import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

public final class DdT implements View.OnClickListener {
    public final /* synthetic */ DdD A00;

    public DdT(DdD ddD) {
        this.A00 = ddD;
    }

    public final void onClick(View view) {
        Runnable runnable;
        int A01;
        int A05 = AnonymousClass0fD.A05(-385077607);
        DdD ddD = this.A00;
        boolean A03 = AnonymousClass3EM.A03();
        Handler handler = ddD.A01;
        if (A03) {
            runnable = ddD.A05;
        } else {
            runnable = ddD.A06;
        }
        handler.post(runnable);
        int A002 = C46336Dce.A00(ddD.A04);
        UserSession userSession = ddD.A03;
        if (AnonymousClass3EM.A01()) {
            A01 = AnonymousClass3H7.A00(userSession);
        } else {
            A01 = AnonymousClass3H7.A01(userSession);
        }
        int A003 = AnonymousClass3H6.A00(userSession);
        int A004 = AnonymousClass3H5.A00(userSession);
        boolean A1R = AnonymousClass7TF.A1R(A004);
        2aX r7 = new 2aX(2aD.A06, A002);
        AnonymousClass2g1 r6 = AnonymousClass2g1.DIRECT;
        C226252fx r5 = C226252fx.DOT;
        2aT.A00(DbU.A0c(userSession), r5, r6, r7, AnonymousClass05K.A0N, "click", (Map) null, A003, A1R ? 1 : 0, A01, A004);
        2aV A0a = DbV.A0a(userSession);
        0qQ.A0B(r6, 0);
        A0a.A03(new C239993Jd(r5, r6, (C71062aE) null, (Set) null), r7, false);
        AnonymousClass0fD.A0C(570721575, A05);
    }
}
