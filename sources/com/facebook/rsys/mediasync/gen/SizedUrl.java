package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class SizedUrl {
    public static 2LV CONVERTER = C71546Omh.A00(59);
    public static long sMcfTypeId;
    public final int height;
    public final String type;
    public final String url;
    public final int width;

    public static native SizedUrl createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SizedUrl)) {
                return false;
            }
            SizedUrl sizedUrl = (SizedUrl) obj;
            if (!this.url.equals(sizedUrl.url) || this.height != sizedUrl.height || this.width != sizedUrl.width) {
                return false;
            }
            String str = this.type;
            String str2 = sizedUrl.type;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C66583MXo.A06(this.url) + this.height) * 31) + this.width) * 31) + AnonymousClass7TG.A0E(this.type);
    }

    public SizedUrl(String str, int i, int i2, String str2) {
        str.getClass();
        this.url = str;
        this.height = i;
        this.width = i2;
        this.type = str2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SizedUrl{url=");
        A1A.append(this.url);
        A1A.append(",height=");
        A1A.append(this.height);
        A1A.append(",width=");
        A1A.append(this.width);
        A1A.append(",type=");
        return C66584MXp.A0a(this.type, A1A);
    }
}
