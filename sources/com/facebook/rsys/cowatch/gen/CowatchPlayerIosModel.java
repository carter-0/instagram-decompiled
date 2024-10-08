package com.facebook.rsys.cowatch.gen;

import X.002;
import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchPlayerIosModel {
    public static 2LV CONVERTER = C22180Xwq.A00(34);
    public static long sMcfTypeId;
    public final boolean isInReportFlow;

    public static native CowatchPlayerIosModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CowatchPlayerIosModel) && this.isInReportFlow == ((CowatchPlayerIosModel) obj).isInReportFlow;
        }
        return true;
    }

    public int hashCode() {
        return true + (this.isInReportFlow ? 1 : 0);
    }

    public String toString() {
        return 002.A1B("CowatchPlayerIosModel{isInReportFlow=", "}", this.isInReportFlow);
    }

    public CowatchPlayerIosModel(boolean z) {
        this.isInReportFlow = z;
    }
}
