package X;

import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.LgL  reason: case insensitive filesystem */
public final class C64690LgL implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64690LgL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int i2;
        C64835Lix lix;
        String str;
        Integer num;
        IllegalStateException illegalStateException;
        int i3;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-603445194);
                C64653Lff lff = (C64653Lff) obj2;
                int A0D = AnonymousClass7TG.A0D(lff, 267066481);
                1Xj r3 = lff.A00;
                if (r3.BR7() == ((AnonymousClass3Q2) this.A02).A1G) {
                    ((AnonymousClass4D7) this.A01).resumeWith(r3);
                }
                AnonymousClass0fD.A0A(1683768917, A0D);
                i2 = 146738788;
                break;
            case 1:
                i = AnonymousClass0fD.A03(2130200385);
                C64648Lfa lfa = (C64648Lfa) obj2;
                int A0D2 = AnonymousClass7TG.A0D(lfa, -588549860);
                Venue venue = lfa.A00;
                C67761MuH A022 = C68449NIn.A02((C68449NIn) this.A02);
                A022.A0T.Epw(venue);
                A022.A0E.Epw(C69314NjF.LOCATION_NOTE);
                C67761MuH.A02(A022);
                DbW.A1K((C331157Pu) this.A01);
                AnonymousClass0fD.A0A(-1157399671, A0D2);
                i2 = 976340818;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-854969200);
                2Cy r7 = (2Cy) obj2;
                int A0D3 = AnonymousClass7TG.A0D(r7, -1469906491);
                User user = (User) this.A02;
                if (DbV.A1Z(r7.A00, user.getId())) {
                    ((C249523jv) this.A01).FIG(user.A02);
                }
                AnonymousClass0fD.A0A(1652546110, A0D3);
                i2 = -702573962;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1272809799);
                C323966yO r72 = (C323966yO) obj2;
                int A0D4 = AnonymousClass7TG.A0D(r72, -1637588068);
                if (r72.A05) {
                    if (r72.A00 == C16508Uw5.FAILED) {
                        C17052VGa.A00((UserSession) this.A02).A01(C16679UzF.CART, r72.A04, true);
                    }
                    LOp A002 = C17052VGa.A00((UserSession) this.A02);
                    C16679UzF uzF = C16679UzF.CART;
                    str = r72.A04;
                    A002.A02(uzF, str, true);
                    lix = (C64835Lix) this.A01;
                    Integer num2 = AnonymousClass05K.A00;
                    C61069Jw7 jw7 = new C61069Jw7((C62865Knf) C62084KZo.A00, num2, 1);
                    Map map = lix.A03;
                    05G r9 = (05G) map.get(str);
                    if (r9 != null) {
                        C61074JwC A0P = JTO.A0P(r9);
                        C61069Jw7 jw72 = (C61069Jw7) A0P.A03;
                        C61069Jw7 jw73 = (C61069Jw7) A0P.A02;
                        C61069Jw7 jw74 = (C61069Jw7) A0P.A01;
                        AnonymousClass7TG.A1U(jw72, jw73, jw74);
                        r9.Epw(new C61074JwC(jw7, jw72, jw73, jw74));
                    }
                    C18622VvF vvF = r72.A01;
                    if (vvF != null) {
                        ArrayList A003 = vvF.A00();
                        if (AnonymousClass7TF.A1Z(lix.A04)) {
                            if (lix.A05.CVQ()) {
                                JTO.A1Y(num2, new MH6((Object) A003, (Object) lix, (Object) uzF, str, (AnonymousClass4D7) null, 21), DbY.A0r(AnonymousClass12T.A00, 301752202));
                            }
                            if (lix.A07) {
                                num = AnonymousClass05K.A01;
                            } else {
                                num = AnonymousClass05K.A0C;
                            }
                            Object obj3 = map.get(str);
                            if (obj3 != null) {
                                JTO.A1Y(num2, new MHM((Object) A003, (Object) lix, (Object) num, obj3, (Object) uzF, str, (AnonymousClass4D7) null, 13), DbY.A0r(AnonymousClass12T.A00, 301752202));
                            }
                        } else {
                            for (05G r6 : C64835Lix.A02(lix, str)) {
                                ArrayList A0r = AnonymousClass7TG.A0r(A003);
                                Iterator it = A003.iterator();
                                while (it.hasNext()) {
                                    A0r.add(new ProductFeedItem((Product) it.next()));
                                }
                                C64835Lix.A08(uzF, str, A0r, r6);
                            }
                        }
                    }
                } else {
                    lix = (C64835Lix) this.A01;
                    str = r72.A04;
                    05G r73 = (05G) lix.A03.get(str);
                    if (r73 != null) {
                        C61074JwC jwC = (C61074JwC) r73.getValue();
                        C61069Jw7 jw75 = (C61069Jw7) jwC.A03;
                        C61069Jw7 jw76 = (C61069Jw7) jwC.A02;
                        C61069Jw7 jw77 = (C61069Jw7) jwC.A01;
                        AnonymousClass7TG.A1U(jw75, jw76, jw77);
                        r73.Epw(new C61074JwC((C61069Jw7) null, jw75, jw76, jw77));
                    }
                }
                C16679UzF uzF2 = C16679UzF.CART;
                Map A03 = C64835Lix.A03(lix, str);
                C51970G9q.A1S((C262204Co) A03.get(uzF2));
                A03.remove(uzF2);
                AnonymousClass0fD.A0A(971699419, A0D4);
                i2 = -2137065027;
                break;
            default:
                int A032 = AnonymousClass0fD.A03(-1291015749);
                Lg5 lg5 = (Lg5) obj2;
                int A0D5 = AnonymousClass7TG.A0D(lg5, 1563321451);
                C60058JeZ jeZ = (C60058JeZ) this.A02;
                IgdsSwitch igdsSwitch = jeZ.A04;
                if (igdsSwitch != null) {
                    boolean isChecked = igdsSwitch.isChecked();
                    boolean z = lg5.A01;
                    boolean z2 = true;
                    boolean A1O = JTQ.A1O(isChecked ? 1 : 0, z ? 1 : 0);
                    IgdsSwitch igdsSwitch2 = jeZ.A04;
                    if (igdsSwitch2 != null) {
                        igdsSwitch2.setChecked(z);
                    }
                    String str2 = lg5.A00;
                    if (str2 != null) {
                        TextView textView = jeZ.A02;
                        if (textView != null) {
                            textView.setText(str2);
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                            i3 = 1083695553;
                        }
                    }
                    E28 e28 = jeZ.A06;
                    if (e28 != null && lg5.A02) {
                        if (str2 == null) {
                            z2 = false;
                        }
                        e28.A02 = z2;
                    }
                    MT7 mt7 = jeZ.A07;
                    if (mt7 != null && A1O) {
                        mt7.Cvj((C48153EZv) this.A01);
                    }
                    AnonymousClass0fD.A0A(1095900389, A0D5);
                    AnonymousClass0fD.A0A(-1243926995, A032);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i3 = -1558618628;
                AnonymousClass0fD.A0A(i3, A0D5);
                throw illegalStateException;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
