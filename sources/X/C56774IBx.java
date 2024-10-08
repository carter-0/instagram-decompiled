package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IBx  reason: case insensitive filesystem */
public final /* synthetic */ class C56774IBx implements View.OnClickListener {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C55835HoI A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C56774IBx(1P0 r1, 1Xj r2, C55835HoI hoI, boolean z) {
        this.A02 = hoI;
        this.A03 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C55835HoI hoI = this.A02;
        boolean z = this.A03;
        1Xj r7 = this.A01;
        1P0 r5 = this.A00;
        if (z) {
            hoI.A04.A00(hoI.A02, r5, r7, AnonymousClass05K.A01);
            return;
        }
        hoI.A05.incrementAndGet();
        UserSession userSession = hoI.A03;
        String id = r7.getId();
        String moduleName = hoI.A02.getModuleName();
        0qQ.A0B(moduleName, 3);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("usertags/review/");
        DbX.A1M(A0a, "approve", id);
        C51965G9l.A1S(A0a, moduleName);
        1OC A0K = DbW.A0K(A0a);
        A0K.A00 = new C54246H4p(r5, r7, hoI);
        1ES.A00(hoI.A00.requireContext(), hoI.A01, A0K);
    }
}
