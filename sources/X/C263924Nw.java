package X;

/* renamed from: X.4Nw  reason: invalid class name and case insensitive filesystem */
public final class C263924Nw extends C263934Nx {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r1.intValue() != 1) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C58840Ae r15) {
        /*
            r14 = this;
            r13 = 0
            X.0qQ.A0B(r15, r13)
            java.lang.String r1 = "video_should_start"
            X.0wc r15 = (X.0wc) r15
            X.0kJ r0 = r15.A00
            X.0Aj r5 = r15.A00(r0, r1)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x0468
            X.4O3 r4 = r14.A06
            r8 = 0
            r6 = 1
            r0 = 0
            if (r4 == 0) goto L_0x04b9
            java.lang.Integer r1 = r4.A0Y
            if (r1 == 0) goto L_0x04bc
            int r2 = r1.intValue()
            java.lang.String r10 = r4.A10
            if (r10 != 0) goto L_0x0029
            java.lang.String r10 = "0"
        L_0x0029:
            X.4Ny r9 = r4.A00
            if (r9 != 0) goto L_0x0038
            r11 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            X.4Ny r9 = new X.4Ny
            r9.<init>(r1)
        L_0x0038:
            java.lang.String r7 = r4.A1I
            java.lang.Float r3 = r4.A0L
            if (r3 != 0) goto L_0x0042
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
        L_0x0042:
            java.lang.Integer r1 = r4.A0T
            if (r1 == 0) goto L_0x004d
            int r1 = r1.intValue()
            r11 = 1
            if (r1 == r6) goto L_0x004e
        L_0x004d:
            r11 = 0
        L_0x004e:
            long r1 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "seq_num"
            r5.A9F(r1, r2)
            java.lang.String r1 = "m_pk"
            r5.AAJ(r1, r10)
            java.lang.Long r2 = r9.A00
            java.lang.String r1 = "a_pk"
            r5.A9F(r1, r2)
            java.lang.String r1 = "a_i"
            r5.AAJ(r1, r7)
            java.lang.Integer r1 = r4.A0X
            if (r1 == 0) goto L_0x04b6
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0076:
            java.lang.String r1 = "client_sample_weight"
            r5.A9F(r1, r2)
            java.lang.String r2 = r4.A0q
            java.lang.String r1 = "connection_type"
            r5.AAJ(r1, r2)
            java.lang.Double r2 = r4.A0B
            java.lang.String r1 = "device_lat"
            r5.A8D(r1, r2)
            java.lang.Double r2 = r4.A0C
            java.lang.String r1 = "device_long"
            r5.A8D(r1, r2)
            java.lang.String r2 = r4.A0v
            java.lang.String r1 = "follow_status"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0m
            java.lang.String r1 = "hardware_address"
            r5.AAJ(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = "is_dash_eligible"
            r5.A7p(r1, r2)
            java.util.HashMap r2 = r4.A1Q
            if (r2 == 0) goto L_0x04b3
            java.lang.String r1 = "is_network_roaming"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x00b3:
            java.lang.String r1 = "is_network_roaming"
            r5.AAJ(r1, r2)
            java.lang.Boolean r2 = r4.A09
            java.lang.String r1 = "is_video_to_carousel"
            r5.A7p(r1, r2)
            java.lang.Long r2 = r4.A0f
            java.lang.String r1 = "m_ts"
            r5.A9F(r1, r2)
            java.util.HashMap r2 = r4.A1Q
            if (r2 == 0) goto L_0x04b0
            java.lang.String r1 = "network_generation"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x00d2:
            java.lang.String r1 = "network_generation"
            r5.AAJ(r1, r2)
            java.util.HashMap r2 = r4.A1Q
            if (r2 == 0) goto L_0x04ad
            java.lang.String r1 = "network_params"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x00e3:
            java.lang.String r1 = "network_params"
            r5.AAJ(r1, r2)
            java.util.HashMap r2 = r4.A1Q
            if (r2 == 0) goto L_0x04aa
            java.lang.String r1 = "network_type_info"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x00f4:
            java.lang.String r1 = "network_type_info"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A16
            java.lang.String r1 = "playback_format"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0y
            java.lang.String r1 = "inventory_source"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A18
            java.lang.String r1 = "random_session_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1B
            java.lang.String r1 = "reason"
            r5.AAJ(r1, r2)
            java.lang.Float r1 = r4.A0M
            if (r1 == 0) goto L_0x04a7
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x0122:
            java.lang.String r1 = "retry_count"
            r5.A8D(r1, r2)
            java.lang.String r2 = r4.A1D
            java.lang.String r1 = "resource_url"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1H
            java.lang.String r1 = "tracking_token"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1L
            java.lang.String r1 = "video_type"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1M
            java.lang.String r1 = "viewer_session_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0p
            java.lang.String r1 = "chaining_session_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1K
            java.lang.String r1 = "video_codec"
            r5.AAJ(r1, r2)
            java.lang.Boolean r2 = r4.A07
            java.lang.String r1 = "is_secondary_channel_enabled"
            r5.A7p(r1, r2)
            java.lang.String r2 = r4.A13
            java.lang.String r1 = "nav_chain"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0z
            java.lang.String r1 = "session_validation_token"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1J
            java.lang.String r1 = "upload_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A15
            java.lang.String r1 = "parent_m_pk"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1C
            java.lang.String r1 = "representation_id"
            r5.AAJ(r1, r2)
            java.lang.Integer r1 = r4.A0S
            if (r1 == 0) goto L_0x04a4
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0188:
            java.lang.String r1 = "m_ix"
            r5.A9F(r1, r2)
            r2 = r0
            java.lang.String r1 = "carousel_index"
            r5.A9F(r1, r0)
            java.lang.String r1 = "carousel_media_id"
            r5.AAJ(r1, r0)
            java.lang.String r1 = "carousel_media_type"
            r5.A9F(r1, r0)
            java.lang.String r1 = "carousel_size"
            r5.A9F(r1, r0)
            java.lang.String r1 = "carousel_cover_media_id"
            r5.AAJ(r1, r0)
            java.lang.Integer r1 = r4.A0c
            if (r1 == 0) goto L_0x01b4
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x01b4:
            java.lang.String r1 = "video_width"
            r5.A9F(r1, r2)
            java.lang.String r1 = "is_replay"
            r5.A7p(r1, r0)
            java.lang.String r1 = "thread_id"
            r5.AAJ(r1, r0)
            java.lang.String r2 = r4.A0h
            java.lang.String r1 = "audience"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0t
            java.lang.String r1 = "effect_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0r
            java.lang.String r1 = "channel_pk"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A1A
            java.lang.String r1 = "ranking_info_token"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A11
            java.lang.String r1 = "mezql_token"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0s
            java.lang.String r1 = "discovery_session_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A0o
            java.lang.String r1 = "camera_session_id"
            r5.AAJ(r1, r2)
            java.lang.Integer r1 = r4.A0W
            if (r1 == 0) goto L_0x04a1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0201:
            java.lang.String r1 = "recent_bandwidth"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r4.A0b
            if (r1 == 0) goto L_0x049e
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0213:
            java.lang.String r1 = "segment_count"
            r5.A9F(r1, r2)
            java.lang.Float r1 = r4.A0I
            if (r1 == 0) goto L_0x049b
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x0225:
            java.lang.String r1 = "duration"
            r5.A8D(r1, r2)
            java.lang.Number r3 = (java.lang.Number) r3
            long r1 = r3.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "loop_count"
            r5.A9F(r1, r2)
            java.lang.Float r1 = r4.A0H
            if (r1 == 0) goto L_0x0498
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x0246:
            java.lang.String r1 = "time"
            r5.A8D(r1, r2)
            java.lang.String r2 = r4.A1E
            java.lang.String r1 = "search_session_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A19
            java.lang.String r1 = "rank_token"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r4.A17
            java.lang.String r1 = "query_text"
            r5.AAJ(r1, r2)
            r7 = 1
        L_0x0261:
            X.4OC r3 = r14.A07
            if (r3 == 0) goto L_0x0450
            if (r7 == 0) goto L_0x03cb
            java.lang.Integer r1 = r3.A0K
            if (r1 == 0) goto L_0x0495
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0274:
            java.lang.String r1 = "reel_position"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0L
            if (r1 == 0) goto L_0x0492
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0286:
            java.lang.String r1 = "reel_size"
            r5.A9F(r1, r2)
            java.lang.Boolean r2 = r3.A03
            java.lang.String r1 = "is_replay"
            r5.A7p(r1, r2)
            java.lang.String r1 = "host_video_pk"
            r5.AAJ(r1, r0)
            java.lang.Integer r1 = r3.A0A
            if (r1 == 0) goto L_0x048f
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x02a4:
            java.lang.String r1 = "session_reel_counter"
            r5.A9F(r1, r2)
            java.lang.String r2 = r3.A0a
            java.lang.String r1 = "tray_session_id"
            r5.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A0N
            if (r1 == 0) goto L_0x048c
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x02bd:
            java.lang.String r1 = "tray_position"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0H
            if (r1 == 0) goto L_0x0489
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x02cf:
            java.lang.String r1 = "mqtt_connection_status"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A06
            if (r1 == 0) goto L_0x0486
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x02e1:
            java.lang.String r1 = "battery_level"
            r5.A9F(r1, r2)
            java.lang.String r2 = r3.A0Q
            java.lang.String r1 = "battery_status"
            r5.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A0E
            if (r1 == 0) goto L_0x0483
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x02fa:
            java.lang.String r1 = "live_donation"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0J
            if (r1 == 0) goto L_0x0480
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x030c:
            java.lang.String r1 = "number_of_qualities"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0F
            if (r1 == 0) goto L_0x047d
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x031e:
            java.lang.String r1 = "is_live_streaming"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0C
            if (r1 == 0) goto L_0x047a
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0330:
            java.lang.String r1 = "has_igtv_video"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0D
            if (r1 == 0) goto L_0x0477
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0342:
            java.lang.String r1 = "has_reshared_clips_video"
            r5.A9F(r1, r2)
            java.lang.String r1 = "channel_id"
            r5.AAJ(r1, r0)
            java.lang.String r1 = "channel_type"
            r5.AAJ(r1, r0)
            java.lang.String r1 = "channel_session_id"
            r5.AAJ(r1, r0)
            java.lang.String r2 = r3.A0Z
            java.lang.String r1 = "subtype"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r3.A0V
            java.lang.String r1 = "position"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r3.A0W
            java.lang.String r1 = "size"
            r5.AAJ(r1, r2)
            java.lang.Long r2 = r3.A0P
            java.lang.String r1 = "type"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A07
            if (r1 == 0) goto L_0x0474
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x037f:
            java.lang.String r1 = "carousel_index"
            r5.A9F(r1, r2)
            java.lang.String r2 = r3.A0S
            java.lang.String r1 = "carousel_media_id"
            r5.AAJ(r1, r2)
            java.lang.String r2 = r3.A0R
            java.lang.String r1 = "carousel_cover_media_id"
            r5.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A09
            if (r1 == 0) goto L_0x0471
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x039f:
            java.lang.String r1 = "carousel_size"
            r5.A9F(r1, r2)
            java.lang.Integer r1 = r3.A08
            if (r1 == 0) goto L_0x046e
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x03b1:
            java.lang.String r1 = "carousel_m_t"
            r5.A9F(r1, r2)
            java.lang.String r2 = r3.A0b
            java.lang.String r1 = "trigger"
            r5.AAJ(r1, r2)
            java.lang.Boolean r2 = r3.A04
            java.lang.String r1 = "video_subtitles_available"
            r5.A7p(r1, r2)
            java.lang.Boolean r2 = r3.A05
            java.lang.String r1 = "video_subtitles_displayed"
            r5.A7p(r1, r2)
        L_0x03cb:
            X.4OD r4 = new X.4OD
            r4.<init>()
            java.lang.String r1 = "igtv_destination_session_id"
            r4.A06(r1, r0)
            java.lang.String r1 = "entry_point"
            r4.A06(r1, r0)
            java.lang.String r1 = "surface"
            r4.A06(r1, r0)
            java.lang.String r1 = "component_type"
            r4.A06(r1, r0)
            java.lang.String r1 = "was_live"
            r4.A03(r1, r0)
            java.lang.String r1 = "video_x_position"
            r4.A05(r1, r0)
            java.lang.String r1 = "video_y_position"
            r4.A05(r1, r0)
            java.lang.String r1 = "source_channel_type"
            r4.A06(r1, r0)
            java.lang.Boolean r2 = r3.A04
            java.lang.String r1 = "captions_available"
            r4.A03(r1, r2)
            java.lang.Boolean r2 = r3.A05
            java.lang.String r1 = "captions_displayed"
            r4.A03(r1, r2)
            java.lang.String r2 = r3.A0Y
            if (r2 == 0) goto L_0x046c
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
        L_0x0410:
            java.lang.String r1 = r3.A0X
            if (r1 == 0) goto L_0x041a
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
        L_0x041a:
            java.lang.String r1 = "story_preview_media_owner_id"
            r4.A05(r1, r2)
            java.lang.String r1 = "story_preview_media_id"
            r4.A05(r1, r0)
            if (r7 == 0) goto L_0x042b
            java.lang.String r0 = "adhoc_data"
            r5.AAK(r4, r0)
        L_0x042b:
            X.4O3 r0 = r14.A06
            if (r0 == 0) goto L_0x0433
            java.lang.String r0 = r0.A16
            if (r0 != 0) goto L_0x0450
        L_0x0433:
            java.lang.Integer r0 = r3.A0B
            if (r0 == 0) goto L_0x043e
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x043e
            r8 = 1
        L_0x043e:
            if (r7 == 0) goto L_0x0450
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = "playback_format"
            r5.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_dash_eligible"
            r5.A7p(r0, r1)
        L_0x0450:
            X.4O3 r0 = r14.A06
            if (r0 == 0) goto L_0x0469
            java.lang.String r1 = r0.A0x
            if (r1 == 0) goto L_0x0469
            if (r7 == 0) goto L_0x0468
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "host_profile_id"
            r5.A9F(r0, r1)
        L_0x0465:
            r5.Cgf()
        L_0x0468:
            return
        L_0x0469:
            if (r7 == 0) goto L_0x0468
            goto L_0x0465
        L_0x046c:
            r2 = r0
            goto L_0x0410
        L_0x046e:
            r2 = r0
            goto L_0x03b1
        L_0x0471:
            r2 = r0
            goto L_0x039f
        L_0x0474:
            r2 = r0
            goto L_0x037f
        L_0x0477:
            r2 = r0
            goto L_0x0342
        L_0x047a:
            r2 = r0
            goto L_0x0330
        L_0x047d:
            r2 = r0
            goto L_0x031e
        L_0x0480:
            r2 = r0
            goto L_0x030c
        L_0x0483:
            r2 = r0
            goto L_0x02fa
        L_0x0486:
            r2 = r0
            goto L_0x02e1
        L_0x0489:
            r2 = r0
            goto L_0x02cf
        L_0x048c:
            r2 = r0
            goto L_0x02bd
        L_0x048f:
            r2 = r0
            goto L_0x02a4
        L_0x0492:
            r2 = r0
            goto L_0x0286
        L_0x0495:
            r2 = r0
            goto L_0x0274
        L_0x0498:
            r2 = r0
            goto L_0x0246
        L_0x049b:
            r2 = r0
            goto L_0x0225
        L_0x049e:
            r2 = r0
            goto L_0x0213
        L_0x04a1:
            r2 = r0
            goto L_0x0201
        L_0x04a4:
            r2 = r0
            goto L_0x0188
        L_0x04a7:
            r2 = r0
            goto L_0x0122
        L_0x04aa:
            r2 = r0
            goto L_0x00f4
        L_0x04ad:
            r2 = r0
            goto L_0x00e3
        L_0x04b0:
            r2 = r0
            goto L_0x00d2
        L_0x04b3:
            r2 = r0
            goto L_0x00b3
        L_0x04b6:
            r2 = r0
            goto L_0x0076
        L_0x04b9:
            r7 = 0
            goto L_0x0261
        L_0x04bc:
            java.lang.String r1 = "seqNum number should not be null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263924Nw.A00(X.0Ae):void");
    }
}
