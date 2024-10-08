package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Nx  reason: invalid class name and case insensitive filesystem */
public abstract class C263934Nx {
    public int A00 = -1;
    public int A01 = -1;
    public long A02 = -1;
    public C264094Oo A03;
    public C263944Ny A04 = new C263944Ny(0L);
    public UserSession A05;
    public AnonymousClass4O3 A06;
    public AnonymousClass4OC A07;
    public Boolean A08;
    public String A09 = "";
    public String A0A;
    public String A0B = "dash";
    public String A0C;
    public String A0D = NetInfoModule.CONNECTION_TYPE_NONE;
    public String A0E;
    public String A0F;

    /* JADX WARNING: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C58840Ae r9) {
        /*
            r8 = this;
            boolean r1 = r8 instanceof X.AnonymousClass4WH
            r0 = 0
            if (r1 == 0) goto L_0x0397
            X.0qQ.A0B(r9, r0)
            java.lang.String r1 = "video_audio_disabled"
            X.0wc r9 = (X.0wc) r9
            X.0kJ r0 = r9.A00
            X.0Aj r2 = r9.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0356
            X.4O3 r3 = r8.A06
            r4 = 0
            if (r3 == 0) goto L_0x0394
            java.lang.Integer r0 = r3.A0Y
            if (r0 == 0) goto L_0x0731
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "seq_num"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A10
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "0"
        L_0x0035:
            java.lang.String r0 = "m_pk"
            r2.AAJ(r0, r1)
            X.4Ny r1 = r3.A00
            r5 = 0
            if (r1 != 0) goto L_0x0049
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            X.4Ny r1 = new X.4Ny
            r1.<init>(r0)
        L_0x0049:
            java.lang.String r0 = "a_pk"
            r2.AAE(r1, r0)
            java.lang.Float r0 = r3.A0L
            if (r0 == 0) goto L_0x0725
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "loop_count"
            r2.A8D(r0, r1)
            java.lang.Boolean r1 = r3.A05
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006f
            r5 = 1
        L_0x006f:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "audio_fetched"
            r2.A9F(r0, r1)
            java.lang.Float r0 = r3.A0I
            if (r0 == 0) goto L_0x0391
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0085:
            java.lang.String r0 = "duration"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A0v
            java.lang.String r0 = "follow_status"
            r2.AAJ(r0, r1)
            r5 = r4
            java.lang.String r0 = "system_volume"
            r2.A8D(r0, r4)
            java.lang.Integer r0 = r3.A0T
            if (r0 == 0) goto L_0x038e
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x00a4:
            java.lang.String r0 = "is_dash_eligible"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = r3.A09
            java.lang.String r0 = "is_video_to_carousel"
            r2.A7p(r0, r1)
            java.lang.Integer r0 = r3.A0S
            if (r0 == 0) goto L_0x038b
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x00bd:
            java.lang.String r0 = "m_ix"
            r2.A9F(r0, r1)
            java.lang.Long r1 = r3.A0f
            java.lang.String r0 = "m_ts"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A16
            java.lang.String r0 = "playback_format"
            r2.AAJ(r0, r1)
            java.lang.Boolean r1 = r3.A04
            java.lang.String r0 = "playing_audio"
            r2.A7p(r0, r1)
            java.lang.String r1 = r3.A0l
            java.lang.String r0 = "source"
            r2.AAJ(r0, r1)
            java.lang.Float r0 = r3.A0H
            if (r0 == 0) goto L_0x00eb
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
        L_0x00eb:
            java.lang.String r0 = "time"
            r2.A8D(r0, r5)
            java.lang.Double r1 = r3.A0D
            java.lang.String r0 = "timeAsPercent"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A1H
            java.lang.String r0 = "tracking_token"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A1K
            java.lang.String r0 = "video_codec"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A1L
            java.lang.String r0 = "video_type"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r3.A0c
            if (r0 == 0) goto L_0x0388
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0119:
            java.lang.String r0 = "video_width"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A1M
            java.lang.String r0 = "viewer_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0p
            java.lang.String r0 = "chaining_session_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r3.A0W
            if (r0 == 0) goto L_0x0385
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0139:
            java.lang.String r0 = "recent_bandwidth"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A1I
            java.lang.String r0 = "a_i"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A13
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0j
            r0 = 3018(0xbca, float:4.229E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAJ(r0, r1)
            r7 = 1
        L_0x0158:
            X.4OC r5 = r8.A07
            if (r5 == 0) goto L_0x033e
            if (r7 == 0) goto L_0x02bb
            java.lang.Integer r0 = r5.A0K
            if (r0 == 0) goto L_0x0382
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x016b:
            java.lang.String r0 = "reel_position"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0L
            if (r0 == 0) goto L_0x037f
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x017d:
            java.lang.String r0 = "reel_size"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = r5.A03
            java.lang.String r0 = "is_replay"
            r2.A7p(r0, r1)
            java.lang.String r0 = "host_video_pk"
            r2.AAJ(r0, r4)
            java.lang.Integer r0 = r5.A0A
            if (r0 == 0) goto L_0x037c
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x019b:
            java.lang.String r0 = "session_reel_counter"
            r2.A9F(r0, r1)
            java.lang.String r1 = r5.A0a
            java.lang.String r0 = "tray_session_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A0N
            if (r0 == 0) goto L_0x0379
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x01b4:
            java.lang.String r0 = "tray_position"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0H
            if (r0 == 0) goto L_0x0376
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x01c6:
            java.lang.String r0 = "mqtt_connection_status"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A06
            if (r0 == 0) goto L_0x0373
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x01d8:
            java.lang.String r0 = "battery_level"
            r2.A9F(r0, r1)
            java.lang.String r1 = r5.A0Q
            java.lang.String r0 = "battery_status"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A0E
            if (r0 == 0) goto L_0x0370
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x01f1:
            java.lang.String r0 = "live_donation"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0J
            if (r0 == 0) goto L_0x036d
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0203:
            java.lang.String r0 = "number_of_qualities"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0F
            if (r0 == 0) goto L_0x036a
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0215:
            java.lang.String r0 = "is_live_streaming"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0C
            if (r0 == 0) goto L_0x0367
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0227:
            java.lang.String r0 = "has_igtv_video"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0D
            if (r0 == 0) goto L_0x0364
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0239:
            java.lang.String r0 = "has_reshared_clips_video"
            r2.A9F(r0, r1)
            java.lang.String r0 = "channel_id"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "channel_type"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "channel_session_id"
            r2.AAJ(r0, r4)
            java.lang.String r1 = r5.A0Z
            java.lang.String r0 = "subtype"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.A0V
            java.lang.String r0 = "position"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.A0W
            java.lang.String r0 = "size"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = r5.A0P
            java.lang.String r0 = "type"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A07
            if (r0 == 0) goto L_0x0361
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0276:
            java.lang.String r0 = "carousel_index"
            r2.A9F(r0, r1)
            java.lang.String r1 = r5.A0S
            java.lang.String r0 = "carousel_media_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.A0R
            java.lang.String r0 = "carousel_cover_media_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A09
            if (r0 == 0) goto L_0x035e
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0296:
            java.lang.String r0 = "carousel_size"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A08
            if (r0 == 0) goto L_0x035b
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x02a8:
            java.lang.String r0 = "carousel_m_t"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = r5.A04
            java.lang.String r0 = "video_subtitles_available"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = r5.A05
            java.lang.String r0 = "video_subtitles_displayed"
            r2.A7p(r0, r1)
        L_0x02bb:
            X.5M6 r6 = new X.5M6
            r6.<init>()
            java.lang.String r0 = "igtv_destination_session_id"
            r6.A06(r0, r4)
            java.lang.String r0 = "entry_point"
            r6.A06(r0, r4)
            java.lang.String r0 = "surface"
            r6.A06(r0, r4)
            java.lang.String r0 = "component_type"
            r6.A06(r0, r4)
            java.lang.String r0 = "was_live"
            r6.A03(r0, r4)
            java.lang.String r0 = "video_x_position"
            r6.A05(r0, r4)
            java.lang.String r0 = "video_y_position"
            r6.A05(r0, r4)
            java.lang.String r0 = "source_channel_type"
            r6.A06(r0, r4)
            java.lang.Boolean r1 = r5.A04
            java.lang.String r0 = "captions_available"
            r6.A03(r0, r1)
            java.lang.Boolean r1 = r5.A05
            java.lang.String r0 = "captions_displayed"
            r6.A03(r0, r1)
            java.lang.String r1 = r5.A0Y
            if (r1 == 0) goto L_0x0359
            r0 = 10
            java.lang.Long r3 = X.00y.A0n(r0, r1)
        L_0x0300:
            java.lang.String r1 = r5.A0X
            if (r1 == 0) goto L_0x0357
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x030a:
            java.lang.String r0 = "story_preview_media_owner_id"
            r6.A05(r0, r3)
            java.lang.String r0 = "story_preview_media_id"
            r6.A05(r0, r1)
            if (r7 == 0) goto L_0x031b
            java.lang.String r0 = "adhoc_data"
            r2.AAK(r6, r0)
        L_0x031b:
            X.4O3 r0 = r8.A06
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r0.A16
            if (r0 != 0) goto L_0x033e
        L_0x0323:
            if (r7 == 0) goto L_0x033e
            java.lang.String r1 = r5.A0U
            java.lang.String r0 = "playback_format"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A0B
            if (r0 == 0) goto L_0x0339
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x0339:
            java.lang.String r0 = "is_dash_eligible"
            r2.A9F(r0, r4)
        L_0x033e:
            X.4O3 r0 = r8.A06
            if (r0 == 0) goto L_0x0721
            java.lang.String r1 = r0.A0x
            if (r1 == 0) goto L_0x0721
            if (r7 == 0) goto L_0x0356
            r0 = 10
            java.lang.Long r4 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "host_profile_id"
        L_0x0350:
            r2.A9F(r0, r4)
        L_0x0353:
            r2.Cgf()
        L_0x0356:
            return
        L_0x0357:
            r1 = r4
            goto L_0x030a
        L_0x0359:
            r3 = r4
            goto L_0x0300
        L_0x035b:
            r1 = r4
            goto L_0x02a8
        L_0x035e:
            r1 = r4
            goto L_0x0296
        L_0x0361:
            r1 = r4
            goto L_0x0276
        L_0x0364:
            r1 = r4
            goto L_0x0239
        L_0x0367:
            r1 = r4
            goto L_0x0227
        L_0x036a:
            r1 = r4
            goto L_0x0215
        L_0x036d:
            r1 = r4
            goto L_0x0203
        L_0x0370:
            r1 = r4
            goto L_0x01f1
        L_0x0373:
            r1 = r4
            goto L_0x01d8
        L_0x0376:
            r1 = r4
            goto L_0x01c6
        L_0x0379:
            r1 = r4
            goto L_0x01b4
        L_0x037c:
            r1 = r4
            goto L_0x019b
        L_0x037f:
            r1 = r4
            goto L_0x017d
        L_0x0382:
            r1 = r4
            goto L_0x016b
        L_0x0385:
            r1 = r4
            goto L_0x0139
        L_0x0388:
            r1 = r4
            goto L_0x0119
        L_0x038b:
            r1 = r4
            goto L_0x00bd
        L_0x038e:
            r1 = r4
            goto L_0x00a4
        L_0x0391:
            r1 = r4
            goto L_0x0085
        L_0x0394:
            r7 = 0
            goto L_0x0158
        L_0x0397:
            X.0qQ.A0B(r9, r0)
            java.lang.String r1 = "video_playback_warning"
            X.0wc r9 = (X.0wc) r9
            X.0kJ r0 = r9.A00
            X.0Aj r2 = r9.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0356
            X.4O3 r3 = r8.A06
            r4 = 0
            if (r3 == 0) goto L_0x071e
            java.lang.String r7 = r3.A10
            if (r7 != 0) goto L_0x03b5
            java.lang.String r7 = "0"
        L_0x03b5:
            X.4Ny r6 = r3.A00
            if (r6 != 0) goto L_0x03c4
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.4Ny r6 = new X.4Ny
            r6.<init>(r0)
        L_0x03c4:
            java.lang.String r1 = r3.A1I
            java.lang.String r5 = r3.A0u
            if (r5 == 0) goto L_0x073d
            java.lang.String r0 = "a_i"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = r6.A00
            java.lang.String r0 = "a_pk"
            r2.A9F(r0, r1)
            java.lang.String r0 = "error_message"
            r2.AAJ(r0, r5)
            java.lang.String r0 = "m_pk"
            r2.AAJ(r0, r7)
            java.lang.String r1 = r3.A1H
            java.lang.String r0 = "tracking_token"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r3.A0T
            if (r0 == 0) goto L_0x071b
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x03f4:
            java.lang.String r0 = "is_dash_eligible"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r3.A0Y
            if (r0 == 0) goto L_0x0718
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0406:
            java.lang.String r0 = "seq_num"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A0v
            java.lang.String r0 = "follow_status"
            r2.AAJ(r0, r1)
            java.lang.Float r0 = r3.A0L
            if (r0 == 0) goto L_0x0715
            float r0 = r0.floatValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x041f:
            java.lang.String r0 = "loop_count"
            r2.A9F(r0, r1)
            java.lang.Double r1 = r3.A0D
            java.lang.String r0 = "timeAsPercent"
            r2.A8D(r0, r1)
            java.lang.String r1 = r3.A1L
            java.lang.String r0 = "video_type"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A15
            java.lang.String r0 = "parent_m_pk"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A1C
            java.lang.String r0 = "representation_id"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = r3.A0f
            java.lang.String r0 = "m_ts"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r3.A0S
            if (r0 == 0) goto L_0x0712
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0454:
            java.lang.String r0 = "m_ix"
            r2.A9F(r0, r1)
            java.lang.Float r0 = r3.A0H
            if (r0 == 0) goto L_0x070f
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0466:
            java.lang.String r0 = "time"
            r2.A8D(r0, r1)
            java.lang.Float r0 = r3.A0I
            if (r0 == 0) goto L_0x070c
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0478:
            java.lang.String r0 = "duration"
            r2.A8D(r0, r1)
            java.lang.Float r0 = r3.A0G
            if (r0 == 0) goto L_0x0709
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x048a:
            java.lang.String r0 = "buffering_duration"
            r2.A8D(r0, r1)
            java.lang.String r0 = "system_volume"
            r2.A8D(r0, r4)
            r5 = r4
            java.lang.String r0 = "carousel_index"
            r2.A9F(r0, r4)
            java.lang.String r0 = "carousel_media_id"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "carousel_size"
            r2.A9F(r0, r4)
            java.lang.String r0 = "carousel_cover_media_id"
            r2.AAJ(r0, r4)
            java.lang.String r1 = r3.A0p
            java.lang.String r0 = "chaining_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A1M
            java.lang.String r0 = "viewer_session_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r3.A0c
            if (r0 == 0) goto L_0x04c4
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x04c4:
            java.lang.String r0 = "video_width"
            r2.A9F(r0, r5)
            java.lang.Integer r0 = r3.A0W
            if (r0 == 0) goto L_0x0706
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04d6:
            java.lang.String r0 = "recent_bandwidth"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A16
            java.lang.String r0 = "playback_format"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A1K
            java.lang.String r0 = "video_codec"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0h
            java.lang.String r0 = "audience"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0t
            java.lang.String r0 = "effect_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0r
            java.lang.String r0 = "channel_pk"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A1A
            java.lang.String r0 = "ranking_info_token"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A11
            java.lang.String r0 = "mezql_token"
            r2.AAJ(r0, r1)
            java.lang.Boolean r1 = r3.A09
            java.lang.String r0 = "is_video_to_carousel"
            r2.A7p(r0, r1)
            java.lang.String r1 = r3.A1B
            java.lang.String r0 = "reason"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A13
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            r7 = 1
        L_0x0522:
            X.4OC r5 = r8.A07
            if (r5 == 0) goto L_0x0721
            if (r7 == 0) goto L_0x0659
            java.lang.Integer r0 = r5.A0K
            if (r0 == 0) goto L_0x0703
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0535:
            java.lang.String r0 = "reel_position"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0L
            if (r0 == 0) goto L_0x0700
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0547:
            java.lang.String r0 = "reel_size"
            r2.A9F(r0, r1)
            java.lang.String r0 = "host_video_pk"
            r2.AAJ(r0, r4)
            java.lang.Integer r0 = r5.A0A
            if (r0 == 0) goto L_0x06fd
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x055e:
            java.lang.String r0 = "session_reel_counter"
            r2.A9F(r0, r1)
            java.lang.String r1 = r5.A0a
            java.lang.String r0 = "tray_session_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A0N
            if (r0 == 0) goto L_0x06fa
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0577:
            java.lang.String r0 = "tray_position"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0H
            if (r0 == 0) goto L_0x06f7
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0589:
            java.lang.String r0 = "mqtt_connection_status"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A06
            if (r0 == 0) goto L_0x06f4
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x059b:
            java.lang.String r0 = "battery_level"
            r2.A9F(r0, r1)
            java.lang.String r1 = r5.A0Q
            java.lang.String r0 = "battery_status"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A0J
            if (r0 == 0) goto L_0x06f1
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x05b4:
            java.lang.String r0 = "number_of_qualities"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0F
            if (r0 == 0) goto L_0x06ee
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x05c6:
            java.lang.String r0 = "is_live_streaming"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0C
            if (r0 == 0) goto L_0x06eb
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x05d8:
            java.lang.String r0 = "has_igtv_video"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A0D
            if (r0 == 0) goto L_0x06e8
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x05ea:
            java.lang.String r0 = "has_reshared_clips_video"
            r2.A9F(r0, r1)
            java.lang.String r0 = "channel_id"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "channel_type"
            r2.AAJ(r0, r4)
            java.lang.String r1 = r5.A0Z
            java.lang.String r0 = "subtype"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.A0V
            java.lang.String r0 = "position"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.A0W
            java.lang.String r0 = "size"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = r5.A0P
            java.lang.String r0 = "type"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A07
            if (r0 == 0) goto L_0x06e5
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0622:
            java.lang.String r0 = "carousel_index"
            r2.A9F(r0, r1)
            java.lang.String r1 = r5.A0S
            java.lang.String r0 = "carousel_media_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.A0R
            java.lang.String r0 = "carousel_cover_media_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A09
            if (r0 == 0) goto L_0x06e2
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0642:
            java.lang.String r0 = "carousel_size"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r5.A08
            if (r0 == 0) goto L_0x06df
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0654:
            java.lang.String r0 = "carousel_m_t"
            r2.A9F(r0, r1)
        L_0x0659:
            X.B9J r6 = new X.B9J
            r6.<init>()
            java.lang.String r0 = "igtv_destination_session_id"
            r6.A06(r0, r4)
            java.lang.String r0 = "entry_point"
            r6.A06(r0, r4)
            java.lang.String r0 = "surface"
            r6.A06(r0, r4)
            java.lang.String r0 = "component_type"
            r6.A06(r0, r4)
            java.lang.String r0 = "was_live"
            r6.A03(r0, r4)
            java.lang.String r0 = "video_x_position"
            r6.A05(r0, r4)
            java.lang.String r0 = "video_y_position"
            r6.A05(r0, r4)
            java.lang.String r0 = "source_channel_type"
            r6.A06(r0, r4)
            java.lang.Boolean r1 = r5.A04
            java.lang.String r0 = "captions_available"
            r6.A03(r0, r1)
            java.lang.Boolean r1 = r5.A05
            java.lang.String r0 = "captions_displayed"
            r6.A03(r0, r1)
            java.lang.String r1 = r5.A0Y
            if (r1 == 0) goto L_0x06dd
            r0 = 10
            java.lang.Long r3 = X.00y.A0n(r0, r1)
        L_0x069e:
            java.lang.String r1 = r5.A0X
            if (r1 == 0) goto L_0x06db
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x06a8:
            java.lang.String r0 = "story_preview_media_owner_id"
            r6.A05(r0, r3)
            java.lang.String r0 = "story_preview_media_id"
            r6.A05(r0, r1)
            if (r7 == 0) goto L_0x06b9
            java.lang.String r0 = "adhoc_data"
            r2.AAK(r6, r0)
        L_0x06b9:
            X.4O3 r0 = r8.A06
            if (r0 == 0) goto L_0x06c1
            java.lang.String r0 = r0.A16
            if (r0 != 0) goto L_0x0721
        L_0x06c1:
            if (r7 == 0) goto L_0x0356
            java.lang.String r1 = r5.A0U
            java.lang.String r0 = "playback_format"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r5.A0B
            if (r0 == 0) goto L_0x06d7
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x06d7:
            java.lang.String r0 = "is_dash_eligible"
            goto L_0x0350
        L_0x06db:
            r1 = r4
            goto L_0x06a8
        L_0x06dd:
            r3 = r4
            goto L_0x069e
        L_0x06df:
            r1 = r4
            goto L_0x0654
        L_0x06e2:
            r1 = r4
            goto L_0x0642
        L_0x06e5:
            r1 = r4
            goto L_0x0622
        L_0x06e8:
            r1 = r4
            goto L_0x05ea
        L_0x06eb:
            r1 = r4
            goto L_0x05d8
        L_0x06ee:
            r1 = r4
            goto L_0x05c6
        L_0x06f1:
            r1 = r4
            goto L_0x05b4
        L_0x06f4:
            r1 = r4
            goto L_0x059b
        L_0x06f7:
            r1 = r4
            goto L_0x0589
        L_0x06fa:
            r1 = r4
            goto L_0x0577
        L_0x06fd:
            r1 = r4
            goto L_0x055e
        L_0x0700:
            r1 = r4
            goto L_0x0547
        L_0x0703:
            r1 = r4
            goto L_0x0535
        L_0x0706:
            r1 = r4
            goto L_0x04d6
        L_0x0709:
            r1 = r4
            goto L_0x048a
        L_0x070c:
            r1 = r4
            goto L_0x0478
        L_0x070f:
            r1 = r4
            goto L_0x0466
        L_0x0712:
            r1 = r4
            goto L_0x0454
        L_0x0715:
            r1 = r4
            goto L_0x041f
        L_0x0718:
            r1 = r4
            goto L_0x0406
        L_0x071b:
            r1 = r4
            goto L_0x03f4
        L_0x071e:
            r7 = 0
            goto L_0x0522
        L_0x0721:
            if (r7 == 0) goto L_0x0356
            goto L_0x0353
        L_0x0725:
            r0 = 332(0x14c, float:4.65E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0731:
            r0 = 953(0x3b9, float:1.335E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x073d:
            java.lang.String r1 = "errorMessage should not be null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263934Nx.A00(X.0Ae):void");
    }

    public C263934Nx(UserSession userSession) {
        this.A05 = userSession;
    }
}
