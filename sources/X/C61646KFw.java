package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;

/* renamed from: X.KFw  reason: case insensitive filesystem */
public final class C61646KFw extends C232222tE {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final MSR A02;
    public final EXG A03;
    public final JSz A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        UserSession userSession = this.A00;
        EXG exg = this.A03;
        MSR msr = this.A02;
        JSz jSz = this.A04;
        AnonymousClass4DU r5 = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = viewGroup.getContext();
        return new C60708Jpt(context, LayoutInflater.from(context).inflate(R.layout.igtv_thumbnail, viewGroup, false), userSession, r5, msr, exg, (I9I) null, jSz, true, false);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64790LiA liA = (C64790LiA) r4;
        C60708Jpt jpt = (C60708Jpt) r5;
        AnonymousClass7TG.A1N(liA, jpt);
        MXT mxt = liA.A01;
        IGTVViewerLoggingToken iGTVViewerLoggingToken = jpt.A0F;
        iGTVViewerLoggingToken.A01 = jpt.getBindingAdapterPosition();
        iGTVViewerLoggingToken.A00 = 0;
        C60708Jpt.A01(mxt, jpt);
    }

    public final Class modelClass() {
        return C64790LiA.class;
    }

    public C61646KFw(UserSession userSession, AnonymousClass4DU r2, MSR msr, EXG exg, JSz jSz) {
        this.A00 = userSession;
        this.A03 = exg;
        this.A01 = r2;
        this.A02 = msr;
        this.A04 = jSz;
    }
}
