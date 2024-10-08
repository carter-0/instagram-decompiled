package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: X.4mA  reason: invalid class name and case insensitive filesystem */
public final class C273214mA {
    public static final C273214mA A00 = new Object();

    public static final String A00(Context context, String str) {
        ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 128).applicationInfo;
        if (applicationInfo == null) {
            return null;
        }
        Object obj = applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    public final Integer A01(Context context, boolean z, boolean z2) {
        boolean z3;
        C273234mC A002 = C273224mB.A00(context.getPackageManager());
        if (A002 == null || ((A002 != C273234mC.A04 || !z) && (A002 != C273234mC.A03 || !z2))) {
            return AnonymousClass05K.A00;
        }
        try {
            String str = A002.A00;
            0qQ.A07(str);
            String A003 = A00(context, str);
            String packageName = context.getPackageName();
            0qQ.A07(packageName);
            z3 = 0qQ.A0K(A003, A00(context, packageName));
        } catch (Exception e) {
            0KC.A0J("HeliumTrampolineServiceEligibility", "There was an error trying to determine the architecture of a package: ", e);
            z3 = true;
        }
        if (!z3) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0N;
    }
}
