package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public final class SN9 {
    public final Context A00;

    public SN9(Context context) {
        this.A00 = context;
    }

    public static S2M A00(ConnectivityManager connectivityManager) {
        boolean z;
        Integer num;
        int i;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
                num = AnonymousClass05K.A00;
                i = -1;
            } else {
                int type = activeNetworkInfo.getType();
                z = true;
                if (type == 0) {
                    num = A01(activeNetworkInfo.getSubtype());
                } else if (type == 1) {
                    num = AnonymousClass05K.A0C;
                } else if (type != 6) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0j;
                }
                i = activeNetworkInfo.getType();
            }
            return new S2M(num, (Throwable) null, i, z);
        } catch (Throwable th) {
            return new S2M(AnonymousClass05K.A00, th, -1, false);
        }
    }

    public static Integer A01(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return AnonymousClass05K.A0N;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
            case 15:
            case 17:
                return AnonymousClass05K.A0Y;
            case 13:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return AnonymousClass05K.A0j;
            case 20:
                return AnonymousClass05K.A0u;
            default:
                return AnonymousClass05K.A15;
        }
    }
}
