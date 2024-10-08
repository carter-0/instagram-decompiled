package X;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class GTC {
    public static final void A00(Context context, 1Xj r4, AnonymousClass4DU r5, GTD gtd) {
        IgImageView igImageView;
        SimpleImageUrl A1m;
        0qQ.A0B(r4, 1);
        if (r4.A4o()) {
            Uri uri = r4.A05;
            if (uri != null) {
                igImageView = gtd.A08;
                A1m = C253833rU.A00(uri, -1, -1);
            } else {
                return;
            }
        } else {
            igImageView = gtd.A08;
            A1m = r4.A1m(context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
            if (A1m == null) {
                throw AnonymousClass7TE.A0y();
            }
        }
        igImageView.setUrl(A1m, r5);
    }

    public final View A01(Context context, ViewGroup viewGroup, UserSession userSession) {
        int i;
        AnonymousClass7TG.A1O(userSession, viewGroup);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36330020255318434L)) {
            i = R.layout.layout_prism_cta_button;
        } else {
            boolean A06 = 182.A06(r2, userSession, 36329749672378686L);
            i = R.layout.layout_cta_button;
            if (A06) {
                i = R.layout.layout_cta_button_v2;
            }
        }
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, i, false);
        A0A.setTag(new GTD(A0A));
        return A0A;
    }
}
