package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.common.networkreachability.AndroidReachabilityListener;
import com.facebook.common.networkreachability.NetworkState;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.S2t  reason: case insensitive filesystem */
public final class C10961S2t {
    public static C10961S2t A05;
    public NetworkState A00;
    public final BroadcastReceiver A01 = new Q63(this, 4);
    public final Context A02;
    public final AndroidReachabilityListener A03;
    public final ConnectivityManager A04;

    public final NetworkState A00() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.A04;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return NetworkState.NONE;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 20) {
                return NetworkState.CELL_5G;
            }
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return NetworkState.CELL_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 14:
                    return NetworkState.CELL_3G;
                case 13:
                    return NetworkState.CELL_4G;
                case 15:
                    return NetworkState.CELL_3G_HSPAP;
                default:
                    return NetworkState.CELL_UNKNOWN;
            }
        } else if (type != 1) {
            return NetworkState.UNKNOWN;
        } else {
            return NetworkState.WIFI;
        }
    }

    public C10961S2t(Context context) {
        this.A02 = context;
        Object systemService = context.getSystemService("connectivity");
        0qQ.A0C(systemService, AnonymousClass000.A00(326));
        this.A04 = (ConnectivityManager) systemService;
        this.A00 = A00();
        this.A03 = new AndroidReachabilityListener(this);
    }
}
