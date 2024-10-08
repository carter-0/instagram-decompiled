package X;

import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5OU  reason: invalid class name */
public abstract class AnonymousClass5OU {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = "N/A";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r4, boolean r5) {
        /*
            java.lang.String r3 = "N/A"
            if (r4 == 0) goto L_0x003d
            int r0 = r4.hashCode()
            switch(r0) {
                case -456963117: goto L_0x0032;
                case 124730804: goto L_0x0027;
                case 246781959: goto L_0x001c;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = r3
        L_0x000c:
            if (r5 == 0) goto L_0x0010
            java.lang.String r0 = "HardwareDecoder"
        L_0x0010:
            java.lang.String r2 = "AV1 decoding using "
            java.lang.String r1 = ";"
            if (r4 != 0) goto L_0x0017
            r4 = r3
        L_0x0017:
            java.lang.String r0 = X.002.A0u(r2, r0, r1, r4)
            return r0
        L_0x001c:
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Dav1d"
            goto L_0x0010
        L_0x0027:
            java.lang.String r0 = "c2.android.av1.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "LibGav1"
            goto L_0x0010
        L_0x0032:
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "PlatformDav1d"
            goto L_0x0010
        L_0x003d:
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5OU.A00(java.lang.String, boolean):java.lang.String");
    }

    public static boolean A01(HashMap hashMap, boolean z) {
        if (!z) {
            return false;
        }
        try {
            List<2Km> A05 = 2BR.A05("video/av01", false, false);
            if (A05 == null) {
                return false;
            }
            for (2Km r2 : A05) {
                if (r2 != null) {
                    String str = r2.A03;
                    if (!r2.A07 && r2.A05) {
                        if (hashMap.isEmpty()) {
                            return true;
                        }
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        if (!hashMap.containsKey(lowerCase)) {
                            return true;
                        }
                        int intValue = ((Number) hashMap.get(lowerCase)).intValue();
                        if (intValue != -1 && Build.VERSION.SDK_INT >= intValue) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (AnonymousClass275 e) {
            27B.A02("AV1Helper", "Failed to query AV1 decoders on device with exception %s.", new Object[]{e.getMessage()});
            return false;
        }
    }
}
