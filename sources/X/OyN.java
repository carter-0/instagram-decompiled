package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class OyN implements AnonymousClass0lh {
    public 1OC A00;
    public 1OC A01;
    public C74442Pux A02;
    public C74442Pux A03;
    public C74442Pux A04;
    public Map A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final 1Ng A0A;
    public final UserSession A0B;
    public final AnonymousClass4kA A0C;
    public final 1P0 A0D = new NMI(this, 5);
    public final 1P0 A0E = new NMI(this, 7);
    public final 1P0 A0F = new NMI(this, 6);

    public final synchronized int A02() {
        int i;
        if (this.A05 == null) {
            i = 0;
        } else {
            i = 2131959387;
            if (this.A08) {
                i = 2131959388;
            }
        }
        return i;
    }

    public final synchronized int A03() {
        int i;
        Map map = this.A05;
        if (map == null) {
            i = 0;
        } else {
            i = map.size();
        }
        return i;
    }

    public final synchronized Integer A04() {
        Integer num;
        Map map = this.A05;
        if (map != null) {
            if (map.isEmpty()) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A0C;
            }
        } else if (this.A00 != null) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        return num;
    }

    public final synchronized void A05() {
        1NY A0O = DbU.A0O(this.A0B);
        A0O.A0A("direct_v2/icebreakers/get/");
        1OC A0S = DbT.A0S(A0O, NHK.class, OPB.class);
        this.A00 = A0S;
        A0S.A00 = this.A0D;
        1ES.A03(A0S);
    }

    public final synchronized void A06(ImmutableList immutableList) {
        Map map = this.A05;
        if (map == null) {
            map = AnonymousClass7TE.A1H();
            this.A05 = map;
        }
        map.clear();
        C249803kO it = immutableList.iterator();
        while (it.hasNext()) {
            C70814OMj oMj = (C70814OMj) it.next();
            oMj.A01.getClass();
            this.A05.put(oMj.A01, oMj);
        }
    }

    public static OyN A00(UserSession userSession) {
        return (OyN) userSession.A01(OyN.class, new C73467Pd9(userSession, 1));
    }

    public static void A01(ImmutableList immutableList, OyN oyN, boolean z) {
        try {
            AnonymousClass4kA r4 = oyN.A0C;
            ArrayList A1D = AnonymousClass7TE.A1D(immutableList);
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            16P.A03(A0K, "icebreaker_list");
            Iterator it = A1D.iterator();
            while (it.hasNext()) {
                C70814OMj oMj = (C70814OMj) it.next();
                if (oMj != null) {
                    A0K.A0c();
                    String str = oMj.A01;
                    if (str != null) {
                        A0K.A0R("ib_id", str);
                    }
                    String str2 = oMj.A02;
                    if (str2 != null) {
                        A0K.A0R("question_text", str2);
                    }
                    String str3 = oMj.A03;
                    if (str3 != null) {
                        A0K.A0R("response_text", str3);
                    }
                    String str4 = oMj.A00;
                    if (str4 != null) {
                        A0K.A0R("ib_cta_type", str4);
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
            A0K.A0S("is_icebreaker_enabled", z);
            DbS.A1a(r4, AnonymousClass7TG.A0k(A0K, A0v), r4.A0P, AnonymousClass4kA.A0c, 3);
        } catch (IOException e) {
            0wb.A06("IceBreakerSettingManager", "Error while serializing IceBreakerCollection", e);
        }
    }

    public final void A08(C70814OMj oMj, Integer num) {
        C74442Pux pux = this.A02;
        if (pux != null) {
            pux.CtU();
        }
        UserSession userSession = this.A0B;
        NMI nmi = new NMI(this, 8);
        1NY A0N = DbU.A0N(userSession);
        A0N.A0R = true;
        A0N.A0R(NGt.class, OPC.class);
        int intValue = num.intValue();
        if (intValue == 1) {
            oMj.A01.getClass();
            A0N.A0K(C69915NuH.A00(num), new Object[]{oMj.A01});
            A0N.A9m("question_text", oMj.A02);
            A0N.A0G("response_text", oMj.A03);
        } else if (intValue == 0) {
            A0N.A0A(C69915NuH.A00(num));
            A0N.A9m("question_text", oMj.A02);
            A0N.A0G("response_text", oMj.A03);
        } else if (intValue == 2) {
            oMj.A01.getClass();
            A0N.A0K(C69915NuH.A00(num), new Object[]{oMj.A01});
        } else {
            throw AnonymousClass7TF.A0W("Unknown Icebreaker update request type: ", "CREATE");
        }
        1OC A0M = A0N.A0M();
        A0M.A00 = nmi;
        1ES.A03(A0M);
    }

    public final void A09(boolean z) {
        C74442Pux pux = this.A04;
        if (pux != null) {
            pux.CtU();
            this.A08 = z;
            1NY A0N = DbU.A0N(this.A0B);
            A0N.A0R = true;
            A0N.A0A("direct_v2/icebreakers/toggle/");
            A0N.A0H("enabled", z);
            1OC A0S = DbT.A0S(A0N, NGu.class, OPD.class);
            this.A01 = A0S;
            A0S.A00 = this.A0F;
            1ES.A03(A0S);
        }
    }

    public final void onSessionWillEnd() {
        this.A0B.A03(OyN.class);
    }

    public OyN(1Ng r3, UserSession userSession, AnonymousClass4kA r5) {
        this.A0B = userSession;
        this.A0C = r5;
        this.A0A = r3;
        this.A05 = null;
    }

    public final void A07(ImmutableList immutableList, boolean z) {
        A06(immutableList);
        this.A08 = z;
        0nY.A00().ATE(new NSG(immutableList, this, z));
    }
}
