package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Nz  reason: invalid class name and case insensitive filesystem */
public final class C263954Nz {
    public double A00 = Double.NaN;
    public float A01 = Float.NaN;
    public float A02 = Float.NaN;
    public float A03 = Float.NaN;
    public float A04 = Float.NaN;
    public float A05 = Float.NaN;
    public int A06 = -1;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public long A0Q = -1;
    public 0xE A0R;
    public 0xE A0S;
    public 0xE A0T;
    public AnonymousClass3WR A0U;
    public Boolean A0V;
    public Boolean A0W;
    public Boolean A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public Integer A0b;
    public Long A0c;
    public String A0d = null;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1B = NetInfoModule.CONNECTION_TYPE_NONE;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public ArrayList A1G;
    public ArrayList A1H;
    public ArrayList A1I;
    public List A1J;
    public boolean A1K;
    public boolean A1L;
    public final Context A1M;
    public final UserSession A1N;
    public final AnonymousClass4DU A1O;
    public final C263934Nx A1P;
    public final String A1Q;

    public final void A00(C252323ov r12) {
        String str;
        String str2;
        C263944Ny A002;
        String A0R2;
        0xI A003 = 0xI.A00(this.A1O, this.A1Q);
        AnonymousClass4O3 r8 = new AnonymousClass4O3();
        A003.A0C("app_startup_type", C64031Cc.A09.toString());
        A003.A08(Integer.valueOf(C64031Cc.A00()), "app_startup_time_bucket");
        String str3 = this.A1E;
        if (str3 != null) {
            r8.A1L = str3;
            A003.A0C("video_type", str3);
        }
        String str4 = this.A1C;
        if (str4 != null) {
            r8.A1J = str4;
            A003.A0C("upload_id", str4);
        }
        String str5 = this.A0w;
        if (str5 != null) {
            r8.A10 = str5;
            A003.A0C("m_pk", str5);
        }
        String str6 = this.A10;
        if (str6 != null) {
            r8.A15 = str6;
            A003.A0C("parent_m_pk", str6);
        }
        Boolean bool = this.A0X;
        if (bool != null) {
            A003.A09("author_is_private", bool);
        }
        String str7 = this.A0u;
        if (str7 != null) {
            r8.A0y = str7;
            A003.A0C("inventory_source", str7);
        }
        String str8 = this.A16;
        if (str8 != null) {
            r8.A1C = str8;
            A003.A0C("representation_id", str8);
        }
        String str9 = this.A0h;
        if (str9 != null) {
            r8.A0k = str9;
        }
        String str10 = this.A0j;
        if (str10 != null) {
            if (str10.length() == 0) {
                A0R2 = "AuthorId is empty.";
            } else if (00l.A0d(str10, "_", false)) {
                A0R2 = 002.A0R("AuthorId contains an underscore: ", str10);
            } else {
                A002 = C263944Ny.A00(str10);
                r8.A00 = A002;
                A003.A0C("a_pk", str10);
            }
            0wb.A03("CoreExtrasAdapter", A0R2);
            A002 = new C263944Ny(0L);
            r8.A00 = A002;
            A003.A0C("a_pk", str10);
        }
        Long l = this.A0c;
        if (l != null) {
            r8.A0f = l;
            A003.A0B("m_ts", l);
        }
        String str11 = this.A1A;
        if (str11 != null) {
            r8.A1H = str11;
            A003.A0C("tracking_token", str11);
        }
        String str12 = this.A0r;
        if (str12 != null) {
            r8.A0v = str12;
            A003.A0C("follow_status", str12);
        }
        int i = this.A0C;
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            r8.A0S = valueOf;
            A003.A08(valueOf, "m_ix");
        }
        int i2 = this.A09;
        if (i2 != -1) {
            Float valueOf2 = Float.valueOf(((float) i2) / 1000.0f);
            r8.A0H = valueOf2;
            0xF.A00(A003.A06, valueOf2, "time");
        }
        int i3 = this.A0K;
        if (i3 != -1) {
            Float valueOf3 = Float.valueOf(((float) i3) / 1000.0f);
            r8.A0N = valueOf3;
            0xF.A00(A003.A06, valueOf3, "from_time");
        }
        int i4 = this.A0L;
        if (i4 != -1) {
            Float valueOf4 = Float.valueOf(((float) i4) / 1000.0f);
            r8.A0O = valueOf4;
            0xF.A00(A003.A06, valueOf4, "to_time");
        }
        String str13 = this.A18;
        if (str13 != null) {
            r8.A1F = str13;
            A003.A0C("seek_reason", str13);
        }
        int i5 = this.A08;
        if (i5 != -1) {
            0xF.A00(A003.A06, Float.valueOf(((float) i5) / 1000.0f), "broadcast_time");
        }
        int i6 = this.A0A;
        if (i6 != -1) {
            Float valueOf5 = Float.valueOf(((float) i6) / 1000.0f);
            r8.A0I = valueOf5;
            0xF.A00(A003.A06, valueOf5, TraceFieldType.Duration);
        }
        double d = this.A00;
        if (!Double.isNaN(d)) {
            Double valueOf6 = Double.valueOf(d);
            r8.A0D = valueOf6;
            A003.A0A("timeAsPercent", valueOf6);
        }
        Boolean bool2 = this.A0V;
        if (bool2 != null) {
            r8.A04 = bool2;
            if (bool2.equals(true)) {
                str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str2 = "0";
            }
            A003.A0C("playing_audio", str2);
        }
        Boolean bool3 = this.A0W;
        if (bool3 != null) {
            r8.A05 = bool3;
            if (bool3.equals(true)) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A003.A0C("audio_fetched", str);
        }
        String str14 = this.A0z;
        if (str14 != null) {
            r8.A14 = str14;
            A003.A0C("original_start_reason", str14);
        }
        String str15 = this.A15;
        if (str15 != null) {
            r8.A1B = str15;
            A003.A0C("reason", str15);
        }
        String str16 = this.A0q;
        if (str16 != null) {
            r8.A0u = str16;
            A003.A0C("error_message", str16);
        }
        long j = this.A0Q;
        if (j != -1) {
            Long valueOf7 = Long.valueOf(j);
            r8.A0e = valueOf7;
            A003.A0B("start_delay", valueOf7);
        }
        Boolean bool4 = this.A0Y;
        if (bool4 != null) {
            r8.A06 = bool4;
            A003.A09("cached", bool4);
        }
        Boolean bool5 = this.A0a;
        if (bool5 != null) {
            r8.A0A = bool5;
            A003.A09("warmed", bool5);
        }
        int i7 = this.A0F;
        if (i7 != -1) {
            Float valueOf8 = Float.valueOf(((float) i7) / 1000.0f);
            r8.A0J = valueOf8;
            0xF.A00(A003.A06, valueOf8, "lsp");
        }
        int i8 = this.A0E;
        if (i8 != -1) {
            0xF.A00(A003.A06, Float.valueOf(((float) i8) / 1000.0f), "broadcast_lsp");
        }
        int i9 = this.A06;
        if (i9 != -1) {
            Float valueOf9 = Float.valueOf(((float) i9) / 1000.0f);
            r8.A0F = valueOf9;
            0xF.A00(A003.A06, valueOf9, AnonymousClass000.A00(2731));
        }
        int i10 = this.A0G;
        if (i10 != -1) {
            Float valueOf10 = Float.valueOf(((float) i10) / 1000.0f);
            r8.A0K = valueOf10;
            0xF.A00(A003.A06, valueOf10, AnonymousClass000.A00(3512));
        }
        int i11 = this.A07;
        if (i11 != -1) {
            Float valueOf11 = Float.valueOf(((float) i11) / 1000.0f);
            r8.A0G = valueOf11;
            0xF.A00(A003.A06, valueOf11, "buffering_duration");
        }
        float f = this.A02;
        if (!Float.isNaN(f)) {
            Float valueOf12 = Float.valueOf(f);
            r8.A0L = valueOf12;
            0xF.A00(A003.A06, valueOf12, "loop_count");
        }
        float f2 = this.A03;
        if (!Float.isNaN(f2)) {
            Float valueOf13 = Float.valueOf(f2);
            r8.A0M = valueOf13;
            0xF.A00(A003.A06, valueOf13, TraceFieldType.RetryCount);
        }
        Boolean bool6 = this.A0Z;
        if (bool6 != null) {
            r8.A08 = bool6;
            A003.A09("streaming", bool6);
        }
        int i12 = this.A0I;
        if (i12 != -1) {
            Integer valueOf14 = Integer.valueOf(i12);
            r8.A0V = valueOf14;
            A003.A08(valueOf14, "prefetch_size");
        }
        String str17 = this.A0i;
        if (str17 != null) {
            r8.A0l = str17;
            A003.A0C("source", str17);
        }
        int i13 = this.A0B;
        if (i13 != -1) {
            Integer valueOf15 = Integer.valueOf(i13);
            r8.A0R = valueOf15;
            A003.A08(valueOf15, "elapsed_time");
        }
        int i14 = this.A0N;
        if (i14 != -1) {
            Integer valueOf16 = Integer.valueOf(i14);
            r8.A0Z = valueOf16;
            A003.A08(valueOf16, AnonymousClass000.A00(814));
        }
        String str18 = this.A1F;
        if (str18 != null) {
            r8.A1M = str18;
            A003.A0C("viewer_session_id", str18);
        }
        String str19 = this.A0m;
        if (str19 != null) {
            r8.A0p = str19;
            A003.A0C("chaining_session_id", str19);
        }
        int i15 = this.A0P;
        if (i15 != -1) {
            Integer valueOf17 = Integer.valueOf(i15);
            r8.A0c = valueOf17;
            A003.A08(valueOf17, "video_width");
        }
        int i16 = this.A0O;
        if (i16 != -1) {
            Integer valueOf18 = Integer.valueOf(i16);
            r8.A0a = valueOf18;
            A003.A08(valueOf18, "video_height");
        }
        float f3 = this.A01;
        if (!Float.isNaN(f3)) {
            Float valueOf19 = Float.valueOf(f3);
            r8.A0E = valueOf19;
            0xF.A00(A003.A06, valueOf19, TraceFieldType.Bitrate);
        }
        String str20 = this.A0y;
        if (str20 != null) {
            r8.A12 = str20;
            A003.A0C("mime_type", str20);
        }
        int i17 = this.A0J;
        if (i17 != -1) {
            Integer valueOf20 = Integer.valueOf(i17);
            r8.A0W = valueOf20;
            A003.A08(valueOf20, "recent_bandwidth");
        }
        String str21 = this.A0g;
        if (str21 != null) {
            r8.A0j = str21;
        }
        int i18 = this.A0D;
        if (i18 != -1) {
            Integer valueOf21 = Integer.valueOf(i18);
            r8.A0T = valueOf21;
            A003.A08(valueOf21, "is_dash_eligible");
        }
        String str22 = this.A1D;
        if (str22 != null) {
            r8.A1K = str22;
            A003.A0C("video_codec", str22);
        }
        String str23 = this.A11;
        if (str23 != null) {
            r8.A16 = str23;
            A003.A0C("playback_format", str23);
        }
        String str24 = this.A0e;
        if (str24 != null) {
            r8.A0h = str24;
            A003.A0C("audience", str24);
        }
        String str25 = this.A19;
        if (str25 != null) {
            r8.A1G = str25;
            A003.A0C("tracker_id", str25);
        }
        0xE r1 = this.A0S;
        if (r1 != null) {
            r8.A02 = r1;
            A003.A06(r1, "historical_requested_bytes");
            r8.A1O = this.A1H;
        }
        0xE r13 = this.A0R;
        if (r13 != null) {
            r8.A01 = r13;
            A003.A06(r13, "historical_avg_bitrate");
            r8.A1N = this.A1G;
        }
        0xE r14 = this.A0T;
        if (r14 != null) {
            r8.A03 = r14;
            A003.A06(r14, "historical_stream_type");
            r8.A1P = this.A1I;
        }
        int i19 = this.A0M;
        if (i19 != -1) {
            Integer valueOf22 = Integer.valueOf(i19);
            r8.A0Y = valueOf22;
            A003.A08(valueOf22, "seq_num");
        }
        int i20 = this.A0H;
        if (i20 != -1) {
            Integer valueOf23 = Integer.valueOf(i20);
            r8.A0U = valueOf23;
            A003.A08(valueOf23, "pip");
        }
        float f4 = this.A05;
        if (!Float.isNaN(f4)) {
            Float valueOf24 = Float.valueOf(f4);
            r8.A0Q = valueOf24;
            0xF.A00(A003.A06, valueOf24, "view_width");
        }
        float f5 = this.A04;
        if (!Float.isNaN(f5)) {
            Float valueOf25 = Float.valueOf(f5);
            r8.A0P = valueOf25;
            0xF.A00(A003.A06, valueOf25, "view_height");
        }
        String str26 = this.A0d;
        if (str26 != null) {
            r8.A0g = str26;
            A003.A0C("app_orientation", str26);
        }
        String str27 = this.A0p;
        if (str27 != null) {
            r8.A0t = str27;
            A003.A0C("effect_id", str27);
            String str28 = this.A0n;
            if (str28 == null) {
                str28 = "";
            }
            r8.A0r = str28;
            A003.A0C("channel_pk", str28);
        }
        String str29 = this.A14;
        if (str29 != null) {
            r8.A1A = str29;
            A003.A0C("ranking_info_token", str29);
        }
        String str30 = this.A0x;
        if (str30 != null) {
            r8.A11 = str30;
            A003.A0C("mezql_token", str30);
        }
        String str31 = this.A0o;
        if (str31 != null) {
            r8.A0s = str31;
            A003.A0C("discovery_session_id", str31);
        }
        String str32 = this.A0l;
        if (str32 != null) {
            r8.A0o = str32;
            A003.A0C("camera_session_id", str32);
        }
        Boolean valueOf26 = Boolean.valueOf(this.A1L);
        r8.A09 = valueOf26;
        A003.A09("is_video_to_carousel", valueOf26);
        List list = this.A1J;
        if (list != null) {
            r8.A1R = list;
            A003.A0D("video_to_carousel_cut_secs", list);
            Integer valueOf27 = Integer.valueOf(list.size());
            r8.A0b = valueOf27;
            A003.A08(valueOf27, "segment_count");
        }
        String str33 = this.A1B;
        r8.A1I = str33;
        A003.A0C("a_i", str33);
        UserSession userSession = this.A1N;
        Set set = AnonymousClass4O4.A0I;
        AnonymousClass4O4 r5 = (AnonymousClass4O4) userSession.A01(AnonymousClass4O4.class, new C377169Ku(userSession, 41));
        if (r5 != null) {
            r5.A03((C263974Ob) null, A003, r8, this.A0U, this.A0w);
        }
        String str34 = this.A0s;
        if (str34 != null) {
            r8.A0w = str34;
            A003.A0C("displayed_frames", str34);
        }
        Boolean valueOf28 = Boolean.valueOf(this.A1K);
        r8.A07 = valueOf28;
        A003.A09("is_secondary_channel_enabled", valueOf28);
        Integer num = this.A0b;
        if (num != null) {
            r8.A0d = num;
            A003.A08(num, "current_viewability_percentage");
        }
        String str35 = this.A0v;
        if (str35 != null) {
            r8.A0z = str35;
            A003.A0C("session_validation_token", str35);
        }
        String str36 = this.A0k;
        if (str36 != null) {
            r8.A0n = str36;
            A003.A0C("buffering_reason", str36);
        }
        String str37 = AnonymousClass1QI.A00.A02.A00;
        r8.A13 = str37;
        A003.A0C("nav_chain", str37);
        String str38 = this.A17;
        if (str38 != null) {
            r8.A1E = str38;
            A003.A0C("search_session_id", str38);
        }
        String str39 = this.A13;
        if (str39 != null) {
            r8.A19 = str39;
            A003.A0C("rank_token", str39);
        }
        String str40 = this.A12;
        if (str40 != null) {
            r8.A17 = str40;
            A003.A0C("query_text", str40);
        }
        String str41 = this.A0t;
        if (str41 != null) {
            r8.A0x = str41;
            A003.A0C("host_profile_id", str41);
        }
        String str42 = this.A0f;
        if (str42 != null) {
            r8.A0i = str42;
            A003.A0C("audio_derived_content_id", str42);
        }
        C263934Nx r0 = this.A1P;
        r0.A06 = r8;
        r12.A0A(A003, r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C263844No r7) {
        /*
            r6 = this;
            boolean r0 = r7.A0O
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "organic"
        L_0x0006:
            r6.A1B = r0
            java.lang.String r0 = r7.A0J
            r6.A1C = r0
            java.lang.String r0 = r7.A0B
            r6.A0w = r0
            java.lang.String r0 = r7.A0D
            r6.A10 = r0
            java.lang.String r0 = r7.A0I
            r6.A1A = r0
            long r0 = r7.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0c = r0
            java.lang.Boolean r0 = r7.A05
            r6.A0X = r0
            java.lang.String r0 = r7.A0A
            r6.A0u = r0
            java.lang.String r0 = X.AnonymousClass4O1.A00(r7)
            r6.A1E = r0
            java.lang.String r0 = r7.A08
            r6.A0t = r0
            boolean r0 = r7.A0P
            r3 = 1
            if (r0 != 0) goto L_0x0066
            X.3WR r5 = r7.A04
            if (r5 == 0) goto L_0x0066
            boolean r0 = r7.A0N
            java.lang.String r1 = "progressive"
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "original"
        L_0x0043:
            r6.A16 = r0
        L_0x0045:
            r6.A11 = r1
        L_0x0047:
            java.lang.Integer r1 = r5.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x00a7
            java.lang.String r0 = r5.A0J
        L_0x004f:
            r6.A19 = r0
            com.instagram.common.session.UserSession r4 = r6.A1N
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321988666533762(0x810aa800012782, double:3.0335101174003594E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = r5.A04()
            r6.A1D = r0
        L_0x0066:
            com.instagram.user.model.FollowStatus r1 = r7.A03
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r0 = X.1aC.A06(r1)
            r6.A0r = r0
            java.lang.String r0 = r7.A0K
            r6.A0j = r0
            java.util.List r2 = r7.A0L
            if (r2 == 0) goto L_0x00a5
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a5
        L_0x007e:
            r6.A1L = r3
            if (r2 == 0) goto L_0x00d5
            int r1 = r2.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r6.A1J = r0
            java.util.Iterator r2 = r2.iterator()
        L_0x0091:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r2.next()
            java.util.List r1 = r6.A1J
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            goto L_0x0091
        L_0x00a5:
            r3 = 0
            goto L_0x007e
        L_0x00a7:
            r0 = 0
            goto L_0x004f
        L_0x00a9:
            boolean r0 = r5.A08()
            if (r0 == 0) goto L_0x00b4
            r6.A0D = r3
            java.lang.String r1 = "dash"
            goto L_0x0045
        L_0x00b4:
            java.util.List r0 = r5.A0M
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0047
            com.instagram.model.mediasize.VideoUrlImpl r0 = r5.A08
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r0.A05
            goto L_0x0043
        L_0x00c6:
            r0 = 0
            goto L_0x0043
        L_0x00c9:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "ad"
            goto L_0x0006
        L_0x00d1:
            java.lang.String r0 = "none"
            goto L_0x0006
        L_0x00d5:
            X.3QO r1 = r7.A01
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT
            if (r1 == r0) goto L_0x00df
            java.lang.String r0 = r1.A00
            r6.A0e = r0
        L_0x00df:
            java.lang.String r2 = r7.A07
            r6.A0p = r2
            if (r2 == 0) goto L_0x0105
            com.instagram.common.session.UserSession r1 = r6.A1N
            X.4Om r0 = X.C264044Oj.A00(r1)
            java.lang.String r0 = r0.Bss(r2)
            r6.A0o = r0
            X.27r r0 = X.27p.A01(r1)
            X.283 r0 = r0.A04
            java.lang.String r0 = r0.A0L
            r6.A0l = r0
            X.4Om r0 = X.C264044Oj.A00(r1)
            java.lang.String r0 = r0.AmH(r2)
            r6.A0n = r0
        L_0x0105:
            java.lang.String r0 = r7.A0G
            r6.A14 = r0
            java.lang.String r0 = r7.A0C
            r6.A0x = r0
            java.lang.String r0 = r7.A0H
            r6.A17 = r0
            java.lang.String r0 = r7.A0F
            r6.A13 = r0
            java.lang.String r0 = r7.A0E
            r6.A12 = r0
            X.3WR r0 = r7.A04
            r6.A0U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263954Nz.A01(X.4No):void");
    }

    public C263954Nz(Context context, UserSession userSession, AnonymousClass4DU r7, C263934Nx r8, String str) {
        this.A1Q = str;
        this.A1P = r8;
        this.A1O = r7;
        this.A1N = userSession;
        this.A1M = context;
    }
}
