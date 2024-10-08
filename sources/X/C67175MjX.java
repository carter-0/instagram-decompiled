package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MjX  reason: case insensitive filesystem */
public final class C67175MjX extends C232222tE {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final C267614bu A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C67114MiY miY = (C67114MiY) r9;
        C66983MgH mgH = (C66983MgH) r10;
        Context context = this.A01;
        UserSession userSession = this.A02;
        if (miY != null) {
            C66954Mfn mfn = miY.A00;
            if (mgH != null) {
                C66981MgF.A00(context, userSession, this.A03, mgH, mfn.A01, mfn.A02);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        int i2 = this.A00;
        View inflate = layoutInflater.inflate(R.layout.find_people_activation_list, viewGroup, false);
        inflate.setBackgroundResource(i2);
        inflate.setTag(new C66983MgH(inflate, A1U));
        return new C66983MgH(inflate, A1U);
    }

    public final Class modelClass() {
        return C67114MiY.class;
    }

    public C67175MjX(Context context, UserSession userSession, C267614bu r3, int i) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = r3;
        this.A00 = i;
    }
}
