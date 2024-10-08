package com.facebook.rsys.polls.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

public class PollsStateChangedActionParams {
    public final PollsFeaturePermissionsModel permissions;
    public final Map polls;
    public final HashSet processedActionIds;

    public static native PollsStateChangedActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsStateChangedActionParams)) {
            return false;
        }
        PollsStateChangedActionParams pollsStateChangedActionParams = (PollsStateChangedActionParams) obj;
        return this.polls.equals(pollsStateChangedActionParams.polls) && this.permissions.equals(pollsStateChangedActionParams.permissions) && this.processedActionIds.equals(pollsStateChangedActionParams.processedActionIds);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.processedActionIds, AnonymousClass7TF.A07(this.permissions, C66583MXo.A01(this.polls.hashCode())));
    }

    public PollsStateChangedActionParams(Map map, PollsFeaturePermissionsModel pollsFeaturePermissionsModel, HashSet hashSet) {
        C66581MXm.A1R(map, pollsFeaturePermissionsModel, hashSet);
        this.polls = map;
        this.permissions = pollsFeaturePermissionsModel;
        this.processedActionIds = hashSet;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollsStateChangedActionParams{polls=");
        A1A.append(this.polls);
        A1A.append(",permissions=");
        A1A.append(this.permissions);
        A1A.append(",processedActionIds=");
        return C66582MXn.A0v(this.processedActionIds, A1A);
    }
}
