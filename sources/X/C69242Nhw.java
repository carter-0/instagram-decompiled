package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Nhw  reason: case insensitive filesystem */
public final class C69242Nhw extends 2Hq implements IGFOAMessagingSendToSentLogger, FOAMessagingSendToSentLogger {
    public 2Hm A00;
    public String A01;
    public final QuickPerformanceLogger A02;
    public final 2Hw A03;
    public final Map A04;
    public final 2Hj A05;
    public final AtomicBoolean A06 = new AtomicBoolean(true);
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public volatile long A08;
    public volatile long A09;
    public volatile String A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69242Nhw(X.2Hm r22, X.2Hj r23, X.2Hj r24, java.util.Map r25, int r26, boolean r27) {
        /*
            r21 = this;
            r11 = 1
            X.2Hv r5 = X.2Hv.A02
            r8 = 0
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            X.2Hw r3 = new X.2Hw
            r4 = r23
            r7 = r26
            r9 = r27
            r10 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.02m r0 = X.C51965G9l.A0l()
            r1 = r25
            r2 = r21
            r2.<init>(r0, r1)
            r2.A03 = r3
            r1 = r22
            r2.A00 = r1
            r2.A02 = r0
            X.2Hv r14 = X.2Hv.A03
            X.2Hj r13 = com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger.FOA_MARKER
            int r1 = r3.A04
            boolean r0 = r3.A06
            java.util.LinkedHashMap r15 = X.AnonymousClass7TE.A1H()
            X.2Hw r12 = new X.2Hw
            r17 = r8
            r18 = r0
            r19 = r8
            r20 = r11
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r14, r12)
            java.util.LinkedHashMap r0 = X.DbY.A0p(r5, r3, r0)
            r2.A04 = r0
            r0 = r24
            r2.A05 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r11)
            r2.A07 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r11)
            r2.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69242Nhw.<init>(X.2Hm, X.2Hj, X.2Hj, java.util.Map, int, boolean):void");
    }

    public final void A0D(2Hw r2, String str, int i) {
        0qQ.A0B(str, 1);
        C69242Nhw.super.A0D(r2, str, i);
    }

    public final void A0G(2Hw r2, String str, String str2) {
        0qQ.A0B(r2, 0);
        C69242Nhw.super.A0G(r2, str, str2);
    }

    public final void A0N(2Hw r2, String str) {
        A0G(r2, str, (String) null);
    }

    public final void annotateDirectMutationTypeStr(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A03, "direct_mutation_type_str", str);
    }

    public final void annotateEndPointReason(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A03, "end_point_reason", str);
    }

    public final void annotateFirstSend(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A03, "first_send", str);
    }

    public final void annotatePreviousMutation(long j, long j2, String str) {
        0qQ.A0B(str, 2);
        2Hw r1 = this.A03;
        A0E(r1, "prev_mutation_start_time_ms", j);
        A0E(r1, "prev_mutation_end_time_ms", j2);
        A0H(r1, "prev_mutation_type", str);
    }

    public final void logTraceAnnotations(boolean z, int i, String str, int i2, String str2, int i3, String str3, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, Integer num, Integer num2, String str6) {
        String str7 = str;
        String str8 = str4;
        String str9 = str5;
        C51973G9u.A0u(2, str7, str8, str9);
        2Hw r2 = this.A03;
        boolean z6 = z;
        A0L(r2, "is_instamadillo", z6);
        A0D(r2, "trace_type", i);
        this.A01 = str7;
        A0H(r2, "message_id_debug", str7);
        A0D(r2, "hash_igd_message_id", i2);
        String str10 = str2;
        if (str2 != null) {
            A0H(r2, "1tid_trace_id", str10);
        }
        int i4 = i3;
        A0D(r2, "message_send_type", i4);
        String str11 = str3;
        if (str3 != null) {
            A0H(r2, "open_thread_id", str11);
        }
        boolean z7 = z2;
        A0L(r2, "is_disappearing_mode", z7);
        boolean z8 = z3;
        A0L(r2, "is_vanish_mode", z8);
        A0H(r2, "thread_type", str8);
        A0H(r2, TraceFieldType.TransportType, str9);
        boolean z9 = z4;
        A0L(r2, "is_e2ee", z9);
        String A002 = C273654mx.A00(2935);
        boolean z10 = z5;
        A0L(r2, A002, z10);
        if (num != null) {
            A0D(r2, "attachment_type", num.intValue());
            A0H(r2, "at", num.toString());
        }
        if (num2 != null) {
            A0D(r2, "attachment_count", num2.intValue());
            A0H(r2, "ac", num2.toString());
        }
        String str12 = str6;
        if (str6 != null) {
            A0H(r2, "visual_type", str12);
        }
        EventBuilder annotate = this.A02.markEventBuilder(this.A05.A00, AnonymousClass7TG.A0A(getInstanceKey()), "start").annotate("is_instamadillo", z6).annotate("is_e2ee", z9).annotate(TraceFieldType.TransportType, str9).annotate("message_id_debug", str7).annotate("message_send_type", i4).annotate("open_thread_id", str11).annotate("is_disappearing_mode", z7).annotate("is_vanish_mode", z8).annotate("thread_type", str8).annotate(A002, z10);
        if (num != null) {
            annotate.annotate("attachment_type", num.intValue());
            annotate.annotate("at", num.toString());
        }
        if (num2 != null) {
            annotate.annotate("attachment_count", num2.intValue());
            annotate.annotate("ac", num2.toString());
        }
        if (str6 != null) {
            annotate.annotate("visual_type", str12);
        }
        annotate.report();
    }

    public final void onEndFlowFail(String str) {
        0qQ.A0B(str, 0);
        String A0R = 002.A0R("reason: ", str);
        0qQ.A0B(A0R, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A0A(C66582MXn.A0h(A0u), A0R);
        }
        2Hm r0 = this.A00;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A00 = null;
        A00(RealtimeConstants.SEND_FAIL);
    }

    public final void onLogCancelSendMutations(String str) {
        0qQ.A0B(str, 0);
        2Hw r1 = this.A03;
        A0N(r1, "cancel_send_mutations");
        A0H(r1, "cancel_send_mutations_reason", str);
    }

    public final void onLogDispatchMutationStart(UserSession userSession, boolean z, int i) {
        0qQ.A0B(userSession, 0);
        2Hw r3 = this.A03;
        A0N(r3, "dispatch_mutation_start");
        A0D(r3, "mutation_count_in_store_at_dispatch", i);
        A0L(r3, "mutation_manager_network_connected", z);
        Iterator A0s = AnonymousClass7TF.A0s(C250563lf.A0J(userSession));
        while (A0s.hasNext()) {
            Dbb.A1V(AnonymousClass7TE.A1J(A0s), r3.A01);
        }
    }

    public final void onLogMQTTFailure(String str) {
        0qQ.A0B(str, 0);
        A0G(this.A03, "mqtt_failure", str);
    }

    public final void onLogPlatformLayerAnnotationBoolean(String str, boolean z) {
        0qQ.A0B(str, 0);
        A0L(this.A03, str, z);
    }

    public final void onLogPlatformLayerPoints(String str, String str2) {
        0qQ.A0B(str, 0);
        A0G(this.A03, str, str2);
    }

    private final void A00(String str) {
        this.A02.markEventBuilder(this.A05.A00, AnonymousClass7TG.A0A(getInstanceKey()), str).annotate("message_id_debug", this.A01).report();
    }

    public final void annotateDirectMutationType(int i) {
        A0D(this.A03, "direct_mutation_type", i);
    }

    public final void annotateDispatchedFromDisk() {
        A0L(this.A03, "dispatched_from_disk", true);
    }

    public final void annotateForwardThreadType(boolean z, boolean z2) {
        Integer A0l;
        int i;
        2Hw r2 = this.A03;
        if (!z) {
            A0l = C51967G9n.A0l(z2 ? 1 : 0);
        } else if (z2) {
            A0l = AnonymousClass05K.A0N;
        } else {
            A0l = AnonymousClass05K.A0C;
        }
        switch (A0l.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        A0D(r2, "forward_thread_type", i);
    }

    public final void annotateIsForward(boolean z) {
        A0L(this.A03, "is_forwarded", z);
    }

    public final void annotateIsReshare(boolean z) {
        A0L(this.A03, C273654mx.A00(786), z);
    }

    public final Integer getInstanceKey() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        if (A0u.hasNext()) {
            return Integer.valueOf(C66582MXn.A0h(A0u).A04);
        }
        return null;
    }

    public final Long getStartTimestamp() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        if (A0u.hasNext()) {
            return C66582MXn.A0h(A0u).A00;
        }
        return null;
    }

    public final boolean isMarkerOn() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        if (A0u.hasNext()) {
            return A0M(C66582MXn.A0h(A0u));
        }
        return false;
    }

    public final void maybeAnnotateDiskIOBlocking() {
        boolean z;
        long j = AnonymousClass2Op.A01;
        long j2 = AnonymousClass2Op.A00;
        String str = AnonymousClass2Op.A02;
        if (this.A08 <= 0 || this.A0A == null || this.A08 == j) {
            z = false;
        } else {
            2Hw r7 = this.A03;
            A0E(r7, "alive_disk_io_start_ms", this.A08);
            A0H(r7, "alive_disk_io_trigger", this.A0A);
            z = true;
        }
        if (j > 0 && str != null && j2 > this.A09) {
            2Hw r1 = this.A03;
            A0E(r1, "disk_io_blocking_start_ms", j);
            A0E(r1, "disk_io_blocking_end_ms", j2);
            A0H(r1, "disk_io_blocking_trigger", str);
        } else if (!z) {
            return;
        }
        2Hw r3 = this.A03;
        A0E(r3, "io_blocking_send_event_start_ms", this.A09);
        A0E(r3, "io_blocking_send_mutation_start_ms", AwakeTimeSinceBootClock.INSTANCE.now());
    }

    public final void onAppBackgrounded() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            2Hw A0i = C66582MXn.A0i(A0u);
            if (A0i.A07) {
                A07(A0i);
                2Hm r0 = this.A00;
                if (r0 != null) {
                    r0.onLoggerEnded(this);
                }
                this.A00 = null;
            } else {
                A0N(A0i, AnonymousClass000.A00(249));
            }
        }
    }

    public final void onAppForegrounded() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A0N(C66582MXn.A0i(A0u), "app_foregrounded");
        }
    }

    public final void onEndFlowCancel(String str) {
        String A0S = 002.A0S("reason: ", str, '}');
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A09(C66582MXn.A0h(A0u), A0S);
        }
        2Hm r0 = this.A00;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A00 = null;
        A00("cancel");
    }

    public final void onLogArmadilloExpressSendEventListenerSendSuccessEnd() {
        A0N(this.A03, "armadillo_express_event_listener_send_success_end");
    }

    public final void onLogArmadilloExpressSendEventListenerSendSuccessStart() {
        A0N(this.A03, "armadillo_express_event_listener_send_success_start");
    }

    public final void onLogArmadilloTlcControlOpenThread() {
        A0N(this.A03, "armadillo_tlc_control_open_thread");
    }

    public final void onLogBumpThreadEnd() {
        A0N(this.A03, "bump_thread_end");
    }

    public final void onLogBumpThreadStart() {
        A0N(this.A03, "bump_thread_start");
    }

    public final void onLogClickEnd() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            2Hw A0h = C66582MXn.A0h(A0u);
            0qQ.A0B(A0h, 0);
            A0I(A0h, "click", (String) null);
        }
    }

    public final void onLogCreateArmadilloExpressProtobufPayloadEnd() {
        A0N(this.A03, "create_armadillo_express_protobuf_payload_end");
    }

    public final void onLogCreateArmadilloExpressProtobufPayloadStart() {
        A0N(this.A03, "create_armadillo_express_protobuf_payload_start");
    }

    public final void onLogDirectMutationCancel() {
        A0N(this.A03, "direct_mutation_cancel");
    }

    public final void onLogDirectMutationConfirm() {
        A0N(this.A03, "direct_mutation_confirm");
    }

    public final void onLogDirectMutationDispatch() {
        A0N(this.A03, "direct_mutation_dispatch");
    }

    public final void onLogDirectMutationDrop() {
        A0N(this.A03, "direct_mutation_drop");
    }

    public final void onLogDirectMutationExecute() {
        A0N(this.A03, "direct_mutation_execute");
    }

    public final void onLogDirectMutationFailure() {
        A0N(this.A03, C273654mx.A00(2260));
    }

    public final void onLogDirectMutationRetry() {
        A0N(this.A03, "direct_mutation_retry");
    }

    public final void onLogDirectMutationSuccess() {
        A0N(this.A03, "direct_mutation_success");
    }

    public final void onLogDispatchMutationEnd() {
        A0N(this.A03, "dispatch_mutation_end");
    }

    public final void onLogExecuteMutationEnd() {
        A0N(this.A03, "execute_mutation_end");
    }

    public final void onLogExecuteMutationStart() {
        A0N(this.A03, "execute_mutation_start");
    }

    public final void onLogFirstMutationSystemDispatchEnd(boolean z) {
        if (this.A06.compareAndSet(true, false)) {
            2Hw r1 = this.A03;
            A0N(r1, "first_system_dispatch_mutation_end");
            A0L(r1, "is_send_mutation_pending", z);
        }
    }

    public final void onLogFirstMutationSystemDispatchStart() {
        if (this.A07.compareAndSet(true, false)) {
            A0N(this.A03, "first_system_dispatch_mutation_start");
        }
    }

    public final void onLogFlowConnectId() {
        A0N(this.A03, "flow_connect_id");
    }

    public final void onLogHandleOutgoingPayloadEnd() {
        A0N(this.A03, "handle_outgoing_payload_end");
    }

    public final void onLogHandleOutgoingPayloadStart() {
        A0N(this.A03, "handle_outgoing_payload_start");
    }

    public final void onLogLSSEndFlowSucceed() {
        A0N(this.A03, "lss_end_flow_succeed");
    }

    public final void onLogMCCErrors(long j, long j2, long j3, int i) {
        2Hw r2 = this.A03;
        A0G(r2, "mcc_error_domain", String.valueOf(j));
        A0G(r2, "mcc_error_event", String.valueOf(j2));
        A0G(r2, "mcc_error_sub_event", String.valueOf(j3));
        A0G(r2, "mcc_error_code", String.valueOf(i));
    }

    public final void onLogMQTTACK() {
        A0N(this.A03, "mqtt_ack");
    }

    public final void onLogMQTTPublish() {
        A0N(this.A03, "mqtt_publish");
    }

    public final void onLogMediaScrutinyFailed() {
        A0N(this.A03, "media_scrutiny_failed");
    }

    public final void onLogMediaScrutinySuccess() {
        A0N(this.A03, "media_scrutiny_success");
    }

    public final void onLogMessageSyncEnd() {
        A0N(this.A03, "message_sync_end");
    }

    public final void onLogMessageSyncStart() {
        A0N(this.A03, "message_sync_start");
    }

    public final void onLogMsysApiMainContextInvoked() {
        A0N(this.A03, "msys_api_main_context_invoked");
    }

    public final void onLogPIIRemovalFailed() {
        A0N(this.A03, "pii_removal_failed");
    }

    public final void onLogPIIRemovalStart() {
        A0N(this.A03, "pii_removal_start");
    }

    public final void onLogPIIRemovalSuccess() {
        A0N(this.A03, "pii_removal_success");
    }

    public final void onLogProcessDmMessageEnd() {
        A0N(this.A03, "process_dm_message_end");
    }

    public final void onLogProcessDmMessageStart() {
        A0N(this.A03, "process_dm_message_start");
    }

    public final void onLogRemoveMessageContextEnd() {
        A0N(this.A03, "remove_message_context_end");
    }

    public final void onLogRemoveMessageContextStart() {
        A0N(this.A03, "remove_message_context_start");
    }

    public final void onLogRenderVideoFailed() {
        A0N(this.A03, "render_video_failed");
    }

    public final void onLogRenderVideoSuccess() {
        A0N(this.A03, "render_video_success");
    }

    public final void onLogSendArmadilloExpressPayloadEnd() {
        A0N(this.A03, "send_armadillo_express_payload_end");
    }

    public final void onLogSendArmadilloExpressPayloadStart() {
        A0N(this.A03, "send_armadillo_express_payload_start");
    }

    public final void onLogSendMutationEnd() {
        A0N(this.A03, "send_mutation_end");
    }

    public final void onLogSendMutationStart() {
        A0N(this.A03, "send_mutation_start");
    }

    public final void onLogSendServerAuthoritative() {
        2Hw r5 = this.A03;
        int i = r5.A04;
        Long l = r5.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("instanceKey: ");
        A1A.append(i);
        A0G(r5, "send_server_authoritative", AnonymousClass7TG.A0m(l, ", startTimestamp: ", A1A));
    }

    public final void onLogSendTextMessageMutationEnd() {
        A0N(this.A03, "send_text_message_mutation_end");
    }

    public final void onLogSendTextMessageMutationStart() {
        A0N(this.A03, "send_text_message_mutation_start");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9jo, X.11X] */
    public final void onStartFlow() {
        2Hm r0 = this.A00;
        if (r0 != null && r0.onLoggerStarted(this)) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A04);
            while (A0u.hasNext()) {
                A08(C66582MXn.A0h(A0u));
            }
        }
        1ES.A04(new C385959jo(this, 5), 1887904277, 4, 120000, false, true);
        this.A09 = AwakeTimeSinceBootClock.INSTANCE.now();
        long j = AnonymousClass2Op.A01;
        long j2 = AnonymousClass2Op.A00;
        String str = AnonymousClass2Op.A02;
        if (j2 >= j || j <= 0 || str == null) {
            this.A08 = 0;
            str = null;
        } else {
            this.A08 = j;
        }
        this.A0A = str;
    }

    public final void onEndFlowSucceed() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("instanceKey: ");
        2Hw r1 = this.A03;
        A1A.append(r1.A04);
        A1A.append(", startTimestamp: ");
        onEndFlowSucceed(AnonymousClass7TF.A0i(r1.A00, A1A));
        A00(RealtimeConstants.SEND_SUCCESS);
    }

    public final void onEndFlowSucceed(String str) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A0C(C66582MXn.A0h(A0u), str);
        }
        2Hm r0 = this.A00;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A00 = null;
    }
}
