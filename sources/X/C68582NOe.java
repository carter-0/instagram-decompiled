package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NOe  reason: case insensitive filesystem */
public final class C68582NOe extends C232222tE {
    public final C320606se A00;
    public final C320326sC A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final XBt A04;
    public final X41 A05;

    public C68582NOe(C320326sC r9, AnonymousClass0iw r10, UserSession userSession, XBt xBt, X41 x41) {
        C51973G9u.A0r(2, userSession, xBt, r9);
        this.A02 = r10;
        this.A03 = userSession;
        this.A05 = x41;
        this.A04 = xBt;
        this.A01 = r9;
        C320486sS r4 = new C320486sS(0.5625f, false, false);
        this.A00 = new C320606se((C321686ua) null, (C320596sd) null, r4, r9, r10, userSession);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        AnonymousClass0YZ[] r0 = C66970Mg3.A0E;
        return new C66970Mg3(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_grid_item, false));
    }

    public final Class modelClass() {
        return C69010Ncm.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C66583MXo.A0p();
        throw AnonymousClass00P.createAndThrow();
    }
}
