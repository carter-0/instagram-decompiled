package X;

import android.content.Context;

public final class SyN implements C13644TeB {
    public C3734495k A00;
    public final C9056RNf A01;
    public final C3734495k A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00b3=Splitter:B:24:0x00b3, B:15:0x0058=Splitter:B:15:0x0058} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FP6(X.C10471Rsm r8) {
        /*
            r7 = this;
            X.RNf r0 = r7.A01
            X.Qw7 r0 = (X.C8511Qw7) r0
            int r6 = r0.A00
            if (r6 != 0) goto L_0x0032
            X.95k r0 = r7.A00
            if (r0 == 0) goto L_0x00cb
        L_0x000c:
            java.lang.Object r4 = r0.get()
            X.Tdr r4 = (X.C13625Tdr) r4
            X.Ryw r3 = r8.A00
            r2 = r6 ^ 1
            r1 = 0
            r5 = 1
            r0 = 1
            if (r5 == r2) goto L_0x001c
            r0 = 0
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r0
            X.Rv2 r1 = r8.A01
            X.Ryx r0 = new X.Ryx
            r0.<init>(r3)
            r1.A02 = r0
            goto L_0x0035
        L_0x0032:
            X.95k r0 = r7.A02
            goto L_0x000c
        L_0x0035:
            X.C11143SBy.A00()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            if (r6 != 0) goto L_0x0064
            X.Rv3 r3 = new X.Rv3     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r3.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.T4o r2 = new X.T4o     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.TeM r0 = X.C12725T4j.A00     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r0.AIx(r2)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r2.A01 = r5     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.S0j r1 = new X.S0j     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r1.A00(r0, r3)     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            java.lang.String r1 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.lang.String r0 = "utf-8"
            byte[] r2 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            goto L_0x00c1
        L_0x0064:
            X.Rv3 r6 = new X.Rv3     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r6.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.T4l r2 = new X.T4l     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.TeM r0 = X.C12725T4j.A00     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            r0.AIx(r2)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.util.Map r0 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.util.HashMap r5 = X.Pxe.A19(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.util.Map r0 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.util.HashMap r1 = X.Pxe.A19(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.TmO r0 = r2.A00     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            java.io.ByteArrayOutputStream r3 = X.Pxe.A0b()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            X.T4X r2 = new X.T4X     // Catch:{ IOException -> 0x00b3 }
            r2.<init>(r0, r3, r5, r1)     // Catch:{ IOException -> 0x00b3 }
            java.util.Map r0 = r2.A02     // Catch:{ IOException -> 0x00b3 }
            java.lang.Class r1 = r6.getClass()     // Catch:{ IOException -> 0x00b3 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x00b3 }
            X.TeL r0 = (X.C13654TeL) r0     // Catch:{ IOException -> 0x00b3 }
            if (r0 == 0) goto L_0x009c
            r0.ARq(r6, r2)     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00b3
        L_0x009c:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b3 }
            java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x00b3 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x00b3 }
            java.lang.String r0 = "No encoder for "
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x00b3 }
            X.TQI r0 = new X.TQI     // Catch:{ IOException -> 0x00b3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b3 }
            throw r0     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            byte[] r2 = r3.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x00b8 }
            goto L_0x00c1
        L_0x00b8:
            r2 = move-exception
            java.lang.String r1 = "Failed to covert logging to UTF-8 byte array"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1, r2)
            throw r0
        L_0x00c1:
            X.RE0 r1 = X.RE0.VERY_LOW
            X.Qni r0 = new X.Qni
            r0.<init>(r1, r2)
            r4.ELI(r0)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SyN.FP6(X.Rsm):void");
    }

    public SyN(Context context, C9056RNf rNf) {
        this.A01 = rNf;
        Sw3 sw3 = Sw3.A01;
        Sw4.A01(context);
        Sw1 A022 = Sw4.A00().A02(sw3);
        if (Sw3.A03.contains(new S5K("json"))) {
            this.A00 = new AnonymousClass96L(new C12734T4s(A022));
        }
        this.A02 = new AnonymousClass96L(new C12735T4t(A022));
    }
}
