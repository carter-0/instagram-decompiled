package X;

/* renamed from: X.Rg0  reason: case insensitive filesystem */
public abstract class C9742Rg0 {
    public static void A00(int i, int i2, String str, boolean z) {
        if (!z) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("overflow: ");
            A1A.append(str);
            A1A.append("(");
            A1A.append(i);
            Pxe.A1Y(A1A);
            A1A.append(i2);
            throw new ArithmeticException(AnonymousClass7TF.A0l(")", A1A));
        }
    }
}
