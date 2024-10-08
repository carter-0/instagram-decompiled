package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66581MXm;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class LiveVideoStartParameters {
    public static 2LV CONVERTER = C22180Xwq.A00(64);
    public static long sMcfTypeId;
    public final ArrayList activeParticipants;
    public final String funnelSessionId;
    public final ArrayList participantsMediaStatus;

    public static native LiveVideoStartParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVideoStartParameters)) {
            return false;
        }
        LiveVideoStartParameters liveVideoStartParameters = (LiveVideoStartParameters) obj;
        return this.activeParticipants.equals(liveVideoStartParameters.activeParticipants) && this.participantsMediaStatus.equals(liveVideoStartParameters.participantsMediaStatus) && this.funnelSessionId.equals(liveVideoStartParameters.funnelSessionId);
    }

    public int hashCode() {
        return AnonymousClass7TF.A07(this.participantsMediaStatus, C21056XCh.A01(this.activeParticipants)) + this.funnelSessionId.hashCode();
    }

    public LiveVideoStartParameters(ArrayList arrayList, ArrayList arrayList2, String str) {
        C66581MXm.A1R(arrayList, arrayList2, str);
        this.activeParticipants = arrayList;
        this.participantsMediaStatus = arrayList2;
        this.funnelSessionId = str;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LiveVideoStartParameters{activeParticipants=");
        A1A.append(this.activeParticipants);
        A1A.append(",participantsMediaStatus=");
        A1A.append(this.participantsMediaStatus);
        A1A.append(",funnelSessionId=");
        return C66584MXp.A0a(this.funnelSessionId, A1A);
    }
}
