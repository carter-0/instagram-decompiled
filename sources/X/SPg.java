package X;

import android.content.Context;
import android.os.Build;
import com.instagram.android.R;

public abstract class SPg {
    public static boolean A00(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30 || str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29 || str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A02(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (str != null) {
            String[] stringArray = context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors);
            int length = stringArray.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (str.equalsIgnoreCase(stringArray[i])) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            return true;
        }
        if (str2 == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
            if (str2.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }
}
