package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class W1A {
    public final Activity A00;
    public final UserSession A01;
    public final C271794jb A02;
    public final C19359WWa A03;
    public final C17357VSk A04;
    public final AnonymousClass4DU insightsHost;

    public static final void A01(W1A w1a, String str) {
        AnonymousClass4DU r1 = w1a.insightsHost;
        C19359WWa wWa = w1a.A03;
        C254523sc A012 = C233822wX.A01(w1a.A02, wWa, r1, str);
        UserSession userSession = w1a.A01;
        A012.A0J(userSession, wWa);
        C233822wX.A0C(userSession, A012, wWa, w1a.insightsHost, (Integer) null);
    }

    public static final void A02(W1A w1a, String str, String str2) {
        C19359WWa wWa = w1a.A03;
        1Xj r2 = wWa.A02;
        UserSession userSession = w1a.A01;
        1sd.A00(userSession).A02(r2, true);
        C17357VSk vSk = w1a.A04;
        C14802U9x u9x = vSk.A01;
        List list = u9x.A03;
        int i = vSk.A00;
        list.remove(i);
        u9x.notifyItemRemoved(i);
        u9x.notifyItemRangeChanged(i, list.size());
        if (str2 != null) {
            C254523sc A012 = C233822wX.A01(w1a.A02, wWa, w1a.insightsHost, C273654mx.A00(725));
            A012.A6o = str2;
            A012.A6z = str;
            C51972G9s.A1A(A012);
            A012.A0J(userSession, wWa);
            C233822wX.A0C(userSession, A012, wWa, w1a.insightsHost, (Integer) null);
        }
    }

    public W1A(Activity activity, UserSession userSession, AnonymousClass4DU r5, C17357VSk vSk, C19359WWa wWa) {
        C51972G9s.A1C(userSession, wWa);
        this.A00 = activity;
        this.A01 = userSession;
        this.insightsHost = r5;
        this.A03 = wWa;
        this.A04 = vSk;
        this.A02 = new C271794jb(userSession, wWa.A02);
    }

    public static final void A00(W1A w1a, C16666Uz2 uz2, String str, String str2, String str3) {
        A01(w1a, str);
        C71093OcF A012 = ORV.A01(w1a.A00, w1a.insightsHost, w1a.A01, C14068TpH.FEED, C16677UzD.AD, str3);
        A012.A0A = str2;
        A012.A02 = uz2;
        A012.A03 = new C69238Nhs(str, w1a, 0);
        C71093OcF.A00((C331157Pu) null, A012);
    }
}
