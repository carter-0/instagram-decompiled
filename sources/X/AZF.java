package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class AZF implements AnonymousClass3NL {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C351978Be A03;

    public final void DP5(View view) {
    }

    public AZF(Activity activity, Context context, UserSession userSession, C351978Be r4) {
        this.A03 = r4;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = context;
    }

    public final boolean Dqe(View view) {
        AnonymousClass8BA r1 = this.A03.A00;
        if (C271404in.A0E(AnonymousClass7TF.A0M(r1).A17())) {
            FGM.A04(this.A02, this.A01);
            return true;
        }
        C357088Wk r0 = (C357088Wk) r1.A1x.get();
        if (r0 != null) {
            r0.A0E();
        }
        this.A00.finish();
        return true;
    }
}
