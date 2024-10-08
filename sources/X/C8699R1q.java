package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* renamed from: X.R1q  reason: case insensitive filesystem */
public final class C8699R1q extends RDL {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8699R1q(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0010;
                case 2: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = "JAVA9"
            r0 = 3
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            java.lang.String r1 = "JAVA6"
            r0 = 0
            goto L_0x0008
        L_0x0010:
            java.lang.String r1 = "JAVA7"
            r0 = 1
            goto L_0x0008
        L_0x0014:
            java.lang.String r1 = "JAVA8"
            r0 = 2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8699R1q.<init>(int):void");
    }

    public final String A00(Type type) {
        switch (this.A00) {
            case 2:
                try {
                    return (String) Pxj.A0l(type, Type.class, "getTypeName");
                } catch (NoSuchMethodException unused) {
                    throw Pxe.A0e("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            case 3:
                return RDL.A02.A00(type);
            default:
                return super.A00(type);
        }
    }
}
