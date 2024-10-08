package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

public final class MYV {
    public static final MYV A01 = new MYV();
    public final 0wc A00;

    public final boolean A0B(AnonymousClass6BJ r9) {
        if (!MYW.A00().booleanValue()) {
            return false;
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_notification_received");
        if (!A0e.isSampled()) {
            return false;
        }
        C66583MXo.A15(A0e, r9, "push_type", A03(A0e, r9));
        C66583MXo.A14(A0e, r9);
        0bb r1 = new 0bb();
        long j = r9.A00;
        r1.A05("badge_count", Long.valueOf(j));
        A0e.AAK(r1, "direct_badge_context");
        0bb r5 = new 0bb();
        long j2 = r9.A01;
        r5.A05("badge_count", Long.valueOf(j2));
        A0e.AAK(r5, "af_badge_context");
        A0e.A9F("total_badge_count", Long.valueOf(j + j2));
        A0e.Cgf();
        return true;
    }

    public static final C68098N0m A00(AnonymousClass6BJ r3) {
        long j;
        Long A10;
        0bb r2 = new 0bb();
        r2.A05("occamadillo_thread_id", Long.valueOf(r3.A02));
        String str = r3.A0B;
        if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        r2.A05("armadillo_thread_id", Long.valueOf(j));
        r2.A06("open_thread_id", r3.A0H);
        r2.A07("feature_tags", r3.A0N);
        r2.A03("is_bg_account", Boolean.valueOf(r3.A0P));
        r2.A05("mitrace_id", r3.A09);
        r2.A06("otid", r3.A0I);
        return r2;
    }

    public static final C68099N0n A01(AnonymousClass6BJ r6) {
        String str;
        0bb r4 = new 0bb();
        r4.A01(C46327Dbv.PUSH, "notification_channel");
        r4.A05("recipient_ig_id", Long.valueOf(r6.A03));
        r4.A06("ndid", r6.A0F);
        r4.A06("notification_type", r6.A0G);
        r4.A06("trace_id", r6.A0M);
        Long l = r6.A0A;
        if (l != null) {
            r4.A05("sender_ig_id", l);
        }
        String str2 = r6.A0K;
        int i = 0;
        if ((str2 == null || str2.length() == 0) && !"direct_v2_delete_item".equals(r6.A0D)) {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        if (i != Integer.MIN_VALUE) {
            r4.A00.put("notification_objective", Integer.valueOf(i));
        } else {
            r4.A06("notification_objective", (String) null);
        }
        char c = 0;
        if ((str2 == null || str2.length() == 0) && !"direct_v2_delete_item".equals(r6.A0D)) {
            c = 0;
        }
        int i2 = 1;
        if (c != 0 && (((str = r6.A0C) == null || !00l.A0d(str, "silent_", false)) && r6.A0O)) {
            i2 = 0;
        }
        r4.A00.put("notification_behavior", Integer.valueOf(i2));
        return r4;
    }

    public static final String A02() {
        int ordinal = C64031Cc.A09.ordinal();
        if (ordinal == 0) {
            return "cold";
        }
        if (ordinal == 1) {
            return "luke_warm";
        }
        if (ordinal != 2) {
            return null;
        }
        return "hot";
    }

    public static final String A04(AnonymousClass6BJ r3) {
        if (!00p.A0k(r3.A0C, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, false)) {
            return "instagram";
        }
        if (r3.A0Q) {
            return "direct_private";
        }
        return "direct_open";
    }

    public static final String A05(AnonymousClass6BJ r0) {
        switch (r0.A06.ordinal()) {
            case 1:
                return "amazon";
            case 3:
                return "fbns";
            case 5:
                return "fcm";
            case 6:
                return "msys";
            case 7:
                return "local";
            case 9:
                return BaseJavaModule.METHOD_TYPE_SYNC;
            case 10:
                return "mem";
            case 11:
                return "iris";
            default:
                return "unknown";
        }
    }

    public static final String A06(AnonymousClass6BJ r1) {
        int intValue = r1.A07.intValue();
        if (intValue == 0) {
            return "system";
        }
        if (intValue != 1) {
            return null;
        }
        return "custom_in_app";
    }

    public static final List A07(AnonymousClass6BJ r1) {
        Long A0n = C51971G9r.A0n(0, r1.A0L);
        if (A0n != null) {
            return AnonymousClass7TE.A1I(A0n);
        }
        return 0sn.A00;
    }

    public MYV() {
        AnonymousClass0kM r1 = new AnonymousClass0kM(C61170le.A00);
        r1.A00 = DbS.A0O("ig_push_notifications");
        this.A00 = r1.A00();
    }

    public static String A03(0Aj r2, AnonymousClass6BJ r3) {
        r2.AAK(A01(r3), AnonymousClass000.A00(1621));
        r2.AAJ("landing_path", r3.A0E);
        return A05(r3);
    }

    public final void A08(AnonymousClass6BJ r4, String str) {
        if (MYW.A00().booleanValue()) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_notification_suppressed");
            if (A0e.isSampled()) {
                A0e.AAJ("push_type", A03(A0e, r4));
                C66583MXo.A15(A0e, r4, "reason", str);
                A0e.AAJ("platform", A04(r4));
                A0e.AAK(A00(r4), "messaging_data");
                A0e.AAe("push_token_fbid", A07(r4));
                A0e.AAe("push_token_fbid", A07(r4));
                A0e.AAJ("push_infra_notif_id", r4.A0J);
                A0e.Cgf();
            }
        }
    }

    public final void A09(AnonymousClass6BJ r5, List list) {
        if (MYW.A00().booleanValue()) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_notification_clicked");
            if (A0e.isSampled()) {
                C370478wX A002 = C370458wV.A00.A00(list);
                C66583MXo.A15(A0e, r5, "push_type", A03(A0e, r5));
                A0e.A9F("time_in_push_tray_seconds", Long.valueOf(r5.A04));
                C66583MXo.A14(A0e, r5);
                A0e.AAK(A002, "push_tray_state");
                A0e.Cgf();
            }
        }
    }

    public final void A0A(AnonymousClass6BJ r5, List list) {
        if (MYW.A00().booleanValue()) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_notification_will_display");
            if (A0e.isSampled()) {
                C370478wX A002 = C370458wV.A00.A00(list);
                C66583MXo.A15(A0e, r5, "push_type", A03(A0e, r5));
                C66583MXo.A14(A0e, r5);
                A0e.AAK(A002, "push_tray_state");
                A0e.Cgf();
            }
        }
    }
}
