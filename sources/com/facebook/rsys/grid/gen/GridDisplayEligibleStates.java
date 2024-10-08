package com.facebook.rsys.grid.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22180Xwq;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class GridDisplayEligibleStates {
    public static 2LV CONVERTER = C22180Xwq.A00(52);
    public static long sMcfTypeId;
    public final boolean isConnectedEligible;
    public final boolean isConnectingEligible;

    public static native GridDisplayEligibleStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridDisplayEligibleStates)) {
            return false;
        }
        GridDisplayEligibleStates gridDisplayEligibleStates = (GridDisplayEligibleStates) obj;
        return this.isConnectingEligible == gridDisplayEligibleStates.isConnectingEligible && this.isConnectedEligible == gridDisplayEligibleStates.isConnectedEligible;
    }

    public int hashCode() {
        return C66583MXo.A01(this.isConnectingEligible ? 1 : 0) + (this.isConnectedEligible ? 1 : 0);
    }

    public GridDisplayEligibleStates(boolean z, boolean z2) {
        this.isConnectingEligible = z;
        this.isConnectedEligible = z2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridDisplayEligibleStates{isConnectingEligible=");
        A1A.append(this.isConnectingEligible);
        A1A.append(",isConnectedEligible=");
        return C66584MXp.A0b(A1A, this.isConnectedEligible);
    }
}
