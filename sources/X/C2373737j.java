package X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.util.jpeg.JpegBridge;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

/* renamed from: X.37j  reason: invalid class name and case insensitive filesystem */
public final class C2373737j implements AnonymousClass0iw, C2373837k, C2374237o {
    public static final String __redex_internal_original_name = "MediaUploadLoggerImpl";
    public final Context A00;
    public final 0wc A01;
    public final UserSession A02;
    public final C61410nE A03 = C61410nE.A00;
    public final /* synthetic */ C2374437q A04;

    public C2373737j(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A04 = new C2374437q(userSession);
        this.A00 = context;
        this.A02 = userSession;
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A00 = this;
        this.A01 = r0.A00();
    }

    public static final String A03(Throwable th) {
        Class<?> cls;
        String str = null;
        Throwable th2 = null;
        for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof FileNotFoundException) {
                return 002.A0S(Pxd.A00(501), C59906JbV.A05(th3), ')');
            }
            if (th3 instanceof AnonymousClass3EF) {
                return "TimeoutCancellationException";
            }
            if (th3 instanceof CancellationException) {
                return "CancellationException";
            }
            th2 = th3;
        }
        if (th == null) {
            return "unknown";
        }
        String simpleName = th.getClass().getSimpleName();
        if (!(th2 == null || (cls = th2.getClass()) == null)) {
            str = cls.getSimpleName();
        }
        String A0T = 002.A0T(simpleName, str, ':');
        if (A0T == null) {
            return "unknown";
        }
        return A0T;
    }

    private final void A0A(AnonymousClass3Q2 r15, int i) {
        Integer valueOf;
        Set set;
        Context context = this.A00;
        UserSession userSession = this.A02;
        C59907JbW jbW = new C59907JbW(context, userSession, r15);
        AnonymousClass3QF r3 = r15.A1T;
        AnonymousClass3Q2 r4 = jbW.A02;
        int i2 = i;
        A0C(r15, this, C2373637i.A01(r4), C59909JbY.A00(C59906JbV.A00(r4)), C59906JbV.A01(userSession, r15), C59906JbV.A02(userSession, r15, i2), i2, jbW.A0J());
        synchronized (r3) {
            Set set2 = r3.A0D;
            valueOf = Integer.valueOf(i2);
            set2.add(valueOf);
        }
        String A012 = C2373637i.A01(r4);
        synchronized (r3) {
            0qQ.A0B(A012, 0);
            if (r3.A0A.get(A012) == null) {
                r3.A0A.put(A012, new AnonymousClass9IE(0sc.A06(new Integer[]{valueOf})));
            } else {
                AnonymousClass9IE r0 = (AnonymousClass9IE) r3.A0A.get(A012);
                if (!(r0 == null || (set = (Set) r0.A00) == null)) {
                    set.add(valueOf);
                }
            }
        }
        if (r15.A12() || C379909Vu.A08(r15)) {
            Q1Q q1q = new Q1Q(userSession);
            try {
                HashMap A002 = C9839RiB.A00(r15, q1q);
                HashMap hashMap = new HashMap();
                hashMap.putAll(A002);
                C9596Rda.A00(q1q, (Exception) null, "media_upload_flow_start", hashMap, q1q.now() - q1q.now());
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("share type: ");
                sb.append(r15.A0E());
                0wb.A05("videolite_event_err_start", sb.toString(), 1, th);
            }
        }
    }

    public static final void A0B(AnonymousClass3Q2 r1, C2373737j r2, String str, String str2) {
        0xI A002 = A00((AnonymousClass0iw) null, r1, r2, str);
        A002.A0C("reason", str2);
        A07(A002, r2);
    }

    public final void A0F(AnonymousClass3Q2 r10, String str, String str2, int i) {
        0qQ.A0B(str, 1);
        C2374437q r8 = this.A04;
        if (r10 == null || !r10.A5D) {
            int hashCode = 002.A0G(str, ':', i).hashCode();
            UserFlowLogger userFlowLogger = r8.A00;
            long generateFlowId = userFlowLogger.generateFlowId(51052545, hashCode);
            if (r10 == null || !r10.A5D) {
                userFlowLogger.flowStart(generateFlowId, str2, false);
                userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "publish_id", i);
                userFlowLogger.flowAnnotate(generateFlowId, "start_source", str2);
                if (r10 != null) {
                    userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, Dbm.A02(9, 10, 81), C2373637i.A01(r10));
                    UserSession userSession = r8.A01;
                    userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "ingest_surface", C59906JbV.A01(userSession, r10));
                    userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "target_surface", C59906JbV.A03(userSession, r10, (ShareType) null, true));
                    userFlowLogger.flowAnnotate(generateFlowId, "share_type", r10.A0E().name());
                    boolean z = false;
                    if (r10.A3O != null) {
                        z = true;
                    }
                    userFlowLogger.flowAnnotate(generateFlowId, "is_carousel_item", z);
                    userFlowLogger.flowAnnotate(generateFlowId, "ingest_type", C59906JbV.A04(r10));
                    userFlowLogger.flowAnnotate(generateFlowId, "media_type", C59909JbY.A00(C59906JbV.A00(r10)));
                }
            }
        }
    }

    public final void ABU(AnonymousClass3Q2 r2, int i) {
        this.A04.ABU(r2, i);
    }

    public final void ABV(AnonymousClass3Q2 r2, int i) {
        this.A04.ABV(r2, i);
    }

    public final void CjK(SJL sjl, AnonymousClass3Q2 r3) {
        this.A04.CjK(sjl, r3);
    }

    public final void Cji(AnonymousClass55S r5, AnonymousClass3Q2 r6, String str, String str2, Throwable th) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        1Zp A012 = 1Zm.A00(this.A02).A01(AnonymousClass05K.A0Y, AnonymousClass05K.A0L, false);
        String A002 = AnonymousClass000.A00(3067);
        A012.A03(A002, str);
        A012.A03("error_message", str2);
        A08(A012, r5, r6);
        if (th == null) {
            A012.A03("logview_group_by", A002);
        } else {
            A012.A05(th);
        }
        A012.A00();
    }

    public final void Cjm(AnonymousClass3Q2 r2, String str, String str2) {
        this.A04.Cjm(r2, str, str2);
    }

    public final void Cjn(AnonymousClass3Q2 r3, String str, String str2) {
        this.A04.Cjn(r3, AnonymousClass000.A00(640), str2);
    }

    public final void EFb(AnonymousClass3Q2 r9) {
        String str;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_media_publish_server_failure");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r9);
            AnonymousClass3Q2 r6 = jbW.A02;
            A002.AAJ(Dbm.A00(), C2373637i.A01(r6));
            A002.AAJ("ingest_id", jbW.A0H());
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r9));
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r6)));
            Long A0C = new C59907JbW(context, userSession, r9).A0C();
            Map map = null;
            if (A0C != null) {
                str = A0C.toString();
            } else {
                str = null;
            }
            A002.AAJ("media_id", str);
            A002.AAJ("publish_id", String.valueOf(r9.A1T.A00()));
            A002.AAJ("target_surface", C59906JbV.A03(userSession, r9, (ShareType) null, true));
            if (!r9.A5D) {
                map = jbW.A07();
            }
            A002.A9H("custom_fields", map);
            A002.AAJ("from_draft", String.valueOf(r9.A5S));
            A002.A7p("is_panavision", false);
            A002.A8D("client_upload_mos", Double.valueOf(r9.A1j.A00));
            A002.A9F("media_creation_time", Long.valueOf(r9.A0g / 1000));
            A002.Cgf();
        }
    }

    public final void EFc(AnonymousClass3Q2 r9) {
        Map A07;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_media_upload_configure_params_failure");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r9);
            AnonymousClass3Q2 r5 = jbW.A02;
            A002.AAJ(Dbm.A00(), C2373637i.A01(r5));
            A002.AAJ("publish_id", String.valueOf(r9.A1T.A00()));
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r9));
            A002.AAJ("target_surface", C59906JbV.A03(userSession, r9, (ShareType) null, true));
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r5)));
            A002.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
            A002.AAJ("application_state", AnonymousClass5BB.A00());
            if (r9.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            A002.A9H("custom_fields", A07);
            A002.A9F(AnonymousClass000.A00(1289), (Long) null);
            A002.AAJ("from_draft", String.valueOf(r9.A5S));
            A002.A7p("is_panavision", false);
            A002.A8D("client_upload_mos", Double.valueOf(r9.A1j.A00));
            A002.A9F("media_creation_time", Long.valueOf(r9.A0g / 1000));
            A002.Cgf();
        }
    }

    public final void EFd(AnonymousClass55S r13, AnonymousClass3Q2 r14, String str, Throwable th) {
        String str2 = str;
        0qQ.A0B(str, 1);
        AnonymousClass3Q2 r4 = r14;
        Iterator it = r14.A1T.A03().iterator();
        while (true) {
            Throwable th2 = th;
            if (it.hasNext()) {
                EFu((AnonymousClass55S) null, r4, (String) null, (String) null, (String) null, (String) null, str2, th2, ((Number) it.next()).intValue());
            } else {
                A0D(r14, this, th2);
                return;
            }
        }
    }

    public final void EFk(AnonymousClass55S r24, AnonymousClass3Q2 r25, 1us r26, String str, Throwable th) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        0wc r6 = this.A01;
        AnonymousClass3Q2 r3 = r25;
        AnonymousClass3QD r0 = r3.A6J;
        AnonymousClass3QD r22 = r0;
        0qQ.A0B(r6, 1);
        0qQ.A0B(r0, 2);
        String A002 = AnonymousClass000.A00(645);
        String A003 = AnonymousClass000.A00(805);
        String A004 = AnonymousClass000.A00(731);
        1Ln r62 = new 1Ln(r6.A00(r6.A00, "configure_media_failure"), 137);
        if (r62.A00.isSampled()) {
            r62.A0R("media_type", "0");
            r62.A0R("reason", "");
            r62.A0R("share_type", "0");
            r62.A0Q("upload_id", Long.valueOf(Long.parseLong("0")));
            r62.A0R("waterfall_id", "0");
            r62.A0R("attempt_source", (String) null);
            r62.A0Q("media_id", (Long) null);
            r62.A0P(AnonymousClass000.A00(1823), (Double) null);
            r62.A0R("target", r22.toString());
            r62.A0Q("original_height", (Long) null);
            r62.A0Q("original_width", (Long) null);
            r62.A0R("connection", (String) null);
            r62.A0R("from", (String) null);
            r62.A0R("source_type", (String) null);
            r62.A0Q(A003, (Long) null);
            r62.A0Q("publish_id", (Long) null);
            r62.A0Q("sub_share_id", (Long) null);
            r62.A0Q(Pxd.A00(37), (Long) null);
            r62.A0Q("dimension", (Long) null);
            r62.A0Q("dimension_height", (Long) null);
            r62.A0Q("original_file_size", (Long) null);
            r62.A0Q("video_duration", (Long) null);
            r62.A0Q(A004, (Long) null);
            r62.A0Q("total_size", (Long) null);
            r62.A0Q(AnonymousClass000.A00(375), (Long) null);
            r62.A0Q("auto_retry_count", (Long) null);
            r62.A0Q(A002, (Long) null);
            r62.A0Q("manual_retry_count", (Long) null);
            r62.A0Q("cancel_count", (Long) null);
            r62.A0Q("loop_count", (Long) null);
            r62.A0Q(AnonymousClass000.A00(1841), (Long) null);
            r62.A0Q("is_carousel_child", (Long) null);
            r62.A0Q("target_bitrate_bps", (Long) null);
            r62.Cgf();
        }
        EFd((AnonymousClass55S) null, r3, str2, th);
        A0E(r3, TraceFieldType.FailureReason, str2);
        A0E(r3, "error_type", r24.name());
        Cjm(r3, "configure_media_failure", (String) null);
    }

    public final void EFl(AnonymousClass3Q2 r20, 1us r21, String str, boolean z) {
        Map A07;
        AnonymousClass3Q2 r2 = r20;
        if (!r2.A4s.contains(Integer.valueOf(r2.A1T.A00()))) {
            if (z) {
                int A002 = r2.A1T.A00();
                0wc r5 = this.A01;
                0Aj A003 = r5.A00(r5.A00, "ig_media_upload_configure_params_success");
                if (A003.isSampled()) {
                    Context context = this.A00;
                    UserSession userSession = this.A02;
                    C59907JbW jbW = new C59907JbW(context, userSession, r2);
                    AnonymousClass3Q2 r8 = jbW.A02;
                    A003.AAJ(Dbm.A00(), C2373637i.A01(r8));
                    A003.AAJ("publish_id", String.valueOf(A002));
                    A003.AAJ("connection", C61970qY.A08(jbW.A00));
                    A003.AAJ("ingest_surface", C59906JbV.A01(userSession, r2));
                    A003.AAJ("target_surface", C59906JbV.A03(userSession, r2, (ShareType) null, true));
                    A003.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r8)));
                    A003.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
                    A003.AAJ("application_state", AnonymousClass5BB.A00());
                    if (r2.A5D) {
                        A07 = null;
                    } else {
                        A07 = jbW.A07();
                    }
                    A003.A9H("custom_fields", A07);
                    A003.A9F(AnonymousClass000.A00(1289), (Long) null);
                    A003.AAJ("from_draft", String.valueOf(r2.A5S));
                    A003.A7p("is_panavision", false);
                    A003.A8D("client_upload_mos", Double.valueOf(r2.A1j.A00));
                    A003.A9F("media_creation_time", Long.valueOf(r2.A0g / 1000));
                    A003.Cgf();
                }
            } else {
                0wc r15 = this.A01;
                0qQ.A0B(r15, 1);
                String A004 = AnonymousClass000.A00(645);
                String A005 = AnonymousClass000.A00(805);
                String A006 = AnonymousClass000.A00(731);
                AnonymousClass3QD r10 = r2.A6J;
                0qQ.A0B(r10, 0);
                1Ln r1 = new 1Ln(r15.A00(r15.A00, "configure_media_success"), 138);
                if (r1.A00.isSampled()) {
                    r1.A0R("media_type", "0");
                    r1.A0R("share_type", "0");
                    r1.A0R("upload_id", "0");
                    r1.A0R("attempt_source", (String) null);
                    r1.A0R("media_id", (String) null);
                    r1.A0P(AnonymousClass000.A00(1823), (Double) null);
                    r1.A0R("target", String.valueOf(r10));
                    r1.A0Q("original_height", (Long) null);
                    r1.A0Q("original_width", (Long) null);
                    r1.A0R("waterfall_id", (String) null);
                    r1.A0R("connection", (String) null);
                    r1.A0R("from", (String) null);
                    r1.A0R("source_type", (String) null);
                    r1.A0Q(A005, (Long) null);
                    r1.A0Q("publish_id", (Long) null);
                    r1.A0Q("sub_share_id", (Long) null);
                    r1.A0Q(Pxd.A00(37), (Long) null);
                    r1.A0Q("dimension", (Long) null);
                    r1.A0Q("dimension_height", (Long) null);
                    r1.A0Q("original_file_size", (Long) null);
                    r1.A0Q("video_duration", (Long) null);
                    r1.A0Q(A006, (Long) null);
                    r1.A0Q("total_size", (Long) null);
                    r1.A0Q(AnonymousClass000.A00(375), (Long) null);
                    r1.A0Q("auto_retry_count", (Long) null);
                    r1.A0Q(A004, (Long) null);
                    r1.A0Q("manual_retry_count", (Long) null);
                    r1.A0Q("cancel_count", (Long) null);
                    r1.A0Q("loop_count", (Long) null);
                    r1.A0Q(AnonymousClass000.A00(1841), (Long) null);
                    r1.A0Q("is_carousel_child", (Long) null);
                    r1.A0Q("target_bitrate_bps", (Long) null);
                    r1.Cgf();
                }
                r2.A4s.add(Integer.valueOf(r2.A1T.A00()));
            }
            Cjm(r2, "configure_media_success", (String) null);
        }
    }

    public final void EFx(AnonymousClass3Q2 r10, String str) {
        int A002;
        Map A07;
        0wc r2 = this.A01;
        0Aj A003 = r2.A00(r2.A00, "ig_media_publish_cancel");
        if (A003.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r10);
            AnonymousClass3QF r1 = r10.A1T;
            List A032 = r1.A03();
            if (!A032.isEmpty()) {
                A002 = ((Number) A032.get(0)).intValue();
            } else {
                A002 = r1.A00();
            }
            if (!C59906JbV.A00.A09(userSession, r10, A002) || 0qQ.A0K(r1.A02(A002, C2373637i.A01(jbW.A02)), true)) {
                AnonymousClass3Q2 r8 = jbW.A02;
                A003.AAJ(Dbm.A00(), C2373637i.A01(r8));
                A003.AAJ("connection", C61970qY.A08(jbW.A00));
                A003.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r8)));
                A003.AAJ("publish_id", String.valueOf(A002));
                A003.AAJ("ingest_surface", C59906JbV.A01(userSession, r10));
                A003.AAJ("target_surface", C59906JbV.A03(userSession, r10, (ShareType) null, true));
                A003.AAJ("ingest_type", jbW.A0I());
                A003.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
                A003.A9F("duration_ms", jbW.A08());
                A003.A9F("file_size_bytes", jbW.A09());
                A003.A9F("original_file_size_bytes", jbW.A0E());
                A003.A9F("media_height", jbW.A0B());
                A003.A9F("media_width", jbW.A0D());
                A003.A9F("original_media_height", jbW.A0F());
                A003.A9F("original_media_width", jbW.A0G());
                A003.AAJ("reason", str);
                A003.AAJ("application_state", AnonymousClass5BB.A00());
                if (r10.A5D) {
                    A07 = null;
                } else {
                    A07 = jbW.A07();
                }
                A003.A9H("custom_fields", A07);
                A003.AAe("server_edits", C59906JbV.A06(userSession, r10, false));
                A003.Cgf();
            }
        }
    }

    public final void EFy(AnonymousClass3Q2 r11, String str, int i) {
        String str2;
        Map A07;
        0qQ.A0B(r11, 0);
        0qQ.A0B(str, 2);
        AnonymousClass55U r0 = r11.A6I;
        if (r0 == null || (str2 = r0.A02) == null) {
            str2 = "no_error";
        }
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_media_publish_user_abandon");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r11);
            if (!C59906JbV.A00.A09(userSession, r11, i) || 0qQ.A0K(r11.A1T.A02(i, C2373637i.A01(jbW.A02)), true)) {
                AnonymousClass3Q2 r7 = jbW.A02;
                A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r7));
                A002.AAJ("connection", C61970qY.A08(jbW.A00));
                A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r7)));
                A002.AAJ("publish_id", String.valueOf(i));
                A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r11));
                A002.AAJ("target_surface", C59906JbV.A03(userSession, r11, (ShareType) null, true));
                A002.AAJ("ingest_type", jbW.A0I());
                A002.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
                A002.A9F("duration_ms", jbW.A08());
                A002.A9F("file_size_bytes", jbW.A09());
                A002.A9F("original_file_size_bytes", jbW.A0E());
                A002.A9F("media_height", jbW.A0B());
                A002.A9F("media_width", jbW.A0D());
                A002.A9F("original_media_height", jbW.A0F());
                A002.A9F("original_media_width", jbW.A0G());
                A002.AAJ("reason", str);
                A002.AAJ("error_message", str2);
                A002.AAJ("application_state", AnonymousClass5BB.A00());
                if (r11.A5D) {
                    A07 = null;
                } else {
                    A07 = jbW.A07();
                    A07.put("upload_id", r11.A3t);
                }
                A002.A9H("custom_fields", A07);
                A002.AAe("server_edits", C59906JbV.A06(userSession, r11, false));
                A002.Cgf();
            } else {
                return;
            }
        }
        if (!r11.A1T.A04()) {
            return;
        }
        if (r11.A12() || C379909Vu.A08(r11)) {
            Q1Q q1q = new Q1Q(this.A02);
            try {
                HashMap A003 = C9839RiB.A00(r11, q1q);
                HashMap hashMap = new HashMap();
                hashMap.putAll(A003);
                C9596Rda.A00(q1q, (Exception) null, "media_upload_flow_cancel", hashMap, q1q.now());
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("share type: ");
                sb.append(r11.A0E());
                0wb.A05("videolite_event_err_cancel", sb.toString(), 1, th);
            }
        }
    }

    public final void EFz(AnonymousClass55S r16, AnonymousClass3Q2 r17, String str, Throwable th) {
        String str2;
        Map A07;
        String str3 = str;
        0qQ.A0B(str3, 1);
        0wc r1 = this.A01;
        String A002 = AnonymousClass000.A00(640);
        0Aj A003 = r1.A00(r1.A00, A002);
        AnonymousClass55S r10 = r16;
        AnonymousClass3Q2 r11 = r17;
        Throwable th2 = th;
        if (A003.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r11);
            AnonymousClass3Q2 r8 = jbW.A02;
            A003.AAJ(Dbm.A00(), C2373637i.A01(r8));
            A003.AAJ("connection", C61970qY.A08(jbW.A00));
            A003.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r8)));
            A003.AAJ("ingest_id", jbW.A0H());
            A003.AAJ("ingest_surface", C59906JbV.A01(userSession, r11));
            A003.AAJ("target_surface", C59906JbV.A03(userSession, r11, (ShareType) null, true));
            A003.AAJ("ingest_type", jbW.A0I());
            A003.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
            A003.A9F("duration_ms", jbW.A08());
            A003.A9F("file_size_bytes", jbW.A09());
            A003.A9F("original_file_size_bytes", jbW.A0E());
            A003.A9F("media_height", jbW.A0B());
            A003.A9F("media_width", jbW.A0D());
            A003.A9F("original_media_height", jbW.A0F());
            A003.A9F("original_media_width", jbW.A0G());
            A003.AAJ("reason", A03(th2));
            StringBuilder sb = new StringBuilder();
            sb.append("errorType:");
            sb.append(r10);
            sb.append(", message:");
            sb.append(str3);
            A003.AAJ("error_message", sb.toString());
            A003.A9H("exception_data", C63375Kvw.A00(th2));
            if (r11.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            A003.A9H("custom_fields", A07);
            A003.AAJ("application_state", AnonymousClass5BB.A00());
            if (r11.A5p) {
                A003.A7p("is_video_variant", true);
            }
            A003.Cgf();
        }
        if (th != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r11.A1G);
            sb2.append("_UPLOAD_FAILURE");
            Cji(r10, r11, sb2.toString(), str3, th2);
        }
        C59968Jcd.A01((0xI) null, r11, th2);
        A0E(r11, TraceFieldType.FailureReason, str3);
        if (r16 != null) {
            str2 = r10.name();
        } else {
            str2 = null;
        }
        A0E(r11, "error_type", str2);
        Cjm(r11, A002, (String) null);
        A0D(r11, this, th2);
    }

    public final void EGC(AnonymousClass3Q2 r12) {
        Map A07;
        0qQ.A0B(r12, 0);
        if (r12.A0u()) {
            for (AnonymousClass3Q2 EGC : r12.A0L()) {
                EGC(EGC);
            }
            return;
        }
        AnonymousClass3QF r4 = r12.A1T;
        if (!r4.A0G) {
            0wc r1 = this.A01;
            0Aj A002 = r1.A00(r1.A00, "ig_media_publish_ready");
            if (A002.isSampled()) {
                Context context = this.A00;
                UserSession userSession = this.A02;
                C59907JbW jbW = new C59907JbW(context, userSession, r12);
                AnonymousClass3Q2 r10 = jbW.A02;
                A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r10));
                A002.AAJ("ingest_id", jbW.A0H());
                A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r10)));
                A002.AAJ("connection", C61970qY.A08(jbW.A00));
                A002.A9F("duration_ms", jbW.A08());
                A002.A9F("file_size_bytes", jbW.A09());
                A002.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
                A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r12));
                A002.AAJ("target_surface", C59906JbV.A03(userSession, r12, (ShareType) null, true));
                if (r12.A5D) {
                    A07 = null;
                } else {
                    A07 = jbW.A07();
                }
                A002.A9H("custom_fields", A07);
                A002.AAJ("application_state", AnonymousClass5BB.A00());
                A002.Cgf();
            }
            Cjm(r12, "ig_media_publish_ready", (String) null);
            r4.A0G = true;
        }
    }

    public final String getModuleName() {
        return "ig_upload_flow";
    }

    public static final 0xI A00(AnonymousClass0iw r9, AnonymousClass3Q2 r10, C2373737j r11, String str) {
        String A08;
        int i;
        String str2 = r10.A3t;
        AnonymousClass3QD r7 = r10.A1f;
        if ((str == "pending_media_post" || str == "pending_media_cancel_click" || str == "pending_media_retry_click") && Settings.Global.getInt(r11.A00.getContentResolver(), "airplane_mode_on", 0) != 0) {
            A08 = "Airplane mode";
        } else {
            A08 = C61970qY.A08(r11.A00);
        }
        if (r9 == null) {
            r9 = r11;
        }
        0xI A002 = 0xI.A00(r9, str);
        0qQ.A0B(str2, 0);
        A002.A0C("upload_id", str2);
        String obj = r10.A07().toString();
        0qQ.A0B(obj, 0);
        A002.A0C("media_type", obj);
        String obj2 = r7.toString();
        0qQ.A0B(obj2, 0);
        A002.A0C("from", obj2);
        0qQ.A0B(A08, 0);
        A002.A0C("connection", A08);
        String obj3 = r10.A0E().toString();
        0qQ.A0B(obj3, 0);
        A002.A0C("share_type", obj3);
        if (r10.A1G == 1iA.A0a && !0qQ.A0K(r10.A1N, C376399Hv.A00())) {
            ClipInfo clipInfo = r10.A1N;
            A002.A08(Integer.valueOf(clipInfo.A05 - clipInfo.A07), "video_duration");
            A002.A08(Integer.valueOf(r10.A0S), "dimension");
            A002.A08(Integer.valueOf(r10.A0R), "dimension_height");
            C273784nB r0 = r10.A1W;
            if (!(r0 == null || (i = r0.A00) == -1)) {
                A002.A08(Integer.valueOf(i), "target_bitrate_bps");
            }
        }
        if (r10.A3O != null) {
            A002.A0C("is_carousel_child", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        C59968Jcd.A00(A002, r10);
        if (str == "pending_media_cancel_click" || str == "pending_media_retry_click") {
            A04(A002, r10);
        }
        return A002;
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, X.L9w] */
    public static final 0xI A01(C2373737j r9, LP8 lp8, String str) {
        long j;
        AnonymousClass55S r0;
        String A002;
        String A003;
        String obj;
        AnonymousClass3Q2 r3 = lp8.A0D;
        new Object();
        0xI A004 = A00((AnonymousClass0iw) null, r3, r9, str);
        A004.A0C("attempt_source", lp8.A0I);
        A004.A0B("duration_in_ms", Long.valueOf(SystemClock.elapsedRealtime() - lp8.A03));
        A004.A0C("to", r3.A1f.toString());
        int i = lp8.A00;
        if (i > 0) {
            A004.A08(Integer.valueOf(i), "attempt_loop_count");
        }
        int i2 = lp8.A01;
        if (i2 > 0) {
            A004.A08(Integer.valueOf(i2), "attempt_auto_retry_count");
        }
        int i3 = lp8.A02;
        if (i3 > 0) {
            A004.A08(Integer.valueOf(i3), "attempt_server_retry_count");
        }
        C64386Lb3 lb3 = lp8.A07;
        long j2 = lb3.A03;
        if (j2 >= 0) {
            A004.A0B("total_size", Long.valueOf(j2));
        }
        long j3 = lb3.A01;
        if (j3 >= 0 && lp8.A05 == r3.A1f) {
            A004.A0B("sent_size", Long.valueOf(j3));
        }
        long j4 = lb3.A02;
        if (j4 >= 0) {
            A004.A0B(C273654mx.A00(614), Long.valueOf(j4));
        }
        int i4 = lb3.A00;
        if (i4 > 0) {
            A004.A08(Integer.valueOf(i4), "chunk_count");
        }
        AnonymousClass4MS r1 = lb3.A05;
        if (r1.A02) {
            j = r1.A00(TimeUnit.MILLISECONDS);
        } else {
            j = -1;
        }
        if (j >= 0) {
            A004.A0B("chunk_duration", Long.valueOf(j));
        }
        String str2 = lb3.A04;
        if (!(str2 == null || str2.length() == 0)) {
            A004.A0C("server", str2);
        }
        if (r3.A1G == 1iA.A0Q && lp8.A05 == AnonymousClass3QD.NOT_UPLOADED) {
            A004.A08(Integer.valueOf(r3.A0H), "original_width");
            A004.A08(Integer.valueOf(r3.A0G), "original_height");
            A004.A08(Integer.valueOf(r3.A0C), "crop_dimension");
            A004.A08(Integer.valueOf(r3.A0B), "crop_dimension_height");
            A004.A08(Integer.valueOf(r3.A0S), "dimension");
            A004.A08(Integer.valueOf(r3.A0R), "dimension_height");
            A004.A08(Integer.valueOf(r3.A0A), Pxd.A00(260));
            synchronized (LTE.class) {
                LTE.A05();
                StringBuilder sb = new StringBuilder();
                if (JpegBridge.A01()) {
                    A002 = JpegBridge.getJpegLibraryNameNative();
                } else {
                    A002 = AnonymousClass000.A00(689);
                }
                sb.append(A002);
                sb.append('/');
                if (JpegBridge.A01()) {
                    A003 = JpegBridge.getJpegLibraryVersionNative();
                } else {
                    A003 = AnonymousClass000.A00(689);
                }
                sb.append(A003);
                sb.append('/');
                sb.append(LTE.A01);
                sb.append('@');
                sb.append(LTE.A03);
                sb.append('-');
                sb.append(LTE.A00);
                sb.append('@');
                sb.append(LTE.A02);
                obj = sb.toString();
            }
            A004.A0C("compression", obj);
            A004.A0C("photo_processing", LTE.A03(r9.A02));
        }
        if (lp8.A05 == AnonymousClass3QD.UPLOADED) {
            A05(A004, r3, new Object());
            new Object();
            C59968Jcd.A00(A004, r3);
            if (r3.A1f == AnonymousClass3QD.CONFIGURED) {
                new Object();
                A04(A004, r3);
            }
        }
        AnonymousClass55U r02 = lp8.A04;
        if (r02 != null) {
            r0 = r02.A01;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            A004.A0C("error_type", r0.toString());
        }
        return A004;
    }

    @Deprecated(message = "Deprecated because the pending_media_info event is terrible and obscure and we are actively trying to get rid of it.")
    public static final 0xI A02(C2373737j r11, LP8 lp8, String str, String str2, long j) {
        AnonymousClass3Q2 r10 = lp8.A0D;
        int A002 = r10.A1X.A00(AnonymousClass05K.A00);
        C2373737j r8 = r11;
        0xI A003 = A00((AnonymousClass0iw) null, r10, r11, "pending_media_info");
        A003.A0C("step", str);
        A003.A0B("duration_in_ms", Long.valueOf(SystemClock.elapsedRealtime() - lp8.A03));
        A003.A0C("attempt_source", lp8.A0I);
        A003.A0C("reason", str2);
        A003.A08(Integer.valueOf(A002), Pxd.A00(37));
        if (j >= 0) {
            A003.A0B("total_size", Long.valueOf(j));
        }
        String A004 = AnonymousClass000.A00(731);
        A003.A08(Integer.valueOf(r10.A0H), "original_width");
        A003.A08(Integer.valueOf(r10.A0G), "original_height");
        try {
            A003.A0C("source_type", AnonymousClass6LX.A00(r11.A02, r10.A0K));
        } catch (UnsupportedOperationException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "UnsupportedOperationException";
            }
            r8.Cji((AnonymousClass55S) null, r10, "Something went wrong", message, e);
        }
        if (r10.A12()) {
            A003.A0B("total_size", Long.valueOf(r10.A0d));
            ClipInfo clipInfo = r10.A1N;
            if (clipInfo != null) {
                A003.A0B(A004, Long.valueOf(clipInfo.A0A));
                A003.A0B("original_file_size", Long.valueOf(clipInfo.A00()));
            }
        }
        return A003;
    }

    public static final void A05(0xI r5, AnonymousClass3Q2 r6, C63867L9w l9w) {
        int i = r6.A0D + r6.A0E;
        if (i > 0) {
            l9w.A00 = Integer.valueOf(i);
            r5.A0C("auto_retry_count", String.valueOf(i));
        }
        int i2 = r6.A0O;
        if (i2 > 0) {
            String valueOf = String.valueOf(i2);
            l9w.A05 = valueOf;
            r5.A0C(AnonymousClass000.A00(645), valueOf);
        }
        int i3 = r6.A0Q;
        if (i3 > 0) {
            l9w.A03 = Integer.valueOf(i3);
            r5.A0C("manual_retry_count", String.valueOf(i3));
        }
        int i4 = r6.A0P;
        if (i4 > 0) {
            l9w.A02 = Integer.valueOf(i4);
            r5.A0C("loop_count", String.valueOf(i4));
        }
        int i5 = r6.A0M;
        if (i5 > 0) {
            l9w.A01 = Integer.valueOf(i5);
            r5.A0C("cancel_count", String.valueOf(i5));
        }
        long currentTimeMillis = (System.currentTimeMillis() - r6.A0Z) / 1000;
        if (0 <= currentTimeMillis && currentTimeMillis < 1209600) {
            Long valueOf2 = Long.valueOf(currentTimeMillis);
            l9w.A04 = valueOf2;
            r5.A0B(AnonymousClass000.A00(805), valueOf2);
        }
    }

    public static final void A07(0xI r4, C2373737j r5) {
        UserSession userSession = r5.A02;
        if (182.A06(0Tu.A05, userSession, 36320614277456548L)) {
            return;
        }
        if (!11Z.A07() || AnonymousClass1C8.A01 != null) {
            C60510iO.A00(userSession).EFq(r4);
        } else {
            0nY.A00().ATE(new C61698KIo(r4, r5));
        }
    }

    private final void A08(1Zp r6, AnonymousClass55S r7, AnonymousClass3Q2 r8) {
        String str;
        r6.A03("upload_id", r8.A3t);
        UserSession userSession = this.A02;
        r6.A03(Dbm.A02(9, 10, 81), C2373637i.A01(r8));
        28D r0 = r8.A0i;
        if (r0 != null) {
            str = r0.name();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r6.A03("camera_entry_point", str);
        String str3 = r8.A2h;
        if (str3 != null) {
            str2 = str3;
        }
        r6.A03("creation_surface", str2);
        r6.A03("share_type", r8.A0E().name());
        r6.A03("media_type", r8.A1G.name());
        r6.A03("ingestion_surface", C59906JbV.A01(userSession, r8));
        boolean z = false;
        if (r8.A3O != null) {
            z = true;
        }
        r6.A04("is_carousel_child", z);
        r6.A04("publish_invoked", r8.A1T.A04());
        if (r7 != null) {
            r6.A03("error_type", r7.name());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.C254743sy r11, X.AnonymousClass3Q2 r12, X.C2373737j r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, boolean r20, boolean r21) {
        /*
            X.0wc r2 = r13.A01
            r0 = 892(0x37c, float:1.25E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r5 = r2.A00(r0, r1)
            boolean r0 = r5.isSampled()
            r6 = r19
            if (r0 == 0) goto L_0x0139
            android.content.Context r4 = r13.A00
            X.JbX r3 = new X.JbX
            r3.<init>(r4)
            if (r12 == 0) goto L_0x0156
            com.instagram.common.session.UserSession r1 = r13.A02
            X.JbW r0 = new X.JbW
            r0.<init>(r4, r1, r12)
            java.util.Map r2 = r0.A07()
        L_0x002a:
            if (r21 == 0) goto L_0x0033
            java.lang.String r1 = "is_scheduled_from_async_job"
            java.lang.String r0 = "true"
            r2.put(r1, r0)
        L_0x0033:
            r7 = 0
            if (r12 == 0) goto L_0x0153
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = r12.A0w
            if (r1 == 0) goto L_0x0153
            X.Jbd r0 = X.C59914Jbd.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x014f
            r0 = 4
            if (r1 == r0) goto L_0x014f
            r0 = 1
            if (r1 == r0) goto L_0x014b
            r0 = 2
            if (r1 == r0) goto L_0x014b
            r0 = 7
            if (r1 != r0) goto L_0x0153
            X.RIf r10 = X.RIf.INVISIBLE_WATERMARK
        L_0x0051:
            X.B8S r8 = new X.B8S
            r8.<init>()
            r9 = 1
            r0 = 0
            if (r10 == 0) goto L_0x005b
            r0 = 1
        L_0x005b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_gen_ai"
            r8.A03(r0, r1)
            if (r10 == 0) goto L_0x006b
            java.lang.String r0 = "provenance_type"
            r8.A01(r10, r0)
        L_0x006b:
            if (r12 == 0) goto L_0x0148
            X.Cst r0 = r12.A1S
            if (r0 == 0) goto L_0x0148
            java.lang.String r1 = r0.A00
        L_0x0073:
            r0 = 1382(0x566, float:1.937E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A06(r0, r1)
            r10 = 9
            r1 = 10
            r0 = 81
            java.lang.String r0 = X.Dbm.A02(r10, r1, r0)
            r5.AAJ(r0, r15)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "publish_id"
            r5.AAJ(r0, r1)
            java.lang.String r0 = "ingest_surface"
            r1 = r17
            r5.AAJ(r0, r1)
            java.lang.String r0 = "target_surface"
            r1 = r18
            r5.AAJ(r0, r1)
            java.lang.String r0 = "media_type"
            r1 = r16
            r5.AAJ(r0, r1)
            android.content.Context r0 = r3.A00
            java.lang.String r1 = X.C61970qY.A08(r0)
            java.lang.String r0 = "connection"
            r5.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "is_carousel_item"
            r5.A7p(r0, r1)
            if (r12 == 0) goto L_0x00c2
            boolean r0 = r12.A5D
            if (r0 != r9) goto L_0x00c2
            r2 = r7
        L_0x00c2:
            java.lang.String r0 = "custom_fields"
            r5.A9H(r0, r2)
            java.lang.String r1 = X.AnonymousClass5BB.A00()
            java.lang.String r0 = "application_state"
            r5.AAJ(r0, r1)
            if (r12 == 0) goto L_0x00e5
            com.instagram.common.session.UserSession r1 = r13.A02
            X.JbW r0 = new X.JbW
            r0.<init>(r4, r1, r12)
            java.lang.Long r0 = r0.A0C()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x00eb
        L_0x00e5:
            if (r14 == 0) goto L_0x0146
            java.lang.String r1 = r14.toString()
        L_0x00eb:
            java.lang.String r0 = "media_id"
            r5.AAJ(r0, r1)
            java.lang.String r1 = X.C67003Mgb.A01(r11)
            java.lang.String r0 = "open_thread_id"
            r5.AAJ(r0, r1)
            java.lang.Long r1 = X.C67003Mgb.A00(r11)
            r0 = 340(0x154, float:4.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9F(r0, r1)
            boolean r0 = X.C66647MaG.A0E(r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r5.A7p(r0, r1)
            java.lang.String r0 = "gen_ai_image_provenance_info"
            r5.AAK(r8, r0)
            if (r12 == 0) goto L_0x0121
            com.instagram.common.session.UserSession r1 = r13.A02
            r0 = 0
            java.util.ArrayList r7 = X.C59906JbV.A06(r1, r12, r0)
        L_0x0121:
            java.lang.String r0 = "server_edits"
            r5.AAe(r0, r7)
            if (r12 == 0) goto L_0x0136
            long r0 = r12.A0g
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_creation_time"
            r5.A9F(r0, r1)
        L_0x0136:
            r5.Cgf()
        L_0x0139:
            r2 = 1
            X.0qQ.A0B(r15, r2)
            X.37q r1 = r13.A04
            if (r12 == 0) goto L_0x015c
            boolean r0 = r12.A5D
            if (r0 != r2) goto L_0x015c
            return
        L_0x0146:
            r1 = r7
            goto L_0x00eb
        L_0x0148:
            r1 = r7
            goto L_0x0073
        L_0x014b:
            X.RIf r10 = X.RIf.C2PA
            goto L_0x0051
        L_0x014f:
            X.RIf r10 = X.RIf.IPTC
            goto L_0x0051
        L_0x0153:
            r10 = 0
            goto L_0x0051
        L_0x0156:
            java.util.Map r2 = r3.A07()
            goto L_0x002a
        L_0x015c:
            com.facebook.quicklog.reliability.UserFlowLogger r2 = r1.A00
            r0 = 58
            java.lang.String r0 = X.002.A0G(r15, r0, r6)
            int r1 = r0.hashCode()
            r0 = 51052545(0x30b0001, float:4.0848433E-37)
            long r0 = r2.generateFlowId(r0, r1)
            r2.flowEndSuccess(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2373737j.A09(X.3sy, X.3Q2, X.37j, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    public static final void A0C(AnonymousClass3Q2 r6, C2373737j r7, String str, String str2, String str3, String str4, int i, boolean z) {
        Map A07;
        0wc r2 = r7.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_media_publish_invoke");
        if (A002.isSampled()) {
            Context context = r7.A00;
            C59908JbX jbX = new C59908JbX(context);
            A002.AAJ(Dbm.A02(9, 10, 81), str);
            A002.AAJ("publish_id", String.valueOf(i));
            A002.AAJ("ingest_surface", str3);
            A002.AAJ("target_surface", str4);
            A002.AAJ("media_type", str2);
            A002.AAJ("connection", C61970qY.A08(jbX.A00));
            A002.A7p("is_carousel_item", Boolean.valueOf(z));
            ArrayList arrayList = null;
            if (r6 == null) {
                A07 = jbX.A07();
            } else if (r6.A5D) {
                A07 = null;
            } else {
                A07 = new C59907JbW(context, r7.A02, r6).A07();
            }
            A002.A9H("custom_fields", A07);
            A002.AAJ("application_state", AnonymousClass5BB.A00());
            if (r6 != null) {
                arrayList = C59906JbV.A06(r7.A02, r6, true);
            }
            A002.AAe("server_edits", arrayList);
            if (r6 != null) {
                A002.A9F("media_creation_time", Long.valueOf(r6.A0g / 1000));
            }
            A002.Cgf();
        }
        if (r6 != null) {
            str3 = "user_share";
        }
        r7.A0F(r6, str, str3, i);
    }

    public final void A0E(AnonymousClass3Q2 r2, String str, String str2) {
        this.A04.A01(r2, str, str2);
    }

    public final void A0G(AnonymousClass3Q2 r45, Map map, long j) {
        String str;
        boolean z;
        Float f;
        0wc r1 = this.A01;
        0Aj A002 = r1.A00(r1.A00, "ig_media_upload_success");
        AnonymousClass3Q2 r8 = r45;
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r8);
            Map A07 = jbW.A07();
            if (j > 0) {
                A07.put("upload_speed_bps", String.valueOf(j));
            }
            A07.putAll(map);
            if (Build.VERSION.SDK_INT >= 34 && r8.A1G == 1iA.A0Q && 182.A06(0Tu.A05, userSession, 36320914924643278L)) {
                String str2 = r8.A3K;
                String str3 = r8.A33;
                ADq aDq = ADq.A00;
                A07.putAll(aDq.A00(str2));
                A07.put("original_is_hdr", 002.A1D("", aDq.A01(str2)));
                A07.put("result_is_hdr", 002.A1D("", aDq.A01(str3)));
                boolean z2 = true;
                boolean z3 = false;
                if (r8.A2k != null) {
                    z3 = true;
                }
                C273884nL r12 = r8.A1a;
                if (r12 != null) {
                    Integer num = r12.A0P;
                    z = true;
                    if ((num == null || num.intValue() == 0) && ((f = r12.A07) == null || 0qQ.A0I(f, 1.0f))) {
                        Integer num2 = r12.A0N;
                        Float f2 = r12.A03;
                        List A1P = 0sr.A1P(new Object[]{num2, f2, r12.A04, r12.A06, r12.A08, r12.A09, r12.A0A, r12.A0B, r12.A0C, r12.A0D, r12.A0E, r12.A0F, r12.A0G, r12.A0H, r12.A0I, r12.A02, r12.A0J, r12.A0Q, r12.A0K, r12.A0R, r12.A0L, r12.A0S, r12.A0M});
                        if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
                            Iterator it = A1P.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    if (!z3 && !z) {
                        z2 = false;
                    }
                    A07.put("has_edits", 002.A1D("", z2));
                }
                z = false;
                z2 = false;
                A07.put("has_edits", 002.A1D("", z2));
            }
            AnonymousClass3Q2 r10 = jbW.A02;
            A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r10));
            A002.AAJ("ingest_id", jbW.A0H());
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r8));
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r10)));
            Long A0C = jbW.A0C();
            if (A0C != null) {
                str = A0C.toString();
            } else {
                str = null;
            }
            A002.AAJ("media_id", str);
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            A002.AAJ("target_surface", C59906JbV.A03(userSession, r8, (ShareType) null, true));
            A002.A9F("duration_ms", jbW.A08());
            A002.A9F("file_size_bytes", jbW.A09());
            A002.A9F("original_file_size_bytes", jbW.A0E());
            A002.A9F("media_height", jbW.A0B());
            A002.A9F("media_width", jbW.A0D());
            A002.A9F("original_media_height", jbW.A0F());
            A002.A9F("original_media_width", jbW.A0G());
            A002.AAJ("ingest_type", jbW.A0I());
            if (r8.A5D) {
                A07 = null;
            }
            A002.A9H("custom_fields", A07);
            A002.AAJ("application_state", AnonymousClass5BB.A00());
            A002.A8D("client_upload_mos", Double.valueOf(r8.A1j.A00));
            if (r8.A5p) {
                A002.A7p("is_video_variant", true);
            }
            A002.Cgf();
        }
        Cjm(r8, "ig_media_upload_success", (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (X.0qQ.A0K(r13, X.AnonymousClass000.A00(588)) != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EFe(X.C254743sy r18, X.AnonymousClass3Q2 r19, boolean r20) {
        /*
            r17 = this;
            r7 = r19
            X.3QF r2 = r7.A1T
            java.util.List r0 = r2.A03()
            java.util.Iterator r5 = r0.iterator()
        L_0x000c:
            boolean r0 = r5.hasNext()
            r8 = r17
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r14 = r0.intValue()
            android.content.Context r0 = r8.A00
            com.instagram.common.session.UserSession r4 = r8.A02
            X.JbW r3 = new X.JbW
            r3.<init>(r0, r4, r7)
            java.lang.Long r9 = r3.A0C()
            java.lang.String r13 = X.C59906JbV.A02(r4, r7, r14)
            r0 = 3006(0xbbe, float:4.212E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x0048
            r0 = 588(0x24c, float:8.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r1 = X.0qQ.A0K(r13, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            if (r9 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x004e
            r9 = 0
        L_0x004e:
            X.JbV r0 = X.C59906JbV.A00
            boolean r0 = r0.A09(r4, r7, r14)
            if (r0 == 0) goto L_0x0079
            X.3QF r1 = r7.A1T
            X.3Q2 r0 = r3.A02
            java.lang.String r0 = X.C2373637i.A01(r0)
            java.lang.Boolean r1 = r1.A02(r14, r0)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0079
        L_0x006d:
            monitor-enter(r2)
            java.util.Set r1 = r2.A0E     // Catch:{ all -> 0x0097 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0097 }
            r1.add(r0)     // Catch:{ all -> 0x0097 }
            monitor-exit(r2)
            goto L_0x000c
        L_0x0079:
            X.3Q2 r0 = r3.A02
            java.lang.String r10 = X.C2373637i.A01(r0)
            java.lang.Integer r0 = X.C59906JbV.A00(r0)
            java.lang.String r11 = X.C59909JbY.A00(r0)
            java.lang.String r12 = X.C59906JbV.A01(r4, r7)
            boolean r15 = r3.A0J()
            r6 = r18
            r16 = r20
            A09(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x006d
        L_0x0097:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x009a:
            boolean r0 = r7.A12()
            if (r0 != 0) goto L_0x00a6
            boolean r0 = X.C379909Vu.A08(r7)
            if (r0 == 0) goto L_0x00e0
        L_0x00a6:
            com.instagram.common.session.UserSession r0 = r8.A02
            X.Q1Q r8 = new X.Q1Q
            r8.<init>(r0)
            r3 = 1
            java.util.HashMap r0 = X.C9839RiB.A00(r7, r8)     // Catch:{ all -> 0x00c5 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x00c5 }
            r11.<init>()     // Catch:{ all -> 0x00c5 }
            r11.putAll(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "media_upload_flow_success"
            r9 = 0
            long r12 = r8.now()     // Catch:{ all -> 0x00c5 }
            X.C9596Rda.A00(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c5 }
            return
        L_0x00c5:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "share type: "
            r1.append(r0)
            com.instagram.pendingmedia.model.constants.ShareType r0 = r7.A0E()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "videolite_event_err_success"
            X.0wb.A05(r0, r1, r3, r2)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2373737j.EFe(X.3sy, X.3Q2, boolean):void");
    }

    public final void EFu(AnonymousClass55S r18, AnonymousClass3Q2 r19, String str, String str2, String str3, String str4, String str5, Throwable th, int i) {
        C59907JbW jbW;
        String str6;
        String str7;
        Boolean bool;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Map A07;
        String str8;
        ArrayList arrayList;
        Long A0C;
        String str9 = str5;
        String str10 = str4;
        String str11 = str2;
        String str12 = str;
        AnonymousClass3Q2 r4 = r19;
        int i2 = i;
        if (r19 != null) {
            UserSession userSession = this.A02;
            str12 = C59906JbV.A01(userSession, r4);
            str11 = C59906JbV.A02(userSession, r4, i2);
            jbW = new C59907JbW(this.A00, userSession, r4);
        } else {
            jbW = null;
        }
        C59908JbX jbX = new C59908JbX(this.A00);
        0wc r9 = this.A01;
        0Aj A002 = r9.A00(r9.A00, "ig_media_publish_failure");
        if (!0qQ.A0K(str11, AnonymousClass000.A00(3006))) {
            0qQ.A0K(str11, AnonymousClass000.A00(588));
        }
        Throwable th2 = th;
        if (A002.isSampled()) {
            String valueOf = String.valueOf(i2);
            if (jbW == null || (str6 = C2373637i.A01(jbW.A02)) == null) {
                str6 = str3;
                if (str3 == null) {
                    str6 = valueOf;
                }
            }
            if (r19 == null || jbW == null || !C59906JbV.A00.A09(this.A02, r4, i2) || 0qQ.A0K(r4.A1T.A02(i2, C2373637i.A01(jbW.A02)), true)) {
                A002.AAJ(Dbm.A02(9, 10, 81), str6);
                A002.AAJ("connection", C61970qY.A08(jbX.A00));
                if (jbW != null) {
                    str10 = C59909JbY.A00(C59906JbV.A00(jbW.A02));
                }
                A002.AAJ("media_type", str10);
                A002.AAJ("publish_id", valueOf);
                A002.AAJ("ingest_surface", str12);
                A002.AAJ("target_surface", str11);
                if (jbW != null) {
                    str7 = jbW.A0I();
                } else {
                    str7 = null;
                }
                A002.AAJ("ingest_type", str7);
                if (jbW != null) {
                    bool = Boolean.valueOf(jbW.A0J());
                } else {
                    bool = null;
                }
                A002.A7p("is_carousel_item", bool);
                if (jbW != null) {
                    l = jbW.A08();
                } else {
                    l = null;
                }
                A002.A9F("duration_ms", l);
                if (jbW != null) {
                    l2 = jbW.A09();
                } else {
                    l2 = null;
                }
                A002.A9F("file_size_bytes", l2);
                if (jbW != null) {
                    l3 = jbW.A0E();
                } else {
                    l3 = null;
                }
                A002.A9F("original_file_size_bytes", l3);
                if (jbW != null) {
                    l4 = jbW.A0B();
                } else {
                    l4 = null;
                }
                A002.A9F("media_height", l4);
                if (jbW != null) {
                    l5 = jbW.A0D();
                } else {
                    l5 = null;
                }
                A002.A9F("media_width", l5);
                if (jbW != null) {
                    l6 = jbW.A0F();
                } else {
                    l6 = null;
                }
                A002.A9F("original_media_height", l6);
                if (jbW != null) {
                    l7 = jbW.A0G();
                } else {
                    l7 = null;
                }
                A002.A9F("original_media_width", l7);
                A002.AAJ("reason", str9);
                StringBuilder sb = new StringBuilder();
                sb.append("errorType:");
                sb.append((Object) null);
                sb.append(", message:");
                sb.append(str9);
                A002.AAJ("error_message", sb.toString());
                A002.A9H("exception_data", C63375Kvw.A00(th2));
                if (r19 != null && r4.A5D) {
                    A07 = null;
                } else if (jbW != null) {
                    A07 = jbW.A07();
                } else {
                    A07 = jbX.A07();
                }
                A002.A9H("custom_fields", A07);
                A002.AAJ("application_state", AnonymousClass5BB.A00());
                if (jbW == null || (A0C = jbW.A0C()) == null) {
                    str8 = null;
                } else {
                    str8 = A0C.toString();
                }
                A002.AAJ("media_id", str8);
                if (r19 != null) {
                    arrayList = C59906JbV.A06(this.A02, r4, false);
                } else {
                    arrayList = null;
                }
                A002.AAe("server_edits", arrayList);
                A002.Cgf();
            } else {
                return;
            }
        }
        if (r19 != null) {
            if (th != null) {
                if (str5 == null && (str9 = th2.getMessage()) == null) {
                    str9 = "";
                }
                Cji((AnonymousClass55S) null, r4, "MEDIA_PUBLISH_FAILURE", str9, th2);
            }
            C59968Jcd.A01((0xI) null, r4, th2);
        }
    }

    public final void EG0(AnonymousClass3Q2 r11) {
        Map A07;
        0wc r1 = this.A01;
        0Aj A002 = r1.A00(r1.A00, "ig_media_upload_start");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r11);
            AnonymousClass3Q2 r8 = jbW.A02;
            A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r8));
            A002.AAJ("ingest_id", jbW.A0H());
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r11));
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r8)));
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            A002.AAJ("target_surface", C59906JbV.A03(userSession, r11, (ShareType) null, true));
            A002.A9F("duration_ms", jbW.A08());
            A002.A9F("original_file_size_bytes", jbW.A0E());
            A002.A9F("original_media_height", jbW.A0F());
            A002.A9F("original_media_width", jbW.A0G());
            A002.AAJ("ingest_type", jbW.A0I());
            if (r11.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            A002.A9H("custom_fields", A07);
            A002.AAJ("application_state", AnonymousClass5BB.A00());
            if (r11.A5p) {
                A002.A7p("is_video_variant", true);
            }
            A002.Cgf();
        }
        Cjm(r11, "ig_media_upload_start", (String) null);
    }

    public final void EG1(AnonymousClass55S r19, AnonymousClass3Q2 r20, String str, String str2, Throwable th) {
        String str3;
        String str4;
        0wc r1 = this.A01;
        0Aj A002 = r1.A00(r1.A00, "ig_video_render_failure");
        String str5 = str;
        Throwable th2 = th;
        AnonymousClass55S r9 = r19;
        AnonymousClass3Q2 r6 = r20;
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r6);
            Map A07 = jbW.A07();
            A07.put("is_high_quality_upload_on", String.valueOf(1Au.A00(userSession).A1z()));
            Context applicationContext = context.getApplicationContext();
            0qQ.A07(applicationContext);
            applicationContext.getPackageManager();
            0qQ.A0C(applicationContext.getSystemService("phone"), AnonymousClass000.A00(715));
            0qQ.A0C(applicationContext.getSystemService("activity"), AnonymousClass000.A00(174));
            0qQ.A0C(applicationContext.getSystemService("power"), "null cannot be cast to non-null type android.os.PowerManager");
            A07.putAll(OS3.A00(applicationContext));
            AnonymousClass3Q2 r17 = jbW.A02;
            A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r17));
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r17)));
            A002.AAJ("ingest_id", jbW.A0H());
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r6));
            if (r6.A0E() == ShareType.REEL_SHARE) {
                str4 = C59906JbV.A03(userSession, r6, (ShareType) null, true);
            } else {
                str4 = null;
            }
            A002.AAJ("target_surface", str4);
            A002.AAJ("ingest_type", jbW.A0I());
            A002.A9F("duration_ms", jbW.A08());
            A002.A9F("file_size_bytes", jbW.A09());
            A002.A9F("original_file_size_bytes", jbW.A0E());
            A002.A9F("media_height", jbW.A0B());
            A002.A9F("media_width", jbW.A0D());
            A002.A9F("original_media_height", jbW.A0F());
            A002.A9F("original_media_width", jbW.A0G());
            String str6 = str2;
            A002.AAJ("reason", str6);
            StringBuilder sb = new StringBuilder();
            sb.append("reason: ");
            sb.append(str6);
            sb.append(", errorType:");
            sb.append(r9);
            sb.append(", message:");
            sb.append(str5);
            A002.AAJ("error_message", sb.toString());
            A002.A9H("exception_data", C63375Kvw.A00(th2));
            A002.A7p("is_carousel_item", Boolean.valueOf(jbW.A0J()));
            if (r6.A5D) {
                A07 = null;
            }
            A002.A9H("custom_fields", A07);
            A002.AAJ("application_state", AnonymousClass5BB.A00());
            A002.Cgf();
        }
        Throwable th3 = th2;
        1Zp A012 = 1Zm.A00(this.A02).A01(AnonymousClass05K.A0Y, AnonymousClass05K.A0V, false);
        A08(A012, r9, r6);
        String A003 = Pxd.A00(906);
        A012.A03(A003, str5);
        if (th == null) {
            A012.A03("logview_group_by", A003);
        } else {
            Throwable cause = th2.getCause();
            if (cause != null) {
                th3 = cause;
            }
            A012.A05(th3);
        }
        A012.A00();
        C59968Jcd.A01((0xI) null, r6, th2);
        A0E(r6, TraceFieldType.FailureReason, str5);
        if (r19 != null) {
            str3 = r9.name();
        } else {
            str3 = null;
        }
        A0E(r6, "error_type", str3);
        Cjm(r6, "ig_video_render_failure", (String) null);
        A0D(r6, this, th2);
    }

    public final void EG2(AnonymousClass3Q2 r12, Map map) {
        String str;
        0wc r1 = this.A01;
        0Aj A002 = r1.A00(r1.A00, "ig_video_render_start");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r12);
            Map A07 = jbW.A07();
            if (map != null) {
                A07.putAll(map);
            }
            A07.put("transcoder_type", r12.A3q);
            AnonymousClass3Q2 r7 = jbW.A02;
            A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r7));
            A002.AAJ("ingest_id", C2373637i.A01(r7));
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r12));
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            String A0I = jbW.A0I();
            if (A0I != null) {
                A002.AAJ("ingest_type", A0I);
                A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r7)));
                if (r12.A5D) {
                    A07 = null;
                }
                A002.A9H("custom_fields", A07);
                if (r12.A0E() == ShareType.REEL_SHARE) {
                    str = C59906JbV.A03(userSession, r12, (ShareType) null, true);
                } else {
                    str = null;
                }
                A002.AAJ("target_surface", str);
                A002.AAJ("application_state", AnonymousClass5BB.A00());
                A002.Cgf();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Cjm(r12, "ig_video_render_start", (String) null);
    }

    public final void EG3(AnonymousClass3Q2 r11) {
        String str;
        String str2;
        Map A07;
        int i;
        0wc r1 = this.A01;
        0Aj A002 = r1.A00(r1.A00, "ig_video_render_success");
        if (A002.isSampled()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r11);
            AnonymousClass3Q2 r2 = jbW.A02;
            A002.AAJ(Dbm.A02(9, 10, 81), C2373637i.A01(r2));
            A002.AAJ("ingest_id", jbW.A0H());
            A002.AAJ("ingest_surface", C59906JbV.A01(userSession, r11));
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            if (r11.A0E() == ShareType.REEL_SHARE) {
                str = C59906JbV.A03(userSession, r11, (ShareType) null, true);
            } else {
                str = null;
            }
            A002.AAJ("target_surface", str);
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r2)));
            A002.A9F("duration_ms", jbW.A08());
            if (r2.A12()) {
                str2 = r2.A1j.A05;
            } else {
                str2 = null;
            }
            A002.AAJ("video_codec", str2);
            A002.A9F("file_size_bytes", jbW.A09());
            A002.A9F("original_file_size_bytes", jbW.A0E());
            A002.A9F("media_height", jbW.A0B());
            A002.A9F("media_width", jbW.A0D());
            A002.A9F("original_media_height", jbW.A0F());
            A002.A9F("original_media_width", jbW.A0G());
            float f = jbW.A01.A01;
            Float valueOf = Float.valueOf(f);
            boolean z = false;
            if (f > 0.0f) {
                z = true;
            }
            Double d = null;
            if (z && valueOf != null) {
                d = Double.valueOf((double) f);
            }
            A002.A8D("original_frame_rate", d);
            float f2 = r2.A03;
            Float valueOf2 = Float.valueOf(f2);
            boolean z2 = false;
            if (f2 > 0.0f) {
                z2 = true;
            }
            Double d2 = null;
            if (z2 && valueOf2 != null) {
                d2 = Double.valueOf((double) f2);
            }
            A002.A8D(AnonymousClass000.A00(3156), d2);
            A002.AAJ("ingest_type", jbW.A0I());
            if (r11.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            A002.A9H("custom_fields", A07);
            C273784nB r0 = r2.A1W;
            Double d3 = null;
            if (!(r0 == null || (i = r0.A00) == -1)) {
                d3 = Double.valueOf((double) i);
            }
            A002.A8D("target_bitrate_bps", d3);
            A002.AAJ("application_state", AnonymousClass5BB.A00());
            A002.Cgf();
        }
        Cjm(r11, "ig_video_render_success", (String) null);
        A0E(r11, "rendered_file_path", r11.A3V);
        A0E(r11, "streaming_file_path", r11.A3V);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.L9w] */
    @Deprecated(message = "")
    public final void EG4(AnonymousClass3Q2 r4, String str) {
        new Object();
        0xI A002 = A00((AnonymousClass0iw) null, r4, this, "pending_media_info");
        A002.A0C("reason", str);
        A05(A002, r4, new Object());
        A07(A002, this);
    }

    public final void EG9(AnonymousClass3Q2 r6, Throwable th) {
        long j;
        C59907JbW jbW = new C59907JbW(this.A00, this.A02, r6);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "measure_quality_failure");
        if (A002.isSampled()) {
            AnonymousClass3Q2 r4 = jbW.A02;
            A002.A9F("upload_id", Long.valueOf(Long.parseLong(r4.A3t)));
            A002.AAJ("connection", C61970qY.A08(jbW.A00));
            A002.AAJ("from", r4.A1f.toString());
            A002.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(r4)));
            A002.AAJ("share_type", r4.A0E().toString());
            String A0F = r4.A0F();
            if (A0F.length() == 0) {
                A0F = null;
            }
            A002.AAJ("waterfall_id", A0F);
            A002.A9F("dimension", jbW.A0D());
            A002.A9F("dimension_height", jbW.A0B());
            A002.A9F("video_duration", jbW.A08());
            if (jbW.A0J()) {
                j = 1;
            } else {
                j = 0;
            }
            A002.A9F("is_carousel_child", Long.valueOf(j));
            A002.Cgf();
        }
    }

    public final void EGB(AnonymousClass3Q2 r3, int i) {
        if (r3.A1G == 1iA.A0R) {
            for (AnonymousClass3Q2 A0A : r3.A4m) {
                A0A(A0A, i);
            }
            return;
        }
        A0A(r3, i);
    }

    public static final void A04(0xI r5, AnonymousClass3Q2 r6) {
        long currentTimeMillis = (System.currentTimeMillis() - r6.A0c) / 1000;
        if (0 <= currentTimeMillis && currentTimeMillis < 1209600) {
            r5.A0B("post_duration_sec", Long.valueOf(currentTimeMillis));
        }
    }

    public static final void A06(0xI r2, AnonymousClass3QD r3, C2373737j r4) {
        r2.A0C("target", String.valueOf(r3));
        A07(r2, r4);
    }

    public static final void A0D(AnonymousClass3Q2 r10, C2373737j r11, Throwable th) {
        Exception exc;
        if (r10.A12() || C379909Vu.A08(r10)) {
            Q1Q q1q = new Q1Q(r11.A02);
            try {
                HashMap A002 = C9839RiB.A00(r10, q1q);
                HashMap hashMap = new HashMap();
                hashMap.putAll(A002);
                if (th == null) {
                    exc = new Exception("unknown");
                } else {
                    exc = new Exception(th);
                }
                C9596Rda.A00(q1q, exc, "media_upload_flow_fatal", hashMap, q1q.now());
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("share type: ");
                sb.append(r10.A0E());
                0wb.A05("videolite_event_err_fail", sb.toString(), 1, th2);
            }
        }
    }
}
