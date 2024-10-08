package X;

import java.lang.reflect.Method;

public final class SHH {
    public static final SHH A03;
    public static final RuntimeException A04;
    public final Method A00;
    public final Method A01;
    public final Method A02;

    static {
        SHH shh = null;
        try {
            e = null;
            shh = new SHH();
        } catch (RuntimeException e) {
            e = e;
        }
        A03 = shh;
        A04 = e;
    }

    public final Object[] A00(Class cls) {
        try {
            return (Object[]) this.A02.invoke(cls, Pxe.A1b());
        } catch (Exception unused) {
            throw AnonymousClass7TF.A0W("Failed to access RecordComponents of type ", C269574fL.A06(cls));
        }
    }

    public SHH() {
        try {
            this.A02 = Class.class.getMethod("getRecordComponents", new Class[0]);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.A00 = cls.getMethod("getName", new Class[0]);
            this.A01 = cls.getMethod("getType", new Class[0]);
        } catch (Exception e) {
            throw Pxe.A0u(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", new Object[]{C66581MXm.A0y(e), e.getMessage()}), e);
        }
    }
}
