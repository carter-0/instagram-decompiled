package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.3nN  reason: invalid class name and case insensitive filesystem */
public final class C251603nN {
    public final Context A00;
    public final String A01;

    public final void A00(0Df r4) {
        String str;
        0Df.A00(r4, this.A01, "tier");
        0Df.A00(r4, Double.valueOf(C67371tC.A00(System.currentTimeMillis())), "sent_time");
        Context context = this.A00;
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            networkOperatorName = "n/a";
        }
        0Df.A00(r4, networkOperatorName, "carrier");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            str = activeNetworkInfo.getTypeName();
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        0Df.A00(r4, str, "conn");
    }

    public C251603nN(Context context, String str) {
        this.A00 = context.getApplicationContext();
        this.A01 = str;
    }
}
