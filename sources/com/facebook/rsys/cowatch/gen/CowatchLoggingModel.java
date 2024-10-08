package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class CowatchLoggingModel {
    public static 2LV CONVERTER = C22180Xwq.A00(31);
    public static long sMcfTypeId;
    public final int action;
    public final Map extraInfo;
    public final String source;
    public final String trace;
    public final String videoId;

    public static native CowatchLoggingModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingModel)) {
                return false;
            }
            CowatchLoggingModel cowatchLoggingModel = (CowatchLoggingModel) obj;
            if (this.action != cowatchLoggingModel.action) {
                return false;
            }
            String str = this.source;
            String str2 = cowatchLoggingModel.source;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.trace;
            String str4 = cowatchLoggingModel.trace;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.videoId;
            String str6 = cowatchLoggingModel.videoId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            Map map = this.extraInfo;
            Map map2 = cowatchLoggingModel.extraInfo;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((((C66583MXo.A01(this.action) + AnonymousClass7TG.A0E(this.source)) * 31) + AnonymousClass7TG.A0E(this.trace)) * 31) + AnonymousClass7TG.A0E(this.videoId)) * 31;
        Map map = this.extraInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return A01 + i;
    }

    public CowatchLoggingModel(int i, String str, String str2, String str3, Map map) {
        this.action = i;
        this.source = str;
        this.trace = str2;
        this.videoId = str3;
        this.extraInfo = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchLoggingModel{action=");
        A1A.append(this.action);
        A1A.append(",source=");
        A1A.append(this.source);
        A1A.append(",trace=");
        A1A.append(this.trace);
        A1A.append(",videoId=");
        A1A.append(this.videoId);
        A1A.append(",extraInfo=");
        return C66582MXn.A0v(this.extraInfo, A1A);
    }
}
