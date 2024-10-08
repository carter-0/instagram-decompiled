package X;

public final class XQ5 extends C263934Nx {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r2 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
        if (r6 == null) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C58840Ae r16) {
        /*
            r15 = this;
            r14 = 0
            r1 = r16
            X.0qQ.A0B(r1, r14)
            r0 = 5375(0x14ff, float:7.532E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0188
            X.4O3 r2 = r15.A06
            if (r2 == 0) goto L_0x001e
            java.lang.String r13 = r2.A10
            if (r13 != 0) goto L_0x0020
        L_0x001e:
            java.lang.String r13 = "0"
        L_0x0020:
            r4 = 0
            if (r2 == 0) goto L_0x0028
            X.4Ny r12 = r2.A00
            if (r12 != 0) goto L_0x018f
        L_0x0028:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            X.4Ny r12 = new X.4Ny
            r12.<init>(r0)
            if (r2 != 0) goto L_0x018f
            java.lang.String r11 = "none"
        L_0x0035:
            X.4OC r6 = r15.A07
            r8 = 0
            if (r6 == 0) goto L_0x018c
            java.lang.Integer r0 = r6.A0F
            if (r0 == 0) goto L_0x018c
            int r1 = r0.intValue()
        L_0x0042:
            if (r2 == 0) goto L_0x0048
            java.lang.Float r10 = r2.A0J
            if (r10 != 0) goto L_0x004e
        L_0x0048:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            if (r2 == 0) goto L_0x0189
        L_0x004e:
            java.lang.Integer r0 = r2.A0W
            if (r0 == 0) goto L_0x0189
            int r9 = r0.intValue()
        L_0x0056:
            if (r6 == 0) goto L_0x0061
            java.lang.Integer r0 = r6.A0A
            if (r0 == 0) goto L_0x0061
            int r0 = r0.intValue()
            long r4 = (long) r0
        L_0x0061:
            if (r2 == 0) goto L_0x0067
            java.lang.Float r7 = r2.A0H
            if (r7 != 0) goto L_0x006b
        L_0x0067:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
        L_0x006b:
            if (r6 == 0) goto L_0x0079
            java.lang.Integer r0 = r6.A0N
            if (r0 == 0) goto L_0x0075
            int r8 = r0.intValue()
        L_0x0075:
            java.lang.String r6 = r6.A0a
            if (r6 != 0) goto L_0x007b
        L_0x0079:
            java.lang.String r6 = ""
        L_0x007b:
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = r2.A1M
            if (r2 != 0) goto L_0x0083
        L_0x0081:
            java.lang.String r2 = "c"
        L_0x0083:
            X.C51965G9l.A1I(r3, r13)
            java.lang.String r0 = "a_pk"
            r3.AAE(r12, r0)
            java.lang.String r0 = "a_i"
            java.lang.Long r1 = X.DbV.A0p(r3, r0, r11, r1)
            java.lang.String r0 = "is_live_streaming"
            X.C21055XCg.A1H(r3, r1, r10, r0)
            long r0 = (long) r9
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "recent_bandwidth"
            r3.A9F(r0, r1)
            X.C21055XCg.A1I(r3, r7, r8, r4)
            java.lang.String r0 = "tray_session_id"
            r3.AAJ(r0, r6)
            java.lang.String r0 = "viewer_session_id"
            r3.AAJ(r0, r2)
            X.4O3 r4 = r15.A06
            r2 = 0
            if (r4 == 0) goto L_0x012f
            java.lang.Boolean r0 = r4.A05
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            boolean r6 = X.0qQ.A0K(r0, r1)
            java.lang.Boolean r0 = r4.A04
            boolean r5 = X.0qQ.A0K(r0, r1)
            java.lang.Integer r0 = r4.A0Y
            if (r0 == 0) goto L_0x00cf
            java.lang.Long r1 = X.C51969G9p.A0r(r0)
            java.lang.String r0 = "seq_num"
            r3.A9F(r0, r1)
        L_0x00cf:
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r4.A1H
            java.lang.String r0 = "tracking_token"
            java.lang.Long r1 = X.DbV.A0p(r3, r0, r1, r6)
            java.lang.String r0 = "audio_fetched"
            r3.A9F(r0, r1)
            java.lang.Float r0 = r4.A0I
            java.lang.Double r1 = X.C21053XCe.A0Z(r0)
            java.lang.String r0 = "duration"
            r3.A8D(r0, r1)
            java.lang.String r1 = r4.A0v
            java.lang.String r0 = "follow_status"
            r3.AAJ(r0, r1)
            java.lang.Boolean r1 = r4.A09
            java.lang.String r0 = "is_video_to_carousel"
            r3.A7p(r0, r1)
            java.lang.Long r1 = r4.A0f
            java.lang.String r0 = "m_ts"
            r3.A9F(r0, r1)
            long r0 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "playing_audio"
            r3.A9F(r0, r1)
            java.lang.String r0 = "system_volume"
            r3.A8D(r0, r2)
            java.lang.String r1 = r4.A1L
            java.lang.String r0 = "video_type"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r4.A0T
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "is_dash_eligible"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r4.A0c
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "video_width"
            r3.A9F(r0, r1)
        L_0x012f:
            X.4OC r4 = r15.A07
            if (r4 == 0) goto L_0x0185
            java.lang.Integer r0 = r4.A06
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "battery_level"
            r3.A9F(r0, r1)
            java.lang.String r1 = r4.A0Q
            java.lang.String r0 = "battery_status"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r4.A0E
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "live_donation"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r4.A0H
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "mqtt_connection_status"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r4.A0J
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "number_of_qualities"
            r3.A9F(r0, r1)
            java.lang.String r1 = r4.A0U
            java.lang.String r0 = "playback_format"
            r3.AAJ(r0, r1)
            java.lang.Integer r0 = r4.A0K
            java.lang.Long r1 = X.C21054XCf.A07(r0)
            java.lang.String r0 = "reel_position"
            r3.A9F(r0, r1)
            java.lang.Integer r0 = r4.A0L
            if (r0 == 0) goto L_0x0180
            java.lang.Long r2 = X.C51969G9p.A0r(r0)
        L_0x0180:
            java.lang.String r0 = "reel_size"
            r3.A9F(r0, r2)
        L_0x0185:
            r3.Cgf()
        L_0x0188:
            return
        L_0x0189:
            r9 = 0
            goto L_0x0056
        L_0x018c:
            r1 = 0
            goto L_0x0042
        L_0x018f:
            java.lang.String r11 = r2.A1I
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ5.A00(X.0Ae):void");
    }
}
