package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HwP  reason: case insensitive filesystem */
public abstract class C56312HwP {
    public static final void A01(C3034368u r3, C258333yq r4) {
        AnonymousClass6NS.A00(r4.A00, r3, r4.A03).A00().A07(r4.A02);
        r4.A01.setVisibility(0);
    }

    public static final C258333yq A00(LayoutInflater layoutInflater, ViewGroup viewGroup, C229382nI r4, UserSession userSession) {
        boolean A1Z = AnonymousClass7TG.A1Z(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.bloks_inform_overlay, viewGroup, A1Z);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return new C258333yq((FrameLayout) inflate, r4, userSession);
    }
}
