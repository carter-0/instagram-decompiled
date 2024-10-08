package X;

/* renamed from: X.4Cy  reason: invalid class name */
public abstract class AnonymousClass4Cy {
    public static int A00;
    public static final 0IY A01 = new 0IY("ArtDistract");
    public static final 0Im A02 = 0Im.A00("ArtDistract");

    public static void A00(String str, Object... objArr) {
        String str2;
        String format = String.format(str, objArr);
        A02.A09(format, new Object[0], 5);
        0IY r5 = A01;
        0Im r4 = 0IY.A06;
        "ArtDistractVerifyErr".getClass();
        format.getClass();
        String format2 = String.format(format, new Object[0]);
        synchronized (r5.A01) {
            str2 = (String) r5.A03.put("ArtDistractVerifyErr", format2);
        }
        r5.A00 = null;
        if (str2 != null) {
            r4.A08("Error Message for category %s was overwritten.\n\t old: %s \n\t new: %s", new Object[]{"ArtDistractVerifyErr", str2, format});
        }
        r4.A09(format2, new Object[0], 5);
        0IY.A00(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cf, code lost:
        if (r10 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        if (r0 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C262254Cz r21, X.C262254Cz r22) {
        /*
            r3 = r21
            java.lang.reflect.Method r9 = r3.A00
            java.lang.Class r5 = r9.getReturnType()
            r2 = r22
            java.lang.reflect.Method r8 = r2.A00
            java.lang.Class r4 = r8.getReturnType()
            r16 = 0
            r15 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2}
            java.lang.String r0 = "Method %s cannot be used as method %s because it's return type is too different."
            boolean r0 = A02(r5, r4, r0, r1)
            if (r0 == 0) goto L_0x0058
            java.lang.Class[] r7 = r9.getParameterTypes()
            java.lang.Class[] r6 = r8.getParameterTypes()
            int r0 = r9.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            int r1 = r8.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r1)
            if (r0 != r10) goto L_0x005f
            int r5 = r7.length
            int r4 = r6.length
            if (r5 == r4) goto L_0x00cc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x005c
            java.lang.String r8 = "static"
        L_0x0049:
            if (r0 == 0) goto L_0x0059
            java.lang.String r9 = ""
        L_0x004d:
            r6 = r2
            r4 = r3
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9}
            java.lang.String r0 = "Method %s [args: %d] cannot be used for method %s [args: %d] because as both %s methods they must have the same number of args%s."
        L_0x0055:
            A00(r0, r1)
        L_0x0058:
            return r16
        L_0x0059:
            java.lang.String r9 = " (including implicit 'this' param)"
            goto L_0x004d
        L_0x005c:
            java.lang.String r8 = "non-static"
            goto L_0x0049
        L_0x005f:
            if (r0 == 0) goto L_0x008d
            r1 = r10 ^ 1
            X.0JA.A06(r1)
            int r14 = r7.length
            r5 = r14
            int r4 = r6.length
            int r13 = r4 + 1
            r1 = 0
            if (r14 <= 0) goto L_0x006f
            r1 = 1
        L_0x006f:
            X.0JA.A06(r1)
            r12 = r7[r16]
            r1 = r3
            r11 = r2
        L_0x0076:
            if (r14 == r13) goto L_0x00a1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r0 = r11.A00
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r2, r1, r0}
            java.lang.String r0 = "Method %s [args: %d] cannot be used for method %s [args: %d] because %s is not static and hence has an implicit 'this' param, so it must have one less args."
            goto L_0x0055
        L_0x008d:
            X.0JA.A06(r10)
            int r5 = r7.length
            int r14 = r5 + 1
            int r13 = r6.length
            r4 = r13
            r1 = 0
            if (r13 <= 0) goto L_0x0099
            r1 = 1
        L_0x0099:
            X.0JA.A06(r1)
            r12 = r6[r16]
            r11 = r3
            r1 = r2
            goto L_0x0076
        L_0x00a1:
            java.lang.reflect.Method r13 = r11.A00
            java.lang.Class r11 = r13.getDeclaringClass()
            java.lang.reflect.Method r1 = r1.A00
            java.lang.String r19 = r1.getName()
            java.lang.String r21 = r13.getName()
            java.lang.Class r1 = r13.getDeclaringClass()
            java.lang.String r22 = r1.getSimpleName()
            r17 = r3
            r18 = r2
            r20 = r12
            java.lang.Object[] r13 = new java.lang.Object[]{r17, r18, r19, r20, r21, r22}
            java.lang.String r1 = "Method %s cannot be used as method %s because %s's first param %s must be able to be used as a 'this' for the other methods %s class %s."
            boolean r1 = A02(r12, r11, r1, r13)
            if (r1 != 0) goto L_0x00cc
            return r16
        L_0x00cc:
            if (r0 == 0) goto L_0x00d1
            r11 = 1
            if (r10 == 0) goto L_0x00d7
        L_0x00d1:
            r11 = 0
            if (r10 == 0) goto L_0x00d7
            r10 = 1
            if (r0 == 0) goto L_0x00d8
        L_0x00d7:
            r10 = 0
        L_0x00d8:
            if (r11 >= r5) goto L_0x0101
            if (r10 >= r4) goto L_0x0101
            r13 = r7[r11]
            r12 = r6[r10]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r10)
            r17 = r3
            r18 = r2
            r19 = r13
            r21 = r12
            java.lang.Object[] r1 = new java.lang.Object[]{r17, r18, r19, r20, r21, r22}
            java.lang.String r0 = "Method %s cannot be used as method %s because arg %s at idx %d must be usable for the other method's arg %s at idx %d."
            boolean r0 = A02(r13, r12, r0, r1)
            if (r0 == 0) goto L_0x0058
            int r11 = r11 + 1
            int r10 = r10 + 1
            goto L_0x00d8
        L_0x0101:
            java.lang.Class[] r7 = r9.getExceptionTypes()
            java.lang.Class[] r6 = r8.getExceptionTypes()
            r5 = 0
        L_0x010a:
            int r0 = r7.length
            if (r5 >= r0) goto L_0x012d
            r4 = r7[r5]
            r1 = 0
        L_0x0110:
            int r0 = r6.length
            if (r1 > r0) goto L_0x0121
            r0 = r6[r5]
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L_0x011e
            int r5 = r5 + 1
            goto L_0x010a
        L_0x011e:
            int r1 = r1 + 1
            goto L_0x0110
        L_0x0121:
            java.lang.String r0 = r4.getSimpleName()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r0}
            java.lang.String r0 = "Method %s cannot be used as method %s since it has a checked exception (%s) not handled."
            goto L_0x0055
        L_0x012d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Cy.A01(X.4Cz, X.4Cz):boolean");
    }

    public static boolean A02(Class cls, Class cls2, String str, Object... objArr) {
        if (cls2.isAssignableFrom(cls)) {
            return true;
        }
        A00(002.A0R(str, "Reason: Class %s cannot be cast to class %s"), new 0JJ(objArr, objArr.length), cls.getName(), cls2.getName());
        return false;
    }
}
