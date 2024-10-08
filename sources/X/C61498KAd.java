package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KAd  reason: case insensitive filesystem */
public final class C61498KAd extends 1P0 {
    public final /* synthetic */ LRC A00;

    public C61498KAd(LRC lrc) {
        this.A00 = lrc;
    }

    private final void A00() {
        C63904LBk lBk = C64832Lit.A04;
        LRC lrc = this.A00;
        UserSession userSession = lrc.A02;
        C64832Lit A002 = lBk.A00(userSession);
        String str = lrc.A05;
        C60762Jqt A003 = A002.A00(str, str);
        if (A003 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(lrc.A01, userSession), "instagram_shopping_suggested_tags_request_completion");
            A0e.AAK(A003, "suggested_tags_info");
            A0e.AAJ("waterfall_id", str);
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(347510191);
        K1E k1e = (K1E) obj;
        int A0D = AnonymousClass7TG.A0D(k1e, 682685681);
        C61498KAd.super.onSuccess(k1e);
        C63904LBk lBk = C64832Lit.A04;
        LRC lrc = this.A00;
        UserSession userSession = lrc.A02;
        C64832Lit A002 = lBk.A00(userSession);
        String str = lrc.A05;
        Integer num = AnonymousClass05K.A00;
        ArrayList arrayList = lrc.A06;
        A002.A02 = str;
        A002.A01 = num;
        A002.A00 = k1e;
        A002.A03 = arrayList;
        A00();
        List list = k1e.A00;
        list.getClass();
        ImmutableList A0K = DbU.A0K(list);
        1Ng A003 = AnonymousClass1Nd.A00(userSession);
        C239793Ih A0d = C41845B3m.A0d(A0K);
        String str2 = lrc.A03;
        A003.A00(new C354838No(A0d, str2));
        AnonymousClass0iw r6 = lrc.A01;
        long currentTimeMillis = System.currentTimeMillis() - lrc.A00;
        boolean A004 = LRC.A00(lrc);
        List list2 = k1e.A00;
        list2.getClass();
        ImmutableList A0K2 = DbU.A0K(list2);
        String str3 = lrc.A04;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0K2.iterator();
        while (it.hasNext()) {
            List list3 = ((C62930Koi) it.next()).A02;
            if (list3 != null && AnonymousClass7TE.A1b(list3)) {
                A1C.addAll(list3);
            }
        }
        HashMap A032 = LTQ.A03(A1C);
        long j = 0;
        long A05 = JTU.A05(JTO.A0z("high_confidence_count", A032));
        long A052 = JTU.A05(JTO.A0z("medium_confidence_count", A032));
        Number A0z = JTO.A0z("low_confidence_count", A032);
        if (A0z != null) {
            j = (long) A0z.intValue();
        }
        0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0a(r6, userSession), "ig_suggested_tags_request_success");
        String str4 = userSession.A06;
        JTU.A11(A0e, "upload_key", LTQ.A01(str4, str), str, str4);
        A0e.AAJ("user_tag_type", str3);
        A0e.A9F(TraceFieldType.Duration, Long.valueOf(currentTimeMillis));
        JTQ.A17(A0e, A004);
        A0e.A9F("high_confidence_suggestions_count", Long.valueOf(A05));
        JTU.A0w(A0e, A052, j);
        A0e.AAJ("media_format", str2);
        A0e.Cgf();
        AnonymousClass0fD.A0A(-1683200615, A0D);
        AnonymousClass0fD.A0A(-1312716437, A03);
    }

    public final void onFail(C268654dm r13) {
        int A0D = AnonymousClass7TG.A0D(r13, 248898950);
        C61498KAd.super.onFail(r13);
        C63904LBk lBk = C64832Lit.A04;
        LRC lrc = this.A00;
        UserSession userSession = lrc.A02;
        C64832Lit A002 = lBk.A00(userSession);
        String str = lrc.A05;
        Integer num = AnonymousClass05K.A01;
        ArrayList arrayList = lrc.A06;
        A002.A02 = str;
        A002.A01 = num;
        A002.A00 = null;
        A002.A03 = arrayList;
        A00();
        AnonymousClass1Nd.A00(userSession).A00(new C354838No(DbU.A0f(), lrc.A03));
        Throwable A01 = r13.A01();
        if (!(A01 == null || A01.getMessage() == null)) {
            boolean A003 = LRC.A00(lrc);
            LTQ.A08(lrc.A01, userSession, str, A01.getMessage(), System.currentTimeMillis() - lrc.A00, A003);
        }
        AnonymousClass0fD.A0A(-553208953, A0D);
    }
}
