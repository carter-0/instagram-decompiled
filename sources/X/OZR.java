package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final class OZR {
    public C70691OGm A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final C332447Vb A05;
    public final C70479O8e A06 = new C70479O8e(this);
    public final C48260Ebf A07;
    public final Fragment A08;
    public final 1Ng A09;
    public final 1wn A0A = C71932OtG.A00(this, 37);
    public final C51900G6u A0B = new C72293P0k(this);
    public final 2Dm A0C;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Ebf] */
    public OZR(Fragment fragment, UserSession userSession, C332447Vb r5) {
        0qQ.A0B(r5, 3);
        this.A04 = userSession;
        this.A08 = fragment;
        this.A05 = r5;
        R8F r8f = new R8F();
        ? obj = new Object();
        obj.A00 = fragment;
        obj.A01 = r8f;
        this.A07 = obj;
        this.A03 = fragment.requireContext();
        this.A0C = 1bJ.A00(userSession);
        this.A09 = AnonymousClass1Nd.A00(userSession);
    }

    public final void A02(List list) {
        String C6C;
        2Dr r5 = this.A0C;
        if (!r5.A0H.A0F) {
            this.A01 = list;
            this.A09.A01(this.A0A, AnonymousClass2KZ.class);
            this.A07.A01();
            r5.CnD(false, "StartCall");
            return;
        }
        this.A01 = null;
        this.A09.A02(this.A0A, AnonymousClass2KZ.class);
        AnonymousClass3U9 C5z = r5.C5z(new DirectThreadKey((String) null, AnonymousClass7TE.A1D(list)));
        if (C5z == null || (C6C = C5z.C6C()) == null) {
            this.A02 = true;
            this.A07.A01();
            C69878Ntg.A00(this.A04, this.A0B, list, false);
            return;
        }
        this.A07.A00();
        this.A05.Ewl(C6C);
    }

    public static final void A00(OZR ozr) {
        C70691OGm oGm = ozr.A00;
        if (oGm != null) {
            AnonymousClass1Nd.A00(oGm.A02).A02(oGm.A01, 2Kb.class);
            oGm.A00.removeCallbacksAndMessages((Object) null);
        }
        ozr.A00 = null;
    }

    public static final void A01(OZR ozr, String str) {
        FragmentActivity activity = ozr.A08.getActivity();
        if (activity != null && !activity.isFinishing()) {
            C358248ab A0Y = DbS.A0Y(ozr.A03);
            A0Y.A09(2131976596);
            A0Y.A0q(str);
            Dba.A1L(A0Y);
        }
    }
}
