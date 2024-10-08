package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tv3  reason: case insensitive filesystem */
public final class C14374Tv3 extends C232222tE {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final WW4 A03;
    public final XBt A04;
    public final X41 A05;
    public final AnonymousClass4DU A06;
    public final C55972Hqd A07;
    public final String A08;
    public final boolean A09;

    public C14374Tv3(Context context, Fragment fragment, UserSession userSession, WW4 ww4, XBt xBt, X41 x41, AnonymousClass4DU r8, C55972Hqd hqd, String str, boolean z) {
        0qQ.A0B(userSession, 7);
        this.A01 = fragment;
        this.A06 = r8;
        this.A00 = context;
        this.A03 = ww4;
        this.A05 = x41;
        this.A04 = xBt;
        this.A02 = userSession;
        this.A08 = str;
        this.A09 = z;
        this.A07 = hqd;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_item_ad_image, false);
        return new C14906UEl(this.A01.requireActivity(), this.A00, A0D, this.A02);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r19, C249703kE r20) {
        C52435GSn gSn = (C52435GSn) r19;
        C14906UEl uEl = (C14906UEl) r20;
        AnonymousClass7TF.A1H(gSn, uEl);
        C296905qq r7 = gSn.A02;
        C296995qz B9n = this.A04.B9n(gSn);
        X41 x41 = this.A05;
        View view = uEl.A02;
        x41.ECL(view, B9n, r7, gSn, false);
        C55972Hqd hqd = this.A07;
        if (hqd != null) {
            String id = gSn.BPf().getId();
            if (id != null) {
                hqd.A00(view, id);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C18530Vti vti = C18530Vti.A00;
        Fragment fragment = this.A01;
        AnonymousClass4DU r12 = this.A06;
        vti.A00(AnonymousClass7TE.A0S(view), fragment, B9n, this.A02, r7, this.A03, uEl, gSn, (X9Q) null, r12, this.A08, this.A09);
    }

    public final Class modelClass() {
        return C52435GSn.class;
    }
}
