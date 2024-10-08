package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.PbA  reason: case insensitive filesystem */
public final /* synthetic */ class C73351PbA implements Runnable {
    public final /* synthetic */ NST A00;
    public final /* synthetic */ DirectShareTarget A01;
    public final /* synthetic */ C352218Cl A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C73351PbA(NST nst, DirectShareTarget directShareTarget, C352218Cl r3, String str) {
        this.A00 = nst;
        this.A02 = r3;
        this.A01 = directShareTarget;
        this.A03 = str;
    }

    public final void run() {
        NST nst = this.A00;
        C352218Cl r6 = this.A02;
        DirectShareTarget directShareTarget = this.A01;
        String str = this.A03;
        AnonymousClass8K4 r2 = nst.A03.A00;
        if (str == null) {
            str = r2.A0I.A01.toString();
        }
        UserSession userSession = r2.A0D;
        Context applicationContext = r2.A0A.getApplicationContext();
        0qQ.A0B(userSession, 0);
        C51974G9v.A1L(applicationContext, r6, str);
        DirectThreadKey A012 = AnonymousClass6W4.A01(AnonymousClass6W3.A01(DbS.A0c(directShareTarget)));
        C333537Zi A002 = C333527Zh.A00(userSession);
        0qQ.A0B(A012, 0);
        DirectThreadKey A032 = C66647MaG.A03(A012);
        PU8.A00(1aU.A06(new C72162OxM(A002, A032, r6, C333537Zi.A00(A002, 2FW.A1A, A032.A00, false), str, false)), r2.A0C, r2, 0);
    }
}
