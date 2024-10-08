package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Xdn  reason: case insensitive filesystem */
public final class C21521Xdn {
    public static XPM parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            XPM xpm = new XPM();
            16L A11 = r10.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r10.A0z();
                return null;
            }
            while (true) {
                16L A1J = r10.A1J();
                16L r9 = 16L.A09;
                if (A1J == r9) {
                    return xpm;
                }
                String A02 = 16P.A02(r10);
                HashMap hashMap = null;
                if ("upload_url".equals(A02)) {
                    String A0l = AnonymousClass7TG.A0l(r10);
                    0qQ.A0B(A0l, 0);
                    xpm.A0H = A0l;
                } else if ("fbvp_tcp_upload_url".equals(A02)) {
                    String A0l2 = AnonymousClass7TG.A0l(r10);
                    0qQ.A0B(A0l2, 0);
                    xpm.A0F = A0l2;
                } else if ("fbvp_quic_upload_url".equals(A02)) {
                    String A0l3 = AnonymousClass7TG.A0l(r10);
                    0qQ.A0B(A0l3, 0);
                    xpm.A0E = A0l3;
                } else if ("fbvp_fallback_upload_url".equals(A02)) {
                    String A0l4 = AnonymousClass7TG.A0l(r10);
                    0qQ.A0B(A0l4, 0);
                    xpm.A0D = A0l4;
                } else if (TraceFieldType.BroadcastId.equals(A02)) {
                    String A0l5 = AnonymousClass7TG.A0l(r10);
                    0qQ.A0B(A0l5, 0);
                    xpm.A0C = A0l5;
                } else if ("max_allowed_participants".equals(A02)) {
                    xpm.A03 = r10.A1D();
                } else if ("max_time_in_seconds".equals(A02)) {
                    xpm.A0B = r10.A0y();
                } else if ("stream_video_width".equals(A02)) {
                    xpm.A0A = r10.A1D();
                } else if ("stream_video_bit_rate".equals(A02)) {
                    xpm.A08 = r10.A1D();
                } else if ("stream_video_fps".equals(A02)) {
                    xpm.A09 = r10.A1D();
                } else if ("stream_audio_sample_rate".equals(A02)) {
                    xpm.A07 = r10.A1D();
                } else if ("stream_audio_channels".equals(A02)) {
                    xpm.A05 = r10.A1D();
                } else if ("stream_audio_bit_rate".equals(A02)) {
                    xpm.A04 = r10.A1D();
                } else if ("stream_audio_profile".equals(A02)) {
                    xpm.A06 = r10.A1D();
                } else if ("heartbeat_interval".equals(A02)) {
                    r10.A1D();
                } else if ("pass_thru_enabled".equals(A02)) {
                    xpm.A0L = r10.A0d();
                } else if ("display_server_message".equals(A02)) {
                    xpm.A00 = r10.A1D();
                } else if ("live_trace_enabled".equals(A02)) {
                    xpm.A0K = r10.A0d();
                } else if ("live_trace_sample_interval_in_seconds".equals(A02)) {
                    xpm.A01 = r10.A1D();
                } else if ("live_trace_sampling_source".equals(A02)) {
                    xpm.A02 = r10.A1D();
                } else if ("server_abr_enabled".equals(A02)) {
                    xpm.A0M = r10.A0d();
                } else if ("is_premium".equals(A02)) {
                    xpm.A0J = r10.A0d();
                } else if (AnonymousClass000.A00(5005).equals(A02)) {
                    C2816858z.A00(AnonymousClass7TG.A0l(r10));
                } else if ("stream_initial_bitrate_prediction".equals(A02)) {
                    if (r10.A11() == r6) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (r10.A1J() != r9) {
                            String A1P = r10.A1P();
                            r10.A1J();
                            if (r10.A11() == 16L.A0G) {
                                A1E.put(A1P, (Object) null);
                            } else {
                                Double valueOf = Double.valueOf(r10.A0U());
                                if (valueOf != null) {
                                    A1E.put(A1P, valueOf);
                                }
                            }
                        }
                        hashMap = A1E;
                    }
                    0qQ.A0B(hashMap, 0);
                    xpm.A0I = hashMap;
                } else if ("stream_ig_quality_mos".equals(A02)) {
                    String A0l6 = AnonymousClass7TG.A0l(r10);
                    0qQ.A0B(A0l6, 0);
                    xpm.A0G = A0l6;
                } else {
                    1XY.A01(r10, xpm, A02);
                }
                r10.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
