package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.messagingclient.componentslogger.ComponentLoggerPluginMCFBridgejniDispatcher;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger;
import com.meta.foa.performancelogging.lss.LocalSendSpeedAnnotations;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Nhu  reason: case insensitive filesystem */
public final class C69240Nhu extends 2Hq implements IGFOAMessagingLocalSendSpeedLogger, FOAMessagingLocalSendSpeedLogger {
    public 2Hm A00;
    public final 2Hw A01;
    public final Map A02;

    public final void annotateEphemeralType(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A01, "ephemeral_type", str);
    }

    public final void annotateFirstSendType(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A01, "first_send_type", str);
    }

    public final void annotateLocalDataId(String str) {
        0qQ.A0B(str, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0H(C66582MXn.A0h(A0u), "local_data_id", str);
        }
    }

    public final void annotateMediaSource(String str) {
        0qQ.A0B(str, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0H(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.MEDIA_SOURCE.getAnnotation(), str);
        }
    }

    public final void annotateMessageLifeCycleState(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A01, "message_life_cycle_state", str);
    }

    public final void annotateMessageSubtype(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A01, "message_sub_type", str);
    }

    public final void annotateMessageType(LocalSendSpeedMessageTypes localSendSpeedMessageTypes) {
        0qQ.A0B(localSendSpeedMessageTypes, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0H(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.MESSAGE_TYPE.getAnnotation(), localSendSpeedMessageTypes.getTypeName());
        }
    }

    public final void annotateReplyToType(String str) {
        0qQ.A0B(str, 0);
        A0H(this.A01, "reply_to_type", str);
    }

    public final void annotateSendSurface(String str) {
        0qQ.A0B(str, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0H(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.SEND_SURFACE.getAnnotation(), str);
        }
    }

    public final void annotateThreadType(int i, String str) {
        0qQ.A0B(str, 1);
        2Hw r1 = this.A01;
        A0D(r1, AnonymousClass000.A00(1892), i);
        A0H(r1, AnonymousClass000.A00(1891), str);
    }

    public final void annotateTransportType(String str) {
        0qQ.A0B(str, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0H(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.TRANSPORT_TYPE.getAnnotation(), str);
        }
    }

    public final void onEndFlowFail(String str) {
        0qQ.A0B(str, 0);
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0A(C66582MXn.A0h(A0u), str);
        }
        2Hm r0 = this.A00;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    public final void onEndFlowSucceed() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            2Hw A0h = C66582MXn.A0h(A0u);
            synchronized (this) {
                0qQ.A0B(A0h, 0);
                A0J(A0h, "trace", (String) null, AwakeTimeSinceBootClock.INSTANCE.now());
                2Hq.A02(this, A0h);
                A06();
                if (A0M(A0h)) {
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
                    2Hq.A01(this, A0h);
                    lightweightQuickPerformanceLogger.markerEndForUserFlow(A0h.A05.A00, A0h.A04, 2);
                } else {
                    2Hq.A05(A0h, "succeed", "marker is not active");
                }
            }
        }
        2Hm r0 = this.A00;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69240Nhu(2Hm r21, 2Hj r22, Map map, int i) {
        super(C51965G9l.A0l(), map);
        2Hv r5 = 2Hv.A02;
        2Hw r3 = new 2Hw(r22, r5, AnonymousClass7TE.A1H(), i, true, true, false, false);
        this.A01 = r3;
        this.A00 = r21;
        2Hv r13 = 2Hv.A03;
        this.A02 = DbY.A0p(r5, r3, AnonymousClass7TE.A1L(r13, new 2Hw(FOAMessagingLocalSendSpeedLogger.FOA_MARKER, r13, AnonymousClass7TE.A1H(), r3.A04, true, true, false, false)));
    }

    public final void annotateEphemeralLifetimeMs(Long l) {
        if (l != null) {
            A0E(this.A01, "ephemeral_lifetime_ms", l.longValue() * 1000);
        }
    }

    public final void annotateIsBundledWithMediaSend(boolean z) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0L(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.IS_BUNDLE_WITH_MEDIA_SEND.getAnnotation(), z);
        }
    }

    public final void annotateIsDm(boolean z) {
        A0L(this.A01, "is_dm", z);
    }

    public final void annotateIsEncrypted(boolean z) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0L(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.IS_ENCRYPTED.getAnnotation(), z);
        }
    }

    public final void annotateIsGroup(boolean z) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0L(C66582MXn.A0h(A0u), LocalSendSpeedAnnotations.IS_GROUP.getAnnotation(), z);
        }
    }

    public final void annotateIsInstamadillo(boolean z) {
        A0L(this.A01, "is_instamadillo", z);
    }

    public final void annotateIsLink(boolean z) {
        A0L(this.A01, "is_link", z);
    }

    public final void annotateIsMsys(boolean z) {
        A0L(this.A01, "is_msys", z);
    }

    public final void annotateIsReply(boolean z) {
        A0L(this.A01, "is_reply", z);
    }

    public final void annotateIsVm(boolean z) {
        A0L(this.A01, "is_vm", z);
    }

    public final void annotateMediaDurationMs(int i) {
        A0D(this.A01, "media_duration_ms", i);
    }

    public final void annotateMediaPreviewEnabled(boolean z) {
        A0L(this.A01, "is_media_preview", z);
    }

    public final void annotateMsysThreadId(long j) {
        A0E(this.A01, "msys_thread_id", j);
    }

    public final void annotateNumPendingThreadRowUpdateTasks(int i) {
        A0D(this.A01, "num_pending_thread_row_update_tasks", i);
    }

    public final void annotateNumSendMutationsCreated(int i) {
        A0D(this.A01, "num_send_mutations_created", i);
    }

    public final void annotateNumViewModelsToGenerate(int i) {
        A0D(this.A01, "num_view_models_to_generate", i);
    }

    public final void annotateOccamadilloThreadId(Long l) {
        if (l != null) {
            A0E(this.A01, "occamadillo_thread_id", l.longValue());
        }
    }

    public final void annotateOpenThreadId(String str) {
        A0H(this.A01, "open_thread_id", str);
    }

    public final void annotateReactToType(String str) {
        A0H(this.A01, "react_to_type", str);
    }

    public final void annotateSendGroupSize(int i) {
        A0D(this.A01, "send_group_size", i);
    }

    public final Integer getInstanceKey() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        if (A0u.hasNext()) {
            return Integer.valueOf(C66582MXn.A0h(A0u).A04);
        }
        return null;
    }

    public final Long getStartTimestamp() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        if (A0u.hasNext()) {
            return C66582MXn.A0h(A0u).A00;
        }
        return null;
    }

    public final boolean isMarkerOn() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        if (A0u.hasNext()) {
            return A0M(C66582MXn.A0h(A0u));
        }
        return false;
    }

    public final void onAppBackgrounded() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            2Hw A0h = C66582MXn.A0h(A0u);
            if (A0h.A07) {
                A07(A0h);
                2Hm r0 = this.A00;
                if (r0 != null) {
                    r0.onLoggerEnded(this);
                }
                this.A00 = null;
            }
        }
    }

    public final void onEndFlowCancel(String str) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A09(C66582MXn.A0h(A0u), str);
        }
        2Hm r0 = this.A00;
        if (r0 != null) {
            r0.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    public final void onLogClickEnd() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            2Hw A0h = C66582MXn.A0h(A0u);
            0qQ.A0B(A0h, 0);
            A0I(A0h, "click", (String) null);
        }
    }

    public final void onLogCreateLocalThreadEnd() {
        A0I(this.A01, "create_local_thread", (String) null);
    }

    public final void onLogCreateLocalThreadStart() {
        A0B(this.A01, "create_local_thread");
    }

    public final void onLogCreateSendMutationEnd() {
        A0I(this.A01, "create_send_mutation", (String) null);
    }

    public final void onLogCreateSendMutationStart() {
        A0B(this.A01, "create_send_mutation");
    }

    public final void onLogCreateViewModelAndUpdateRecyclerViewEnd() {
        A0I(this.A01, "create_view_model_and_update_recycler_view", (String) null);
    }

    public final void onLogCreateViewModelAndUpdateRecyclerViewStart() {
        A0B(this.A01, "create_view_model_and_update_recycler_view");
    }

    public final void onLogDataProcessingEnd() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0I(C66582MXn.A0i(A0u), "data_processing", (String) null);
        }
    }

    public final void onLogDataProcessingStart() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0B(C66582MXn.A0i(A0u), "data_processing");
        }
    }

    public final void onLogDispatchSendMutationEnd() {
        A0I(this.A01, "dispatch_send_mutation", (String) null);
    }

    public final void onLogDispatchSendMutationStart() {
        A0B(this.A01, "dispatch_send_mutation");
    }

    public final void onLogFetchMessageHistoryFromServerEnd() {
        A0I(this.A01, "fetch_message_history_from_server", (String) null);
    }

    public final void onLogFetchMessageHistoryFromServerStart() {
        A0B(this.A01, "fetch_message_history_from_server");
    }

    public final void onLogFinishThreadRowUpdateTask() {
        A0G(this.A01, "finish_thread_row_update_task", (String) null);
    }

    public final void onLogGenerateMessageListViewModelsEnd() {
        A0I(this.A01, "generate_message_list_view_models", (String) null);
    }

    public final void onLogGenerateMessageListViewModelsStart() {
        A0B(this.A01, "generate_message_list_view_models");
    }

    public final void onLogGenerateMessageRowDataEnd() {
        A0I(this.A01, "generate_message_row_data", (String) null);
    }

    public final void onLogGenerateMessageRowDataStart() {
        A0B(this.A01, "generate_message_row_data");
    }

    public final void onLogMessageAddedToMemory(boolean z) {
        2Hw r2 = this.A01;
        if (z) {
            A0G(r2, "message_added_to_memory", (String) null);
            return;
        }
        A0G(r2, "message_add_to_memory_failed", (String) null);
        onEndFlowFail("Message already exists in memory");
    }

    public final void onLogPostThreadUpdateEventEnd() {
        A0I(this.A01, "post_thread_update_event", (String) null);
    }

    public final void onLogPostThreadUpdateEventStart() {
        A0B(this.A01, "post_thread_update_event");
    }

    public final void onLogReceiverFetchEnd() {
        A0I(this.A01, "receiver_fetch", (String) null);
    }

    public final void onLogReceiverFetchStart() {
        A0B(this.A01, "receiver_fetch");
    }

    public final void onLogRenderEnd() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0I(C66582MXn.A0i(A0u), "render", (String) null);
        }
    }

    public final void onLogRenderStart() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0B(C66582MXn.A0i(A0u), "render");
        }
    }

    public final void onLogRenderWillDisplay() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            A0G(C66582MXn.A0i(A0u), "render_will_display", (String) null);
        }
    }

    public final void onLogScheduleThreadRowUpdateTaskEnd() {
        A0I(this.A01, "schedule_thread_row_update_task", (String) null);
    }

    public final void onLogScheduleThreadRowUpdateTaskStart() {
        A0B(this.A01, "schedule_thread_row_update_task");
    }

    public final void onLogSendServiceEnd() {
        A0I(this.A01, "send_service", (String) null);
    }

    public final void onLogSendServiceStart() {
        A0B(this.A01, "send_service");
    }

    public final void onLogShowOptimisticMessageEnd() {
        A0I(this.A01, "show_optimistic_message", (String) null);
    }

    public final void onLogShowOptimisticMessageStart() {
        A0B(this.A01, "show_optimistic_message");
    }

    public final void onLogTransportMessageEnd() {
        A0I(this.A01, "transport_message", (String) null);
    }

    public final void onLogTransportMessageStart() {
        A0B(this.A01, "transport_message");
    }

    public final void onLogUpdateLocalThreadIdEnd() {
        A0I(this.A01, "update_local_thread_id", (String) null);
    }

    public final void onLogUpdateLocalThreadIdStart() {
        A0B(this.A01, "update_local_thread_id");
    }

    public final void onLogUpdateThreadRowDataListEnd() {
        A0I(this.A01, "update_thread_row_data_list", (String) null);
    }

    public final void onLogUpdateThreadRowDataListStart() {
        A0B(this.A01, "update_thread_row_data_list");
    }

    public final void onStartFlow(boolean z) {
        long j;
        2Hm r0 = this.A00;
        if (r0 != null && r0.onLoggerStarted(this)) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A02);
            while (A0u.hasNext()) {
                2Hw A0i = C66582MXn.A0i(A0u);
                synchronized (this) {
                    0qQ.A0B(A0i, 0);
                    long now = AwakeTimeSinceBootClock.INSTANCE.now();
                    if (!A0M(A0i)) {
                        2Hy r4 = 2Hy.A04;
                        long A002 = 2Hy.A00(r4, r4.A01.now());
                        long j2 = A002;
                        long j3 = now;
                        if (A0i.A06 && 1 <= A002 && A002 < now) {
                            if (A002 > now) {
                                A002 = now;
                            }
                            j3 = A002;
                        }
                        Long l = A0i.A00;
                        if (l != null) {
                            long longValue = l.longValue();
                            if (longValue < j3 && j3 - longValue <= 3000) {
                                j3 = longValue;
                            }
                        }
                        Long valueOf = Long.valueOf(j3);
                        A0i.A00 = valueOf;
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
                        int i = A0i.A05.A00;
                        int i2 = A0i.A04;
                        boolean z2 = A0i.A07;
                        if (valueOf != null) {
                            j = valueOf.longValue();
                        } else {
                            j = now;
                        }
                        lightweightQuickPerformanceLogger.markerStartForUserFlow(i, i2, (String) null, z2, -1, j, TimeUnit.MILLISECONDS);
                        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(i, i2);
                        withMarker.setSurviveUserSwitch(A0i.A03);
                        withMarker.markerEditingCompleted();
                        2Hq.A03(this, A0i, j2, now);
                        if (A0i.A02) {
                            ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerStartNative(i, i2, (String) null);
                        }
                    } else {
                        2Hq.A05(A0i, "start", "marker is active");
                    }
                }
            }
            annotateIsGroup(z);
        }
    }
}
