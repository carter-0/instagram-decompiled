package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rooms.gen.RoomParticipantInfo;
import com.facebook.rsys.roomtypecalling.gen.CallingAppContext;
import com.facebook.rsys.screenshare.gen.PeerScreenShareStates;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.rsys.video.gen.VideoStream;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationParticipant;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.rsys.models.AnalyticsEvent;
import com.instagram.rtc.rsys.models.CallEndedModel;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.HttpRequest;
import com.instagram.rtc.rsys.models.HttpRequestFile;
import com.instagram.rtc.rsys.models.IgCallModel;
import com.instagram.rtc.rsys.models.ParsedMwsBinaryMessage;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.rtc.rsys.models.RingNotification;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Omg  reason: case insensitive filesystem */
public final class C71545Omg implements 2LV {
    public final int A00;

    public C71545Omg(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return RoomParticipantInfo.createFromMcfType(mcfReference);
            case 1:
                return CallingAppContext.createFromMcfType(mcfReference);
            case 2:
                return PeerScreenShareStates.createFromMcfType(mcfReference);
            case 3:
                return ScreenShareApi.CProxy.createFromMcfType(mcfReference);
            case 4:
                return ScreenShareModel.createFromMcfType(mcfReference);
            case 5:
                return State.createFromMcfType(mcfReference);
            case 6:
                return SignalingTransportCallback.CProxy.createFromMcfType(mcfReference);
            case 7:
                return TslogApi.CProxy.createFromMcfType(mcfReference);
            case 8:
                return TslogEngineApi.CProxy.createFromMcfType(mcfReference);
            case 9:
                return TslogProxy.CProxy.createFromMcfType(mcfReference);
            case 10:
                return TurnAllocationCallback.CProxy.createFromMcfType(mcfReference);
            case 11:
                return TurnAllocationProxy.CProxy.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return VideoStream.createFromMcfType(mcfReference);
            case 13:
                return VideoEffectCommunicationParticipant.createFromMcfType(mcfReference);
            case 14:
                return VideoEffectCommunicationSharedEffectInfo.createFromMcfType(mcfReference);
            case 15:
                return VideoRenderApi.CProxy.createFromMcfType(mcfReference);
            case 16:
                return VideoRenderProxy.CProxy.createFromMcfType(mcfReference);
            case 17:
                return VideoSubscriptionsApi.CProxy.createFromMcfType(mcfReference);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return AnalyticsEvent.createFromMcfType(mcfReference);
            case 19:
                return CallEndedModel.createFromMcfType(mcfReference);
            case 20:
                return EngineModel.createFromMcfType(mcfReference);
            case 21:
                return HttpRequest.createFromMcfType(mcfReference);
            case 22:
                return HttpRequestFile.createFromMcfType(mcfReference);
            case 23:
                return IgCallModel.createFromMcfType(mcfReference);
            case 24:
                return ParsedMwsBinaryMessage.createFromMcfType(mcfReference);
            case 25:
                return ParticipantModel.createFromMcfType(mcfReference);
            case 26:
                return RingNotification.createFromMcfType(mcfReference);
            case 27:
                return IGRTCCallManager.CProxy.createFromMcfType(mcfReference);
            case 28:
                return IGRTCSignalingCoordinator.CProxy.createFromMcfType(mcfReference);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return IGRTCSyncedClockHolder.CProxy.createFromMcfType(mcfReference);
            default:
                return SignalingHttpSenderCallback.CProxy.createFromMcfType(mcfReference);
        }
    }

    public final Class BTf() {
        switch (this.A00) {
            case 0:
                return RoomParticipantInfo.class;
            case 1:
                return CallingAppContext.class;
            case 2:
                return PeerScreenShareStates.class;
            case 3:
                return ScreenShareApi.class;
            case 4:
                return ScreenShareModel.class;
            case 5:
                return State.class;
            case 6:
                return SignalingTransportCallback.class;
            case 7:
                return TslogApi.class;
            case 8:
                return TslogEngineApi.class;
            case 9:
                return TslogProxy.class;
            case 10:
                return TurnAllocationCallback.class;
            case 11:
                return TurnAllocationProxy.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return VideoStream.class;
            case 13:
                return VideoEffectCommunicationParticipant.class;
            case 14:
                return VideoEffectCommunicationSharedEffectInfo.class;
            case 15:
                return VideoRenderApi.class;
            case 16:
                return VideoRenderProxy.class;
            case 17:
                return VideoSubscriptionsApi.class;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return AnalyticsEvent.class;
            case 19:
                return CallEndedModel.class;
            case 20:
                return EngineModel.class;
            case 21:
                return HttpRequest.class;
            case 22:
                return HttpRequestFile.class;
            case 23:
                return IgCallModel.class;
            case 24:
                return ParsedMwsBinaryMessage.class;
            case 25:
                return ParticipantModel.class;
            case 26:
                return RingNotification.class;
            case 27:
                return IGRTCCallManager.class;
            case 28:
                return IGRTCSignalingCoordinator.class;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return IGRTCSyncedClockHolder.class;
            default:
                return SignalingHttpSenderCallback.class;
        }
    }

    public final long CAr() {
        switch (this.A00) {
            case 0:
                long j = RoomParticipantInfo.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = RoomParticipantInfo.nativeGetMcfTypeId();
                RoomParticipantInfo.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = CallingAppContext.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = CallingAppContext.nativeGetMcfTypeId();
                CallingAppContext.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = PeerScreenShareStates.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = PeerScreenShareStates.nativeGetMcfTypeId();
                PeerScreenShareStates.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = ScreenShareApi.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = ScreenShareApi.CProxy.nativeGetMcfTypeId();
                ScreenShareApi.CProxy.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = ScreenShareModel.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = ScreenShareModel.nativeGetMcfTypeId();
                ScreenShareModel.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = State.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = State.nativeGetMcfTypeId();
                State.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = SignalingTransportCallback.CProxy.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = SignalingTransportCallback.CProxy.nativeGetMcfTypeId();
                SignalingTransportCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = TslogApi.CProxy.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = TslogApi.CProxy.nativeGetMcfTypeId();
                TslogApi.CProxy.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = TslogEngineApi.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = TslogEngineApi.CProxy.nativeGetMcfTypeId();
                TslogEngineApi.CProxy.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = TslogProxy.CProxy.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = TslogProxy.CProxy.nativeGetMcfTypeId();
                TslogProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = TurnAllocationCallback.CProxy.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = TurnAllocationCallback.CProxy.nativeGetMcfTypeId();
                TurnAllocationCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = TurnAllocationProxy.CProxy.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = TurnAllocationProxy.CProxy.nativeGetMcfTypeId();
                TurnAllocationProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                long j13 = VideoStream.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = VideoStream.nativeGetMcfTypeId();
                VideoStream.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case 13:
                long j14 = VideoEffectCommunicationParticipant.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = VideoEffectCommunicationParticipant.nativeGetMcfTypeId();
                VideoEffectCommunicationParticipant.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = VideoEffectCommunicationSharedEffectInfo.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = VideoEffectCommunicationSharedEffectInfo.nativeGetMcfTypeId();
                VideoEffectCommunicationSharedEffectInfo.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case 15:
                long j16 = VideoRenderApi.CProxy.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = VideoRenderApi.CProxy.nativeGetMcfTypeId();
                VideoRenderApi.CProxy.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = VideoRenderProxy.CProxy.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = VideoRenderProxy.CProxy.nativeGetMcfTypeId();
                VideoRenderProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            case 17:
                long j18 = VideoSubscriptionsApi.CProxy.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long nativeGetMcfTypeId18 = VideoSubscriptionsApi.CProxy.nativeGetMcfTypeId();
                VideoSubscriptionsApi.CProxy.sMcfTypeId = nativeGetMcfTypeId18;
                return nativeGetMcfTypeId18;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                long j19 = AnalyticsEvent.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long nativeGetMcfTypeId19 = AnalyticsEvent.nativeGetMcfTypeId();
                AnalyticsEvent.sMcfTypeId = nativeGetMcfTypeId19;
                return nativeGetMcfTypeId19;
            case 19:
                long j20 = CallEndedModel.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long nativeGetMcfTypeId20 = CallEndedModel.nativeGetMcfTypeId();
                CallEndedModel.sMcfTypeId = nativeGetMcfTypeId20;
                return nativeGetMcfTypeId20;
            case 20:
                long j21 = EngineModel.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long nativeGetMcfTypeId21 = EngineModel.nativeGetMcfTypeId();
                EngineModel.sMcfTypeId = nativeGetMcfTypeId21;
                return nativeGetMcfTypeId21;
            case 21:
                long j22 = HttpRequest.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long nativeGetMcfTypeId22 = HttpRequest.nativeGetMcfTypeId();
                HttpRequest.sMcfTypeId = nativeGetMcfTypeId22;
                return nativeGetMcfTypeId22;
            case 22:
                long j23 = HttpRequestFile.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long nativeGetMcfTypeId23 = HttpRequestFile.nativeGetMcfTypeId();
                HttpRequestFile.sMcfTypeId = nativeGetMcfTypeId23;
                return nativeGetMcfTypeId23;
            case 23:
                long j24 = IgCallModel.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long nativeGetMcfTypeId24 = IgCallModel.nativeGetMcfTypeId();
                IgCallModel.sMcfTypeId = nativeGetMcfTypeId24;
                return nativeGetMcfTypeId24;
            case 24:
                long j25 = ParsedMwsBinaryMessage.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long nativeGetMcfTypeId25 = ParsedMwsBinaryMessage.nativeGetMcfTypeId();
                ParsedMwsBinaryMessage.sMcfTypeId = nativeGetMcfTypeId25;
                return nativeGetMcfTypeId25;
            case 25:
                long j26 = ParticipantModel.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long nativeGetMcfTypeId26 = ParticipantModel.nativeGetMcfTypeId();
                ParticipantModel.sMcfTypeId = nativeGetMcfTypeId26;
                return nativeGetMcfTypeId26;
            case 26:
                long j27 = RingNotification.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long nativeGetMcfTypeId27 = RingNotification.nativeGetMcfTypeId();
                RingNotification.sMcfTypeId = nativeGetMcfTypeId27;
                return nativeGetMcfTypeId27;
            case 27:
                long j28 = IGRTCCallManager.CProxy.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long nativeGetMcfTypeId28 = IGRTCCallManager.CProxy.nativeGetMcfTypeId();
                IGRTCCallManager.CProxy.sMcfTypeId = nativeGetMcfTypeId28;
                return nativeGetMcfTypeId28;
            case 28:
                long j29 = IGRTCSignalingCoordinator.CProxy.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long nativeGetMcfTypeId29 = IGRTCSignalingCoordinator.CProxy.nativeGetMcfTypeId();
                IGRTCSignalingCoordinator.CProxy.sMcfTypeId = nativeGetMcfTypeId29;
                return nativeGetMcfTypeId29;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                long j30 = IGRTCSyncedClockHolder.CProxy.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long nativeGetMcfTypeId30 = IGRTCSyncedClockHolder.CProxy.nativeGetMcfTypeId();
                IGRTCSyncedClockHolder.CProxy.sMcfTypeId = nativeGetMcfTypeId30;
                return nativeGetMcfTypeId30;
            default:
                long j31 = SignalingHttpSenderCallback.CProxy.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long nativeGetMcfTypeId31 = SignalingHttpSenderCallback.CProxy.nativeGetMcfTypeId();
                SignalingHttpSenderCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId31;
                return nativeGetMcfTypeId31;
        }
    }
}
