package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EGJ extends C232222tE {
    public final Context A00;
    public final C355568Qm A01;
    public final UserSession A02;
    public final 2el A03;
    public final AnonymousClass70R A04;
    public final Integer A05;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C47235DtM dtM = (C47235DtM) r8;
        C46992Dok dok = (C46992Dok) r9;
        AnonymousClass7TG.A1N(dtM, dok);
        Context context = this.A00;
        UserSession userSession = this.A02;
        Integer num = this.A05;
        C48956Emu.A00(context, userSession, this.A03, this.A04, dok, dtM, num);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46992Dok(DbU.A09(layoutInflater, viewGroup, R.layout.subinterest_round_pill, false), this.A01);
    }

    public final Class modelClass() {
        return C47235DtM.class;
    }

    public EGJ(Context context, C355568Qm r2, UserSession userSession, 2el r4, AnonymousClass70R r5, Integer num) {
        this.A02 = userSession;
        this.A00 = context;
        this.A05 = num;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }
}
