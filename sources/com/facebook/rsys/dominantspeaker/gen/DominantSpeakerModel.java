package com.facebook.rsys.dominantspeaker.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class DominantSpeakerModel {
    public static 2LV CONVERTER = C71546Omh.A00(36);
    public static long sMcfTypeId;
    public final String dominantSpeakerUserId;
    public final ArrayList recentDominantSpeakerUserIds;

    public static native DominantSpeakerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DominantSpeakerModel)) {
            return false;
        }
        DominantSpeakerModel dominantSpeakerModel = (DominantSpeakerModel) obj;
        return this.dominantSpeakerUserId.equals(dominantSpeakerModel.dominantSpeakerUserId) && this.recentDominantSpeakerUserIds.equals(dominantSpeakerModel.recentDominantSpeakerUserIds);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.recentDominantSpeakerUserIds, C66583MXo.A06(this.dominantSpeakerUserId));
    }

    public DominantSpeakerModel(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.dominantSpeakerUserId = str;
        this.recentDominantSpeakerUserIds = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DominantSpeakerModel{dominantSpeakerUserId=");
        A1A.append(this.dominantSpeakerUserId);
        A1A.append(",recentDominantSpeakerUserIds=");
        return C66582MXn.A0v(this.recentDominantSpeakerUserIds, A1A);
    }
}
