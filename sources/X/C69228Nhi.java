package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nhi  reason: case insensitive filesystem */
public final class C69228Nhi extends C49727F3r {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1pl A02;

    public C69228Nhi(FragmentActivity fragmentActivity, UserSession userSession, 1pl r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void A01() {
        02m.A0p.markerPoint(387849633, "network_request_failed");
        C59689JTv.A0D(this.A00, "request_error");
    }

    public final void A02() {
        02m.A0p.markerPoint(387849633, "network_request_start");
    }

    public final void A04(Integer num) {
        02m.A0p.markerPoint(387849633, AnonymousClass000.A00(712));
    }
}
