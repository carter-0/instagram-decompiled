package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.6Kr  reason: invalid class name and case insensitive filesystem */
public final class C306076Kr extends C263934Nx {
    public final void A00(C58840Ae r10) {
        boolean z;
        String str;
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
        Double d;
        String str2;
        Long l16;
        Long l17;
        Long l18;
        0qQ.A0B(r10, 0);
        0wc r102 = (0wc) r10;
        0Aj A00 = r102.A00(r102.A00, "video_audio_enabled");
        if (A00.isSampled()) {
            AnonymousClass4O3 r6 = this.A06;
            boolean z2 = true;
            Long l19 = null;
            if (r6 != null) {
                Integer num = r6.A0Y;
                if (num != null) {
                    A00.A9F("seq_num", Long.valueOf((long) num.intValue()));
                    String str3 = r6.A10;
                    if (str3 == null) {
                        str3 = "0";
                    }
                    A00.AAJ("m_pk", str3);
                    C263944Ny r3 = r6.A00;
                    long j = 0;
                    if (r3 == null) {
                        r3 = new C263944Ny(0L);
                    }
                    A00.AAE(r3, "a_pk");
                    Float f = r6.A0L;
                    if (f != null) {
                        A00.A8D("loop_count", Double.valueOf((double) f.floatValue()));
                        if (0qQ.A0K(r6.A05, true)) {
                            j = 1;
                        }
                        A00.A9F("audio_fetched", Long.valueOf(j));
                        Float f2 = r6.A0I;
                        if (f2 != null) {
                            d = Double.valueOf((double) f2.floatValue());
                        } else {
                            d = null;
                        }
                        A00.A8D(TraceFieldType.Duration, d);
                        A00.AAJ("follow_status", r6.A0v);
                        Integer num2 = r6.A0T;
                        if (num2 != null) {
                            str2 = num2.toString();
                        } else {
                            str2 = null;
                        }
                        A00.A7p("is_dash_eligible", Boolean.valueOf(Boolean.parseBoolean(str2)));
                        A00.A7p("is_video_to_carousel", r6.A09);
                        Integer num3 = r6.A0S;
                        if (num3 != null) {
                            l16 = Long.valueOf((long) num3.intValue());
                        } else {
                            l16 = null;
                        }
                        A00.A9F("m_ix", l16);
                        A00.A9F("m_ts", r6.A0f);
                        Double d2 = null;
                        A00.A8D("system_volume", (Double) null);
                        A00.AAJ("playback_format", r6.A16);
                        A00.A7p("playing_audio", r6.A04);
                        A00.AAJ("source", r6.A0l);
                        Float f3 = r6.A0H;
                        if (f3 != null) {
                            d2 = Double.valueOf((double) f3.floatValue());
                        }
                        A00.A8D("time", d2);
                        A00.A8D("timeAsPercent", r6.A0D);
                        A00.AAJ("tracking_token", r6.A1H);
                        A00.AAJ("video_codec", r6.A1K);
                        A00.AAJ("video_type", r6.A1L);
                        Integer num4 = r6.A0c;
                        if (num4 != null) {
                            l17 = Long.valueOf((long) num4.intValue());
                        } else {
                            l17 = null;
                        }
                        A00.A9F("video_width", l17);
                        A00.AAJ("viewer_session_id", r6.A1M);
                        A00.AAJ("chaining_session_id", r6.A0p);
                        Integer num5 = r6.A0W;
                        if (num5 != null) {
                            l18 = Long.valueOf((long) num5.intValue());
                        } else {
                            l18 = null;
                        }
                        A00.A9F("recent_bandwidth", l18);
                        A00.AAJ("a_i", r6.A1I);
                        A00.AAJ("nav_chain", r6.A13);
                        z = true;
                    } else {
                        throw new IllegalStateException("loopCount should not be null.");
                    }
                } else {
                    throw new IllegalStateException("seqNum should not be null.");
                }
            } else {
                z = false;
            }
            AnonymousClass4OC r62 = this.A07;
            if (r62 != null) {
                if (z) {
                    Integer num6 = r62.A0K;
                    if (num6 != null) {
                        l2 = Long.valueOf((long) num6.intValue());
                    } else {
                        l2 = null;
                    }
                    A00.A9F("reel_position", l2);
                    Integer num7 = r62.A0L;
                    if (num7 != null) {
                        l3 = Long.valueOf((long) num7.intValue());
                    } else {
                        l3 = null;
                    }
                    A00.A9F("reel_size", l3);
                    A00.A7p("is_replay", r62.A03);
                    A00.AAJ("host_video_pk", (String) null);
                    Integer num8 = r62.A0A;
                    if (num8 != null) {
                        l4 = Long.valueOf((long) num8.intValue());
                    } else {
                        l4 = null;
                    }
                    A00.A9F("session_reel_counter", l4);
                    A00.AAJ("tray_session_id", r62.A0a);
                    Integer num9 = r62.A0N;
                    if (num9 != null) {
                        l5 = Long.valueOf((long) num9.intValue());
                    } else {
                        l5 = null;
                    }
                    A00.A9F("tray_position", l5);
                    Integer num10 = r62.A0H;
                    if (num10 != null) {
                        l6 = Long.valueOf((long) num10.intValue());
                    } else {
                        l6 = null;
                    }
                    A00.A9F("mqtt_connection_status", l6);
                    Integer num11 = r62.A06;
                    if (num11 != null) {
                        l7 = Long.valueOf((long) num11.intValue());
                    } else {
                        l7 = null;
                    }
                    A00.A9F("battery_level", l7);
                    A00.AAJ("battery_status", r62.A0Q);
                    Integer num12 = r62.A0E;
                    if (num12 != null) {
                        l8 = Long.valueOf((long) num12.intValue());
                    } else {
                        l8 = null;
                    }
                    A00.A9F("live_donation", l8);
                    Integer num13 = r62.A0J;
                    if (num13 != null) {
                        l9 = Long.valueOf((long) num13.intValue());
                    } else {
                        l9 = null;
                    }
                    A00.A9F("number_of_qualities", l9);
                    Integer num14 = r62.A0F;
                    if (num14 != null) {
                        l10 = Long.valueOf((long) num14.intValue());
                    } else {
                        l10 = null;
                    }
                    A00.A9F("is_live_streaming", l10);
                    Integer num15 = r62.A0C;
                    if (num15 != null) {
                        l11 = Long.valueOf((long) num15.intValue());
                    } else {
                        l11 = null;
                    }
                    A00.A9F("has_igtv_video", l11);
                    Integer num16 = r62.A0D;
                    if (num16 != null) {
                        l12 = Long.valueOf((long) num16.intValue());
                    } else {
                        l12 = null;
                    }
                    A00.A9F("has_reshared_clips_video", l12);
                    A00.AAJ("channel_id", (String) null);
                    A00.AAJ("channel_type", (String) null);
                    A00.AAJ("channel_session_id", (String) null);
                    A00.AAJ("subtype", r62.A0Z);
                    A00.AAJ("position", r62.A0V);
                    A00.AAJ("size", r62.A0W);
                    A00.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r62.A0P);
                    Integer num17 = r62.A07;
                    if (num17 != null) {
                        l13 = Long.valueOf((long) num17.intValue());
                    } else {
                        l13 = null;
                    }
                    A00.A9F("carousel_index", l13);
                    A00.AAJ("carousel_media_id", r62.A0S);
                    A00.AAJ("carousel_cover_media_id", r62.A0R);
                    Integer num18 = r62.A09;
                    if (num18 != null) {
                        l14 = Long.valueOf((long) num18.intValue());
                    } else {
                        l14 = null;
                    }
                    A00.A9F("carousel_size", l14);
                    Integer num19 = r62.A08;
                    if (num19 != null) {
                        l15 = Long.valueOf((long) num19.intValue());
                    } else {
                        l15 = null;
                    }
                    A00.A9F("carousel_m_t", l15);
                    A00.A7p("video_subtitles_available", r62.A04);
                    A00.A7p("video_subtitles_displayed", r62.A05);
                }
                0bb r7 = new 0bb();
                r7.A06("igtv_destination_session_id", (String) null);
                r7.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
                r7.A06("surface", (String) null);
                r7.A06("component_type", (String) null);
                r7.A03("was_live", (Boolean) null);
                r7.A05("video_x_position", (Long) null);
                r7.A05("video_y_position", (Long) null);
                r7.A06("source_channel_type", (String) null);
                r7.A03("captions_available", r62.A04);
                r7.A03("captions_displayed", r62.A05);
                String str4 = r62.A0Y;
                if (str4 != null) {
                    l = 00y.A0n(10, str4);
                } else {
                    l = null;
                }
                String str5 = r62.A0X;
                if (str5 != null) {
                    l19 = 00y.A0n(10, str5);
                }
                r7.A05("story_preview_media_owner_id", l);
                r7.A05("story_preview_media_id", l19);
                if (z) {
                    A00.AAK(r7, "adhoc_data");
                }
                AnonymousClass4O3 r0 = this.A06;
                if (r0 == null || r0.A16 == null) {
                    Integer num20 = r62.A0B;
                    if (num20 == null || num20.intValue() != 1) {
                        z2 = false;
                    }
                    if (z) {
                        A00.AAJ("playback_format", r62.A0U);
                        A00.A7p("is_dash_eligible", Boolean.valueOf(z2));
                    }
                }
            }
            AnonymousClass4O3 r02 = this.A06;
            if (r02 == null || (str = r02.A0x) == null) {
                if (!z) {
                    return;
                }
            } else if (z) {
                A00.A9F("host_profile_id", Long.valueOf(Long.parseLong(str)));
            } else {
                return;
            }
            A00.Cgf();
        }
    }
}
