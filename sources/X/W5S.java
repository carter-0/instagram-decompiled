package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class W5S implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public W5S(C307896Rx r2, UserSession userSession, String str) {
        this.A00 = 0;
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                if (1Wr.A00 != null) {
                    C309516Yo r2 = new C309516Yo(C308206Td.A04((C307896Rx) this.A01), (0lg) this.A02);
                    r2.A0E(1Wr.A00.getFragmentFactory().CrC(this.A03));
                    r2.A04();
                    return;
                }
                return;
            case 1:
                U5O u5o = (U5O) this.A01;
                u5o.setEnabled(false);
                if (u5o.isChecked()) {
                    C17939ViU viU = (C17939ViU) this.A02;
                    viU.A08.A02(-1);
                    viU.A06.A09(viU.A05, (String) null);
                }
                C17939ViU viU2 = (C17939ViU) this.A02;
                String str = this.A03;
                VZK vzk = viU2.A04;
                C15421UcX ucX = new C15421UcX(viU2.A03, u5o, viU2, C13991Tnr.A0a("ads/promote/delete_audience/".length() - 1, "ads/promote/delete_audience/"), 2);
                UserSession userSession = vzk.A02;
                String str2 = vzk.A03;
                String str3 = vzk.A04;
                1NY A0N = DbU.A0N(userSession);
                C13990Tnq.A1C(A0N, "ads/promote/delete_audience/", str2);
                A0N.A9m("audience_id", str);
                A0N.A9m("fb_actor_id", str3);
                1OC A0S = DbT.A0S(A0N, C15238UWy.class, C18153VmT.class);
                A0S.A00 = ucX;
                1ES.A00(vzk.A00, vzk.A01, A0S);
                return;
            default:
                C17939ViU viU3 = (C17939ViU) this.A02;
                FragmentActivity fragmentActivity = viU3.A02;
                C358248ab r4 = new C358248ab((Activity) fragmentActivity);
                r4.A04();
                r4.A09(2131970182);
                r4.A0q(fragmentActivity.getResources().getString(2131970181));
                r4.A0F(new W5S(viU3, (U5O) this.A01, this.A03, 1));
                r4.A03();
                DbT.A1V(r4);
                return;
        }
    }

    public W5S(C17939ViU viU, U5O u5o, String str, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A02 = viU;
            this.A01 = u5o;
        } else {
            this.A01 = u5o;
            this.A02 = viU;
        }
        this.A03 = str;
    }
}
