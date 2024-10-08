package com.facebook.rsys.outgoingcallconfig.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66579MXk;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

public class OutgoingCallConfig {
    public static 2LV CONVERTER = C22181Xwr.A00(26);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final String appId;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final boolean forReconnect;
    public final ArrayList initialDataMessages;
    public final boolean isE2eeModeMandated;
    public final int joinMode;
    public final String localCallId;
    public final PregenerateSdp pregeneratedSdpManager;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList userIDsToRing;

    public static native OutgoingCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OutgoingCallConfig)) {
                return false;
            }
            OutgoingCallConfig outgoingCallConfig = (OutgoingCallConfig) obj;
            String str = this.localCallId;
            String str2 = outgoingCallConfig.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.appId.equals(outgoingCallConfig.appId) || !this.callContext.equals(outgoingCallConfig.callContext) || !this.userIDsToRing.equals(outgoingCallConfig.userIDsToRing) || this.startWithVideo != outgoingCallConfig.startWithVideo || this.acceptRemoteVideoEnabled != outgoingCallConfig.acceptRemoteVideoEnabled || !this.trigger.equals(outgoingCallConfig.trigger)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = outgoingCallConfig.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.isE2eeModeMandated != outgoingCallConfig.isE2eeModeMandated || this.forReconnect != outgoingCallConfig.forReconnect || this.joinMode != outgoingCallConfig.joinMode) {
                return false;
            }
            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
            OverlayConfigLayerInterface overlayConfigLayerInterface2 = outgoingCallConfig.callLevelOverlayConfigLayer;
            if (overlayConfigLayerInterface == null) {
                if (overlayConfigLayerInterface2 != null) {
                    return false;
                }
            } else if (!overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                return false;
            }
            PregenerateSdp pregenerateSdp = this.pregeneratedSdpManager;
            PregenerateSdp pregenerateSdp2 = outgoingCallConfig.pregeneratedSdpManager;
            if (pregenerateSdp != null) {
                return pregenerateSdp.equals(pregenerateSdp2);
            }
            if (pregenerateSdp2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.callContext, AnonymousClass7TF.A08(this.appId, C66583MXo.A01(AnonymousClass7TG.A0E(this.localCallId))));
        return ((((((((((AnonymousClass7TF.A08(this.trigger, (((AnonymousClass7TF.A07(this.userIDsToRing, A07) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.initialDataMessages)) * 31) + (this.isE2eeModeMandated ? 1 : 0)) * 31) + (this.forReconnect ? 1 : 0)) * 31) + this.joinMode) * 31) + AnonymousClass7TG.A0C(this.callLevelOverlayConfigLayer)) * 31) + AnonymousClass7TE.A0L(this.pregeneratedSdpManager);
    }

    public OutgoingCallConfig(String str, String str2, CallContext callContext2, ArrayList arrayList, boolean z, boolean z2, String str3, ArrayList arrayList2, boolean z3, boolean z4, int i, OverlayConfigLayerInterface overlayConfigLayerInterface, PregenerateSdp pregenerateSdp) {
        C66581MXm.A1R(str2, callContext2, arrayList);
        str3.getClass();
        this.localCallId = str;
        this.appId = str2;
        this.callContext = callContext2;
        this.userIDsToRing = arrayList;
        this.startWithVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.trigger = str3;
        this.initialDataMessages = arrayList2;
        this.isE2eeModeMandated = z3;
        this.forReconnect = z4;
        this.joinMode = i;
        this.callLevelOverlayConfigLayer = overlayConfigLayerInterface;
        this.pregeneratedSdpManager = pregenerateSdp;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OutgoingCallConfig{localCallId=");
        A1A.append(this.localCallId);
        A1A.append(",appId=");
        A1A.append(this.appId);
        A1A.append(",callContext=");
        A1A.append(this.callContext);
        A1A.append(",userIDsToRing=");
        A1A.append(this.userIDsToRing);
        A1A.append(",startWithVideo=");
        A1A.append(this.startWithVideo);
        A1A.append(C66579MXk.A00(194));
        A1A.append(this.acceptRemoteVideoEnabled);
        A1A.append(",trigger=");
        A1A.append(this.trigger);
        A1A.append(C66579MXk.A00(196));
        A1A.append(this.initialDataMessages);
        A1A.append(",isE2eeModeMandated=");
        A1A.append(this.isE2eeModeMandated);
        A1A.append(",forReconnect=");
        A1A.append(this.forReconnect);
        A1A.append(",joinMode=");
        A1A.append(this.joinMode);
        A1A.append(",callLevelOverlayConfigLayer=");
        A1A.append(this.callLevelOverlayConfigLayer);
        A1A.append(",pregeneratedSdpManager=");
        return C66582MXn.A0v(this.pregeneratedSdpManager, A1A);
    }
}
