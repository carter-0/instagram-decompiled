package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.43G  reason: invalid class name */
public final class AnonymousClass43G {
    public AnonymousClass0iw A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final 1Ng A06;
    public final UserSession A07;
    public final 2EM A08;
    public final 2ED A09;
    public final 2Eo A0A;
    public final 2Dm A0B;
    public final Set A0C;
    public final AnonymousClass4D6 A0D = 1ES.A01();
    public final NotesRepository A0E;
    public final List A0F;

    public final void A03(C2611948q r21, List list) {
        C2611948q r1 = r21;
        0qQ.A0B(r1, 1);
        UserSession userSession = this.A07;
        2EM r5 = this.A08;
        C66716MbN A002 = C67314Mlo.A00(userSession, r5, (AnonymousClass7BV) null, false, (Integer) null, (Integer) null, (Integer) null, (String) null, this.A02, C66681Mao.A01(userSession, r5.A01, r1), this.A0A.A00, (String) null, UUID.randomUUID().toString(), AnonymousClass43B.A01(list), -1);
        A002.A00(new C68438NHy(userSession, this, false));
        A00(A002, this);
    }

    public final void A05(List list) {
        ArrayList arrayList;
        ImmutableList immutableList;
        UserSession userSession = this.A07;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36327026663110782L);
        0wc A012 = AnonymousClass0kN.A01(this.A00, userSession);
        List<C69415Nkv> list2 = list;
        if (A062) {
            A012.A00(A012.A00, "direct_gql_fetch_pending_request_falco_event").Cgf();
            C69032NdK ndK = new C69032NdK(userSession, this);
            1vn A013 = 1vm.A01(userSession);
            2IS r6 = new 2IS();
            2IS r8 = new 2IS();
            if (C272094k5.A0A(userSession, false)) {
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
                for (C69415Nkv nkv : list2) {
                    arrayList2.add(String.valueOf(nkv.A00));
                }
                immutableList = ImmutableList.copyOf((Collection) arrayList2);
            } else {
                immutableList = null;
            }
            r6.A05("pending_thread_filters", immutableList);
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGDInboxPendingRequestsQuery", r6.getParamsCopy(), r8.getParamsCopy(), C7772QWj.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_igd_pending_request_count", new ArrayList());
            A013.ATL(new C71555Omq(ndK, this), new C71572On9(ndK, this), pandoGraphQLRequest);
            return;
        }
        A012.A00(A012.A00, "direct_http_fetch_pending_request").Cgf();
        if (C272094k5.A0A(userSession, false)) {
            arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C69415Nkv nkv2 : list2) {
                arrayList.add(Integer.valueOf(nkv2.A00));
            }
        } else {
            arrayList = 0sn.A00;
        }
        String A0g = 002.A0g("[", new C239023El(",").A02(arrayList), "]");
        1NY r2 = new 1NY(userSession);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("direct_v2/async_get_pending_requests_preview/");
        r2.A0R(C272104k6.class, C272114k7.class);
        r2.A9m("pending_inbox_filters", A0g);
        r2.A0U = false;
        1OC A0M = r2.A0M();
        A0M.A00 = new AnonymousClass5I5(userSession, this);
        A00(A0M, this);
    }

    public static final void A00(AnonymousClass11X r4, AnonymousClass43G r5) {
        r5.A0D.schedule(r4, r4.getRunnableId(), 3, true, false);
    }

    public static final void A01(AnonymousClass43G r3, int i, int i2) {
        if (C271314ie.A00(r3.A0A) == C2611948q.ALL) {
            2ED r2 = r3.A09;
            r2.A0K(i);
            r2.A0M(AnonymousClass4iZ.A00, i2, 0, false);
        }
        r3.A06.A00(new 2Kc((2EM) null, false, false, true));
    }

    public final void A02() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass2Ep r3 : this.A0B.A0C.A0G(AnonymousClass2EX.A00, 2Eo.A04, C2611948q.ALL)) {
            if (r3.C6a() == 29) {
                arrayList.add(r3.C6C());
                arrayList2.add(Long.valueOf(r3.BKd() / 1000));
            }
        }
        if (!arrayList.isEmpty()) {
            UserSession userSession = this.A07;
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = A002.A00.AR4();
            AR4.E5c(002.A0O("broadcast_channel_inbox_last_synced_time_millis_", 3), currentTimeMillis);
            AR4.apply();
            1NY r4 = new 1NY(userSession);
            r4.A08(AnonymousClass05K.A0N);
            r4.A0A("direct_v2/inbox/broadcast/fetch_inbox_updates/");
            r4.A9m("ig_thread_ids", 002.A0g("[", C239023El.A00(',').A02(arrayList), "]"));
            r4.A9m("thread_timestamps_ms", 002.A0g("[", C239023El.A00(',').A02(arrayList2), "]"));
            r4.A0D("cursor_timestamp_ms", ((Number) arrayList2.get(arrayList2.size() - 1)).longValue());
            r4.A0C("inbox_folder", 3);
            r4.A0R(NH6.class, OQ9.class);
            1OC A0M = r4.A0M();
            A0M.A00 = new C67524MpJ(userSession, this);
            A00(A0M, this);
        }
    }

    public final void A04(Integer num, boolean z, boolean z2, boolean z3) {
        UserSession userSession = this.A07;
        A05(new ArrayList(C2612048r.A00(userSession).A00));
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36316074496495521L) && this.A0F.contains(182.A04(r2, userSession, 36879024449978601L)) && !z && !z2 && (!z3 || !182.A06(r2, userSession, 36323242796919829L))) {
            this.A0E.A0K(num, (Runnable) null, false, true);
        }
        if (this.A0F.contains(182.A04(r2, userSession, 36879024449978601L)) && !z && !z2) {
            AnonymousClass4A7.A00(userSession).A02(false);
        }
    }

    public AnonymousClass43G(1Ng r6, UserSession userSession, NotesRepository notesRepository, 2EM r9, 2Eo r10, 2Dm r11) {
        this.A07 = userSession;
        this.A06 = r6;
        this.A0B = r11;
        this.A0E = notesRepository;
        this.A08 = r9;
        this.A0A = r10;
        this.A09 = ((2Dr) r11).A0C;
        this.A0C = new HashSet();
        this.A0F = 0sr.A1M(new String[]{"ONE_ROW_POGS", "ONE_ROW_POGS_V2", "TWO_ROW_POGS", "CARDS", "HYBRID"});
    }
}
