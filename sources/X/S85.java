package X;

import android.util.Log;
import java.util.Set;

public abstract class S85 {
    public static void A00(String str) {
        Set set = C9908RjN.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            set.add(str);
        }
    }

    public static void A01(String str, Throwable th) {
        Set set = C9908RjN.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
