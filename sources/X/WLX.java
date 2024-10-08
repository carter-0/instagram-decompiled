package X;

public final class WLX implements C20891X2x {
    public final VU9 A00;

    public final /* bridge */ /* synthetic */ void CtB(C20888X2s x2s, Object obj) {
        String str;
        V33 v33 = (V33) obj;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00.A01, "zero_sdk_dispatched_event");
        if (A0e.isSampled()) {
            if (v33 instanceof UVS) {
                str = "ZbdTriggerAction";
            } else if (v33 instanceof UVL) {
                str = "ZbdStateClearingAction";
            } else if (v33 instanceof UVU) {
                str = "ZbdResultAction";
            } else if (v33 instanceof UVK) {
                str = "ZbdConfigFetchAction";
            } else if (v33 instanceof UVT) {
                str = "ZbdTimeoutTriggerAction";
            } else if (v33 instanceof UVR) {
                str = "ZbdStatePersistAction";
            } else if (v33 instanceof UVX) {
                str = "SetTokenWithoutRefreshAction";
            } else if (v33 instanceof UVQ) {
                str = "RemoveScheduledAction";
            } else if (v33 instanceof UVJ) {
                str = "OnNewsFeedRefreshAction";
            } else if (v33 instanceof UVI) {
                str = "OnNewsFeedPaginationAction";
            } else if (v33 instanceof UVH) {
                str = "OnAppForegroundedAction";
            } else if (v33 instanceof UVW) {
                str = "MarkLoggingFlowCompleteAction";
            } else if (v33 instanceof UVV) {
                str = "MarkFlowPointAction";
            } else if (v33 instanceof UVG) {
                str = "ExternalTimerPingAction";
            } else if (v33 instanceof UVZ) {
                str = "LogCSSinglePingEventAction";
            } else if (v33 instanceof UVY) {
                str = "LogCSRunEventAction";
            } else if (v33 instanceof UVO) {
                str = "CSPingAction";
            } else if (v33 instanceof UVN) {
                str = "CSPersistStateAction";
            } else if (v33 instanceof UVM) {
                str = "CSInternalSetPeriodicPingActiveAction";
            } else if (v33 instanceof UVF) {
                str = "CSInitAction";
            } else if (v33 instanceof UW2) {
                str = "ZbdTimeoutHTTPResponseAction";
            } else if (v33 instanceof UW0) {
                str = "ZbdRedirectHTTPResponseAction";
            } else if (v33 instanceof C15222UVz) {
                str = "ZbdConfigResponseAction";
            } else if (v33 instanceof C15220UVx) {
                str = "TimedResponseAction";
            } else if (v33 instanceof C15221UVy) {
                str = "StartLoggingFlowResponseAction";
            } else if (v33 instanceof C15219UVw) {
                str = "MicroTimerResponseAction";
            } else if (v33 instanceof UW3) {
                str = "CSHTTPResponseAction";
            } else if (v33 instanceof UW1) {
                str = "CSConfigResponseAction";
            } else if (v33 instanceof C15217UVu) {
                str = "ZbdTimeoutHTTPRequestAction";
            } else if (v33 instanceof C15216UVt) {
                str = "ZbdRedirectHTTPRequestAction";
            } else if (v33 instanceof C15213UVq) {
                str = "ZbdConfigRequestAction";
            } else if (v33 instanceof C15215UVs) {
                str = "TimedRequestAction";
            } else if (v33 instanceof C15212UVp) {
                str = "StartLoggingFlowRequestAction";
            } else if (v33 instanceof C15214UVr) {
                str = "MicroTimerRequestAction";
            } else if (v33 instanceof C15218UVv) {
                str = "CSHTTPRequestAction";
            } else {
                str = "CSConfigRequestAction";
            }
            A0e.AAJ(C273654mx.A00(37), str);
            A0e.A9F("dispatch_time", Long.valueOf(v33.A00));
            A0e.Cgf();
        }
    }

    public WLX(VU9 vu9) {
        this.A00 = vu9;
    }
}
