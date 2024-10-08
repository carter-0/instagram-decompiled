package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class TwB extends C232232tF {
    public final Context A00;
    public final UserSession A01;
    public final C14140Tqa A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C14855UCj uCj = (C14855UCj) r7;
        AnonymousClass7TG.A1N(r6, uCj);
        UserSession userSession = this.A01;
        Context context = this.A00;
        C14140Tqa tqa = this.A02;
        C51974G9v.A1M(userSession, context, tqa);
        tqa.A04.CkJ(tqa.A05.E4p());
        WB4.A00(uCj.A00, context, tqa, userSession, 53);
    }

    public final Class modelClass() {
        return C16190UqF.class;
    }

    public TwB(Context context, UserSession userSession, C14140Tqa tqa) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = tqa;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14855UCj(DbT.A0D(layoutInflater, viewGroup, R.layout.search_boost_disclosure, false));
    }
}
