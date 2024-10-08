package X;

import android.content.Context;

public final class SyR implements C13646TeD {
    public C3734495k A00;
    public final RPJ A01;
    public final C3734495k A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b5 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00b5=Splitter:B:24:0x00b5, B:15:0x005a=Splitter:B:15:0x005a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FP7(X.C10612Rv6 r9) {
        /*
            r8 = this;
            X.RPJ r0 = r8.A01
            X.Qwn r0 = (X.C8549Qwn) r0
            int r7 = r0.A00
            if (r7 != 0) goto L_0x0034
            X.95k r0 = r8.A00
            if (r0 == 0) goto L_0x00cf
        L_0x000c:
            java.lang.Object r4 = r0.get()
            X.Tdr r4 = (X.C13625Tdr) r4
            int r5 = r9.A01
            X.Ryy r3 = r9.A00
            r2 = r7 ^ 1
            r1 = 0
            r6 = 1
            r0 = 1
            if (r6 == r2) goto L_0x001e
            r0 = 0
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r0
            X.Rxb r1 = r9.A02
            X.Ryz r0 = new X.Ryz
            r0.<init>(r3)
            r1.A04 = r0
            goto L_0x0037
        L_0x0034:
            X.95k r0 = r8.A02
            goto L_0x000c
        L_0x0037:
            X.C11144SBz.A00()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            if (r7 != 0) goto L_0x0066
            X.Rxc r3 = new X.Rxc     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r3.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.T4o r2 = new X.T4o     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.TeM r0 = X.C12726T4k.A00     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.AIx(r2)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r2.A01 = r6     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.S0j r1 = new X.S0j     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r1.A00(r0, r3)     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            java.lang.String r1 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.lang.String r0 = "utf-8"
            byte[] r2 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x00c3
        L_0x0066:
            X.Rxc r7 = new X.Rxc     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r7.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.T4m r2 = new X.T4m     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.TeM r0 = X.C12726T4k.A00     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            r0.AIx(r2)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.util.Map r0 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.util.HashMap r6 = X.Pxe.A19(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.util.Map r0 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.util.HashMap r1 = X.Pxe.A19(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.TmO r0 = r2.A00     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            java.io.ByteArrayOutputStream r3 = X.Pxe.A0b()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            X.T4Y r2 = new X.T4Y     // Catch:{ IOException -> 0x00b5 }
            r2.<init>(r0, r3, r6, r1)     // Catch:{ IOException -> 0x00b5 }
            java.util.Map r0 = r2.A02     // Catch:{ IOException -> 0x00b5 }
            java.lang.Class r1 = r7.getClass()     // Catch:{ IOException -> 0x00b5 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x00b5 }
            X.TeL r0 = (X.C13654TeL) r0     // Catch:{ IOException -> 0x00b5 }
            if (r0 == 0) goto L_0x009e
            r0.ARq(r7, r2)     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00b5
        L_0x009e:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r0 = "No encoder for "
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x00b5 }
            X.TQI r0 = new X.TQI     // Catch:{ IOException -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b5 }
            throw r0     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            byte[] r2 = r3.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x00ba }
            goto L_0x00c3
        L_0x00ba:
            r2 = move-exception
            java.lang.String r1 = "Failed to covert logging to UTF-8 byte array"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1, r2)
            throw r0
        L_0x00c3:
            if (r5 == 0) goto L_0x00d0
            X.RE0 r1 = X.RE0.DEFAULT
        L_0x00c7:
            X.Qni r0 = new X.Qni
            r0.<init>(r1, r2)
            r4.ELI(r0)
        L_0x00cf:
            return
        L_0x00d0:
            X.RE0 r1 = X.RE0.VERY_LOW
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SyR.FP7(X.Rv6):void");
    }

    public SyR(Context context, RPJ rpj) {
        this.A01 = rpj;
        Sw3 sw3 = Sw3.A01;
        Sw4.A01(context);
        Sw1 A022 = Sw4.A00().A02(sw3);
        if (Sw3.A03.contains(new S5K("json"))) {
            this.A00 = new AnonymousClass96L(new C12736T4u(A022));
        }
        this.A02 = new AnonymousClass96L(new C12737T4v(A022));
    }
}
