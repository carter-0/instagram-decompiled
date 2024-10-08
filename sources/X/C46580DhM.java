package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.DhM  reason: case insensitive filesystem */
public final class C46580DhM implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass3UK A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C46577DhJ A05;
    public final /* synthetic */ C46578DhK A06;
    public final /* synthetic */ C51981GAe A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ 0rk A0A;
    public final /* synthetic */ boolean A0B;

    public C46580DhM(Activity activity, AnonymousClass0iw r2, UserSession userSession, AnonymousClass3UK r4, User user, C46577DhJ dhJ, C46578DhK dhK, C51981GAe gAe, String str, List list, 0rk r11, boolean z) {
        this.A09 = list;
        this.A0A = r11;
        this.A02 = userSession;
        this.A04 = user;
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = str;
        this.A06 = dhK;
        this.A00 = activity;
        this.A07 = gAe;
        this.A05 = dhJ;
        this.A0B = z;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1235934304);
        List list = this.A09;
        list.remove(this.A0A.A00);
        int i = GBV.A04 - 1;
        GBV.A04 = i;
        int i2 = 0;
        if (i < 0) {
            GBV.A04 = 0;
        }
        UserSession userSession = this.A02;
        User user = this.A04;
        String id = user.getId();
        AnonymousClass3UK r6 = this.A03;
        1ES.A03(F88.A01(userSession, id, r6.CDC(), r6.getAlgorithm()));
        C230012om r5 = GBV.A06;
        if (r5 != null) {
            r5.A07(new AnonymousClass6KN(C46575DhH.A00(this.A01, r6, user, (Integer) DbV.A0r(user, GBV.A0A), this.A08)));
        }
        if (list.size() < 4) {
            C46578DhK dhK = this.A06;
            AnonymousClass0iw r4 = this.A01;
            Activity activity = this.A00;
            C51981GAe gAe = this.A07;
            C46575DhH.A02(activity, r4, userSession, dhK, gAe, this.A08, list, false);
            if (list.isEmpty() && gAe != null) {
                gAe.A00();
            }
        } else {
            int i3 = GBV.A04;
            User CCd = ((AnonymousClass3UK) list.get(GBV.A04)).CCd();
            if (CCd != null) {
                C46578DhK dhK2 = this.A06;
                C46577DhJ dhJ = this.A05;
                C46575DhH.A01(this.A00, this.A01, userSession, CCd, dhJ, dhK2, this.A07, this.A08, list, i3, this.A0B);
            }
            if (GBV.A04 < list.size() - 1) {
                i2 = GBV.A04 + 1;
            }
            GBV.A04 = i2;
        }
        AnonymousClass0fD.A0C(433383612, A052);
    }
}
