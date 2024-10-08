package X;

import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

public final class LTO {
    public final LoggingData A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;

    public final void A0A(Boolean bool, Boolean bool2, Integer num, String str, Map map) {
        String str2;
        0qQ.A0B(str, 4);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationcreatorsettings_fail");
        if (A0e.isSampled()) {
            LoggingData loggingData = this.A00;
            JTU.A0y(A0e, loggingData.A01);
            0bb r2 = new 0bb();
            A02(r2, loggingData, bool, "view_name", C63035KqQ.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                r2.A06("gifts_enabled", str2);
            }
            if (map != null) {
                r2.A08("total_earnings_in_cents", map);
            }
            A0e.AAK(r2, "event_payload");
            A0e.AAJ("error_message", str);
            JTT.A1A(A0e, 0Yt.A0E());
        }
    }

    public static EZP A00(0bb r2, Integer num, String str, int i) {
        r2.A06("view_name", str);
        r2.A06("target_name", C63034KqP.A00(num));
        if (i != 0) {
            return EZP.ONBOARDED;
        }
        return EZP.NOT_ONBOARDED;
    }

    public static void A01(AnonymousClass0Ac r1, 0Aj r2, 0bb r3, String str) {
        r3.A01(r1, "onboarding_status");
        r3.A06("media_id", str);
        r2.AAK(r3, "event_payload");
        r2.Cgf();
    }

    public static void A03(LTO lto, CreatorLoggingData creatorLoggingData, Integer num, Integer num2) {
        lto.A08(Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), (Boolean) null, (Boolean) null, num, num2, creatorLoggingData.A00, (Map) null, 0Yt.A0E());
    }

    public static final void A04(LTO lto, Integer num, Integer num2, String str, boolean z, boolean z2) {
        0Aj A0e = AnonymousClass7TE.A0e(lto.A02, "user_click_appreciationmediasettings_atomic");
        if (A0e.isSampled()) {
            JTU.A0y(A0e, lto.A00.A01);
            0bb r2 = new 0bb();
            r2.A01(A00(r2, num2, C63035KqQ.A00(num), z ? 1 : 0), "onboarding_status");
            if (str != null) {
                r2.A06("media_id", str);
            }
            A0e.AAK(r2, "event_payload");
            JTT.A1A(A0e, AnonymousClass7TF.A0w("is_sticky", String.valueOf(z2)));
        }
    }

    public static final void A05(LTO lto, Integer num, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(lto.A02, "client_load_appreciationmediasettings_fail");
        if (A0e.isSampled()) {
            JTU.A0y(A0e, lto.A00.A01);
            0bb r1 = new 0bb();
            A01(A00(r1, num, "reels_overflow_menu", z ? 1 : 0), A0e, r1, str);
        }
    }

    public static final void A06(LTO lto, Integer num, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(lto.A02, "client_load_appreciationmediasettings_init");
        if (A0e.isSampled()) {
            JTU.A0y(A0e, lto.A00.A01);
            0bb r1 = new 0bb();
            A01(A00(r1, num, "reels_overflow_menu", z ? 1 : 0), A0e, r1, str);
        }
    }

    public static final void A07(LTO lto, Integer num, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(lto.A02, "client_load_appreciationmediasettings_success");
        if (A0e.isSampled()) {
            JTU.A0y(A0e, lto.A00.A01);
            0bb r1 = new 0bb();
            A01(A00(r1, num, "reels_overflow_menu", z ? 1 : 0), A0e, r1, str);
        }
    }

    public final void A08(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Map map, Map map2, Map map3) {
        EZP ezp;
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "user_click_appreciationcreatorsettings_atomic");
        if (A0e.isSampled()) {
            LoggingData loggingData = this.A00;
            JTU.A0y(A0e, loggingData.A01);
            0bb r2 = new 0bb();
            r2.A06("view_name", C63035KqQ.A00(num));
            A02(r2, loggingData, bool, "target_name", C63034KqP.A00(num2));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r2.A06("gifts_enabled", str);
            }
            if (map != null) {
                r2.A08("total_earnings_in_cents", map);
            }
            if (map2 != null) {
                r2.A08("reel_earnings_in_cents", map2);
            }
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    ezp = EZP.ONBOARDED;
                } else {
                    ezp = EZP.NOT_ONBOARDED;
                }
                r2.A01(ezp, "onboarding_status");
            }
            if (bool4 != null) {
                r2.A03("is_default_on", Boolean.valueOf(bool4.booleanValue()));
            }
            A0e.AAK(r2, "event_payload");
            JTT.A1A(A0e, map3);
        }
    }

    public final void A09(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Map map) {
        EZP ezp;
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationcreatorsettings_init");
        if (A0e.isSampled()) {
            LoggingData loggingData = this.A00;
            JTU.A0y(A0e, loggingData.A01);
            0bb r3 = new 0bb();
            A02(r3, loggingData, bool, "view_name", C63035KqQ.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r3.A06("gifts_enabled", str);
            }
            if (map != null) {
                r3.A08("total_earnings_in_cents", map);
            }
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    ezp = EZP.ONBOARDED;
                } else {
                    ezp = EZP.NOT_ONBOARDED;
                }
                r3.A01(ezp, "onboarding_status");
            }
            if (bool4 != null) {
                r3.A03("is_default_on", Boolean.valueOf(bool4.booleanValue()));
            }
            A0e.AAK(r3, "event_payload");
            JTT.A1A(A0e, 0Yt.A0E());
        }
    }

    public final void A0B(Boolean bool, Boolean bool2, Integer num, Map map) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationcreatorsettings_display");
        if (A0e.isSampled()) {
            LoggingData loggingData = this.A00;
            JTU.A0y(A0e, loggingData.A01);
            0bb r2 = new 0bb();
            A02(r2, loggingData, bool, "view_name", C63035KqQ.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r2.A06("gifts_enabled", str);
            }
            if (map != null) {
                r2.A08("total_earnings_in_cents", map);
            }
            A0e.AAK(r2, "event_payload");
            JTT.A1A(A0e, 0Yt.A0E());
        }
    }

    public final void A0C(Boolean bool, Boolean bool2, Integer num, Map map) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "user_click_appreciationcreatorsettings_exit");
        if (A0e.isSampled()) {
            LoggingData loggingData = this.A00;
            JTU.A0y(A0e, loggingData.A01);
            0bb r2 = new 0bb();
            r2.A06("view_name", C63035KqQ.A00(num));
            A02(r2, loggingData, bool, "target_name", "exit");
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r2.A06("gifts_enabled", str);
            }
            if (map != null) {
                r2.A08("total_earnings_in_cents", map);
            }
            A0e.AAK(r2, "event_payload");
            JTT.A1A(A0e, 0Yt.A0E());
        }
    }

    public final void A0D(Boolean bool, Boolean bool2, Integer num, Map map, Map map2) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationcreatorsettings_success");
        if (A0e.isSampled()) {
            LoggingData loggingData = this.A00;
            JTU.A0y(A0e, loggingData.A01);
            0bb r2 = new 0bb();
            A02(r2, loggingData, bool, "view_name", C63035KqQ.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r2.A06("gifts_enabled", str);
            }
            if (map != null) {
                r2.A08("total_earnings_in_cents", map);
            }
            A0e.AAK(r2, "event_payload");
            JTT.A1A(A0e, map2);
        }
    }

    public LTO(LoggingData loggingData, AnonymousClass0iw r2, 0wc r3) {
        C51972G9s.A1D(loggingData, r3);
        this.A01 = r2;
        this.A00 = loggingData;
        this.A02 = r3;
    }

    public static void A02(0bb r2, LoggingData loggingData, Boolean bool, String str, String str2) {
        r2.A06(str, str2);
        r2.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, loggingData.A00);
        if (bool != null) {
            r2.A03("is_content_appreciation_eligible", Boolean.valueOf(bool.booleanValue()));
        }
    }
}
