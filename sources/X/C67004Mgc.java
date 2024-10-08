package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.Mgc  reason: case insensitive filesystem */
public abstract class C67004Mgc extends 02K {
    public static void A03(Activity activity, AnonymousClass57D r2) {
        C67630MrA mrA;
        if (r2 != null) {
            mrA = new C67630MrA(r2);
        } else {
            mrA = null;
        }
        activity.setEnterSharedElementCallback(mrA);
    }

    public static void A04(Activity activity, AnonymousClass57D r2) {
        C67630MrA mrA;
        if (r2 != null) {
            mrA = new C67630MrA(r2);
        } else {
            mrA = null;
        }
        activity.setExitSharedElementCallback(mrA);
    }

    public static boolean A06(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            if (i < 32) {
                if (i == 31) {
                    return C67076Mhr.A00(activity, str);
                }
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return C67012Mgl.A00(activity, str);
    }

    public static void A05(Activity activity, String[] strArr, int i) {
        HashSet A1F = AnonymousClass7TE.A1F();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = A1F.size();
                if (size > 0) {
                    if (size != length) {
                        for (int i3 = 0; i3 < length; i3++) {
                            A1F.contains(Integer.valueOf(i3));
                        }
                    } else {
                        return;
                    }
                }
                activity.requestPermissions(strArr, i);
                return;
            } else if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    A1F.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                throw AnonymousClass7TE.A0w(002.A0g("Permission request for permissions ", Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
    }
}
