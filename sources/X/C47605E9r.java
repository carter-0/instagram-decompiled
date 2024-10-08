package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.E9r  reason: case insensitive filesystem */
public final class C47605E9r extends C231632rz {
    public final E7A A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47605E9r(E7A e7a, AnonymousClass0iw r2) {
        this.A01 = r2;
        this.A00 = e7a;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1139565827);
        C49578Eyn eyn = (C49578Eyn) DbT.A0o(view);
        User user = (User) obj;
        AnonymousClass0iw r3 = this.A01;
        E7A e7a = this.A00;
        if (0mk.A02(view.getContext())) {
            view.setLayoutDirection(1);
        }
        ? r1 = eyn.A03;
        F44.A01(r1.getContext(), r3, r1, user);
        DbU.A1H(eyn.A02, user);
        FPH.A00(eyn.A00, e7a, user, eyn, 4);
        AnonymousClass0fD.A0A(-1982366828, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(166901295);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_account_linking_main_account_for_manage);
        viewGroup2.setTag(new C49578Eyn(viewGroup2));
        AnonymousClass0fD.A0A(1806618589, A03);
        return viewGroup2;
    }
}
