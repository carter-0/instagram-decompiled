package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audioevents.gen.AudioEventsModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import java.util.ArrayList;
import java.util.Map;

public class IgCallModel {
    public static 2LV CONVERTER = new C71545Omg(23);
    public static long sMcfTypeId;
    public final boolean areAllParticipantsAudioOnly;
    public final AudioEventsModel audioEventsModel;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final int connectionQuality;
    public final CowatchPlayerModel cowatchPlayerModel;
    public final boolean didSendJoinAttempt;
    public final McfReference dropInModel;
    public final boolean e2eeMandated;
    public final int inCallState;
    public final String instagramVideoCallId;
    public final boolean inviteRequestedVideo;
    public final boolean isAudioOnlyCall;
    public final String linkUrl;
    public final String localCallId;
    public final MediaSyncState mediaSyncState;
    public final long numberOfRejoinAttempts;
    public final ArrayList participants;
    public final RingNotification ringNotification;
    public final ParticipantModel selfParticipant;
    public final String serverInfoData;
    public final Map userCapabilities;

    public static native IgCallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IgCallModel)) {
                return false;
            }
            IgCallModel igCallModel = (IgCallModel) obj;
            if (this.inCallState != igCallModel.inCallState || this.connectionQuality != igCallModel.connectionQuality || !this.localCallId.equals(igCallModel.localCallId)) {
                return false;
            }
            String str = this.instagramVideoCallId;
            String str2 = igCallModel.instagramVideoCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.linkUrl;
            String str4 = igCallModel.linkUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.serverInfoData;
            String str6 = igCallModel.serverInfoData;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.selfParticipant.equals(igCallModel.selfParticipant) || !this.participants.equals(igCallModel.participants) || !this.userCapabilities.equals(igCallModel.userCapabilities)) {
                return false;
            }
            MediaSyncState mediaSyncState2 = this.mediaSyncState;
            MediaSyncState mediaSyncState3 = igCallModel.mediaSyncState;
            if (mediaSyncState2 == null) {
                if (mediaSyncState3 != null) {
                    return false;
                }
            } else if (!mediaSyncState2.equals(mediaSyncState3)) {
                return false;
            }
            CowatchPlayerModel cowatchPlayerModel2 = this.cowatchPlayerModel;
            CowatchPlayerModel cowatchPlayerModel3 = igCallModel.cowatchPlayerModel;
            if (cowatchPlayerModel2 == null) {
                if (cowatchPlayerModel3 != null) {
                    return false;
                }
            } else if (!cowatchPlayerModel2.equals(cowatchPlayerModel3)) {
                return false;
            }
            McfReference mcfReference = this.dropInModel;
            McfReference mcfReference2 = igCallModel.dropInModel;
            if (mcfReference == null) {
                if (mcfReference2 != null) {
                    return false;
                }
            } else if (!mcfReference.equals(mcfReference2)) {
                return false;
            }
            if (this.inviteRequestedVideo != igCallModel.inviteRequestedVideo) {
                return false;
            }
            RingNotification ringNotification2 = this.ringNotification;
            RingNotification ringNotification3 = igCallModel.ringNotification;
            if (ringNotification2 == null) {
                if (ringNotification3 != null) {
                    return false;
                }
            } else if (!ringNotification2.equals(ringNotification3)) {
                return false;
            }
            if (this.e2eeMandated != igCallModel.e2eeMandated || this.isAudioOnlyCall != igCallModel.isAudioOnlyCall || this.areAllParticipantsAudioOnly != igCallModel.areAllParticipantsAudioOnly || this.callCreatedTimestampMs != igCallModel.callCreatedTimestampMs || this.callAnsweredTimestampMs != igCallModel.callAnsweredTimestampMs || this.callConnectedTimestampMs != igCallModel.callConnectedTimestampMs || this.callEndedTimestampMs != igCallModel.callEndedTimestampMs) {
                return false;
            }
            AudioEventsModel audioEventsModel2 = this.audioEventsModel;
            AudioEventsModel audioEventsModel3 = igCallModel.audioEventsModel;
            if (audioEventsModel2 == null) {
                if (audioEventsModel3 != null) {
                    return false;
                }
            } else if (!audioEventsModel2.equals(audioEventsModel3)) {
                return false;
            }
            if (!(this.numberOfRejoinAttempts == igCallModel.numberOfRejoinAttempts && this.didSendJoinAttempt == igCallModel.didSendJoinAttempt)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.localCallId;
        int A07 = AnonymousClass7TF.A07(this.selfParticipant, (((((AnonymousClass7TF.A08(str, (C66583MXo.A01(this.inCallState) + this.connectionQuality) * 31) + AnonymousClass7TG.A0E(this.instagramVideoCallId)) * 31) + AnonymousClass7TG.A0E(this.linkUrl)) * 31) + AnonymousClass7TG.A0E(this.serverInfoData)) * 31);
        int A01 = AnonymousClass7TF.A01(this.callConnectedTimestampMs, AnonymousClass7TF.A01(this.callAnsweredTimestampMs, AnonymousClass7TF.A01(this.callCreatedTimestampMs, (((((((((((((((((AnonymousClass7TF.A07(this.participants, A07) + this.userCapabilities.hashCode()) * 31) + AnonymousClass7TG.A0C(this.mediaSyncState)) * 31) + AnonymousClass7TG.A0C(this.cowatchPlayerModel)) * 31) + AnonymousClass7TG.A0C(this.dropInModel)) * 31) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.ringNotification)) * 31) + (this.e2eeMandated ? 1 : 0)) * 31) + (this.isAudioOnlyCall ? 1 : 0)) * 31) + (this.areAllParticipantsAudioOnly ? 1 : 0)) * 31)));
        return AnonymousClass7TF.A01(this.numberOfRejoinAttempts, (AnonymousClass7TF.A01(this.callEndedTimestampMs, A01) + AnonymousClass7TE.A0L(this.audioEventsModel)) * 31) + (this.didSendJoinAttempt ? 1 : 0);
    }

    public IgCallModel(int i, int i2, String str, String str2, String str3, String str4, ParticipantModel participantModel, ArrayList arrayList, Map map, MediaSyncState mediaSyncState2, CowatchPlayerModel cowatchPlayerModel2, McfReference mcfReference, boolean z, RingNotification ringNotification2, boolean z2, boolean z3, boolean z4, long j, long j2, long j3, long j4, AudioEventsModel audioEventsModel2, long j5, boolean z5) {
        C66581MXm.A1R(str, participantModel, arrayList);
        map.getClass();
        this.inCallState = i;
        this.connectionQuality = i2;
        this.localCallId = str;
        this.instagramVideoCallId = str2;
        this.linkUrl = str3;
        this.serverInfoData = str4;
        this.selfParticipant = participantModel;
        this.participants = arrayList;
        this.userCapabilities = map;
        this.mediaSyncState = mediaSyncState2;
        this.cowatchPlayerModel = cowatchPlayerModel2;
        this.dropInModel = mcfReference;
        this.inviteRequestedVideo = z;
        this.ringNotification = ringNotification2;
        this.e2eeMandated = z2;
        this.isAudioOnlyCall = z3;
        this.areAllParticipantsAudioOnly = z4;
        this.callCreatedTimestampMs = j;
        this.callAnsweredTimestampMs = j2;
        this.callConnectedTimestampMs = j3;
        this.callEndedTimestampMs = j4;
        this.audioEventsModel = audioEventsModel2;
        this.numberOfRejoinAttempts = j5;
        this.didSendJoinAttempt = z5;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IgCallModel{inCallState=");
        A1A.append(this.inCallState);
        A1A.append(",connectionQuality=");
        A1A.append(this.connectionQuality);
        A1A.append(",localCallId=");
        A1A.append(this.localCallId);
        A1A.append(",instagramVideoCallId=");
        A1A.append(this.instagramVideoCallId);
        A1A.append(",linkUrl=");
        A1A.append(this.linkUrl);
        A1A.append(",serverInfoData=");
        A1A.append(this.serverInfoData);
        A1A.append(",selfParticipant=");
        A1A.append(this.selfParticipant);
        A1A.append(",participants=");
        A1A.append(this.participants);
        A1A.append(",userCapabilities=");
        A1A.append(this.userCapabilities);
        A1A.append(",mediaSyncState=");
        A1A.append(this.mediaSyncState);
        A1A.append(",cowatchPlayerModel=");
        A1A.append(this.cowatchPlayerModel);
        A1A.append(",dropInModel=");
        A1A.append(this.dropInModel);
        A1A.append(",inviteRequestedVideo=");
        A1A.append(this.inviteRequestedVideo);
        A1A.append(",ringNotification=");
        A1A.append(this.ringNotification);
        A1A.append(",e2eeMandated=");
        A1A.append(this.e2eeMandated);
        A1A.append(",isAudioOnlyCall=");
        A1A.append(this.isAudioOnlyCall);
        A1A.append(",areAllParticipantsAudioOnly=");
        A1A.append(this.areAllParticipantsAudioOnly);
        A1A.append(",callCreatedTimestampMs=");
        A1A.append(this.callCreatedTimestampMs);
        A1A.append(",callAnsweredTimestampMs=");
        A1A.append(this.callAnsweredTimestampMs);
        A1A.append(",callConnectedTimestampMs=");
        A1A.append(this.callConnectedTimestampMs);
        A1A.append(",callEndedTimestampMs=");
        A1A.append(this.callEndedTimestampMs);
        A1A.append(",audioEventsModel=");
        A1A.append(this.audioEventsModel);
        A1A.append(",numberOfRejoinAttempts=");
        A1A.append(this.numberOfRejoinAttempts);
        A1A.append(",didSendJoinAttempt=");
        return C66584MXp.A0b(A1A, this.didSendJoinAttempt);
    }
}
