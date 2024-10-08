package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.List;

public final class IZ8 implements C21044XAx {
    public boolean A00;
    public final long A01;
    public final long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final 0wc A0A;

    public final void CiJ(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_prefetch_fail");
        if (A0e.isSampled()) {
            A01(A0e, this);
            A0e.AAJ("reason", str);
            A0e.Cgf();
        }
    }

    public static void A00(0Aj r4, IZ8 iz8) {
        r4.A9F("ad_id", Long.valueOf(iz8.A01));
        r4.AAJ("client_session_id", iz8.A05);
        r4.AAJ("ranking_session_id", iz8.A07);
        r4.AAJ("container_module", iz8.A06);
        r4.A8D(AnonymousClass000.A00(269), Double.valueOf((double) System.currentTimeMillis()));
        r4.AAJ("radio_type", "");
        r4.A9F("audio_asset_id", Long.valueOf(iz8.A02));
        r4.AAJ("audio_render_mode", "showreel_not_synced");
    }

    public static void A01(0Aj r4, IZ8 iz8) {
        r4.A9F("ad_id", Long.valueOf(iz8.A01));
        r4.AAJ("client_session_id", iz8.A05);
        r4.AAJ("container_module", iz8.A06);
        r4.A8D(AnonymousClass000.A00(269), Double.valueOf((double) System.currentTimeMillis()));
        r4.A9F("audio_asset_id", Long.valueOf(iz8.A02));
        r4.AAJ("audio_render_mode", "showreel_not_synced");
    }

    public static void A02(0Aj r2, IZ8 iz8) {
        r2.A7p("is_audio_enabled", Boolean.valueOf(iz8.A00));
        r2.A7p("is_fast_start_url_existed", Boolean.valueOf(iz8.A09));
        r2.A9F(TraceFieldType.Duration, iz8.A03);
        r2.A9F(AnonymousClass000.A00(790), iz8.A04);
        r2.AAe("beats", iz8.A08);
        r2.Cgf();
    }

    public final void CiG() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_data_source_prepared");
        if (A0e.isSampled()) {
            A01(A0e, this);
            A0e.Cgf();
        }
    }

    public final void CiH() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_pause");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A02(A0e, this);
        }
    }

    public final void CiI() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_player_release");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A0e.A9F("audio_repeat_count", C51971G9r.A0m());
            A02(A0e, this);
        }
    }

    public final void CiK() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_prefetch_start");
        if (A0e.isSampled()) {
            A01(A0e, this);
            A0e.Cgf();
        }
    }

    public final void CiL() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_prefetch_success");
        if (A0e.isSampled()) {
            A01(A0e, this);
            A0e.Cgf();
        }
    }

    public final void CiM(double d, double d2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_progress_1_sec");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A0e.A8D("audio_progress", Double.valueOf(d));
            A0e.A8D("animation_progress", Double.valueOf(d2));
            A02(A0e, this);
        }
    }

    public final void CiN(double d, double d2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_progress_5_sec");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A0e.A8D("audio_progress", Double.valueOf(d));
            A0e.A8D("animation_progress", Double.valueOf(d2));
            A02(A0e, this);
        }
    }

    public final void CiO() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_resume");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A02(A0e, this);
        }
    }

    public final void CiP() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_start_init");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A02(A0e, this);
        }
    }

    public final void CiQ() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_start_play");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A02(A0e, this);
        }
    }

    public final void CiR() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_volume_down");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A0e.A9F("audio_repeat_count", C51971G9r.A0m());
            A02(A0e, this);
        }
    }

    public final void CiS() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0A, "ig_ads_audio_volume_up");
        if (A0e.isSampled()) {
            A00(A0e, this);
            A0e.A9F("audio_repeat_count", C51971G9r.A0m());
            A02(A0e, this);
        }
    }

    public IZ8(0wc r1, Long l, Long l2, String str, String str2, String str3, List list, long j, long j2, boolean z) {
        this.A0A = r1;
        this.A01 = j;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A02 = j2;
        this.A04 = l;
        this.A09 = z;
        this.A03 = l2;
        this.A08 = list;
    }

    public final void EP8(boolean z) {
        this.A00 = z;
    }
}
