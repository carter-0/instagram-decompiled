package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.tagging.activity.TaggingActivity;
import java.util.List;

/* renamed from: X.Lxw  reason: case insensitive filesystem */
public final class C65681Lxw implements C66464MSs {
    public final int A00;
    public final Object A01;

    public C65681Lxw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void ExP() {
        C64167LRj lRj;
        String str;
        switch (this.A00) {
            case 0:
                ((AJ2) this.A01).A06.A1D();
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                Context context = editMediaInfoFragment.getContext();
                context.getClass();
                editMediaInfoFragment.A0I.getClass();
                if (EditMediaInfoFragment.A0P(editMediaInfoFragment)) {
                    editMediaInfoFragment.A0J.getClass();
                    lRj = new C64167LRj(context, C62630Kj1.PRODUCT);
                    1Xj r4 = editMediaInfoFragment.A0I;
                    List list = editMediaInfoFragment.A1B;
                    str = null;
                    lRj.A06(r4, (1Xj) list.get(editMediaInfoFragment.A0J.A03), (String) null, editMediaInfoFragment.A0W, list, editMediaInfoFragment.A0g, (List) null, (List) null, editMediaInfoFragment.A0d, editMediaInfoFragment.A0e, editMediaInfoFragment.A0c);
                } else {
                    lRj = new C64167LRj(context, C62630Kj1.PRODUCT);
                    str = null;
                    lRj.A07(editMediaInfoFragment.A0I, (String) null, editMediaInfoFragment.A0a, editMediaInfoFragment.A0W, editMediaInfoFragment.A0b, editMediaInfoFragment.A0Z, editMediaInfoFragment.A0g, (List) null, (List) null);
                }
                lRj.A00 = editMediaInfoFragment.A0P;
                lRj.A03(editMediaInfoFragment.getSession());
                lRj.A0B = true;
                lRj.A0J = EditMediaInfoFragment.A0Q(editMediaInfoFragment);
                lRj.A04 = editMediaInfoFragment.A0I.A0C.ApT();
                Intent A02 = lRj.A02();
                2cc A002 = C71342cb.A00(editMediaInfoFragment.getSession());
                FragmentActivity activity = editMediaInfoFragment.getActivity();
                activity.getClass();
                A002.A0A(activity, str);
                0kR.A05(editMediaInfoFragment, A02, 1001);
                return;
            case 2:
                LE2 le2 = ((LP7) this.A01).A0C;
                if (C51971G9r.A1b(le2.A04)) {
                    C358248ab A0Y = DbS.A0Y(le2.A00);
                    A0Y.A09(2131969875);
                    A0Y.A08(2131953892);
                    Dba.A1L(A0Y);
                    return;
                }
                le2.A05.invoke();
                AnonymousClass6SR.A01().A0U = true;
                UserSession userSession = le2.A01;
                C59847JaN.A00(userSession).A04("TAG_PRODUCTS_TAPPED");
                le2.A03.A0C(C16581Uxb.FEED_SHARING, "media_broadcast_share", LTZ.A0I(userSession, le2.A02, false));
                27p.A01(userSession).A1X(AnonymousClass80P.TAG_PRODUCT);
                return;
            case 3:
                return;
            default:
                TaggingActivity.A0L((TaggingActivity) this.A01, C62630Kj1.PRODUCT, true);
                return;
        }
    }
}
