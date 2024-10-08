package com.facebook.rsys.polls.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PollsRemoveActionParams {
    public static 2LV CONVERTER = C22181Xwr.A00(39);
    public static long sMcfTypeId;
    public final String pollId;

    public static native PollsRemoveActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsRemoveActionParams)) {
            return false;
        }
        return this.pollId.equals(((PollsRemoveActionParams) obj).pollId);
    }

    public int hashCode() {
        return 527 + this.pollId.hashCode();
    }

    public String toString() {
        return 002.A0g("PollsRemoveActionParams{pollId=", this.pollId, "}");
    }

    public PollsRemoveActionParams(String str) {
        str.getClass();
        this.pollId = str;
    }
}
