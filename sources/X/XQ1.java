package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class XQ1 extends C263934Nx {
    public final void A00(C58840Ae r13) {
        boolean z;
        0qQ.A0B(r13, 0);
        0Aj A0d = C51969G9p.A0d(r13, AnonymousClass000.A00(4191));
        if (A0d.isSampled()) {
            AnonymousClass4O3 r4 = this.A06;
            Long l = null;
            if (r4 != null) {
                boolean z2 = false;
                int A0A = AnonymousClass7TG.A0A(r4.A0Y);
                String str = r4.A10;
                if (str == null) {
                    str = "0";
                }
                C263944Ny r8 = r4.A00;
                if (r8 == null) {
                    r8 = new C263944Ny(C51971G9r.A0m());
                }
                String str2 = r4.A1I;
                int i = r4.A0L;
                if (i == null) {
                    i = 0;
                }
                int i2 = r4.A0J;
                if (i2 == null) {
                    i2 = 0;
                }
                Integer num = r4.A0U;
                if (num != null && num.intValue() == 1) {
                    z2 = true;
                }
                C51965G9l.A1I(A0d, str);
                A0d.AAE(r8, "a_pk");
                A0d.A9F("seq_num", DbV.A0p(A0d, "a_i", str2, A0A));
                C21055XCg.A1H(A0d, C51968G9o.A0v(i), i2, "loop_count");
                A0d.A8D(TraceFieldType.RetryCount, C21053XCe.A0Z(r4.A0M));
                A0d.A8D(TraceFieldType.Duration, C21053XCe.A0Z(r4.A0I));
                A0d.AAJ("tracking_token", r4.A1H);
                A0d.AAJ("video_type", r4.A1L);
                A0d.AAJ("upload_id", r4.A1J);
                A0d.AAJ("parent_m_pk", r4.A15);
                A0d.AAJ("representation_id", r4.A1C);
                A0d.A9F("m_ts", r4.A0f);
                A0d.AAJ("follow_status", r4.A0v);
                A0d.A9F("m_ix", C21054XCf.A07(r4.A0S));
                A0d.A8D("time", C21053XCe.A0Z(r4.A0H));
                A0d.A8D("timeAsPercent", r4.A0D);
                A0d.A7p("playing_audio", r4.A04);
                A0d.A8D(C273654mx.A00(2117), C21053XCe.A0Z(r4.A0G));
                A0d.A8D("system_volume", (Double) null);
                Long l2 = null;
                A0d.A9F("carousel_index", (Long) null);
                A0d.AAJ("carousel_media_id", (String) null);
                A0d.A9F("carousel_media_type", (Long) null);
                A0d.A9F("carousel_size", (Long) null);
                A0d.AAJ("carousel_cover_media_id", (String) null);
                A0d.AAJ("chaining_session_id", r4.A0p);
                A0d.AAJ("viewer_session_id", r4.A1M);
                Integer num2 = r4.A0c;
                if (num2 != null) {
                    l2 = C51969G9p.A0r(num2);
                }
                A0d.A9F("video_width", l2);
                A0d.A9F(C273654mx.A00(424), C21054XCf.A07(r4.A0a));
                A0d.A9F("recent_bandwidth", C21054XCf.A07(r4.A0W));
                A0d.A9F("is_dash_eligible", C21054XCf.A07(r4.A0T));
                A0d.AAJ("playback_format", r4.A16);
                A0d.AAJ("video_codec", r4.A1K);
                A0d.A7p("is_replay", (Boolean) null);
                A0d.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) null);
                A0d.AAJ("audience", r4.A0h);
                A0d.AAJ("effect_id", r4.A0t);
                A0d.AAJ("channel_pk", r4.A0r);
                A0d.AAJ("ranking_info_token", r4.A1A);
                A0d.AAJ("mezql_token", r4.A11);
                A0d.AAJ(AnonymousClass000.A00(77), r4.A0s);
                A0d.AAJ(AnonymousClass000.A00(4551), r4.A0o);
                A0d.A7p("is_video_to_carousel", r4.A09);
                A0d.AAJ("connection_type", r4.A0q);
                A0d.A8D("device_lat", r4.A0B);
                A0d.A8D("device_long", r4.A0C);
                A0d.AAJ("error_message", r4.A0u);
                A0d.AAJ("hardware_address", r4.A0m);
                A0d.AAJ("original_start_reason", r4.A14);
                A0d.A7p("pip", Boolean.valueOf(z2));
                A0d.AAJ("random_session_id", r4.A18);
                A0d.AAJ("reason", r4.A1B);
                A0d.A9F("recent_bandwidth", C21054XCf.A07(r4.A0W));
                A0d.A9F("segment_count", C21054XCf.A07(r4.A0b));
                A0d.A8D("view_height", C21053XCe.A0Z(r4.A0P));
                A0d.A8D("view_width", C21053XCe.A0Z(r4.A0Q));
                A0d.AAJ("nav_chain", r4.A13);
                z = true;
            } else {
                z = false;
            }
            AnonymousClass4OC r5 = this.A07;
            if (r5 != null) {
                if (z) {
                    A0d.A9F("reel_position", C21054XCf.A07(r5.A0K));
                    A0d.A9F("reel_size", C21054XCf.A07(r5.A0L));
                    A0d.A7p("is_replay", r5.A03);
                    A0d.AAJ("host_video_pk", (String) null);
                    A0d.A9F("session_reel_counter", C21054XCf.A07(r5.A0A));
                    A0d.AAJ("tray_session_id", r5.A0a);
                    A0d.A9F("tray_position", C21054XCf.A07(r5.A0N));
                    A0d.A9F("mqtt_connection_status", C21054XCf.A07(r5.A0H));
                    A0d.A9F("battery_level", C21054XCf.A07(r5.A06));
                    A0d.AAJ("battery_status", r5.A0Q);
                    A0d.A9F("live_donation", C21054XCf.A07(r5.A0E));
                    A0d.A9F("number_of_qualities", C21054XCf.A07(r5.A0J));
                    A0d.A9F("is_live_streaming", C21054XCf.A07(r5.A0F));
                    A0d.A9F(C273654mx.A00(2428), C21054XCf.A07(r5.A0C));
                    A0d.A9F(C273654mx.A00(2432), C21054XCf.A07(r5.A0D));
                    A0d.AAJ("channel_id", (String) null);
                    A0d.AAJ(C273654mx.A00(68), (String) null);
                    A0d.AAJ("subtype", r5.A0Z);
                    A0d.AAJ("position", r5.A0V);
                    A0d.AAJ("size", r5.A0W);
                    A0d.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A0P);
                    A0d.A9F("carousel_index", C21054XCf.A07(r5.A07));
                    A0d.AAJ("carousel_media_id", r5.A0S);
                    A0d.AAJ("carousel_cover_media_id", r5.A0R);
                    A0d.A9F("carousel_size", C21054XCf.A07(r5.A09));
                    A0d.A9F("carousel_m_t", C21054XCf.A07(r5.A08));
                }
                0bb r6 = new 0bb();
                r6.A06(C273654mx.A00(159), (String) null);
                r6.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
                r6.A06("surface", (String) null);
                r6.A06("component_type", (String) null);
                r6.A03("was_live", (Boolean) null);
                r6.A05("video_x_position", (Long) null);
                r6.A05("video_y_position", (Long) null);
                r6.A06(C273654mx.A00(94), (String) null);
                r6.A03("captions_available", r5.A04);
                r6.A03("captions_displayed", r5.A05);
                Long A0j = C51972G9s.A0j(r5.A0Y);
                Long A0j2 = C51972G9s.A0j(r5.A0X);
                r6.A05(C273654mx.A00(972), A0j);
                r6.A05(C273654mx.A00(971), A0j2);
                if (z) {
                    A0d.AAK(r6, "adhoc_data");
                }
                AnonymousClass4O3 r0 = this.A06;
                if (r0 == null || r0.A16 == null) {
                    if (z) {
                        A0d.AAJ("playback_format", r5.A0U);
                        Integer num3 = r5.A0B;
                        if (num3 != null) {
                            l = C51969G9p.A0r(num3);
                        }
                        A0d.A9F("is_dash_eligible", l);
                        A0d.Cgf();
                    }
                    return;
                }
            }
            if (!z) {
                return;
            }
            A0d.Cgf();
        }
    }
}
