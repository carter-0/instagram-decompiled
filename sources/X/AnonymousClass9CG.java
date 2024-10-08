package X;

/* renamed from: X.9CG  reason: invalid class name */
public abstract class AnonymousClass9CG {
    public static final AnonymousClass9CI A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.9CI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.9CI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.9CI} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = X.AnonymousClass9CA.A03
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass9CA.A04
            if (r0 == 0) goto L_0x0010
            java.lang.Class r0 = X.AnonymousClass97X.A00
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.AnonymousClass97X.A01
            if (r0 != 0) goto L_0x0018
        L_0x0010:
            X.9CH r0 = new X.9CH
            r0.<init>()
        L_0x0015:
            A00 = r0
            return
        L_0x0018:
            X.9hO r0 = new X.9hO
            r0.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CG.<clinit>():void");
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
                                throw new AnonymousClass9GS(i, length2);
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
        throw new IllegalArgumentException(002.A0Q(Pxd.A00(70), ((long) i2) + 4294967296L));
    }
}
