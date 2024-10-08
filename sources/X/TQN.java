package X;

public final class TQN extends RuntimeException {
    /* renamed from: A01 */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception A00() {
        int indexOf;
        String A0I;
        Class<C8359QpH> cls = C8359QpH.class;
        int i = 0;
        Class[] clsArr = {cls};
        for (char c = 0; c <= 0; c = 1) {
            Class cls2 = clsArr[c];
            if (!(!RuntimeException.class.isAssignableFrom(cls2))) {
                Object[] objArr = {"getCause", cls2};
                for (int i2 = 0; i2 < 2; i2++) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        A0I = "null";
                    } else {
                        try {
                            A0I = obj.toString();
                        } catch (Exception e) {
                            A0I = Pxk.A0I(obj, e);
                        }
                    }
                    objArr[i2] = A0I;
                }
                StringBuilder A14 = Pxe.A14(118);
                int i3 = 0;
                while (i < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i3)) != -1) {
                    A14.append("The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, indexOf);
                    A14.append(objArr[i]);
                    i3 = indexOf + 2;
                    i++;
                }
                A14.append("The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, 86);
                if (i < 2) {
                    for (int A07 = Pxg.A07(" [", A14, objArr, i); A07 < 2; A07 = Pxg.A07(", ", A14, objArr, A07)) {
                    }
                    A14.append(']');
                }
                throw AnonymousClass7TE.A0w(A14.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return cls.cast(getCause());
        }
        Exception A01 = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", new Object[]{cls}));
        classCastException.initCause(A01);
        throw classCastException;
    }
}
