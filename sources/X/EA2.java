package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.user.model.User;

public final class EA2 extends C231632rz {
    public final AnonymousClass0iw A00;
    public final E36 A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EA2(AnonymousClass0iw r1, E36 e36) {
        this.A00 = r1;
        this.A01 = e36;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(257161138);
        Ez7 ez7 = (Ez7) DbT.A0o(view);
        User user = (User) obj;
        AnonymousClass0iw r2 = this.A00;
        E36 e36 = this.A01;
        ez7.A03.setUrl(user.Bh3(), r2);
        DbU.A1H(ez7.A02, user);
        ez7.A01.setText(user.A0Q());
        AnonymousClass0fU.A00(new FPF(e36, user, 70), ez7.A00);
        AnonymousClass0fD.A0A(1760467584, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1624704714);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_account_recovery_user);
        viewGroup2.setTag(new Ez7(viewGroup2));
        AnonymousClass0fD.A0A(1928242358, A03);
        return viewGroup2;
    }
}
