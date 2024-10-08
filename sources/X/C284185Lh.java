package X;

/* renamed from: X.5Lh  reason: invalid class name and case insensitive filesystem */
public abstract class C284185Lh {
    public static final C284205Lj A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5Lj] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            boolean r0 = X.C284115La.A04
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.C284115La.A05
            if (r0 == 0) goto L_0x0018
            java.lang.Class r0 = X.AnonymousClass5LC.A00
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass5LC.A01
            if (r0 == 0) goto L_0x0018
        L_0x0010:
            X.QBt r0 = new X.QBt
            r0.<init>()
        L_0x0015:
            A00 = r0
            return
        L_0x0018:
            X.5Li r0 = new X.5Li
            r0.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284185Lh.<clinit>():void");
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
                                throw new C8996RKp(i, length2);
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
