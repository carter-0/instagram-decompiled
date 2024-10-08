package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fse  reason: case insensitive filesystem */
public final class C51346Fse implements Runnable {
    public final /* synthetic */ K66 A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;

    public C51346Fse(K66 k66, AnonymousClass3Q2 r2) {
        this.A01 = r2;
        this.A00 = k66;
    }

    public final void run() {
        AnonymousClass3Q2 r11 = this.A01;
        K66 k66 = this.A00;
        UserSession A0S = k66.A0S();
        AnonymousClass0iw r9 = k66.A0N;
        C51651FyD fyD = new C51651FyD(k66, 1);
        C51651FyD fyD2 = new C51651FyD(k66, 2);
        int A03 = DbW.A03(1, A0S, r9);
        String moduleName = k66.getModuleName();
        E6H e6h = new E6H();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A03(A0a, A0S);
        A0a.putString("module_name", moduleName);
        C331127Pr A0V = DbV.A0V(A0a, e6h, A0S);
        A0V.A0T = e6h;
        DbS.A1S(A0V, false);
        C331157Pu A002 = FmG.A00(A0V, fyD, A03);
        e6h.A03 = A002;
        e6h.A01 = new C49323Ete(fyD2);
        e6h.A02 = new ExT(r9, A0S, r11);
        C49887FBn A003 = C49797F7i.A00(A0S);
        A003.A02(k66.getActivity(), AnonymousClass05K.A01, k66.getModuleName(), E6H.__redex_internal_original_name);
        A003.A01(k66);
        e6h.A00 = A003.A00;
        DbU.A1I(k66, e6h, A002);
        K66.A06(k66).A0h.A0A();
    }
}
