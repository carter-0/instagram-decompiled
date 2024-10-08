package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ICQ implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public ICQ(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A04 = obj4;
        this.A01 = i;
        this.A02 = obj;
        this.A05 = obj3;
        this.A03 = obj2;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-226492394);
                0qQ.A0A(view);
                ((C67371Mmn) this.A05).A03.invoke(this.A03, this.A02, this.A04, Integer.valueOf(this.A01), view);
                i2 = -1250648240;
                break;
            case 1:
                i = AnonymousClass0fD.A05(149450835);
                ((C227802jw) this.A04).A0L((1Xj) this.A02, (C55512Hiu) this.A03, this.A01);
                i2 = -1848605357;
                break;
            case 4:
                i = AnonymousClass0fD.A05(1459107918);
                C331157Pu r3 = (C331157Pu) this.A02;
                I6H.A02((1Xj) this.A04, r3, (I6H) this.A05, (JOV) this.A03, this.A01, true);
                i2 = -75578423;
                break;
            case 5:
                i = AnonymousClass0fD.A05(-1671382171);
                VX2 vx2 = ((WSD) this.A05).A01;
                C51967G9n.A1M(this.A04, this.A03, vx2.A02, this.A01);
                0sP r2 = vx2.A00;
                View view2 = ((C249703kE) this.A02).itemView;
                0qQ.A06(view2);
                r2.invoke(view2);
                i2 = 152550511;
                break;
            case 6:
                i = AnonymousClass0fD.A05(-1277455540);
                C55759Hmu hmu = GBU.A04;
                if (hmu != null) {
                    DbZ.A0H(hmu.A01, "suggested_creator_card_tapped", DbS.A0q(this.A04), this.A01).Cgf();
                }
                FragmentActivity fragmentActivity = (Activity) this.A02;
                if (fragmentActivity instanceof FragmentActivity) {
                    GBU.A08 = true;
                    UserSession userSession = (UserSession) this.A05;
                    C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
                    1a1 A022 = C46447Df9.A02();
                    C46474Dfc A012 = C46548Dgp.A01(userSession, DbS.A0q(this.A04), "suggested_creators_in_reels", C51966G9m.A1F(this.A03));
                    A012.A0O = "profile_clips";
                    C46474Dfc.A03(A0Q, userSession, A022, A012);
                }
                i2 = -1621678859;
                break;
            default:
                int i3 = this.A01;
                ((C51959G9f) this.A03).DcN(0nA.A0F((View) this.A02), new C47179Dru((C49556Exr) this.A05), (C283155Gi) this.A04, i3);
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
