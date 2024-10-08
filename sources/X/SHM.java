package X;

import android.content.Context;
import java.util.Map;

public final class SHM {
    public final Context A00;
    public final AnonymousClass3RA A01;
    public final String A02;
    public final String A03;

    private String A00(String str) {
        String str2;
        String str3;
        if (str != null) {
            int length = str.length();
            StringBuilder A14 = Pxe.A14(length);
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '&') {
                    str3 = "&amp;";
                } else if (charAt < ' ' || charAt > '~') {
                    A14.append("&#");
                    A14.append(Integer.toString(charAt));
                    str3 = ";";
                } else {
                    A14.append(charAt);
                }
                A14.append(str3);
            }
            str2 = A14.toString();
        } else {
            str2 = "";
        }
        return str2.replace("/", "-").replace(";", "-");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01() {
        /*
            r26 = this;
            r0 = r26
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x013c
            java.lang.String r20 = "["
            java.lang.String r6 = "FBAN"
            java.lang.String r7 = r0.A02
            java.lang.String r8 = "FBAV"
            X.3RA r1 = r0.A01
            java.lang.String r9 = r1.A01
            java.lang.String r10 = "FBBV"
            java.lang.String r11 = r1.A00
            java.lang.String r12 = "FBDM"
            android.content.Context r5 = r0.A00     // Catch:{ RuntimeException -> 0x0076 }
            android.util.DisplayMetrics r4 = X.AnonymousClass7TF.A0E(r5)     // Catch:{ RuntimeException -> 0x0076 }
            int r2 = r4.widthPixels     // Catch:{ RuntimeException -> 0x0076 }
            int r1 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0076 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ RuntimeException -> 0x0076 }
            r3.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x0076 }
            java.lang.String r2 = "window"
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.Object r2 = r5.getSystemService(r2)     // Catch:{ Exception -> 0x0039 }
            if (r2 == 0) goto L_0x0039
            boolean r1 = r1.isInstance(r2)     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ RuntimeException -> 0x0076 }
            if (r2 == 0) goto L_0x004b
            android.view.Display r1 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0076 }
            if (r1 == 0) goto L_0x004b
            android.view.Display r1 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0076 }
            r1.getSize(r3)     // Catch:{ RuntimeException -> 0x0076 }
        L_0x004b:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ RuntimeException -> 0x0076 }
            java.lang.String r1 = "{density="
            r2.append(r1)     // Catch:{ RuntimeException -> 0x0076 }
            float r1 = r4.density     // Catch:{ RuntimeException -> 0x0076 }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x0076 }
            java.lang.String r1 = ",width="
            r2.append(r1)     // Catch:{ RuntimeException -> 0x0076 }
            int r1 = r3.x     // Catch:{ RuntimeException -> 0x0076 }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x0076 }
            java.lang.String r1 = ",height="
            r2.append(r1)     // Catch:{ RuntimeException -> 0x0076 }
            int r1 = r3.y     // Catch:{ RuntimeException -> 0x0076 }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x0076 }
            java.lang.String r1 = "}"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r1, r2)     // Catch:{ RuntimeException -> 0x0076 }
            goto L_0x0082
        L_0x0076:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()
            boolean r1 = r1 instanceof android.os.DeadSystemException
            if (r1 == 0) goto L_0x013b
            java.lang.String r1 = "{density=0,width=0,height=0}"
        L_0x0082:
            java.lang.String r13 = r0.A00(r1)
            java.lang.String r14 = "FBLC"
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toString()
            java.lang.String r15 = r0.A00(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.lang.String r2 = "%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;"
            r1 = 0
            java.lang.String r21 = java.lang.String.format(r1, r2, r3)
            java.lang.String r6 = "FBCR"
            android.content.Context r3 = r0.A00
            java.lang.Class<android.telephony.TelephonyManager> r5 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "phone"
            java.lang.Object r4 = r3.getSystemService(r2)     // Catch:{ Exception -> 0x00b5 }
            if (r4 == 0) goto L_0x00b5
            boolean r2 = r5.isInstance(r4)     // Catch:{ Exception -> 0x00b5 }
            if (r2 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            if (r4 == 0) goto L_0x00eb
            java.lang.String r2 = r4.getNetworkOperatorName()
        L_0x00be:
            java.lang.String r7 = r0.A00(r2)
            java.lang.String r8 = "FBMF"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r9 = r0.A00(r2)
            java.lang.String r10 = "FBBD"
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r11 = r0.A00(r2)
            java.lang.String r12 = "FBPN"
            java.lang.String r13 = r3.getPackageName()
            java.lang.String r14 = "FBDV"
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r15 = r0.A00(r2)
            java.lang.String r16 = "FBSV"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r17 = r0.A00(r2)
            java.lang.String r18 = "FBLR"
            goto L_0x00ee
        L_0x00eb:
            java.lang.String r2 = ""
            goto L_0x00be
        L_0x00ee:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = "android.hardware.ram.low"
            boolean r2 = r3.hasSystemFeature(r2)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00fa
        L_0x00f9:
            r2 = 0
        L_0x00fa:
            java.lang.String r3 = "1"
            if (r2 == 0) goto L_0x0138
            r2 = r3
        L_0x00ff:
            java.lang.String r19 = r0.A00(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.lang.String r2 = "%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;"
            java.lang.String r22 = java.lang.String.format(r1, r2, r4)
            java.lang.String r2 = "FBBK"
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}
            java.lang.String r2 = "%s/%s;"
            java.lang.String r23 = java.lang.String.format(r1, r2, r3)
            java.lang.String r4 = "FBCA"
            java.lang.String r2 = android.os.Build.CPU_ABI
            java.lang.String r3 = r0.A00(r2)
            java.lang.String r2 = android.os.Build.CPU_ABI2
            java.lang.String r0 = r0.A00(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r3, r0}
            java.lang.String r0 = "%s/%s:%s;"
            java.lang.String r24 = java.lang.String.format(r1, r0, r2)
            java.lang.String r25 = "]"
            java.lang.String r1 = X.002.A13(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0138:
            java.lang.String r2 = "0"
            goto L_0x00ff
        L_0x013b:
            throw r2
        L_0x013c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SHM.A01():java.lang.String");
    }

    public SHM(Context context, AnonymousClass3RA r3, String str, Map map) {
        String str2;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = str;
        if (map != null) {
            str2 = DbT.A11("User-Agent", map);
        } else {
            str2 = null;
        }
        this.A03 = str2;
    }
}
