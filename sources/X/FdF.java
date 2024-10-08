package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class FdF implements MVB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ FEU A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ 0r1 A05;
    public final /* synthetic */ boolean A06;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdF(Context context, AnonymousClass0iw r2, UserSession userSession, FEU feu, User user, 0r1 r6, boolean z) {
        this.A05 = r6;
        this.A02 = userSession;
        this.A04 = user;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = feu;
        this.A06 = z;
    }

    public final void onButtonClick(View view) {
        this.A05.A00 = true;
        UserSession userSession = this.A02;
        User user = this.A04;
        List A1I = AnonymousClass7TE.A1I(user.getId());
        F5s.A01(C50165FRx.A00, FST.A00, userSession, A1I, false);
        AnonymousClass0iw r6 = this.A01;
        Context context = this.A00;
        FEU feu = new FEU(r6, userSession);
        Object obj = new Object();
        C310336ap A0a = DbS.A0a();
        A0a.A0D = DbY.A0b(context, user, 2131953351);
        A0a.A0L = true;
        DbW.A0q(context, A0a, 2131953350);
        A0a.A0A(new FdI(1, context, r6, userSession, feu, user, obj));
        A0a.A01 = 5000;
        DbW.A0t(context.getResources(), A0a);
        Dbb.A1Q(A0a);
        FEU feu2 = this.A03;
        String id = user.getId();
        0Aj A002 = FEU.A00(feu2);
        Dbb.A18(C48138EZg.APPROVE_TOAST, A002);
        A002.AAJ("target_user_id", id);
        FEU.A01(A002, feu2);
    }

    public final void onDismiss() {
        0r1 r1 = this.A05;
        if (r1.A00) {
            r1.A00 = false;
            return;
        }
        FEU feu = this.A03;
        String id = this.A04.getId();
        0Aj A002 = FEU.A00(feu);
        Dbb.A19(C48138EZg.APPROVE_TOAST, A002);
        A002.AAJ("target_user_id", id);
        FEU.A01(A002, feu);
    }

    public final void onShow() {
        if (this.A06) {
            C49966FGz.A04(this.A02, C49966FGz.A00);
        }
        FEU feu = this.A03;
        String id = this.A04.getId();
        0Aj A002 = FEU.A00(feu);
        Dbb.A1A(C48138EZg.APPROVE_TOAST, A002);
        A002.AAJ("target_user_id", id);
        FEU.A01(A002, feu);
    }
}
