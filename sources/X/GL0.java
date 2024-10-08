package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GL0 extends 2YL implements JT5 {
    public 05G A00 = 106.A01((Object) null);
    public Integer A01;
    public List A02 = AnonymousClass7TE.A1C();
    public final Map A03 = AnonymousClass7TE.A1H();
    public final int A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final Map A07 = AnonymousClass7TE.A1H();

    public final void FJZ(int i) {
    }

    public final /* synthetic */ void onCompletion() {
    }

    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public static final void A00(GL0 gl0) {
        C54507HGt hGt;
        Object value = gl0.A00.getValue();
        if (value != null && (hGt = (C54507HGt) gl0.A07.get(value)) != null) {
            Map map = gl0.A03;
            Object obj = map.get(value);
            if (obj == null) {
                UserSession userSession = gl0.A05;
                obj = new C57467IbB(C51966G9m.A0P(userSession), gl0.A06, userSession, gl0);
                map.put(value, obj);
            }
            ((C57467IbB) obj).A02(hGt, true);
        }
    }

    public final void CNH(C267324bN r18, C52079GDz gDz, int i) {
        Object obj;
        C52079GDz gDz2 = gDz;
        if (gDz != null) {
            C267324bN r7 = r18;
            if (r7.A01 == C295365o2.MULTI_ADS) {
                List A022 = C57031ILx.A02(r7);
                ArrayList A0p = AnonymousClass7TF.A0p(A022);
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    C51972G9s.A1G(A0p, it);
                }
                IntentAwareAdsInfoIntf A002 = C57031ILx.A00(r7);
                List list = gDz2.A0C;
                if (list.size() <= A0p.size()) {
                    this.A02 = new ArrayList(A0p);
                    ArrayList A0p2 = AnonymousClass7TF.A0p(list);
                    int i2 = 0;
                    for (Object next : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        C59614JQi jQi = (C59614JQi) next;
                        1Xj A0u = C51966G9m.A0u(A0p, i2);
                        if (A0u != null) {
                            obj = this.A07.put(A0u, new C54507HGt(A0u, new C54505HGr(A002, this.A05, this.A06, Integer.valueOf(i2)), jQi, i, true));
                        } else {
                            obj = null;
                        }
                        A0p2.add(obj);
                        i2 = i3;
                    }
                    1wS.A01(this.A05).A0C(A0p.size());
                    A00(this);
                    return;
                }
            }
        }
        0kD.A07("ClipsMultiAdsMegacardVideoPlayerViewModel", "failed to resume multiple players", (Throwable) null);
    }

    public final void Dxv(1Xj r5) {
        C57467IbB ibB;
        Map map = this.A03;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            C14044Tol tol = ((C57467IbB) A0v.next()).A01;
            if (tol != null) {
                tol.A0A("paused_for_replay");
            }
        }
        if (0qQ.A0K(C51969G9p.A0u(r5), C51969G9p.A0u((1Xj) this.A00.getValue())) && (ibB = (C57467IbB) map.get(r5)) != null) {
            C57467IbB.A00(ibB);
        }
    }

    public final void ECW() {
        Map map = this.A03;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            ((C57467IbB) A0v.next()).A01();
        }
        map.clear();
        this.A07.clear();
        this.A02.clear();
        1wS.A01(this.A05).A0C(this.A04);
    }

    public final void FJY(1Xj r2, String str, int i) {
        if (r2 != null) {
            this.A00.Epw(r2);
            this.A01 = Integer.valueOf(i);
        }
    }

    public GL0(UserSession userSession, AnonymousClass4DU r4, int i) {
        AnonymousClass7TG.A1O(userSession, r4);
        this.A05 = userSession;
        this.A06 = r4;
        this.A04 = i;
        C58099ImL.A01(this, C318116oQ.A00(this), 40);
    }

    public final Integer AYl(boolean z) {
        return this.A01;
    }
}
