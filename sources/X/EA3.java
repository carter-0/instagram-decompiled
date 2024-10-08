package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

public final class EA3 extends C231632rz {
    public final AnonymousClass0iw A00;
    public final OneTapLoginLandingFragment A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EA3(AnonymousClass0iw r1, OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        this.A00 = r1;
        this.A01 = oneTapLoginLandingFragment;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(2003375110);
        C49631Ezo ezo = (C49631Ezo) DbT.A0o(view);
        C319646qx r9 = (C319646qx) obj;
        AnonymousClass0iw r2 = this.A00;
        OneTapLoginLandingFragment oneTapLoginLandingFragment = this.A01;
        ImageUrl imageUrl = r9.A02;
        if (imageUrl != null) {
            ezo.A04.setUrl(imageUrl, r2);
        } else {
            ? r22 = ezo.A04;
            DbU.A13(r22.getContext(), r22, R.drawable.profile_anonymous_user);
        }
        ezo.A03.setText(r9.A07);
        FPG.A01(ezo.A00, oneTapLoginLandingFragment, r9, 0);
        FPG.A01(ezo.A01, oneTapLoginLandingFragment, r9, 1);
        FPG.A01(ezo.A02, oneTapLoginLandingFragment, r9, 2);
        AnonymousClass0fD.A0A(-1327904465, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-550007132);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_one_tap_user);
        viewGroup2.setTag(new C49631Ezo(viewGroup2));
        AnonymousClass0fD.A0A(-230962892, A03);
        return viewGroup2;
    }
}
