package com.facebook.rsys.polls.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66579MXk;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class PollsPendingActionModel {
    public static 2LV CONVERTER = C22181Xwr.A00(38);
    public static long sMcfTypeId;
    public final String actionId;
    public final int actionType;
    public final PollsCreateActionParams createActionParams;
    public final PollsRemoveActionParams removeActionParams;
    public final PollsRemoveVoteActionParams removeVoteActionParams;
    public final PollsVoteActionParams voteActionParams;

    public static native PollsPendingActionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollsPendingActionModel)) {
                return false;
            }
            PollsPendingActionModel pollsPendingActionModel = (PollsPendingActionModel) obj;
            if (!this.actionId.equals(pollsPendingActionModel.actionId) || this.actionType != pollsPendingActionModel.actionType) {
                return false;
            }
            PollsCreateActionParams pollsCreateActionParams = this.createActionParams;
            PollsCreateActionParams pollsCreateActionParams2 = pollsPendingActionModel.createActionParams;
            if (pollsCreateActionParams == null) {
                if (pollsCreateActionParams2 != null) {
                    return false;
                }
            } else if (!pollsCreateActionParams.equals(pollsCreateActionParams2)) {
                return false;
            }
            PollsRemoveActionParams pollsRemoveActionParams = this.removeActionParams;
            PollsRemoveActionParams pollsRemoveActionParams2 = pollsPendingActionModel.removeActionParams;
            if (pollsRemoveActionParams == null) {
                if (pollsRemoveActionParams2 != null) {
                    return false;
                }
            } else if (!pollsRemoveActionParams.equals(pollsRemoveActionParams2)) {
                return false;
            }
            PollsVoteActionParams pollsVoteActionParams = this.voteActionParams;
            PollsVoteActionParams pollsVoteActionParams2 = pollsPendingActionModel.voteActionParams;
            if (pollsVoteActionParams == null) {
                if (pollsVoteActionParams2 != null) {
                    return false;
                }
            } else if (!pollsVoteActionParams.equals(pollsVoteActionParams2)) {
                return false;
            }
            PollsRemoveVoteActionParams pollsRemoveVoteActionParams = this.removeVoteActionParams;
            PollsRemoveVoteActionParams pollsRemoveVoteActionParams2 = pollsPendingActionModel.removeVoteActionParams;
            if (pollsRemoveVoteActionParams != null) {
                return pollsRemoveVoteActionParams.equals(pollsRemoveVoteActionParams2);
            }
            if (pollsRemoveVoteActionParams2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((C66583MXo.A06(this.actionId) + this.actionType) * 31) + AnonymousClass7TG.A0C(this.createActionParams)) * 31) + AnonymousClass7TG.A0C(this.removeActionParams)) * 31) + AnonymousClass7TG.A0C(this.voteActionParams)) * 31) + AnonymousClass7TE.A0L(this.removeVoteActionParams);
    }

    public PollsPendingActionModel(String str, int i, PollsCreateActionParams pollsCreateActionParams, PollsRemoveActionParams pollsRemoveActionParams, PollsVoteActionParams pollsVoteActionParams, PollsRemoveVoteActionParams pollsRemoveVoteActionParams) {
        str.getClass();
        this.actionId = str;
        this.actionType = i;
        this.createActionParams = pollsCreateActionParams;
        this.removeActionParams = pollsRemoveActionParams;
        this.voteActionParams = pollsVoteActionParams;
        this.removeVoteActionParams = pollsRemoveVoteActionParams;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollsPendingActionModel{actionId=");
        A1A.append(this.actionId);
        A1A.append(C66579MXk.A00(448));
        A1A.append(this.actionType);
        A1A.append(",createActionParams=");
        A1A.append(this.createActionParams);
        A1A.append(",removeActionParams=");
        A1A.append(this.removeActionParams);
        A1A.append(",voteActionParams=");
        A1A.append(this.voteActionParams);
        A1A.append(",removeVoteActionParams=");
        return C66582MXn.A0v(this.removeVoteActionParams, A1A);
    }
}
