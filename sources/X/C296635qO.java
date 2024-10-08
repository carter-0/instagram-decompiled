package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.5qO  reason: invalid class name and case insensitive filesystem */
public final class C296635qO extends C263934Nx {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final 1Xj A06;
    public final boolean A07;

    public final void A00(C58840Ae r11) {
        String str;
        int i;
        1Xj A1c;
        0qQ.A0B(r11, 0);
        0wc r112 = (0wc) r11;
        0Aj A002 = r112.A00(r112.A00, "video_full_viewed_time");
        if (A002.isSampled()) {
            double d = (double) this.A05;
            double d2 = 0.0d;
            if (d > 0.0d) {
                d2 = ((double) this.A02) / d;
            }
            A002.A9F("seq_num", 0L);
            A002.AAJ("m_pk", this.A09);
            A002.A9F("a_pk", this.A04.A00);
            A002.AAJ("a_i", this.A0D);
            String str2 = this.A0C;
            if (str2 == null) {
                str2 = "0";
            }
            A002.AAJ("tracking_token", str2);
            A002.A8D("loop_count", Double.valueOf((double) this.A04));
            A002.A8D("lsp", Double.valueOf(((double) this.A03) / 1000.0d));
            A002.A7p("playing_audio", Boolean.valueOf(this.A07));
            A002.A8D("time", Double.valueOf(((double) this.A02) / 1000.0d));
            A002.A8D("timeAsPercent", Double.valueOf(d2));
            A002.A8D(TraceFieldType.Duration, Double.valueOf(d / 1000.0d));
            String lowerCase = String.valueOf(this.A03).toLowerCase();
            0qQ.A07(lowerCase);
            A002.AAJ("follow_status", lowerCase);
            A002.A9F("is_dash_eligible", Long.valueOf((long) this.A00));
            A002.A9F("m_ix", Long.valueOf((long) this.A01));
            A002.A9F("m_ts", Long.valueOf(this.A02));
            String lowerCase2 = this.A0B.toLowerCase();
            0qQ.A07(lowerCase2);
            A002.AAJ("playback_format", lowerCase2);
            A002.AAJ("video_codec", this.A0E);
            A002.AAJ("video_type", this.A0F);
            A002.A7p("is_video_to_carousel", this.A08);
            A002.AAJ("nav_chain", this.A0A);
            A002.A8D("system_volume", Double.valueOf((double) this.A00));
            1Xj r4 = this.A06;
            if (!(!r4.A5D() || (i = this.A01) == -1 || (A1c = r4.A1c(i)) == null)) {
                A002.A9F("carousel_index", Long.valueOf((long) i));
                A002.AAJ("carousel_media_id", A1c.getId());
                A002.A9F("carousel_m_t", C294185m0.A04(r4, Integer.valueOf(i)));
                if (r4.A1c(0) != null) {
                    A002.AAJ("carousel_cover_media_id", A1c.getId());
                }
                A002.A9F("carousel_size", Long.valueOf((long) r4.A0o()));
                A002.A9F("carousel_media_type", Long.valueOf((long) A1c.BR7().A00));
            }
            AnonymousClass4O3 r0 = this.A06;
            if (!(r0 == null || (str = r0.A0x) == null)) {
                A002.A9F("host_profile_id", 00y.A0n(10, str));
            }
            A002.Cgf();
        }
    }

    public C296635qO(UserSession userSession, 1Xj r2, float f, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(userSession);
        this.A04 = i;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = i3;
        this.A07 = z;
        this.A05 = i4;
        this.A06 = r2;
        this.A01 = i5;
    }
}
