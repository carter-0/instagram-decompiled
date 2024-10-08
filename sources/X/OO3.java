package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

public final class OO3 {
    public long A00;
    public AnonymousClass2Ep A01;
    public AnonymousClass9VB A02;
    public C254783t2 A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public ScheduledFuture A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final 0wc A0E;
    public final UserSession A0F;
    public final ScheduledExecutorService A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public OO3(0wc r4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0F = userSession;
        this.A0E = r4;
        0Tu r2 = 0Tu.A05;
        this.A0I = 182.A06(r2, userSession, 36313471746443287L);
        this.A0K = 182.A06(r2, userSession, 36320416709484953L);
        this.A0H = 182.A06(r2, userSession, 36314811776895795L);
        this.A0J = 182.A06(r2, userSession, 36323526264761585L);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        this.A0G = scheduledThreadPoolExecutor;
    }

    public final void A00() {
        ScheduledFuture scheduledFuture = this.A09;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A07 = null;
        this.A09 = null;
        this.A06 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A0B = false;
        this.A0D = false;
        this.A05 = null;
        this.A0A = false;
        this.A02 = null;
        this.A08 = null;
    }

    public final void A01(int i) {
        String str;
        C69484NmS nmS;
        if (this.A0K && (str = this.A07) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A0E, "universal_search_error_state");
            if (A0e.isSampled()) {
                C66580MXl.A1H(A0e, str);
                A0e.AAJ("query_string", this.A06);
                if (i == 1) {
                    nmS = C69484NmS.NO_RESULTS;
                } else if (i == 2) {
                    nmS = C69484NmS.NO_INTERNET;
                } else if (i == 4) {
                    nmS = C69484NmS.ERROR_WITH_SNIPPET;
                } else if (i == 5) {
                    nmS = C69484NmS.REFUSAL_WITH_SNIPPET;
                } else if (i != 6) {
                    nmS = C69484NmS.GENERAL_ERROR;
                } else {
                    nmS = C69484NmS.NEEDS_MORE_INFO_WITH_SNIPPET;
                }
                A0e.A8M(nmS, "error_state");
                A0e.Cgf();
            }
        }
    }

    public final void A02(C69495Nmd nmd, Long l, String str, boolean z) {
        List list;
        long j;
        C69461Nm5 nm5;
        C254923tH r1;
        AnonymousClass2Ep r0;
        Boolean bool;
        long j2;
        String str2;
        C254923tH r02;
        if (!this.A0B) {
            String str3 = this.A07;
            if (str3 != null) {
                this.A0B = true;
                0Aj A0e = AnonymousClass7TE.A0e(this.A0E, "universal_search_end");
                if (A0e.isSampled()) {
                    C66580MXl.A1H(A0e, str3);
                    A0e.A8M(nmd, "end_action");
                    if (z) {
                        A0e.AAe("data_sources", AnonymousClass7TE.A1I(C69469NmD.SERVER_ENTITIES_NAMED_DSQ1));
                        A0e.AAJ("bot_response_id", str);
                    }
                    Integer num = this.A04;
                    boolean z2 = false;
                    boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A0D);
                    String str4 = null;
                    if (num != null) {
                        A0e.A8M(C71112Od3.A01(num), "result_type");
                    }
                    if (this.A0I || !this.A0D) {
                        C254783t2 r03 = this.A03;
                        if (r03 != null) {
                            r02 = AnonymousClass6W3.A00(r03);
                        } else {
                            r02 = null;
                        }
                        A0e.A8M(C71112Od3.A02(r02), TraceFieldType.TransportType);
                    }
                    AnonymousClass2Ep r04 = this.A01;
                    if (r04 != null) {
                        list = r04.BRV();
                    } else if (this.A02 != null) {
                        list = AnonymousClass7TE.A1I(182.A04(0Tu.A05, this.A0F, 36882348756763071L));
                    } else {
                        list = 0sn.A00;
                    }
                    String str5 = this.A0F.A06;
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        0qQ.A0B(A18, 0);
                        try {
                            str2 = A18;
                            long parseLong = Long.parseLong(A18);
                            str2 = parseLong;
                            j2 = parseLong;
                        } catch (NumberFormatException e) {
                            0KC.A0N("DirectInboxSearchUnifiedLoggingUtil", "Unable to convert item's id[%s] to long", e, new Object[]{str2});
                            j2 = 0;
                        }
                        builder.add(Long.valueOf(j2));
                    }
                    builder.add(DbV.A0q(str5));
                    A0e.AAe("recipient_ids", DbZ.A0K(builder));
                    if (!A1W) {
                        AnonymousClass2Ep r05 = this.A01;
                        if (r05 != null) {
                            bool = Boolean.valueOf(r05.CVr());
                        } else {
                            bool = null;
                        }
                        A0e.A7p("is_interop_thread", bool);
                        A0e.A7p("with_story_ring", Boolean.valueOf(this.A0A));
                    }
                    String str6 = this.A06;
                    if (str6 != null) {
                        Pattern pattern = 0mp.A06;
                        j = (long) str6.length();
                    } else {
                        j = 0;
                    }
                    C66581MXm.A1F(A0e, j);
                    Long l2 = this.A05;
                    if (l2 != null) {
                        l = l2;
                    }
                    A0e.A9F("ui_section_rank_index", l);
                    if (this.A0J) {
                        C254783t2 r06 = this.A03;
                        if (r06 != null) {
                            r1 = AnonymousClass6W3.A00(r06);
                        } else {
                            r1 = null;
                        }
                        if (r1 == C254923tH.DJANGO && (r0 = this.A01) != null) {
                            str4 = r0.C6C();
                        }
                        C66580MXl.A1J(A0e, str4);
                    }
                    if (this.A0H) {
                        if (!A1W && (this.A0C || this.A0D)) {
                            z2 = true;
                        }
                        C66581MXm.A1G(A0e, z2);
                    }
                    AnonymousClass9VB r07 = this.A02;
                    if (r07 != null) {
                        if (r07.ordinal() == 0) {
                            nm5 = C69461Nm5.IMAGE;
                        } else {
                            nm5 = C69461Nm5.TEXT;
                        }
                        A0e.A8M(nm5, "suggested_prompt_type");
                    }
                    String str7 = this.A08;
                    if (str7 != null) {
                        A0e.AAJ("suggested_prompt_id", str7);
                    }
                    A0e.Cgf();
                }
            }
            A00();
        }
    }

    public final void A03(Integer num, int i, long j) {
        String str = this.A07;
        if (str != null) {
            this.A04 = num;
            0Aj A0e = AnonymousClass7TE.A0e(this.A0E, "universal_search_button_click");
            C66580MXl.A1H(A0e, str);
            A0e.A8M(C71112Od3.A00(i), "button_name");
            A0e.A9F("query_length", Long.valueOf(j));
            A0e.Cgf();
        }
    }

    public final void A04(String str) {
        if (this.A07 != null && !0mp.A0G(this.A06, str)) {
            this.A06 = str;
            this.A00 = System.currentTimeMillis();
            0Aj A0e = AnonymousClass7TE.A0e(this.A0E, "universal_search_query_changed");
            if (A0e.isSampled()) {
                String str2 = this.A07;
                if (str2 != null) {
                    C66580MXl.A1H(A0e, str2);
                    String str3 = this.A06;
                    if (str3 == null || str3.length() == 0) {
                        str3 = null;
                    }
                    A0e.AAJ("query_string", str3);
                    A0e.A9F("query_length", DbS.A0j(DbX.A05(this.A06)));
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0z("inSession() means session id is not null");
            }
        }
    }
}
