package com.facebook.rsys.appstate.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22180Xwq;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class AppstateModel {
    public static 2LV CONVERTER = C22180Xwq.A00(0);
    public static long sMcfTypeId;
    public final boolean isBackgrounded;
    public final boolean isPictureInPicture;
    public final boolean isScreenOff;

    public static native AppstateModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppstateModel)) {
            return false;
        }
        AppstateModel appstateModel = (AppstateModel) obj;
        return this.isBackgrounded == appstateModel.isBackgrounded && this.isPictureInPicture == appstateModel.isPictureInPicture && this.isScreenOff == appstateModel.isScreenOff;
    }

    public int hashCode() {
        return ((C66583MXo.A01(this.isBackgrounded ? 1 : 0) + (this.isPictureInPicture ? 1 : 0)) * 31) + (this.isScreenOff ? 1 : 0);
    }

    public AppstateModel(boolean z, boolean z2, boolean z3) {
        this.isBackgrounded = z;
        this.isPictureInPicture = z2;
        this.isScreenOff = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AppstateModel{isBackgrounded=");
        A1A.append(this.isBackgrounded);
        A1A.append(",isPictureInPicture=");
        A1A.append(this.isPictureInPicture);
        A1A.append(",isScreenOff=");
        return C66584MXp.A0b(A1A, this.isScreenOff);
    }
}
