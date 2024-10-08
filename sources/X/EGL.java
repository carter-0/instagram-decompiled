package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EGL extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final 2el A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        0qQ.A0B((Object) null, 0);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47003Dov(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_active_now_user, false), this);
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        0qQ.A0B(r2, 0);
    }

    public final Class modelClass() {
        return C47226DtD.class;
    }

    public EGL(AnonymousClass0iw r1, UserSession userSession, 2el r3) {
        AnonymousClass7TG.A1U(userSession, r1, r3);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }
}
