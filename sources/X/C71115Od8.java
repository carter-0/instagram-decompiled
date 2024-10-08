package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Od8  reason: case insensitive filesystem */
public abstract class C71115Od8 {
    public static final C74342PtI A00 = new PEP();

    public static final C270214gN A00(C268654dm r1) {
        0qQ.A0B(r1, 0);
        return A01(r1, A00);
    }

    public static final C270214gN A01(C268654dm r3, C74342PtI ptI) {
        Throwable A01 = r3.A01();
        AnonymousClass1XT r0 = (AnonymousClass1XT) r3.A00();
        if (A01 != null) {
            return A03(A01);
        }
        if (r0 != null) {
            return ptI.AWW(r0, "http");
        }
        if ("http".equals("http")) {
            return C270214gN.A0L;
        }
        return C270214gN.A0N;
    }

    public static final C270214gN A02(C254403sQ r8, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        C254403sQ r3 = r8;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        int i2 = i;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i2 >= 400 && i2 < 500) || A04(str4)) {
            return new C270214gN(r3, C69414Nku.A0D, String.valueOf(i2), str8, str5, (String) null, str6, str7, false, false, z4, z5, z6, false);
        }
        if (i2 >= 500) {
            return new C270214gN(r3, C69414Nku.A0D, String.valueOf(i2), str8, str5, (String) null, str6, str7, C51969G9p.A1a(r8, C254403sQ.MESSAGE_SEND_FAILED), true, z4, z5, z6, false);
        }
        0wb.A03("SendError_unsupported_status_code", 002.A05(i2, "Unsupported HTTP status code: statusCode=", " message=", str6));
        if (str5.equals("http")) {
            return C270214gN.A0L;
        }
        return C270214gN.A0N;
    }

    public static final C270214gN A03(Throwable th) {
        C69414Nku nku;
        String str;
        0qQ.A0B(th, 0);
        String format = String.format(Locale.US, AnonymousClass000.A00(201), Arrays.copyOf(new Object[]{C66581MXm.A0y(th), th.getMessage()}, 2));
        0qQ.A07(format);
        if (th instanceof C69248NiA) {
            nku = C69414Nku.A0D;
            str = String.valueOf(((C69248NiA) th).A00);
        } else {
            nku = C69414Nku.A0C;
            str = "5";
        }
        return new C270214gN(nku, str, "http", format, true, true);
    }

    public static final boolean A04(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("1545119") || str.equals("1545120") || str.equals("1545121") || str.equals("4076001")) {
            return true;
        }
        return false;
    }
}
