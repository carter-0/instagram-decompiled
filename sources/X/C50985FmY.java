package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.FmY  reason: case insensitive filesystem */
public final class C50985FmY implements C322776wO {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C50985FmY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBx() {
    }

    public final void DBy() {
        C309516Yo r3;
        String Aip;
        switch (this.A00) {
            case 0:
                C71153OeR oeR = (C71153OeR) this.A01;
                C69004Ncg ncg = oeR.A0o;
                ncg.A00 = true;
                ncg.A04("enter_hidden_words_settings", (String) null);
                FragmentActivity requireActivity = oeR.A0b.requireActivity();
                UserSession userSession = oeR.A0h;
                r3 = DbU.A0Q(requireActivity, userSession);
                r3.A0E(C48883Elj.A00().A00.A00(oeR.A0Y, userSession, AnonymousClass05K.A0C));
                break;
            case 1:
                C47524E6k e6k = (C47524E6k) this.A01;
                r3 = DbX.A0N(e6k.requireActivity(), e6k.A07);
                r3.A0F = true;
                r3.A0D(new ES0());
                break;
            case 2:
                return;
            default:
                C47522E6i e6i = (C47522E6i) this.A01;
                E9N e9n = e6i.A0A;
                if (e9n == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
                GraphGuardianContent graphGuardianContent = e9n.A02;
                if (graphGuardianContent == null || (Aip = graphGuardianContent.Aip()) == null) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("analytics_module", e6i.getModuleName());
                    A0a.putString("location", "IG_PROFILE");
                    DbT.A1M(e6i, DbS.A0b(e6i.getActivity(), A0a, DbT.A0X(e6i.A0T), ModalActivity.class, "account_status"));
                    return;
                }
                SimpleWebViewActivity.A02.A02(e6i.requireContext(), DbT.A0X(e6i.A0T), new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, (String) null, SQU.A01(e6i.requireContext(), Aip)));
                return;
        }
        r3.A04();
    }
}
