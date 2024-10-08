package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$DIRECT_HTTP;

/* renamed from: X.NHy  reason: case insensitive filesystem */
public final class C68438NHy extends C272124k8 {
    public long A00;
    public final boolean A01;
    public final /* synthetic */ AnonymousClass43G A02;

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(2062859916);
        B72 b72 = (B72) obj;
        int A04 = DbX.A04(b72, 1830088803);
        AnonymousClass43G r2 = this.A02;
        for (1P0 onSuccessInBackground : r2.A0C) {
            onSuccessInBackground.onSuccessInBackground(b72);
        }
        r2.A09.A0O(r2.A08, b72, r2.A0A, C2611948q.ALL, !this.A01);
        AnonymousClass0fD.A0A(1323946613, A04);
        AnonymousClass0fD.A0A(-346432167, A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68438NHy(UserSession userSession, AnonymousClass43G r2, boolean z) {
        super(userSession);
        this.A02 = r2;
        this.A01 = z;
    }

    public final void A01(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-747207280);
        AnonymousClass43G r1 = this.A02;
        r1.A05 = false;
        for (1P0 onFinish : r1.A0C) {
            onFinish.onFinish();
        }
        AnonymousClass0fD.A0A(-631519919, A03);
    }

    public final void A02(UserSession userSession) {
        String str;
        int A03 = AnonymousClass0fD.A03(1906569470);
        DLogTag$DIRECT_HTTP dLogTag$DIRECT_HTTP = DLogTag$DIRECT_HTTP.INSTANCE;
        if (this.A01) {
            str = "fetchNextPage";
        } else {
            str = "fetchFirstPage";
        }
        AnonymousClass43G r3 = this.A02;
        DLog.d(dLogTag$DIRECT_HTTP, "%s=%s", new Object[]{str, C67312Mlm.A00(r3.A08.A03)});
        r3.A05 = true;
        r3.A04 = false;
        this.A00 = System.currentTimeMillis();
        for (1P0 onStart : r3.A0C) {
            onStart.onStart();
        }
        AnonymousClass0fD.A0A(-1906974600, A03);
    }

    public final void A05(C268654dm r13, UserSession userSession) {
        2EM r6;
        Integer num;
        int A03 = AnonymousClass0fD.A03(1691763729);
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, r13);
        AnonymousClass43G r4 = this.A02;
        r4.A04 = A1U;
        for (1P0 onFail : r4.A0C) {
            onFail.onFail(r13);
        }
        boolean z = !this.A01;
        AnonymousClass0iw r2 = r4.A00;
        if (r2 != null && ((num = r6.A03) == AnonymousClass05K.A01 || num == AnonymousClass05K.A0N)) {
            C270214gN A012 = C71115Od8.A01(r13, C71115Od8.A00);
            boolean A013 = 2Ek.A01(AnonymousClass7TF.A0Q(userSession));
            String str = C271314ie.A00(r4.A0A).A00;
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            String A0j = AnonymousClass7TF.A0j((r6 = r4.A08).A01.name());
            AnonymousClass7TG.A1R(str, A012);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "direct_request_fetch_failure");
            double d = ((double) currentTimeMillis) / 1000.0d;
            if (A0e.isSampled()) {
                A0e.A9F(TraceFieldType.ErrorCode, Long.valueOf(JTS.A06(C51971G9r.A0n(0, A012.A03))));
                A0e.AAJ(AnonymousClass000.A00(34), A012.A01.A01);
                String str2 = A012.A04;
                if (str2 == null) {
                    str2 = "";
                }
                A0e.A9O("first_page", JTP.A0g(A0e, "error_info", str2, z));
                A0e.A8D("load_time", Double.valueOf(d));
                A0e.A7p("ranked_requests_enabled", Boolean.valueOf(A013));
                A0e.A9O("e_counter_channel", "");
                A0e.AAJ("selected_filter", str);
                A0e.AAJ("user_account_type", AnonymousClass0eD.A01(userSession).A01);
                A0e.AAJ("folder", A0j);
                A0e.Cgf();
            }
        }
        AnonymousClass0fD.A0A(-1037400423, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(592208664);
        A07(userSession, (B72) obj);
        AnonymousClass0fD.A0A(1716750506, A03);
    }

    public final void A07(UserSession userSession, B72 b72) {
        boolean booleanValue;
        int A03 = AnonymousClass0fD.A03(-685874893);
        AnonymousClass7TF.A1H(userSession, b72);
        AnonymousClass43G r3 = this.A02;
        r3.A04 = false;
        C370518wb r1 = b72.A05;
        Boolean bool = r1.A02;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        r3.A03 = booleanValue;
        r3.A01 = r1.A03;
        for (1P0 onSuccess : r3.A0C) {
            onSuccess.onSuccess(b72);
        }
        2EM r6 = r3.A08;
        Integer num = r6.A03;
        if (num == AnonymousClass05K.A00) {
            C67040MhD.A00(userSession).A01();
        } else {
            boolean z = !this.A01;
            AnonymousClass0iw r2 = r3.A00;
            if (r2 != null && (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0N)) {
                C2611948q A002 = C271314ie.A00(r3.A0A);
                int A05 = r3.A09.A05();
                String str = A002.A00;
                long currentTimeMillis = System.currentTimeMillis() - this.A00;
                String A0j = AnonymousClass7TF.A0j(r6.A01.name());
                0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r2, userSession, str, 4), "direct_request_fetch_success");
                double d = ((double) currentTimeMillis) / 1000.0d;
                if (A0e.isSampled()) {
                    A0e.A9O("first_page", Boolean.valueOf(z));
                    A0e.A8D("load_time", Double.valueOf(d));
                    A0e.A9F("total_requests", DbV.A0p(A0e, "selected_filter", str, A05));
                    A0e.A9O("e_counter_channel", "");
                    A0e.AAJ("user_account_type", AnonymousClass0eD.A01(userSession).A01);
                    A0e.AAJ("folder", A0j);
                    A0e.Cgf();
                }
            }
        }
        AnonymousClass0fD.A0A(1032991496, A03);
    }
}
