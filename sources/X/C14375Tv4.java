package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tv4  reason: case insensitive filesystem */
public final class C14375Tv4 extends C232222tE {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final WW4 A03;
    public final XBt A04;
    public final X41 A05;
    public final X9Q A06;
    public final AnonymousClass4DU A07;
    public final C55972Hqd A08;
    public final String A09;
    public final boolean A0A;

    public C14375Tv4(Context context, Fragment fragment, UserSession userSession, WW4 ww4, XBt xBt, X41 x41, X9Q x9q, AnonymousClass4DU r9, C55972Hqd hqd, String str, boolean z) {
        C13988Tno.A1O(userSession, 7, x9q);
        this.A01 = fragment;
        this.A07 = r9;
        this.A00 = context;
        this.A03 = ww4;
        this.A05 = x41;
        this.A04 = xBt;
        this.A02 = userSession;
        this.A09 = str;
        this.A0A = z;
        this.A08 = hqd;
        this.A06 = x9q;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_item_video_ad, false);
        Context context = this.A00;
        X9Q x9q = this.A06;
        return new C15943UlD(this.A01.requireActivity(), context, A0D, this.A02, x9q);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r18, C249703kE r19) {
        C14348TuX tuX = (C14348TuX) r18;
        C14906UEl uEl = (C14906UEl) r19;
        boolean A1Z = AnonymousClass7TG.A1Z(tuX, uEl);
        C296905qq r6 = tuX.A02;
        C296995qz B9n = this.A04.B9n(tuX);
        X41 x41 = this.A05;
        View view = uEl.A02;
        x41.ECL(view, B9n, r6, tuX, A1Z);
        C55972Hqd hqd = this.A08;
        if (hqd != null) {
            String id = tuX.A00.getId();
            if (id != null) {
                hqd.A00(view, id);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C18530Vti vti = C18530Vti.A00;
        Fragment fragment = this.A01;
        AnonymousClass4DU r11 = this.A07;
        Context A0S = AnonymousClass7TE.A0S(view);
        WW4 ww4 = this.A03;
        vti.A00(A0S, fragment, B9n, this.A02, r6, ww4, uEl, tuX, this.A06, r11, this.A09, this.A0A);
    }

    public final Class modelClass() {
        return C14348TuX.class;
    }
}
