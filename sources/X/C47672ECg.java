package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ECg  reason: case insensitive filesystem */
public final class C47672ECg extends 1P0 {
    public final /* synthetic */ AnonymousClass36O A00;

    public C47672ECg(AnonymousClass36O r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1322328588);
        C47672ECg.super.onFail(r5);
        AnonymousClass36O r1 = this.A00;
        boolean z = AnonymousClass36O.A0G;
        Context context = r1.A01.getContext();
        if (context != null) {
            String string = context.getString(2131956761);
            C358248ab A002 = C49952FGh.A00(context);
            A002.A0q(string);
            DbT.A1V(A002);
        }
        AnonymousClass0fD.A0A(-512275002, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(703193743);
        AnonymousClass36O r2 = this.A00;
        boolean z = AnonymousClass36O.A0G;
        AnonymousClass36Q.A01(r2.A01, r2.A02);
        AnonymousClass0fD.A0A(-811336339, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-717764865);
        AnonymousClass36O r2 = this.A00;
        boolean z = AnonymousClass36O.A0G;
        AnonymousClass36Q.A02(r2.A01, r2.A02);
        AnonymousClass0fD.A0A(1817228693, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1912276608);
        AnonymousClass371 r6 = (AnonymousClass371) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -303216686);
        C47672ECg.super.onSuccess(r6);
        User user = ((EtB) r6.FH3()).A00;
        AnonymousClass36O r1 = this.A00;
        boolean z = AnonymousClass36O.A0G;
        UserSession userSession = r1.A04;
        DbT.A1S(userSession, user);
        user.A0d(userSession);
        AnonymousClass0fD.A0A(520503742, A0D);
        AnonymousClass0fD.A0A(-693877750, A03);
    }
}
