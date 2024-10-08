package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.LMr  reason: case insensitive filesystem */
public final class C64097LMr {
    public final 0wc A00;
    public final UserSession A01;
    public final C61480nO A02;
    public final AnonymousClass3Q2 A03;
    public final boolean A04;

    public static final void A00(C64097LMr lMr, List list, List list2) {
        int i;
        UserSession userSession = lMr.A01;
        AnonymousClass3Q2 r2 = lMr.A03;
        String str = r2.A3t;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0R = true;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C16674UzA.PDQ_HASH_REPORT.A00(A0a, userSession, A1A);
        A0a.A0E = DbT.A10(A1A);
        A0a.A9m("upload_id", str);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63789L6v l6v = (C63789L6v) it.next();
            JSONObject A11 = DbS.A11();
            A11.put("pdq_hash", l6v.A00);
            A11.put("frame_time", l6v.A01);
            jSONArray.put(A11);
        }
        A0a.A9m("pdq_hash_info", jSONArray.toString());
        if (AnonymousClass7TE.A1b(list2)) {
            A0a.A9m("md5_hash_info", DbT.A0z(":", list2, (0sP) null));
        }
        C63790L6w A002 = ParsingSyncHttpService.A00(new C64842Lj4(C375889Fq.A00, new C64601Lel(1)), A0a.A0N());
        0wc r6 = lMr.A00;
        String str2 = r2.A3t;
        String str3 = userSession.A06;
        C63376Kvx.A00(r6, AnonymousClass05K.A03, JTP.A0j(r2.A0y() ? 1 : 0), str2, str3, (String) null);
        2ZL r3 = A002.A00;
        if (r3 != null && (i = r3.A02) != 200) {
            String A06 = 0mp.A06("Response status:%s Reason%s", new Object[]{Integer.valueOf(i), r3.A03});
            C63376Kvx.A00(r6, AnonymousClass05K.A0C, JTP.A0j(r2.A0y() ? 1 : 0), r2.A3t, str3, 002.A0R("network_error ", A06));
            0wb.A03("video_pdq_report_network_error", A06);
        }
    }

    public C64097LMr(UserSession userSession, C61480nO r5, AnonymousClass3Q2 r6) {
        this.A01 = userSession;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = 182.A06(0Tu.A05, userSession, 2342154720023413477L);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }
}
