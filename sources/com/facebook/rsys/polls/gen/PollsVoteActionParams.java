package com.facebook.rsys.polls.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PollsVoteActionParams {
    public static 2LV CONVERTER = C22181Xwr.A00(41);
    public static long sMcfTypeId;
    public final String pollOptionId;

    public static native PollsVoteActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsVoteActionParams)) {
            return false;
        }
        return this.pollOptionId.equals(((PollsVoteActionParams) obj).pollOptionId);
    }

    public int hashCode() {
        return 527 + this.pollOptionId.hashCode();
    }

    public String toString() {
        return 002.A0g("PollsVoteActionParams{pollOptionId=", this.pollOptionId, "}");
    }

    public PollsVoteActionParams(String str) {
        str.getClass();
        this.pollOptionId = str;
    }
}
