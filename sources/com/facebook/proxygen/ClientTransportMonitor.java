package com.facebook.proxygen;

import com.facebook.traffic.ctm.api.CumulativeConnectionStats;
import com.facebook.traffic.ctm.api.IClientTransportMonitor;
import com.facebook.traffic.ctm.api.RetinaStats;
import com.facebook.traffic.ctm.api.RsysCallStatus;
import com.facebook.traffic.ctm.api.RsysThrottlingOptions;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.traffic.retina.config.RetinaConfig;

public class ClientTransportMonitor extends NativeHandleImpl implements IClientTransportMonitor {
    public EventBase mEventBase;

    public native void enable(boolean z);

    public native void enableInbandTelemetryProcessing(boolean z);

    public native void enableRetina(boolean z);

    public native void enableRsysBackgroundConnThrottling(boolean z);

    public native void enableRsysBackgroundConnThrottlingTimeout(boolean z);

    public native CumulativeConnectionStats getCumulativeConnectionStatsNative();

    public native InbandTelemetryBweEstimate getInbandTelemetryBweEstimateNative(String str, String str2);

    public native void onRsysCallCompleted(RetinaStats retinaStats);

    public native void setEventBaseNative(EventBase eventBase);

    public native void setRetinaConfig(RetinaConfig retinaConfig);

    public native void setRsysMaxPacingRateKnobParamId(long j);

    public native void setRsysThrottlingHostPrefixFilterList(String str);

    public native void setRsysThrottlingHostPrefixFilterType(String str);

    public native void updateRsysCallStatusNative(RsysCallStatus rsysCallStatus, RsysThrottlingOptions rsysThrottlingOptions);

    public void setEventBase(EventBase eventBase) {
        this.mEventBase = eventBase;
        setEventBaseNative(eventBase);
    }

    public CumulativeConnectionStats getCumulativeConnectionStats() {
        return getCumulativeConnectionStatsNative();
    }

    public InbandTelemetryBweEstimate getInbandTelemetryBweEstimate(String str, String str2) {
        return getInbandTelemetryBweEstimateNative(str, str2);
    }

    public /* synthetic */ boolean hasActiveCall() {
        return false;
    }

    public void updateRsysCallStatus(RsysCallStatus rsysCallStatus, RsysThrottlingOptions rsysThrottlingOptions) {
        updateRsysCallStatusNative(rsysCallStatus, rsysThrottlingOptions);
    }
}
