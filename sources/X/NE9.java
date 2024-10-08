package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.instagram.android.R;

public abstract class NE9 extends C69663Npl {
    public final View A01(ViewGroup viewGroup, C74227PrG prG) {
        OmniGridView omniGridView = (OmniGridView) prG;
        View view = omniGridView.A01;
        if (view == null) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            view = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.layout_call_participant_cell, false);
        }
        omniGridView.A01 = view;
        return view;
    }

    public final void A02(ViewGroup viewGroup, C74227PrG prG, C68166N3g n3g) {
        0fh.A01("GridViewSelfItemDefinition.bind", -1635029712);
        try {
            Object obj = ((OmniGridView) prG).A03;
            if (obj == null) {
                obj = A00(viewGroup);
            }
            NE7 ne7 = (NE7) obj;
            AnonymousClass7TG.A1N(n3g, ne7);
            ne7.A03(n3g);
        } finally {
            0fh.A00(1198810963);
        }
    }
}
