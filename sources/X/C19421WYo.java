package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WYo  reason: case insensitive filesystem */
public final class C19421WYo implements C20956X6j, X8U, DQw, C20957X6k {
    public final /* synthetic */ C15955UlX A00;

    public final void DKU(C15260UXv uXv) {
    }

    public final void DKV(String str) {
    }

    public final void DcB(Reel reel) {
    }

    public final void DcD(1Xj r1) {
    }

    public final void DcS() {
    }

    public final void Dx5(Venue venue) {
    }

    public final void onFinish() {
    }

    public C19421WYo(C15955UlX ulX) {
        this.A00 = ulX;
    }

    public final void DED() {
        C15955UlX ulX = this.A00;
        ulX.A02.DeI();
        FragmentActivity activity = ulX.A00.getActivity();
        if (activity != null) {
            C59689JTv.A03(activity, activity.getString(2131974093), "onFeedRequestFail", 0);
        }
    }

    public final void DF4(C16672Uz8 uz8, UY5 uy5, boolean z) {
        List A0o;
        UY5 uy52 = uy5;
        VW4 vw4 = new VW4(uy52.A01, uy52.A02, uy52.A05);
        C15955UlX ulX = this.A00;
        UserSession userSession = ulX.A01;
        List list = uy52.A03;
        if (list == null) {
            A0o = Collections.emptyList();
        } else {
            A0o = C13991Tnr.A0o(userSession, list);
        }
        ArrayList A002 = C16931VBj.A00(new C322186vO(userSession), A0o);
        0qQ.A0B(userSession, 0);
        C17957Vip vip = (C17957Vip) userSession.A01(C15934Ul1.class, C20653Wwl.A00);
        String str = ulX.A03.A01;
        C16672Uz8 uz82 = uz8;
        boolean A1U = AnonymousClass7TF.A1U(0, str, uz82);
        ((C15938Ul5) vip.A00(str)).A00 = uz82;
        C18621VvE vvE = ulX.A04;
        String str2 = C18621VvE.A00(vvE, uz82).A01;
        0qQ.A0B(str2, A1U ? 1 : 0);
        ((C15938Ul5) vip.A00(str)).A01 = str2;
        boolean z2 = z;
        vip.A01(new C17363VSq(vw4, A0o), str, C18621VvE.A00(vvE, uz82).A04.A03.A07, (String) null, (List) null, z2);
        ulX.A02.Dex((String) null, (String) null, A002, false, z2);
    }

    public final void DQ5() {
        this.A00.A02.DeS();
    }

    public final void DQ8() {
        this.A00.A02.Dei();
    }

    public C19421WYo() {
    }
}
