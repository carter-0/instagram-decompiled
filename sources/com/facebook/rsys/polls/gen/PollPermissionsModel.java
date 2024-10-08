package com.facebook.rsys.polls.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PollPermissionsModel {
    public static 2LV CONVERTER = C22181Xwr.A00(33);
    public static long sMcfTypeId;
    public final boolean canRemove;

    public static native PollPermissionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PollPermissionsModel) && this.canRemove == ((PollPermissionsModel) obj).canRemove;
        }
        return true;
    }

    public int hashCode() {
        return true + (this.canRemove ? 1 : 0);
    }

    public String toString() {
        return 002.A1B("PollPermissionsModel{canRemove=", "}", this.canRemove);
    }

    public PollPermissionsModel(boolean z) {
        this.canRemove = z;
    }
}
