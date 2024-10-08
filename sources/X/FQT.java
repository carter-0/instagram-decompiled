package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.android.R;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.user.model.User;

public final /* synthetic */ class FQT implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ E7A A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ FQT(E7A e7a, User user) {
        this.A00 = e7a;
        this.A01 = user;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Spanned A012;
        C50025FJk A002;
        User user;
        E7A e7a = this.A00;
        User user2 = this.A01;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_remove) {
            return false;
        }
        if (e7a.getActivity() == null || e7a.getContext() == null) {
            return true;
        }
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(e7a.getSession()), e7a.getSession());
        boolean z = true;
        if (A09 == null || (user = A09.A01) == null || user.A03.BBn() != HasPasswordState.FALSE || e7a.A00.A00.size() != 1 || !1AW.A06(0Tu.A05, 18298046739776629L)) {
            z = false;
        }
        Resources resources = e7a.getActivity().getResources();
        if (z) {
            A012 = 0bC.A01(resources, new String[]{DbX.A0q(e7a.getSession()), user2.getUsername()}, 2131952062);
            A002 = C50025FJk.A00(e7a, user2, 0);
        } else {
            A012 = 0bC.A01(resources, new String[]{DbX.A0q(e7a.getSession()), user2.getUsername()}, 2131952060);
            A002 = C50025FJk.A00(e7a, user2, 1);
        }
        C358248ab A0Y = DbS.A0Y(e7a.getContext());
        A0Y.A09(2131952061);
        A0Y.A0q(A012);
        A0Y.A0K(A002, 2131971974);
        A0Y.A0P((DialogInterface.OnClickListener) null, C358278ae.BLUE, 2131954722);
        AnonymousClass7TH.A0a(A0Y, true);
        return true;
    }
}
