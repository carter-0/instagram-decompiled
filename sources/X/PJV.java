package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class PJV implements C74360Pta {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ C310026aJ A02;
    public final /* synthetic */ C310706bU A03;
    public final /* synthetic */ C310646bO A04;

    public PJV(UserSession userSession, C250973mM r2, C310026aJ r3, C310706bU r4, C310646bO r5) {
        this.A00 = userSession;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void Dyn(View view, AnonymousClass3BT r28) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        UserSession userSession = this.A00;
        AnonymousClass3BT r3 = r28;
        C255773uh A002 = r3.A00(userSession);
        if (A002 == null) {
            0f9 AEf = 0wj.A01.AEf("LOCKED_OR_EMPTY_STATE", 817891683);
            AEf.ABQ("LOCKED_OR_EMPTY_STATE", "thumbnail reel item should never be null");
            AEf.report();
            return;
        }
        C310646bO r7 = this.A04;
        C309426Yf Bz3 = r7.Bz3(A002);
        int i = Bz3.A0I;
        C310706bU r0 = this.A03;
        C309426Yf Bz32 = r7.Bz3(A002);
        int i2 = i;
        View view3 = view2;
        C255773uh r16 = A002;
        C310706bU r13 = r0;
        r13.A00(view3, new C72270Ozf(userSession, this.A01, r3, this.A02, Bz3), r16, new C250973mM(userSession, r3.A03, false, (String) null, (String) null, 0sl.A00, i, System.currentTimeMillis(), false), Bz32, AnonymousClass05K.A00, i2);
    }
}
