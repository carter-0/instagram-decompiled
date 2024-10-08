package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4NN  reason: invalid class name */
public final class AnonymousClass4NN implements C263654Mv {
    public long A00;
    public long A01;
    public AnonymousClass4OY A02;
    public C263874Nr A03;
    public AnonymousClass4Yf A04;
    public AnonymousClass4Yf A05;
    public String A06;
    public AnonymousClass4OP A07;
    public String A08;
    public final C263624Ms A09;
    public final AnonymousClass4NK A0A;
    public final AnonymousClass4NP A0B;
    public final 1yA A0C;
    public final AnonymousClass4NJ A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A00(0eO.A02, new C377129Kq(this, 42));
    public final C58840Ae A0F;
    public final AnonymousClass4NO A0G = new Object();
    public final AnonymousClass4NM A0H;
    public final AnonymousClass4NL A0I;
    public final AnonymousClass3L3 A0J;
    public final ConcurrentLinkedQueue A0K;
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final AtomicLong A0N = new AtomicLong(0);

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4NO, java.lang.Object] */
    public AnonymousClass4NN(C58840Ae r5, C263624Ms r6, AnonymousClass4NK r7, 1yA r8, AnonymousClass4NJ r9, AnonymousClass4NM r10, AnonymousClass4NL r11, AnonymousClass3L3 r12) {
        0qQ.A0B(r8, 3);
        this.A0F = r5;
        this.A0I = r11;
        this.A0C = r8;
        this.A0D = r9;
        this.A09 = r6;
        this.A0A = r7;
        this.A0J = r12;
        this.A0H = r10;
        this.A0B = new AnonymousClass4NP(r8, r11);
        this.A0K = new ConcurrentLinkedQueue();
    }

    public static final Double A01(String str) {
        String str2;
        String str3;
        if (str == null || (str2 = (String) 00k.A0L(00l.A0R(str, new String[]{","}, 0))) == null || (str3 = (String) 00k.A0K(00l.A0R(str2, new String[]{":"}, 0))) == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str3));
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.4OV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.4NO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.4OV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.4NO, java.lang.Object] */
    public final void A0G(AnonymousClass4OP r31, C263874Nr r32, long j) {
        AnonymousClass4NL r0;
        String str;
        Runnable wiP;
        C263874Nr r2 = r32;
        if (r32 != null) {
            1yA r3 = this.A0C;
            if (!00l.A0d(r3.A05, AnonymousClass4MA.A00(r2.BSo()), false)) {
                long j2 = j;
                this.A00 = j2;
                this.A0L.set(false);
                AnonymousClass4OP r12 = r31;
                if (r3.A06) {
                    this.A07 = r12;
                }
                this.A03 = r2;
                C263974Ob r8 = null;
                AnonymousClass4OR BnS = r2.BnS();
                String A012 = this.A0G.A01(BnS, this.A00);
                C58840Ae r10 = this.A0F;
                AnonymousClass4NO.A00(r10, BnS, r3, "client_metadata_provider_setup", A012);
                long j3 = this.A00;
                AnonymousClass4NJ r9 = this.A0D;
                AnonymousClass3L3 r13 = this.A0J;
                ? obj = new Object();
                obj.A00 = BnS;
                obj.A01 = new Object();
                obj.A02 = r3;
                obj.A03 = r13;
                1yA r18 = r3;
                this.A02 = new AnonymousClass4OY(BnS, r12, new AnonymousClass4OW(r10, obj), r18, r9, j3);
                AnonymousClass4NK r7 = this.A0A;
                String A022 = A02(this);
                long j4 = this.A00;
                AnonymousClass4OP r16 = this.A07;
                r7.A03.set(A022);
                AnonymousClass4NJ r14 = r7.A00;
                ? obj2 = new Object();
                obj2.A00 = BnS;
                obj2.A01 = new Object();
                obj2.A02 = r3;
                obj2.A03 = r13;
                r7.A01.put(A022, new AnonymousClass4OY(BnS, r16, new AnonymousClass4OW(r10, obj2), r18, r14, j4));
                long j5 = r3.A03;
                if (!r3.A09 || j5 == -1) {
                    r7.A01();
                } else {
                    if (r3.A0J) {
                        wiP = (Runnable) this.A0E.getValue();
                    } else {
                        wiP = new C19952WiP(this);
                    }
                    r9.A00(wiP, j5);
                }
                this.A01 = 0;
                this.A05 = null;
                C263874Nr r92 = this.A03;
                if (!(r92 == null || (r8 = r92.BH9(A02(this))) == null)) {
                    r8.A03("playback_is_first_video", Boolean.valueOf(r7.A02.compareAndSet(false, true)));
                    r8.A03("is_initial_tag_metadata", true);
                }
                A0F(r8);
                String A023 = A02(this);
                AnonymousClass4OY A002 = r7.A00(this.A02, A023);
                if (A002 != null) {
                    if (!r3.A0I) {
                        str = null;
                    } else if (r7.A02(this.A00, false)) {
                        str = "started";
                    } else {
                        str = "unpaused";
                    }
                    long j6 = this.A01;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C263634Mt r93 = this.A09.A0I;
                    A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, Long.valueOf(r93.A0S), (Long) null, "prepare_started", A023, str, (String) null, String.valueOf(r93.A0S), 0, j6, elapsedRealtime, false);
                    this.A0B.A00(C264144Ot.PREPARE_STARTED, A023);
                }
                AnonymousClass4NP r22 = this.A0B;
                String A024 = A02(this);
                if (r22.A00.A0E && (r0 = r22.A01) != null) {
                    int hashCode = A024.hashCode();
                    QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerStart(409476402, hashCode);
                    }
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerAnnotate(409476402, hashCode, "MEDIA_ID", j2);
                    }
                }
            }
        }
    }

    public final void A0H(C284815Oa r2, C263684My r3, C263674Mx r4, String str) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(str, 3);
        if (this.A0C.A0B) {
            A0D(r2, r3, r4, str);
        }
    }

    public final /* synthetic */ void Cwg(AnonymousClass4Yf r1) {
    }

    public final /* synthetic */ void D4H(String str, boolean z) {
    }

    public final void D7z(long j, String str, boolean z) {
    }

    public final void D80(int i, int i2, int i3, int i4) {
    }

    public final void DAN(AnonymousClass4Yf r2, String str, List list, long j, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(str, 2);
        if (!this.A0C.A0B) {
            A0C(this, r2);
        }
    }

    public final void DCz(C284815Oa r2, String str, String str2, String str3, long j) {
        0qQ.A0B(str3, 4);
        if (!this.A0C.A0B) {
            A06(this, r2, str3);
        }
    }

    public final /* synthetic */ void DGr(String str, long j) {
    }

    public final void DKJ(String str, byte[] bArr, long j) {
    }

    public final void DNr(String str, byte[] bArr, long j, long j2) {
    }

    public final void DNz(C17183VLn vLn) {
        0qQ.A0B(vLn, 0);
    }

    public final void DS6(Object obj) {
    }

    public final void DTt(byte[] bArr, long j) {
    }

    public final /* synthetic */ void DWg(String str, String str2) {
    }

    public final /* synthetic */ void DXW() {
    }

    public final void DXX(C297475ro r2, C284815Oa r3, C263684My r4, C263674Mx r5, String str) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r3, 3);
        0qQ.A0B(str, 4);
        if (!this.A0C.A0B) {
            A0D(r3, r4, r5, str);
        }
    }

    public final /* synthetic */ void DXc(2Co r1) {
    }

    public final void DZ3() {
    }

    public final void DmQ(C263684My r2, C263674Mx r3, String str, long j, boolean z, boolean z2) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r2, 1);
        if (!this.A0C.A0B) {
            A07(this, r2, r3);
        }
    }

    public final /* synthetic */ void DnZ(C297475ro r1) {
    }

    public final void Dnv(boolean z) {
    }

    public final void Drl(List list) {
    }

    public final void Dt8(C284815Oa r1, AnonymousClass4Yf r2, AnonymousClass4Yf r3, String str, String str2, List list, long j) {
    }

    public final void DxA(C263684My r2, C263674Mx r3, String str, String str2, String str3, String str4, long j, boolean z) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r2, 1);
        0qQ.A0B(str4, 7);
        if (!this.A0C.A0B) {
            A08(this, r2, r3, str4);
        }
    }

    public final void DxH(C297475ro r2, C263684My r3, C263674Mx r4, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 3);
        0qQ.A0B(str3, 8);
        if (!this.A0C.A0B) {
            A0B(this, r3, r4, str3, z2);
        }
    }

    public final void Dxb(C297475ro r8, C263684My r9, C263674Mx r10, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        C263674Mx r3 = r10;
        0qQ.A0B(r10, 0);
        C263684My r2 = r9;
        0qQ.A0B(r9, 3);
        String str6 = str5;
        0qQ.A0B(str6, 11);
        if (!this.A0C.A0B) {
            A0A(this, r2, r3, str6, j);
        }
    }

    public final void DyF() {
    }

    public final void DyV(C263684My r2, C263674Mx r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r2, 3);
        if (!this.A0C.A0B) {
            A09(this, r2, r3, str4);
        }
    }

    public final void Dzh(boolean z, boolean z2) {
    }

    public final void E06(C284815Oa r1) {
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    private final AnonymousClass4OR A00() {
        AnonymousClass4OR BnS;
        C263874Nr r0 = this.A03;
        if (r0 != null && (BnS = r0.BnS()) != null) {
            return BnS;
        }
        long j = this.A00;
        0bb r2 = new 0bb();
        r2.A05("media_id", Long.valueOf(j));
        r2.A01(AnonymousClass4OQ.ORGANIC, "tracking_type");
        r2.A06("current_watching_module", MediaStreamTrack.VIDEO_TRACK_KIND);
        return r2;
    }

    public static final String A02(AnonymousClass4NN r0) {
        AnonymousClass4MB BO6;
        C263874Nr r02 = r0.A03;
        if (r02 == null || (BO6 = r02.BO6()) == null) {
            return "DEFAULT_TOKEN";
        }
        return BO6.A00();
    }

    public static final void A03(AnonymousClass4NN r25) {
        long j;
        Runnable wiP;
        AnonymousClass4NN r6 = r25;
        1yA r7 = r6.A0C;
        if (r7.A09) {
            if (r6.A0L.get()) {
                j = r7.A02;
            } else {
                j = r7.A03;
            }
            if (j != -1) {
                AnonymousClass4NK r5 = r6.A0A;
                r5.A01();
                C263624Ms r4 = r6.A09;
                C263634Mt r3 = r4.A0I;
                if (r3.A0J() && r4.A0N.get()) {
                    String A022 = A02(r6);
                    AnonymousClass4OY A002 = r5.A00(r6.A02, A022);
                    long A082 = (long) ((int) r3.A08());
                    if (A002 != null) {
                        A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, "heartbeat", A022, (String) null, (String) null, (String) null, A082, r6.A01, SystemClock.elapsedRealtime(), false);
                        A002.A00();
                    }
                    if (r7.A0J) {
                        wiP = (Runnable) r6.A0E.getValue();
                    } else {
                        wiP = new C19952WiP(r6);
                    }
                    r6.A0D.A00(wiP, j);
                }
            }
        }
    }

    public static final void A04(AnonymousClass4NN r24) {
        AnonymousClass4NN r3 = r24;
        String A022 = A02(r3);
        AnonymousClass4OY A002 = r3.A0A.A00(r3.A02, A022);
        if (A002 != null) {
            C263634Mt r6 = r3.A09.A0I;
            A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, Long.valueOf(r6.A0S), (Long) null, "requested_seek", A022, (String) null, (String) null, String.valueOf(r6.A0S), (long) ((int) r6.A08()), r3.A01, SystemClock.elapsedRealtime(), false);
        }
    }

    public static final void A05(AnonymousClass4NN r20, long j, boolean z) {
        AnonymousClass4NN r2 = r20;
        String A022 = A02(r2);
        AnonymousClass4OY A002 = r2.A0A.A00(r2.A02, A022);
        if (A002 != null) {
            A002.A01((C290425fI) null, Boolean.valueOf(z), (Boolean) null, (Long) null, (Long) null, "stopped_buffering", A022, (String) null, (String) null, (String) null, j, r2.A01, SystemClock.elapsedRealtime(), false);
            r2.A0B.A00(C264144Ot.STALL_ENDED, A022);
        }
    }

    public static final void A06(AnonymousClass4NN r23, C284815Oa r24, String str) {
        AnonymousClass4NN r5 = r23;
        String str2 = str;
        AnonymousClass4OY A002 = r5.A0A.A00(r5.A02, str2);
        if (A002 != null) {
            long A082 = (long) ((int) r5.A09.A0I.A08());
            0bb r9 = new 0bb();
            r9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "error_recovery_attempt");
            r9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error_recovery_attempt");
            C284815Oa r7 = r24;
            if (r24 != null) {
                HashMap hashMap = new HashMap();
                C266464Yz r6 = r7.A00;
                hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, r6.toString());
                hashMap.put("error", r6.name());
                hashMap.put(DevServerEntity.COLUMN_DESCRIPTION, r7.A02);
                hashMap.put("domain", r7.A01.toString());
                hashMap.put("last_encoding_tag", r5.A08);
            }
            long j = A082;
            A002.A01(r9, (Boolean) null, (Boolean) null, (Long) null, (Long) null, "error", str2, (String) null, (String) null, (String) null, j, r5.A01, SystemClock.elapsedRealtime(), false);
        }
    }

    public static final void A07(AnonymousClass4NN r21, C263684My r22, C263674Mx r23) {
        AnonymousClass4NN r3 = r21;
        String A022 = A02(r3);
        AnonymousClass4OY A002 = r3.A0A.A00(r3.A02, A022);
        if (A002 != null) {
            long j = r22.A02;
            if (j > 0) {
                r3.A01 = j;
            }
            C263674Mx r0 = r23;
            A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, "started_buffering", A022, (String) null, (String) null, (String) null, r0.A00(), r0.A0U, SystemClock.elapsedRealtime(), false);
            r3.A0B.A00(C264144Ot.STALL_STARTED, A022);
        }
    }

    public static final void A08(AnonymousClass4NN r23, C263684My r24, C263674Mx r25, String str) {
        Long l;
        AnonymousClass4NN r4 = r23;
        AnonymousClass4OY A002 = r4.A0A.A00(r4.A02, str);
        if (A002 != null) {
            long j = r24.A02;
            if (j > 0) {
                r4.A01 = j;
            }
            C263674Mx r3 = r25;
            long A003 = r3.A00();
            long j2 = r4.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String A022 = A02(r4);
            if (j > 0) {
                long j3 = j - r3.A0B;
                if (j3 < 0) {
                    j3 = 0;
                }
                l = Long.valueOf(j3);
            } else {
                l = null;
            }
            A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, l, "cancelled", A022, (String) null, (String) null, (String) null, A003, j2, elapsedRealtime, false);
            A002.A00();
            AnonymousClass4NP r2 = r4.A0B;
            String A023 = A02(r4);
            r2.A00(C264144Ot.CANCEL_START, A023);
            r2.A01(A023);
        }
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [X.0rl, java.lang.Object] */
    public static final void A09(AnonymousClass4NN r26, C263684My r27, C263674Mx r28, String str) {
        String str2;
        Integer num;
        AnonymousClass4NN r0 = r26;
        String str3 = str;
        C58840Ae r4 = r0.A0F;
        1yA r1 = r0.A0C;
        AnonymousClass4NO.A00(r4, r0.A00(), r1, "client_video_started_playing", (String) null);
        String A022 = A02(r0);
        AnonymousClass4NK r5 = r0.A0A;
        AnonymousClass4OY A002 = r5.A00(r0.A02, A022);
        if (A002 != null) {
            ((AnonymousClass4OW) A002.videoLoggerHandler).A00.A00 = r0.A00();
            AnonymousClass4OR r6 = null;
            if (!r1.A0I) {
                str2 = null;
            } else if (r5.A02(r0.A00, true)) {
                str2 = "started";
            } else {
                str2 = "unpaused";
            }
            C263684My r8 = r27;
            long j = r8.A02;
            C263674Mx r52 = r28;
            if (j <= 0) {
                j = r52.A0U;
            }
            r0.A01 = j;
            long A003 = r52.A00();
            long j2 = r0.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C263634Mt r42 = r0.A09.A0I;
            A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, Long.valueOf(r42.A0S), (Long) null, "started_playing", A022, str2, (String) null, String.valueOf(r42.A0S), A003, j2, elapsedRealtime, false);
            if (r0.A0N.getAndSet(r42.A0S) != r42.A0S) {
                C263874Nr r2 = r0.A03;
                if (r2 != null) {
                    num = r2.BSo();
                } else {
                    num = null;
                }
                if (num == AnonymousClass05K.A04) {
                    str3 = null;
                }
                0bb r10 = new 0bb();
                if (str3 != null) {
                    r10.A06("fb_manifest_identifier", str3);
                }
                r10.A03("is_predictive_playback", Boolean.valueOf(r8.A0B));
                String str4 = r52.A0V;
                if (str4 != null) {
                    r10.A06("client_latency_setting", str4);
                }
                r10.A03("is_mixed_codec_manifest", Boolean.valueOf(r52.A0P));
                int i = r52.A05;
                r10.A05("available_qualities_count", Long.valueOf((long) i));
                boolean z = true;
                if (i <= 1) {
                    z = false;
                }
                r10.A03("is_abr_enabled", Boolean.valueOf(z));
                r0.A0F(r10);
                r0.A0D.A00(new AnonymousClass5MF(r0), 0);
            }
            AnonymousClass4NM r22 = r0.A0H;
            if (r22 != null) {
                AnonymousClass5MG.A00 = r22.A00;
                long j3 = r0.A01;
                C263874Nr r23 = r0.A03;
                if (r23 != null) {
                    r6 = r23.BnS();
                }
                boolean z2 = r1.A08;
                long j4 = r1.A01;
                long j5 = r1.A00;
                if (r6 != null) {
                    Object obj = r6.A00.get("tracking_type");
                    0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                    if (0qQ.A0K(obj, "paid") && z2) {
                        long j6 = j4 * 1000;
                        long j7 = j5 * 1000;
                        if (j3 >= j7) {
                            j3 = j7;
                        }
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.post(new C51493Fv1(handler, new Object(), j3, j6));
                    }
                }
            }
            r0.A06 = A022;
            r0.A0B.A00(C264144Ot.STARTED_PLAYING, A022);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r9.A0O != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.AnonymousClass4NN r28, X.C263684My r29, X.C263674Mx r30, java.lang.String r31, long r32) {
        /*
            r4 = r28
            X.4NK r1 = r4.A0A
            X.4OY r0 = r4.A02
            r8 = r31
            X.4OY r13 = r1.A00(r0, r8)
            if (r13 == 0) goto L_0x0077
            r0 = r29
            long r0 = r0.A02
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            r4.A01 = r0
        L_0x001a:
            long r6 = r4.A01
            long r28 = android.os.SystemClock.elapsedRealtime()
            r14 = 0
            X.4Ms r2 = r4.A09
            X.4Mt r5 = r2.A0I
            long r2 = r5.A0S
            java.lang.Long r17 = java.lang.Long.valueOf(r2)
            r9 = r30
            long r2 = r9.A0E
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0038
            boolean r3 = r9.A0O
            r2 = 0
            if (r3 == 0) goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0078
            long r2 = r9.A0B
            long r0 = r0 - r2
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x004a
            r0 = 0
        L_0x004a:
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
        L_0x004e:
            long r0 = r5.A0S
            java.lang.String r23 = java.lang.String.valueOf(r0)
            java.lang.String r19 = "paused"
            r30 = 0
            r24 = r32
            r15 = r14
            r21 = r14
            r22 = r14
            r26 = r6
            r20 = r8
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30)
            r13.A00()
            X.4NP r2 = r4.A0B
            java.lang.String r1 = A02(r4)
            X.4Ot r0 = X.C264144Ot.PAUSED
            r2.A00(r0, r1)
            r2.A01(r1)
        L_0x0077:
            return
        L_0x0078:
            r18 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NN.A0A(X.4NN, X.4My, X.4Mx, java.lang.String, long):void");
    }

    public static final void A0B(AnonymousClass4NN r37, C263684My r38, C263674Mx r39, String str, boolean z) {
        AnonymousClass4NN r0 = r37;
        String str2 = str;
        AnonymousClass4OY A002 = r0.A0A.A00(r0.A02, str2);
        if (A002 != null) {
            long j = r38.A02;
            if (j > 0) {
                r0.A01 = j;
            }
            A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, "completed", str2, (String) null, (String) null, (String) null, r39.A00(), r0.A01, SystemClock.elapsedRealtime(), z);
            A002.A00();
            if (z) {
                long j2 = r0.A01;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C263634Mt r5 = r0.A09.A0I;
                A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, Long.valueOf(r5.A0S), (Long) null, "started_playing", str2, (String) null, (String) null, String.valueOf(r5.A0S), 0, j2, elapsedRealtime, z);
            }
            r0.A0B.A00(C264144Ot.COMPLETED, A02(r0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r0 = r0.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r6 = r10.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (X.00p.A0j(r0, r6, false) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r0 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = r0.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (X.00p.A0j(r0, r6, false) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r8 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r5 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if ((!r6.equals("0")) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r5 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r9.A04 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r8 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r9.A05 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r0 = r9.A03;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r0 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r1 = r0.BSo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        if (r1 != X.AnonymousClass05K.A04) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r0 = new X.11S("mpd_qe=(.*?)\\)").A06(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r0 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        if (r1 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        r0 = r1.A09(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        if (r0 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        if (r8 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.00p.A0k(r2, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, false) != true) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        r2 = new X.0bb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        if (r3 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        r2.A06("representation_id", r3);
        r2.A06("video_representation_id", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        if (r0 <= 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0092, code lost:
        r2.A05("encoded_bitrate_client_side", java.lang.Long.valueOf((long) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009c, code lost:
        r0 = A01(r10.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        if (r0 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a4, code lost:
        r2.A04("unified_upload_mos_client_side", java.lang.Double.valueOf(r0.doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        r1 = A01(r10.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        if (r1 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b9, code lost:
        r2.A04("playback_resolution_mos", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00be, code lost:
        r1 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        r2.A06("encoding_tag_video", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r4 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c9, code lost:
        r2.A06("mpd_qe_experiment", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ce, code lost:
        r9.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d1, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d3, code lost:
        r2 = new X.0bb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d8, code lost:
        if (r3 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        r2.A06("audio_representation_id", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e1, code lost:
        if (r0 <= 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e3, code lost:
        r2.A05("encoded_bitrate_client_side", java.lang.Long.valueOf((long) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ed, code lost:
        r1 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ef, code lost:
        if (r1 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f1, code lost:
        r2.A06("encoding_tag_audio", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r9.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fa, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0103, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (X.00p.A0k(r2, org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND, false) != true) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r9.A08 = r10.A07;
        r0 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 == null) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(X.AnonymousClass4NN r9, X.AnonymousClass4Yf r10) {
        /*
            java.lang.String r2 = r10.A0E
            r5 = 1
            if (r2 == 0) goto L_0x000f
            java.lang.String r1 = "video"
            r0 = 0
            boolean r0 = X.00p.A0k(r2, r1, r0)
            r8 = 1
            if (r0 == r5) goto L_0x0012
        L_0x000f:
            r8 = 0
            if (r2 == 0) goto L_0x0103
        L_0x0012:
            java.lang.String r1 = "audio"
            r0 = 0
            boolean r0 = X.00p.A0k(r2, r1, r0)
            if (r0 != r5) goto L_0x0103
        L_0x001b:
            java.lang.String r0 = r10.A07
            r9.A08 = r0
            X.4Yf r0 = r9.A04
            r7 = 0
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = r0.A0D
        L_0x0026:
            java.lang.String r6 = r10.A0D
            r2 = 0
            boolean r0 = X.00p.A0j(r0, r6, r2)
            if (r0 != 0) goto L_0x003f
            X.4Yf r0 = r9.A05
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = r0.A0D
        L_0x0035:
            boolean r0 = X.00p.A0j(r0, r6, r2)
            if (r0 != 0) goto L_0x003f
            if (r8 != 0) goto L_0x0040
            if (r5 != 0) goto L_0x0040
        L_0x003f:
            return
        L_0x0040:
            java.lang.String r0 = "0"
            boolean r0 = r6.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003f
            if (r5 == 0) goto L_0x004e
            r9.A04 = r10
        L_0x004e:
            if (r8 == 0) goto L_0x0052
            r9.A05 = r10
        L_0x0052:
            X.4Nr r0 = r9.A03
            r4 = 0
            if (r0 == 0) goto L_0x00fa
            java.lang.Integer r1 = r0.BSo()
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r3 = r6
            if (r1 != r0) goto L_0x0061
            r3 = r7
        L_0x0061:
            java.lang.String r1 = "mpd_qe=(.*?)\\)"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            X.5gs r0 = r0.A06(r6, r2)
            if (r0 == 0) goto L_0x007b
            X.5gt r1 = r0.A02
            if (r1 == 0) goto L_0x007b
            r0 = 1
            X.5gu r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x007b
            java.lang.String r4 = r0.A00
        L_0x007b:
            if (r8 == 0) goto L_0x00d1
            X.4Ob r2 = new X.4Ob
            r2.<init>()
            if (r3 == 0) goto L_0x008e
            java.lang.String r0 = "representation_id"
            r2.A06(r0, r3)
            java.lang.String r0 = "video_representation_id"
            r2.A06(r0, r3)
        L_0x008e:
            int r0 = r10.A02
            if (r0 <= 0) goto L_0x009c
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "encoded_bitrate_client_side"
            r2.A05(r0, r1)
        L_0x009c:
            java.lang.String r0 = r10.A0C
            java.lang.Double r0 = A01(r0)
            if (r0 == 0) goto L_0x00b1
            double r0 = r0.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "unified_upload_mos_client_side"
            r2.A04(r0, r1)
        L_0x00b1:
            java.lang.String r0 = r10.A09
            java.lang.Double r1 = A01(r0)
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = "playback_resolution_mos"
            r2.A04(r0, r1)
        L_0x00be:
            java.lang.String r1 = r9.A08
            if (r1 == 0) goto L_0x00c7
            java.lang.String r0 = "encoding_tag_video"
            r2.A06(r0, r1)
        L_0x00c7:
            if (r4 == 0) goto L_0x00ce
            java.lang.String r0 = "mpd_qe_experiment"
            r2.A06(r0, r4)
        L_0x00ce:
            r9.A0F(r2)
        L_0x00d1:
            if (r5 == 0) goto L_0x003f
            X.4Ob r2 = new X.4Ob
            r2.<init>()
            if (r3 == 0) goto L_0x00df
            java.lang.String r0 = "audio_representation_id"
            r2.A06(r0, r3)
        L_0x00df:
            int r0 = r10.A02
            if (r0 <= 0) goto L_0x00ed
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "encoded_bitrate_client_side"
            r2.A05(r0, r1)
        L_0x00ed:
            java.lang.String r1 = r9.A08
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "encoding_tag_audio"
            r2.A06(r0, r1)
        L_0x00f6:
            r9.A0F(r2)
            return
        L_0x00fa:
            r1 = r7
            goto L_0x005b
        L_0x00fd:
            r0 = r7
            goto L_0x0035
        L_0x0100:
            r0 = r7
            goto L_0x0026
        L_0x0103:
            r5 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NN.A0C(X.4NN, X.4Yf):void");
    }

    private final void A0D(C284815Oa r32, C263684My r33, C263674Mx r34, String str) {
        Long l;
        String str2 = str;
        AnonymousClass4OY A002 = this.A0A.A00(this.A02, str2);
        if (A002 != null) {
            long A082 = (long) ((int) this.A09.A0I.A08());
            0bb r14 = new 0bb();
            r14.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "failed_playing");
            r14.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "failed_playing");
            C284815Oa r3 = r32;
            C266464Yz r2 = r3.A00;
            r14.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, r2.toString());
            r14.A06("error", r2.name());
            r14.A06(DevServerEntity.COLUMN_DESCRIPTION, r3.A02);
            r14.A06("domain", r3.A01.toString());
            r14.A06("last_encoding_tag", this.A08);
            long j = r33.A02;
            if (j > 0) {
                this.A01 = j;
            }
            long j2 = this.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j > 0) {
                long j3 = j - r34.A0B;
                if (j3 < 0) {
                    j3 = 0;
                }
                l = Long.valueOf(j3);
            } else {
                l = null;
            }
            A002.A01(r14, (Boolean) null, (Boolean) null, (Long) null, l, "error", str2, (String) null, (String) null, (String) null, A082, j2, elapsedRealtime, false);
            A002.A00();
            AnonymousClass4NP r22 = this.A0B;
            String A022 = A02(this);
            r22.A00(C264144Ot.PLAYER_ERROR, A022);
            r22.A01(A022);
        }
    }

    public final void A0E() {
        String str;
        C58840Ae r4 = this.A0F;
        1yA r3 = this.A0C;
        AnonymousClass4NO.A00(r4, A00(), r3, "client_video_requested_playing", (String) null);
        String A022 = A02(this);
        AnonymousClass4NK r42 = this.A0A;
        AnonymousClass4OY A002 = r42.A00(this.A02, A022);
        if (A002 != null) {
            if (!r3.A0I) {
                str = null;
            } else if (r42.A02(this.A00, false)) {
                str = "started";
            } else {
                str = "unpaused";
            }
            long j = this.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C263634Mt r5 = this.A09.A0I;
            A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, Long.valueOf(r5.A0S), (Long) null, "requested_playing", A022, str, (String) null, String.valueOf(r5.A0S), 0, j, elapsedRealtime, false);
            this.A0B.A00(C264144Ot.REQUESTED_PLAYING, A022);
        }
    }

    public final void A0F(C263974Ob r26) {
        C263974Ob r8 = r26;
        if (r26 != null) {
            String A022 = A02(this);
            AnonymousClass4OY A002 = this.A0A.A00(this.A02, A022);
            long A082 = (long) ((int) this.A09.A0I.A08());
            if (A002 == null) {
                C263874Nr r0 = this.A03;
                if (r0 != null) {
                    r0.EZp(r8, A022);
                    return;
                }
                return;
            }
            long j = this.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A002.A02.getAndIncrement();
            A002.A01.offer(new C264134Os((C290425fI) null, r8, (Boolean) null, (Boolean) null, (Long) null, (Long) null, "tags_changed", A022, (String) null, (String) null, (String) null, elapsedRealtime, A082, j, false));
        }
    }

    public final void DNp(boolean z) {
        if (!this.A0C.A0B) {
            0bb r2 = new 0bb();
            r2.A03("is_broadcast_interrupted", Boolean.valueOf(z));
            A0F(r2);
        }
    }

    public final void DXg(C263674Mx r4, float f, long j) {
        if (!this.A0C.A0B) {
            0bb r2 = new 0bb();
            r2.A04("playback_speed", Double.valueOf((double) f));
            A0F(r2);
        }
    }

    public final void DYz(long j, String str) {
        this.A0B.A00(C264144Ot.PREPARE_FINISHED, A02(this));
    }

    public final void DnM(long j, long j2, boolean z, boolean z2, boolean z3) {
        if (!this.A0C.A0B) {
            A05(this, j, z3);
        }
    }

    public final void DyA() {
        1yA r1 = this.A0C;
        if (r1.A0D && !r1.A0C) {
            A0E();
        }
    }

    public final void DyH(int i, int i2, float f) {
        if (!this.A0C.A0B) {
            0bb r2 = new 0bb();
            r2.A05("video_width", Long.valueOf((long) i));
            r2.A05("video_height", Long.valueOf((long) i2));
            A0F(r2);
        }
    }

    public final void onSeeking(long j) {
        if (!this.A0C.A0B) {
            A04(this);
        }
    }
}
