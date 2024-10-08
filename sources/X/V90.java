package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public abstract class V90 {
    /* JADX WARNING: type inference failed for: r0v10, types: [X.0iw, java.lang.Object] */
    public static final C15698Uh5 A00(C307896Rx r14, AnonymousClass6Tm r15) {
        2dZ A00;
        ViewGroup viewGroup;
        Object A03 = r15.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(0));
        C307786Rm r7 = (C307786Rm) A03;
        UserSession A0A = C308206Td.A0A(r7);
        DbS.A1Z(A0A);
        UserSession userSession = A0A;
        C276544tV A0P = DbY.A0P(r15, 1);
        Product A01 = C18132Vm8.A01(A0P);
        C277014uI A0P2 = DbW.A0P(r15, 2);
        Fragment fragment = ((C229382nI) r7.A02).A02;
        if (fragment == null || (A00 = C16859V8o.A00(fragment.requireActivity(), r7)) == null) {
            return null;
        }
        View view = fragment.mView;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        View childAt = ((ViewGroup) view).getChildAt(2);
        if (!(childAt instanceof FrameLayout) || (viewGroup = (ViewGroup) childAt) == null) {
            return null;
        }
        ViewGroup viewGroup2 = A00.A0P;
        if (!(viewGroup2 instanceof FrameLayout)) {
            return null;
        }
        View childAt2 = viewGroup2.getChildAt(1);
        if (!(childAt2 instanceof FrameLayout)) {
            return null;
        }
        View childAt3 = ((ViewGroup) childAt2).getChildAt(0);
        if (!(childAt3 instanceof LinearLayout)) {
            return null;
        }
        View childAt4 = ((ViewGroup) childAt3).getChildAt(2);
        if (!(childAt4 instanceof ImageView) || childAt4 == null) {
            return null;
        }
        C15698Uh5 uh5 = new C15698Uh5(r7.A00, fragment, new Object(), userSession);
        C2355830k r0 = uh5.A09;
        r0.A03(uh5);
        r0.A02(uh5);
        uh5.A01 = new C19716WeI(r7, r14, A0P, A0P2);
        uh5.A01(childAt4, viewGroup, A01);
        return uh5;
    }
}
