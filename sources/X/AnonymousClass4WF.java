package X;

/* renamed from: X.4WF  reason: invalid class name */
public final class AnonymousClass4WF extends C263934Nx {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r1.intValue() != 1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r1.intValue() != 1) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C58840Ae r16) {
        /*
            r15 = this;
            r2 = r16
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "video_started_playing"
            X.0wc r2 = (X.0wc) r2
            X.0kJ r0 = r2.A00
            X.0Aj r7 = r2.A00(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x05b0
            X.4O3 r6 = r15.A06
            r9 = 0
            r5 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0628
            java.lang.Integer r1 = r6.A0Y
            if (r1 == 0) goto L_0x062b
            int r12 = r1.intValue()
            java.lang.String r11 = r6.A10
            if (r11 != 0) goto L_0x002b
            java.lang.String r11 = "0"
        L_0x002b:
            X.4Ny r10 = r6.A00
            if (r10 != 0) goto L_0x003a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.4Ny r10 = new X.4Ny
            r10.<init>(r1)
        L_0x003a:
            java.lang.String r3 = r6.A1I
            java.lang.Integer r1 = r6.A0U
            if (r1 == 0) goto L_0x0047
            int r1 = r1.intValue()
            r14 = 1
            if (r1 == r5) goto L_0x0048
        L_0x0047:
            r14 = 0
        L_0x0048:
            java.lang.Integer r1 = r6.A0T
            if (r1 == 0) goto L_0x0053
            int r1 = r1.intValue()
            r13 = 1
            if (r1 == r5) goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            java.lang.Boolean r2 = r6.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            boolean r8 = X.0qQ.A0K(r2, r1)
            java.lang.String r4 = r6.A1B
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = ""
        L_0x0064:
            long r1 = (long) r12
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "seq_num"
            r7.A9F(r1, r2)
            java.lang.String r1 = "m_pk"
            r7.AAJ(r1, r11)
            java.lang.Long r2 = r10.A00
            java.lang.String r1 = "a_pk"
            r7.A9F(r1, r2)
            java.lang.String r1 = "a_i"
            r7.AAJ(r1, r3)
            java.lang.String r1 = "reason"
            r7.AAJ(r1, r4)
            java.lang.Integer r1 = r6.A0d
            if (r1 == 0) goto L_0x0625
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0091:
            java.lang.String r1 = "current_viewability_percentage"
            r7.A9F(r1, r2)
            java.lang.Float r1 = r6.A0I
            if (r1 == 0) goto L_0x0622
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x00a3:
            java.lang.String r1 = "duration"
            r7.A8D(r1, r2)
            java.lang.Long r1 = r6.A0e
            if (r1 == 0) goto L_0x061f
            long r3 = r1.longValue()
            double r1 = (double) r3
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x00b5:
            java.lang.String r1 = "start_delay"
            r7.A8D(r1, r2)
            java.lang.Integer r1 = r6.A0S
            if (r1 == 0) goto L_0x061c
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x00c7:
            java.lang.String r1 = "m_ix"
            r7.A9F(r1, r2)
            java.lang.String r2 = r6.A0g
            java.lang.String r1 = "app_orientation"
            r7.AAJ(r1, r2)
            java.lang.Boolean r2 = r6.A04
            java.lang.String r1 = "playing_audio"
            r7.A7p(r1, r2)
            long r1 = (long) r8
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "audio_fetched"
            r7.A9F(r1, r2)
            java.lang.Boolean r2 = r6.A06
            java.lang.String r1 = "cached"
            r7.A7p(r1, r2)
            java.lang.Boolean r2 = r6.A0A
            java.lang.String r1 = "warmed"
            r7.A7p(r1, r2)
            java.lang.Boolean r2 = r6.A08
            java.lang.String r1 = "streaming"
            r7.A7p(r1, r2)
            java.lang.Float r1 = r6.A0M
            if (r1 == 0) goto L_0x0619
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x0106:
            java.lang.String r1 = "retry_count"
            r7.A8D(r1, r2)
            java.lang.Integer r1 = r6.A0V
            if (r1 == 0) goto L_0x0616
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0118:
            java.lang.String r1 = "prefetch_size"
            r7.A9F(r1, r2)
            java.lang.Boolean r2 = r6.A07
            java.lang.String r1 = "is_secondary_channel_enabled"
            r7.A7p(r1, r2)
            r4 = r0
            java.lang.String r1 = "system_volume"
            r7.A8D(r1, r0)
            java.lang.String r2 = r6.A1M
            java.lang.String r1 = "viewer_session_id"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r6.A0c
            if (r1 == 0) goto L_0x0613
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x013e:
            java.lang.String r1 = "video_width"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r6.A0a
            if (r1 == 0) goto L_0x0610
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0150:
            java.lang.String r1 = "video_height"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r6.A0W
            if (r1 == 0) goto L_0x060d
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0162:
            java.lang.String r3 = "recent_bandwidth"
            r7.A9F(r3, r1)
            java.lang.String r2 = r6.A0y
            java.lang.String r1 = "inventory_source"
            r7.AAJ(r1, r2)
            java.lang.Float r1 = r6.A0L
            if (r1 == 0) goto L_0x060a
            float r1 = r1.floatValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x017b:
            java.lang.String r1 = "loop_count"
            r7.A9F(r1, r2)
            java.lang.String r2 = r6.A1H
            java.lang.String r1 = "tracking_token"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A1L
            java.lang.String r1 = "video_type"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A1J
            java.lang.String r1 = "upload_id"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A15
            java.lang.String r1 = "parent_m_pk"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A1C
            java.lang.String r1 = "representation_id"
            r7.AAJ(r1, r2)
            java.lang.Long r2 = r6.A0f
            java.lang.String r1 = "m_ts"
            r7.A9F(r1, r2)
            java.lang.String r2 = r6.A0v
            java.lang.String r1 = "follow_status"
            r7.AAJ(r1, r2)
            java.lang.Float r1 = r6.A0H
            if (r1 == 0) goto L_0x01be
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
        L_0x01be:
            java.lang.String r1 = "time"
            r7.A8D(r1, r4)
            java.lang.Float r1 = r6.A0G
            if (r1 == 0) goto L_0x0607
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x01d0:
            java.lang.String r1 = "buffering_duration"
            r7.A8D(r1, r2)
            r4 = r0
            java.lang.String r1 = "carousel_index"
            r7.A9F(r1, r0)
            java.lang.String r1 = "carousel_media_id"
            r7.AAJ(r1, r0)
            java.lang.String r1 = "carousel_media_type"
            r7.A9F(r1, r0)
            java.lang.String r1 = "carousel_size"
            r7.A9F(r1, r0)
            java.lang.String r1 = "carousel_cover_media_id"
            r7.AAJ(r1, r0)
            java.lang.String r2 = r6.A0p
            java.lang.String r1 = "chaining_session_id"
            r7.AAJ(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            java.lang.String r1 = "is_dash_eligible"
            r7.A7p(r1, r2)
            java.lang.String r2 = r6.A16
            java.lang.String r1 = "playback_format"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A1K
            java.lang.String r1 = "video_codec"
            r7.AAJ(r1, r2)
            java.lang.String r1 = "is_replay"
            r7.A7p(r1, r0)
            java.lang.String r1 = "thread_id"
            r7.AAJ(r1, r0)
            java.lang.String r2 = r6.A0h
            java.lang.String r1 = "audience"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A0t
            java.lang.String r1 = "effect_id"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A0r
            java.lang.String r1 = "channel_pk"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A1A
            java.lang.String r1 = "ranking_info_token"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A11
            java.lang.String r1 = "mezql_token"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A0s
            java.lang.String r1 = "discovery_session_id"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A0o
            java.lang.String r1 = "camera_session_id"
            r7.AAJ(r1, r2)
            java.lang.Boolean r2 = r6.A09
            java.lang.String r1 = "is_video_to_carousel"
            r7.A7p(r1, r2)
            java.lang.Integer r1 = r6.A0X
            if (r1 == 0) goto L_0x025c
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
        L_0x025c:
            java.lang.String r1 = "client_sample_weight"
            r7.A9F(r1, r4)
            java.lang.String r2 = r6.A0q
            java.lang.String r1 = "connection_type"
            r7.AAJ(r1, r2)
            java.lang.Double r2 = r6.A0B
            java.lang.String r1 = "device_lat"
            r7.A8D(r1, r2)
            java.lang.Double r2 = r6.A0C
            java.lang.String r1 = "device_long"
            r7.A8D(r1, r2)
            java.lang.String r2 = r6.A0m
            java.lang.String r1 = "hardware_address"
            r7.AAJ(r1, r2)
            java.util.HashMap r2 = r6.A1Q
            if (r2 == 0) goto L_0x0604
            java.lang.String r1 = "is_network_roaming"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x0289:
            java.lang.String r1 = "is_network_roaming"
            r7.AAJ(r1, r2)
            java.util.HashMap r2 = r6.A1Q
            if (r2 == 0) goto L_0x0601
            java.lang.String r1 = "network_generation"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x029a:
            java.lang.String r1 = "network_generation"
            r7.AAJ(r1, r2)
            java.util.HashMap r2 = r6.A1Q
            if (r2 == 0) goto L_0x05fe
            java.lang.String r1 = "network_params"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x02ab:
            java.lang.String r1 = "network_params"
            r7.AAJ(r1, r2)
            java.util.HashMap r2 = r6.A1Q
            if (r2 == 0) goto L_0x05fb
            java.lang.String r1 = "network_type_info"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
        L_0x02bc:
            java.lang.String r1 = "network_type_info"
            r7.AAJ(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            java.lang.String r1 = "pip"
            r7.A7p(r1, r2)
            java.lang.String r2 = r6.A18
            java.lang.String r1 = "random_session_id"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r6.A0W
            if (r1 == 0) goto L_0x05f8
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x02de:
            r7.A9F(r3, r1)
            java.lang.String r2 = r6.A1D
            java.lang.String r1 = "resource_url"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r6.A0b
            if (r1 == 0) goto L_0x05f5
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x02f5:
            java.lang.String r1 = "segment_count"
            r7.A9F(r1, r2)
            java.lang.Float r1 = r6.A0P
            if (r1 == 0) goto L_0x05f2
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x0307:
            java.lang.String r1 = "view_height"
            r7.A8D(r1, r2)
            java.lang.Float r1 = r6.A0Q
            if (r1 == 0) goto L_0x05ef
            float r1 = r1.floatValue()
            double r1 = (double) r1
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L_0x0319:
            java.lang.String r1 = "view_width"
            r7.A8D(r1, r2)
            java.lang.String r2 = r6.A13
            java.lang.String r1 = "nav_chain"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A0z
            java.lang.String r1 = "session_validation_token"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A1E
            java.lang.String r1 = "search_session_id"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A19
            java.lang.String r1 = "rank_token"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A17
            java.lang.String r1 = "query_text"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r6.A0i
            if (r2 == 0) goto L_0x05ec
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
        L_0x034b:
            java.lang.String r1 = "audio_derived_content_id"
            r7.A9F(r1, r2)
            r6 = 1
        L_0x0351:
            X.4OC r3 = r15.A07
            if (r3 == 0) goto L_0x0598
            if (r6 == 0) goto L_0x0513
            java.lang.Integer r1 = r3.A0G
            if (r1 == 0) goto L_0x05e9
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0364:
            java.lang.String r1 = "media_relative_module_index"
            r7.A9F(r1, r2)
            java.lang.Boolean r2 = r3.A02
            java.lang.String r1 = "is_first_playback"
            r7.A7p(r1, r2)
            java.lang.Integer r1 = r3.A0K
            if (r1 == 0) goto L_0x05e6
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x037d:
            java.lang.String r1 = "reel_position"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0L
            if (r1 == 0) goto L_0x05e3
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x038f:
            java.lang.String r1 = "reel_size"
            r7.A9F(r1, r2)
            java.lang.Boolean r2 = r3.A03
            java.lang.String r1 = "is_replay"
            r7.A7p(r1, r2)
            java.lang.String r1 = "host_video_pk"
            r7.AAJ(r1, r0)
            java.lang.Integer r1 = r3.A0A
            if (r1 == 0) goto L_0x05e0
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x03ad:
            java.lang.String r1 = "session_reel_counter"
            r7.A9F(r1, r2)
            java.lang.String r2 = r3.A0a
            java.lang.String r1 = "tray_session_id"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A0N
            if (r1 == 0) goto L_0x05dd
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x03c6:
            java.lang.String r1 = "tray_position"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0H
            if (r1 == 0) goto L_0x05da
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x03d8:
            java.lang.String r1 = "mqtt_connection_status"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A06
            if (r1 == 0) goto L_0x05d7
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x03ea:
            java.lang.String r1 = "battery_level"
            r7.A9F(r1, r2)
            java.lang.String r2 = r3.A0Q
            java.lang.String r1 = "battery_status"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A0E
            if (r1 == 0) goto L_0x05d4
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0403:
            java.lang.String r1 = "live_donation"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0J
            if (r1 == 0) goto L_0x05d1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0415:
            java.lang.String r1 = "number_of_qualities"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0F
            if (r1 == 0) goto L_0x05ce
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0427:
            java.lang.String r1 = "is_live_streaming"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0C
            if (r1 == 0) goto L_0x05cb
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0439:
            java.lang.String r1 = "has_igtv_video"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A0D
            if (r1 == 0) goto L_0x05c8
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x044b:
            java.lang.String r1 = "has_reshared_clips_video"
            r7.A9F(r1, r2)
            java.lang.String r1 = "channel_id"
            r7.AAJ(r1, r0)
            java.lang.String r1 = "channel_type"
            r7.AAJ(r1, r0)
            java.lang.String r1 = "channel_session_id"
            r7.AAJ(r1, r0)
            java.lang.String r2 = r3.A0Z
            java.lang.String r1 = "subtype"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r3.A0V
            java.lang.String r1 = "position"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r3.A0W
            java.lang.String r1 = "size"
            r7.AAJ(r1, r2)
            java.lang.Long r2 = r3.A0P
            java.lang.String r1 = "type"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A07
            if (r1 == 0) goto L_0x05c5
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0488:
            java.lang.String r1 = "carousel_index"
            r7.A9F(r1, r2)
            java.lang.String r2 = r3.A0S
            java.lang.String r1 = "carousel_media_id"
            r7.AAJ(r1, r2)
            java.lang.String r2 = r3.A0R
            java.lang.String r1 = "carousel_cover_media_id"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A09
            if (r1 == 0) goto L_0x05c2
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x04a8:
            java.lang.String r1 = "carousel_size"
            r7.A9F(r1, r2)
            java.lang.Integer r1 = r3.A08
            if (r1 == 0) goto L_0x05bf
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x04ba:
            java.lang.String r1 = "carousel_m_t"
            r7.A9F(r1, r2)
            java.lang.Boolean r2 = r3.A04
            java.lang.String r1 = "video_subtitles_available"
            r7.A7p(r1, r2)
            java.lang.Boolean r2 = r3.A05
            java.lang.String r1 = "video_subtitles_displayed"
            r7.A7p(r1, r2)
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r2 = r3.A00
            r1 = 0
            if (r2 == 0) goto L_0x04d3
            r1 = 1
        L_0x04d3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_multi_ads"
            r7.A7p(r1, r2)
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r1 = r3.A00
            if (r1 == 0) goto L_0x05bc
            java.lang.Integer r1 = r1.BUY()
            if (r1 == 0) goto L_0x05bc
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x04ef:
            java.lang.String r1 = "multi_ads_type"
            r7.A9F(r1, r2)
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r1 = r3.A00
            if (r1 == 0) goto L_0x05b9
            java.lang.String r2 = r1.BUa()
        L_0x04fc:
            java.lang.String r1 = "multi_ads_unit_id"
            r7.AAJ(r1, r2)
            java.lang.Integer r1 = r3.A0I
            if (r1 == 0) goto L_0x05b6
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x050e:
            java.lang.String r1 = "position_in_multi_ads_unit"
            r7.A9F(r1, r2)
        L_0x0513:
            X.4WG r4 = new X.4WG
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
            if (r2 == 0) goto L_0x05b4
            r1 = 10
            java.lang.Long r2 = X.00y.A0n(r1, r2)
        L_0x0558:
            java.lang.String r1 = r3.A0X
            if (r1 == 0) goto L_0x0562
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
        L_0x0562:
            java.lang.String r1 = "story_preview_media_owner_id"
            r4.A05(r1, r2)
            java.lang.String r1 = "story_preview_media_id"
            r4.A05(r1, r0)
            if (r6 == 0) goto L_0x0573
            java.lang.String r0 = "adhoc_data"
            r7.AAK(r4, r0)
        L_0x0573:
            X.4O3 r0 = r15.A06
            if (r0 == 0) goto L_0x057b
            java.lang.String r0 = r0.A16
            if (r0 != 0) goto L_0x0598
        L_0x057b:
            java.lang.Integer r0 = r3.A0B
            if (r0 == 0) goto L_0x0586
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x0586
            r9 = 1
        L_0x0586:
            if (r6 == 0) goto L_0x0598
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = "playback_format"
            r7.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_dash_eligible"
            r7.A7p(r0, r1)
        L_0x0598:
            X.4O3 r0 = r15.A06
            if (r0 == 0) goto L_0x05b1
            java.lang.String r1 = r0.A0x
            if (r1 == 0) goto L_0x05b1
            if (r6 == 0) goto L_0x05b0
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "host_profile_id"
            r7.A9F(r0, r1)
        L_0x05ad:
            r7.Cgf()
        L_0x05b0:
            return
        L_0x05b1:
            if (r6 == 0) goto L_0x05b0
            goto L_0x05ad
        L_0x05b4:
            r2 = r0
            goto L_0x0558
        L_0x05b6:
            r2 = r0
            goto L_0x050e
        L_0x05b9:
            r2 = r0
            goto L_0x04fc
        L_0x05bc:
            r2 = r0
            goto L_0x04ef
        L_0x05bf:
            r2 = r0
            goto L_0x04ba
        L_0x05c2:
            r2 = r0
            goto L_0x04a8
        L_0x05c5:
            r2 = r0
            goto L_0x0488
        L_0x05c8:
            r2 = r0
            goto L_0x044b
        L_0x05cb:
            r2 = r0
            goto L_0x0439
        L_0x05ce:
            r2 = r0
            goto L_0x0427
        L_0x05d1:
            r2 = r0
            goto L_0x0415
        L_0x05d4:
            r2 = r0
            goto L_0x0403
        L_0x05d7:
            r2 = r0
            goto L_0x03ea
        L_0x05da:
            r2 = r0
            goto L_0x03d8
        L_0x05dd:
            r2 = r0
            goto L_0x03c6
        L_0x05e0:
            r2 = r0
            goto L_0x03ad
        L_0x05e3:
            r2 = r0
            goto L_0x038f
        L_0x05e6:
            r2 = r0
            goto L_0x037d
        L_0x05e9:
            r2 = r0
            goto L_0x0364
        L_0x05ec:
            r2 = r0
            goto L_0x034b
        L_0x05ef:
            r2 = r0
            goto L_0x0319
        L_0x05f2:
            r2 = r0
            goto L_0x0307
        L_0x05f5:
            r2 = r0
            goto L_0x02f5
        L_0x05f8:
            r1 = r0
            goto L_0x02de
        L_0x05fb:
            r2 = r0
            goto L_0x02bc
        L_0x05fe:
            r2 = r0
            goto L_0x02ab
        L_0x0601:
            r2 = r0
            goto L_0x029a
        L_0x0604:
            r2 = r0
            goto L_0x0289
        L_0x0607:
            r2 = r0
            goto L_0x01d0
        L_0x060a:
            r2 = r0
            goto L_0x017b
        L_0x060d:
            r1 = r0
            goto L_0x0162
        L_0x0610:
            r2 = r0
            goto L_0x0150
        L_0x0613:
            r2 = r0
            goto L_0x013e
        L_0x0616:
            r2 = r0
            goto L_0x0118
        L_0x0619:
            r2 = r0
            goto L_0x0106
        L_0x061c:
            r2 = r0
            goto L_0x00c7
        L_0x061f:
            r2 = r0
            goto L_0x00b5
        L_0x0622:
            r2 = r0
            goto L_0x00a3
        L_0x0625:
            r2 = r0
            goto L_0x0091
        L_0x0628:
            r6 = 0
            goto L_0x0351
        L_0x062b:
            java.lang.String r1 = "seqNum number should not be null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WF.A00(X.0Ae):void");
    }
}
