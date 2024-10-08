package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;

/* renamed from: X.E9z  reason: case insensitive filesystem */
public final class C47613E9z extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C47410E1c A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47613E9z(AnonymousClass0iw r1, C47410E1c e1c) {
        this.A00 = r1;
        this.A01 = e1c;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(782356875);
        C49555Exq exq = (C49555Exq) DbT.A0o(view);
        C49487EwS ewS = (C49487EwS) obj;
        C47410E1c e1c = this.A01;
        AnonymousClass0iw r3 = this.A00;
        User user = ewS.A01;
        CircularImageView circularImageView = exq.A01;
        ImageUrl Bh3 = user.Bh3();
        DbY.A1S(circularImageView, r3);
        circularImageView.setUrl(Bh3, r3);
        DbU.A1H(exq.A00, user);
        IgdsCheckBox igdsCheckBox = exq.A02;
        igdsCheckBox.setBackgroundDrawable(AnonymousClass3JT.A07(view.getContext(), R.color.badge_color));
        igdsCheckBox.setChecked(ewS.A00);
        FPF.A00(view, 60, ewS, e1c);
        AnonymousClass0fD.A0A(-1445431143, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1219787994);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_follow_from_other_accounts);
        viewGroup2.setTag(new C49555Exq(viewGroup2));
        AnonymousClass0fD.A0A(-1577359078, A03);
        return viewGroup2;
    }
}
