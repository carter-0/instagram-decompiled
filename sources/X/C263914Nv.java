package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.4Nv  reason: invalid class name and case insensitive filesystem */
public final class C263914Nv extends C252323ov {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final UserSession A0G;
    public final C309966aD A0H;
    public final String A0I;
    public final String A0J;
    public final Context A0K;
    public final RealtimeClientManager A0L;
    public final C310016aI A0M;
    public final C249763kK A0N;
    public final AnonymousClass0eK A0O;
    public final AnonymousClass0eK A0P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C263914Nv(Context context, UserSession userSession, AnonymousClass4DU r4, RealtimeClientManager realtimeClientManager, C310016aI r6, C309966aD r7, C249763kK r8, String str, AnonymousClass0eK r10, AnonymousClass0eK r11) {
        super(r4, r8.getSessionId());
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r6, 5);
        this.A0K = context;
        this.A0G = userSession;
        this.A0O = r10;
        this.A0P = r11;
        this.A0M = r6;
        this.A0L = realtimeClientManager;
        this.A0H = r7;
        this.A0I = str;
        this.A0N = r8;
        this.A0J = r8.getSessionId();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4OC] */
    public final void A0A(0xI r7, C263934Nx r8) {
        0qQ.A0B(r7, 0);
        A0C();
        A00();
        ? obj = new Object();
        Integer num = this.A07;
        obj.A0A = num;
        if (num != null) {
            r7.A08(num, "session_reel_counter");
        }
        String str = this.A0I;
        obj.A0a = str;
        if (str != null) {
            r7.A0C("tray_session_id", str);
        }
        Integer num2 = this.A0B;
        obj.A0N = num2;
        if (num2 != null) {
            r7.A08(num2, "tray_position");
        }
        Integer num3 = this.A06;
        obj.A0K = num3;
        if (num3 != null) {
            r7.A08(num3, "reel_position");
        }
        Integer num4 = this.A09;
        obj.A0L = num4;
        if (num4 != null) {
            r7.A08(num4, "reel_size");
        }
        Boolean bool = this.A02;
        if (bool != null) {
            Integer valueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            obj.A0H = valueOf;
            r7.A08(valueOf, "mqtt_connection_status");
        }
        Integer num5 = this.A05;
        obj.A06 = num5;
        if (num5 != null) {
            r7.A08(num5, "battery_level");
        }
        String str2 = this.A0C;
        obj.A0Q = str2;
        if (str2 != null) {
            r7.A0C("battery_status", str2);
        }
        String str3 = r7.A04;
        if ("video_paused".equals(str3) || "video_buffering_started".equals(str3)) {
            Integer num6 = this.A0A;
            obj.A0M = num6;
            if (num6 != null) {
                r7.A08(num6, "stale_mpd_count");
            }
        }
        Boolean bool2 = this.A03;
        if (bool2 != null) {
            Integer valueOf2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
            obj.A0E = valueOf2;
            r7.A08(valueOf2, "live_donation");
        }
        Integer num7 = this.A08;
        obj.A0J = num7;
        if (num7 != null) {
            r7.A08(num7, "number_of_qualities");
        }
        if ("video_should_start".equals(r7.A04)) {
            String str4 = this.A0F;
            obj.A0b = str4;
            if (str4 != null) {
                r7.A0C("trigger", str4);
            }
        }
        Boolean bool3 = this.A04;
        if (bool3 != null) {
            Integer valueOf3 = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
            obj.A0F = valueOf3;
            r7.A08(valueOf3, "is_live_streaming");
        }
        String str5 = this.A0D;
        String str6 = this.A0E;
        if (!(str6 == null && str5 == null)) {
            obj.A0Y = str6;
            if (str6 != null) {
                0xF r3 = obj.A01;
                if (r3 == null) {
                    r3 = new 0xF();
                    obj.A01 = r3;
                }
                if (str6.length() != 0) {
                    0xF.A00(r3, str6, "story_preview_media_owner_id");
                }
                obj.A01 = r3;
            }
            obj.A0X = str5;
            if (str5 != null) {
                0xF r32 = obj.A01;
                if (r32 == null) {
                    r32 = new 0xF();
                    obj.A01 = r32;
                }
                if (str5.length() != 0) {
                    0xF.A00(r32, str5, "story_preview_media_id");
                }
                obj.A01 = r32;
            }
            0xF r1 = obj.A01;
            if (r1 != null) {
                r7.A05(r1, "adhoc_data");
            }
        }
        Boolean bool4 = this.A00;
        if (bool4 != null) {
            boolean booleanValue = bool4.booleanValue();
            Integer valueOf4 = Integer.valueOf(booleanValue ? 1 : 0);
            obj.A0C = valueOf4;
            if (valueOf4 != null && booleanValue) {
                r7.A0C("has_igtv_video", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
        }
        Boolean bool5 = this.A01;
        if (bool5 != null) {
            boolean booleanValue2 = bool5.booleanValue();
            Integer valueOf5 = Integer.valueOf(booleanValue2 ? 1 : 0);
            obj.A0D = valueOf5;
            if (valueOf5 != null && booleanValue2) {
                r7.A0C("has_reshared_clips_video", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
        }
        if (r8 != null) {
            r8.A07 = obj;
        }
    }

    public final void A0C() {
        this.A07 = null;
        this.A0B = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A0C = null;
        this.A0A = null;
        this.A03 = null;
        this.A08 = null;
        this.A0F = null;
        this.A04 = null;
        this.A0E = null;
        this.A0D = null;
        this.A00 = null;
        this.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (r1 == null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r10 = this;
            X.0eK r0 = r10.A0O
            java.lang.Object r1 = r0.get()
            X.3mM r1 = (X.C250973mM) r1
            r2 = 0
            if (r1 == 0) goto L_0x0011
            com.instagram.common.session.UserSession r0 = r10.A0G
            X.3uh r2 = r1.A08(r0)
        L_0x0011:
            X.6aI r0 = r10.A0M
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A07 = r0
            r5 = 0
            if (r1 == 0) goto L_0x0106
            int r0 = r1.A0E
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A0B = r0
            r4 = -1
            if (r1 == 0) goto L_0x0103
            int r0 = r1.A01
        L_0x002b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A06 = r0
            if (r1 == 0) goto L_0x0100
            com.instagram.model.reels.Reel r1 = r1.A0H
            com.instagram.common.session.UserSession r0 = r10.A0G
            java.util.List r0 = r1.A0O(r0)
            int r0 = r0.size()
        L_0x003f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A09 = r0
            if (r2 == 0) goto L_0x00ff
            boolean r3 = r2.A17()
            r9 = 1
            if (r3 == 0) goto L_0x0096
            com.instagram.realtimeclient.RealtimeClientManager r0 = r10.A0L
            boolean r0 = r0.isMqttConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A02 = r0
            android.content.Context r0 = r10.A0K
            X.1Cn r1 = new X.1Cn
            r1.<init>(r0)
            X.1Cn.A00(r1)
            int r0 = r1.A00
            if (r0 == r4) goto L_0x006e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A05 = r0
        L_0x006e:
            X.1Cn.A00(r1)
            java.lang.String r0 = r1.A01
            r10.A0C = r0
            X.0eK r0 = r10.A0P
            java.lang.Object r1 = r0.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0085
            int r0 = r1.intValue()
            if (r0 == r4) goto L_0x0087
        L_0x0085:
            r10.A0A = r1
        L_0x0087:
            X.4gL r0 = r2.A0c
            if (r0 == 0) goto L_0x0096
            X.4wA r0 = r0.A01
            if (r0 == 0) goto L_0x0090
            r5 = 1
        L_0x0090:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r10.A03 = r0
        L_0x0096:
            if (r3 == 0) goto L_0x00a8
            X.4gL r0 = r2.A0c
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = r0.A0Z
            r0 = 2
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 1
        L_0x00a2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A08 = r0
        L_0x00a8:
            java.lang.String r0 = "auto"
            r10.A0F = r0
            if (r3 == 0) goto L_0x00b4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r10.A04 = r0
        L_0x00b4:
            java.util.List r0 = r2.A0b()
            if (r0 == 0) goto L_0x00ff
            com.instagram.user.model.User r8 = r2.A0i
            X.1Xj r7 = r2.A0b
            java.util.Iterator r6 = r0.iterator()
        L_0x00c2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r5 = r6.next()
            X.3ui r5 = (X.C255783ui) r5
            X.0qQ.A0A(r5)
            if (r7 == 0) goto L_0x00c2
            long r3 = r7.A1B()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c2
            com.instagram.model.mediatype.ProductType r1 = r5.A0m
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.IGTV
            if (r1 == r2) goto L_0x00e7
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 != r0) goto L_0x00c2
        L_0x00e7:
            if (r8 == 0) goto L_0x00ef
            java.lang.String r0 = r8.getId()
            r10.A0E = r0
        L_0x00ef:
            java.lang.String r0 = r7.A30()
            r10.A0D = r0
            com.instagram.model.mediatype.ProductType r1 = r5.A0m
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            if (r1 != r2) goto L_0x0109
            r10.A00 = r0
        L_0x00ff:
            return
        L_0x0100:
            r0 = -1
            goto L_0x003f
        L_0x0103:
            r0 = -1
            goto L_0x002b
        L_0x0106:
            r0 = 0
            goto L_0x0020
        L_0x0109:
            r10.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263914Nv.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0106, code lost:
        if (r0.booleanValue() == false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C263974Ob A06(X.C263974Ob r11, java.lang.Object r12) {
        /*
            r10 = this;
            X.3uh r12 = (X.C255773uh) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r3 = 1
            r5 = r11
            X.0qQ.A0B(r11, r3)
            super.A06(r11, r12)
            r10.A0C()
            r10.A00()
            java.lang.String r4 = r10.A0C
            java.lang.String r2 = "UNKNOWN"
            if (r4 == 0) goto L_0x0037
            int r1 = r4.hashCode()
            r0 = -1054830049(0xffffffffc120921f, float:-10.035674)
            if (r1 == r0) goto L_0x018a
            r0 = 2201263(0x2196af, float:3.084626E-39)
            if (r1 == r0) goto L_0x017e
            r0 = 1500759697(0x5973c691, float:4.28854659E15)
            if (r1 != r0) goto L_0x0037
            java.lang.String r0 = "Charging"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = "CHARGING"
        L_0x0037:
            java.lang.String r0 = "story_battery_status"
            r11.A06(r0, r2)
            java.lang.Integer r0 = r10.A05
            if (r0 == 0) goto L_0x004e
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "story_battery_level_percent"
            r11.A05(r0, r1)
        L_0x004e:
            java.lang.Boolean r1 = r10.A03
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "story_is_live_donation"
            r11.A03(r0, r1)
        L_0x0057:
            java.lang.Integer r0 = r10.A09
            if (r0 == 0) goto L_0x0069
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "story_reel_size"
            r11.A05(r0, r1)
        L_0x0069:
            java.lang.Integer r0 = r10.A06
            if (r0 == 0) goto L_0x007b
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "story_reel_position"
            r11.A05(r0, r1)
        L_0x007b:
            java.lang.Integer r0 = r10.A0B
            if (r0 == 0) goto L_0x008d
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "story_tray_position"
            r11.A05(r0, r1)
        L_0x008d:
            java.lang.Integer r0 = r10.A07
            if (r0 == 0) goto L_0x009f
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "story_session_reel_counter"
            r11.A05(r0, r1)
        L_0x009f:
            java.lang.String r1 = r10.A0I
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = "story_tray_session_id"
            r11.A06(r0, r1)
        L_0x00a8:
            java.lang.Boolean r1 = r10.A02
            if (r1 == 0) goto L_0x00b1
            java.lang.String r0 = "story_is_mqtt_connected"
            r11.A03(r0, r1)
        L_0x00b1:
            java.lang.Integer r0 = r10.A0A
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "story_stale_mpd_count"
            r11.A05(r0, r1)
        L_0x00c3:
            java.lang.Integer r0 = r10.A08
            if (r0 == 0) goto L_0x00d5
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "video_qualities_count"
            r11.A05(r0, r1)
        L_0x00d5:
            java.lang.Boolean r1 = r10.A04
            if (r1 == 0) goto L_0x00de
            java.lang.String r0 = "is_live_streaming"
            r11.A03(r0, r1)
        L_0x00de:
            java.lang.String r1 = r10.A0E
            if (r1 == 0) goto L_0x00e7
            java.lang.String r0 = "story_preview_media_owner_id"
            r11.A06(r0, r1)
        L_0x00e7:
            java.lang.String r1 = r10.A0D
            if (r1 == 0) goto L_0x00f0
            java.lang.String r0 = "story_preview_media_id"
            r11.A06(r0, r1)
        L_0x00f0:
            java.lang.Boolean r2 = r10.A00
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0109
            java.lang.Boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0109
        L_0x0108:
            r1 = 2
        L_0x0109:
            java.lang.String r2 = "story_preview_type"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map r0 = r11.A00
            r0.put(r2, r1)
            java.util.Set r0 = X.AnonymousClass4O4.A0I
            com.instagram.common.session.UserSession r3 = r10.A0G
            java.lang.Class<X.4O4> r2 = X.AnonymousClass4O4.class
            r1 = 41
            X.9Ku r0 = new X.9Ku
            r0.<init>(r3, r1)
            java.lang.Object r4 = r3.A01(r2, r0)
            X.4O4 r4 = (X.AnonymousClass4O4) r4
            if (r4 == 0) goto L_0x013a
            X.1Xj r0 = r12.A0b
            if (r0 == 0) goto L_0x017c
            java.lang.String r9 = r0.getId()
        L_0x0131:
            X.3WR r8 = r12.A0M(r3)
            r6 = 0
            r7 = r6
            r4.A03(r5, r6, r7, r8, r9)
        L_0x013a:
            boolean r2 = r12.A1Y()
            boolean r1 = r12.A0s()
            X.3WR r0 = r12.A0M(r3)
            java.lang.String r1 = X.C263984Oc.A01(r0, r2, r1)
            java.lang.String r0 = "video_format"
            r11.A06(r0, r1)
            com.instagram.feed.media.ReelCTAIntf r0 = r12.A0A()
            if (r0 == 0) goto L_0x017a
            java.lang.String r1 = X.AnonymousClass6MS.A00(r0)
        L_0x0159:
            X.4Om r0 = X.C264044Oj.A00(r3)
            java.lang.String r1 = r0.AmH(r1)
            if (r1 == 0) goto L_0x0168
            java.lang.String r0 = "channel_pk"
            r11.A06(r0, r1)
        L_0x0168:
            com.instagram.user.model.User r0 = r12.A0i
            if (r0 == 0) goto L_0x0179
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            X.4Oo r1 = X.C263984Oc.A00(r0)
            java.lang.String r0 = "instagram_follow_status"
            r11.A01(r1, r0)
        L_0x0179:
            return r11
        L_0x017a:
            r1 = 0
            goto L_0x0159
        L_0x017c:
            r9 = 0
            goto L_0x0131
        L_0x017e:
            java.lang.String r0 = "Full"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = "FULL"
            goto L_0x0037
        L_0x018a:
            java.lang.String r0 = "Unplugged"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = "DISCHARGING"
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263914Nv.A06(X.4Ob, java.lang.Object):X.4Ob");
    }
}
