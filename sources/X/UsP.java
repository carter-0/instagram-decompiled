package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AudienceMessageEntityRange;
import com.instagram.common.session.UserSession;

public final class UsP extends AnonymousClass7AK {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsP(N3M n3m, X8Q x8q, int i) {
        super(Integer.valueOf(i));
        this.A01 = x8q;
        this.A02 = n3m;
    }

    public final void onClick(View view) {
        SUL sul;
        switch (this.A00) {
            case 0:
                C17939ViU viU = (C17939ViU) this.A02;
                sul = Dba.A0J(viU.A02, viU.A07, 2EG.A34, ((AudienceMessageEntityRange) this.A01).getUrl());
                break;
            case 1:
                C15320UaS uaS = (C15320UaS) this.A02;
                WGU wgu = uaS.A0B;
                if (wgu != null) {
                    wgu.A0F(C16678UzE.SUMMARY, "audience_validation_learn_more");
                }
                FragmentActivity requireActivity = uaS.requireActivity();
                UserSession userSession = uaS.A0H;
                if (userSession != null) {
                    sul = Dba.A0J(requireActivity, userSession, 2EG.A34, ((AudienceMessageEntityRange) this.A01).getUrl());
                    sul.A0S = "promote_review";
                    break;
                } else {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                ((X8Q) this.A01).Di2((N3M) this.A02);
                return;
        }
        sul.A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsP(AudienceMessageEntityRange audienceMessageEntityRange, C15320UaS uaS, int i) {
        super(Integer.valueOf(i));
        this.A02 = uaS;
        this.A01 = audienceMessageEntityRange;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsP(AudienceMessageEntityRange audienceMessageEntityRange, C17939ViU viU, int i) {
        super(Integer.valueOf(i));
        this.A02 = viU;
        this.A01 = audienceMessageEntityRange;
    }
}
