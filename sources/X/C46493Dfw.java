package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dfw  reason: case insensitive filesystem */
public final class C46493Dfw extends C232222tE {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 2el A03 = 2el.A00();

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        0qQ.A0B((Object) null, 0);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        0Tu A0J = DbS.A0J(userSession, 0);
        if ((!182.A06(A0J, userSession, 36314794596305705L) || 2El.A0C(userSession) || !DbV.A1Y(userSession)) && !182.A06(A0J, userSession, 36315460316171496L) && 182.A06(A0J, userSession, 36314197595785703L)) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View inflate = layoutInflater.inflate(R.layout.active_now_tray_shimmer_placeholder, viewGroup, false);
            0qQ.A0C(inflate, Pxd.A00(4));
            return new C47832EJe(new ComposeView(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0), (ShimmerFrameLayout) inflate, this);
        }
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47833EJf(layoutInflater, DbT.A0D(layoutInflater, viewGroup, R.layout.layout_direct_inbox_tray, false), this);
    }

    public final Class modelClass() {
        return C47227DtE.class;
    }

    public C46493Dfw(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = r2;
    }
}
