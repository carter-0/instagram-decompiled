package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UiN  reason: case insensitive filesystem */
public final class C15778UiN extends C232222tE {
    public final C229382nI A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        WS2 ws2 = (WS2) r5;
        C14889UDr uDr = (C14889UDr) r6;
        AnonymousClass7TG.A1N(ws2, uDr);
        C3034368u r2 = (C3034368u) ws2.A00.A01;
        if (r2 != null) {
            AnonymousClass6NS.A00(uDr.A00, r2, uDr.A03).A00().A07(uDr.A02);
            uDr.A01.setVisibility(0);
            return;
        }
        uDr.A01.setVisibility(8);
    }

    public final Class modelClass() {
        return WS2.class;
    }

    public C15778UiN(C229382nI r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        C229382nI r2 = this.A00;
        AnonymousClass7TG.A1Q(userSession, r2);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.tagging_feed_bloks, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(2));
        return new C14889UDr((FrameLayout) inflate, r2, userSession);
    }
}
