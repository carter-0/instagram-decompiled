package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Rj  reason: invalid class name and case insensitive filesystem */
public abstract class C241833Rj {
    public static String A00(Context context) {
        String[] strArr;
        int[] iArr;
        AnonymousClass3RX r7 = (AnonymousClass3RX) AnonymousClass3RD.A00;
        for (String str : Arrays.asList(new String[]{r7.A05, r7.A04})) {
            AnonymousClass3RB r1 = AnonymousClass3RB.A02;
            if (C241843Rk.A01(context, r1, str)) {
                AnonymousClass3RC A01 = r1.A01(context, str, 4160);
                C241843Rk.A00(context, A01);
                if (A01.A02 == AnonymousClass05K.A15 && A01.A01 != null && A01.A01.applicationInfo != null) {
                    PackageInfo packageInfo = A01.A01;
                    int i = packageInfo.applicationInfo.flags;
                    if (((i & 1) != 0 || (i & 128) != 0) && (strArr = packageInfo.requestedPermissions) != null && (iArr = packageInfo.requestedPermissionsFlags) != null) {
                        Set set = r7.A09;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 < strArr.length && i2 < iArr.length) {
                                if (set.contains(strArr[i2])) {
                                    if ((iArr[i2] & 2) == 0) {
                                        continue;
                                        break;
                                    }
                                    i3++;
                                    if (set.size() == i3) {
                                        return str;
                                    }
                                }
                                i2++;
                            }
                        }
                        if (set.size() == i3) {
                            return str;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void A01(Context context, List list, List list2) {
        for (String A01 : ((AnonymousClass3RX) AnonymousClass3RD.A00).A08) {
            AnonymousClass3RC A012 = AnonymousClass3RB.A02.A01(context, A01, 64);
            C241843Rk.A00(context, A012);
            if (A012.A02 == AnonymousClass05K.A0Y || A012.A02 == AnonymousClass05K.A0C || A012.A02 == AnonymousClass05K.A15 || A012.A02 == AnonymousClass05K.A0j) {
                list.add(A012.A00);
            }
            if (A012.A02 == AnonymousClass05K.A15) {
                list2.add(A012.A00);
            }
        }
    }

    public static boolean A02(String str) {
        AnonymousClass3RX r1 = (AnonymousClass3RX) AnonymousClass3RD.A00;
        if (r1.A05.equals(str) || r1.A04.equals(str)) {
            return true;
        }
        return false;
    }
}
