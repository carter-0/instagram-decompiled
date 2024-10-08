package X;

/* renamed from: X.QkA  reason: case insensitive filesystem */
public class C8201QkA extends C10974S3i {
    public final String A00 = "is";
    public final String A01;
    public final boolean A02;
    public final C269144ee A03;
    public final C269054eV A04;
    public final String A05 = "get";

    public C8201QkA(C269144ee r4, C269054eV r5, String str) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r4.A09(C269354ez.USE_STD_BEAN_NAMING);
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r1.startsWith(r0) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A03(X.C8206QkF r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r2 = r4.A05
            r3 = 0
            if (r2 == 0) goto L_0x004a
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "getCallbacks"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.Method r0 = r5.A01
            java.lang.Class r1 = r0.getReturnType()
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L_0x0060
            java.lang.Class r0 = r1.getComponentType()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ".cglib"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "net.sf.cglib"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "org.hibernate.repackage.cglib"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "org.springframework.cglib"
        L_0x0044:
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0060
        L_0x004a:
            return r3
        L_0x004b:
            java.lang.String r0 = "getMetaClass"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0060
            java.lang.reflect.Method r0 = r5.A01
            java.lang.Class r0 = r0.getReturnType()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "groovy.lang"
            goto L_0x0044
        L_0x0060:
            boolean r1 = r4.A02
            int r0 = r2.length()
            if (r1 == 0) goto L_0x006d
            java.lang.String r3 = A01(r6, r0)
            return r3
        L_0x006d:
            java.lang.String r3 = A00(r6, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8201QkA.A03(X.QkF, java.lang.String):java.lang.String");
    }

    public static final String A00(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder A14 = Pxe.A14(length - i);
        while (true) {
            A14.append(lowerCase);
            i++;
            if (i < length) {
                char charAt2 = str.charAt(i);
                lowerCase = Character.toLowerCase(charAt2);
                if (charAt2 == lowerCase) {
                    A14.append(str, i, length);
                    break;
                }
            } else {
                break;
            }
        }
        return A14.toString();
    }

    public static final String A01(String str, int i) {
        int i2;
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase || ((i2 = i + 1) < length && Character.isUpperCase(str.charAt(i2)))) {
            return str.substring(i);
        }
        StringBuilder A14 = Pxe.A14(length - i);
        A14.append(lowerCase);
        A14.append(str, i2, length);
        return A14.toString();
    }
}
