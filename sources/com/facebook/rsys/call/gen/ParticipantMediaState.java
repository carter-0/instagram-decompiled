package com.facebook.rsys.call.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class ParticipantMediaState {
    public static 2LV CONVERTER = C71546Omh.A00(14);
    public static long sMcfTypeId;
    public final ArrayList audioStreams;
    public final ArrayList videoStreams;

    public static native ParticipantMediaState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantMediaState)) {
            return false;
        }
        ParticipantMediaState participantMediaState = (ParticipantMediaState) obj;
        return this.videoStreams.equals(participantMediaState.videoStreams) && this.audioStreams.equals(participantMediaState.audioStreams);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.audioStreams, C66583MXo.A01(this.videoStreams.hashCode()));
    }

    public ParticipantMediaState(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.videoStreams = arrayList;
        this.audioStreams = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ParticipantMediaState{videoStreams=");
        A1A.append(this.videoStreams);
        A1A.append(",audioStreams=");
        return C66582MXn.A0v(this.audioStreams, A1A);
    }
}
