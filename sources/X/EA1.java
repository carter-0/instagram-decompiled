package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;

public final class EA1 extends C231632rz {
    public final AnonymousClass0iw A00;
    public final E36 A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7V(0, obj, obj2);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EA1(AnonymousClass0iw r1, E36 e36) {
        this.A00 = r1;
        this.A01 = e36;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        LinearLayout linearLayout;
        int i2;
        int A03 = AnonymousClass0fD.A03(1035765544);
        C49630Ezn ezn = (C49630Ezn) DbT.A0o(view);
        User user = (User) obj;
        AnonymousClass0iw r2 = this.A00;
        E36 e36 = this.A01;
        ezn.A03.setUrl(user.Bh3(), r2);
        DbU.A1H(ezn.A02, user);
        ezn.A01.setText(user.A0Q());
        int ordinal = ((EVD) obj2).ordinal();
        if (ordinal == 1) {
            IgdsCheckBox igdsCheckBox = ezn.A04;
            igdsCheckBox.setChecked(true);
            igdsCheckBox.setEnabled(true);
            linearLayout = ezn.A00;
            i2 = 68;
            AnonymousClass0fU.A00(new FPF(e36, user, i2), linearLayout);
        } else if (ordinal == 0) {
            IgdsCheckBox igdsCheckBox2 = ezn.A04;
            igdsCheckBox2.setChecked(false);
            igdsCheckBox2.setEnabled(true);
            linearLayout = ezn.A00;
            i2 = 69;
            AnonymousClass0fU.A00(new FPF(e36, user, i2), linearLayout);
        } else if (ordinal == 2) {
            IgdsCheckBox igdsCheckBox3 = ezn.A04;
            igdsCheckBox3.setChecked(true);
            igdsCheckBox3.setEnabled(false);
            ezn.A00.setOnClickListener((View.OnClickListener) null);
        }
        AnonymousClass0fD.A0A(289050270, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1072609808);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_account_recovery_user_redesign);
        viewGroup2.setTag(new C49630Ezn(viewGroup2));
        AnonymousClass0fD.A0A(80410062, A03);
        return viewGroup2;
    }
}
