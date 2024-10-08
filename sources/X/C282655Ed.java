package X;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.5Ed  reason: invalid class name and case insensitive filesystem */
public abstract class C282655Ed {
    public static final boolean A02(Context context) {
        String A00 = Pxd.A00(7);
        String A002 = Pxd.A00(18);
        String A003 = Pxd.A00(74);
        String[] strArr = (String[]) 0sc.A07(new String[]{A00, A002, A003}).toArray(new String[0]);
        if (!1DL.A08(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            String[] strArr2 = (String[]) 0sc.A07(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", A003}).toArray(new String[0]);
            if (1DL.A08(context, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(Context context) {
        String A00 = Pxd.A00(7);
        String A002 = Pxd.A00(18);
        String A003 = Pxd.A00(74);
        String[] strArr = (String[]) 0sc.A07(new String[]{A00, A002, A003}).toArray(new String[0]);
        if (!1DL.A08(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            String[] strArr2 = (String[]) 0sc.A07(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", A003}).toArray(new String[0]);
            if (!1DL.A08(context, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final String[] A04() {
        String A00 = Pxd.A00(7);
        String A002 = Pxd.A00(18);
        String A003 = Pxd.A00(74);
        return (String[]) 00k.A0n(0sc.A07(new String[]{A00, A002, A003}), 0sc.A07(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", A003})).toArray(new String[0]);
    }

    public static final C346927vz A00(Map map) {
        Object obj = map.get("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        C346927vz r0 = C346927vz.GRANTED;
        if (obj != r0) {
            return (C346927vz) map.get(Pxd.A00(7));
        }
        return r0;
    }

    public static final boolean A01(Activity activity) {
        if (!A02(activity)) {
            for (String A05 : A04()) {
                if (1DL.A05(activity, A05)) {
                    return true;
                }
            }
        }
        return false;
    }
}
