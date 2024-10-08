package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IxE  reason: case insensitive filesystem */
public final class C58767IxE extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58767IxE(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                View view = G9w.A0R(obj).A00;
                0qQ.A0A(view);
                ((C52046GCs) this.A02).A05(view, (C238863Ds) this.A04, (Integer) this.A01);
                C51965G9l.A1W(this.A03, view);
                break;
            case 1:
                int A09 = ((C52058GDe) this.A01).A09();
                ((JTC) this.A03).Dlh(((GHN) this.A02).A01, (1Xj) this.A04, A09);
                break;
            default:
                AnonymousClass07Z r5 = (AnonymousClass07Z) obj;
                0qQ.A0B(r5, 0);
                UserSession userSession = (UserSession) this.A03;
                AnonymousClass07g r2 = (AnonymousClass07g) this.A02;
                View view2 = (View) this.A01;
                if (C317336n6.A01(userSession)) {
                    new C18514VtD(view2, r5, r2, userSession);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }
}
