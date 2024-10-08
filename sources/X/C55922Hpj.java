package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hpj  reason: case insensitive filesystem */
public final class C55922Hpj {
    public final Context A00;

    public final void A00(DialogInterface.OnClickListener onClickListener, UserSession userSession, 1Xj r17, Integer num) {
        int i;
        UserSession userSession2 = userSession;
        Integer num2 = num;
        int A02 = DbW.A02(0, num2, userSession2);
        Context context = this.A00;
        C358248ab A0Y = DbS.A0Y(context);
        LRh lRh = new LRh(userSession2, context);
        1Xj r5 = r17;
        switch (num2.intValue()) {
            case 0:
                A0Y.A09(2131968954);
                A0Y.A08(2131968953);
                A0Y.A0K(new I90(userSession2, r5, this, lRh, 1), 2131963287);
                A0Y.A0r(true);
                A0Y.A0s(true);
                A0Y.A0C(onClickListener);
                break;
            case 1:
                A0Y.A09(2131969033);
                A0Y.A08(2131969031);
                A0Y.A0K(new I90(userSession2, r5, this, lRh, A02), 2131969032);
                A0Y.A0r(true);
                A0Y.A0s(true);
                A0Y.A05();
                break;
            case 2:
                A0Y.A09(2131968946);
                A0Y.A08(2131968944);
                A0Y.A06();
                A0Y.A0H(onClickListener, 2131968945);
                A0Y.A0r(true);
                A0Y.A0s(true);
                lRh.A06(true);
                break;
            case 3:
                A0Y.A09(2131969011);
                A0Y.A08(2131969010);
                A0Y.A06();
                A0Y.A0r(true);
                A0Y.A0s(true);
                lRh.A06(false);
                break;
            case 4:
                A0Y.A09(2131969013);
                i = 2131969012;
                break;
            case 5:
                A0Y.A09(2131969013);
                i = 2131969014;
                break;
            case 6:
                A0Y.A09(2131969013);
                i = 2131969009;
                break;
            default:
                A0Y.A09(2131968948);
                i = 2131968947;
                break;
        }
        A0Y.A08(i);
        A0Y.A06();
        A0Y.A0r(true);
        A0Y.A0s(true);
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            try {
                DbT.A1V(A0Y);
            } catch (WindowManager.BadTokenException unused) {
            }
        }
    }

    public C55922Hpj(Context context) {
        this.A00 = context;
    }
}
