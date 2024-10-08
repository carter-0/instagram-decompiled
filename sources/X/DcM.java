package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public final class DcM {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;

    public static final void A03(DcM dcM, F10 f10, String str, String str2) {
        A02(dcM, f10, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, str, str2, (List) null, (Map) null);
    }

    public final void A04(F10 f10, Boolean bool, Long l, Long l2, Long l3, String str, boolean z, boolean z2) {
        String str2 = str;
        0qQ.A0B(str2, 3);
        A02(this, f10, Boolean.valueOf(z), Boolean.valueOf(z2), bool, (Long) null, (Long) null, l, l2, l3, "ig_quiet_mode_toggled", str2, (List) null, (Map) null);
    }

    public static void A00(0Aj r2, 0Aj r3, F10 f10, String str, List list) {
        r2.AAe("days_of_week_enforced", list);
        r2.A9F("session_screen_time", Long.valueOf(f10.A04));
        r2.AAJ("entrypoint", str);
        String id = TimeZone.getDefault().getID();
        0qQ.A07(id);
        r3.AAJ("timezone", id);
    }

    public static void A01(0wc r2, F10 f10, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(r2, "ig_quiet_mode_action");
        DbS.A1J(A0e, str);
        A0e.A7p("enabled", Boolean.valueOf(f10.A09));
        A0e.A7p("is_in_quiet_mode", Boolean.valueOf(f10.A07));
        A0e.A9F("start_interval", Long.valueOf(f10.A05));
        A0e.A9F("end_interval", Long.valueOf(f10.A00));
        A0e.A7p("pause_enabled", Boolean.valueOf(f10.A08));
        A0e.A9F("pause_interval_start", Long.valueOf(f10.A02));
        A0e.A9F("pause_interval_end", Long.valueOf(f10.A01));
        A0e.A9F("pause_selected_interval", Long.valueOf(f10.A03));
        A00(A0e, A0e, f10, str2, f10.A06);
        A0e.Cgf();
    }

    public static final void A02(DcM dcM, F10 f10, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, List list, Map map) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        0Aj A0e = AnonymousClass7TE.A0e(dcM.A01, "ig_quiet_mode_action");
        DbS.A1J(A0e, str);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = f10.A09;
        }
        A0e.A7p("enabled", Boolean.valueOf(z));
        A0e.A7p("is_in_quiet_mode", Boolean.valueOf(f10.A07));
        if (l != null) {
            j = l.longValue();
        } else {
            j = f10.A05;
        }
        A0e.A9F("start_interval", Long.valueOf(j));
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = f10.A00;
        }
        A0e.A9F("end_interval", Long.valueOf(j2));
        if (bool3 != null) {
            z2 = bool3.booleanValue();
        } else {
            z2 = f10.A08;
        }
        A0e.A7p("pause_enabled", Boolean.valueOf(z2));
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = f10.A02;
        }
        A0e.A9F("pause_interval_start", Long.valueOf(j3));
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = f10.A01;
        }
        A0e.A9F("pause_interval_end", Long.valueOf(j4));
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = f10.A03;
        }
        A0e.A9F("pause_selected_interval", Long.valueOf(j5));
        if (list == null) {
            list = f10.A06;
        }
        A00(A0e, A0e, f10, str2, list);
        if (bool2 != null) {
            A0e.A7p("previous_enabled", bool2);
        }
        if (map != null) {
            A0e.A9H("extra_event_data", map);
        }
        A0e.Cgf();
    }

    public final void A05(F10 f10, String str, String str2, String str3, long j, long j2, boolean z) {
        String str4 = str;
        String str5 = str2;
        AnonymousClass7TG.A1R(str4, str5);
        A02(this, f10, Boolean.valueOf(z), (Boolean) null, (Boolean) null, Long.valueOf(j), Long.valueOf(j2), (Long) null, (Long) null, (Long) null, "ig_quiet_mode_error_event", str4, (List) null, DbY.A0p("exception_message", str3, AnonymousClass7TE.A1L(C273654mx.A00(2326), str5)));
    }

    public /* synthetic */ DcM(AnonymousClass0iw r3, UserSession userSession) {
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0qQ.A0B(A012, 3);
        this.A02 = userSession;
        this.A00 = r3;
        this.A01 = A012;
    }
}
