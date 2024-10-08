package X;

/* renamed from: X.5ri  reason: invalid class name and case insensitive filesystem */
public final class C297415ri extends C263934Nx {
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x064b, code lost:
        if (r0.intValue() != 1) goto L_0x064d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0740, code lost:
        if (r9 != false) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r0.intValue() != 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r0.intValue() != 1) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0332, code lost:
        if (r0.length() == 0) goto L_0x0334;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C58840Ae r25) {
        /*
            r24 = this;
            r1 = r25
            r7 = 0
            X.0qQ.A0B(r1, r7)
            java.lang.String r8 = "video_paused"
            X.0wc r1 = (X.0wc) r1
            X.0kJ r0 = r1.A00
            X.0Aj r3 = r1.A00(r0, r8)
            boolean r0 = r3.isSampled()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r4 = r24
            if (r0 == 0) goto L_0x0678
            X.4O3 r6 = r4.A06
            r2 = 1
            if (r6 == 0) goto L_0x03c5
            java.lang.Integer r0 = r6.A0Y
            if (r0 == 0) goto L_0x03bd
            int r1 = r0.intValue()
            java.lang.String r5 = r6.A10
            if (r5 != 0) goto L_0x002f
            java.lang.String r5 = "0"
        L_0x002f:
            X.4Ny r13 = r6.A00
            if (r13 != 0) goto L_0x003e
            r9 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            X.4Ny r13 = new X.4Ny
            r13.<init>(r0)
        L_0x003e:
            java.lang.String r12 = r6.A1I
            java.lang.Float r11 = r6.A0L
            if (r11 != 0) goto L_0x0045
            r11 = r14
        L_0x0045:
            java.lang.Float r10 = r6.A0J
            if (r10 != 0) goto L_0x004a
            r10 = r14
        L_0x004a:
            java.lang.Float r0 = r6.A0H
            if (r0 == 0) goto L_0x004f
            r14 = r0
        L_0x004f:
            java.lang.Integer r0 = r6.A0U
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            r18 = 1
            if (r0 == r2) goto L_0x005d
        L_0x005b:
            r18 = 0
        L_0x005d:
            java.lang.Integer r0 = r6.A0T
            if (r0 == 0) goto L_0x0069
            int r0 = r0.intValue()
            r17 = 1
            if (r0 == r2) goto L_0x006b
        L_0x0069:
            r17 = 0
        L_0x006b:
            java.lang.Boolean r9 = r6.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r9 = X.0qQ.A0K(r9, r0)
            long r15 = android.os.SystemClock.elapsedRealtime()
            long r0 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "seq_num"
            r3.A9F(r0, r1)
            java.lang.String r0 = "m_pk"
            r3.AAJ(r0, r5)
            java.lang.Long r1 = r13.A00
            java.lang.String r0 = "a_pk"
            r3.A9F(r0, r1)
            java.lang.String r0 = "a_i"
            r3.AAJ(r0, r12)
            java.lang.Number r11 = (java.lang.Number) r11
            double r0 = r11.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "loop_count"
            r3.A8D(r0, r1)
            java.lang.Number r10 = (java.lang.Number) r10
            double r0 = r10.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "lsp"
            r3.A8D(r0, r1)
            java.lang.Number r14 = (java.lang.Number) r14
            double r0 = r14.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time"
            r3.A8D(r0, r1)
            java.lang.Float r0 = r6.A0I
            if (r0 == 0) goto L_0x03a3
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x00ce:
            java.lang.String r0 = "duration"
            r3.A8D(r0, r1)
            java.lang.String r1 = r6.A1H
            java.lang.String r0 = "tracking_token"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1L
            java.lang.String r0 = "video_type"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1J
            java.lang.String r0 = "upload_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A15
            java.lang.String r0 = "parent_m_pk"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1C
            java.lang.String r0 = "representation_id"
            r3.AAJ(r0, r1)
            java.lang.Long r1 = r6.A0f
            java.lang.String r0 = "m_ts"
            r3.A9F(r0, r1)
            java.lang.String r1 = r6.A0v
            java.lang.String r0 = "follow_status"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0S
            if (r0 == 0) goto L_0x03a0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0111:
            java.lang.String r0 = "m_ix"
            r3.A9F(r0, r1)
            java.lang.Double r1 = r6.A0D
            java.lang.String r0 = "timeAsPercent"
            r3.A8D(r0, r1)
            java.lang.Boolean r1 = r6.A04
            java.lang.String r0 = "playing_audio"
            r3.A7p(r0, r1)
            long r0 = (long) r9
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "audio_fetched"
            r3.A9F(r0, r1)
            java.lang.Float r0 = r6.A0G
            if (r0 == 0) goto L_0x039d
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x013b:
            java.lang.String r0 = "buffering_duration"
            r3.A8D(r0, r1)
            r9 = 0
            java.lang.String r0 = "system_volume"
            r3.A8D(r0, r9)
            r10 = 0
            java.lang.String r0 = "carousel_index"
            r3.A9F(r0, r9)
            java.lang.String r0 = "carousel_media_id"
            r3.AAJ(r0, r9)
            java.lang.String r0 = "carousel_media_type"
            r3.A9F(r0, r9)
            java.lang.String r0 = "carousel_size"
            r3.A9F(r0, r9)
            java.lang.String r0 = "carousel_cover_media_id"
            r3.AAJ(r0, r9)
            java.lang.String r1 = r6.A0p
            java.lang.String r0 = "chaining_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1M
            java.lang.String r0 = "viewer_session_id"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0c
            if (r0 == 0) goto L_0x017b
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x017b:
            java.lang.String r0 = "video_width"
            r3.A9F(r0, r10)
            java.lang.Integer r0 = r6.A0a
            if (r0 == 0) goto L_0x039a
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x018d:
            java.lang.String r0 = "video_height"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0W
            if (r0 == 0) goto L_0x0397
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x019f:
            java.lang.String r10 = "recent_bandwidth"
            r3.A9F(r10, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_dash_eligible"
            r3.A7p(r0, r1)
            java.lang.String r1 = r6.A0y
            java.lang.String r0 = "inventory_source"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A16
            java.lang.String r0 = "playback_format"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1K
            java.lang.String r0 = "video_codec"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "is_replay"
            r3.A7p(r0, r9)
            java.lang.String r0 = "thread_id"
            r3.AAJ(r0, r9)
            java.lang.String r1 = r6.A0h
            java.lang.String r0 = "audience"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0t
            java.lang.String r0 = "effect_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0r
            java.lang.String r0 = "channel_pk"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1A
            java.lang.String r0 = "ranking_info_token"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A11
            java.lang.String r0 = "mezql_token"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0s
            java.lang.String r0 = "discovery_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0o
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            java.lang.Boolean r1 = r6.A09
            java.lang.String r0 = "is_video_to_carousel"
            r3.A7p(r0, r1)
            java.lang.Integer r0 = r6.A0X
            if (r0 == 0) goto L_0x0394
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0211:
            java.lang.String r0 = "client_sample_weight"
            r3.A9F(r0, r1)
            java.lang.String r1 = r6.A0q
            java.lang.String r0 = "connection_type"
            r3.AAJ(r0, r1)
            java.lang.Double r1 = r6.A0B
            java.lang.String r0 = "device_lat"
            r3.A8D(r0, r1)
            java.lang.Double r1 = r6.A0C
            java.lang.String r0 = "device_long"
            r3.A8D(r0, r1)
            java.lang.String r1 = r6.A0w
            java.lang.String r0 = "displayed_frames"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0u
            java.lang.String r0 = "error_message"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0m
            java.lang.String r0 = "hardware_address"
            r3.AAJ(r0, r1)
            java.util.HashMap r1 = r6.A1Q
            if (r1 == 0) goto L_0x0391
            java.lang.String r0 = "is_network_roaming"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x024c:
            java.lang.String r0 = "is_network_roaming"
            r3.AAJ(r0, r1)
            java.util.HashMap r1 = r6.A1Q
            if (r1 == 0) goto L_0x038e
            java.lang.String r0 = "network_generation"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x025d:
            java.lang.String r0 = "network_generation"
            r3.AAJ(r0, r1)
            java.util.HashMap r1 = r6.A1Q
            if (r1 == 0) goto L_0x038b
            java.lang.String r0 = "network_params"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x026e:
            java.lang.String r0 = "network_params"
            r3.AAJ(r0, r1)
            java.util.HashMap r1 = r6.A1Q
            if (r1 == 0) goto L_0x0388
            java.lang.String r0 = "network_type_info"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x027f:
            java.lang.String r0 = "network_type_info"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A14
            java.lang.String r0 = "original_start_reason"
            r3.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "pip"
            r3.A7p(r0, r1)
            java.lang.String r1 = r6.A18
            java.lang.String r0 = "random_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1B
            java.lang.String r0 = "reason"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0W
            if (r0 == 0) goto L_0x0385
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x02af:
            r3.A9F(r10, r0)
            java.lang.String r1 = r6.A1D
            java.lang.String r0 = "resource_url"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0b
            if (r0 == 0) goto L_0x0382
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02c6:
            java.lang.String r0 = "segment_count"
            r3.A9F(r0, r1)
            java.lang.Float r0 = r6.A0P
            if (r0 == 0) goto L_0x037f
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x02d8:
            java.lang.String r0 = "view_height"
            r3.A8D(r0, r1)
            java.lang.Float r0 = r6.A0Q
            if (r0 == 0) goto L_0x037c
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x02ea:
            java.lang.String r0 = "view_width"
            r3.A8D(r0, r1)
            java.lang.String r0 = "frame_events"
            r3.AAJ(r0, r9)
            java.lang.String r1 = r6.A13
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0z
            java.lang.String r0 = "session_validation_token"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A1E
            java.lang.String r0 = "search_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A19
            java.lang.String r0 = "rank_token"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A17
            java.lang.String r0 = "query_text"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0i
            if (r1 == 0) goto L_0x037a
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x0321:
            java.lang.String r0 = "audio_derived_content_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = r6.A1H
            java.lang.String r10 = "defaultValue"
            r1 = r10
            if (r0 == 0) goto L_0x0378
            r1 = r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0378
        L_0x0334:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r5)
            r0 = r15
            r6.append(r0)
            java.lang.String r9 = r6.toString()
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05
            byte[] r0 = r10.getBytes(r0)
            X.0qQ.A07(r0)
            java.lang.String r1 = "HmacSHA256"
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r0, r1)
            java.lang.String r18 = "hmacSha256"
            java.lang.String r17 = "Hashing."
            java.lang.String r19 = "(Key[algorithm="
            java.lang.String r20 = r6.getAlgorithm()
            java.lang.String r21 = ", format="
            java.lang.String r22 = r6.getFormat()
            java.lang.String r23 = "])"
            java.lang.String r0 = X.002.A15(r17, r18, r19, r20, r21, r22, r23)
            javax.crypto.Mac r8 = X.C297425rj.A00(r1, r6)
            r0.getClass()
            r8.getMacLength()
            goto L_0x03a6
        L_0x0378:
            r10 = r1
            goto L_0x0334
        L_0x037a:
            r1 = 0
            goto L_0x0321
        L_0x037c:
            r1 = 0
            goto L_0x02ea
        L_0x037f:
            r1 = 0
            goto L_0x02d8
        L_0x0382:
            r1 = 0
            goto L_0x02c6
        L_0x0385:
            r0 = 0
            goto L_0x02af
        L_0x0388:
            r1 = 0
            goto L_0x027f
        L_0x038b:
            r1 = 0
            goto L_0x026e
        L_0x038e:
            r1 = 0
            goto L_0x025d
        L_0x0391:
            r1 = 0
            goto L_0x024c
        L_0x0394:
            r1 = 0
            goto L_0x0211
        L_0x0397:
            r0 = 0
            goto L_0x019f
        L_0x039a:
            r1 = 0
            goto L_0x018d
        L_0x039d:
            r1 = 0
            goto L_0x013b
        L_0x03a0:
            r1 = 0
            goto L_0x0111
        L_0x03a3:
            r1 = 0
            goto L_0x00ce
        L_0x03a6:
            r8.clone()     // Catch:{ CloneNotSupportedException -> 0x03aa }
            goto L_0x03ac
        L_0x03aa:
            r0 = 0
            goto L_0x03ad
        L_0x03ac:
            r0 = 1
        L_0x03ad:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            if (r0 == 0) goto L_0x03c7
            java.lang.Object r0 = r8.clone()     // Catch:{ CloneNotSupportedException -> 0x03c7 }
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch:{ CloneNotSupportedException -> 0x03c7 }
            X.5rk r5 = new X.5rk     // Catch:{ CloneNotSupportedException -> 0x03c7 }
            r5.<init>(r0)     // Catch:{ CloneNotSupportedException -> 0x03c7 }
            goto L_0x03d4
        L_0x03bd:
            java.lang.String r1 = "seqNum number should not be null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03c5:
            r9 = 0
            goto L_0x040e
        L_0x03c7:
            java.lang.String r0 = r8.getAlgorithm()
            javax.crypto.Mac r0 = X.C297425rj.A00(r0, r6)
            X.5rk r5 = new X.5rk
            r5.<init>(r0)
        L_0x03d4:
            java.lang.String r0 = r9.toString()
            byte[] r0 = r0.getBytes(r1)
            r0.getClass()
            r5.A01(r0)
            boolean r0 = r5.A00
            r1 = r0 ^ 1
            java.lang.String r0 = "Cannot re-use a Hasher after calling hash() on it"
            X.17k.A0H(r1, r0)
            r5.A00 = r2
            javax.crypto.Mac r0 = r5.A01
            byte[] r1 = r0.doFinal()
            X.2RS r0 = new X.2RS
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            X.0qQ.A07(r1)
            java.lang.String r0 = "client_secret_key"
            r3.AAJ(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "client_high_res_time_ms"
            r3.A9F(r0, r1)
            r9 = 1
        L_0x040e:
            X.4OC r6 = r4.A07
            if (r6 == 0) goto L_0x0660
            if (r9 == 0) goto L_0x05d9
            java.lang.Integer r0 = r6.A0K
            if (r0 == 0) goto L_0x077d
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0421:
            java.lang.String r0 = "reel_position"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0L
            if (r0 == 0) goto L_0x077a
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0433:
            java.lang.String r0 = "reel_size"
            r3.A9F(r0, r1)
            java.lang.Boolean r1 = r6.A03
            java.lang.String r0 = "is_replay"
            r3.A7p(r0, r1)
            r1 = 0
            java.lang.String r0 = "host_video_pk"
            r3.AAJ(r0, r1)
            java.lang.Long r1 = r6.A0O
            java.lang.String r0 = "starting_clips_media_id"
            r3.A9F(r0, r1)
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = "starting_clips_ranking_info_token"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0A
            if (r0 == 0) goto L_0x0777
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0460:
            java.lang.String r0 = "session_reel_counter"
            r3.A9F(r0, r1)
            java.lang.String r1 = r6.A0a
            java.lang.String r0 = "tray_session_id"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0N
            if (r0 == 0) goto L_0x0774
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0479:
            java.lang.String r0 = "tray_position"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0H
            if (r0 == 0) goto L_0x0771
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x048b:
            java.lang.String r0 = "mqtt_connection_status"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A06
            if (r0 == 0) goto L_0x076e
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x049d:
            java.lang.String r0 = "battery_level"
            r3.A9F(r0, r1)
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = "battery_status"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0E
            if (r0 == 0) goto L_0x076b
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04b6:
            java.lang.String r0 = "live_donation"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0J
            if (r0 == 0) goto L_0x0768
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04c8:
            java.lang.String r0 = "number_of_qualities"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0F
            if (r0 == 0) goto L_0x0765
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04da:
            java.lang.String r0 = "is_live_streaming"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0C
            if (r0 == 0) goto L_0x0762
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04ec:
            java.lang.String r0 = "has_igtv_video"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0D
            if (r0 == 0) goto L_0x075f
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04fe:
            java.lang.String r0 = "has_reshared_clips_video"
            r3.A9F(r0, r1)
            r1 = 0
            java.lang.String r0 = "channel_id"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "channel_type"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "channel_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0Z
            java.lang.String r0 = "subtype"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0V
            java.lang.String r0 = "position"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0W
            java.lang.String r0 = "size"
            r3.AAJ(r0, r1)
            java.lang.Long r1 = r6.A0P
            java.lang.String r0 = "type"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A07
            if (r0 == 0) goto L_0x075c
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x053c:
            java.lang.String r0 = "carousel_index"
            r3.A9F(r0, r1)
            java.lang.String r1 = r6.A0S
            java.lang.String r0 = "carousel_media_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A0R
            java.lang.String r0 = "carousel_cover_media_id"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A09
            if (r0 == 0) goto L_0x0759
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x055c:
            java.lang.String r0 = "carousel_size"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A08
            if (r0 == 0) goto L_0x0756
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x056e:
            java.lang.String r0 = "carousel_m_t"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r6.A0M
            if (r0 == 0) goto L_0x0753
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0580:
            java.lang.String r0 = "stale_mpd_count"
            r3.A9F(r0, r1)
            java.lang.Boolean r1 = r6.A04
            java.lang.String r0 = "video_subtitles_available"
            r3.A7p(r0, r1)
            java.lang.Boolean r1 = r6.A05
            java.lang.String r0 = "video_subtitles_displayed"
            r3.A7p(r0, r1)
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L_0x0599
            r0 = 1
        L_0x0599:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_multi_ads"
            r3.A7p(r0, r1)
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r0 = r6.A00
            if (r0 == 0) goto L_0x0750
            java.lang.Integer r0 = r0.BUY()
            if (r0 == 0) goto L_0x0750
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x05b5:
            java.lang.String r0 = "multi_ads_type"
            r3.A9F(r0, r1)
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r0 = r6.A00
            if (r0 == 0) goto L_0x074d
            java.lang.String r1 = r0.BUa()
        L_0x05c2:
            java.lang.String r0 = "multi_ads_unit_id"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A0I
            if (r0 == 0) goto L_0x074a
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x05d4:
            java.lang.String r0 = "position_in_multi_ads_unit"
            r3.A9F(r0, r1)
        L_0x05d9:
            X.5rl r8 = new X.5rl
            r8.<init>()
            r1 = 0
            java.lang.String r0 = "igtv_destination_session_id"
            r8.A06(r0, r1)
            java.lang.String r0 = "entry_point"
            r8.A06(r0, r1)
            java.lang.String r0 = "surface"
            r8.A06(r0, r1)
            java.lang.String r0 = "component_type"
            r8.A06(r0, r1)
            java.lang.String r0 = "was_live"
            r8.A03(r0, r1)
            java.lang.String r0 = "video_x_position"
            r8.A05(r0, r1)
            java.lang.String r0 = "video_y_position"
            r8.A05(r0, r1)
            java.lang.String r0 = "source_channel_type"
            r8.A06(r0, r1)
            java.lang.Boolean r1 = r6.A04
            java.lang.String r0 = "captions_available"
            r8.A03(r0, r1)
            java.lang.Boolean r1 = r6.A05
            java.lang.String r0 = "captions_displayed"
            r8.A03(r0, r1)
            java.lang.String r1 = r6.A0Y
            if (r1 == 0) goto L_0x0747
            r0 = 10
            java.lang.Long r5 = X.00y.A0n(r0, r1)
        L_0x061f:
            java.lang.String r1 = r6.A0X
            if (r1 == 0) goto L_0x0744
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x0629:
            java.lang.String r0 = "story_preview_media_owner_id"
            r8.A05(r0, r5)
            java.lang.String r0 = "story_preview_media_id"
            r8.A05(r0, r1)
            if (r9 == 0) goto L_0x063a
            java.lang.String r0 = "adhoc_data"
            r3.AAK(r8, r0)
        L_0x063a:
            X.4O3 r0 = r4.A06
            if (r0 == 0) goto L_0x0642
            java.lang.String r0 = r0.A16
            if (r0 != 0) goto L_0x0660
        L_0x0642:
            java.lang.Integer r0 = r6.A0B
            if (r0 == 0) goto L_0x064d
            int r0 = r0.intValue()
            r5 = 1
            if (r0 == r2) goto L_0x064e
        L_0x064d:
            r5 = 0
        L_0x064e:
            if (r9 == 0) goto L_0x0660
            java.lang.String r1 = r6.A0U
            java.lang.String r0 = "playback_format"
            r3.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_dash_eligible"
            r3.A7p(r0, r1)
        L_0x0660:
            X.4O3 r0 = r4.A06
            if (r0 == 0) goto L_0x0740
            java.lang.String r1 = r0.A0x
            if (r1 == 0) goto L_0x0740
            if (r9 == 0) goto L_0x0678
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "host_profile_id"
            r3.A9F(r0, r1)
        L_0x0675:
            r3.Cgf()
        L_0x0678:
            X.0xi r0 = X.0tS.A4E
            X.0tS r0 = r0.A00()
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0739
            com.instagram.common.session.UserSession r0 = r4.A05
            X.VPt r5 = new X.VPt
            r5.<init>(r0)
            X.4OC r0 = r4.A07
            if (r0 == 0) goto L_0x0693
            java.lang.String r2 = r0.A0S
            if (r2 != 0) goto L_0x0699
        L_0x0693:
            X.4O3 r0 = r4.A06
            if (r0 == 0) goto L_0x073d
            java.lang.String r2 = r0.A10
        L_0x0699:
            X.4O3 r0 = r4.A06
            if (r0 == 0) goto L_0x073a
            java.lang.String r1 = r0.A1I
            java.lang.String r0 = "ad"
            boolean r6 = r1.equals(r0)
        L_0x06a5:
            if (r2 == 0) goto L_0x0739
            java.lang.String[] r4 = X.AnonymousClass4OU.A00(r2)
            r3 = 0
            if (r4 == 0) goto L_0x06b3
            int r0 = r4.length
            if (r7 >= r0) goto L_0x06b3
            r3 = r4[r7]
        L_0x06b3:
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x06b8
            r3 = r2
        L_0x06b8:
            if (r4 == 0) goto L_0x06c3
            r1 = 1
            int r0 = r4.length
            if (r1 >= r0) goto L_0x06c3
            r0 = r4[r1]
            if (r0 == 0) goto L_0x06c3
            r2 = r0
        L_0x06c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r0 = 58
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ":567067343352427:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":0"
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            X.SR1.A00()
            android.view.View r1 = X.SR1.A01
            if (r1 == 0) goto L_0x072b
            r0 = 2131443964(0x7f0b40fc, float:1.851001E38)
            android.view.View r8 = r1.findViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0 = -256(0xffffffffffffff00, float:NaN)
            r8.setBackgroundColor(r0)
            android.content.Context r3 = X.SR1.A00
            if (r3 == 0) goto L_0x072b
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r3)
            r1 = -2
            android.widget.TableRow$LayoutParams r0 = new android.widget.TableRow$LayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            r1 = 20
            r0 = 5
            r2.setPadding(r1, r0, r7, r0)
            java.lang.String r0 = "Loading Phuji Data...."
            r2.setText(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r0)
            r0 = 1106247680(0x41f00000, float:30.0)
            r2.setTextSize(r0)
            android.widget.TableRow r0 = new android.widget.TableRow
            r0.<init>(r3)
            r0.addView(r2)
            r8.addView(r0)
        L_0x072b:
            X.0no r3 = X.0no.A00()
            X.Ujy r2 = new X.Ujy
            r2.<init>(r5, r4, r6)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.A01(r2, r0)
        L_0x0739:
            return
        L_0x073a:
            r6 = 0
            goto L_0x06a5
        L_0x073d:
            r2 = 0
            goto L_0x0699
        L_0x0740:
            if (r9 == 0) goto L_0x0678
            goto L_0x0675
        L_0x0744:
            r1 = 0
            goto L_0x0629
        L_0x0747:
            r5 = 0
            goto L_0x061f
        L_0x074a:
            r1 = 0
            goto L_0x05d4
        L_0x074d:
            r1 = 0
            goto L_0x05c2
        L_0x0750:
            r1 = 0
            goto L_0x05b5
        L_0x0753:
            r1 = 0
            goto L_0x0580
        L_0x0756:
            r1 = 0
            goto L_0x056e
        L_0x0759:
            r1 = 0
            goto L_0x055c
        L_0x075c:
            r1 = 0
            goto L_0x053c
        L_0x075f:
            r1 = 0
            goto L_0x04fe
        L_0x0762:
            r1 = 0
            goto L_0x04ec
        L_0x0765:
            r1 = 0
            goto L_0x04da
        L_0x0768:
            r1 = 0
            goto L_0x04c8
        L_0x076b:
            r1 = 0
            goto L_0x04b6
        L_0x076e:
            r1 = 0
            goto L_0x049d
        L_0x0771:
            r1 = 0
            goto L_0x048b
        L_0x0774:
            r1 = 0
            goto L_0x0479
        L_0x0777:
            r1 = 0
            goto L_0x0460
        L_0x077a:
            r1 = 0
            goto L_0x0433
        L_0x077d:
            r1 = 0
            goto L_0x0421
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297415ri.A00(X.0Ae):void");
    }
}
