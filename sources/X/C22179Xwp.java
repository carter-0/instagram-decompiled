package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.transport.gen.SignalingTransportSink;
import com.facebook.rsys.transport.gen.StatusUpdate;
import com.facebook.rsys.tslog.gen.TslogCounterApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.facebook.rsys.video.gen.MediaProcessor;
import com.facebook.rsys.video.gen.ProcessedFrameCallbacks;
import com.facebook.rsys.videoeffectcommunication.gen.GetGroupEffectConfirmationCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.PeerConsentVideoEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationAdditionalEffectInfo;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationCallLayoutRemovingState;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationGroupEffectSharingState;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationModel;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationMultipeerMessage;
import com.facebook.rsys.videorender.gen.VideoRenderFrameCallback;
import com.facebook.rsys.videorender.gen.VideoRenderItem;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.rsys.models.DismissNotification;
import com.instagram.rtc.rsys.models.IGMediaStats;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Xwp  reason: case insensitive filesystem */
public final class C22179Xwp implements 2LV {
    public final int A00;

    public C22179Xwp(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return SignalingMessage.createFromMcfType(mcfReference);
            case 1:
                return SignalingMessageIncomingStats.createFromMcfType(mcfReference);
            case 2:
                return SignalingTransportCallbackExt.CProxy.createFromMcfType(mcfReference);
            case 3:
                return SignalingTransportProxy.CProxy.createFromMcfType(mcfReference);
            case 4:
                return SignalingTransportSink.CProxy.createFromMcfType(mcfReference);
            case 5:
                return StatusUpdate.createFromMcfType(mcfReference);
            case 6:
                return TslogCounterApi.CProxy.createFromMcfType(mcfReference);
            case 7:
                return TslogStreamApi.CProxy.createFromMcfType(mcfReference);
            case 8:
                return MediaProcessor.CProxy.createFromMcfType(mcfReference);
            case 9:
                return ProcessedFrameCallbacks.CProxy.createFromMcfType(mcfReference);
            case 10:
                return GetGroupEffectConfirmationCompletion.CProxy.createFromMcfType(mcfReference);
            case 11:
                return GroupEffectConfirmationPromptCompletion.CProxy.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return PeerConsentVideoEffectAlertCompletion.CProxy.createFromMcfType(mcfReference);
            case 13:
                return UnapprovedEffectAlertCompletion.CProxy.createFromMcfType(mcfReference);
            case 14:
                return VideoEffectCommunicationAdditionalEffectInfo.createFromMcfType(mcfReference);
            case 15:
                return VideoEffectCommunicationCallLayoutRemovingState.createFromMcfType(mcfReference);
            case 16:
                return VideoEffectCommunicationGroupEffectSharingState.createFromMcfType(mcfReference);
            case 17:
                return VideoEffectCommunicationModel.createFromMcfType(mcfReference);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return VideoEffectCommunicationMultipeerMessage.createFromMcfType(mcfReference);
            case 19:
                return VideoRenderFrameCallback.CProxy.createFromMcfType(mcfReference);
            case 20:
                return VideoRenderItem.createFromMcfType(mcfReference);
            case 21:
                return VideoRenderSurface.CProxy.createFromMcfType(mcfReference);
            case 22:
                return VideoSubscriptions.createFromMcfType(mcfReference);
            case 23:
                return VideoSubscriptionsModel.createFromMcfType(mcfReference);
            case 24:
                return DismissNotification.createFromMcfType(mcfReference);
            default:
                return IGMediaStats.createFromMcfType(mcfReference);
        }
    }

    public final Class BTf() {
        switch (this.A00) {
            case 0:
                return SignalingMessage.class;
            case 1:
                return SignalingMessageIncomingStats.class;
            case 2:
                return SignalingTransportCallbackExt.class;
            case 3:
                return SignalingTransportProxy.class;
            case 4:
                return SignalingTransportSink.class;
            case 5:
                return StatusUpdate.class;
            case 6:
                return TslogCounterApi.class;
            case 7:
                return TslogStreamApi.class;
            case 8:
                return MediaProcessor.class;
            case 9:
                return ProcessedFrameCallbacks.class;
            case 10:
                return GetGroupEffectConfirmationCompletion.class;
            case 11:
                return GroupEffectConfirmationPromptCompletion.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return PeerConsentVideoEffectAlertCompletion.class;
            case 13:
                return UnapprovedEffectAlertCompletion.class;
            case 14:
                return VideoEffectCommunicationAdditionalEffectInfo.class;
            case 15:
                return VideoEffectCommunicationCallLayoutRemovingState.class;
            case 16:
                return VideoEffectCommunicationGroupEffectSharingState.class;
            case 17:
                return VideoEffectCommunicationModel.class;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return VideoEffectCommunicationMultipeerMessage.class;
            case 19:
                return VideoRenderFrameCallback.class;
            case 20:
                return VideoRenderItem.class;
            case 21:
                return VideoRenderSurface.class;
            case 22:
                return VideoSubscriptions.class;
            case 23:
                return VideoSubscriptionsModel.class;
            case 24:
                return DismissNotification.class;
            default:
                return IGMediaStats.class;
        }
    }

    public final long CAr() {
        switch (this.A00) {
            case 0:
                long j = SignalingMessage.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = SignalingMessage.nativeGetMcfTypeId();
                SignalingMessage.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = SignalingMessageIncomingStats.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = SignalingMessageIncomingStats.nativeGetMcfTypeId();
                SignalingMessageIncomingStats.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = SignalingTransportCallbackExt.CProxy.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = SignalingTransportCallbackExt.CProxy.nativeGetMcfTypeId();
                SignalingTransportCallbackExt.CProxy.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = SignalingTransportProxy.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = SignalingTransportProxy.CProxy.nativeGetMcfTypeId();
                SignalingTransportProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = SignalingTransportSink.CProxy.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = SignalingTransportSink.CProxy.nativeGetMcfTypeId();
                SignalingTransportSink.CProxy.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = StatusUpdate.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = StatusUpdate.nativeGetMcfTypeId();
                StatusUpdate.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = TslogCounterApi.CProxy.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = TslogCounterApi.CProxy.nativeGetMcfTypeId();
                TslogCounterApi.CProxy.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = TslogStreamApi.CProxy.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = TslogStreamApi.CProxy.nativeGetMcfTypeId();
                TslogStreamApi.CProxy.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = MediaProcessor.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = MediaProcessor.CProxy.nativeGetMcfTypeId();
                MediaProcessor.CProxy.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = ProcessedFrameCallbacks.CProxy.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = ProcessedFrameCallbacks.CProxy.nativeGetMcfTypeId();
                ProcessedFrameCallbacks.CProxy.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = GetGroupEffectConfirmationCompletion.CProxy.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = GetGroupEffectConfirmationCompletion.CProxy.nativeGetMcfTypeId();
                GetGroupEffectConfirmationCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = GroupEffectConfirmationPromptCompletion.CProxy.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = GroupEffectConfirmationPromptCompletion.CProxy.nativeGetMcfTypeId();
                GroupEffectConfirmationPromptCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                long j13 = PeerConsentVideoEffectAlertCompletion.CProxy.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = PeerConsentVideoEffectAlertCompletion.CProxy.nativeGetMcfTypeId();
                PeerConsentVideoEffectAlertCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case 13:
                long j14 = UnapprovedEffectAlertCompletion.CProxy.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = UnapprovedEffectAlertCompletion.CProxy.nativeGetMcfTypeId();
                UnapprovedEffectAlertCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = VideoEffectCommunicationAdditionalEffectInfo.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = VideoEffectCommunicationAdditionalEffectInfo.nativeGetMcfTypeId();
                VideoEffectCommunicationAdditionalEffectInfo.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case 15:
                long j16 = VideoEffectCommunicationCallLayoutRemovingState.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = VideoEffectCommunicationCallLayoutRemovingState.nativeGetMcfTypeId();
                VideoEffectCommunicationCallLayoutRemovingState.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = VideoEffectCommunicationGroupEffectSharingState.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = VideoEffectCommunicationGroupEffectSharingState.nativeGetMcfTypeId();
                VideoEffectCommunicationGroupEffectSharingState.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            case 17:
                long j18 = VideoEffectCommunicationModel.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long nativeGetMcfTypeId18 = VideoEffectCommunicationModel.nativeGetMcfTypeId();
                VideoEffectCommunicationModel.sMcfTypeId = nativeGetMcfTypeId18;
                return nativeGetMcfTypeId18;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                long j19 = VideoEffectCommunicationMultipeerMessage.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long nativeGetMcfTypeId19 = VideoEffectCommunicationMultipeerMessage.nativeGetMcfTypeId();
                VideoEffectCommunicationMultipeerMessage.sMcfTypeId = nativeGetMcfTypeId19;
                return nativeGetMcfTypeId19;
            case 19:
                long j20 = VideoRenderFrameCallback.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long nativeGetMcfTypeId20 = VideoRenderFrameCallback.CProxy.nativeGetMcfTypeId();
                VideoRenderFrameCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId20;
                return nativeGetMcfTypeId20;
            case 20:
                long j21 = VideoRenderItem.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long nativeGetMcfTypeId21 = VideoRenderItem.nativeGetMcfTypeId();
                VideoRenderItem.sMcfTypeId = nativeGetMcfTypeId21;
                return nativeGetMcfTypeId21;
            case 21:
                long j22 = VideoRenderSurface.CProxy.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long nativeGetMcfTypeId22 = VideoRenderSurface.CProxy.nativeGetMcfTypeId();
                VideoRenderSurface.CProxy.sMcfTypeId = nativeGetMcfTypeId22;
                return nativeGetMcfTypeId22;
            case 22:
                long j23 = VideoSubscriptions.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long nativeGetMcfTypeId23 = VideoSubscriptions.nativeGetMcfTypeId();
                VideoSubscriptions.sMcfTypeId = nativeGetMcfTypeId23;
                return nativeGetMcfTypeId23;
            case 23:
                long j24 = VideoSubscriptionsModel.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long nativeGetMcfTypeId24 = VideoSubscriptionsModel.nativeGetMcfTypeId();
                VideoSubscriptionsModel.sMcfTypeId = nativeGetMcfTypeId24;
                return nativeGetMcfTypeId24;
            case 24:
                long j25 = DismissNotification.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long nativeGetMcfTypeId25 = DismissNotification.nativeGetMcfTypeId();
                DismissNotification.sMcfTypeId = nativeGetMcfTypeId25;
                return nativeGetMcfTypeId25;
            default:
                long j26 = IGMediaStats.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long nativeGetMcfTypeId26 = IGMediaStats.nativeGetMcfTypeId();
                IGMediaStats.sMcfTypeId = nativeGetMcfTypeId26;
                return nativeGetMcfTypeId26;
        }
    }
}
