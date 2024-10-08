package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.media3.common.util.Util;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public final class Q5v extends BroadcastReceiver {
    public final /* synthetic */ SOE A00;

    public Q5v(SOE soe) {
        this.A00 = soe;
    }

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, -2062227565);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                i = 1;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4) {
                                i = 5;
                                if (type != 5) {
                                    if (type != 6) {
                                        i = 7;
                                        if (type != 9) {
                                            i = 8;
                                        }
                                    }
                                }
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                            break;
                        case 20:
                            i = 0;
                            if (Util.A01 >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                        default:
                            i = 6;
                            break;
                    }
                    i = 2;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Util.A01 < 31 || i != 5) {
            SOE.A01(this.A00, i);
        } else {
            RS0.A00(context, this.A00);
        }
        AnonymousClass0fD.A0E(-1913691459, A03, intent);
    }
}
