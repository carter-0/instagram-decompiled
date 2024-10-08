package com.facebook.rsys.mediasync.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class Placeholder {
    public static 2LV CONVERTER = C71546Omh.A00(58);
    public static long sMcfTypeId;
    public final String contentId;
    public final String message;
    public final String title;

    public static native Placeholder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return this.contentId.equals(placeholder.contentId) && this.title.equals(placeholder.title) && this.message.equals(placeholder.message);
    }

    public int hashCode() {
        return C41845B3m.A01(this.message, AnonymousClass7TF.A08(this.title, C66583MXo.A06(this.contentId)));
    }

    public String toString() {
        return 002.A15("Placeholder{contentId=", this.contentId, ",title=", this.title, ",message=", this.message, "}");
    }

    public Placeholder(String str, String str2, String str3) {
        C66581MXm.A1R(str, str2, str3);
        this.contentId = str;
        this.title = str2;
        this.message = str3;
    }
}
