package X;

public abstract class VKZ {
    public static final String A00;
    public static final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if ("EUC_JP".equalsIgnoreCase(r1) != false) goto L_0x001b;
     */
    static {
        /*
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = r0.name()
            A00 = r1
            java.lang.String r0 = "SJIS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "EUC_JP"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VKZ.<clinit>():void");
    }
}
