package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Collection;

public final class FGE {
    public static final FGE A00 = new Object();

    public final void A03(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession) {
        0qQ.A0B(xIGIGBoostCallToAction, 1);
        A00(fragmentActivity);
        String A0c = DbY.A0c(fragmentActivity, fragmentActivity.getString(C48959Emx.A00(xIGIGBoostCallToAction)), 2131964836);
        String A16 = AnonymousClass7TE.A16(fragmentActivity, C48959Emx.A00(xIGIGBoostCallToAction));
        SpannableStringBuilder A0C = DbS.A0C(A0c);
        AnonymousClass7AV.A03(A0C, new StyleSpan(1), A16);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = A0C;
        DbW.A0q(fragmentActivity, A0a, 2131964835);
        A0a.A0A(new FdA(3, xIGIGBoostCallToAction, fragmentActivity, userSession));
        A0a.A0L = true;
        DbY.A1N(A0a);
    }

    public static final void A00(FragmentActivity fragmentActivity) {
        0kR.A0B(fragmentActivity, DbX.A08(fragmentActivity));
        AnonymousClass2ZQ A002 = C71172bH.A00();
        if (A002 != null) {
            A002.E32();
            A002.Eng(1QK.A0E);
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, C16602Uxw uxw, User user) {
        long j;
        Long A10;
        AnonymousClass7TG.A1O(user, userSession);
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        DbU.A0v();
        String username = user.getUsername();
        ImageUrl Bh3 = user.Bh3();
        int A01 = DbX.A01(user.A03.B6v());
        String id = user.getId();
        String fbidV2 = user.A03.getFbidV2();
        if (fbidV2 == null || (A10 = AnonymousClass7TE.A10(fbidV2)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        String str = uxw.A01.A00;
        Bundle A0B = DbV.A0B(str, 5);
        C61378K4w k4w = new C61378K4w();
        A0B.putString(AnonymousClass000.A00(2638), username);
        A0B.putParcelable(AnonymousClass000.A00(2637), Bh3);
        A0B.putInt(AnonymousClass000.A00(2635), A01);
        A0B.putString(AnonymousClass000.A00(2636), id);
        A0B.putLong(AnonymousClass000.A00(2634), j);
        A0B.putString("args_entry_point", str);
        k4w.setArguments(A0B);
        String A002 = AnonymousClass000.A00(1546);
        A0M.A0C = A002;
        A0M.A0A = A002;
        A0M.A0D(k4w);
        A0M.A04();
    }

    public static final boolean A02(FragmentActivity fragmentActivity) {
        0hq A002 = C229102mq.A00(fragmentActivity);
        Collection A0C = C229632nm.A0C(0, A002.A0M());
        if (!(A0C instanceof Collection) || !A0C.isEmpty()) {
            0sh it = A0C.iterator();
            while (it.hasNext()) {
                if (00p.A0j(A002.A0T(it.A00()).A09, SupportLinksFragment.A06, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
