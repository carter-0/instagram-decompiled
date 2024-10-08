package com.facebook.rsys.callmanager.callclient.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66579MXk;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

public class StartCallCopyIdParams {
    public static 2LV CONVERTER = C22180Xwq.A00(22);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final ArrayList initialDataMessages;
    public final ArrayList initialPeerIds;
    public final int joinMode;
    public final String localCallId;
    public final PregenerateSdp pregeneratedSdpManager;
    public final SetupCallback setupCallback;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList userIDsToRing;

    public class Builder {
        public boolean acceptRemoteVideoEnabled;
        public CallContext callContext;
        public OverlayConfigLayerInterface callLevelOverlayConfigLayer;
        public ArrayList initialDataMessages;
        public ArrayList initialPeerIds;
        public int joinMode;
        public String localCallId;
        public PregenerateSdp pregeneratedSdpManager;
        public SetupCallback setupCallback;
        public boolean startWithVideo;
        public String trigger;
        public ArrayList userIDsToRing;

        public StartCallCopyIdParams build() {
            return new StartCallCopyIdParams(this);
        }
    }

    public static native StartCallCopyIdParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StartCallCopyIdParams)) {
                return false;
            }
            StartCallCopyIdParams startCallCopyIdParams = (StartCallCopyIdParams) obj;
            String str = this.localCallId;
            String str2 = startCallCopyIdParams.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.callContext.equals(startCallCopyIdParams.callContext) || !this.userIDsToRing.equals(startCallCopyIdParams.userIDsToRing) || this.startWithVideo != startCallCopyIdParams.startWithVideo || this.acceptRemoteVideoEnabled != startCallCopyIdParams.acceptRemoteVideoEnabled || !this.trigger.equals(startCallCopyIdParams.trigger)) {
                return false;
            }
            SetupCallback setupCallback2 = this.setupCallback;
            SetupCallback setupCallback3 = startCallCopyIdParams.setupCallback;
            if (setupCallback2 == null) {
                if (setupCallback3 != null) {
                    return false;
                }
            } else if (!setupCallback2.equals(setupCallback3)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = startCallCopyIdParams.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            ArrayList arrayList3 = this.initialPeerIds;
            ArrayList arrayList4 = startCallCopyIdParams.initialPeerIds;
            if (arrayList3 == null) {
                if (arrayList4 != null) {
                    return false;
                }
            } else if (!arrayList3.equals(arrayList4)) {
                return false;
            }
            if (this.joinMode != startCallCopyIdParams.joinMode) {
                return false;
            }
            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
            OverlayConfigLayerInterface overlayConfigLayerInterface2 = startCallCopyIdParams.callLevelOverlayConfigLayer;
            if (overlayConfigLayerInterface == null) {
                if (overlayConfigLayerInterface2 != null) {
                    return false;
                }
            } else if (!overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                return false;
            }
            PregenerateSdp pregenerateSdp = this.pregeneratedSdpManager;
            PregenerateSdp pregenerateSdp2 = startCallCopyIdParams.pregeneratedSdpManager;
            if (pregenerateSdp != null) {
                return pregenerateSdp.equals(pregenerateSdp2);
            }
            if (pregenerateSdp2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.callContext, C66583MXo.A01(AnonymousClass7TG.A0E(this.localCallId)));
        return ((((((((((AnonymousClass7TF.A08(this.trigger, (((AnonymousClass7TF.A07(this.userIDsToRing, A07) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.setupCallback)) * 31) + AnonymousClass7TG.A0C(this.initialDataMessages)) * 31) + AnonymousClass7TG.A0C(this.initialPeerIds)) * 31) + this.joinMode) * 31) + AnonymousClass7TG.A0C(this.callLevelOverlayConfigLayer)) * 31) + AnonymousClass7TE.A0L(this.pregeneratedSdpManager);
    }

    public StartCallCopyIdParams(Builder builder) {
        builder.callContext.getClass();
        builder.userIDsToRing.getClass();
        builder.trigger.getClass();
        this.localCallId = builder.localCallId;
        this.callContext = builder.callContext;
        this.userIDsToRing = builder.userIDsToRing;
        this.startWithVideo = builder.startWithVideo;
        this.acceptRemoteVideoEnabled = builder.acceptRemoteVideoEnabled;
        this.trigger = builder.trigger;
        this.setupCallback = builder.setupCallback;
        this.initialDataMessages = builder.initialDataMessages;
        this.initialPeerIds = builder.initialPeerIds;
        this.joinMode = builder.joinMode;
        this.callLevelOverlayConfigLayer = builder.callLevelOverlayConfigLayer;
        this.pregeneratedSdpManager = builder.pregeneratedSdpManager;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StartCallCopyIdParams{localCallId=");
        A1A.append(this.localCallId);
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
        A1A.append(",setupCallback=");
        A1A.append(this.setupCallback);
        A1A.append(C66579MXk.A00(196));
        A1A.append(this.initialDataMessages);
        A1A.append(",initialPeerIds=");
        A1A.append(this.initialPeerIds);
        A1A.append(",joinMode=");
        A1A.append(this.joinMode);
        A1A.append(",callLevelOverlayConfigLayer=");
        A1A.append(this.callLevelOverlayConfigLayer);
        A1A.append(",pregeneratedSdpManager=");
        return C66582MXn.A0v(this.pregeneratedSdpManager, A1A);
    }
}
