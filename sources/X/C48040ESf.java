package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESf  reason: case insensitive filesystem */
public final class C48040ESf extends AnonymousClass7AK {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48040ESf(C47524E6k e6k, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = e6k;
    }

    public final void onClick(View view) {
        SUL sul;
        switch (this.A00) {
            case 0:
                UZD uzd = (UZD) this.A01;
                FragmentActivity requireActivity = uzd.requireActivity();
                UserSession userSession = uzd.A01;
                if (userSession != null) {
                    sul = Dba.A0J(requireActivity, userSession, 2EG.A34, "https://www.facebook.com/policies/ads/prohibited_content/discriminatory_practices");
                    sul.A0S = "promote";
                    break;
                } else {
                    DbS.A14();
                    throw AnonymousClass00P.createAndThrow();
                }
            case 1:
                C49585Eyu eyu = (C49585Eyu) this.A01;
                Context context = eyu.A00;
                UserSession userSession2 = eyu.A02;
                sul = new SUL(context, userSession2, 2EG.A0K, 182.A04(0Tu.A05, userSession2, 36887025975689962L), false);
                break;
            case 2:
                ((View.OnClickListener) this.A01).onClick(view);
                return;
            case 3:
                AnonymousClass4DH r5 = (AnonymousClass4DH) this.A01;
                C358248ab A0U = DbW.A0U(r5);
                A0U.A05 = r5.getString(2131974099);
                A0U.A0Y(C50020FJf.A00(r5, 34), C358278ae.RED_BOLD, DbU.A0m(r5, 2131957531), true);
                A0U.A0D((DialogInterface.OnClickListener) null);
                A0U.A0r(true);
                A0U.A0s(true);
                A0U.A0m(r5);
                DbT.A1V(A0U);
                return;
            default:
                E3X e3x = (E3X) this.A01;
                0hq r2 = e3x.mFragmentManager;
                if (r2 == null) {
                    return;
                }
                if (e3x.A0E) {
                    r2.A13();
                    return;
                } else {
                    r2.A19("recovery_lookup_screen", 1);
                    return;
                }
        }
        sul.A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48040ESf(Integer num, Object obj, int i) {
        super(num);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48040ESf(UZD uzd, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = uzd;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48040ESf(C49585Eyu eyu, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = eyu;
    }
}
