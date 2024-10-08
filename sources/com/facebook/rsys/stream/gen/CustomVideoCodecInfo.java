package com.facebook.rsys.stream.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C51972G9s;
import X.C66579MXk;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

public class CustomVideoCodecInfo {
    public static 2LV CONVERTER = C22181Xwr.A00(58);
    public static long sMcfTypeId;
    public final int codecName;
    public final int contentType;
    public final HashSet supportedUserIds;
    public final long version;

    public static native CustomVideoCodecInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomVideoCodecInfo)) {
            return false;
        }
        CustomVideoCodecInfo customVideoCodecInfo = (CustomVideoCodecInfo) obj;
        return this.codecName == customVideoCodecInfo.codecName && this.contentType == customVideoCodecInfo.contentType && this.version == customVideoCodecInfo.version && this.supportedUserIds.equals(customVideoCodecInfo.supportedUserIds);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.supportedUserIds, C51972G9s.A07(this.version, (C66583MXo.A01(this.codecName) + this.contentType) * 31));
    }

    public CustomVideoCodecInfo(int i, int i2, long j, HashSet hashSet) {
        hashSet.getClass();
        this.codecName = i;
        this.contentType = i2;
        this.version = j;
        this.supportedUserIds = hashSet;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CustomVideoCodecInfo{codecName=");
        A1A.append(this.codecName);
        A1A.append(C66579MXk.A00(450));
        A1A.append(this.contentType);
        A1A.append(",version=");
        A1A.append(this.version);
        A1A.append(",supportedUserIds=");
        return C66582MXn.A0v(this.supportedUserIds, A1A);
    }
}
