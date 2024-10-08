package X;

import android.os.Build;
import java.util.HashMap;

/* renamed from: X.Rqb  reason: case insensitive filesystem */
public final class C10338Rqb {
    public final int A00;
    public final HashMap A01;

    public C10338Rqb() {
        int intValue;
        HashMap A02 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("robolectric-BrandX/ProductX/Device30:11", 30), AnonymousClass7TE.A1L("robolectric-BrandX/ProductX/Device31:12", 31), AnonymousClass7TE.A1L("OPPO/CPH2025EEA/OP4BA2L1:12", 30), AnonymousClass7TE.A1L("OPPO/CPH2207EEA/OP4F0BL1:12", 30), AnonymousClass7TE.A1L("OPPO/PENM00/OP4EC1:11", 30), AnonymousClass7TE.A1L("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), AnonymousClass7TE.A1L("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), AnonymousClass7TE.A1L("Xiaomi/umi_global/umi:11", 30), AnonymousClass7TE.A1L("realme/RMX2085/RMX2085L1:11", 30), AnonymousClass7TE.A1L("samsung/c1qsqw/c1q:12", 30), AnonymousClass7TE.A1L("samsung/o1quew/o1q:12", 30), AnonymousClass7TE.A1L("samsung/r0quew/r0q:12", 30), AnonymousClass7TE.A1L("samsung/r0sxxx/r0s:12", 30)});
        this.A01 = A02;
        if (Build.VERSION.SDK_INT < 31 || (intValue = Build.VERSION.MEDIA_PERFORMANCE_CLASS) < 30) {
            String str = Build.BRAND;
            String str2 = Build.PRODUCT;
            String str3 = Build.DEVICE;
            String str4 = Build.VERSION.RELEASE;
            StringBuilder A0n = AnonymousClass7TF.A0n(str);
            A0n.append('/');
            A0n.append(str2);
            A0n.append('/');
            A0n.append(str3);
            A0n.append(':');
            Number number = (Number) A02.get(AnonymousClass7TF.A0l(str4, A0n));
            intValue = (number == null ? C51967G9n.A0k() : number).intValue();
            if (intValue < 30) {
                intValue = 0;
            }
        }
        this.A00 = intValue;
    }
}
