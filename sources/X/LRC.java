package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

public final class LRC {
    public long A00;
    public AnonymousClass0iw A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;

    public LRC(UserSession userSession, ArrayList arrayList, String str, ArrayList arrayList2, String str2, AnonymousClass0iw r7) {
        0qQ.A0B(str, 3);
        this.A02 = userSession;
        this.A06 = arrayList == null ? AnonymousClass7TE.A1C() : arrayList;
        this.A01 = r7;
        this.A05 = str;
        this.A07 = arrayList2 == null ? AnonymousClass7TE.A1C() : arrayList2;
        this.A03 = str2;
        this.A08 = AnonymousClass7TE.A1C();
        this.A04 = "seller";
    }

    public static final boolean A00(LRC lrc) {
        ArrayList arrayList = lrc.A06;
        if (!(!arrayList.isEmpty())) {
            arrayList = lrc.A07;
        }
        if (arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    public final void A01() {
        C63904LBk lBk = C64832Lit.A04;
        UserSession userSession = this.A02;
        C64832Lit A002 = lBk.A00(userSession);
        String str = this.A05;
        Integer num = AnonymousClass05K.A0C;
        ArrayList arrayList = this.A06;
        A002.A02 = str;
        A002.A01 = num;
        A002.A00 = null;
        A002.A03 = arrayList;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("commerce/suggested_product_tags/");
        A0a.A0O((15p) null, K1E.class, C64035LJz.class, false);
        String str2 = userSession.A06;
        ArrayList arrayList2 = this.A07;
        String str3 = this.A03;
        ArrayList arrayList3 = this.A08;
        try {
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            16P.A03(A0K, "upload_ids");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(A0K, it);
            }
            A0K.A0Y();
            A0K.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
            A0K.A0S("use_mock_data", false);
            A0K.A0R("waterfall_id", str);
            16P.A03(A0K, "base_64_imgs");
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C41846B3n.A18(A0K, it2);
            }
            A0K.A0Y();
            A0K.A0R("media_format", str3);
            16P.A03(A0K, C273654mx.A00(167));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C41846B3n.A18(A0K, it3);
            }
            A0K.A0Y();
            A0a.A9m("data", AnonymousClass7TG.A0k(A0K, A0v));
            1OC A0M = A0a.A0M();
            A0M.A00 = new C61498KAd(this);
            this.A00 = System.currentTimeMillis();
            1ES.A03(A0M);
        } catch (IOException e) {
            String str4 = JZM.A00(userSession).A02;
            if (str4 != null) {
                LTQ.A08(this.A01, userSession, str4, e.getMessage(), 0, A00(this));
            }
        }
    }

    public LRC(AnonymousClass0iw r2, UserSession userSession, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A05 = str;
        this.A07 = arrayList;
        this.A06 = AnonymousClass7TE.A1C();
        this.A03 = str2;
        this.A08 = arrayList2 == null ? AnonymousClass7TE.A1C() : arrayList2;
        this.A04 = "opt";
    }
}
