package com.facebook.rsys.networktraffic.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C12068SmN;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class HttpStats {
    public static 2LV CONVERTER = new C12068SmN(2);
    public static long sMcfTypeId;
    public final String errorDescription;
    public final String httpMethod;
    public final String networkType;
    public final long requestBodyBytes;
    public final String requestCallPath;
    public final int requestCategory;
    public final String requestFriendlyName;
    public final long requestHeaderBytes;
    public final String requestSurface;
    public final String requestUri;
    public final long responseBodyBytes;
    public final long responseHeaderBytes;
    public final int statusCode;

    public static native HttpStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HttpStats)) {
                return false;
            }
            HttpStats httpStats = (HttpStats) obj;
            if (this.requestHeaderBytes != httpStats.requestHeaderBytes || this.requestBodyBytes != httpStats.requestBodyBytes || this.responseHeaderBytes != httpStats.responseHeaderBytes || this.responseBodyBytes != httpStats.responseBodyBytes || !this.requestUri.equals(httpStats.requestUri) || !this.requestFriendlyName.equals(httpStats.requestFriendlyName) || !this.requestCallPath.equals(httpStats.requestCallPath) || this.requestCategory != httpStats.requestCategory || this.statusCode != httpStats.statusCode || !this.httpMethod.equals(httpStats.httpMethod)) {
                return false;
            }
            String str = this.errorDescription;
            String str2 = httpStats.errorDescription;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.networkType;
            String str4 = httpStats.networkType;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.requestSurface;
            String str6 = httpStats.requestSurface;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        long j = this.requestHeaderBytes;
        int A01 = AnonymousClass7TF.A01(this.responseHeaderBytes, AnonymousClass7TF.A01(this.requestBodyBytes, C66583MXo.A01((int) (j ^ (j >>> 32)))));
        long j2 = this.responseBodyBytes;
        int A08 = AnonymousClass7TF.A08(this.requestFriendlyName, AnonymousClass7TF.A08(this.requestUri, (A01 + ((int) ((j2 >>> 32) ^ j2))) * 31));
        return ((((AnonymousClass7TF.A08(this.httpMethod, (((AnonymousClass7TF.A08(this.requestCallPath, A08) + this.requestCategory) * 31) + this.statusCode) * 31) + AnonymousClass7TG.A0E(this.errorDescription)) * 31) + AnonymousClass7TG.A0E(this.networkType)) * 31) + C41845B3m.A00(this.requestSurface);
    }

    public HttpStats(long j, long j2, long j3, long j4, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.requestHeaderBytes = j;
        this.requestBodyBytes = j2;
        this.responseHeaderBytes = j3;
        this.responseBodyBytes = j4;
        this.requestUri = str;
        this.requestFriendlyName = str2;
        this.requestCallPath = str3;
        this.requestCategory = i;
        this.statusCode = i2;
        this.httpMethod = str4;
        this.errorDescription = str5;
        this.networkType = str6;
        this.requestSurface = str7;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HttpStats{requestHeaderBytes=");
        A1A.append(this.requestHeaderBytes);
        A1A.append(",requestBodyBytes=");
        A1A.append(this.requestBodyBytes);
        A1A.append(",responseHeaderBytes=");
        A1A.append(this.responseHeaderBytes);
        A1A.append(",responseBodyBytes=");
        A1A.append(this.responseBodyBytes);
        A1A.append(",requestUri=");
        A1A.append(this.requestUri);
        A1A.append(",requestFriendlyName=");
        A1A.append(this.requestFriendlyName);
        A1A.append(",requestCallPath=");
        A1A.append(this.requestCallPath);
        A1A.append(",requestCategory=");
        A1A.append(this.requestCategory);
        A1A.append(",statusCode=");
        A1A.append(this.statusCode);
        A1A.append(",httpMethod=");
        A1A.append(this.httpMethod);
        A1A.append(",errorDescription=");
        A1A.append(this.errorDescription);
        A1A.append(",networkType=");
        A1A.append(this.networkType);
        A1A.append(",requestSurface=");
        return C66584MXp.A0a(this.requestSurface, A1A);
    }
}
