package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vjw  reason: case insensitive filesystem */
public final class C18020Vjw {
    public Product A00;
    public final UserSession A01;
    public final 2el A02;
    public final C229932oe A03;
    public final C15901UkP A04;
    public final WU8 A05;
    public final WUB A06;
    public final C15894UkI A07;
    public final WUD A08;
    public final WU0 A09;
    public final WU9 A0A;
    public final String A0B;

    public final void A00(WSU wsu, String str) {
        0qQ.A0B(str, 0);
        String str2 = wsu.A02;
        0qQ.A07(str2);
        C2354830a A002 = AnonymousClass30Y.A00(new C17388VTp(wsu, str2), C60340gF.A00, str);
        A002.A00(this.A06);
        A002.A00(this.A07);
        A002.A00(this.A05);
        this.A03.A01(A002.A01(), str);
    }

    public final void A01(C16266UrT urT, String str, String str2, String str3) {
        DbY.A1S(str, str3);
        C229932oe r1 = this.A03;
        AnonymousClass30Y A002 = r1.A00(str2);
        C17388VTp vTp = new C17388VTp(urT, str3);
        C60340gF r5 = C60340gF.A00;
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        ArrayList A14 = DbV.A14(this.A07);
        A14.add(this.A08);
        r1.A01(new AnonymousClass30Y(A002, vTp, r5, str, A14), str);
    }

    public C18020Vjw(UserSession userSession, 2el r12, W03 w03, W1W w1w, AdsProductPageFragment adsProductPageFragment, AdsProductPageFragment adsProductPageFragment2, String str, List list) {
        String str2 = str;
        C51974G9v.A1P(str2, r12, userSession, w1w);
        List list2 = list;
        0qQ.A0B(list2, 6);
        C229932oe r8 = new C229932oe();
        WUB wub = new WUB(w03, w1w);
        C15894UkI ukI = new C15894UkI(userSession, w03, w1w, adsProductPageFragment);
        WU8 wu8 = new WU8(userSession);
        WU0 wu0 = new WU0(list2);
        WUD wud = new WUD(w03, w1w, adsProductPageFragment);
        WU9 wu9 = new WU9(adsProductPageFragment2);
        C15901UkP ukP = new C15901UkP(C13988Tno.A0K(userSession), userSession, w1w);
        this.A0B = str2;
        this.A02 = r12;
        this.A03 = r8;
        this.A01 = userSession;
        this.A06 = wub;
        this.A07 = ukI;
        this.A05 = wu8;
        this.A09 = wu0;
        this.A08 = wud;
        this.A0A = wu9;
        this.A04 = ukP;
    }
}
