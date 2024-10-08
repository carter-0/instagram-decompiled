package X;

import android.content.Context;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;

/* renamed from: X.925  reason: invalid class name */
public final class AnonymousClass925 extends 1P0 {
    public final /* synthetic */ AnonymousClass921 A00;

    public AnonymousClass925(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1059469354);
        C59689JTv.A0B(this.A00.A01, "something_went_wrong");
        AnonymousClass0fD.A0A(-1518119963, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(741548337);
        NHQ nhq = (NHQ) obj;
        int A032 = AnonymousClass0fD.A03(-482926111);
        0qQ.A0B(nhq, 0);
        I4R i4r = I4R.A00;
        AnonymousClass921 r5 = this.A00;
        UserSession userSession = r5.A05;
        0wc A02 = AnonymousClass0kN.A02(userSession);
        String str = r5.A09;
        boolean z = false;
        if (r5.A00 == LimitedInteractionsVersions.V2_CUSTOMIZABLE) {
            z = true;
        }
        I4R.A00(A02, str, C66579MXk.A00(155), z);
        i4r.A02(r5.A00, AnonymousClass0kN.A02(userSession), str, false);
        C310336ap r2 = new C310336ap();
        r2.A06();
        Context context = r5.A01;
        r2.A0D = context.getString(2131965006);
        r2.A0I = context.getString(2131965007);
        String string = context.getString(2131965008);
        0qQ.A07(string);
        r2.A0G = string;
        r2.A0A(new C72728PHi(nhq, r5));
        r2.A0L = true;
        1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
        AnonymousClass0fD.A0A(355014462, A032);
        AnonymousClass0fD.A0A(1178597485, A03);
    }
}
