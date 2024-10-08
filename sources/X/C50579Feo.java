package X;

import android.os.Build;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import java.util.List;

/* renamed from: X.Feo  reason: case insensitive filesystem */
public final class C50579Feo implements JS9 {
    public final UserSession A00;
    public final AnonymousClass2S0 A01;
    public final List A02;
    public final List A03;

    public final void D29(View view, JV7 jv7, C48087EVf eVf, C283155Gi r12, int i) {
        C283155Gi r6 = r12;
        0qQ.A0B(r12, 0);
        for (G7C g7c : this.A02) {
            C48087EVf eVf2 = eVf;
            int i2 = i;
            if (g7c.AFM(eVf, r12, i)) {
                g7c.AJS((View) null, jv7, eVf2, r6, i2);
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AnonymousClass2S0 r4 = this.A01;
                        if (r4.A00 != null) {
                            if (182.A06(0Tu.A05, this.A00, 36322778940451229L)) {
                                r4.A06();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
    }

    public final boolean DOz(View view, JV7 jv7, C48087EVf eVf, C283155Gi r14, int i) {
        for (G7C g7c : this.A03) {
            C48087EVf eVf2 = eVf;
            C283155Gi r8 = r14;
            int i2 = i;
            if (g7c.AFM(eVf, r14, i)) {
                g7c.AJS((View) null, jv7, eVf2, r8, i2);
                return true;
            }
        }
        return false;
    }

    public C50579Feo(UserSession userSession, Dd4 dd4, C49492EwX ewX, ActivityFeedViewModel activityFeedViewModel, DdG ddG, AnonymousClass2S0 r36) {
        UserSession userSession2 = userSession;
        ActivityFeedViewModel activityFeedViewModel2 = activityFeedViewModel;
        AnonymousClass7TG.A1U(userSession2, activityFeedViewModel2, ddG);
        Dd4 dd42 = dd4;
        0qQ.A0B(dd42, 4);
        this.A00 = userSession2;
        this.A01 = r36;
        List A1P = 0sr.A1P(new G7C[]{new C50556FeR(dd42), new C50551FeM(dd42), new C50545FeG(dd42), new C50546FeH(dd42), new C50566Feb(userSession2, dd42), new C50550FeL(dd42), new C50549FeK(dd42), new C50554FeP(dd42), new C50563FeY(dd42), new C50544FeF(dd42), new C50564FeZ(dd42)});
        C50571Feg feg = new C50571Feg(userSession2, new C51797G2g(activityFeedViewModel2, 21));
        C50548FeJ feJ = new C50548FeJ(new C51797G2g(activityFeedViewModel2, 22));
        C50569Fee fee = new C50569Fee(userSession2, dd42);
        C50552FeN feN = new C50552FeN(dd42);
        C49492EwX ewX2 = ewX;
        C50570Fef fef = new C50570Fef(dd42, ewX2, new C51797G2g(activityFeedViewModel2, 23));
        C50565Fea fea = new C50565Fea(dd42);
        C50547FeI feI = new C50547FeI(dd42);
        C50568Fed fed = new C50568Fed(dd42);
        C50567Fec fec = new C50567Fec(dd42, ewX2);
        C50567Fec fec2 = fec;
        C50568Fed fed2 = fed;
        C50547FeI feI2 = feI;
        C50565Fea fea2 = fea;
        C50570Fef fef2 = fef;
        C50552FeN feN2 = feN;
        C50569Fee fee2 = fee;
        C50548FeJ feJ2 = feJ;
        C50571Feg feg2 = feg;
        this.A02 = 00k.A0S(0sr.A1P(new G7C[]{new C50559FeU(dd42), new C50560FeV(dd42), new C50562FeX(dd42)}), 00k.A0S(0sr.A1P(new G7C[]{feg2, feJ2, fee2, feN2, fef2, fea2, feI2, fed2, fec2, new C50557FeS(dd42), new C50558FeT(dd42), new C50553FeO(new JK3(activityFeedViewModel2, 7)), new C50555FeQ(dd42)}), A1P));
        this.A03 = AnonymousClass7TE.A1I(new C50561FeW(dd42));
    }
}
