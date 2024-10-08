package X;

import java.util.List;

/* renamed from: X.Vzg  reason: case insensitive filesystem */
public final class C18746Vzg {
    public static Boolean A00;
    public static String A01;
    public static String A02;
    public static String A03;
    public static boolean A04;
    public static final C18746Vzg A05 = new Object();

    public final boolean A01(String str, String str2) {
        0qQ.A0B(str, 0);
        List A18 = DbV.A18(str, ".");
        Object A0J = 00k.A0J(A18);
        if (A0J != null && A0J.equals("eng")) {
            return false;
        }
        List A182 = DbV.A18(str2, ".");
        int i = 0;
        while (i < A18.size() && i < A182.size() && Pxg.A0J(A18, i) <= Pxg.A0J(A182, i)) {
            if (Pxg.A0J(A18, i) < Pxg.A0J(A182, i)) {
                A00(true);
                return true;
            }
            i++;
        }
        return false;
    }

    public static final void A00(boolean z) {
        A04 = z;
        C363058j1.A02.A01("sup:VersionEnforcementService", 002.A1D("Setting versionUpgradeRequired = ", z));
    }
}
