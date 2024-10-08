package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fsf  reason: case insensitive filesystem */
public final class C51347Fsf implements Runnable {
    public final /* synthetic */ K66 A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;

    public C51347Fsf(K66 k66, AnonymousClass3Q2 r2) {
        this.A01 = r2;
        this.A00 = k66;
    }

    public final void run() {
        K66 k66 = this.A00;
        UserSession A0S = k66.A0S();
        C51651FyD fyD = new C51651FyD(k66, 3);
        C51651FyD fyD2 = new C51651FyD(k66, 4);
        0qQ.A0B(A0S, 1);
        String moduleName = k66.getModuleName();
        E6G e6g = new E6G();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A03(A0a, A0S);
        e6g.setArguments(A0a);
        e6g.A03 = moduleName;
        C331127Pr A0W = DbS.A0W(A0S);
        A0W.A0T = e6g;
        DbS.A1S(A0W, false);
        C331157Pu A002 = FmG.A00(A0W, fyD, 2);
        e6g.A02 = A002;
        e6g.A01 = new C49322Etd(fyD2);
        C49887FBn A003 = C49797F7i.A00(A0S);
        A003.A02(k66.getActivity(), AnonymousClass05K.A01, k66.getModuleName(), E6G.__redex_internal_original_name);
        A003.A01(k66);
        e6g.A00 = A003.A00;
        DbU.A1I(k66, e6g, A002);
        0xa A0q = AnonymousClass7TE.A0q(A0S);
        AnonymousClass7TG.A1L(A0q.AR4(), A0q, AnonymousClass000.A00(2798), 0);
        K66.A06(k66).A0h.A0A();
    }
}
