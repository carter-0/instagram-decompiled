package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Mlr  reason: case insensitive filesystem */
public abstract class C67317Mlr {
    public static final String A00(int i) {
        if (i == -1) {
            return NetInfoModule.CONNECTION_TYPE_NONE;
        }
        if (i == 0) {
            return "primary";
        }
        if (i == 1) {
            return "general";
        }
        if (i == 2) {
            return "top_threads";
        }
        if (i == 3) {
            return "channels";
        }
        if (i == 4) {
            return "ad_response";
        }
        if (i == 6) {
            return "ai_bot";
        }
        if (i == 7) {
            return "custom";
        }
        switch (i) {
            case IgNetworkConsentStorage.MAX_ENTRIES /*1000*/:
                return "all";
            case 1001:
                return "groups";
            case 1002:
                return "inbox_requests";
            default:
                throw DbW.A0a("Unknown folder type ", i);
        }
    }
}
