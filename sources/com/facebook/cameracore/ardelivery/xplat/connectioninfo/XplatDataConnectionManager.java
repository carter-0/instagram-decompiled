package com.facebook.cameracore.ardelivery.xplat.connectioninfo;

import X.0qQ;
import X.C16514UwI;
import X.C312846fG;
import X.C62670v5;
import android.net.NetworkInfo;
import java.util.Locale;

public final class XplatDataConnectionManager {
    public final C312846fG assetManagerDataConnectionManager;

    public XplatDataConnectionManager(C312846fG r2) {
        0qQ.A0B(r2, 1);
        this.assetManagerDataConnectionManager = r2;
    }

    public final String getBandwidthConnectionQuality() {
        String str;
        C16514UwI uwI;
        NetworkInfo A03 = C62670v5.A0B.A01().A03();
        if (A03 == null || !A03.isConnected()) {
            str = "UNKNOWN";
        } else {
            int type = A03.getType();
            int subtype = A03.getSubtype();
            if (type != 1 && type == 0 && (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11)) {
                uwI = C16514UwI.POOR;
            } else {
                uwI = C16514UwI.GOOD;
            }
            str = uwI.name();
        }
        0qQ.A07(str);
        return str;
    }

    public final String getConnectionName() {
        String str;
        NetworkInfo A03 = C62670v5.A0B.A01().A03();
        if (A03 == null || !A03.isConnected()) {
            str = "UNKNOWN";
        } else if (A03.getType() == 1) {
            str = A03.getTypeName().toUpperCase(Locale.US);
        } else {
            str = A03.getSubtypeName();
        }
        0qQ.A07(str);
        return str;
    }
}
