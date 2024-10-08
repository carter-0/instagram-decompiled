package com.facebook.rsys.mosaicgrid.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class MosaicGridModel {
    public static 2LV CONVERTER = C71546Omh.A00(67);
    public static long sMcfTypeId;
    public final Map gridParticipants;

    public static native MosaicGridModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MosaicGridModel)) {
                return false;
            }
            Map map = this.gridParticipants;
            Map map2 = ((MosaicGridModel) obj).gridParticipants;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int hashCode;
        Map map = this.gridParticipants;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return 527 + hashCode;
    }

    public MosaicGridModel(Map map) {
        this.gridParticipants = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MosaicGridModel{gridParticipants=");
        return C66582MXn.A0v(this.gridParticipants, A1A);
    }
}
