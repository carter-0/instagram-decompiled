package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7rC  reason: invalid class name and case insensitive filesystem */
public abstract class C344027rC extends C343907r0 implements C344037rD {
    public String A00;
    public String A01;
    public boolean A02;
    public int A03 = 0;
    public String A04;
    public final C343997r9 A05;
    public final C344097rJ A06 = new C344097rJ();
    public final C344117rL A07 = new C344117rL();
    public final C344147rO A08 = new C344147rO();
    public final String A09;

    public final void A0A(C391719tX r14, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        C344007rA r5 = (C344007rA) this;
        C391719tX r4 = r14;
        if (!C344007rA.A01(r5, r14)) {
            0wc CB0 = r5.A02.A00.CB0();
            1Ln r3 = new 1Ln(CB0.A00(CB0.A00, "audio_pipeline"), 5);
            if (r3.A00.isSampled()) {
                C344657sD A002 = C344007rA.A00(r4, r5, str2, str4, str5, (String) null, map, j);
                0bb r1 = new 0bb();
                r1.A06(TraceFieldType.AdhocEventName, str);
                r1.A06("fba_error_code", str3);
                r3.A0N(A002, "base");
                r3.A0N(r1, "shared");
                r3.Cgf();
            }
        }
    }

    public final void A0B(C391719tX r14, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        C344007rA r5 = (C344007rA) this;
        C391719tX r4 = r14;
        if (!C344007rA.A01(r5, r14)) {
            0wc CB0 = r5.A02.A00.CB0();
            1Ln r3 = new 1Ln(CB0.A00(CB0.A00, "recording"), 363);
            if (r3.A00.isSampled()) {
                C344657sD A002 = C344007rA.A00(r4, r5, str2, str4, str5, r5.A01.getRecordingSessionId(), map, j);
                0bb r1 = new 0bb();
                r1.A06(TraceFieldType.AdhocEventName, str);
                r1.A06("recording_tracks_info", str3);
                r3.A0N(A002, "base");
                r3.A0N(r1, "shared");
                r3.Cgf();
            }
        }
    }

    public final void A0C(C391719tX r14, String str, String str2, String str3, String str4, Map map, long j) {
        C344007rA r5 = (C344007rA) this;
        C391719tX r4 = r14;
        if (!C344007rA.A01(r5, r14)) {
            0wc CB0 = r5.A02.A00.CB0();
            1Ln r2 = new 1Ln(CB0.A00(CB0.A00, "media_pipeline"), 336);
            if (r2.A00.isSampled()) {
                C344117rL r0 = r5.A07;
                String str5 = str2;
                String str6 = str3;
                String str7 = str4;
                C344657sD A002 = C344007rA.A00(r4, r5, str5, str6, str7, (String) r0.A00.get(C344137rN.A01), map, j);
                0bb r3 = new 0bb();
                r3.A06(TraceFieldType.AdhocEventName, str);
                ArrayList arrayList = new ArrayList();
                C344097rJ r9 = r5.A06;
                String str8 = r9.A02;
                if (!(str8 == null || r9.A03 == null)) {
                    0bb r52 = new 0bb();
                    r52.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str8);
                    r52.A06("size", r9.A03);
                    arrayList.add(r52);
                }
                r3.A07("current_inputs", arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : r9.A09.entrySet()) {
                    0bb r53 = new 0bb();
                    r53.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) entry.getKey());
                    r53.A06("size", (String) entry.getValue());
                    arrayList2.add(r53);
                }
                r3.A07("current_outputs", arrayList2);
                r3.A05("open_gl_version", Long.valueOf((long) r9.A01));
                r2.A0N(A002, "base");
                r2.A0N(r3, "shared");
                r2.Cgf();
            }
        }
    }

    public final void ChM(long j, String str, String str2, Map map) {
        Map A082 = A08(str, map);
        String A072 = A07(str, (String) null, (String) null, (String) null, A082, 0);
        A0D(str);
        A09((C391719tX) null, str, str2, (String) null, (String) null, (String) null, A072, A082, j);
        A0E(str, A082, (String) null);
    }

    public final void CjJ(long j, String str, String str2, Map map) {
        String str3 = str;
        Map A082 = A08(str3, map);
        A07(str3, (String) null, (String) null, (String) null, A082, 0);
        A0D(str3);
        A0C((C391719tX) null, str3, str2, (String) null, (String) null, A082, j);
        A0E(str3, A082, (String) null);
    }

    public final void Cjw(C391719tX r17, String str, String str2, String str3, String str4, String str5, long j) {
        String str6 = str;
        Map A082 = A08(str6, (Map) null);
        C391719tX r2 = r17;
        String str7 = str4;
        String str8 = str6;
        A07(str8, (String) null, r2.getMessage(), str7, A082, r2.A01);
        A0D(str6);
        A0B(r2, str6, str2, str3, str7, str5, A082, j);
        A0E(str6, A082, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        if (r8.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        if (r8.equals(r0) == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if (X.2Ob.A00(r5, "SETTINGS") == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C391719tX r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map r26, long r27) {
        /*
            r18 = this;
            r10 = r18
            X.7rA r10 = (X.C344007rA) r10
            r9 = r19
            boolean r0 = X.C344007rA.A01(r10, r9)
            if (r0 != 0) goto L_0x0099
            r8 = r20
            int r0 = r8.hashCode()
            r5 = r24
            switch(r0) {
                case -2089812162: goto L_0x00a0;
                case -1754934487: goto L_0x00a3;
                case -1730235409: goto L_0x00a6;
                case -1664910074: goto L_0x00a9;
                case -1336913631: goto L_0x00ac;
                case -1304694995: goto L_0x00af;
                case -1272832572: goto L_0x00b2;
                case -1105821602: goto L_0x00b5;
                case -962233622: goto L_0x00b8;
                case -899177627: goto L_0x00bb;
                case -485112878: goto L_0x00be;
                case -429571791: goto L_0x00c1;
                case -279952167: goto L_0x00c4;
                case -226743326: goto L_0x00c7;
                case 199801358: goto L_0x00ca;
                case 206813892: goto L_0x00cd;
                case 369279254: goto L_0x00d0;
                case 576310886: goto L_0x00d3;
                case 841785709: goto L_0x00d6;
                case 859820821: goto L_0x00d9;
                case 867259005: goto L_0x00dc;
                case 1310685052: goto L_0x00df;
                case 1487228098: goto L_0x00e2;
                case 1501399951: goto L_0x00e5;
                case 2001457490: goto L_0x00ef;
                default: goto L_0x0017;
            }
        L_0x0017:
            X.7rI r0 = r10.A02
            X.7r9 r0 = r0.A00
            X.0Ae r2 = r0.CB0()
            java.lang.String r1 = "camera"
            X.0wc r2 = (X.0wc) r2
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 8
            X.1Ln r3 = new X.1Ln
            r3.<init>(r1, r0)
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0099
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r25
            r15 = r26
            r16 = r27
            X.7sD r4 = X.C344007rA.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            X.7o8 r6 = new X.7o8
            r6.<init>()
            X.7rJ r7 = r10.A06
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "width"
            r6.A05(r0, r1)
            java.lang.String r0 = "height"
            r6.A05(r0, r1)
            X.7o9 r2 = new X.7o9
            r2.<init>()
            java.lang.String r0 = "event_name"
            r2.A06(r0, r8)
            int r1 = r7.A00
            r0 = -1
            if (r1 == r0) goto L_0x009d
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = "Back"
        L_0x0072:
            java.lang.String r0 = "facing"
            r2.A06(r0, r1)
            java.lang.String r1 = "null"
            java.lang.String r0 = "orientation"
            r2.A06(r0, r1)
            r0 = 843(0x34b, float:1.181E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A02(r6, r0)
            java.lang.String r0 = "description"
            r2.A06(r0, r5)
            java.lang.String r0 = "base"
            r3.A0N(r4, r0)
            java.lang.String r0 = "shared"
            r3.A0N(r2, r0)
            r3.Cgf()
        L_0x0099:
            return
        L_0x009a:
            java.lang.String r1 = "Front"
            goto L_0x0072
        L_0x009d:
            java.lang.String r1 = "None"
            goto L_0x0072
        L_0x00a0:
            java.lang.String r0 = "camera_connect_request_posted"
            goto L_0x00e7
        L_0x00a3:
            java.lang.String r0 = "init_controllers_finished"
            goto L_0x00e7
        L_0x00a6:
            java.lang.String r0 = "initialise_camera_started"
            goto L_0x00e7
        L_0x00a9:
            java.lang.String r0 = "preview_start_finished"
            goto L_0x00e7
        L_0x00ac:
            java.lang.String r0 = "camera_features_prepare_started"
            goto L_0x00e7
        L_0x00af:
            java.lang.String r0 = "camera_open_finished"
            goto L_0x00e7
        L_0x00b2:
            java.lang.String r0 = "connect_controllers_started"
            goto L_0x00e7
        L_0x00b5:
            java.lang.String r0 = "camera_meta_data_handler_setup_finished"
            goto L_0x00e7
        L_0x00b8:
            java.lang.String r0 = "init_controllers_started"
            goto L_0x00e7
        L_0x00bb:
            java.lang.String r0 = "camera_update_started"
            goto L_0x00f1
        L_0x00be:
            java.lang.String r0 = "camera_features_prepare_finished"
            goto L_0x00e7
        L_0x00c1:
            java.lang.String r0 = "get_surface_texture_finished"
            goto L_0x00e7
        L_0x00c4:
            java.lang.String r0 = "camera_update_failed"
            goto L_0x00f1
        L_0x00c7:
            java.lang.String r0 = "get_surface_texture_started"
            goto L_0x00e7
        L_0x00ca:
            java.lang.String r0 = "camera_update_finished"
            goto L_0x00f1
        L_0x00cd:
            java.lang.String r0 = "initialise_camera_finished"
            goto L_0x00e7
        L_0x00d0:
            java.lang.String r0 = "camera_connect_callback_started"
            goto L_0x00e7
        L_0x00d3:
            java.lang.String r0 = "camera_open_started"
            goto L_0x00e7
        L_0x00d6:
            java.lang.String r0 = "preview_start_started"
            goto L_0x00e7
        L_0x00d9:
            java.lang.String r0 = "camera_meta_data_handler_setup_started"
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r0 = "camera_connect_callback_finished"
            goto L_0x00e7
        L_0x00df:
            java.lang.String r0 = "camera_warmup_started"
            goto L_0x00e7
        L_0x00e2:
            java.lang.String r0 = "camera_swipe_to_open_finished"
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r0 = "connect_controllers_finished"
        L_0x00e7:
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0099
            goto L_0x0017
        L_0x00ef:
            java.lang.String r0 = "camera_update_requested"
        L_0x00f1:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "SETTINGS"
            boolean r0 = X.2Ob.A00(r5, r0)
            if (r0 == 0) goto L_0x0017
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344027rC.A09(X.9tX, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long):void");
    }

    public final void A0D(String str) {
        Integer num;
        if (0LA.A04 == null) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (num != AnonymousClass05K.A01) {
            0VJ r3 = C59190Kz.A00;
            if (str.equals("media_pipeline_update_effects_list") && r3 != null && !this.A02) {
                List list = this.A06.A05;
                if (list.isEmpty()) {
                    r3.A00(AnonymousClass0LO.A4s);
                } else {
                    r3.A01(AnonymousClass0LO.A4s, A04(list));
                }
            }
        } else if (str.equals("media_pipeline_update_effects_list") && !this.A02) {
            List list2 = this.A06.A05;
            if (list2.isEmpty()) {
                0LA.A04(AnonymousClass0LO.A4s);
            } else {
                0LA.A05(AnonymousClass0LO.A4s, A04(list2));
            }
        }
        if (str.equals("camera_connect_requested") || str.equals("media_pipeline_start")) {
            A05(AnonymousClass0LO.A4u, this.A01);
            A05(AnonymousClass0LO.A4v, this.A00);
            A05(AnonymousClass0LO.A4r, ((C344017rB) this).A01.getActiveSessionId());
        }
    }

    public final C352718Eo ALQ() {
        C352718Eo r1 = new C352718Eo();
        r1.A03 = this.A00;
        String str = this.A01;
        if (str != null) {
            r1.A05 = str;
        }
        String activeSessionId = ((C344017rB) this).A01.getActiveSessionId();
        if (activeSessionId != null) {
            r1.A02 = activeSessionId;
        }
        return r1;
    }

    public final C344107rK Ajt() {
        return this.A06;
    }

    public final C343937r3 BJv() {
        return C344037rD.A00;
    }

    public final AwakeTimeSinceBootClock BU4() {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        return awakeTimeSinceBootClock;
    }

    public final C344157rP Bbd() {
        return this.A08;
    }

    public final boolean BgI() {
        return this.A02;
    }

    public final String BgN() {
        return this.A00;
    }

    public final Map CNM(C361898h0 r3, Map map) {
        if (r3 != null) {
            if (map == null) {
                map = new HashMap(8);
            }
            map.put("perf_frame_count", String.valueOf(r3.A0D));
            map.put("gpu_perf_frame_count", String.valueOf(r3.A0E));
            map.put("delay_perf_frame_count", String.valueOf(r3.A0C));
            map.put("perf_was_recording", String.valueOf(r3.A0G));
            if (!this.A02) {
                map.put("perf_effect_id", String.valueOf(r3.A0F));
            }
            map.put("perf_avg_render_time_ms", String.valueOf(r3.A01));
            map.put("perf_stddev_render_time_ms", String.valueOf(r3.A09));
            map.put("perf_avg_render_gap_time_ms", String.valueOf(r3.A00));
            map.put("perf_stddev_render_gap_time_ms", String.valueOf(r3.A08));
            map.put("perf_out_of_order_startend", String.valueOf(r3.A0B));
            map.put("gpu_perf_avg_render_time_ms", String.valueOf(r3.A05));
            map.put("gpu_perf_stddev_render_time_ms", String.valueOf(r3.A07));
            map.put("gpu_perf_avg_render_gap_time_ms", String.valueOf(r3.A04));
            map.put("gpu_perf_stddev_render_gap_time_ms", String.valueOf(r3.A06));
            map.put("gpu_perf_out_of_order_startend", String.valueOf(r3.A0A));
            map.put("delay_perf_avg_render_time_ms", String.valueOf(r3.A02));
            map.put("delay_perf_stddev_render_time_ms", String.valueOf(r3.A03));
        }
        return map;
    }

    public final void ChC(C391719tX r17, String str, String str2, String str3, String str4, String str5, long j) {
        String str6 = str;
        Map A082 = A08(str6, (Map) null);
        C391719tX r2 = r17;
        String str7 = str3;
        String str8 = str6;
        A07(str8, (String) null, r2.getMessage(), str7, A082, r2.A01);
        A0D(str6);
        A0A(r2, str6, "AudioPipelineController", str5, str7, str4, A082, j);
        A0E(str6, A082, (String) null);
    }

    public final void ChD(long j, String str, String str2, Map map) {
        String str3 = str;
        Map A082 = A08(str3, map);
        A07(str3, (String) null, (String) null, (String) null, A082, 0);
        A0D(str3);
        A0A((C391719tX) null, str3, str2, (String) null, (String) null, (String) null, A082, j);
        A0E(str3, A082, (String) null);
    }

    public final void ChL(C391719tX r18, String str, String str2, String str3, String str4, Map map, long j) {
        String str5 = str;
        Map A082 = A08(str5, map);
        C391719tX r2 = r18;
        String str6 = str3;
        String str7 = str5;
        String A072 = A07(str7, (String) null, r2.getMessage(), str6, A082, r2.A01);
        A0D(str5);
        A09(r2, str5, str2, str6, str4, (String) null, A072, A082, j);
        A0E(str5, A082, (String) null);
    }

    public final void ChN(C391719tX r17, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        C391719tX r1 = r17;
        Map map2 = map;
        String A072 = A07("camera_update_failed", "SWITCH", r1.getMessage(), "medium", map2, 10016);
        A0D("camera_update_failed");
        A09(r1, "camera_update_failed", "CameraEventLoggerImpl", "medium", "CameraEventLoggerImpl", "SWITCH", A072, map2, j);
        A0E("camera_update_failed", map2, "SWITCH");
    }

    public final void ChO(String str, String str2, String str3, Map map, long j) {
        String str4 = str;
        Map A082 = A08(str4, map);
        String str5 = str3;
        String A072 = A07(str4, str5, (String) null, (String) null, A082, 0);
        A0D(str4);
        A09((C391719tX) null, str4, "CameraEventLoggerImpl", (String) null, (String) null, str5, A072, A082, j);
        A0E(str4, A082, str5);
    }

    public final void CjI(C391719tX r16, String str, String str2, String str3, String str4, Map map, long j) {
        Map A082 = A08("media_pipeline_error", map);
        C391719tX r2 = r16;
        String str5 = str3;
        String str6 = "media_pipeline_error";
        A07(str6, (String) null, r2.getMessage(), str5, A082, r2.A01);
        A0D("media_pipeline_error");
        A0C(r2, "media_pipeline_error", str2, str5, str4, A082, j);
        A0E("media_pipeline_error", A082, (String) null);
    }

    public final void Cjv(C391719tX r17, String str, String str2, String str3, String str4, Map map, long j) {
        int i;
        String str5;
        String str6 = str;
        Map map2 = map;
        Map A082 = A08(str6, map2);
        C391719tX r2 = r17;
        if (r17 != null) {
            i = r2.A01;
        } else {
            i = 0;
        }
        if (r17 != null) {
            str5 = r2.getMessage();
        } else {
            str5 = null;
        }
        A07(str6, (String) null, str5, "debug", map2, i);
        A0D(str6);
        A0B(r2, str6, str2, str3, "debug", str4, A082, j);
        A0E(str6, A082, (String) null);
    }

    public final void Cjx(String str, String str2, String str3, Map map, long j) {
        String str4 = str;
        Map A082 = A08(str4, map);
        A07(str4, (String) null, (String) null, (String) null, A082, 0);
        A0D(str4);
        A0B((C391719tX) null, str4, str2, str3, (String) null, (String) null, A082, j);
        A0E(str4, A082, (String) null);
    }

    public final void EAo(long j, boolean z) {
        if (z) {
            C344167rQ r1 = this.A08.A02;
            r1.A00 = true;
            r1.A01.A00(j);
            C344177rR r5 = r1.A03;
            if (r5.A04 != 0) {
                r5.A03++;
            }
            r5.A04 = j;
        }
    }

    public final void EAp(long j) {
        C344167rQ r6 = this.A08.A02;
        C344177rR r5 = r6.A01;
        if (r5.A04 != 0) {
            r5.A03++;
        }
        r5.A04 = j;
        if (r6.A00) {
            r6.A03.A00(j);
        }
    }

    public final void Egs(String str) {
        this.A01 = str;
        A05(AnonymousClass0LO.A4u, str);
    }

    public final void Ew8(String str, Throwable th, boolean z) {
        if (str != null && th != null) {
            0wb r0 = 0wb.A01;
            if (z) {
                r0.EwB(str, th);
            } else {
                r0.Ew3(str, th);
            }
        }
    }

    public C344027rC(C343837qt r5, C343997r9 r6) {
        this.A00 = r5;
        this.A05 = r6;
        String obj = UUID.randomUUID().toString();
        this.A09 = obj;
        Egs((String) this.A00.Apu(C343657qa.A03));
        Egr((String) A06(C343657qa.A02));
        this.A02 = Boolean.TRUE.equals(this.A00.Apu(C343657qa.A01));
        A05(AnonymousClass0LO.A4r, obj);
    }

    public static String A04(List list) {
        if (list.size() < 1) {
            return "";
        }
        int size = list.size();
        String str = (String) list.get(0);
        if (size != 1) {
            return 002.A0g(str, "|", (String) list.get(1));
        }
        return str;
    }

    public static final void A05(0i1 r2, String str) {
        Integer num;
        if (BreakpadManager.isActive()) {
            if (str == null || str.isEmpty()) {
                BreakpadManager.removeCustomData(r2.A00);
            } else {
                BreakpadManager.setCustomData(r2.A00, str, new Object[0]);
            }
        }
        if (0LA.A04 == null) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (num != AnonymousClass05K.A01) {
            0VJ r1 = C59190Kz.A00;
            if (r1 == null) {
                return;
            }
            if (str == null || str.isEmpty()) {
                r1.A00(r2);
            } else {
                r1.A01(r2, str);
            }
        } else if (str == null || str.isEmpty()) {
            0LA.A04(r2);
        } else {
            0LA.A05(r2, str);
        }
    }

    public String A07(String str, String str2, String str3, String str4, Map map, int i) {
        String str5;
        switch (str.hashCode()) {
            case 1031703104:
                str5 = "media_pipeline_start";
                break;
            case 1876082191:
                str5 = "media_pipeline_resume";
                break;
            case 2110321614:
                if (str.equals("camera_created")) {
                    this.A06.A00 = -1;
                    break;
                }
                break;
        }
        if (str.equals(str5)) {
            C344117rL r0 = this.A07;
            C344137rN r2 = C344137rN.A01;
            HashMap hashMap = r0.A00;
            if (hashMap.get(r2) == null) {
                hashMap.put(r2, UUID.randomUUID().toString());
            }
        }
        A05(AnonymousClass0LO.A4t, str.substring(0, Math.min(str.length(), 40)));
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r4.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = r3.A08;
        r2 = X.C344147rO.A00(r1);
        r1.A02.A00();
        r1.A01.A00();
        r1.A00.A00();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r1.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        return CNM(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A08(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1771728128: goto L_0x0052;
                case -1655512013: goto L_0x0033;
                case 1018730470: goto L_0x0024;
                case 1028385748: goto L_0x000b;
                case 1219670603: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r5
        L_0x0008:
            java.lang.String r0 = "recording_failed"
            goto L_0x0054
        L_0x000b:
            java.lang.String r0 = "media_pipeline_pause"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7rO r1 = r3.A08
            X.8h0 r2 = X.C344147rO.A00(r1)
            X.7rQ r0 = r1.A02
            r0.A00()
            X.7rQ r0 = r1.A01
            r0.A00()
            goto L_0x0072
        L_0x0024:
            java.lang.String r0 = "media_pipeline_error"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7rO r0 = r3.A08
            X.8h0 r2 = X.C344147rO.A00(r0)
            goto L_0x0072
        L_0x0033:
            java.lang.String r0 = "recording_started"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7rO r1 = r3.A08
            X.8h0 r2 = X.C344147rO.A00(r1)
            X.7rQ r0 = r1.A02
            r0.A00()
            X.7rQ r0 = r1.A01
            r0.A00()
            X.7rQ r0 = r1.A00
            r0.A00()
            r0 = 1
            goto L_0x0070
        L_0x0052:
            java.lang.String r0 = "recording_finished"
        L_0x0054:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7rO r1 = r3.A08
            X.8h0 r2 = X.C344147rO.A00(r1)
            X.7rQ r0 = r1.A02
            r0.A00()
            X.7rQ r0 = r1.A01
            r0.A00()
            X.7rQ r0 = r1.A00
            r0.A00()
            r0 = 0
        L_0x0070:
            r1.A04 = r0
        L_0x0072:
            java.util.Map r0 = r3.CNM(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344027rC.A08(java.lang.String, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r3.A06.A00 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = r3.A07;
        r0.A00.put(X.C344137rN.A01, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(java.lang.String r4, java.util.Map r5, java.lang.String r6) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1629286812: goto L_0x0008;
                case 470340763: goto L_0x0027;
                case 1028385748: goto L_0x000b;
                case 1709153958: goto L_0x001e;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.String r0 = "media_pipeline_stop"
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = "media_pipeline_pause"
        L_0x000d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7rL r0 = r3.A07
            X.7rN r2 = X.C344137rN.A01
            java.util.HashMap r1 = r0.A00
            r0 = 0
            r1.put(r2, r0)
            return
        L_0x001e:
            java.lang.String r0 = "camera_disconnect_failed"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0076
            return
        L_0x0027:
            java.lang.String r0 = "camera_disconnect_finished"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            boolean r0 = com.facebook.breakpad.BreakpadManager.isActive()
            java.lang.String r2 = "none"
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "camera_core_product_id"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            java.lang.String r0 = "camera_core_product_name"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            java.lang.String r0 = "camera_core_effect_ids"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            java.lang.String r0 = "camera_core_last_event"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "camera_core_camera_session_id"
            com.facebook.breakpad.BreakpadManager.setCustomData(r0, r2, r1)
        L_0x0053:
            X.0UO r0 = X.0LA.A04
            if (r0 != 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0059:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r0 != r1) goto L_0x007c
            X.0i1 r0 = X.AnonymousClass0LO.A4u
            X.0LA.A04(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4v
            X.0LA.A04(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4s
            X.0LA.A04(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4t
            X.0LA.A04(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4r
            X.0LA.A05(r0, r2)
        L_0x0076:
            X.7rJ r1 = r3.A06
            r0 = -1
            r1.A00 = r0
            return
        L_0x007c:
            X.0VJ r1 = X.C59190Kz.A00
            if (r1 == 0) goto L_0x0076
            X.0i1 r0 = X.AnonymousClass0LO.A4u
            r1.A00(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4v
            r1.A00(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4s
            r1.A00(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4t
            r1.A00(r0)
            X.0i1 r0 = X.AnonymousClass0LO.A4r
            r1.A01(r0, r2)
            goto L_0x0076
        L_0x009a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344027rC.A0E(java.lang.String, java.util.Map, java.lang.String):void");
    }

    public final void Egr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            A05(AnonymousClass0LO.A4v, str);
            String str2 = this.A00;
            C344057rF r1 = ((C344017rB) this).A01;
            if (r1 != null) {
                r1.onAnnotationUpdateEvent(23, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("productName cannot be empty");
    }

    public final void EQW(int i) {
        this.A03 = i;
    }

    public final void EVV(String str) {
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7qt, java.lang.Object] */
    @Deprecated
    public C344027rC(C343997r9 r3, String str, String str2) {
        this.A00 = new Object();
        this.A05 = r3;
        String obj = UUID.randomUUID().toString();
        this.A09 = obj;
        Egs(str2);
        Egr(str);
        A05(AnonymousClass0LO.A4r, obj);
    }
}
