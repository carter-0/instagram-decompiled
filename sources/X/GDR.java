package X;

import android.app.Application;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GDR extends C361478gI implements JT5 {
    public C55988Hqu A00;
    public 05G A01 = 106.A01((Object) null);
    public 05G A02 = 106.A01((Object) null);
    public Integer A03;
    public List A04 = AnonymousClass7TE.A1C();
    public final AnonymousClass07i A05;
    public final UserSession A06;
    public final Map A07 = AnonymousClass7TE.A1H();
    public final Map A08 = AnonymousClass7TE.A1H();
    public final int A09;
    public final AnonymousClass4DU A0A;
    public final Map A0B = AnonymousClass7TE.A1H();

    public final void CNH(C267324bN r15, C52079GDz gDz, int i) {
        0wj r1;
        String str;
        MidCardLayoutType midCardLayoutType;
        C53449Goh goh;
        List<C276014sL> list;
        Object obj;
        C52079GDz gDz2 = gDz;
        if (gDz != null && r15.A01 == C295365o2.MIDCARD) {
            C53452Gok gok = r15.A01().A06;
            if (gok != null) {
                midCardLayoutType = gok.A07;
            } else {
                midCardLayoutType = null;
            }
            if (midCardLayoutType == MidCardLayoutType.MEGA_CARD) {
                C53452Gok gok2 = r15.A01().A06;
                if (!(gok2 == null || (goh = gok2.A06) == null || (list = goh.A08) == null)) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (C276014sL r0 : list) {
                        1Xj r02 = r0.A00;
                        if (r02 != null) {
                            A1C.add(r02);
                        }
                    }
                    List list2 = gDz2.A0C;
                    if (list2.size() <= A1C.size()) {
                        this.A04 = new ArrayList(A1C);
                        ArrayList A0r = AnonymousClass7TG.A0r(list2);
                        int i2 = 0;
                        for (Object next : list2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                0sr.A1T();
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C59614JQi jQi = (C59614JQi) next;
                            1Xj A0u = C51966G9m.A0u(A1C, i2);
                            if (A0u != null) {
                                obj = this.A0B.put(A0u, new C54507HGt(A0u, new C16381Uty(this.A06, this.A0A), jQi, i, true));
                            } else {
                                obj = null;
                            }
                            A0r.add(obj);
                            i2 = i3;
                        }
                        1wS.A01(this.A06).A0C(A1C.size());
                        A00(this);
                        return;
                    }
                }
                r1 = 0wj.A01;
                str = "ClipsMidCardMegacardVideoPlayerViewModel: insufficient medias to bind to players";
                DbT.A1Q(r1, str, 817892914);
            }
        }
        r1 = 0wj.A01;
        str = "ClipsMidCardMegacardVideoPlayerViewModel: failed to resume mega card player";
        DbT.A1Q(r1, str, 817892914);
    }

    public final void FJY(1Xj r11, String str, int i) {
        List<InspirationSignalType> BwO;
        String A2n;
        Long A0n;
        String str2;
        0qQ.A0B(str, 2);
        if (r11 != null) {
            this.A01.Epw(r11);
            this.A03 = Integer.valueOf(i);
            DSK BOl = r11.A0C.BOl();
            if (BOl != null && (BwO = BOl.BwO()) != null && (A2n = r11.A2n()) != null && (A0n = 00y.A0n(10, A2n)) != null) {
                AnonymousClass4DU r6 = this.A0A;
                UserSession userSession = this.A06;
                String str3 = MidCardLayoutType.MEGA_CARD.A00;
                0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r6, userSession, str3, 4), "ig_lumen_midcard_impression");
                if (A0e.isSampled()) {
                    ArrayList A0p = AnonymousClass7TF.A0p(BwO);
                    for (InspirationSignalType inspirationSignalType : BwO) {
                        0bb r2 = new 0bb();
                        r2.A06("signal", inspirationSignalType.A00);
                        A0p.add(r2);
                    }
                    A0e.A9F("media_ig_id", A0n);
                    InspirationSignalType inspirationSignalType2 = (InspirationSignalType) 00k.A0J(BwO);
                    if (inspirationSignalType2 == null || (str2 = inspirationSignalType2.A00) == null) {
                        str2 = InspirationSignalType.UNRECOGNIZED.A00;
                    }
                    A0e.AAJ("signal", str2);
                    A0e.AAe("recommendation_info", A0p);
                    C51969G9p.A1A(A0e, r6);
                    A0e.AAJ("layout", str3);
                    A0e.AAJ("midcard_type", str);
                    A0e.Cgf();
                }
            }
        }
    }

    public final /* synthetic */ void onCompletion() {
    }

    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public static final void A00(GDR gdr) {
        C54507HGt hGt;
        Object value = gdr.A01.getValue();
        if (value != null && (hGt = (C54507HGt) gdr.A0B.get(value)) != null) {
            Map map = gdr.A08;
            Object obj = map.get(value);
            if (obj == null) {
                obj = new C57467IbB(gdr.A0D(), gdr.A0A, gdr.A06, gdr);
                map.put(value, obj);
            }
            ((C57467IbB) obj).A02(hGt, true);
        }
    }

    public final Integer AYl(boolean z) {
        if (z) {
            return (Integer) this.A02.getValue();
        }
        return this.A03;
    }

    public final void Dxv(1Xj r5) {
        C57467IbB ibB;
        Map map = this.A08;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            C14044Tol tol = ((C57467IbB) A0v.next()).A01;
            if (tol != null) {
                tol.A0A("paused_for_replay");
            }
        }
        if (0qQ.A0K(C51969G9p.A0u(r5), C51969G9p.A0u((1Xj) this.A01.getValue())) && (ibB = (C57467IbB) map.get(r5)) != null) {
            C57467IbB.A00(ibB);
        }
    }

    public final void ECW() {
        Map map = this.A08;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            ((C57467IbB) A0v.next()).A01();
        }
        map.clear();
        this.A0B.clear();
        this.A04.clear();
        C55988Hqu hqu = this.A00;
        if (hqu != null) {
            LVB lvb = hqu.A00;
            if (lvb != null) {
                lvb.A00 = false;
                lvb.A02.A05();
            }
            LVB lvb2 = hqu.A00;
            if (lvb2 != null) {
                lvb2.A00();
            }
            hqu.A00 = null;
            hqu.A02.clear();
        }
        1wS.A01(this.A06).A0C(this.A09);
    }

    public final void FJZ(int i) {
        Map map = this.A07;
        Integer valueOf = Integer.valueOf(i);
        if (map.get(valueOf) != null) {
            this.A02.Epw(valueOf);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GDR(Application application, AnonymousClass07i r7, UserSession userSession, AnonymousClass4DU r9, int i) {
        super(application);
        AnonymousClass7TG.A1U(application, userSession, r9);
        0qQ.A0B(r7, 5);
        this.A06 = userSession;
        this.A0A = r9;
        this.A09 = i;
        this.A05 = r7;
        C318136oS A002 = C318116oQ.A00(this);
        C58099ImL imL = new C58099ImL(this, (AnonymousClass4D7) null, 37);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new C58099ImL(this, (AnonymousClass4D7) null, 39), C51967G9n.A0M(this, r3, imL, A002));
    }
}
