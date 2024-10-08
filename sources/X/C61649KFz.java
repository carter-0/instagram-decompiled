package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;

/* renamed from: X.KFz  reason: case insensitive filesystem */
public final class C61649KFz extends C232222tE {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final MSR A02;
    public final I9I A03;
    public final JSz A04;
    public final 0sK A05;
    public final boolean A06 = true;

    public C61649KFz(UserSession userSession, AnonymousClass4DU r3, MSR msr, I9I i9i, JSz jSz, 0sK r7) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = msr;
        this.A04 = jSz;
        this.A01 = r3;
        this.A03 = i9i;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        UserSession userSession = this.A00;
        EXG exg = EXG.A0h;
        MSR msr = this.A02;
        JSz jSz = this.A04;
        AnonymousClass4DU r6 = this.A01;
        boolean z = this.A06;
        I9I i9i = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = viewGroup.getContext();
        return new C60708Jpt(context, LayoutInflater.from(context).inflate(R.layout.igtv_thumbnail, viewGroup, false), userSession, r6, msr, exg, i9i, jSz, z, true);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64781Lhx lhx = (C64781Lhx) r5;
        C60708Jpt jpt = (C60708Jpt) r6;
        AnonymousClass7TF.A1H(lhx, jpt);
        MXT mxt = lhx.A00;
        IGTVViewerLoggingToken iGTVViewerLoggingToken = jpt.A0F;
        iGTVViewerLoggingToken.A01 = jpt.getBindingAdapterPosition();
        iGTVViewerLoggingToken.A00 = 0;
        C60708Jpt.A01(mxt, jpt);
        0sK r2 = this.A05;
        if (r2 != null) {
            r2.invoke(JTO.A0F(jpt), Integer.valueOf(jpt.getLayoutPosition()), mxt);
        }
    }

    public final Class modelClass() {
        return C64781Lhx.class;
    }
}
