package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WdK  reason: case insensitive filesystem */
public final class C19656WdK implements C231032ql {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final AnonymousClass4DU A03;
    public final C231052qn A04;
    public final String A05;

    public C19656WdK(Fragment fragment, UserSession userSession, AnonymousClass311 r4, AnonymousClass4DU r5, C231052qn r6, String str) {
        0qQ.A0B(r6, 6);
        this.A02 = r4;
        this.A01 = userSession;
        this.A03 = r5;
        this.A00 = fragment;
        this.A05 = str;
        this.A04 = r6;
    }

    public final void DzD(C16675UzB uzB, C268374dH r2, int i) {
    }

    public final void DzM(C268374dH r1) {
    }

    public final void DzN(C268374dH r1) {
    }

    public final void EBz(View view, C268374dH r4) {
        0qQ.A0B(r4, 1);
        C231052qn r1 = this.A04;
        String id = r4.getId();
        0qQ.A07(id);
        r1.A01(view, r4, id);
    }

    public final void A9u(C268374dH r3, int i) {
        C231052qn r1 = this.A04;
        String id = r3.getId();
        0qQ.A07(id);
        r1.A03(r3, id, i);
    }

    public final XC9 BgB() {
        return this.A02.BgB();
    }

    public final void DzI(C268374dH r13, User user) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            ArrayList arrayList = new ArrayList();
            Iterator A0h = JTQ.A0h(r13.Bg7().A03);
            while (A0h.hasNext()) {
                Product A022 = ((ProductFeedItem) A0h.next()).A02();
                if (A022 != null) {
                    arrayList.add(A022.A0H);
                }
            }
            C249713kF r2 = C249713kF.A00;
            UserSession userSession = this.A01;
            AnonymousClass4DU r6 = this.A03;
            String str = this.A05;
            String A012 = ((C268364dG) r13).A01();
            String A002 = AnonymousClass3ZA.A00(user);
            if (A002 != null) {
                W2P A0N = r2.A0N(activity, user.A03.BsB(), userSession, r6, str, (String) null, A012, A002, C13988Tno.A0b(user));
                A0N.A0H = arrayList;
                A0N.A05();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void FJ3(View view) {
        this.A04.A00.A04(view);
    }
}
