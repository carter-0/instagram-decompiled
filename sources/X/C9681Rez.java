package X;

/* renamed from: X.Rez  reason: case insensitive filesystem */
public abstract class C9681Rez {
    public static String A00(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = length - length2;
        if (i < 0 || i > 1) {
            throw AnonymousClass7TE.A0w("Invalid input received");
        }
        StringBuilder A15 = Pxe.A15(length, length2);
        for (int i2 = 0; i2 < length; i2++) {
            A15.append(str.charAt(i2));
            if (length2 > i2) {
                A15.append(str2.charAt(i2));
            }
        }
        return A15.toString();
    }
}
