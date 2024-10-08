package X;

public abstract class SC5 {
    public static final S57 A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.S57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.S57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.S57} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = com.google.protobuf.UnsafeUtil.A04
            if (r0 == 0) goto L_0x0010
            boolean r0 = com.google.protobuf.UnsafeUtil.A05
            if (r0 == 0) goto L_0x0010
            java.lang.Class r0 = X.C10094RmW.A00
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.C10094RmW.A01
            if (r0 != 0) goto L_0x0018
        L_0x0010:
            X.R5j r0 = new X.R5j
            r0.<init>()
        L_0x0015:
            A00 = r0
            return
        L_0x0018:
            X.R5k r0 = new X.R5k
            r0.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SC5.<clinit>():void");
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) >= 65536) {
                                i++;
                            } else {
                                throw new C9001RKu(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw Pxg.A0b("UTF-8 length does not fit in int: ", ((long) i2) + 4294967296L);
    }
}
