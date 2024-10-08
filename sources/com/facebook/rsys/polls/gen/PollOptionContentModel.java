package com.facebook.rsys.polls.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PollOptionContentModel {
    public static 2LV CONVERTER = C22181Xwr.A00(29);
    public static long sMcfTypeId;
    public final String text;

    public static native PollOptionContentModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollOptionContentModel)) {
                return false;
            }
            String str = this.text;
            String str2 = ((PollOptionContentModel) obj).text;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return 527 + AnonymousClass7TG.A0E(this.text);
    }

    public String toString() {
        return 002.A0g("PollOptionContentModel{text=", this.text, "}");
    }

    public PollOptionContentModel(String str) {
        this.text = str;
    }
}
