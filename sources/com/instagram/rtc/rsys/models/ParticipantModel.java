package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;

public class ParticipantModel {
    public static 2LV CONVERTER = new C71545Omg(25);
    public static long sMcfTypeId;
    public final boolean audioEnabled;
    public final boolean hasVoiceActivity;
    public final String rendererId;
    public final int state;
    public final String userId;
    public final boolean videoEnabled;
    public final boolean videoStalled;

    public static native ParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantModel)) {
            return false;
        }
        ParticipantModel participantModel = (ParticipantModel) obj;
        return this.userId.equals(participantModel.userId) && this.rendererId.equals(participantModel.rendererId) && this.state == participantModel.state && this.audioEnabled == participantModel.audioEnabled && this.videoEnabled == participantModel.videoEnabled && this.videoStalled == participantModel.videoStalled && this.hasVoiceActivity == participantModel.hasVoiceActivity;
    }

    public int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.rendererId, C66583MXo.A06(this.userId)) + this.state) * 31) + (this.audioEnabled ? 1 : 0)) * 31) + (this.videoEnabled ? 1 : 0)) * 31) + (this.videoStalled ? 1 : 0)) * 31) + (this.hasVoiceActivity ? 1 : 0);
    }

    public ParticipantModel(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        this.userId = str;
        this.rendererId = str2;
        this.state = i;
        this.audioEnabled = z;
        this.videoEnabled = z2;
        this.videoStalled = z3;
        this.hasVoiceActivity = z4;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ParticipantModel{userId=");
        A1A.append(this.userId);
        A1A.append(",rendererId=");
        A1A.append(this.rendererId);
        A1A.append(",state=");
        A1A.append(this.state);
        A1A.append(",audioEnabled=");
        A1A.append(this.audioEnabled);
        A1A.append(",videoEnabled=");
        A1A.append(this.videoEnabled);
        A1A.append(",videoStalled=");
        A1A.append(this.videoStalled);
        A1A.append(",hasVoiceActivity=");
        return C66584MXp.A0b(A1A, this.hasVoiceActivity);
    }
}
