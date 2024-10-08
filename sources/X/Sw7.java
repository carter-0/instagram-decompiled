package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public final class Sw7 implements C13628Tdu {
    public final Context A00;
    public final ConnectivityManager A01;
    public final C13632Tdy A02;
    public final C13632Tdy A03;
    public final C10909S0j A04;
    public final URL A05;

    public final C8310Qnq AOC(C9143RQu rQu) {
        int type;
        int subtype;
        RF4 rf4;
        int i;
        NetworkInfo activeNetworkInfo = this.A01.getActiveNetworkInfo();
        C8310Qnq qnq = (C8310Qnq) rQu;
        String str = qnq.A04;
        if (str != null) {
            Integer num = qnq.A03;
            C11011S5i s5i = qnq.A02;
            if (s5i != null) {
                Long valueOf = Long.valueOf(qnq.A00);
                Long valueOf2 = Long.valueOf(qnq.A01);
                HashMap A19 = Pxe.A19(qnq.A05);
                A19.put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
                A19.put("model", Build.MODEL);
                A19.put("hardware", Build.HARDWARE);
                A19.put("device", Build.DEVICE);
                A19.put("product", Build.PRODUCT);
                A19.put("os-uild", Build.ID);
                A19.put("manufacturer", Build.MANUFACTURER);
                A19.put("fingerprint", Build.FINGERPRINT);
                Calendar.getInstance();
                A19.put("tz-offset", String.valueOf((long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / IgNetworkConsentStorage.MAX_ENTRIES)));
                if (activeNetworkInfo == null) {
                    type = -1;
                } else {
                    type = activeNetworkInfo.getType();
                }
                A19.put("net-type", String.valueOf(type));
                if (activeNetworkInfo == null) {
                    rf4 = RF4.UNKNOWN_MOBILE_SUBTYPE;
                } else {
                    subtype = activeNetworkInfo.getSubtype();
                    if (subtype == -1) {
                        rf4 = RF4.COMBINED;
                    } else {
                        if (RF4.A01.get(subtype) == null) {
                            subtype = 0;
                        }
                        A19.put("mobile-subtype", String.valueOf(subtype));
                        A19.put("country", Locale.getDefault().getCountry());
                        A19.put("locale", Locale.getDefault().getLanguage());
                        Context context = this.A00;
                        A19.put("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        A19.put("application_build", Integer.toString(i));
                        return C9688Rf6.A00(s5i, num, valueOf, valueOf2, str, A19);
                    }
                }
                subtype = rf4.A00;
                A19.put("mobile-subtype", String.valueOf(subtype));
                A19.put("country", Locale.getDefault().getCountry());
                A19.put("locale", Locale.getDefault().getLanguage());
                Context context2 = this.A00;
                A19.put("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
                try {
                    i = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e(002.A0R("TransportRuntime.", "CctTransportBackend"), "Unable to find version code for package", e);
                    i = -1;
                }
                A19.put("application_build", Integer.toString(i));
                return C9688Rf6.A00(s5i, num, valueOf, valueOf2, str, A19);
            }
            throw AnonymousClass7TE.A11("Null encodedPayload");
        }
        throw AnonymousClass7TE.A11("Null transportName");
    }

    public Sw7(Context context, C13632Tdy tdy, C13632Tdy tdy2) {
        C12730T4o t4o = new C12730T4o();
        C12723T4h.A00.AIx(t4o);
        t4o.A01 = true;
        this.A04 = new C10909S0j(t4o);
        this.A00 = context;
        this.A01 = (ConnectivityManager) context.getSystemService("connectivity");
        String str = Sw3.A02;
        try {
            this.A05 = new URL(str);
            this.A02 = tdy2;
            this.A03 = tdy;
        } catch (MalformedURLException e) {
            throw Pxe.A0h(002.A0R("Invalid url: ", str), e);
        }
    }
}
