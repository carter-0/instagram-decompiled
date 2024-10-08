package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

public final class FmM implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FmM(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public final void D9V() {
        C331157Pu r2;
        Activity activity;
        Object obj;
        Fragment A002;
        switch (this.A00) {
            case 0:
                Activity activity2 = (Activity) this.A02;
                AnonymousClass37D A0i = DbT.A0i(activity2);
                if (A0i != null) {
                    A0i.A0P((C332277Ui) null);
                }
                C47830EJc eJc = (C47830EJc) this.A03;
                String A0q = DbS.A0q(this.A01);
                AnonymousClass0eM r3 = eJc.A06;
                C61436K7l A003 = C63231Ktc.A00(AnonymousClass7TE.A0l(r3), new C50371FaW(eJc), A0q, DbS.A0t(eJc.A01));
                C331127Pr A0f = DbX.A0f(r3);
                A0f.A17 = true;
                A0f.A0U = A003;
                DbU.A0y(activity2, A003, A0f);
                return;
            case 1:
                r2 = (C331157Pu) this.A02;
                activity = (Activity) this.A01;
                A002 = ((C49731F3w) this.A03).A00();
                break;
            case 2:
                C332277Ui r0 = (C332277Ui) this.A02;
                if (r0 != null) {
                    r0.D9V();
                }
                AnonymousClass37E r02 = AnonymousClass37D.A00;
                H0H h0h = (H0H) this.A03;
                AnonymousClass37D A0g = DbV.A0g(h0h, r02);
                if (A0g != null) {
                    A0g.A0P((C332277Ui) null);
                }
                JQH jqh = h0h.A04;
                if (jqh != null) {
                    jqh.DGa(h0h.A01, (C246193eB) this.A01);
                    return;
                }
                return;
            case 3:
                AnonymousClass7TF.A0D().post(new C51454FuO((Context) this.A01, (C49945FFy) this.A03, (C332277Ui) this.A02));
                return;
            case 4:
                r2 = (C331157Pu) this.A01;
                activity = ((C50672FgX) this.A03).A00;
                obj = this.A02;
                break;
            default:
                r2 = (C331157Pu) this.A02;
                activity = (Activity) this.A01;
                obj = this.A03;
                break;
        }
        A002 = (Fragment) obj;
        r2.A02(activity, A002);
    }

    public final void D9a() {
        switch (this.A00) {
            case 2:
            case 3:
                C332277Ui r0 = (C332277Ui) this.A02;
                if (r0 != null) {
                    r0.D9a();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
