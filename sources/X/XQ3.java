package X;

import com.facebook.proxygen.TraceFieldType;

public final class XQ3 extends C263934Nx {
    public final void A00(C58840Ae r8) {
        boolean z;
        0qQ.A0B(r8, 0);
        0Aj A0d = C51969G9p.A0d(r8, AnonymousClass000.A00(1925));
        if (A0d.isSampled()) {
            AnonymousClass4O3 r2 = this.A06;
            if (r2 != null) {
                Integer num = r2.A0Y;
                if (num != null) {
                    A0d.A9F("seq_num", C51969G9p.A0r(num));
                    String str = r2.A10;
                    if (str == null) {
                        str = "0";
                    }
                    C51965G9l.A1I(A0d, str);
                    C263944Ny r1 = r2.A00;
                    long j = 0;
                    if (r1 == null) {
                        r1 = new C263944Ny(0L);
                    }
                    A0d.AAE(r1, "a_pk");
                    A0d.AAJ("a_i", r2.A1I);
                    Float f = r2.A0N;
                    if (f != null) {
                        A0d.A8D("from_time", Double.valueOf((double) f.floatValue()));
                        if (AnonymousClass7TF.A1Y(r2.A05, true)) {
                            j = 1;
                        }
                        A0d.A9F("audio_fetched", Long.valueOf(j));
                        A0d.AAJ("channel_pk", r2.A0r);
                        A0d.A8D(TraceFieldType.Duration, C21053XCe.A0Z(r2.A0I));
                        A0d.AAJ("follow_status", r2.A0v);
                        A0d.A9F("is_dash_eligible", C21054XCf.A07(r2.A0T));
                        A0d.A7p("is_video_to_carousel", r2.A09);
                        A0d.A8D("loop_count", C21053XCe.A0Z(r2.A0L));
                        A0d.A8D("lsp", C21053XCe.A0Z(r2.A0J));
                        A0d.A9F("m_ts", r2.A0f);
                        A0d.AAJ("playback_format", r2.A16);
                        A0d.AAJ("playing_audio", String.valueOf(r2.A04));
                        A0d.A8D("time", C21053XCe.A0Z(r2.A0H));
                        A0d.A8D("to_time", C21053XCe.A0Z(r2.A0O));
                        A0d.AAJ("tracking_token", r2.A1H);
                        A0d.AAJ("video_codec", r2.A1K);
                        A0d.AAJ("video_type", r2.A1L);
                        A0d.AAJ("viewer_session_id", r2.A1M);
                        A0d.AAJ("chaining_session_id", r2.A0p);
                        A0d.A9F("recent_bandwidth", C21054XCf.A07(r2.A0W));
                        A0d.A9F("video_width", C21054XCf.A07(r2.A0c));
                        A0d.AAJ("channel_pk", r2.A0r);
                        A0d.AAJ("nav_chain", r2.A13);
                        A0d.AAJ("seek_reason", r2.A1F);
                        z = true;
                    } else {
                        throw AnonymousClass7TE.A0z("seekFromPositionSeconds should not be null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z(C273654mx.A00(953));
                }
            } else {
                z = false;
            }
            AnonymousClass4OC r3 = this.A07;
            if (r3 != null) {
                0bb r22 = new 0bb();
                r22.A03("captions_available", r3.A04);
                r22.A03("captions_displayed", r3.A05);
                r22.A05("video_x_position", (Long) null);
                r22.A05("video_y_position", (Long) null);
                r22.A03("was_live", (Boolean) null);
                if (z) {
                    A0d.AAK(r22, "adhoc_data");
                } else {
                    return;
                }
            } else if (!z) {
                return;
            }
            A0d.Cgf();
        }
    }
}
