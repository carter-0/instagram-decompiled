package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
import org.webrtc.CameraVideoCapturer;

public abstract class SUN {
    public static final int A00 = Runtime.getRuntime().availableProcessors();

    public static int A02(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                A09(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return AnonymousClass7TE.A0M(obj);
            } else {
                concat = "Unexpected type for bundle response code: ".concat(String.valueOf(C66581MXm.A0y(obj)));
            }
        }
        A0A(str, concat);
        return 6;
    }

    public static Purchase A05(String str, String str2) {
        if (str == null || str2 == null) {
            A09("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            A0A("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    public static void A09(String str, String str2) {
        if (Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, i));
                str2.substring(0, min);
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static int A00(Intent intent) {
        if (intent != null) {
            return A01(intent.getExtras());
        }
        A0A("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int A01(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        A0A("ProxyBillingActivity", "Unexpected null bundle received!");
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.SGo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.SGo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.SGo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11230SGo A04(android.content.Intent r2, java.lang.String r3) {
        /*
            if (r2 != 0) goto L_0x0016
            java.lang.String r1 = "BillingHelper"
            java.lang.String r0 = "Got null intent!"
            A0A(r1, r0)
            java.lang.String r2 = "An internal error occurred."
            X.SGo r0 = new X.SGo
            r0.<init>()
            r1 = 6
        L_0x0011:
            r0.A00 = r1
            r0.A01 = r2
            return r0
        L_0x0016:
            android.os.Bundle r0 = r2.getExtras()
            int r1 = A02(r0, r3)
            android.os.Bundle r0 = r2.getExtras()
            java.lang.String r2 = A07(r0, r3)
            X.SGo r0 = new X.SGo
            r0.<init>()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUN.A04(android.content.Intent, java.lang.String):X.SGo");
    }

    public static String A07(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("DEBUG_MESSAGE");
            if (obj == null) {
                A09(str, "getDebugMessageFromBundle() got null response code, assuming OK");
                return "";
            } else if (obj instanceof String) {
                return (String) obj;
            } else {
                concat = "Unexpected type for debug message: ".concat(String.valueOf(C66581MXm.A0y(obj)));
            }
        }
        A0A(str, concat);
        return "";
    }

    public static ArrayList A08(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase A05 = A05(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (A05 == null) {
                A09("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            A1C.add(A05);
        } else {
            A09("BillingHelper", 002.A0c("Found purchase list of ", C273654mx.A00(197), stringArrayList.size()));
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase A052 = A05(stringArrayList.get(i), stringArrayList2.get(i));
                if (A052 != null) {
                    A1C.add(A052);
                }
                i++;
            }
        }
        return A1C;
    }

    public static Bundle A03(String str, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("playBillingLibraryVersion", str);
        if (z) {
            A0a.putBoolean("enablePendingPurchases", true);
        }
        return A0a;
    }

    public static String A06(int i) {
        return C8905REx.A00(i).toString();
    }

    public static void A0A(String str, String str2) {
        Pxg.A1O(str, str2);
    }
}
