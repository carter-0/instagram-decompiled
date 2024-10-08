package X;

/* renamed from: X.S3i  reason: case insensitive filesystem */
public abstract class C10974S3i {
    public final String A02(C8206QkF qkF, String str) {
        C8201QkA qkA = (C8201QkA) this;
        String str2 = qkA.A00;
        if (str2 == null) {
            return null;
        }
        Class<?> returnType = qkF.A01.getReturnType();
        if ((returnType != Boolean.class && returnType != Boolean.TYPE) || !str.startsWith(str2)) {
            return null;
        }
        if (qkA.A02) {
            return C8201QkA.A01(str, 2);
        }
        return C8201QkA.A00(str, 2);
    }

    public abstract String A03(C8206QkF qkF, String str);
}
