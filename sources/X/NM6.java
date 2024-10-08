package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class NM6 extends 1P0 {
    public final /* synthetic */ 1lZ A00;
    public final /* synthetic */ 1lX A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;

    public NM6(1lZ r1, 1lX r2, Integer num, Long l, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
        this.A03 = l;
        this.A04 = str;
    }

    public final void onFail(C268654dm r9) {
        Long l;
        int A0D = AnonymousClass7TG.A0D(r9, 2096728601);
        NM6.super.onFail(r9);
        UserSession userSession = this.A00.A00;
        String A032 = this.A01.A03();
        Integer num = this.A02;
        Long l2 = this.A03;
        String str = this.A04;
        0Aj A0H = C66582MXn.A0H(AnonymousClass0kN.A02(userSession), "direct_disappearing_messages_toggle_error", A032);
        C69452Nlw nlw = null;
        if (num != null) {
            l = Long.valueOf(TimeUnit.SECONDS.toMillis((long) num.intValue()));
        } else {
            l = null;
        }
        A0H.A9F("ephemeral_lifetime_ms", l);
        A0H.A9F("after_view_lifetime_ms", l2);
        if (str != null) {
            nlw = C69882Ntk.A00(str);
        }
        A0H.A8M(nlw, TraceFieldType.TransportType);
        A0H.Cgf();
        AnonymousClass0fD.A0A(-55683731, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Long l;
        0Aj A0H;
        String str;
        String str2;
        int A032 = AnonymousClass0fD.A03(-146766358);
        int A0D = AnonymousClass7TG.A0D(obj, 861950269);
        NM6.super.onSuccess(obj);
        UserSession userSession = this.A00.A00;
        1lX r1 = this.A01;
        Object obj2 = null;
        if (C308556Us.A0E(userSession, r1.A01)) {
            C272964li r0 = r1.A03;
            if (r0 != null) {
                obj2 = r0.A00;
            }
            obj2 = DbT.A0l(0qQ.A0K(obj2, r1.A04));
        }
        int i = r1.A00;
        String A033 = r1.A03();
        boolean z = r1.A07;
        Integer num = this.A02;
        Long l2 = this.A03;
        String str3 = this.A04;
        C69361Nk1 nk1 = (C69361Nk1) C51968G9o.A10(C69361Nk1.A02, i);
        if (nk1 != null) {
            if (num != null) {
                l = Long.valueOf(TimeUnit.SECONDS.toMillis((long) num.intValue()));
            } else {
                l = null;
            }
            0wc A022 = AnonymousClass0kN.A02(userSession);
            Integer num2 = nk1.A00;
            Integer num3 = nk1.A01;
            if (z) {
                A0H = C66582MXn.A0H(A022, "direct_disappearing_messages_toggle_on", A033);
                C69452Nlw nlw = null;
                if (num3 != null) {
                    str2 = C69884Ntm.A00(num3);
                } else {
                    str2 = null;
                }
                DbS.A1N(A0H, str2);
                DbS.A1J(A0H, C69883Ntl.A00(num2));
                A0H.A9F("ephemeral_lifetime_ms", l);
                A0H.A9F("after_view_lifetime_ms", l2);
                if (str3 != null) {
                    nlw = C69882Ntk.A00(str3);
                }
                A0H.A8M(nlw, TraceFieldType.TransportType);
                Boolean A0v = AnonymousClass7TE.A0v();
                if (0qQ.A0K(obj2, A0v)) {
                    A0H.A7p("is_duration_updated", A0v);
                }
            } else {
                A0H = C66582MXn.A0H(A022, "direct_disappearing_messages_toggle_off", A033);
                C69452Nlw nlw2 = null;
                if (num3 != null) {
                    str = C69884Ntm.A00(num3);
                } else {
                    str = null;
                }
                DbS.A1N(A0H, str);
                DbS.A1J(A0H, C69883Ntl.A00(num2));
                A0H.A9F("ephemeral_lifetime_ms", l);
                if (str3 != null) {
                    nlw2 = C69882Ntk.A00(str3);
                }
                A0H.A8M(nlw2, TraceFieldType.TransportType);
                A0H.A9F("after_view_lifetime_ms", l2);
            }
            A0H.Cgf();
        }
        AnonymousClass0fD.A0A(-1951670978, A0D);
        AnonymousClass0fD.A0A(2071392903, A032);
    }
}
