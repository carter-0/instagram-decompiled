package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;

public final class WXE implements C253043q7 {
    public final int A00;
    public final Object A01;

    public WXE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D2e(ClickableSpan clickableSpan, View view, String str) {
        if (this.A00 != 0) {
            0qQ.A0B(str, 0);
            HashtagImpl A002 = C281965Ag.A00(str);
            C15360UbC ubC = (C15360UbC) this.A01;
            C17518VYw vYw = ubC.A03;
            if (vYw != null) {
                C315656kI r1 = vYw.A03;
                if (r1.A00 != null) {
                    C255783ui r2 = new C255783ui((Hashtag) A002.FEY());
                    r2.A1f = "text";
                    r1.A00.A00(A002, vYw.A01, r2);
                }
            }
            VJ2.A00(ubC.requireActivity(), ubC, AnonymousClass7TE.A0l(ubC.A06), A002);
            return;
        }
        0qQ.A0B(str, 0);
        C18661VwI vwI = ((C15551Uef) this.A01).A03.A0B;
        FragmentActivity requireActivity = vwI.A02.requireActivity();
        UserSession userSession = vwI.A03;
        C309516Yo r4 = new C309516Yo(requireActivity, userSession);
        HashtagImpl A003 = C281965Ag.A00(str);
        String moduleName = vwI.A04.getModuleName();
        DbW.A0x(W0l.A00(A003, moduleName, "DEFAULT"), W0l.A01(userSession), r4);
    }
}
