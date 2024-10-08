package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

public final class UUO extends W2Q {
    public int A00 = 3;
    public W36 A01 = new UUM();
    public W36 A02 = new UUN();
    public LGZ A03 = new UUQ();
    public LGZ A04 = new LGZ();
    public V4W A05 = new Object();
    public C69677Npz A06 = new UUT();
    public C69677Npz A07 = new UUS();
    public final C58840Ae A08;

    public final synchronized void A0B(C61081JwJ jwJ, V4C v4c) {
        0Aj r3;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        C69677Npz npz;
        C59725JVj jVj;
        String str5;
        HO5 ho5;
        HO4 ho4;
        String str6;
        UUT uut;
        C20994X8r x8r;
        String str7;
        String str8;
        synchronized (this) {
            if (!(this.A00 == 6 || (x8r = this.A01) == null)) {
                x8r.markerStart(4);
                String str9 = C62918KoW.A01;
                if (str9 != null) {
                    x8r.CmI(4, "device_type", str9);
                }
                String str10 = C62918KoW.A03;
                if (str10 != null) {
                    x8r.CmI(4, "device_build_type", str10);
                }
                String str11 = C62918KoW.A02;
                if (str11 != null) {
                    x8r.CmI(4, "soc_version", str11);
                }
                String str12 = C62918KoW.A00;
                if (str12 != null) {
                    x8r.CmI(4, "build_flavor", str12);
                }
                x8r.CmH(4, 1, A03(this));
                C346587vQ r4 = C346587vQ.A0C;
                x8r.CmH(4, 0, r4.A06());
                String A052 = r4.A05();
                if (A052 == null) {
                    A052 = "NULL";
                }
                x8r.CmI(4, "app_cold_start_session_id", A052);
                x8r.CmI(4, "failure_category", A04(v4c));
                x8r.CmI(4, TraceFieldType.FailureReason, v4c.A00());
                if (AnonymousClass7TF.A1Y(r4.A01(), true)) {
                    str7 = "CONTINUITY";
                } else {
                    str7 = "INITIATION";
                }
                x8r.CmI(4, "stream_stage", str7);
                x8r.CmI(4, "event_time_ms", String.valueOf(System.currentTimeMillis()));
                String str13 = this.A08;
                if (str13 != null) {
                    x8r.CmI(4, "smart_glasses_stream_session_id", str13);
                }
                String A072 = r4.A07();
                if (A072 != null) {
                    x8r.CmI(4, "app_warm_start_session_id", A072);
                }
                if (jwJ != null) {
                    x8r.CmI(4, "failure_detail", A02(jwJ));
                }
                UUT uut2 = (UUT) this.A06;
                if (uut2 == null || (str8 = UUT.A00(uut2.A00).name()) == null) {
                    str8 = "UNKNOWN";
                }
                x8r.CmI(4, "uplink_type", str8);
                Integer A022 = r4.A02();
                if (A022 != null) {
                    x8r.CmI(4, "streaming_protocol", C16806V6n.A00(A022));
                }
                x8r.markerEnd(4, 2);
            }
            Iterator A0u = AnonymousClass7TF.A0u(this.A0A);
            while (A0u.hasNext()) {
                C18438Vrh vrh = (C18438Vrh) C51971G9r.A0p(A0u);
                C353438Hq r0 = vrh.A01;
                UserSession userSession = r0.A08;
                boolean A0Y = r0.A09.A0Y();
                C346587vQ r1 = C346587vQ.A0C;
                Boolean A012 = r1.A01();
                if (A012 != null) {
                    z = A012.booleanValue();
                } else {
                    z = false;
                }
                String A053 = r1.A05();
                String A073 = r1.A07();
                Integer A023 = r1.A02();
                W2Q w2q = vrh.A00.A09;
                V1U v1u = null;
                if (w2q != null) {
                    npz = ((UUO) w2q).A06;
                } else {
                    npz = null;
                }
                if ((npz instanceof UUT) && (uut = (UUT) npz) != null) {
                    v1u = UUT.A00(uut.A00);
                }
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_camera_smart_glasses_session_error");
                if (A0e.isSampled()) {
                    if (A0Y) {
                        jVj = C59725JVj.VIDEO_CAPTURE;
                    } else {
                        jVj = C59725JVj.PRE_CAPTURE;
                    }
                    if (z) {
                        str5 = "continuity";
                    } else {
                        str5 = "initiation";
                    }
                    String str14 = 27p.A01(userSession).A04.A0L;
                    if (str14 == null) {
                        str14 = "";
                    }
                    A0e.A8M(jVj, "surface");
                    String str15 = "connection_error";
                    if (!(v4c instanceof UUY)) {
                        if (v4c instanceof UUZ) {
                            str15 = "stream_start_error";
                        } else if (v4c instanceof C15175UUa) {
                            str15 = "stream_error";
                        } else if (v4c instanceof C15176UUb) {
                            str15 = "telemetry_error";
                        }
                    }
                    A0e.AAJ("failure_category", str15);
                    A0e.AAJ(TraceFieldType.FailureReason, v4c.A00());
                    A0e.AAJ("stream_stage", str5);
                    A0e.A9F("event_time_ms", C51968G9o.A0u());
                    String str16 = C62918KoW.A01;
                    String str17 = null;
                    if (str16 != null) {
                        ho5 = C56570I2a.A01(str16);
                    } else {
                        ho5 = null;
                    }
                    A0e.A8M(ho5, "device_type");
                    String str18 = C62918KoW.A03;
                    if (str18 != null) {
                        ho4 = C56570I2a.A00(str18);
                    } else {
                        ho4 = null;
                    }
                    A0e.A8M(ho4, "device_build_type");
                    A0e.AAJ("soc_version", C62918KoW.A02);
                    A0e.AAJ("build_flavor", C62918KoW.A00);
                    A0e.AAJ(AnonymousClass000.A00(1391), A073);
                    A0e.AAJ("camera_session_id", str14);
                    A0e.AAJ(AnonymousClass000.A00(292), A053);
                    if (jwJ != null) {
                        StringBuilder sb = new StringBuilder();
                        String str19 = jwJ.A01;
                        if (str19 != null) {
                            sb.append(str19);
                        }
                        if (!(str19 == null || ((Throwable) jwJ.A00) == null)) {
                            sb.append(10);
                            sb.append(10);
                        }
                        Throwable th = (Throwable) jwJ.A00;
                        if (th != null) {
                            StringWriter stringWriter = new StringWriter();
                            PrintWriter printWriter = new PrintWriter(stringWriter);
                            th.printStackTrace(printWriter);
                            printWriter.flush();
                            Iterator it = 00k.A0d(00l.A0O(DbV.A12(DbT.A10(stringWriter))), 30).iterator();
                            while (it.hasNext()) {
                                sb.append(AnonymousClass7TE.A18(it));
                                sb.append(10);
                            }
                        }
                        str6 = DbT.A10(sb);
                    } else {
                        str6 = null;
                    }
                    A0e.AAJ("failure_detail", str6);
                    if (A023 != null) {
                        int intValue = A023.intValue();
                        if (intValue == 0 || intValue == 3) {
                            str17 = "TCP";
                        } else if (intValue == 1) {
                            str17 = "BLE";
                        } else if (intValue == 2 || intValue == 4) {
                            str17 = "BTC";
                        } else {
                            th = new RuntimeException();
                            throw th;
                        }
                    }
                    A0e.AAJ("streaming_protocol", str17);
                    A0e.A8M(v1u, "uplink_type");
                    A0e.Cgf();
                }
            }
            int i = this.A00;
            if (i == 3) {
                r3 = C51969G9p.A0d(this.A08, "smart_glasses_app_livestream_session_error");
                if (r3.isSampled()) {
                    0bb r2 = new 0bb();
                    W2Q.A08(r2);
                    W2Q.A07(r2);
                    String str20 = C62918KoW.A02;
                    if (str20 != null) {
                        r2.A06("soc_version", str20);
                    }
                    String str21 = C62918KoW.A00;
                    if (str21 != null) {
                        r2.A06("build_flavor", str21);
                    }
                    r3.AAK(r2, "__device");
                    if (this.A0B) {
                        str = "live";
                    } else {
                        str = "in_preview";
                    }
                    r3.AAJ("livestream_stage", str);
                    C346587vQ r22 = C346587vQ.A0C;
                    r3.AAJ("app_stream_session_id", r22.A06());
                    String A054 = r22.A05();
                    if (A054 == null) {
                        A054 = "NULL";
                    }
                    r3.AAJ("app_cold_start_session_id", A054);
                    r3.AAJ("failure_category", A04(v4c));
                    r3.AAJ(TraceFieldType.FailureReason, v4c.A00());
                    if (DbX.A1a(r22.A01())) {
                        str2 = "continuity";
                    } else {
                        str2 = "initiation";
                    }
                    r3.AAJ("stream_stage", str2);
                    r3.A9F("event_time_ms", C51968G9o.A0u());
                    String str22 = this.A08;
                    if (str22 != null) {
                        r3.AAJ("smart_glasses_stream_session_id", str22);
                    }
                    String A074 = r22.A07();
                    if (A074 != null) {
                        r3.AAJ("app_warm_start_session_id", A074);
                    }
                    if (jwJ != null) {
                        r3.AAJ("failure_detail", A02(jwJ));
                    }
                    C69677Npz npz2 = this.A06;
                    0qQ.A0C(npz2, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
                    r3.A8M(UUT.A00(((UUT) npz2).A00), "uplink_type");
                    W2Q.A06(r3, r22);
                }
            } else if (i == 4) {
                try {
                    r3 = C51969G9p.A0d(this.A08, "smart_glasses_app_call_session_error");
                    if (r3.isSampled()) {
                        0bb r23 = new 0bb();
                        W2Q.A08(r23);
                        W2Q.A07(r23);
                        String str23 = C62918KoW.A02;
                        if (str23 != null) {
                            r23.A06("soc_version", str23);
                        }
                        String str24 = C62918KoW.A00;
                        if (str24 != null) {
                            r23.A06("build_flavor", str24);
                        }
                        r3.AAK(r23, "__device");
                        if (this.A0B) {
                            str3 = "call";
                        } else {
                            str3 = "ringing";
                        }
                        r3.AAJ("call_stage", str3);
                        C346587vQ r24 = C346587vQ.A0C;
                        r3.AAJ("app_call_session_id", r24.A06());
                        String A055 = r24.A05();
                        if (A055 == null) {
                            A055 = "NULL";
                        }
                        r3.AAJ("app_cold_start_session_id", A055);
                        String str25 = "connection_error";
                        if (!(v4c instanceof UUY)) {
                            if (v4c instanceof UUZ) {
                                str25 = "call_start_error";
                            } else if (v4c instanceof C15175UUa) {
                                str25 = "call_error";
                            } else if (v4c instanceof C15176UUb) {
                                str25 = "telemetry_error";
                            } else {
                                C363058j1.A02.A04("sup:SUPMediaStreamFalcoLoggerImpl", "MediaStreamErrorEvent not valid type", (Throwable) null);
                            }
                        }
                        r3.AAJ("failure_category", str25);
                        r3.AAJ(TraceFieldType.FailureReason, v4c.A00());
                        if (DbX.A1a(r24.A01())) {
                            str4 = "continuity";
                        } else {
                            str4 = "initiation";
                        }
                        r3.AAJ("stream_stage", str4);
                        r3.A9F("event_time_ms", C51968G9o.A0u());
                        String str26 = this.A08;
                        if (str26 != null) {
                            r3.AAJ("smart_glasses_stream_session_id", str26);
                        }
                        String A075 = r24.A07();
                        if (A075 != null) {
                            r3.AAJ("app_warm_start_session_id", A075);
                        }
                        if (jwJ != null) {
                            r3.AAJ("failure_detail", A02(jwJ));
                        }
                        C69677Npz npz3 = this.A06;
                        0qQ.A0C(npz3, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
                        r3.A8M(UUT.A00(((UUT) npz3).A00), "uplink_type");
                        W2Q.A06(r3, r24);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            r3.Cgf();
        }
    }

    public static final String A02(C61081JwJ jwJ) {
        StringBuilder sb = new StringBuilder();
        String str = jwJ.A01;
        if (str != null) {
            sb.append(str);
        }
        if (!(str == null || jwJ.A00 == null)) {
            sb.append(10);
            sb.append(10);
        }
        Throwable th = (Throwable) jwJ.A00;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            Iterator it = 00k.A0d(00l.A0O(DbV.A12(DbT.A10(stringWriter))), 30).iterator();
            while (it.hasNext()) {
                sb.append(AnonymousClass7TE.A18(it));
                sb.append(10);
            }
        }
        return DbT.A10(sb);
    }

    public static final String A03(UUO uuo) {
        int i = uuo.A00;
        boolean z = uuo.A0B;
        if (i == 4) {
            if (z) {
                return "CALL";
            }
            return AnonymousClass000.A00(2421);
        } else if (z) {
            return "LIVE";
        } else {
            return "IN_PREVIEW";
        }
    }

    private final String A04(V4C v4c) {
        if (v4c instanceof UUY) {
            return "connection_error";
        }
        if (v4c instanceof UUZ) {
            return "stream_start_error";
        }
        if (v4c instanceof C15175UUa) {
            return "stream_error";
        }
        if (v4c instanceof C15176UUb) {
            return "telemetry_error";
        }
        C363058j1.A02.A04("sup:SUPMediaStreamFalcoLoggerImpl", "MediaStreamErrorEvent not valid type", (Throwable) null);
        return "connection_error";
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.V4W] */
    public UUO(C58840Ae r2) {
        this.A08 = r2;
    }

    public static final HO4 A00(String str) {
        for (HO4 ho4 : HO4.values()) {
            if (0qQ.A0K(ho4.A00, str)) {
                return ho4;
            }
        }
        return null;
    }

    public static final HO5 A01(String str) {
        for (HO5 ho5 : HO5.values()) {
            if (0qQ.A0K(ho5.A00, str)) {
                return ho5;
            }
        }
        return null;
    }
}
