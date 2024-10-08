package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;

public final class EA8 extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C46656Dib A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EA8(AnonymousClass0iw r1, C46656Dib dib) {
        this.A00 = r1;
        this.A01 = dib;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 306631248);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.edit.adapter.FeaturedAccountsRowViewBinder.Holder");
        Ey1 ey1 = (Ey1) tag;
        C49503Ewi ewi = (C49503Ewi) obj;
        C46656Dib dib = this.A01;
        AnonymousClass0iw r4 = this.A00;
        boolean A1X = DbW.A1X(ey1);
        AnonymousClass7TG.A0w(2, ewi, dib, r4);
        User user = ewi.A01;
        ImageUrl Bh3 = user.Bh3();
        CircularImageView circularImageView = ey1.A01;
        0qQ.A0B(circularImageView, A1X ? 1 : 0);
        circularImageView.setUrl(Bh3, r4);
        DbU.A1H(ey1.A00, user);
        IgdsSwitch igdsSwitch = ey1.A02;
        igdsSwitch.setCheckedAnimated(ewi.A00);
        igdsSwitch.setClickable(A1X);
        FPG.A00(view, 24, dib, user);
        AnonymousClass0fD.A0A(668191954, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 976694697);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(DbV.A0D(viewGroup), viewGroup, R.layout.row_featured_accounts, false);
        viewGroup2.setTag(new Ey1(viewGroup2));
        AnonymousClass0fD.A0A(319688547, A04);
        return viewGroup2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
