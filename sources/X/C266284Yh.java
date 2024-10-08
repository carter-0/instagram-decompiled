package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.4Yh  reason: invalid class name and case insensitive filesystem */
public final class C266284Yh extends C263934Nx {
    public final void A00(C58840Ae r12) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Double d;
        Double d2;
        Double d3;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        String str;
        String str2;
        String str3;
        String str4;
        Long l22;
        Long l23;
        0qQ.A0B(r12, 0);
        0wc r122 = (0wc) r12;
        0Aj A00 = r122.A00(r122.A00, "video_format_changed");
        if (A00.isSampled()) {
            AnonymousClass4O3 r3 = this.A06;
            Long l24 = null;
            if (r3 != null) {
                Integer num = r3.A0Y;
                if (num != null) {
                    int intValue = num.intValue();
                    String str5 = r3.A10;
                    if (str5 == null) {
                        str5 = "0";
                    }
                    C263944Ny r7 = r3.A00;
                    if (r7 == null) {
                        r7 = new C263944Ny(0L);
                    }
                    String str6 = r3.A1I;
                    int i = r3.A0J;
                    if (i == null) {
                        i = 0;
                    }
                    A00.A9F("seq_num", Long.valueOf((long) intValue));
                    A00.AAJ("m_pk", str5);
                    A00.A9F("a_pk", r7.A00);
                    A00.AAJ("a_i", str6);
                    Float f = r3.A0H;
                    if (f != null) {
                        d = Double.valueOf((double) f.floatValue());
                    } else {
                        d = null;
                    }
                    A00.A8D("time", d);
                    A00.A8D("lsp", Double.valueOf(i.doubleValue()));
                    Float f2 = r3.A0L;
                    if (f2 != null) {
                        d2 = Double.valueOf((double) f2.floatValue());
                    } else {
                        d2 = null;
                    }
                    A00.A8D("loop_count", d2);
                    Float f3 = r3.A0I;
                    if (f3 != null) {
                        d3 = Double.valueOf((double) f3.floatValue());
                    } else {
                        d3 = null;
                    }
                    A00.A8D(TraceFieldType.Duration, d3);
                    A00.AAJ("tracking_token", r3.A1H);
                    A00.AAJ("video_type", r3.A1L);
                    A00.AAJ("upload_id", r3.A1J);
                    A00.AAJ("parent_m_pk", r3.A15);
                    A00.AAJ("representation_id", r3.A1C);
                    A00.AAJ("audio_representation_id", r3.A0k);
                    A00.A9F("m_ts", r3.A0f);
                    A00.AAJ("follow_status", r3.A0v);
                    Integer num2 = r3.A0S;
                    if (num2 != null) {
                        l17 = Long.valueOf((long) num2.intValue());
                    } else {
                        l17 = null;
                    }
                    A00.A9F("m_ix", l17);
                    A00.A8D("timeAsPercent", r3.A0D);
                    A00.A7p("playing_audio", r3.A04);
                    A00.A8D("system_volume", (Double) null);
                    Long l25 = null;
                    A00.A9F("carousel_index", (Long) null);
                    A00.AAJ("carousel_media_id", (String) null);
                    A00.A9F("carousel_media_type", (Long) null);
                    A00.A9F("carousel_size", (Long) null);
                    A00.AAJ("carousel_cover_media_id", (String) null);
                    A00.AAJ("chaining_session_id", r3.A0p);
                    A00.AAJ("viewer_session_id", r3.A1M);
                    Integer num3 = r3.A0c;
                    if (num3 != null) {
                        l25 = Long.valueOf((long) num3.intValue());
                    }
                    A00.A9F("video_width", l25);
                    Integer num4 = r3.A0a;
                    if (num4 != null) {
                        l18 = Long.valueOf((long) num4.intValue());
                    } else {
                        l18 = null;
                    }
                    A00.A9F("video_height", l18);
                    Float f4 = r3.A0E;
                    if (f4 != null) {
                        l19 = Long.valueOf((long) f4.floatValue());
                    } else {
                        l19 = null;
                    }
                    A00.A9F(TraceFieldType.Bitrate, l19);
                    A00.AAJ("mime_type", r3.A12);
                    Integer num5 = r3.A0W;
                    if (num5 != null) {
                        l20 = Long.valueOf((long) num5.intValue());
                    } else {
                        l20 = null;
                    }
                    A00.A9F("recent_bandwidth", l20);
                    Integer num6 = r3.A0T;
                    if (num6 != null) {
                        l21 = Long.valueOf((long) num6.intValue());
                    } else {
                        l21 = null;
                    }
                    A00.A9F("is_dash_eligible", l21);
                    A00.AAJ("playback_format", r3.A16);
                    A00.AAJ("video_codec", r3.A1K);
                    A00.A7p("is_replay", (Boolean) null);
                    A00.AAJ("audience", r3.A0h);
                    A00.AAJ("effect_id", r3.A0t);
                    A00.AAJ("channel_pk", r3.A0r);
                    A00.AAJ("ranking_info_token", r3.A1A);
                    A00.AAJ("mezql_token", r3.A11);
                    A00.AAJ("discovery_session_id", r3.A0s);
                    A00.AAJ("camera_session_id", r3.A0o);
                    A00.A7p("is_video_to_carousel", r3.A09);
                    A00.AAJ("connection_type", r3.A0q);
                    A00.A8D("device_lat", r3.A0B);
                    A00.A8D("device_long", r3.A0C);
                    A00.AAJ("hardware_address", r3.A0m);
                    HashMap hashMap = r3.A1Q;
                    if (hashMap != null) {
                        str = (String) hashMap.get("is_network_roaming");
                    } else {
                        str = null;
                    }
                    A00.AAJ("is_network_roaming", str);
                    HashMap hashMap2 = r3.A1Q;
                    if (hashMap2 != null) {
                        str2 = (String) hashMap2.get("network_generation");
                    } else {
                        str2 = null;
                    }
                    A00.AAJ("network_generation", str2);
                    HashMap hashMap3 = r3.A1Q;
                    if (hashMap3 != null) {
                        str3 = (String) hashMap3.get("network_params");
                    } else {
                        str3 = null;
                    }
                    A00.AAJ("network_params", str3);
                    HashMap hashMap4 = r3.A1Q;
                    if (hashMap4 != null) {
                        str4 = (String) hashMap4.get("network_type_info");
                    } else {
                        str4 = null;
                    }
                    A00.AAJ("network_type_info", str4);
                    A00.AAJ("random_session_id", r3.A18);
                    Integer num7 = r3.A0W;
                    if (num7 != null) {
                        l22 = Long.valueOf((long) num7.intValue());
                    } else {
                        l22 = null;
                    }
                    A00.A9F("recent_bandwidth", l22);
                    Integer num8 = r3.A0b;
                    if (num8 != null) {
                        l23 = Long.valueOf((long) num8.intValue());
                    } else {
                        l23 = null;
                    }
                    A00.A9F("segment_count", l23);
                    A00.AAJ("nav_chain", r3.A13);
                    z = true;
                } else {
                    throw new IllegalStateException("seqNum number should not be null.");
                }
            } else {
                z = false;
            }
            AnonymousClass4OC r5 = this.A07;
            if (r5 != null) {
                if (z) {
                    Integer num9 = r5.A0K;
                    if (num9 != null) {
                        l3 = Long.valueOf((long) num9.intValue());
                    } else {
                        l3 = null;
                    }
                    A00.A9F("reel_position", l3);
                    Integer num10 = r5.A0L;
                    if (num10 != null) {
                        l4 = Long.valueOf((long) num10.intValue());
                    } else {
                        l4 = null;
                    }
                    A00.A9F("reel_size", l4);
                    A00.A7p("is_replay", r5.A03);
                    A00.AAJ("host_video_pk", (String) null);
                    Integer num11 = r5.A0A;
                    if (num11 != null) {
                        l5 = Long.valueOf((long) num11.intValue());
                    } else {
                        l5 = null;
                    }
                    A00.A9F("session_reel_counter", l5);
                    A00.AAJ("tray_session_id", r5.A0a);
                    Integer num12 = r5.A0N;
                    if (num12 != null) {
                        l6 = Long.valueOf((long) num12.intValue());
                    } else {
                        l6 = null;
                    }
                    A00.A9F("tray_position", l6);
                    Integer num13 = r5.A0H;
                    if (num13 != null) {
                        l7 = Long.valueOf((long) num13.intValue());
                    } else {
                        l7 = null;
                    }
                    A00.A9F("mqtt_connection_status", l7);
                    Integer num14 = r5.A06;
                    if (num14 != null) {
                        l8 = Long.valueOf((long) num14.intValue());
                    } else {
                        l8 = null;
                    }
                    A00.A9F("battery_level", l8);
                    A00.AAJ("battery_status", r5.A0Q);
                    Integer num15 = r5.A0E;
                    if (num15 != null) {
                        l9 = Long.valueOf((long) num15.intValue());
                    } else {
                        l9 = null;
                    }
                    A00.A9F("live_donation", l9);
                    Integer num16 = r5.A0J;
                    if (num16 != null) {
                        l10 = Long.valueOf((long) num16.intValue());
                    } else {
                        l10 = null;
                    }
                    A00.A9F("number_of_qualities", l10);
                    Integer num17 = r5.A0F;
                    if (num17 != null) {
                        l11 = Long.valueOf((long) num17.intValue());
                    } else {
                        l11 = null;
                    }
                    A00.A9F("is_live_streaming", l11);
                    Integer num18 = r5.A0C;
                    if (num18 != null) {
                        l12 = Long.valueOf((long) num18.intValue());
                    } else {
                        l12 = null;
                    }
                    A00.A9F("has_igtv_video", l12);
                    Integer num19 = r5.A0D;
                    if (num19 != null) {
                        l13 = Long.valueOf((long) num19.intValue());
                    } else {
                        l13 = null;
                    }
                    A00.A9F("has_reshared_clips_video", l13);
                    A00.AAJ("channel_id", (String) null);
                    A00.AAJ("channel_type", (String) null);
                    A00.AAJ("subtype", r5.A0Z);
                    A00.AAJ("position", r5.A0V);
                    A00.AAJ("size", r5.A0W);
                    A00.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A0P);
                    Integer num20 = r5.A07;
                    if (num20 != null) {
                        l14 = Long.valueOf((long) num20.intValue());
                    } else {
                        l14 = null;
                    }
                    A00.A9F("carousel_index", l14);
                    A00.AAJ("carousel_media_id", r5.A0S);
                    A00.AAJ("carousel_cover_media_id", r5.A0R);
                    Integer num21 = r5.A09;
                    if (num21 != null) {
                        l15 = Long.valueOf((long) num21.intValue());
                    } else {
                        l15 = null;
                    }
                    A00.A9F("carousel_size", l15);
                    Integer num22 = r5.A08;
                    if (num22 != null) {
                        l16 = Long.valueOf((long) num22.intValue());
                    } else {
                        l16 = null;
                    }
                    A00.A9F("carousel_m_t", l16);
                }
                0bb r6 = new 0bb();
                r6.A06("igtv_destination_session_id", (String) null);
                r6.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
                r6.A06("surface", (String) null);
                r6.A06("component_type", (String) null);
                r6.A03("was_live", (Boolean) null);
                r6.A05("video_x_position", (Long) null);
                r6.A05("video_y_position", (Long) null);
                r6.A06("source_channel_type", (String) null);
                r6.A03("captions_available", r5.A04);
                r6.A03("captions_displayed", r5.A05);
                String str7 = r5.A0Y;
                if (str7 != null) {
                    l = 00y.A0n(10, str7);
                } else {
                    l = null;
                }
                String str8 = r5.A0X;
                if (str8 != null) {
                    l2 = 00y.A0n(10, str8);
                } else {
                    l2 = null;
                }
                r6.A05("story_preview_media_owner_id", l);
                r6.A05("story_preview_media_id", l2);
                if (z) {
                    A00.AAK(r6, "adhoc_data");
                }
                AnonymousClass4O3 r0 = this.A06;
                if (r0 == null || r0.A16 == null) {
                    if (z) {
                        A00.AAJ("playback_format", r5.A0U);
                        Integer num23 = r5.A0B;
                        if (num23 != null) {
                            l24 = Long.valueOf((long) num23.intValue());
                        }
                        A00.A9F("is_dash_eligible", l24);
                        A00.Cgf();
                    }
                    return;
                }
            }
            if (!z) {
                return;
            }
            A00.Cgf();
        }
    }
}
