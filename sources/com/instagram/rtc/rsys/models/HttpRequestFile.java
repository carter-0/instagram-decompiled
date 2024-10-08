package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

public class HttpRequestFile {
    public static 2LV CONVERTER = new C71545Omg(22);
    public static long sMcfTypeId;
    public final String contentType;
    public final byte[] data;

    public static native HttpRequestFile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequestFile)) {
            return false;
        }
        HttpRequestFile httpRequestFile = (HttpRequestFile) obj;
        return Arrays.equals(this.data, httpRequestFile.data) && this.contentType.equals(httpRequestFile.contentType);
    }

    public int hashCode() {
        return C41845B3m.A01(this.contentType, C66583MXo.A01(Arrays.hashCode(this.data)));
    }

    public HttpRequestFile(byte[] bArr, String str) {
        bArr.getClass();
        str.getClass();
        this.data = bArr;
        this.contentType = str;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HttpRequestFile{data=");
        A1A.append(this.data);
        A1A.append(",contentType=");
        return C66584MXp.A0a(this.contentType, A1A);
    }
}
