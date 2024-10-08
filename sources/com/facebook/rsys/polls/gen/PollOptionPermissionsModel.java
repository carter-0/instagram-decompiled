package com.facebook.rsys.polls.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class PollOptionPermissionsModel {
    public static 2LV CONVERTER = C22181Xwr.A00(31);
    public static long sMcfTypeId;
    public final boolean canRemoveVote;
    public final boolean canVote;

    public static native PollOptionPermissionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOptionPermissionsModel)) {
            return false;
        }
        PollOptionPermissionsModel pollOptionPermissionsModel = (PollOptionPermissionsModel) obj;
        return this.canVote == pollOptionPermissionsModel.canVote && this.canRemoveVote == pollOptionPermissionsModel.canRemoveVote;
    }

    public int hashCode() {
        return C66583MXo.A01(this.canVote ? 1 : 0) + (this.canRemoveVote ? 1 : 0);
    }

    public PollOptionPermissionsModel(boolean z, boolean z2) {
        this.canVote = z;
        this.canRemoveVote = z2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollOptionPermissionsModel{canVote=");
        A1A.append(this.canVote);
        A1A.append(",canRemoveVote=");
        return C66584MXp.A0b(A1A, this.canRemoveVote);
    }
}
