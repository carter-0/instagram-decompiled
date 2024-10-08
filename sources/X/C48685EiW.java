package X;

/* renamed from: X.EiW  reason: case insensitive filesystem */
public abstract class C48685EiW {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str;
        String str2;
        C276544tV r0 = (C276544tV) DbW.A0e(r8);
        if (r0 == null) {
            str = C273654mx.A00(568);
            str2 = "Received null snackbar model while attempting to show snackbar";
        } else {
            C276544tV A07 = r0.A07(35);
            if (A07 == null) {
                str = "SnackbarUtils";
                str2 = "Received null snackbar button model while attempting to show snackbar";
            } else {
                C310336ap A0a = DbS.A0a();
                String str3 = "";
                String str4 = str3;
                String A0F = r0.A0F();
                if (A0F != null) {
                    str4 = A0F;
                }
                A0a.A0D = str4;
                A0a.A04();
                C277014uI A0A = A07.A0A(35);
                A0a.A0L = true;
                String A0F2 = A07.A0F();
                if (A0F2 != null) {
                    str3 = A0F2;
                }
                A0a.A0G = str3;
                A0a.A0A(new FdJ(r7, A0A, 2));
                C308206Td.A04(r7).Bx5().A0A(A0a.A00());
                return null;
            }
        }
        1Kn.A02(str, str2);
        return null;
    }
}
