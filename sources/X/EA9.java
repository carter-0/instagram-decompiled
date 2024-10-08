package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.selectableview.SingleSelectableAvatar;
import com.instagram.user.model.User;

public final class EA9 extends C231632rz {
    public final AnonymousClass0iw A00;
    public final E9D A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EA9(AnonymousClass0iw r1, E9D e9d) {
        this.A00 = r1;
        this.A01 = e9d;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1969686892);
        C49641Ezy ezy = (C49641Ezy) DbT.A0o(view);
        C49511Ewq ewq = (C49511Ewq) obj;
        AnonymousClass0iw r7 = this.A00;
        E9D e9d = this.A01;
        CheckBox checkBox = ezy.A01;
        DbU.A11(checkBox.getContext(), checkBox, R.drawable.checkbox_selector);
        SingleSelectableAvatar singleSelectableAvatar = ezy.A04;
        User user = ewq.A01;
        singleSelectableAvatar.setUrl(user.Bh3(), r7);
        TextView textView = ezy.A03;
        C244273av.A0B(textView, user.isVerified());
        DbU.A1H(textView, user);
        ezy.A02.setText(user.getFullName());
        checkBox.setChecked(ewq.A00);
        FPH.A00(ezy.A00, ezy, e9d, ewq, 56);
        AnonymousClass0fD.A0A(57240168, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1783126738);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_reel_viewer_user);
        A0C.setTag(new C49641Ezy(A0C));
        AnonymousClass0fD.A0A(-1650217492, A03);
        return A0C;
    }
}
