package X;

/* renamed from: X.Ns9  reason: case insensitive filesystem */
public abstract class C69786Ns9 {
    public static final Object A00(AnonymousClass6Tm r6) {
        Exception exc;
        Object A01 = r6.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        Object A02 = r6.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        String str3 = (String) DbT.A0q(r6, "null cannot be cast to non-null type kotlin.String", 2);
        AnonymousClass7TG.A1N(str, str2);
        0qQ.A0B(str3, 2);
        int i = 0;
        while (true) {
            if (i >= str2.length()) {
                Integer.parseInt(str2);
                exc = new Exception(str3);
                break;
            } else if (Character.isDigit(str2.charAt(i))) {
                i++;
            } else if (str2.equals("ERROR_OUTCOME")) {
                exc = new Exception(str3);
            } else {
                exc = new Exception(str3, (Throwable) null);
            }
        }
        OUs.A00.A00(str, exc);
        return null;
    }
}
