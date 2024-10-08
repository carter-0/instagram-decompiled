package X;

/* renamed from: X.QkG  reason: case insensitive filesystem */
public abstract class C8207QkG extends C8208QkH {
    public final C12445Suc[] A00;

    public final C8202QkB A0H(int i) {
        C12445Suc suc;
        int i2 = i;
        C268894eF A0G = A0G(i);
        C269074eX r5 = this.A01;
        C12445Suc[] sucArr = this.A00;
        if (sucArr == null || i < 0 || i >= sucArr.length) {
            suc = null;
        } else {
            suc = sucArr[i];
        }
        return new C8202QkB(A0G, this, suc, r5, i2);
    }

    public final int A0F() {
        Class[] parameterTypes;
        if (this instanceof C8206QkF) {
            C8206QkF qkF = (C8206QkF) this;
            parameterTypes = qkF.A00;
            if (parameterTypes == null) {
                parameterTypes = qkF.A01.getParameterTypes();
                qkF.A00 = parameterTypes;
            }
        } else {
            parameterTypes = ((C8205QkE) this).A00.getParameterTypes();
        }
        return parameterTypes.length;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.QkE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.QkF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.QkE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.QkE} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268894eF A0G(int r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C8206QkF
            if (r0 == 0) goto L_0x0012
            r1 = r3
            X.QkF r1 = (X.C8206QkF) r1
            java.lang.reflect.Method r0 = r1.A01
        L_0x0009:
            java.lang.reflect.Type[] r2 = r0.getGenericParameterTypes()
            int r0 = r2.length
            if (r4 < r0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0012:
            r1 = r3
            X.QkE r1 = (X.C8205QkE) r1
            java.lang.reflect.Constructor r0 = r1.A00
            goto L_0x0009
        L_0x0018:
            X.4eX r1 = r1.A01
            r0 = r2[r4]
            X.4eF r0 = r1.EIi(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8207QkG.A0G(int):X.4eF");
    }

    public final Class A0I(int i) {
        if (this instanceof C8206QkF) {
            C8206QkF qkF = (C8206QkF) this;
            Class[] clsArr = qkF.A00;
            if (clsArr == null) {
                clsArr = qkF.A01.getParameterTypes();
                qkF.A00 = clsArr;
            }
            if (0 < clsArr.length) {
                return clsArr[0];
            }
            return null;
        }
        Class[] parameterTypes = ((C8205QkE) this).A00.getParameterTypes();
        if (i < parameterTypes.length) {
            return parameterTypes[i];
        }
        return null;
    }

    public final Object A0J() {
        if (this instanceof C8206QkF) {
            return ((C8206QkF) this).A01.invoke((Object) null, Pxe.A1b());
        }
        return ((C8205QkE) this).A00.newInstance((Object[]) null);
    }

    public final Object A0K(Object obj) {
        if (this instanceof C8206QkF) {
            return ((C8206QkF) this).A01.invoke((Object) null, new Object[]{obj});
        }
        return ((C8205QkE) this).A00.newInstance(new Object[]{obj});
    }

    public C8207QkG(C12445Suc suc, C269074eX r2, C12445Suc[] sucArr) {
        super(suc, r2);
        this.A00 = sucArr;
    }
}
