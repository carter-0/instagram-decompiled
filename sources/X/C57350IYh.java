package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* renamed from: X.IYh  reason: case insensitive filesystem */
public final class C57350IYh implements AnonymousClass5CQ {
    public final 02m A00;
    public final UserSession A01;
    public final AtomicInteger A02;

    public final void DDp(C230432pc r20, Map map) {
        C230432pc r12 = r20;
        0qQ.A0B(r12, 1);
        Map map2 = map;
        0qQ.A0B(map2, 0);
        String A0s = C51972G9s.A0s(map2);
        HashMap A1E = AnonymousClass7TE.A1E();
        LinkedHashSet A0y = DbS.A0y();
        LinkedHashSet A0y2 = DbS.A0y();
        A00("ad_and_netego_realtime_information", map2, A0y2);
        A00("seen_sponsored_reels", map2, A0y2);
        A00("organic_realtime_information", map2, A0y);
        A00("seen_organic_reels", map2, A0y);
        C230472pg r8 = C230472pg.ORGANIC;
        A1E.put(r8.toString(), A0y);
        C230472pg r4 = C230472pg.SPONSORED;
        String obj = r4.toString();
        A1E.put(obj, A0y2);
        UserSession userSession = this.A01;
        AnonymousClass2yG A002 = C234572yE.A00(userSession);
        C233162v9 r10 = C233162v9.SEEN_STATE;
        Set AUL = A002.AUL(r4, r10, r12);
        Set AUL2 = C234572yE.A00(userSession).AUL(C230472pg.NETEGO, r10, r12);
        C234572yE.A00(userSession).AUL(r8, r10, r12);
        this.A02.getAndIncrement();
        LinkedHashSet A003 = 094.A00(AUL2, AUL);
        0sl r7 = (Set) A1E.get(obj);
        if (r7 == null) {
            r7 = 0sl.A00;
        }
        1Ky r13 = 1Kt.A00(userSession).A00;
        List Ab0 = r13.Ab0();
        ArrayList A0q = AnonymousClass7TF.A0q(Ab0, 0);
        for (Object next : Ab0) {
            AnonymousClass9J4 r42 = (AnonymousClass9J4) ((AnonymousClass9IV) next).A01;
            if (r42.A04 == r10 && r42.A05 == r12) {
                A0q.add(next);
            }
        }
        C233162v9 r11 = C233162v9.SEEN_STATE_PERSISTENT;
        List Ab02 = r13.Ab0();
        ArrayList A0q2 = AnonymousClass7TF.A0q(Ab02, 0);
        for (Object next2 : Ab02) {
            AnonymousClass9J4 r43 = (AnonymousClass9J4) ((AnonymousClass9IV) next2).A01;
            if (r43.A04 == r11 && r43.A05 == r12) {
                A0q2.add(next2);
            }
        }
        HashMap A022 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("surface_type", r12.toString()), AnonymousClass7TE.A1L("signal_type", r10.toString()), AnonymousClass7TE.A1L("sponsored_second_channel_ids", A003.toString()), AnonymousClass7TE.A1L("sponsored_second_channel_ids_count", String.valueOf(A003.size())), AnonymousClass7TE.A1L("sponsored_second_channel_only_ids", 00k.A0m(A003, r7).toString()), AnonymousClass7TE.A1L("sponsored_realtime_signal_ids", r7.toString()), AnonymousClass7TE.A1L("sponsored_realtime_signal_ids_count", String.valueOf(r7.size())), AnonymousClass7TE.A1L("sponsored_realtime_signal_only_ids", 00k.A0m(r7, A003).toString()), AnonymousClass7TE.A1L("sponsored_realtime_signals_remain_in_memory", A0q.toString()), AnonymousClass7TE.A1L("realtime_history", A0q2.toString())});
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_ad_realtime_diversity_debug");
        if (A0e.isSampled()) {
            A0e.AAJ(C273654mx.A00(37), "client_ad_request");
            A0e.AAJ("join_id", A0s);
            A0e.A9H("extra_info_map", A022);
            A0e.A7p("is_from_client", true);
            A0e.Cgf();
        }
    }

    public /* synthetic */ C57350IYh(UserSession userSession) {
        02m r2 = 02m.A0p;
        AtomicInteger atomicInteger = new AtomicInteger(1);
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = atomicInteger;
    }

    public static final void A00(String str, Map map, Set set) {
        String A11 = DbT.A11(str, map);
        if (A11 != null) {
            JSONArray jSONArray = new JSONArray(A11);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getJSONObject(i).getString("item_id");
                if (string != null) {
                    set.add(string);
                }
            }
        }
    }
}
