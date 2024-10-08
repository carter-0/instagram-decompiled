package com.facebook.rsys.polls.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class PollsFeaturePermissionsModel {
    public static 2LV CONVERTER = C22181Xwr.A00(37);
    public static long sMcfTypeId;
    public final boolean canCreatePoll;
    public final boolean isCreationEnabled;

    public static native PollsFeaturePermissionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsFeaturePermissionsModel)) {
            return false;
        }
        PollsFeaturePermissionsModel pollsFeaturePermissionsModel = (PollsFeaturePermissionsModel) obj;
        return this.isCreationEnabled == pollsFeaturePermissionsModel.isCreationEnabled && this.canCreatePoll == pollsFeaturePermissionsModel.canCreatePoll;
    }

    public int hashCode() {
        return C66583MXo.A01(this.isCreationEnabled ? 1 : 0) + (this.canCreatePoll ? 1 : 0);
    }

    public PollsFeaturePermissionsModel(boolean z, boolean z2) {
        this.isCreationEnabled = z;
        this.canCreatePoll = z2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollsFeaturePermissionsModel{isCreationEnabled=");
        A1A.append(this.isCreationEnabled);
        A1A.append(",canCreatePoll=");
        return C66584MXp.A0b(A1A, this.canCreatePoll);
    }
}
