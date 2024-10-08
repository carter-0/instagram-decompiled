package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Iterator;
import java.util.List;

public final class OMY {
    public final UserSession A00;
    public final OGW A01;

    public final void A01(C74280Ps8 ps8, List list) {
        OGW ogw = this.A01;
        ogw.A00 = ps8;
        ViewGroup viewGroup = ogw.A02;
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C74280Ps8 ps82 = (C74280Ps8) it.next();
            C70596OCt oCt = new C70596OCt(ogw.A01, new C71409Ok8(36, (Object) ps82, (Object) ogw), viewGroup, ps82);
            IgSimpleImageView igSimpleImageView = oCt.A00;
            viewGroup.addView(igSimpleImageView);
            ogw.A04.add(oCt);
            igSimpleImageView.setSelected(AnonymousClass7TF.A1W(oCt.A01, ogw.A00));
        }
    }

    public OMY(ViewGroup viewGroup, UserSession userSession, C74371Ptl ptl) {
        AnonymousClass7TG.A1O(userSession, viewGroup);
        this.A00 = userSession;
        this.A01 = new OGW(viewGroup, ptl);
    }

    public final Fragment A00(0hq r8, C74586PxZ pxZ) {
        AnonymousClass7TG.A1N(r8, pxZ);
        PRE pre = (PRE) pxZ;
        String str = pre.A02;
        Fragment A0R = r8.A0R(str);
        if (A0R == null) {
            A0R = (Fragment) pre.A03.get();
        }
        0s1 r3 = new 0s1(r8);
        for (Fragment fragment : r8.A0U.A04()) {
            if (fragment != null && fragment.mFragmentId == R.id.fragment_tab_container) {
                r3.A0M(fragment);
            }
        }
        if (A0R.isAdded()) {
            r3.A0N(A0R);
        } else {
            r3.A0C(A0R, str, R.id.fragment_tab_container);
        }
        r3.A0K();
        return A0R;
    }
}
