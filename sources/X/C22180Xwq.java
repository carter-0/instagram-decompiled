package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.appstate.gen.AppstateModel;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioEncodedPacket;
import com.facebook.rsys.audio.gen.AudioFrameDetails;
import com.facebook.rsys.audio.gen.AudioFrameMetadata;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.audio.gen.AudioStreamSource;
import com.facebook.rsys.audio.gen.PlaybackVolumeParametersDeprecated;
import com.facebook.rsys.audiomixerholder.gen.AudioMixerHolder;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationApi;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationListener;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationModel;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.call.gen.AddUsersOptions;
import com.facebook.rsys.call.gen.CallNotification;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import com.facebook.rsys.callinfo.gen.CallInfoObserver;
import com.facebook.rsys.callinfo.gen.CallInfoReadCallback;
import com.facebook.rsys.callinfo.gen.UserProfilesReadCallback;
import com.facebook.rsys.callmanager.callclient.gen.StartCallCopyIdParams;
import com.facebook.rsys.callmanager.gen.AppInfo;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.callmanager.gen.CodecInfo;
import com.facebook.rsys.camera.gen.CameraStallHandler;
import com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer;
import com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi;
import com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderSendInput;
import com.facebook.rsys.cowatch.gen.CowatchAdminMessageModel;
import com.facebook.rsys.cowatch.gen.CowatchLoggingModel;
import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerInternalModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerIosModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;
import com.facebook.rsys.cowatch.gen.CowatchReelsMediaHashtagModel;
import com.facebook.rsys.cowatch.gen.CowatchReelsMediaInfoModel;
import com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueModel;
import com.facebook.rsys.datachannel.gen.DataApi;
import com.facebook.rsys.datachannel.gen.DataChannelConfig;
import com.facebook.rsys.datachannel.gen.DataChannelMessageParams;
import com.facebook.rsys.datachannel.gen.DataTransport;
import com.facebook.rsys.ended.gen.ErrorMessageFallback;
import com.facebook.rsys.ended.gen.UnsupportedCapabilityFallbacks;
import com.facebook.rsys.ended.gen.VideoQuality;
import com.facebook.rsys.ended.gen.VideoStats;
import com.facebook.rsys.execution.gen.Task;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.filelogging.gen.LogFileData;
import com.facebook.rsys.grid.gen.GridApi;
import com.facebook.rsys.grid.gen.GridDisplayEligibleStates;
import com.facebook.rsys.grid.gen.GridGroupOptions;
import com.facebook.rsys.grid.gen.GridModel;
import com.facebook.rsys.grid.gen.GridOrderingParameters;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback;
import com.facebook.rsys.livevideo.gen.LiveStreamOptInInfo;
import com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback;
import com.facebook.rsys.livevideo.gen.LiveVideoCancelCreatedNotStartedParameters;
import com.facebook.rsys.livevideo.gen.LiveVideoCreationParameters;
import com.facebook.rsys.livevideo.gen.LiveVideoEndParameters;
import com.facebook.rsys.livevideo.gen.LiveVideoMetadata;
import com.facebook.rsys.livevideo.gen.LiveVideoModel;
import com.facebook.rsys.livevideo.gen.LiveVideoStartParameters;
import com.facebook.rsys.livevideo.gen.LiveVideoStore;
import com.facebook.rsys.livevideo.gen.LiveVideoStoreHandler;
import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rsys.log.gen.LogModel;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.media.gen.UserStreamInfo;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Xwq  reason: case insensitive filesystem */
public final class C22180Xwq implements 2LV {
    public final int A00;

    public C22180Xwq(int i) {
        this.A00 = i;
    }

    public static C22180Xwq A00(int i) {
        return new C22180Xwq(i);
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return AppstateModel.createFromMcfType(mcfReference);
            case 1:
                return AudioDeviceModule.CProxy.createFromMcfType(mcfReference);
            case 2:
                return AudioEncodedPacket.createFromMcfType(mcfReference);
            case 3:
                return AudioFrameDetails.createFromMcfType(mcfReference);
            case 4:
                return AudioFrameMetadata.createFromMcfType(mcfReference);
            case 5:
                return AudioPipelineContext.createFromMcfType(mcfReference);
            case 6:
                return AudioStreamSource.CProxy.createFromMcfType(mcfReference);
            case 7:
                return PlaybackVolumeParametersDeprecated.createFromMcfType(mcfReference);
            case 8:
                return AudioMixerHolder.CProxy.createFromMcfType(mcfReference);
            case 9:
                return AvatarCommunicationApi.CProxy.createFromMcfType(mcfReference);
            case 10:
                return AvatarCommunicationListener.CProxy.createFromMcfType(mcfReference);
            case 11:
                return AvatarCommunicationModel.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AvatarCommunicationProxy.CProxy.createFromMcfType(mcfReference);
            case 13:
                return FeatureHolder.CProxy.createFromMcfType(mcfReference);
            case 14:
                return DataMessage.createFromMcfType(mcfReference);
            case 15:
                return AddUsersOptions.createFromMcfType(mcfReference);
            case 16:
                return CallNotification.createFromMcfType(mcfReference);
            case 17:
                return CallContext.createFromMcfType(mcfReference);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return CallInfo.createFromMcfType(mcfReference);
            case 19:
                return CallInfoObserver.CProxy.createFromMcfType(mcfReference);
            case 20:
                return CallInfoReadCallback.CProxy.createFromMcfType(mcfReference);
            case 21:
                return UserProfilesReadCallback.CProxy.createFromMcfType(mcfReference);
            case 22:
                return StartCallCopyIdParams.createFromMcfType(mcfReference);
            case 23:
                return AppInfo.createFromMcfType(mcfReference);
            case 24:
                return CallManagerConfig.createFromMcfType(mcfReference);
            case 25:
                return CodecInfo.createFromMcfType(mcfReference);
            case 26:
                return CameraStallHandler.CProxy.createFromMcfType(mcfReference);
            case 27:
                XYC.A00();
                return ChatDPublishDataContainer.createFromMcfType(mcfReference);
            case 28:
                return ChatDTransportSenderApi.CProxy.createFromMcfType(mcfReference);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                XYC.A00();
                return ChatDTransportSenderSendInput.createFromMcfType(mcfReference);
            case 30:
                return CowatchAdminMessageModel.createFromMcfType(mcfReference);
            case 31:
                return CowatchLoggingModel.createFromMcfType(mcfReference);
            case 32:
                return CowatchMediaInfoModel.createFromMcfType(mcfReference);
            case 33:
                return CowatchPlayerInternalModel.createFromMcfType(mcfReference);
            case 34:
                return CowatchPlayerIosModel.createFromMcfType(mcfReference);
            case 35:
                return CowatchPlayerModel.createFromMcfType(mcfReference);
            case 36:
                return CowatchReelsMediaHashtagModel.createFromMcfType(mcfReference);
            case 37:
                return CowatchReelsMediaInfoModel.createFromMcfType(mcfReference);
            case 38:
                return CowatchSuggestedContentQueueModel.createFromMcfType(mcfReference);
            case 39:
                return DataApi.CProxy.createFromMcfType(mcfReference);
            case 40:
                return DataChannelConfig.createFromMcfType(mcfReference);
            case Seq.NULL_REFNUM /*41*/:
                return DataChannelMessageParams.createFromMcfType(mcfReference);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return DataTransport.CProxy.createFromMcfType(mcfReference);
            case 43:
                return ErrorMessageFallback.createFromMcfType(mcfReference);
            case 44:
                return UnsupportedCapabilityFallbacks.createFromMcfType(mcfReference);
            case 45:
                return VideoQuality.createFromMcfType(mcfReference);
            case 46:
                return VideoStats.createFromMcfType(mcfReference);
            case 47:
                return Task.CProxy.createFromMcfType(mcfReference);
            case 48:
                return TaskExecutor.CProxy.createFromMcfType(mcfReference);
            case 49:
                return LargeLogUploadProxy.CProxy.createFromMcfType(mcfReference);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return LogFileData.createFromMcfType(mcfReference);
            case 51:
                return GridApi.CProxy.createFromMcfType(mcfReference);
            case 52:
                return GridDisplayEligibleStates.createFromMcfType(mcfReference);
            case 53:
                return GridGroupOptions.createFromMcfType(mcfReference);
            case 54:
                return GridModel.createFromMcfType(mcfReference);
            case 55:
                return GridOrderingParameters.createFromMcfType(mcfReference);
            case 56:
                return GroupExpansionCompletedCallback.CProxy.createFromMcfType(mcfReference);
            case 57:
                return LiveStreamOptInInfo.createFromMcfType(mcfReference);
            case 58:
                return LiveVideoBroadcastLifecycleCallback.CProxy.createFromMcfType(mcfReference);
            case 59:
                return LiveVideoCancelCreatedNotStartedParameters.createFromMcfType(mcfReference);
            case 60:
                return LiveVideoCreationParameters.createFromMcfType(mcfReference);
            case 61:
                return LiveVideoEndParameters.createFromMcfType(mcfReference);
            case 62:
                return LiveVideoMetadata.createFromMcfType(mcfReference);
            case 63:
                return LiveVideoModel.createFromMcfType(mcfReference);
            case 64:
                return LiveVideoStartParameters.createFromMcfType(mcfReference);
            case 65:
                return LiveVideoStore.CProxy.createFromMcfType(mcfReference);
            case 66:
                return LiveVideoStoreHandler.CProxy.createFromMcfType(mcfReference);
            case 67:
                return CallSummaryInfo.createFromMcfType(mcfReference);
            case 68:
                return LogModel.createFromMcfType(mcfReference);
            case 69:
                return StreamInfo.createFromMcfType(mcfReference);
            default:
                return UserStreamInfo.createFromMcfType(mcfReference);
        }
    }

    public final Class BTf() {
        switch (this.A00) {
            case 0:
                return AppstateModel.class;
            case 1:
                return AudioDeviceModule.class;
            case 2:
                return AudioEncodedPacket.class;
            case 3:
                return AudioFrameDetails.class;
            case 4:
                return AudioFrameMetadata.class;
            case 5:
                return AudioPipelineContext.class;
            case 6:
                return AudioStreamSource.class;
            case 7:
                return PlaybackVolumeParametersDeprecated.class;
            case 8:
                return AudioMixerHolder.class;
            case 9:
                return AvatarCommunicationApi.class;
            case 10:
                return AvatarCommunicationListener.class;
            case 11:
                return AvatarCommunicationModel.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AvatarCommunicationProxy.class;
            case 13:
                return FeatureHolder.class;
            case 14:
                return DataMessage.class;
            case 15:
                return AddUsersOptions.class;
            case 16:
                return CallNotification.class;
            case 17:
                return CallContext.class;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return CallInfo.class;
            case 19:
                return CallInfoObserver.class;
            case 20:
                return CallInfoReadCallback.class;
            case 21:
                return UserProfilesReadCallback.class;
            case 22:
                return StartCallCopyIdParams.class;
            case 23:
                return AppInfo.class;
            case 24:
                return CallManagerConfig.class;
            case 25:
                return CodecInfo.class;
            case 26:
                return CameraStallHandler.class;
            case 27:
                return ChatDPublishDataContainer.class;
            case 28:
                return ChatDTransportSenderApi.class;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return ChatDTransportSenderSendInput.class;
            case 30:
                return CowatchAdminMessageModel.class;
            case 31:
                return CowatchLoggingModel.class;
            case 32:
                return CowatchMediaInfoModel.class;
            case 33:
                return CowatchPlayerInternalModel.class;
            case 34:
                return CowatchPlayerIosModel.class;
            case 35:
                return CowatchPlayerModel.class;
            case 36:
                return CowatchReelsMediaHashtagModel.class;
            case 37:
                return CowatchReelsMediaInfoModel.class;
            case 38:
                return CowatchSuggestedContentQueueModel.class;
            case 39:
                return DataApi.class;
            case 40:
                return DataChannelConfig.class;
            case Seq.NULL_REFNUM /*41*/:
                return DataChannelMessageParams.class;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return DataTransport.class;
            case 43:
                return ErrorMessageFallback.class;
            case 44:
                return UnsupportedCapabilityFallbacks.class;
            case 45:
                return VideoQuality.class;
            case 46:
                return VideoStats.class;
            case 47:
                return Task.class;
            case 48:
                return TaskExecutor.class;
            case 49:
                return LargeLogUploadProxy.class;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return LogFileData.class;
            case 51:
                return GridApi.class;
            case 52:
                return GridDisplayEligibleStates.class;
            case 53:
                return GridGroupOptions.class;
            case 54:
                return GridModel.class;
            case 55:
                return GridOrderingParameters.class;
            case 56:
                return GroupExpansionCompletedCallback.class;
            case 57:
                return LiveStreamOptInInfo.class;
            case 58:
                return LiveVideoBroadcastLifecycleCallback.class;
            case 59:
                return LiveVideoCancelCreatedNotStartedParameters.class;
            case 60:
                return LiveVideoCreationParameters.class;
            case 61:
                return LiveVideoEndParameters.class;
            case 62:
                return LiveVideoMetadata.class;
            case 63:
                return LiveVideoModel.class;
            case 64:
                return LiveVideoStartParameters.class;
            case 65:
                return LiveVideoStore.class;
            case 66:
                return LiveVideoStoreHandler.class;
            case 67:
                return CallSummaryInfo.class;
            case 68:
                return LogModel.class;
            case 69:
                return StreamInfo.class;
            default:
                return UserStreamInfo.class;
        }
    }

    public final long CAr() {
        switch (this.A00) {
            case 0:
                long j = AppstateModel.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = AppstateModel.nativeGetMcfTypeId();
                AppstateModel.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = AudioDeviceModule.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = AudioDeviceModule.CProxy.nativeGetMcfTypeId();
                AudioDeviceModule.CProxy.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = AudioEncodedPacket.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = AudioEncodedPacket.nativeGetMcfTypeId();
                AudioEncodedPacket.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = AudioFrameDetails.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = AudioFrameDetails.nativeGetMcfTypeId();
                AudioFrameDetails.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = AudioFrameMetadata.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = AudioFrameMetadata.nativeGetMcfTypeId();
                AudioFrameMetadata.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = AudioPipelineContext.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = AudioPipelineContext.nativeGetMcfTypeId();
                AudioPipelineContext.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = AudioStreamSource.CProxy.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = AudioStreamSource.CProxy.nativeGetMcfTypeId();
                AudioStreamSource.CProxy.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = PlaybackVolumeParametersDeprecated.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = PlaybackVolumeParametersDeprecated.nativeGetMcfTypeId();
                PlaybackVolumeParametersDeprecated.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = AudioMixerHolder.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = AudioMixerHolder.CProxy.nativeGetMcfTypeId();
                AudioMixerHolder.CProxy.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = AvatarCommunicationApi.CProxy.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = AvatarCommunicationApi.CProxy.nativeGetMcfTypeId();
                AvatarCommunicationApi.CProxy.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = AvatarCommunicationListener.CProxy.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = AvatarCommunicationListener.CProxy.nativeGetMcfTypeId();
                AvatarCommunicationListener.CProxy.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = AvatarCommunicationModel.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = AvatarCommunicationModel.nativeGetMcfTypeId();
                AvatarCommunicationModel.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                long j13 = AvatarCommunicationProxy.CProxy.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = AvatarCommunicationProxy.CProxy.nativeGetMcfTypeId();
                AvatarCommunicationProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case 13:
                long j14 = FeatureHolder.CProxy.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = FeatureHolder.CProxy.nativeGetMcfTypeId();
                FeatureHolder.CProxy.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = DataMessage.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = DataMessage.nativeGetMcfTypeId();
                DataMessage.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case 15:
                long j16 = AddUsersOptions.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = AddUsersOptions.nativeGetMcfTypeId();
                AddUsersOptions.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = CallNotification.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = CallNotification.nativeGetMcfTypeId();
                CallNotification.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            case 17:
                long j18 = CallContext.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long nativeGetMcfTypeId18 = CallContext.nativeGetMcfTypeId();
                CallContext.sMcfTypeId = nativeGetMcfTypeId18;
                return nativeGetMcfTypeId18;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                long j19 = CallInfo.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long nativeGetMcfTypeId19 = CallInfo.nativeGetMcfTypeId();
                CallInfo.sMcfTypeId = nativeGetMcfTypeId19;
                return nativeGetMcfTypeId19;
            case 19:
                long j20 = CallInfoObserver.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long nativeGetMcfTypeId20 = CallInfoObserver.CProxy.nativeGetMcfTypeId();
                CallInfoObserver.CProxy.sMcfTypeId = nativeGetMcfTypeId20;
                return nativeGetMcfTypeId20;
            case 20:
                long j21 = CallInfoReadCallback.CProxy.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long nativeGetMcfTypeId21 = CallInfoReadCallback.CProxy.nativeGetMcfTypeId();
                CallInfoReadCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId21;
                return nativeGetMcfTypeId21;
            case 21:
                long j22 = UserProfilesReadCallback.CProxy.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long nativeGetMcfTypeId22 = UserProfilesReadCallback.CProxy.nativeGetMcfTypeId();
                UserProfilesReadCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId22;
                return nativeGetMcfTypeId22;
            case 22:
                long j23 = StartCallCopyIdParams.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long nativeGetMcfTypeId23 = StartCallCopyIdParams.nativeGetMcfTypeId();
                StartCallCopyIdParams.sMcfTypeId = nativeGetMcfTypeId23;
                return nativeGetMcfTypeId23;
            case 23:
                long j24 = AppInfo.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long nativeGetMcfTypeId24 = AppInfo.nativeGetMcfTypeId();
                AppInfo.sMcfTypeId = nativeGetMcfTypeId24;
                return nativeGetMcfTypeId24;
            case 24:
                long j25 = CallManagerConfig.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long nativeGetMcfTypeId25 = CallManagerConfig.nativeGetMcfTypeId();
                CallManagerConfig.sMcfTypeId = nativeGetMcfTypeId25;
                return nativeGetMcfTypeId25;
            case 25:
                long j26 = CodecInfo.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long nativeGetMcfTypeId26 = CodecInfo.nativeGetMcfTypeId();
                CodecInfo.sMcfTypeId = nativeGetMcfTypeId26;
                return nativeGetMcfTypeId26;
            case 26:
                long j27 = CameraStallHandler.CProxy.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long nativeGetMcfTypeId27 = CameraStallHandler.CProxy.nativeGetMcfTypeId();
                CameraStallHandler.CProxy.sMcfTypeId = nativeGetMcfTypeId27;
                return nativeGetMcfTypeId27;
            case 27:
                XYC.A00();
                long j28 = ChatDPublishDataContainer.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long nativeGetMcfTypeId28 = ChatDPublishDataContainer.nativeGetMcfTypeId();
                ChatDPublishDataContainer.sMcfTypeId = nativeGetMcfTypeId28;
                return nativeGetMcfTypeId28;
            case 28:
                long j29 = ChatDTransportSenderApi.CProxy.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long nativeGetMcfTypeId29 = ChatDTransportSenderApi.CProxy.nativeGetMcfTypeId();
                ChatDTransportSenderApi.CProxy.sMcfTypeId = nativeGetMcfTypeId29;
                return nativeGetMcfTypeId29;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                XYC.A00();
                long j30 = ChatDTransportSenderSendInput.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long nativeGetMcfTypeId30 = ChatDTransportSenderSendInput.nativeGetMcfTypeId();
                ChatDTransportSenderSendInput.sMcfTypeId = nativeGetMcfTypeId30;
                return nativeGetMcfTypeId30;
            case 30:
                long j31 = CowatchAdminMessageModel.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long nativeGetMcfTypeId31 = CowatchAdminMessageModel.nativeGetMcfTypeId();
                CowatchAdminMessageModel.sMcfTypeId = nativeGetMcfTypeId31;
                return nativeGetMcfTypeId31;
            case 31:
                long j32 = CowatchLoggingModel.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long nativeGetMcfTypeId32 = CowatchLoggingModel.nativeGetMcfTypeId();
                CowatchLoggingModel.sMcfTypeId = nativeGetMcfTypeId32;
                return nativeGetMcfTypeId32;
            case 32:
                long j33 = CowatchMediaInfoModel.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long nativeGetMcfTypeId33 = CowatchMediaInfoModel.nativeGetMcfTypeId();
                CowatchMediaInfoModel.sMcfTypeId = nativeGetMcfTypeId33;
                return nativeGetMcfTypeId33;
            case 33:
                long j34 = CowatchPlayerInternalModel.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long nativeGetMcfTypeId34 = CowatchPlayerInternalModel.nativeGetMcfTypeId();
                CowatchPlayerInternalModel.sMcfTypeId = nativeGetMcfTypeId34;
                return nativeGetMcfTypeId34;
            case 34:
                long j35 = CowatchPlayerIosModel.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long nativeGetMcfTypeId35 = CowatchPlayerIosModel.nativeGetMcfTypeId();
                CowatchPlayerIosModel.sMcfTypeId = nativeGetMcfTypeId35;
                return nativeGetMcfTypeId35;
            case 35:
                long j36 = CowatchPlayerModel.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long nativeGetMcfTypeId36 = CowatchPlayerModel.nativeGetMcfTypeId();
                CowatchPlayerModel.sMcfTypeId = nativeGetMcfTypeId36;
                return nativeGetMcfTypeId36;
            case 36:
                long j37 = CowatchReelsMediaHashtagModel.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long nativeGetMcfTypeId37 = CowatchReelsMediaHashtagModel.nativeGetMcfTypeId();
                CowatchReelsMediaHashtagModel.sMcfTypeId = nativeGetMcfTypeId37;
                return nativeGetMcfTypeId37;
            case 37:
                long j38 = CowatchReelsMediaInfoModel.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long nativeGetMcfTypeId38 = CowatchReelsMediaInfoModel.nativeGetMcfTypeId();
                CowatchReelsMediaInfoModel.sMcfTypeId = nativeGetMcfTypeId38;
                return nativeGetMcfTypeId38;
            case 38:
                long j39 = CowatchSuggestedContentQueueModel.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long nativeGetMcfTypeId39 = CowatchSuggestedContentQueueModel.nativeGetMcfTypeId();
                CowatchSuggestedContentQueueModel.sMcfTypeId = nativeGetMcfTypeId39;
                return nativeGetMcfTypeId39;
            case 39:
                long j40 = DataApi.CProxy.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long nativeGetMcfTypeId40 = DataApi.CProxy.nativeGetMcfTypeId();
                DataApi.CProxy.sMcfTypeId = nativeGetMcfTypeId40;
                return nativeGetMcfTypeId40;
            case 40:
                long j41 = DataChannelConfig.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long nativeGetMcfTypeId41 = DataChannelConfig.nativeGetMcfTypeId();
                DataChannelConfig.sMcfTypeId = nativeGetMcfTypeId41;
                return nativeGetMcfTypeId41;
            case Seq.NULL_REFNUM /*41*/:
                long j42 = DataChannelMessageParams.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long nativeGetMcfTypeId42 = DataChannelMessageParams.nativeGetMcfTypeId();
                DataChannelMessageParams.sMcfTypeId = nativeGetMcfTypeId42;
                return nativeGetMcfTypeId42;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                long j43 = DataTransport.CProxy.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long nativeGetMcfTypeId43 = DataTransport.CProxy.nativeGetMcfTypeId();
                DataTransport.CProxy.sMcfTypeId = nativeGetMcfTypeId43;
                return nativeGetMcfTypeId43;
            case 43:
                long j44 = ErrorMessageFallback.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long nativeGetMcfTypeId44 = ErrorMessageFallback.nativeGetMcfTypeId();
                ErrorMessageFallback.sMcfTypeId = nativeGetMcfTypeId44;
                return nativeGetMcfTypeId44;
            case 44:
                long j45 = UnsupportedCapabilityFallbacks.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long nativeGetMcfTypeId45 = UnsupportedCapabilityFallbacks.nativeGetMcfTypeId();
                UnsupportedCapabilityFallbacks.sMcfTypeId = nativeGetMcfTypeId45;
                return nativeGetMcfTypeId45;
            case 45:
                long j46 = VideoQuality.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long nativeGetMcfTypeId46 = VideoQuality.nativeGetMcfTypeId();
                VideoQuality.sMcfTypeId = nativeGetMcfTypeId46;
                return nativeGetMcfTypeId46;
            case 46:
                long j47 = VideoStats.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long nativeGetMcfTypeId47 = VideoStats.nativeGetMcfTypeId();
                VideoStats.sMcfTypeId = nativeGetMcfTypeId47;
                return nativeGetMcfTypeId47;
            case 47:
                long j48 = Task.CProxy.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long nativeGetMcfTypeId48 = Task.CProxy.nativeGetMcfTypeId();
                Task.CProxy.sMcfTypeId = nativeGetMcfTypeId48;
                return nativeGetMcfTypeId48;
            case 48:
                long j49 = TaskExecutor.CProxy.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long nativeGetMcfTypeId49 = TaskExecutor.CProxy.nativeGetMcfTypeId();
                TaskExecutor.CProxy.sMcfTypeId = nativeGetMcfTypeId49;
                return nativeGetMcfTypeId49;
            case 49:
                long j50 = LargeLogUploadProxy.CProxy.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long nativeGetMcfTypeId50 = LargeLogUploadProxy.CProxy.nativeGetMcfTypeId();
                LargeLogUploadProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId50;
                return nativeGetMcfTypeId50;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                long j51 = LogFileData.sMcfTypeId;
                if (j51 != 0) {
                    return j51;
                }
                long nativeGetMcfTypeId51 = LogFileData.nativeGetMcfTypeId();
                LogFileData.sMcfTypeId = nativeGetMcfTypeId51;
                return nativeGetMcfTypeId51;
            case 51:
                long j52 = GridApi.CProxy.sMcfTypeId;
                if (j52 != 0) {
                    return j52;
                }
                long nativeGetMcfTypeId52 = GridApi.CProxy.nativeGetMcfTypeId();
                GridApi.CProxy.sMcfTypeId = nativeGetMcfTypeId52;
                return nativeGetMcfTypeId52;
            case 52:
                long j53 = GridDisplayEligibleStates.sMcfTypeId;
                if (j53 != 0) {
                    return j53;
                }
                long nativeGetMcfTypeId53 = GridDisplayEligibleStates.nativeGetMcfTypeId();
                GridDisplayEligibleStates.sMcfTypeId = nativeGetMcfTypeId53;
                return nativeGetMcfTypeId53;
            case 53:
                long j54 = GridGroupOptions.sMcfTypeId;
                if (j54 != 0) {
                    return j54;
                }
                long nativeGetMcfTypeId54 = GridGroupOptions.nativeGetMcfTypeId();
                GridGroupOptions.sMcfTypeId = nativeGetMcfTypeId54;
                return nativeGetMcfTypeId54;
            case 54:
                long j55 = GridModel.sMcfTypeId;
                if (j55 != 0) {
                    return j55;
                }
                long nativeGetMcfTypeId55 = GridModel.nativeGetMcfTypeId();
                GridModel.sMcfTypeId = nativeGetMcfTypeId55;
                return nativeGetMcfTypeId55;
            case 55:
                long j56 = GridOrderingParameters.sMcfTypeId;
                if (j56 != 0) {
                    return j56;
                }
                long nativeGetMcfTypeId56 = GridOrderingParameters.nativeGetMcfTypeId();
                GridOrderingParameters.sMcfTypeId = nativeGetMcfTypeId56;
                return nativeGetMcfTypeId56;
            case 56:
                long j57 = GroupExpansionCompletedCallback.CProxy.sMcfTypeId;
                if (j57 != 0) {
                    return j57;
                }
                long nativeGetMcfTypeId57 = GroupExpansionCompletedCallback.CProxy.nativeGetMcfTypeId();
                GroupExpansionCompletedCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId57;
                return nativeGetMcfTypeId57;
            case 57:
                long j58 = LiveStreamOptInInfo.sMcfTypeId;
                if (j58 != 0) {
                    return j58;
                }
                long nativeGetMcfTypeId58 = LiveStreamOptInInfo.nativeGetMcfTypeId();
                LiveStreamOptInInfo.sMcfTypeId = nativeGetMcfTypeId58;
                return nativeGetMcfTypeId58;
            case 58:
                long j59 = LiveVideoBroadcastLifecycleCallback.CProxy.sMcfTypeId;
                if (j59 != 0) {
                    return j59;
                }
                long nativeGetMcfTypeId59 = LiveVideoBroadcastLifecycleCallback.CProxy.nativeGetMcfTypeId();
                LiveVideoBroadcastLifecycleCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId59;
                return nativeGetMcfTypeId59;
            case 59:
                long j60 = LiveVideoCancelCreatedNotStartedParameters.sMcfTypeId;
                if (j60 != 0) {
                    return j60;
                }
                long nativeGetMcfTypeId60 = LiveVideoCancelCreatedNotStartedParameters.nativeGetMcfTypeId();
                LiveVideoCancelCreatedNotStartedParameters.sMcfTypeId = nativeGetMcfTypeId60;
                return nativeGetMcfTypeId60;
            case 60:
                long j61 = LiveVideoCreationParameters.sMcfTypeId;
                if (j61 != 0) {
                    return j61;
                }
                long nativeGetMcfTypeId61 = LiveVideoCreationParameters.nativeGetMcfTypeId();
                LiveVideoCreationParameters.sMcfTypeId = nativeGetMcfTypeId61;
                return nativeGetMcfTypeId61;
            case 61:
                long j62 = LiveVideoEndParameters.sMcfTypeId;
                if (j62 != 0) {
                    return j62;
                }
                long nativeGetMcfTypeId62 = LiveVideoEndParameters.nativeGetMcfTypeId();
                LiveVideoEndParameters.sMcfTypeId = nativeGetMcfTypeId62;
                return nativeGetMcfTypeId62;
            case 62:
                long j63 = LiveVideoMetadata.sMcfTypeId;
                if (j63 != 0) {
                    return j63;
                }
                long nativeGetMcfTypeId63 = LiveVideoMetadata.nativeGetMcfTypeId();
                LiveVideoMetadata.sMcfTypeId = nativeGetMcfTypeId63;
                return nativeGetMcfTypeId63;
            case 63:
                long j64 = LiveVideoModel.sMcfTypeId;
                if (j64 != 0) {
                    return j64;
                }
                long nativeGetMcfTypeId64 = LiveVideoModel.nativeGetMcfTypeId();
                LiveVideoModel.sMcfTypeId = nativeGetMcfTypeId64;
                return nativeGetMcfTypeId64;
            case 64:
                long j65 = LiveVideoStartParameters.sMcfTypeId;
                if (j65 != 0) {
                    return j65;
                }
                long nativeGetMcfTypeId65 = LiveVideoStartParameters.nativeGetMcfTypeId();
                LiveVideoStartParameters.sMcfTypeId = nativeGetMcfTypeId65;
                return nativeGetMcfTypeId65;
            case 65:
                long j66 = LiveVideoStore.CProxy.sMcfTypeId;
                if (j66 != 0) {
                    return j66;
                }
                long nativeGetMcfTypeId66 = LiveVideoStore.CProxy.nativeGetMcfTypeId();
                LiveVideoStore.CProxy.sMcfTypeId = nativeGetMcfTypeId66;
                return nativeGetMcfTypeId66;
            case 66:
                long j67 = LiveVideoStoreHandler.CProxy.sMcfTypeId;
                if (j67 != 0) {
                    return j67;
                }
                long nativeGetMcfTypeId67 = LiveVideoStoreHandler.CProxy.nativeGetMcfTypeId();
                LiveVideoStoreHandler.CProxy.sMcfTypeId = nativeGetMcfTypeId67;
                return nativeGetMcfTypeId67;
            case 67:
                long j68 = CallSummaryInfo.sMcfTypeId;
                if (j68 != 0) {
                    return j68;
                }
                long nativeGetMcfTypeId68 = CallSummaryInfo.nativeGetMcfTypeId();
                CallSummaryInfo.sMcfTypeId = nativeGetMcfTypeId68;
                return nativeGetMcfTypeId68;
            case 68:
                long j69 = LogModel.sMcfTypeId;
                if (j69 != 0) {
                    return j69;
                }
                long nativeGetMcfTypeId69 = LogModel.nativeGetMcfTypeId();
                LogModel.sMcfTypeId = nativeGetMcfTypeId69;
                return nativeGetMcfTypeId69;
            case 69:
                long j70 = StreamInfo.sMcfTypeId;
                if (j70 != 0) {
                    return j70;
                }
                long nativeGetMcfTypeId70 = StreamInfo.nativeGetMcfTypeId();
                StreamInfo.sMcfTypeId = nativeGetMcfTypeId70;
                return nativeGetMcfTypeId70;
            default:
                long j71 = UserStreamInfo.sMcfTypeId;
                if (j71 != 0) {
                    return j71;
                }
                long nativeGetMcfTypeId71 = UserStreamInfo.nativeGetMcfTypeId();
                UserStreamInfo.sMcfTypeId = nativeGetMcfTypeId71;
                return nativeGetMcfTypeId71;
        }
    }
}
