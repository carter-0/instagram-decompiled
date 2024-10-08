package com.facebook.rsys.polls.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PollsRemoveVoteActionParams {
    public static 2LV CONVERTER = C22181Xwr.A00(40);
    public static long sMcfTypeId;
    public final String pollOptionId;

    public static native PollsRemoveVoteActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsRemoveVoteActionParams)) {
            return false;
        }
        return this.pollOptionId.equals(((PollsRemoveVoteActionParams) obj).pollOptionId);
    }

    public int hashCode() {
        return 527 + this.pollOptionId.hashCode();
    }

    public String toString() {
        return 002.A0g("PollsRemoveVoteActionParams{pollOptionId=", this.pollOptionId, "}");
    }

    public PollsRemoveVoteActionParams(String str) {
        str.getClass();
        this.pollOptionId = str;
    }
}
