package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationListFragment;

/* renamed from: X.Uig  reason: case insensitive filesystem */
public final class C15797Uig extends C232222tE {
    public WUF A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C17896Vhn A03;
    public final C17626VbI A04;
    public final C18062Vko A05;
    public final LocationListFragment A06;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        ((C14908UEn) r3).A00(this.A00, (C19265WRy) r2);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        C18062Vko vko = this.A05;
        C17896Vhn vhn = this.A03;
        C17626VbI vbI = this.A04;
        LocationListFragment locationListFragment = this.A06;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0B(viewGroup, 0);
        C51974G9v.A1P(userSession, r3, vko, vhn);
        0qQ.A0B(vbI, 5);
        return new C14908UEn((ViewGroup) DbW.A09(DbV.A0D(viewGroup), viewGroup, R.layout.layout_location_list_item, false), r3, userSession, vhn, vbI, vko, locationListFragment);
    }

    public final Class modelClass() {
        return C19265WRy.class;
    }

    public C15797Uig(AnonymousClass0iw r1, UserSession userSession, C17896Vhn vhn, C17626VbI vbI, C18062Vko vko, LocationListFragment locationListFragment, WUF wuf) {
        this.A02 = userSession;
        this.A01 = r1;
        this.A00 = wuf;
        this.A05 = vko;
        this.A03 = vhn;
        this.A04 = vbI;
        this.A06 = locationListFragment;
    }
}
