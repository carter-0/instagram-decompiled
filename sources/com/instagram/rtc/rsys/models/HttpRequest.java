package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class HttpRequest {
    public static 2LV CONVERTER = new C71545Omg(21);
    public static long sMcfTypeId;
    public final Map files;
    public final String path;
    public final Map payload;
    public final String requestId;
    public final int requestMethod;
    public final int requestType;

    public static native HttpRequest createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return this.requestId.equals(httpRequest.requestId) && this.path.equals(httpRequest.path) && this.requestType == httpRequest.requestType && this.requestMethod == httpRequest.requestMethod && this.payload.equals(httpRequest.payload) && this.files.equals(httpRequest.files);
    }

    public int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.path, C66583MXo.A06(this.requestId)) + this.requestType) * 31) + this.requestMethod) * 31) + this.payload.hashCode()) * 31) + this.files.hashCode();
    }

    public HttpRequest(String str, String str2, int i, int i2, Map map, Map map2) {
        C66581MXm.A1R(str, str2, map);
        map2.getClass();
        this.requestId = str;
        this.path = str2;
        this.requestType = i;
        this.requestMethod = i2;
        this.payload = map;
        this.files = map2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HttpRequest{requestId=");
        A1A.append(this.requestId);
        A1A.append(",path=");
        A1A.append(this.path);
        A1A.append(",requestType=");
        A1A.append(this.requestType);
        A1A.append(",requestMethod=");
        A1A.append(this.requestMethod);
        A1A.append(",payload=");
        A1A.append(this.payload);
        A1A.append(",files=");
        return C66582MXn.A0v(this.files, A1A);
    }
}
