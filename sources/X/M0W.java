package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class M0W implements C313726gu, MUS {
    public long A00;
    public C63841L8w A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final long A08 = SystemClock.elapsedRealtime();
    public final Context A09;
    public final Handler A0A = new Handler();
    public final OMM A0B;
    public final C58840Ae A0C;
    public final AnonymousClass0iw A0D;
    public final 1Q9 A0E;
    public final 1Cn A0F;
    public final Runnable A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final Set A0M = DbS.A0y();
    public final AtomicBoolean A0N = new AtomicBoolean(false);
    public final AtomicInteger A0O = new AtomicInteger(0);
    public final AtomicInteger A0P = new AtomicInteger(0);
    public final AtomicLong A0Q = new AtomicLong(0);
    public final AtomicLong A0R = new AtomicLong(0);

    public final void Ci3(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        0qQ.A0B(str, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicBoolean atomicBoolean = this.A0N;
        boolean z2 = atomicBoolean.get();
        if (z) {
            if (!z2) {
                this.A0Q.set(elapsedRealtime);
            }
            this.A0P.incrementAndGet();
        } else if (z2) {
            this.A0R.addAndGet(elapsedRealtime - this.A0Q.get());
        }
        atomicBoolean.set(z);
        1Ln A032 = A03(this, AnonymousClass05K.A08);
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
        A032.Cgf();
    }

    public final void Cjo(long j, String str, String str2) {
        0qQ.A0B(str, 1);
        0Aj A0d = C51969G9p.A0d(this.A0C, C273654mx.A00(741));
        JTU.A10(A0d, str, str2, j);
        int A002 = A00(A0d, this);
        C51965G9l.A1I(A0d, this.A0K);
        C51969G9p.A1A(A0d, A04(A0d, this, A002));
        JTO.A1R(A0d, "guest");
        A0d.Cgf();
    }

    public final /* synthetic */ void Cjp(long j, String str, String str2) {
    }

    public final void Cjq(int i, String str, String str2, long j) {
        0qQ.A0B(str, 1);
        0Aj A0d = C51969G9p.A0d(this.A0C, C273654mx.A00(2830));
        JTO.A1R(A0d, "guest");
        JTU.A10(A0d, str, str2, j);
        int A002 = A00(A0d, this);
        A0d.A9F("question_index", DbV.A0p(A0d, "m_pk", this.A0K, i));
        C51969G9p.A1A(A0d, A04(A0d, this, A002));
        A0d.Cgf();
    }

    public final /* synthetic */ void Cjr(int i, String str, String str2, long j) {
    }

    public final void Cjt(String str) {
        0qQ.A0B(str, 0);
        0Aj A0d = C51969G9p.A0d(this.A0C, C273654mx.A00(2831));
        JTO.A1R(A0d, "guest");
        A0d.AAJ("question_text", str);
        C51969G9p.A1A(A0d, A04(A0d, this, A00(A0d, this)));
        C51965G9l.A1I(A0d, this.A0K);
        A0d.Cgf();
    }

    public final void Cju(int i, String str, String str2, long j) {
        0qQ.A0B(str, 1);
        0Aj A0d = C51969G9p.A0d(this.A0C, C273654mx.A00(2832));
        JTO.A1R(A0d, "guest");
        JTU.A10(A0d, str, str2, j);
        int A002 = A00(A0d, this);
        A0d.A9F("question_index", DbV.A0p(A0d, "m_pk", this.A0K, i));
        C51969G9p.A1A(A0d, A04(A0d, this, A002));
        A0d.Cgf();
    }

    public final /* synthetic */ void Ckw(boolean z) {
    }

    public static int A00(0Aj r3, M0W m0w) {
        r3.A9F("a_pk", 00y.A0n(10, m0w.A0I));
        return 10;
    }

    public static 1Ln A01(M0W m0w) {
        0wc r2 = m0w.A0C;
        1Ln r4 = new 1Ln(r2.A00(r2.A00, "ig_cobroadcast_waterfall"), 206);
        r4.A0m(m0w.A0K);
        r4.A0P(TraceFieldType.Duration, Double.valueOf(((double) (SystemClock.elapsedRealtime() - m0w.A08)) / 1000.0d));
        String A052 = m0w.A0E.A05();
        0qQ.A07(A052);
        r4.A0R("waterfall_id", A052);
        r4.A0R("container_module", m0w.A0D.getModuleName());
        return r4;
    }

    public static AnonymousClass0iw A04(0Aj r2, M0W m0w, int i) {
        r2.A9F(TraceFieldType.BroadcastId, 00y.A0n(i, m0w.A0H));
        return m0w.A0D;
    }

    private final void A05() {
        1Ln A032 = A03(this, AnonymousClass05K.A05);
        C63841L8w l8w = this.A01;
        if (l8w != null) {
            0bb r3 = new 0bb();
            long j = 0;
            r3.A05("button_tap_count", 0L);
            if (l8w.A04) {
                j = 1;
            }
            r3.A05("button_was_shown", Long.valueOf(j));
            r3.A05("face_effect_off_tap_count", 0L);
            r3.A05("num_effects_in_tray", 0L);
            0xF r2 = new 0xF();
            Iterator A0t = AnonymousClass7TF.A0t(l8w.A00);
            if (A0t.hasNext()) {
                A0t.next();
                throw AnonymousClass7TE.A11("getNumTimesSelected");
            }
            HashMap A033 = 0j8.A03(r2);
            ArrayList A0v = DbS.A0v(A033.size());
            Iterator A0s = AnonymousClass7TF.A0s(A033);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                A0v.add(AnonymousClass7TF.A0w(A1J.getKey(), A1J.getValue()));
            }
            r3.A07("selected_effect_usage_stats", A0v);
            r3.A07("selected_face_effect_session_ids", Collections.unmodifiableList(l8w.A01));
            r3.A05("supports_face_filters", 0L);
            r3.A05("tray_dismissed_with_active_effect_count", 0L);
            A032.A0N(r3, "face_effect_usage_stats");
        }
        A032.Cgf();
    }

    public static void A06(0Aj r3, M0W m0w, int i) {
        1Ln r2 = new 1Ln(r3, i);
        r2.A0R("view_mode", "guest");
        r2.A0Q("a_pk", 00y.A0n(10, m0w.A0I));
        r2.A0Q(TraceFieldType.BroadcastId, 00y.A0n(10, m0w.A0H));
        r2.A0R("container_module", m0w.A0D.getModuleName());
        r2.A0S("current_guest_ids", 00k.A0a(m0w.A0M));
        r2.A0m(m0w.A0K);
        r2.Cgf();
    }

    public static final void A07(M0W m0w, Integer num, String str) {
        String str2;
        String str3;
        switch (num.intValue()) {
            case 0:
                str2 = "INIT";
                break;
            case 1:
                str2 = "ATTEMPT";
                break;
            default:
                str2 = "STARTED";
                break;
        }
        Integer num2 = m0w.A03;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str3 = "ATTEMPT";
                    break;
                case 2:
                    str3 = "STARTED";
                    break;
                case 3:
                    str3 = "ENDED";
                    break;
                case 4:
                    str3 = "ABORTED";
                    break;
                default:
                    str3 = "INIT";
                    break;
            }
        } else {
            str3 = "null";
        }
        0wb.A03("IgLiveWithGuestWaterfall", 002.A13("invalid mJoinState; expected: ", str2, ", actual: ", str3, ", description: ", str));
    }

    public final void A08(Integer num) {
        this.A0O.incrementAndGet();
        1Ln A012 = A01(this);
        A012.A0R("step", "broadcast_camera_flip");
        A012.A0Q(TraceFieldType.BroadcastId, 00y.A0n(10, this.A0H));
        Set set = this.A0M;
        ArrayList A0p = AnonymousClass7TF.A0p(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            JTS.A1V(A0p, it);
        }
        A012.A0S("current_guest_ids", A0p);
        A012.A0R("livewith_stack", "rsys_rtc");
        LKD.A01(A012, num);
    }

    public final void A09(String str, Integer num) {
        String str2;
        Integer num2;
        String str3;
        String str4;
        0qQ.A0B(str, 1);
        this.A0M.remove(str);
        Integer num3 = this.A03;
        if (num3 == AnonymousClass05K.A01) {
            1Ln A032 = A03(this, AnonymousClass05K.A0C);
            if (1 - num.intValue() != 0) {
                str4 = "broadcaster_initiated";
            } else {
                str4 = "guest_initiated";
            }
            JTT.A1B(A032, str4, "");
            A032.Cgf();
            num2 = AnonymousClass05K.A0Y;
        } else {
            Integer num4 = AnonymousClass05K.A0C;
            if (num3 == num4) {
                A05();
                if (this.A03 == num4) {
                    num2 = AnonymousClass05K.A0N;
                    1Ln A033 = A03(this, num2);
                    if (1 - num.intValue() != 0) {
                        str3 = "broadcaster_initiated";
                    } else {
                        str3 = "guest_initiated";
                    }
                    JTT.A1B(A033, str3, "");
                    A033.Cgf();
                } else {
                    if (1 - num.intValue() != 0) {
                        str2 = "BROADCASTER_INITIATED";
                    } else {
                        str2 = "GUEST_INITIATED";
                    }
                    A07(this, num4, 002.A0u("ending broadcast. reason: ", str2, " reasonInfo: ", ""));
                }
            }
            this.A07 = false;
            this.A0A.removeCallbacks(this.A0G);
        }
        this.A03 = num2;
        this.A07 = false;
        this.A0A.removeCallbacks(this.A0G);
    }

    public final void A0A(String str, String str2) {
        1Ln A022 = A02(this, AnonymousClass05K.A15);
        A022.A0R("debug_title", str);
        if (str2.length() != 0) {
            A022.A0R("debug_msg", str2);
        }
        A022.Cgf();
    }

    public final void A0C(String str, Throwable th) {
        Object obj = SS5.A00;
        String A0l = JTS.A0l(th);
        0qQ.A07(A0l);
        A0A(str, A0l);
    }

    public final void ChB() {
        0Aj A0d = C51969G9p.A0d(this.A0C, C273654mx.A00(2819));
        C51969G9p.A1A(A0d, A04(A0d, this, A00(A0d, this)));
        C51965G9l.A1I(A0d, this.A0K);
        JTO.A1R(A0d, "guest");
        A0d.Cgf();
    }

    public final void Cjs(int i, int i2, int i3, int i4, int i5) {
        0Aj A0d = C51969G9p.A0d(this.A0C, C273654mx.A00(743));
        A0d.A9F(C273654mx.A00(1002), JTT.A0l(A0d, JTT.A0l(A0d, JTT.A0l(A0d, JTT.A0l(A0d, DbS.A0j(i), "question_count", i2), C273654mx.A00(83), i3), C273654mx.A00(968), i4), C273654mx.A00(540), i5));
        int A002 = A00(A0d, this);
        C51965G9l.A1I(A0d, this.A0K);
        C51969G9p.A1A(A0d, A04(A0d, this, A002));
        JTO.A1R(A0d, "guest");
        A0d.Cgf();
    }

    public final void Cmy() {
        if (this.A01 == null) {
            this.A01 = new C63841L8w();
        }
    }

    public M0W(Context context, C58840Ae r7, AnonymousClass0iw r8, 1Cn r9, String str, String str2, String str3, String str4, String str5, Set set) {
        this.A0F = r9;
        this.A0H = str;
        this.A0I = str2;
        this.A0K = str3;
        this.A0L = str4;
        this.A0J = str5;
        this.A0C = r7;
        this.A0D = r8;
        this.A09 = DbT.A05(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A0M.add(DbT.A0k(it).getId());
        }
        this.A00 = 0;
        this.A0B = OYL.A01(OYL.A02("/proc/self/stat"));
        1Q9 A002 = 1Q9.A00(this.A0D, getClass().getName());
        this.A0E = A002;
        A002.A08();
        A002.A05();
        DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        this.A03 = AnonymousClass05K.A00;
        this.A0G = new M56(this);
    }

    public static final 1Ln A02(M0W m0w, Integer num) {
        1Ln A012 = A01(m0w);
        A012.A0R("step", C63485Kxp.A00(num));
        Set set = m0w.A0M;
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            JTS.A1V(A0r, it);
        }
        A012.A0S("current_guest_ids", A0r);
        A012.A0R("livewith_stack", "rsys_rtc");
        return A012;
    }

    public static final 1Ln A03(M0W m0w, Integer num) {
        String str;
        1Ln A012 = A01(m0w);
        A012.A0R("step", C63485Kxp.A00(num));
        A012.A0Q(TraceFieldType.BroadcastId, 00y.A0n(10, m0w.A0H));
        A012.A00.A9H("perf", 0j8.A03(LRy.A00(m0w.A0B, m0w.A0F)));
        Integer num2 = m0w.A02;
        if (num2 != null) {
            str = LKD.A00(num2);
        } else {
            str = "";
        }
        A012.A0R("camera", str);
        AtomicBoolean atomicBoolean = m0w.A0N;
        A012.A0Q("face_effect_enabled", Long.valueOf(G9t.A0k(atomicBoolean.get() ? 1 : 0)));
        A012.A0R("network_connection", C61970qY.A08(m0w.A09));
        A012.A0R("a_i", C273654mx.A00(868));
        A012.A0O(AnonymousClass000.A00(1516), AnonymousClass7TE.A0v());
        A012.A0R("invite_type", m0w.A0J);
        A012.A0R(AnonymousClass000.A00(1900), m0w.A0L);
        A012.A0Q("is_audio_muted", Long.valueOf(G9t.A0k(m0w.A05 ? 1 : 0)));
        A012.A0Q("is_video_muted", Long.valueOf(G9t.A0k(m0w.A06 ? 1 : 0)));
        Set set = m0w.A0M;
        ArrayList A0p = AnonymousClass7TF.A0p(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            JTS.A1V(A0p, it);
        }
        A012.A0S("current_guest_ids", A0p);
        A012.A0R("livewith_stack", "rsys_rtc");
        long j = m0w.A0R.get();
        if (atomicBoolean.get()) {
            j += SystemClock.elapsedRealtime() - m0w.A0Q.get();
        }
        A012.A0Q("total_face_effect_applied", JTQ.A0U(m0w.A0P));
        A012.A0Q("total_camera_flip_count", JTQ.A0U(m0w.A0O));
        A012.A0Q("total_duration_with_face_effect", Long.valueOf(AnonymousClass7TE.A0P(j)));
        return A012;
    }

    public final void A0B(String str, String str2, String str3, boolean z) {
        Integer num;
        StringBuilder sb;
        String str4;
        Integer num2;
        boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
        1Ln A032 = A03(this, AnonymousClass05K.A1F);
        String A0R2 = 002.A0R("Reason: ", str2);
        if (str3 != null) {
            A0R2 = 002.A0g(A0R2, ", Description: ", str3);
        }
        0KC.A0C("IgLiveWithGuestWaterfall", A0R2);
        A032.A0Q(TraceFieldType.ErrorCode, 2000L);
        A032.A0R(AnonymousClass000.A00(34), str);
        A032.A0R("error_info", A0R2);
        A032.Cgf();
        if (z) {
            Integer num3 = this.A03;
            int intValue = num3.intValue();
            if (intValue == A1Z) {
                A05();
                if (str3 == null) {
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                }
                Integer num4 = this.A03;
                num = AnonymousClass05K.A01;
                if (num4 == num) {
                    1Ln A033 = A03(this, AnonymousClass05K.A0C);
                    JTT.A1B(A033, "error", str3);
                    A033.Cgf();
                    num2 = AnonymousClass05K.A0Y;
                } else {
                    sb = AnonymousClass7TE.A1A();
                    sb.append("aborting broadcast. reason: ");
                    str4 = "ERROR";
                    sb.append(str4);
                    sb.append(" reasonInfo: ");
                    A07(this, num, AnonymousClass7TF.A0l(str3, sb));
                    return;
                }
            } else if (intValue == 2) {
                if (str3 == null) {
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                }
                num = AnonymousClass05K.A0C;
                if (num3 == num) {
                    num2 = AnonymousClass05K.A0N;
                    1Ln A034 = A03(this, num2);
                    JTT.A1B(A034, "broadcast_failure", str3);
                    A034.Cgf();
                } else {
                    sb = AnonymousClass7TE.A1A();
                    sb.append("ending broadcast. reason: ");
                    str4 = "BROADCAST_FAILURE";
                    sb.append(str4);
                    sb.append(" reasonInfo: ");
                    A07(this, num, AnonymousClass7TF.A0l(str3, sb));
                    return;
                }
            } else {
                return;
            }
            this.A03 = num2;
        }
    }
}
