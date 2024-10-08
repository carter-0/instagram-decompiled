package X;

import java.lang.annotation.Annotation;

/* renamed from: X.QkP  reason: case insensitive filesystem */
public final class C8216QkP extends SIL {
    public C8205QkE A00;
    public final C269074eX A01;
    public final boolean A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Suc, java.lang.Object] */
    public static C12445Suc A00(C8216QkP qkP, C269584fM r2) {
        if (!qkP.A02) {
            return new Object();
        }
        Annotation[] annotationArr = r2.A02;
        if (annotationArr == null) {
            annotationArr = r2.A01.getDeclaredAnnotations();
            r2.A02 = annotationArr;
        }
        return qkP.A03(annotationArr).A01();
    }

    private C12445Suc[] A01(Annotation[][] annotationArr) {
        if (!this.A02) {
            return SIL.A01;
        }
        int length = annotationArr.length;
        C12445Suc[] sucArr = new C12445Suc[length];
        for (int i = 0; i < length; i++) {
            C269094eZ r5 = C8210QkJ.A00;
            for (Annotation annotation : annotationArr[i]) {
                r5 = r5.A00(annotation);
                if (this.A00.A0p(annotation)) {
                    r5 = A02(r5, annotation);
                }
            }
            sucArr[i] = r5.A01();
        }
        return sucArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.Suc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.Suc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8205QkE A04(X.C269584fM r10) {
        /*
            r9 = this;
            int r6 = r10.A00
            if (r6 >= 0) goto L_0x000d
            java.lang.reflect.Constructor r0 = r10.A01
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r6 = r0.length
            r10.A00 = r6
        L_0x000d:
            X.4eA r0 = r9.A00
            if (r0 != 0) goto L_0x002b
            X.4eX r7 = r9.A01
            java.lang.reflect.Constructor r5 = r10.A01
            X.Suc r3 = new X.Suc
            r3.<init>()
            if (r6 == 0) goto L_0x0035
            X.Suc[] r2 = new X.C12445Suc[r6]
            r1 = 0
        L_0x001f:
            if (r1 >= r6) goto L_0x0037
            X.Suc r0 = new X.Suc
            r0.<init>()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x001f
        L_0x002b:
            if (r6 != 0) goto L_0x003d
            X.4eX r7 = r9.A01
            java.lang.reflect.Constructor r5 = r10.A01
            X.Suc r3 = A00(r9, r10)
        L_0x0035:
            X.Suc[] r2 = X.SIL.A01
        L_0x0037:
            X.QkE r4 = new X.QkE
            r4.<init>(r3, r7, r5, r2)
            return r4
        L_0x003d:
            java.lang.annotation.Annotation[][] r7 = r10.A03
            if (r7 != 0) goto L_0x0049
            java.lang.reflect.Constructor r0 = r10.A01
            java.lang.annotation.Annotation[][] r7 = r0.getParameterAnnotations()
            r10.A03 = r7
        L_0x0049:
            int r5 = r7.length
            if (r6 == r5) goto L_0x008e
            java.lang.reflect.Constructor r8 = r10.A01
            java.lang.Class r1 = r8.getDeclaringClass()
            java.util.Iterator r0 = X.C269574fL.A00
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r1)
            r4 = 0
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L_0x007a
            int r0 = r5 + 2
            if (r6 != r0) goto L_0x007a
            java.lang.annotation.Annotation[][] r1 = new java.lang.annotation.Annotation[r0][]
            java.lang.System.arraycopy(r7, r4, r1, r2, r5)
        L_0x0068:
            X.Suc[] r3 = r9.A01(r1)
        L_0x006c:
            X.4eX r2 = r9.A01
            java.lang.reflect.Constructor r1 = r10.A01
            X.Suc r0 = A00(r9, r10)
            X.QkE r4 = new X.QkE
            r4.<init>(r0, r2, r1, r3)
            return r4
        L_0x007a:
            boolean r0 = r1.isMemberClass()
            if (r0 == 0) goto L_0x0093
            int r0 = r5 + 1
            if (r6 != r0) goto L_0x0093
            java.lang.annotation.Annotation[][] r1 = new java.lang.annotation.Annotation[r0][]
            java.lang.System.arraycopy(r7, r4, r1, r3, r5)
            java.lang.annotation.Annotation[] r0 = X.SIL.A02
            r1[r4] = r0
            goto L_0x0068
        L_0x008e:
            X.Suc[] r3 = r9.A01(r7)
            goto L_0x006c
        L_0x0093:
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = X.Pxg.A1a(r0, r6, r5)
            java.lang.String r0 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.IllegalStateException r0 = X.Pxf.A0Y(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8216QkP.A04(X.4fM):X.QkE");
    }

    public C8216QkP(C268854eA r1, C269074eX r2, boolean z) {
        super(r1);
        this.A01 = r2;
        this.A02 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.Suc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.Suc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.Suc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8206QkF A05(X.C269074eX r6, java.lang.reflect.Method r7) {
        /*
            r5 = this;
            java.lang.Class[] r0 = r7.getParameterTypes()
            int r4 = r0.length
            X.4eA r0 = r5.A00
            if (r0 != 0) goto L_0x001f
            X.Suc r1 = new X.Suc
            r1.<init>()
            if (r4 == 0) goto L_0x003b
            X.Suc[] r3 = new X.C12445Suc[r4]
            r2 = 0
        L_0x0013:
            X.Suc r0 = new X.Suc
            r0.<init>()
            r3[r2] = r0
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x0035
            goto L_0x0013
        L_0x001f:
            java.lang.annotation.Annotation[] r0 = r7.getDeclaredAnnotations()
            X.4eZ r0 = r5.A03(r0)
            X.Suc r1 = r0.A01()
            if (r4 == 0) goto L_0x003b
            java.lang.annotation.Annotation[][] r0 = r7.getParameterAnnotations()
            X.Suc[] r3 = r5.A01(r0)
        L_0x0035:
            X.QkF r0 = new X.QkF
            r0.<init>(r1, r6, r7, r3)
            return r0
        L_0x003b:
            X.Suc[] r3 = X.SIL.A01
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8216QkP.A05(X.4eX, java.lang.reflect.Method):X.QkF");
    }
}
