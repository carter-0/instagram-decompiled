package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

public final class FOZ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    public FOZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, boolean z) {
        this.A00 = i;
        this.A05 = obj;
        this.A07 = obj5;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A04 = obj7;
        this.A06 = obj6;
        this.A02 = obj4;
        this.A08 = z;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-1614703744);
                UserSession userSession = (UserSession) this.A07;
                Activity activity = (Activity) this.A01;
                2Er r10 = (2Er) this.A04;
                AnonymousClass0iw r8 = (AnonymousClass0iw) this.A02;
                ((C314466iJ) this.A06).CLU();
                C47423E1r e1r = new C47423E1r();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean("open_from_first_banner", false);
                C331127Pr A0V = DbV.A0V(A0a, e1r, userSession);
                A0V.A0g = String.valueOf(((Context) this.A05).getText(2131960555));
                A0V.A1J = true;
                A0V.A0K = new FO6(4, activity, r8, userSession, r10);
                DbU.A0y(activity, e1r, A0V);
                C48805EkT.A00(r8, userSession, "thread_ctd_upsell_education_content_banner_impression", r10.C6C());
                String C6C = r10.C6C();
                if (this.A08) {
                    str = "thread_ctd_upsell_single_create_messaging_ads_banner_learm_more_click";
                } else {
                    str = "thread_ctd_upsell_second_banner_learn_more_click";
                }
                C48805EkT.A00(r8, userSession, str, C6C);
                i2 = -1491247541;
                break;
            case 1:
                i = AnonymousClass0fD.A05(2007911486);
                Context context = (Context) this.A02;
                UserSession userSession2 = (UserSession) this.A07;
                boolean z = this.A08;
                N4P n4p = (N4P) this.A06;
                C68303N9q n9q = (C68303N9q) this.A05;
                C330957Ox r14 = (C330957Ox) this.A03;
                C254793t3 r15 = n4p.A0L;
                if (!C71118OdC.A03((Activity) context, context, (AnonymousClass0iw) this.A01, userSession2, (2EM) null, C330397Mp.A00(n4p), false)) {
                    List A1I = AnonymousClass7TE.A1I(MessagingUser.A00(n9q.A00));
                    String A022 = C330397Mp.A02(context, userSession2, n4p, z);
                    String username = n9q.getUsername();
                    ImageUrl Bh3 = n9q.Bh3();
                    0qQ.A0B(r15, 0);
                    r14.A01.A02(C330957Ox.A00(r14, r15).EEQ(r15, A1I).A0H(), new PU8(new C70819OMo(Bh3, r14, r15, A022, username, 1), 36));
                    n9q.getId();
                }
                i2 = 980462333;
                break;
            case 2:
                F12 f12 = (F12) this.A01;
                User user = (User) this.A02;
                Context context2 = (Context) this.A03;
                UserSession userSession3 = (UserSession) this.A04;
                C2355930l r3 = (C2355930l) this.A05;
                AnonymousClass07i r82 = (AnonymousClass07i) this.A06;
                AnonymousClass0iw r7 = (AnonymousClass0iw) this.A07;
                boolean z2 = this.A08;
                boolean z3 = !user.A26();
                C49789F6x.A01(context2, f12, z3);
                AnonymousClass0fU.A00(new FOZ(r3, context2, f12, user, r7, r82, userSession3, 2, z3), f12.A01);
                boolean z4 = !z2;
                r3.A01(r7, new C228602lw(context2, r82), new C49564Exz(context2, f12, user), user, z4);
                C297555rw A002 = C297545rv.A00(userSession3);
                String moduleName = r7.getModuleName();
                if (z4) {
                    A002.A00(user, moduleName, (String) null, (String) null, "following_sheet");
                    return;
                } else {
                    A002.A01(user, moduleName, (String) null, (String) null, "following_sheet");
                    return;
                }
            default:
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
