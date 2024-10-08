package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import go.Seq;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EglBase14Impl;

public final class M0X implements C313726gu, MUS {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C63841L8w A06;
    public Integer A07 = AnonymousClass05K.A01;
    public String A08;
    public String A09 = "";
    public String A0A;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public long A0J;
    public final Context A0K;
    public final Handler A0L = new Handler();
    public final OMM A0M = OYL.A01(OYL.A02("/proc/self/stat"));
    public final C58840Ae A0N;
    public final AnonymousClass0iw A0O;
    public final UserSession A0P;
    public final 1Q9 A0Q;
    public final 1Cn A0R;
    public final Runnable A0S;
    public final Set A0T = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap A0U = new ConcurrentHashMap();
    public final ConcurrentHashMap A0V = new ConcurrentHashMap();
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicInteger A0X = new AtomicInteger(0);
    public final AtomicInteger A0Y = new AtomicInteger(0);
    public final AtomicInteger A0Z = new AtomicInteger(0);
    public final AtomicInteger A0a = new AtomicInteger(0);
    public final AtomicInteger A0b = new AtomicInteger(0);
    public final AtomicInteger A0c = new AtomicInteger(0);
    public final AtomicInteger A0d = new AtomicInteger(0);
    public final AtomicInteger A0e = new AtomicInteger(0);
    public final AtomicInteger A0f = new AtomicInteger(0);
    public final AtomicInteger A0g = new AtomicInteger(0);
    public final AtomicInteger A0h = new AtomicInteger(0);
    public final AtomicInteger A0i = new AtomicInteger(0);
    public final AtomicInteger A0j = new AtomicInteger(0);
    public final AtomicInteger A0k = new AtomicInteger(0);
    public final AtomicInteger A0l = new AtomicInteger(0);
    public final AtomicInteger A0m = new AtomicInteger(0);
    public final AtomicInteger A0n = new AtomicInteger(0);
    public final AtomicLong A0o = new AtomicLong(0);
    public final AtomicLong A0p = new AtomicLong(0);
    public final AtomicLong A0q = new AtomicLong(0);
    public final boolean A0r = C51970G9q.A1W(10, new Random().nextInt(100));

    public M0X(Context context, C58840Ae r8, AnonymousClass0iw r9, UserSession userSession) {
        this.A0K = context;
        this.A0N = r8;
        this.A0O = r9;
        this.A0P = userSession;
        this.A0R = new 1Cn(context);
        1Q9 A002 = 1Q9.A00(r9, getClass().getName());
        this.A0Q = A002;
        A002.A08();
        this.A0S = new M55(this);
    }

    public final void A0C(int i, String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 2);
        1Ln A042 = A04(this, AnonymousClass05K.A05);
        LRy.A03(A042, str, str2, str3, str4, i);
        A042.Cgf();
    }

    public final void A0D(int i, String str, String str2, String str3, String str4) {
        String str5 = str2;
        0qQ.A0B(str2, 2);
        if (this.A0r) {
            1Ln A042 = A04(this, AnonymousClass05K.A06);
            LRy.A03(A042, str, str5, str3, str4, i);
            A042.Cgf();
        }
    }

    public final void A0E(Integer num, String str) {
        long elapsedRealtime;
        String str2;
        0qQ.A0B(num, 0);
        ConcurrentHashMap concurrentHashMap = this.A0V;
        Number A0z = JTO.A0z(str, concurrentHashMap);
        if (A0z == null) {
            elapsedRealtime = -1;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - A0z.longValue();
        }
        0u4.A03(concurrentHashMap).remove(str);
        1Ln A022 = A02(this, AnonymousClass05K.A0m);
        switch (num.intValue()) {
            case 1:
                str2 = "GUEST_REJECT";
                break;
            case 2:
                str2 = "INVITE_EXPIRED";
                break;
            case 3:
                str2 = "CANDIDATE_INELIGIBLE";
                break;
            default:
                str2 = "BROADCASTER_CANCEL";
                break;
        }
        A022.A0R("reason", str2);
        A022.A0R("guest_id", str);
        A022.A0Q("is_viewer", 1L);
        A022.A0P("respond_time", JTS.A0c(elapsedRealtime));
        ConcurrentHashMap concurrentHashMap2 = this.A0U;
        ArrayList A0q2 = JTT.A0q(A022, concurrentHashMap2);
        Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap2);
        while (A0s.hasNext()) {
            JTT.A1T(A0q2, A0s);
        }
        A07(A022, this, A0q2);
        A022.Cgf();
    }

    public final void A0F(String str) {
        0qQ.A0B(str, 0);
        A0H(str, "");
    }

    public final void A0G(String str, Integer num) {
        0qQ.A0B(num, 0);
        this.A0V.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        this.A0h.incrementAndGet();
        1Ln A022 = A02(this, AnonymousClass05K.A0l);
        A022.A0p(C63484Kxo.A00(num));
        A022.A0R("guest_id", str);
        A022.A0Q("is_viewer", 1L);
        ConcurrentHashMap concurrentHashMap = this.A0U;
        ArrayList A0q2 = JTT.A0q(A022, concurrentHashMap);
        Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap);
        while (A0s.hasNext()) {
            JTT.A1T(A0q2, A0s);
        }
        A07(A022, this, A0q2);
        A022.Cgf();
    }

    public final void A0H(String str, String str2) {
        0qQ.A0B(str2, 1);
        0Aj A0d2 = C51969G9p.A0d(this.A0N, "ig_broadcast_waterfall");
        DbS.A1H(A0d2, "broadcast_debug");
        JTS.A18(A0d2, this.A0Q);
        C51969G9p.A1A(A0d2, this.A0O);
        A05(A0d2, this, (float) this.A02);
        A0d2.AAJ("debug_title", str);
        if (str2.length() > 0) {
            A0d2.AAJ("debug_msg", str2);
        }
        A0d2.Cgf();
    }

    public final /* synthetic */ void ChB() {
    }

    public final void Ci3(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        0qQ.A0B(str, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicBoolean atomicBoolean = this.A0W;
        boolean z2 = atomicBoolean.get();
        if (z) {
            if (!z2) {
                this.A0o.set(elapsedRealtime);
            }
            this.A0g.incrementAndGet();
        } else if (z2) {
            this.A0q.addAndGet(elapsedRealtime - this.A0o.get());
        }
        atomicBoolean.set(z);
        1Ln A032 = A03(this, AnonymousClass05K.A0q);
        if (z) {
            str5 = "apply";
        } else {
            str5 = "remove";
        }
        A032.A0k(str5);
        A032.A0R(C66579MXk.A00(287), str);
        A032.A0R("current_face_effect_fileid", str2);
        A032.A0R("target_face_effect_id", str3);
        A032.A0R("target_face_effect_fileid", str4);
        LKD.A01(A032, this.A07);
    }

    public final void Cjo(long j, String str, String str2) {
        long j2;
        Long A0n2;
        0qQ.A0B(str, 1);
        0Aj A0d2 = C51969G9p.A0d(this.A0N, C273654mx.A00(741));
        JTU.A10(A0d2, str, str2, j);
        int A002 = A00(A0d2, this);
        String str3 = this.A08;
        if (str3 == null || (A0n2 = 00y.A0n(A002, str3)) == null) {
            j2 = 0;
        } else {
            j2 = A0n2.longValue();
        }
        JTQ.A10(A0d2, j2);
        A06(A0d2, this, "container_module", this.A0O.getModuleName());
        JTP.A1G(A0d2);
        A0d2.Cgf();
    }

    public final void Cjp(long j, String str, String str2) {
        long j2;
        Long A0n2;
        0qQ.A0B(str2, 2);
        0Aj A0d2 = C51969G9p.A0d(this.A0N, "ig_live_deselect_question");
        A0d2.A8D(C273654mx.A00(675), Double.valueOf(((double) (System.currentTimeMillis() - this.A0J)) / 1000.0d));
        JTU.A10(A0d2, str2, str, j);
        int A002 = A00(A0d2, this);
        String str3 = this.A08;
        if (str3 == null || (A0n2 = 00y.A0n(A002, str3)) == null) {
            j2 = 0;
        } else {
            j2 = A0n2.longValue();
        }
        JTQ.A10(A0d2, j2);
        A06(A0d2, this, "container_module", this.A0O.getModuleName());
        JTP.A1G(A0d2);
        A0d2.Cgf();
    }

    public final /* synthetic */ void Cjq(int i, String str, String str2, long j) {
    }

    public final void Cjr(int i, String str, String str2, long j) {
        long j2;
        Long A0n2;
        0qQ.A0B(str2, 2);
        this.A0c.incrementAndGet();
        this.A0J = System.currentTimeMillis();
        0Aj A0d2 = C51969G9p.A0d(this.A0N, "ig_live_select_question");
        JTP.A1G(A0d2);
        JTU.A10(A0d2, str2, str, j);
        int A002 = A00(A0d2, this);
        A0d2.A9F("question_index", DbS.A0j(i));
        String str3 = this.A08;
        if (str3 == null || (A0n2 = 00y.A0n(A002, str3)) == null) {
            j2 = 0;
        } else {
            j2 = A0n2.longValue();
        }
        JTQ.A10(A0d2, j2);
        A06(A0d2, this, "container_module", this.A0O.getModuleName());
        A0d2.Cgf();
    }

    public final /* synthetic */ void Cjt(String str) {
    }

    public final /* synthetic */ void Cju(int i, String str, String str2, long j) {
    }

    public static int A00(0Aj r3, M0X m0x) {
        r3.A9F("a_pk", 00y.A0n(10, m0x.A0P.A06));
        r3.AAJ("m_pk", m0x.A0A);
        return 10;
    }

    public static 0Aj A01(M0X m0x, Object obj, String str) {
        0wc r2 = (0wc) obj;
        0Aj A002 = r2.A00(r2.A00, str);
        A002.AAE(new C263944Ny(Long.valueOf(Long.parseLong(m0x.A0P.A06))), "a_pk");
        return A002;
    }

    public static final 1Ln A04(M0X m0x, Integer num) {
        String str;
        1Ln A0U2 = C51965G9l.A0U(C51969G9p.A0d(m0x.A0N, "ig_broadcast_waterfall"), 195);
        switch (num.intValue()) {
            case 1:
                str = "broadcast_create_result";
                break;
            case 2:
                str = AnonymousClass000.A00(2730);
                break;
            case 3:
                str = "broadcast_begin_attempt";
                break;
            case 4:
                str = "broadcast_begin_result";
                break;
            case 5:
                str = "broadcast_updated";
                break;
            case 6:
                str = "broadcast_paused";
                break;
            case 7:
                str = "broadcast_resumed";
                break;
            case 8:
                str = "broadcast_cancelled";
                break;
            case 9:
                str = "broadcast_ended";
                break;
            case 10:
                str = "broadcast_summary";
                break;
            case 11:
                str = "broadcast_pin_comment";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "broadcast_unpin_comment";
                break;
            case 13:
                str = "broadcast_error";
                break;
            case 14:
                str = "broadcast_warning";
                break;
            case 15:
                str = "broadcast_debug";
                break;
            case 16:
                str = "broadcast_stats";
                break;
            case 17:
                str = "broadcast_viewers_list_impression";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str = "broadcast_viewer_count_button_tap";
                break;
            case 19:
                str = "broadcast_user_joined_comment_tap";
                break;
            case 20:
                str = "broadcast_dvr_start";
                break;
            case 21:
                str = "broadcast_save_initiated";
                break;
            case 22:
                str = "broadcast_save_result";
                break;
            case 23:
                str = "broadcast_save_impression";
                break;
            case 24:
                str = "broadcast_end_screen_impression";
                break;
            case 25:
                str = "broadcast_done_button_tap";
                break;
            case 26:
                str = "broadcast_got_audio_focus";
                break;
            case 27:
                str = "broadcast_lost_audio_focus";
                break;
            case 28:
                str = "broadcast_camera_flip";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                str = "comments_expanded";
                break;
            case 30:
                str = "comments_collapsed";
                break;
            case 31:
                str = "tap_header";
                break;
            case 32:
                str = "sup_stream_started";
                break;
            case 33:
                str = "sup_disconnected";
                break;
            case 34:
                str = "broadcast_sup_toggled";
                break;
            case 35:
                str = "broadcast_share_to_igtv_attempt";
                break;
            case 36:
                str = "broadcast_share_to_igtv_init";
                break;
            case 37:
                str = "broadcast_liveswap_try_connect_to_mws";
                break;
            case 38:
                str = "broadcast_liveswap";
                break;
            case 39:
                str = "broadcast_liveswap_connect_to_mws_failed";
                break;
            case 40:
                str = "broadcast_liveswap_first_frame_pts_delay";
                break;
            case Seq.NULL_REFNUM:
                str = "broadcast_send_invite";
                break;
            case Seq.RefTracker.REF_OFFSET:
                str = "broadcast_send_invite_succeeded";
                break;
            case 43:
                str = "broadcast_send_invite_failed";
                break;
            case 44:
                str = "broadcast_initial_warning_shown";
                break;
            case 45:
                str = "broadcast_audio_toggled_on";
                break;
            case 46:
                str = "broadcast_audio_toggled_off";
                break;
            case 47:
                str = "broadcast_video_toggled_on";
                break;
            case 48:
                str = "broadcast_video_toggled_off";
                break;
            case 49:
                str = "guest_invite_sheet_opened";
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                str = "guest_candidate_selected";
                break;
            case 51:
                str = "guest_invite_sent";
                break;
            case 52:
                str = "guest_invite_disabled";
                break;
            case 53:
                str = "cobroadcast_started";
                break;
            case 54:
                str = "cobroadcast_ended";
                break;
            case 55:
                str = "face_effect_button_impression";
                break;
            default:
                str = "face_effect_updated";
                break;
        }
        A0U2.A0R("step", str);
        String A052 = m0x.A0Q.A05();
        0qQ.A07(A052);
        A0U2.A0R("waterfall_id", A052);
        A0U2.A0R("container_module", m0x.A0O.getModuleName());
        A0U2.A0P(TraceFieldType.Duration, JTS.A0c(m0x.A02));
        A0U2.A0R("broadcast_type", m0x.A09);
        A0U2.A0R(TraceFieldType.BroadcastId, m0x.A08);
        return A0U2;
    }

    public static void A05(0Aj r2, M0X m0x, float f) {
        r2.A8D(TraceFieldType.Duration, Double.valueOf((double) (f / 1000.0f)));
        r2.AAJ("broadcast_type", m0x.A09);
        r2.AAJ(TraceFieldType.BroadcastId, m0x.A08);
    }

    public static void A07(0Ak r2, M0X m0x, List list) {
        r2.A0S("current_guest_ids", list);
        r2.A0Q("guest_join_counter", Long.valueOf((long) m0x.A0Z.get()));
    }

    public static final void A09(M0X m0x) {
        1Cn r3 = m0x.A0R;
        r3.A04();
        int i = m0x.A00;
        int i2 = m0x.A0I;
        1Cn.A00(r3);
        m0x.A00 = i + Math.max(0, i2 - r3.A00);
        1Cn.A00(r3);
        m0x.A0I = r3.A00;
    }

    public final void A0B() {
        Handler handler = this.A0L;
        Runnable runnable = this.A0S;
        handler.removeCallbacks(runnable);
        if (this.A0G) {
            handler.postDelayed(runnable, 10000);
        }
        1Cn r0 = this.A0R;
        r0.A04();
        1Cn.A00(r0);
        this.A0I = r0.A00;
    }

    public final void A0I(String str, Throwable th) {
        Object obj = SS5.A00;
        String A0l2 = JTS.A0l(th);
        0qQ.A07(A0l2);
        A0H(str, A0l2);
    }

    public final void A0J(boolean z, String str) {
        1Ln A032 = A03(this, AnonymousClass05K.A0Y);
        A032.A0Q("result", Long.valueOf(G9t.A0k(z ? 1 : 0)));
        A032.A0R("result_info", str);
        A032.A0P("response_time", JTS.A0c(SystemClock.elapsedRealtime() - this.A01));
        A032.A0Q(C273654mx.A00(344), Long.valueOf(G9t.A0k(RealtimeClientManager.getInstance(this.A0P).isMqttConnected() ? 1 : 0)));
        A032.A0O("allow_cobroadcast_invite", Boolean.valueOf(this.A0B));
        LRy.A02(this.A0K, A032);
        A032.Cgf();
        if (z) {
            this.A0G = true;
            A0B();
            DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        }
    }

    public final void A0K(boolean z, String str) {
        1Ln A042 = A04(this, AnonymousClass05K.A01);
        A042.A0Q("result", Long.valueOf(G9t.A0k(z ? 1 : 0)));
        A042.A0R("result_info", str);
        A042.A0P("response_time", JTS.A0c(SystemClock.elapsedRealtime() - this.A01));
        LRy.A02(this.A0K, A042);
        A042.Cgf();
    }

    public final void A0L(boolean z, boolean z2) {
        0Aj A0d2 = C51969G9p.A0d(this.A0N, "ig_broadcast_waterfall");
        DbS.A1H(A0d2, "broadcast_done_button_tap");
        JTS.A18(A0d2, this.A0Q);
        C51969G9p.A1A(A0d2, this.A0O);
        A05(A0d2, this, (float) this.A02);
        C51965G9l.A1I(A0d2, this.A0A);
        A0d2.A7p("share_to_igtv_flag", Boolean.valueOf(z2));
        A0d2.A7p("share_status", Boolean.valueOf(z));
        A0d2.Cgf();
    }

    public final void Cjs(int i, int i2, int i3, int i4, int i5) {
        long j;
        Long A0n2;
        0Aj A0d2 = C51969G9p.A0d(this.A0N, C273654mx.A00(743));
        A0d2.A9F(C273654mx.A00(1002), JTT.A0l(A0d2, JTT.A0l(A0d2, JTT.A0l(A0d2, JTT.A0l(A0d2, DbS.A0j(i), "question_count", i2), C273654mx.A00(83), i3), C273654mx.A00(968), i4), C273654mx.A00(540), i5));
        int A002 = A00(A0d2, this);
        String str = this.A08;
        if (str == null || (A0n2 = 00y.A0n(A002, str)) == null) {
            j = 0;
        } else {
            j = A0n2.longValue();
        }
        JTQ.A10(A0d2, j);
        A06(A0d2, this, "container_module", this.A0O.getModuleName());
        JTP.A1G(A0d2);
        A0d2.Cgf();
    }

    public final void Ckw(boolean z) {
        String str;
        long j;
        Long A0n2;
        C58840Ae r1 = this.A0N;
        if (z) {
            str = "ig_live_turn_on_questions";
        } else {
            str = "ig_live_turn_off_questions";
        }
        0Aj A0d2 = C51969G9p.A0d(r1, str);
        int A002 = A00(A0d2, this);
        String str2 = this.A08;
        if (str2 == null || (A0n2 = 00y.A0n(A002, str2)) == null) {
            j = 0;
        } else {
            j = A0n2.longValue();
        }
        JTQ.A10(A0d2, j);
        A06(A0d2, this, "container_module", this.A0O.getModuleName());
        JTP.A1G(A0d2);
        A0d2.Cgf();
    }

    public final void Cmy() {
        if (this.A06 == null) {
            this.A06 = new C63841L8w();
        }
    }

    public static 1Ln A02(M0X m0x, Integer num) {
        1Ln A042 = A04(m0x, num);
        A042.A0m(m0x.A0A);
        return A042;
    }

    public static final 1Ln A03(M0X m0x, Integer num) {
        1Ln A022 = A02(m0x, num);
        A022.A00.A9H("perf", 0j8.A03(LRy.A00(m0x.A0M, m0x.A0R)));
        A022.A0Q("last_av_pts_offset_ms", Long.valueOf(m0x.A03));
        long j = 0;
        A022.A0Q("last_av_sent_time_offset_ms", 0L);
        A022.A0O("has_connection", Boolean.valueOf(m0x.A0C));
        A022.A0R("camera", LKD.A00(m0x.A07));
        AtomicBoolean atomicBoolean = m0x.A0W;
        if (atomicBoolean.get()) {
            j = 1;
        }
        A022.A0Q("is_face_effect_enabled", Long.valueOf(j));
        A022.A0Q("current_viewer_count", JTQ.A0U(m0x.A0n));
        A022.A0Q("is_chat_on", Long.valueOf(G9t.A0k(m0x.A0E ? 1 : 0)));
        A022.A0Q("user_comment_shown_count", DbS.A0j(m0x.A0m.getAndSet(0)));
        A022.A0Q("system_comment_shown_count", DbS.A0j(m0x.A0d.getAndSet(0)));
        A022.A0Q("like_shown_count", DbS.A0j(m0x.A0a.getAndSet(0)));
        A022.A0Q("burst_like_shown_count", DbS.A0j(m0x.A0X.getAndSet(0)));
        ConcurrentHashMap concurrentHashMap = m0x.A0U;
        ArrayList A0q2 = JTT.A0q(A022, concurrentHashMap);
        Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap);
        while (A0s.hasNext()) {
            JTT.A1T(A0q2, A0s);
        }
        A07(A022, m0x, A0q2);
        A022.A0Q("is_audio_muted", Long.valueOf(G9t.A0k(m0x.A0D ? 1 : 0)));
        A022.A0Q("is_video_muted", Long.valueOf(G9t.A0k(m0x.A0F ? 1 : 0)));
        long j2 = m0x.A0q.get();
        if (atomicBoolean.get()) {
            j2 += SystemClock.elapsedRealtime() - m0x.A0o.get();
        }
        A022.A0Q("total_face_effect_applied", JTQ.A0U(m0x.A0g));
        A022.A0Q("total_camera_flip_count", JTQ.A0U(m0x.A0f));
        A022.A0Q("total_duration_with_face_effect", Long.valueOf(j2));
        Enumeration keys = concurrentHashMap.keys();
        if (keys.hasMoreElements()) {
            ArrayList list = Collections.list(keys);
            0qQ.A07(list);
            ArrayList A0r2 = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                0qQ.A0A(A18);
                AnonymousClass7TE.A1Y(A0r2, Long.parseLong(A18));
            }
            A022.A0S("guest_list", A0r2);
        }
        return A022;
    }

    public static void A06(0Aj r2, M0X m0x, String str, String str2) {
        r2.AAJ(str, str2);
        Enumeration keys = m0x.A0U.keys();
        0qQ.A07(keys);
        ArrayList list = Collections.list(keys);
        0qQ.A07(list);
        r2.AAe("current_guest_ids", list);
    }

    public static void A08(1Ln r2, M0X m0x, long j) {
        r2.A0Q(TraceFieldType.BroadcastId, Long.valueOf(j));
        r2.A0R("container_module", m0x.A0O.getModuleName());
        Enumeration keys = m0x.A0U.keys();
        0qQ.A07(keys);
        ArrayList list = Collections.list(keys);
        0qQ.A07(list);
        r2.A0S("current_guest_ids", list);
        r2.A0m(m0x.A0A);
        r2.Cgf();
    }

    public static void A0A(M0X m0x, Integer num) {
        1Ln A042 = A04(m0x, num);
        A042.A0m(m0x.A0A);
        A042.Cgf();
    }
}
