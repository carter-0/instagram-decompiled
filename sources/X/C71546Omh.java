package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioModel;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.audio.gen.AudioSource;
import com.facebook.rsys.audio.gen.AudioSourceSink;
import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.facebook.rsys.audioevents.gen.AudioEventsModel;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import com.facebook.rsys.callinfo.gen.UserProfile;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient;
import com.facebook.rsys.callmanager.gen.ApiBag;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.calltag.gen.CallTagApi;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraModel;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.cowatch.gen.CowatchCaptionLocale;
import com.facebook.rsys.crypto.gen.CryptoApi;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rsys.crypto.gen.CryptoParticipantIdentity;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.crypto.gen.ParticipantIdentityInfo;
import com.facebook.rsys.devicestats.gen.DeviceStatsApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.dominantspeaker.gen.DominantSpeakerModel;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.facebook.rsys.hdvideo.gen.HdVideoProxy;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.mediastats.gen.VideoStreamStats;
import com.facebook.rsys.mediasync.gen.ActionMetadata;
import com.facebook.rsys.mediasync.gen.AudioAttribution;
import com.facebook.rsys.mediasync.gen.CaptionLocales;
import com.facebook.rsys.mediasync.gen.FacebookVideoContent;
import com.facebook.rsys.mediasync.gen.Fallback;
import com.facebook.rsys.mediasync.gen.InitialMediaSyncInfo;
import com.facebook.rsys.mediasync.gen.InstagramContent;
import com.facebook.rsys.mediasync.gen.InstagramContentOwner;
import com.facebook.rsys.mediasync.gen.MediaSyncApi;
import com.facebook.rsys.mediasync.gen.MediaSyncContent;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.facebook.rsys.mediasync.gen.Placeholder;
import com.facebook.rsys.mediasync.gen.SizedUrl;
import com.facebook.rsys.mediasync.gen.Video;
import com.facebook.rsys.moderator.gen.ModeratorActionInfo;
import com.facebook.rsys.moderator.gen.ModeratorParticipantCapabilityInfo;
import com.facebook.rsys.moderator.gen.ModeratorSoftMuteModel;
import com.facebook.rsys.mosaicgrid.gen.FrameSize;
import com.facebook.rsys.mosaicgrid.gen.GridParticipantMediaInfo;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridApi;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridModel;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridParams;
import com.facebook.rsys.photobooth.gen.PhotoboothApi;
import com.facebook.rsys.photobooth.gen.PhotoboothModel;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Omh  reason: case insensitive filesystem */
public final class C71546Omh implements 2LV {
    public final int A00;

    public C71546Omh(int i) {
        this.A00 = i;
    }

    public static C71546Omh A00(int i) {
        return new C71546Omh(i);
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return AudioApi.CProxy.createFromMcfType(mcfReference);
            case 1:
                return AudioFrame.CProxy.createFromMcfType(mcfReference);
            case 2:
                return AudioInputRoute.createFromMcfType(mcfReference);
            case 3:
                return AudioModel.createFromMcfType(mcfReference);
            case 4:
                return AudioOutputRoute.createFromMcfType(mcfReference);
            case 5:
                return AudioProxy.CProxy.createFromMcfType(mcfReference);
            case 6:
                return AudioSource.CProxy.createFromMcfType(mcfReference);
            case 7:
                return AudioSourceSink.CProxy.createFromMcfType(mcfReference);
            case 8:
                return AudioStream.createFromMcfType(mcfReference);
            case 9:
                return EnableAudioParameters.createFromMcfType(mcfReference);
            case 10:
                return AudioEventsModel.createFromMcfType(mcfReference);
            case 11:
                return AudioModule.CProxy.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return CallModel.createFromMcfType(mcfReference);
            case 13:
                return CallParticipant.createFromMcfType(mcfReference);
            case 14:
                return ParticipantMediaState.createFromMcfType(mcfReference);
            case 15:
                return UserProfile.createFromMcfType(mcfReference);
            case 16:
                return CallEndedApi.CProxy.createFromMcfType(mcfReference);
            case 17:
                return CallManagerCallClient.CProxy.createFromMcfType(mcfReference);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ApiBag.createFromMcfType(mcfReference);
            case 19:
                return Call.CProxy.createFromMcfType(mcfReference);
            case 20:
                return CallApi.CProxy.createFromMcfType(mcfReference);
            case 21:
                return UserContext.createFromMcfType(mcfReference);
            case 22:
                return CallTagApi.CProxy.createFromMcfType(mcfReference);
            case 23:
                return Camera.createFromMcfType(mcfReference);
            case 24:
                return CameraApi.CProxy.createFromMcfType(mcfReference);
            case 25:
                return CameraModel.createFromMcfType(mcfReference);
            case 26:
                return CameraProxy.CProxy.createFromMcfType(mcfReference);
            case 27:
                return CowatchCaptionLocale.createFromMcfType(mcfReference);
            case 28:
                return CryptoApi.CProxy.createFromMcfType(mcfReference);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return CryptoE2eeModel.createFromMcfType(mcfReference);
            case 30:
                return CryptoParticipantIdentity.createFromMcfType(mcfReference);
            case 31:
                return CryptoProxy.CProxy.createFromMcfType(mcfReference);
            case 32:
                return ParticipantIdentityInfo.createFromMcfType(mcfReference);
            case 33:
                return DeviceStatsApi.CProxy.createFromMcfType(mcfReference);
            case 34:
                return DevXAgentCallApi.CProxy.createFromMcfType(mcfReference);
            case 35:
                return DevXAgentCallConfig.createFromMcfType(mcfReference);
            case 36:
                return DominantSpeakerModel.createFromMcfType(mcfReference);
            case 37:
                return EndedModel.createFromMcfType(mcfReference);
            case 38:
                return ExternalCallDelegate.CProxy.createFromMcfType(mcfReference);
            case 39:
                return GroupExpansionProxy.CProxy.createFromMcfType(mcfReference);
            case 40:
                return HdVideoApi.CProxy.createFromMcfType(mcfReference);
            case Seq.NULL_REFNUM:
                return HdVideoProxy.CProxy.createFromMcfType(mcfReference);
            case Seq.RefTracker.REF_OFFSET:
                return LiveVideoApi.CProxy.createFromMcfType(mcfReference);
            case 43:
                return MediaStats.createFromMcfType(mcfReference);
            case 44:
                return MediaStatsApi.CProxy.createFromMcfType(mcfReference);
            case 45:
                return MediaStatsProxy.CProxy.createFromMcfType(mcfReference);
            case 46:
                return VideoStreamStats.createFromMcfType(mcfReference);
            case 47:
                return ActionMetadata.createFromMcfType(mcfReference);
            case 48:
                return AudioAttribution.createFromMcfType(mcfReference);
            case 49:
                return CaptionLocales.createFromMcfType(mcfReference);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return FacebookVideoContent.createFromMcfType(mcfReference);
            case 51:
                return Fallback.createFromMcfType(mcfReference);
            case 52:
                return InitialMediaSyncInfo.createFromMcfType(mcfReference);
            case 53:
                return InstagramContent.createFromMcfType(mcfReference);
            case 54:
                return InstagramContentOwner.createFromMcfType(mcfReference);
            case 55:
                return MediaSyncApi.CProxy.createFromMcfType(mcfReference);
            case 56:
                return MediaSyncContent.createFromMcfType(mcfReference);
            case 57:
                return MediaSyncState.createFromMcfType(mcfReference);
            case 58:
                return Placeholder.createFromMcfType(mcfReference);
            case 59:
                return SizedUrl.createFromMcfType(mcfReference);
            case 60:
                return Video.createFromMcfType(mcfReference);
            case 61:
                return ModeratorActionInfo.createFromMcfType(mcfReference);
            case 62:
                return ModeratorParticipantCapabilityInfo.createFromMcfType(mcfReference);
            case 63:
                return ModeratorSoftMuteModel.createFromMcfType(mcfReference);
            case 64:
                return FrameSize.createFromMcfType(mcfReference);
            case 65:
                return GridParticipantMediaInfo.createFromMcfType(mcfReference);
            case 66:
                return MosaicGridApi.CProxy.createFromMcfType(mcfReference);
            case 67:
                return MosaicGridModel.createFromMcfType(mcfReference);
            case 68:
                return MosaicGridParams.createFromMcfType(mcfReference);
            case 69:
                return PhotoboothApi.CProxy.createFromMcfType(mcfReference);
            default:
                return PhotoboothModel.createFromMcfType(mcfReference);
        }
    }

    public final Class BTf() {
        switch (this.A00) {
            case 0:
                return AudioApi.class;
            case 1:
                return AudioFrame.class;
            case 2:
                return AudioInputRoute.class;
            case 3:
                return AudioModel.class;
            case 4:
                return AudioOutputRoute.class;
            case 5:
                return AudioProxy.class;
            case 6:
                return AudioSource.class;
            case 7:
                return AudioSourceSink.class;
            case 8:
                return AudioStream.class;
            case 9:
                return EnableAudioParameters.class;
            case 10:
                return AudioEventsModel.class;
            case 11:
                return AudioModule.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return CallModel.class;
            case 13:
                return CallParticipant.class;
            case 14:
                return ParticipantMediaState.class;
            case 15:
                return UserProfile.class;
            case 16:
                return CallEndedApi.class;
            case 17:
                return CallManagerCallClient.class;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ApiBag.class;
            case 19:
                return Call.class;
            case 20:
                return CallApi.class;
            case 21:
                return UserContext.class;
            case 22:
                return CallTagApi.class;
            case 23:
                return Camera.class;
            case 24:
                return CameraApi.class;
            case 25:
                return CameraModel.class;
            case 26:
                return CameraProxy.class;
            case 27:
                return CowatchCaptionLocale.class;
            case 28:
                return CryptoApi.class;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return CryptoE2eeModel.class;
            case 30:
                return CryptoParticipantIdentity.class;
            case 31:
                return CryptoProxy.class;
            case 32:
                return ParticipantIdentityInfo.class;
            case 33:
                return DeviceStatsApi.class;
            case 34:
                return DevXAgentCallApi.class;
            case 35:
                return DevXAgentCallConfig.class;
            case 36:
                return DominantSpeakerModel.class;
            case 37:
                return EndedModel.class;
            case 38:
                return ExternalCallDelegate.class;
            case 39:
                return GroupExpansionProxy.class;
            case 40:
                return HdVideoApi.class;
            case Seq.NULL_REFNUM:
                return HdVideoProxy.class;
            case Seq.RefTracker.REF_OFFSET:
                return LiveVideoApi.class;
            case 43:
                return MediaStats.class;
            case 44:
                return MediaStatsApi.class;
            case 45:
                return MediaStatsProxy.class;
            case 46:
                return VideoStreamStats.class;
            case 47:
                return ActionMetadata.class;
            case 48:
                return AudioAttribution.class;
            case 49:
                return CaptionLocales.class;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return FacebookVideoContent.class;
            case 51:
                return Fallback.class;
            case 52:
                return InitialMediaSyncInfo.class;
            case 53:
                return InstagramContent.class;
            case 54:
                return InstagramContentOwner.class;
            case 55:
                return MediaSyncApi.class;
            case 56:
                return MediaSyncContent.class;
            case 57:
                return MediaSyncState.class;
            case 58:
                return Placeholder.class;
            case 59:
                return SizedUrl.class;
            case 60:
                return Video.class;
            case 61:
                return ModeratorActionInfo.class;
            case 62:
                return ModeratorParticipantCapabilityInfo.class;
            case 63:
                return ModeratorSoftMuteModel.class;
            case 64:
                return FrameSize.class;
            case 65:
                return GridParticipantMediaInfo.class;
            case 66:
                return MosaicGridApi.class;
            case 67:
                return MosaicGridModel.class;
            case 68:
                return MosaicGridParams.class;
            case 69:
                return PhotoboothApi.class;
            default:
                return PhotoboothModel.class;
        }
    }

    public final long CAr() {
        switch (this.A00) {
            case 0:
                long j = AudioApi.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = AudioApi.CProxy.nativeGetMcfTypeId();
                AudioApi.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = AudioFrame.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = AudioFrame.CProxy.nativeGetMcfTypeId();
                AudioFrame.CProxy.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = AudioInputRoute.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = AudioInputRoute.nativeGetMcfTypeId();
                AudioInputRoute.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = AudioModel.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = AudioModel.nativeGetMcfTypeId();
                AudioModel.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = AudioOutputRoute.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = AudioOutputRoute.nativeGetMcfTypeId();
                AudioOutputRoute.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = AudioProxy.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = AudioProxy.CProxy.nativeGetMcfTypeId();
                AudioProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = AudioSource.CProxy.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = AudioSource.CProxy.nativeGetMcfTypeId();
                AudioSource.CProxy.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = AudioSourceSink.CProxy.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = AudioSourceSink.CProxy.nativeGetMcfTypeId();
                AudioSourceSink.CProxy.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = AudioStream.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = AudioStream.nativeGetMcfTypeId();
                AudioStream.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = EnableAudioParameters.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = EnableAudioParameters.nativeGetMcfTypeId();
                EnableAudioParameters.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = AudioEventsModel.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = AudioEventsModel.nativeGetMcfTypeId();
                AudioEventsModel.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = AudioModule.CProxy.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = AudioModule.CProxy.nativeGetMcfTypeId();
                AudioModule.CProxy.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                long j13 = CallModel.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = CallModel.nativeGetMcfTypeId();
                CallModel.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case 13:
                long j14 = CallParticipant.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = CallParticipant.nativeGetMcfTypeId();
                CallParticipant.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = ParticipantMediaState.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = ParticipantMediaState.nativeGetMcfTypeId();
                ParticipantMediaState.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case 15:
                long j16 = UserProfile.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = UserProfile.nativeGetMcfTypeId();
                UserProfile.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = CallEndedApi.CProxy.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = CallEndedApi.CProxy.nativeGetMcfTypeId();
                CallEndedApi.CProxy.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            case 17:
                long j18 = CallManagerCallClient.CProxy.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long nativeGetMcfTypeId18 = CallManagerCallClient.CProxy.nativeGetMcfTypeId();
                CallManagerCallClient.CProxy.sMcfTypeId = nativeGetMcfTypeId18;
                return nativeGetMcfTypeId18;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                long j19 = ApiBag.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long nativeGetMcfTypeId19 = ApiBag.nativeGetMcfTypeId();
                ApiBag.sMcfTypeId = nativeGetMcfTypeId19;
                return nativeGetMcfTypeId19;
            case 19:
                long j20 = Call.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long nativeGetMcfTypeId20 = Call.CProxy.nativeGetMcfTypeId();
                Call.CProxy.sMcfTypeId = nativeGetMcfTypeId20;
                return nativeGetMcfTypeId20;
            case 20:
                long j21 = CallApi.CProxy.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long nativeGetMcfTypeId21 = CallApi.CProxy.nativeGetMcfTypeId();
                CallApi.CProxy.sMcfTypeId = nativeGetMcfTypeId21;
                return nativeGetMcfTypeId21;
            case 21:
                long j22 = UserContext.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long nativeGetMcfTypeId22 = UserContext.nativeGetMcfTypeId();
                UserContext.sMcfTypeId = nativeGetMcfTypeId22;
                return nativeGetMcfTypeId22;
            case 22:
                long j23 = CallTagApi.CProxy.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long nativeGetMcfTypeId23 = CallTagApi.CProxy.nativeGetMcfTypeId();
                CallTagApi.CProxy.sMcfTypeId = nativeGetMcfTypeId23;
                return nativeGetMcfTypeId23;
            case 23:
                long j24 = Camera.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long nativeGetMcfTypeId24 = Camera.nativeGetMcfTypeId();
                Camera.sMcfTypeId = nativeGetMcfTypeId24;
                return nativeGetMcfTypeId24;
            case 24:
                long j25 = CameraApi.CProxy.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long nativeGetMcfTypeId25 = CameraApi.CProxy.nativeGetMcfTypeId();
                CameraApi.CProxy.sMcfTypeId = nativeGetMcfTypeId25;
                return nativeGetMcfTypeId25;
            case 25:
                long j26 = CameraModel.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long nativeGetMcfTypeId26 = CameraModel.nativeGetMcfTypeId();
                CameraModel.sMcfTypeId = nativeGetMcfTypeId26;
                return nativeGetMcfTypeId26;
            case 26:
                long j27 = CameraProxy.CProxy.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long nativeGetMcfTypeId27 = CameraProxy.CProxy.nativeGetMcfTypeId();
                CameraProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId27;
                return nativeGetMcfTypeId27;
            case 27:
                long j28 = CowatchCaptionLocale.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long nativeGetMcfTypeId28 = CowatchCaptionLocale.nativeGetMcfTypeId();
                CowatchCaptionLocale.sMcfTypeId = nativeGetMcfTypeId28;
                return nativeGetMcfTypeId28;
            case 28:
                long j29 = CryptoApi.CProxy.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long nativeGetMcfTypeId29 = CryptoApi.CProxy.nativeGetMcfTypeId();
                CryptoApi.CProxy.sMcfTypeId = nativeGetMcfTypeId29;
                return nativeGetMcfTypeId29;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                long j30 = CryptoE2eeModel.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long nativeGetMcfTypeId30 = CryptoE2eeModel.nativeGetMcfTypeId();
                CryptoE2eeModel.sMcfTypeId = nativeGetMcfTypeId30;
                return nativeGetMcfTypeId30;
            case 30:
                long j31 = CryptoParticipantIdentity.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long nativeGetMcfTypeId31 = CryptoParticipantIdentity.nativeGetMcfTypeId();
                CryptoParticipantIdentity.sMcfTypeId = nativeGetMcfTypeId31;
                return nativeGetMcfTypeId31;
            case 31:
                long j32 = CryptoProxy.CProxy.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long nativeGetMcfTypeId32 = CryptoProxy.CProxy.nativeGetMcfTypeId();
                CryptoProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId32;
                return nativeGetMcfTypeId32;
            case 32:
                long j33 = ParticipantIdentityInfo.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long nativeGetMcfTypeId33 = ParticipantIdentityInfo.nativeGetMcfTypeId();
                ParticipantIdentityInfo.sMcfTypeId = nativeGetMcfTypeId33;
                return nativeGetMcfTypeId33;
            case 33:
                long j34 = DeviceStatsApi.CProxy.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long nativeGetMcfTypeId34 = DeviceStatsApi.CProxy.nativeGetMcfTypeId();
                DeviceStatsApi.CProxy.sMcfTypeId = nativeGetMcfTypeId34;
                return nativeGetMcfTypeId34;
            case 34:
                long j35 = DevXAgentCallApi.CProxy.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long nativeGetMcfTypeId35 = DevXAgentCallApi.CProxy.nativeGetMcfTypeId();
                DevXAgentCallApi.CProxy.sMcfTypeId = nativeGetMcfTypeId35;
                return nativeGetMcfTypeId35;
            case 35:
                long j36 = DevXAgentCallConfig.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long nativeGetMcfTypeId36 = DevXAgentCallConfig.nativeGetMcfTypeId();
                DevXAgentCallConfig.sMcfTypeId = nativeGetMcfTypeId36;
                return nativeGetMcfTypeId36;
            case 36:
                long j37 = DominantSpeakerModel.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long nativeGetMcfTypeId37 = DominantSpeakerModel.nativeGetMcfTypeId();
                DominantSpeakerModel.sMcfTypeId = nativeGetMcfTypeId37;
                return nativeGetMcfTypeId37;
            case 37:
                long j38 = EndedModel.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long nativeGetMcfTypeId38 = EndedModel.nativeGetMcfTypeId();
                EndedModel.sMcfTypeId = nativeGetMcfTypeId38;
                return nativeGetMcfTypeId38;
            case 38:
                long j39 = ExternalCallDelegate.CProxy.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long nativeGetMcfTypeId39 = ExternalCallDelegate.CProxy.nativeGetMcfTypeId();
                ExternalCallDelegate.CProxy.sMcfTypeId = nativeGetMcfTypeId39;
                return nativeGetMcfTypeId39;
            case 39:
                long j40 = GroupExpansionProxy.CProxy.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long nativeGetMcfTypeId40 = GroupExpansionProxy.CProxy.nativeGetMcfTypeId();
                GroupExpansionProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId40;
                return nativeGetMcfTypeId40;
            case 40:
                long j41 = HdVideoApi.CProxy.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long nativeGetMcfTypeId41 = HdVideoApi.CProxy.nativeGetMcfTypeId();
                HdVideoApi.CProxy.sMcfTypeId = nativeGetMcfTypeId41;
                return nativeGetMcfTypeId41;
            case Seq.NULL_REFNUM:
                long j42 = HdVideoProxy.CProxy.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long nativeGetMcfTypeId42 = HdVideoProxy.CProxy.nativeGetMcfTypeId();
                HdVideoProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId42;
                return nativeGetMcfTypeId42;
            case Seq.RefTracker.REF_OFFSET:
                long j43 = LiveVideoApi.CProxy.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long nativeGetMcfTypeId43 = LiveVideoApi.CProxy.nativeGetMcfTypeId();
                LiveVideoApi.CProxy.sMcfTypeId = nativeGetMcfTypeId43;
                return nativeGetMcfTypeId43;
            case 43:
                long j44 = MediaStats.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long nativeGetMcfTypeId44 = MediaStats.nativeGetMcfTypeId();
                MediaStats.sMcfTypeId = nativeGetMcfTypeId44;
                return nativeGetMcfTypeId44;
            case 44:
                long j45 = MediaStatsApi.CProxy.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long nativeGetMcfTypeId45 = MediaStatsApi.CProxy.nativeGetMcfTypeId();
                MediaStatsApi.CProxy.sMcfTypeId = nativeGetMcfTypeId45;
                return nativeGetMcfTypeId45;
            case 45:
                long j46 = MediaStatsProxy.CProxy.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long nativeGetMcfTypeId46 = MediaStatsProxy.CProxy.nativeGetMcfTypeId();
                MediaStatsProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId46;
                return nativeGetMcfTypeId46;
            case 46:
                long j47 = VideoStreamStats.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long nativeGetMcfTypeId47 = VideoStreamStats.nativeGetMcfTypeId();
                VideoStreamStats.sMcfTypeId = nativeGetMcfTypeId47;
                return nativeGetMcfTypeId47;
            case 47:
                long j48 = ActionMetadata.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long nativeGetMcfTypeId48 = ActionMetadata.nativeGetMcfTypeId();
                ActionMetadata.sMcfTypeId = nativeGetMcfTypeId48;
                return nativeGetMcfTypeId48;
            case 48:
                long j49 = AudioAttribution.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long nativeGetMcfTypeId49 = AudioAttribution.nativeGetMcfTypeId();
                AudioAttribution.sMcfTypeId = nativeGetMcfTypeId49;
                return nativeGetMcfTypeId49;
            case 49:
                long j50 = CaptionLocales.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long nativeGetMcfTypeId50 = CaptionLocales.nativeGetMcfTypeId();
                CaptionLocales.sMcfTypeId = nativeGetMcfTypeId50;
                return nativeGetMcfTypeId50;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                long j51 = FacebookVideoContent.sMcfTypeId;
                if (j51 != 0) {
                    return j51;
                }
                long nativeGetMcfTypeId51 = FacebookVideoContent.nativeGetMcfTypeId();
                FacebookVideoContent.sMcfTypeId = nativeGetMcfTypeId51;
                return nativeGetMcfTypeId51;
            case 51:
                long j52 = Fallback.sMcfTypeId;
                if (j52 != 0) {
                    return j52;
                }
                long nativeGetMcfTypeId52 = Fallback.nativeGetMcfTypeId();
                Fallback.sMcfTypeId = nativeGetMcfTypeId52;
                return nativeGetMcfTypeId52;
            case 52:
                long j53 = InitialMediaSyncInfo.sMcfTypeId;
                if (j53 != 0) {
                    return j53;
                }
                long nativeGetMcfTypeId53 = InitialMediaSyncInfo.nativeGetMcfTypeId();
                InitialMediaSyncInfo.sMcfTypeId = nativeGetMcfTypeId53;
                return nativeGetMcfTypeId53;
            case 53:
                long j54 = InstagramContent.sMcfTypeId;
                if (j54 != 0) {
                    return j54;
                }
                long nativeGetMcfTypeId54 = InstagramContent.nativeGetMcfTypeId();
                InstagramContent.sMcfTypeId = nativeGetMcfTypeId54;
                return nativeGetMcfTypeId54;
            case 54:
                long j55 = InstagramContentOwner.sMcfTypeId;
                if (j55 != 0) {
                    return j55;
                }
                long nativeGetMcfTypeId55 = InstagramContentOwner.nativeGetMcfTypeId();
                InstagramContentOwner.sMcfTypeId = nativeGetMcfTypeId55;
                return nativeGetMcfTypeId55;
            case 55:
                long j56 = MediaSyncApi.CProxy.sMcfTypeId;
                if (j56 != 0) {
                    return j56;
                }
                long nativeGetMcfTypeId56 = MediaSyncApi.CProxy.nativeGetMcfTypeId();
                MediaSyncApi.CProxy.sMcfTypeId = nativeGetMcfTypeId56;
                return nativeGetMcfTypeId56;
            case 56:
                long j57 = MediaSyncContent.sMcfTypeId;
                if (j57 != 0) {
                    return j57;
                }
                long nativeGetMcfTypeId57 = MediaSyncContent.nativeGetMcfTypeId();
                MediaSyncContent.sMcfTypeId = nativeGetMcfTypeId57;
                return nativeGetMcfTypeId57;
            case 57:
                long j58 = MediaSyncState.sMcfTypeId;
                if (j58 != 0) {
                    return j58;
                }
                long nativeGetMcfTypeId58 = MediaSyncState.nativeGetMcfTypeId();
                MediaSyncState.sMcfTypeId = nativeGetMcfTypeId58;
                return nativeGetMcfTypeId58;
            case 58:
                long j59 = Placeholder.sMcfTypeId;
                if (j59 != 0) {
                    return j59;
                }
                long nativeGetMcfTypeId59 = Placeholder.nativeGetMcfTypeId();
                Placeholder.sMcfTypeId = nativeGetMcfTypeId59;
                return nativeGetMcfTypeId59;
            case 59:
                long j60 = SizedUrl.sMcfTypeId;
                if (j60 != 0) {
                    return j60;
                }
                long nativeGetMcfTypeId60 = SizedUrl.nativeGetMcfTypeId();
                SizedUrl.sMcfTypeId = nativeGetMcfTypeId60;
                return nativeGetMcfTypeId60;
            case 60:
                long j61 = Video.sMcfTypeId;
                if (j61 != 0) {
                    return j61;
                }
                long nativeGetMcfTypeId61 = Video.nativeGetMcfTypeId();
                Video.sMcfTypeId = nativeGetMcfTypeId61;
                return nativeGetMcfTypeId61;
            case 61:
                long j62 = ModeratorActionInfo.sMcfTypeId;
                if (j62 != 0) {
                    return j62;
                }
                long nativeGetMcfTypeId62 = ModeratorActionInfo.nativeGetMcfTypeId();
                ModeratorActionInfo.sMcfTypeId = nativeGetMcfTypeId62;
                return nativeGetMcfTypeId62;
            case 62:
                long j63 = ModeratorParticipantCapabilityInfo.sMcfTypeId;
                if (j63 != 0) {
                    return j63;
                }
                long nativeGetMcfTypeId63 = ModeratorParticipantCapabilityInfo.nativeGetMcfTypeId();
                ModeratorParticipantCapabilityInfo.sMcfTypeId = nativeGetMcfTypeId63;
                return nativeGetMcfTypeId63;
            case 63:
                long j64 = ModeratorSoftMuteModel.sMcfTypeId;
                if (j64 != 0) {
                    return j64;
                }
                long nativeGetMcfTypeId64 = ModeratorSoftMuteModel.nativeGetMcfTypeId();
                ModeratorSoftMuteModel.sMcfTypeId = nativeGetMcfTypeId64;
                return nativeGetMcfTypeId64;
            case 64:
                long j65 = FrameSize.sMcfTypeId;
                if (j65 != 0) {
                    return j65;
                }
                long nativeGetMcfTypeId65 = FrameSize.nativeGetMcfTypeId();
                FrameSize.sMcfTypeId = nativeGetMcfTypeId65;
                return nativeGetMcfTypeId65;
            case 65:
                long j66 = GridParticipantMediaInfo.sMcfTypeId;
                if (j66 != 0) {
                    return j66;
                }
                long nativeGetMcfTypeId66 = GridParticipantMediaInfo.nativeGetMcfTypeId();
                GridParticipantMediaInfo.sMcfTypeId = nativeGetMcfTypeId66;
                return nativeGetMcfTypeId66;
            case 66:
                long j67 = MosaicGridApi.CProxy.sMcfTypeId;
                if (j67 != 0) {
                    return j67;
                }
                long nativeGetMcfTypeId67 = MosaicGridApi.CProxy.nativeGetMcfTypeId();
                MosaicGridApi.CProxy.sMcfTypeId = nativeGetMcfTypeId67;
                return nativeGetMcfTypeId67;
            case 67:
                long j68 = MosaicGridModel.sMcfTypeId;
                if (j68 != 0) {
                    return j68;
                }
                long nativeGetMcfTypeId68 = MosaicGridModel.nativeGetMcfTypeId();
                MosaicGridModel.sMcfTypeId = nativeGetMcfTypeId68;
                return nativeGetMcfTypeId68;
            case 68:
                long j69 = MosaicGridParams.sMcfTypeId;
                if (j69 != 0) {
                    return j69;
                }
                long nativeGetMcfTypeId69 = MosaicGridParams.nativeGetMcfTypeId();
                MosaicGridParams.sMcfTypeId = nativeGetMcfTypeId69;
                return nativeGetMcfTypeId69;
            case 69:
                long j70 = PhotoboothApi.CProxy.sMcfTypeId;
                if (j70 != 0) {
                    return j70;
                }
                long nativeGetMcfTypeId70 = PhotoboothApi.CProxy.nativeGetMcfTypeId();
                PhotoboothApi.CProxy.sMcfTypeId = nativeGetMcfTypeId70;
                return nativeGetMcfTypeId70;
            default:
                long j71 = PhotoboothModel.sMcfTypeId;
                if (j71 != 0) {
                    return j71;
                }
                long nativeGetMcfTypeId71 = PhotoboothModel.nativeGetMcfTypeId();
                PhotoboothModel.sMcfTypeId = nativeGetMcfTypeId71;
                return nativeGetMcfTypeId71;
        }
    }
}
