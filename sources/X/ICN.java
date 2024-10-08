package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class ICN implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ String A04;

    public ICN(Context context, AnonymousClass0iw r2, UserSession userSession, 1Xj r4, String str) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = context;
        this.A04 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1151860944);
        I6E.A00.A03(this.A01, this.A02, this.A03, AnonymousClass05K.A0C);
        Context context = this.A00;
        0qQ.A0A(context);
        FH7.A03(context, this.A04);
        AnonymousClass0fD.A0C(-1796297244, A05);
    }
}
