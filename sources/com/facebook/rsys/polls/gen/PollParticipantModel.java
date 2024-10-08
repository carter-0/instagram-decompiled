package com.facebook.rsys.polls.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PollParticipantModel {
    public static 2LV CONVERTER = C22181Xwr.A00(32);
    public static long sMcfTypeId;
    public final String fbid;

    public static native PollParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollParticipantModel)) {
                return false;
            }
            String str = this.fbid;
            String str2 = ((PollParticipantModel) obj).fbid;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return 527 + AnonymousClass7TG.A0E(this.fbid);
    }

    public String toString() {
        return 002.A0g("PollParticipantModel{fbid=", this.fbid, "}");
    }

    public PollParticipantModel(String str) {
        this.fbid = str;
    }
}
