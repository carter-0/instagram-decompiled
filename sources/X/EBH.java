package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EBH extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Runnable A02;

    public EBH(Context context, UserSession userSession, Runnable runnable) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(994520456);
        C47321Duo duo = (C47321Duo) obj;
        int A0D = AnonymousClass7TG.A0D(duo, -1251114952);
        C47149DrQ drQ = duo.A00;
        if (drQ == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        int ordinal = drQ.A00.ordinal();
        if (ordinal == 2) {
            FV5 fv5 = FV5.A00;
            Context context = this.A00;
            UserSession userSession = this.A01;
            Runnable runnable = this.A02;
            C358248ab A0Y = DbS.A0Y(context);
            DbT.A19(context, A0Y, 2131976600);
            DbU.A17(context, A0Y, 2131976599);
            C50025FJk.A01(A0Y, runnable, userSession, 16, 2131975588);
            A0Y.A0H(FJA.A00, 2131968513);
            A0Y.A04();
            DbT.A1V(A0Y);
            Dba.A1I(AnonymousClass0kN.A01(fv5, userSession), "verified_calling_dialog_impression");
        } else if (ordinal == 3) {
            this.A02.run();
        }
        AnonymousClass0fD.A0A(-1987503776, A0D);
        AnonymousClass0fD.A0A(-1388319167, A03);
    }
}
