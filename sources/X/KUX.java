package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class KUX extends C249383je implements C252213ok, C74308Psi, G9d {
    public long A00 = -1;
    public C238133Ar A01;
    public String A02;
    public boolean A03;
    public final View A04;
    public final UserSession A05;
    public final AnonymousClass3E6 A06;
    public final 0mM A07;
    public final C354518Mi A08;
    public final K9K A09;
    public final C67691MsV A0A;
    public final C66441MRv A0B;
    public final L08 A0C;
    public final C63925LDh A0D;
    public final 26t A0E;
    public final C14221Ts1 A0F;
    public final C337287g2 A0G;
    public final AnonymousClass0eM A0H;
    public final Context A0I;
    public final View A0J;
    public final AnonymousClass0eK A0K;

    public KUX(View view, AnonymousClass0iw r19, UserSession userSession, AnonymousClass3E6 r21, C279284yO r22, C357638Yz r23, C314236hs r24, C354518Mi r25, C66441MRv mRv, L08 l08, AnonymousClass0eK r28, 0sP r29) {
        ViewGroup viewGroup;
        C346817vo r1;
        C354518Mi r4 = r25;
        L08 l082 = l08;
        AnonymousClass7TG.A1R(r4, l082);
        AnonymousClass0eK r12 = r28;
        0qQ.A0B(r12, 9);
        View view2 = view;
        Context A0S = AnonymousClass7TE.A0S(view2);
        this.A0I = A0S;
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        this.A0K = r12;
        this.A08 = r4;
        this.A0C = l082;
        this.A06 = r21;
        C66441MRv mRv2 = mRv;
        this.A09 = new K9K(A0S, r19, userSession2, r23, r24, mRv2, r29, true, AnonymousClass7TF.A1W(r22, AnonymousClass9QA.A00));
        this.A0A = new C67691MsV(userSession2, this);
        this.A0B = mRv2;
        this.A0D = new C63925LDh(userSession2, this, r12);
        AnonymousClass7g1 r0 = new AnonymousClass7g1();
        this.A0G = r0;
        this.A0F = C14225Ts5.A01(userSession2, (AnonymousClass4D6) null, (C337247fx) null, this, r0, AnonymousClass05K.A0C, false);
        this.A0E = 26G.A00(userSession2);
        this.A04 = AnonymousClass7TE.A0b(view2, R.id.assets_search_results);
        this.A0J = AnonymousClass7TE.A0b(view2, R.id.loading_spinner);
        this.A0H = AnonymousClass0eN.A01(new MMT(userSession2, 34));
        this.A07 = new 0mM(AnonymousClass7TF.A0D(), new C64889Ljp(this, 2), 1000);
        View A0F2 = DbY.A0F(view2, R.id.assets_search_results_list);
        ViewGroup viewGroup2 = null;
        if ((A0F2 instanceof ViewGroup) && (viewGroup = (ViewGroup) A0F2) != null) {
            C238133Ar A002 = C238103Ao.A00(viewGroup);
            A002 = A002 == null ? null : A002;
            this.A01 = A002;
            viewGroup2 = A002 != null ? A002.CEd() : viewGroup2;
            if ((viewGroup2 instanceof C346817vo) && (r1 = (C346817vo) viewGroup2) != null) {
                r1.setBottomFadingEnabled(false);
            }
            if (A002 != null) {
                A002.ENw(this.A09);
            }
            C238133Ar r02 = this.A01;
            if (r02 != null) {
                r02.AHq();
            }
            C238133Ar r03 = this.A01;
            if (r03 != null) {
                r03.AAD(this);
            }
        }
    }

    public final void A01(String str, boolean z) {
        C62564Khu[] khuArr;
        String str2;
        K9K k9k;
        ArrayList arrayList;
        0qQ.A0B(str, 0);
        if ((this.A03 && !0qQ.A0K(this.A02, str)) || this.A0E.A00.getBoolean("KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", false)) {
            int length = str.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                int i2 = length;
                if (!z2) {
                    i2 = i;
                }
                boolean A13 = Dbc.A13(str, i2);
                if (z2) {
                    if (!A13) {
                        break;
                    }
                    length--;
                } else if (!A13) {
                    z2 = true;
                } else {
                    i++;
                }
            }
            String A0c = Dba.A0c(str, length, i);
            this.A02 = A0c;
            if (A0c != null && A0c.length() == 0) {
                this.A09.A03();
            } else if (this.A00 == -1) {
                this.A00 = System.currentTimeMillis();
            }
            A00(this, true);
            int intValue = this.A0B.Aci().intValue();
            if (intValue != 6) {
                if (intValue == 4) {
                    String str3 = this.A02;
                    if (str3 != null && str3.length() > 0) {
                        this.A0A.filter(str3);
                    }
                } else if (intValue == 7) {
                    String str4 = this.A02;
                    if (str4 != null && str4.length() > 0) {
                        this.A0A.filter(str4);
                    }
                    khuArr = new C62564Khu[]{C62564Khu.EMOJI, C62564Khu.STICKERS};
                } else if (intValue == 5) {
                    String str5 = this.A02;
                    if (str5 != null && str5.length() > 0) {
                        this.A0A.filter(str5);
                    }
                    str2 = this.A02;
                    if (str2 != null) {
                        0xa r2 = this.A0E.A00;
                        if (r2.getBoolean("KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", false)) {
                            DbX.A1V(r2, "KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", false);
                            this.A0G.clear();
                        }
                        C337287g2 r1 = this.A0G;
                        Integer num = r1.BiX(str2).A01;
                        List list = r1.BiX(str2).A06;
                        boolean z3 = true;
                        if (num != AnonymousClass05K.A0C || list == null) {
                            this.A07.A00();
                            k9k = this.A09;
                            k9k.A0C.clear();
                            arrayList = k9k.A09;
                            arrayList.clear();
                            K9K.A01(k9k);
                            A00(this, true);
                            this.A0F.A06(str2);
                            return;
                        }
                        if (str2.length() != 0) {
                            z3 = false;
                        }
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        for (Object next : list) {
                            if (next instanceof KK9) {
                                A1C2.add(next);
                            } else if (next instanceof KK8) {
                                A1C.add(next);
                            }
                        }
                        K9K k9k2 = this.A09;
                        0qQ.A0B(A1C2, 0);
                        k9k2.A01 = !z3;
                        k9k2.A02 = z3;
                        ArrayList arrayList2 = k9k2.A0C;
                        arrayList2.clear();
                        ArrayList arrayList3 = k9k2.A09;
                        arrayList3.clear();
                        arrayList2.addAll(A1C2);
                        arrayList3.addAll(A1C);
                        K9K.A01(k9k2);
                        A00(this, false);
                        if (!z3 && AnonymousClass7TF.A1Z(this.A0H)) {
                            this.A07.A01(str2);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (intValue != 2) {
                    return;
                }
                str2 = this.A02;
                if (str2 != null) {
                    C337287g2 r12 = this.A0G;
                    Integer num2 = r12.BiX(str2).A01;
                    List list2 = r12.BiX(str2).A06;
                    boolean z4 = true;
                    if (num2 != AnonymousClass05K.A0C || list2 == null) {
                        k9k = this.A09;
                        arrayList = k9k.A0C;
                        arrayList.clear();
                        K9K.A01(k9k);
                        A00(this, true);
                        this.A0F.A06(str2);
                        return;
                    }
                    A00(this, false);
                    if (str2.length() != 0) {
                        z4 = false;
                    }
                    K9K k9k3 = this.A09;
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    for (Object next2 : list2) {
                        if (next2 instanceof KK9) {
                            A1C3.add(next2);
                        }
                    }
                    k9k3.A01 = !z4;
                    k9k3.A02 = z4;
                    ArrayList arrayList4 = k9k3.A0C;
                    arrayList4.clear();
                    arrayList4.addAll(A1C3);
                    K9K.A01(k9k3);
                    return;
                }
                return;
            }
            khuArr = new C62564Khu[]{C62564Khu.EMOJI, C62564Khu.STICKERS, C62564Khu.GIPHY_GIFS};
            List A1P = 0sr.A1P(khuArr);
            String str6 = this.A02;
            if (str6 != null) {
                C63925LDh lDh = this.A0D;
                if (z) {
                    int length2 = str6.length() - 1;
                    int i3 = 0;
                    boolean z5 = false;
                    while (i3 <= length2) {
                        int i4 = length2;
                        if (!z5) {
                            i4 = i3;
                        }
                        boolean A132 = Dbc.A13(str6, i4);
                        if (z5) {
                            if (!A132) {
                                break;
                            }
                            length2--;
                        } else if (!A132) {
                            z5 = true;
                        } else {
                            i3++;
                        }
                    }
                    lDh.A00(new C71002OVz(Dba.A0c(str6, length2, i3), A1P));
                } else if (lDh.A00 != C71002OVz.A03) {
                    0mM r4 = lDh.A01;
                    int length3 = str6.length() - 1;
                    int i5 = 0;
                    boolean z6 = false;
                    while (i5 <= length3) {
                        int i6 = length3;
                        if (!z6) {
                            i6 = i5;
                        }
                        boolean A133 = Dbc.A13(str6, i6);
                        if (z6) {
                            if (!A133) {
                                break;
                            }
                            length3--;
                        } else if (!A133) {
                            z6 = true;
                        } else {
                            i5++;
                        }
                    }
                    r4.A01(new C71002OVz(Dba.A0c(str6, length3, i5), lDh.A00.A02));
                }
            }
        }
    }

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        C317846nw r0;
        ArrayList A0q = AnonymousClass7TF.A0q(str, 0);
        A0q.add(C62564Khu.GIPHY_STICKERS);
        if (this.A0B.Aci() == AnonymousClass05K.A0j) {
            A0q.add(C62564Khu.AVATAR_STICKERS);
        }
        if (AnonymousClass7TF.A1Z(this.A0H)) {
            A0q.add(C62564Khu.GIPHY_GIFS);
        }
        UserSession userSession = this.A05;
        C317856nx r5 = C317846nw.A01;
        C317866ny r3 = C317866ny.STORIES;
        if (182.A06(0Tu.A05, userSession, 36316370849435929L)) {
            r0 = C317846nw.MIXED_AVATAR_STICKERS;
        } else {
            r0 = C317846nw.STATIC_AVATAR_STICKERS;
        }
        String A002 = r5.A00(r0, r3, userSession, false);
        Object obj = this.A0K.get();
        JSONArray jSONArray = new JSONArray();
        Iterator it = A0q.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C62564Khu) it.next()).A00);
        }
        1NY A0O = DbU.A0O(userSession);
        JTS.A1K(A0O, jSONArray, str);
        A0O.A9m("request_surface", obj.toString());
        A0O.A0R(C61293K1g.class, C64034LJy.class);
        try {
            StringWriter A0v = JTO.A0v();
            17W A0K2 = AnonymousClass7TF.A0K(A0v);
            A0K2.A0P("result_size", 4);
            if (A002 != null) {
                A0K2.A0R("sticker_pack_id", A002);
            }
            return DbT.A0T(A0O, "avatar_sticker_search", AnonymousClass7TG.A0k(A0K2, A0v));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r4, String str) {
        0qQ.A0B(str, 0);
        if (0qQ.A0K(this.A02, str)) {
            C59689JTv.A0E(this.A0I, "sticker_search_request_failed");
        }
        if (AnonymousClass7TF.A1Z(this.A0H)) {
            A00(this, false);
            this.A00 = -1;
        }
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
        A00(this, true);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final void Dfc(String str, List list) {
        0qQ.A0B(str, 0);
        if (0qQ.A0K(this.A02, str)) {
            this.A09.A05(JTQ.A0j(list));
        }
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public static final void A00(KUX kux, boolean z) {
        K9K k9k;
        ViewGroup CEd;
        ViewGroup CEd2;
        Integer Aci = kux.A0B.Aci();
        int i = 8;
        if (Aci == AnonymousClass05K.A0Y || (Aci == AnonymousClass05K.A0u && 0mp.A0G(kux.A02, ""))) {
            kux.A0J.setVisibility(8);
            C238133Ar r0 = kux.A01;
            if (!(r0 == null || (CEd = r0.CEd()) == null)) {
                CEd.setVisibility(0);
            }
            k9k = kux.A09;
        } else {
            kux.A0J.setVisibility(DbW.A01(z ? 1 : 0));
            C238133Ar r02 = kux.A01;
            if (!(r02 == null || (CEd2 = r02.CEd()) == null)) {
                if (!z) {
                    i = 0;
                }
                CEd2.setVisibility(i);
            }
            k9k = kux.A09;
            if (!AnonymousClass7TF.A1Z(kux.A0H)) {
                z = false;
            }
        }
        if (k9k.A00 != z) {
            k9k.A00 = z;
            K9K.A01(k9k);
        }
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DMr(int i, boolean z) {
        this.A0J.setTranslationY(((float) i) / -2.0f);
    }

    public final void DeW(String str) {
        if (!AnonymousClass7TF.A1Z(this.A0H)) {
            A00(this, false);
        }
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r10, String str) {
        K9K k9k;
        C61293K1g k1g = (C61293K1g) r10;
        AnonymousClass7TF.A1H(str, k1g);
        if (0qQ.A0K(this.A02, str)) {
            boolean z = true;
            if (str.length() != 0) {
                z = false;
                if (AnonymousClass7TF.A1Z(this.A0H)) {
                    this.A09.A04(str, this.A00);
                    this.A00 = -1;
                }
            }
            AnonymousClass0eM r5 = this.A0H;
            boolean A1Z = AnonymousClass7TF.A1Z(r5);
            List A16 = JTR.A16(k1g.A01.A05);
            if (A1Z) {
                0qQ.A07(A16);
                List A162 = JTR.A16(k1g.A01.A04);
                0qQ.A07(A162);
                A16 = 00k.A0S(A162, A16);
            } else {
                0qQ.A07(A16);
            }
            Collection collection = (Collection) C63281KuQ.A00(A16).first;
            if (this.A0B.Aci() == AnonymousClass05K.A0j) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (C317876nz r2 : k1g.A01.A00()) {
                    C317966o8 r1 = (C317966o8) 00k.A0J(r2.A0O);
                    if (r1 != null) {
                        r1.A0c = "STORIES_GLOBAL_SEARCH_STICKER_TRAY";
                    }
                    A1C.add(new C317456nI(r2));
                }
                k9k = this.A09;
                0qQ.A0A(collection);
                0qQ.A0B(collection, 0);
                k9k.A01 = !z;
                k9k.A02 = z;
                ArrayList arrayList = k9k.A0C;
                arrayList.clear();
                ArrayList arrayList2 = k9k.A09;
                arrayList2.clear();
                arrayList.addAll(collection);
                arrayList2.addAll(A1C);
            } else {
                k9k = this.A09;
                0qQ.A0A(collection);
                0qQ.A0B(collection, 0);
                k9k.A01 = !z;
                k9k.A02 = z;
                ArrayList arrayList3 = k9k.A0C;
                arrayList3.clear();
                arrayList3.addAll(collection);
            }
            K9K.A01(k9k);
            if (AnonymousClass7TF.A1Z(r5)) {
                A00(this, false);
            }
        }
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass0fD.A0A(1557279606, AnonymousClass0fD.A03(758208822));
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A0D2 = AnonymousClass7TG.A0D(r3, 2082421959);
        if (i == 1) {
            0nA.A0N(r3.CEd());
        }
        AnonymousClass0fD.A0A(1853446955, A0D2);
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
