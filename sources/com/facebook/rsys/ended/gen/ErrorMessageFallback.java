package com.facebook.rsys.ended.gen;

import X.002;
import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;

public class ErrorMessageFallback {
    public static 2LV CONVERTER = C22180Xwq.A00(43);
    public static long sMcfTypeId;
    public final String message;

    public static native ErrorMessageFallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessageFallback)) {
            return false;
        }
        return this.message.equals(((ErrorMessageFallback) obj).message);
    }

    public int hashCode() {
        return 527 + this.message.hashCode();
    }

    public String toString() {
        return 002.A0g("ErrorMessageFallback{message=", this.message, "}");
    }

    public ErrorMessageFallback(String str) {
        str.getClass();
        this.message = str;
    }
}
