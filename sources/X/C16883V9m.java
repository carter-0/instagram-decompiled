package X;

import android.content.Context;

/* renamed from: X.V9m  reason: case insensitive filesystem */
public abstract class C16883V9m {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C276544tV A0O = DbY.A0O(r9);
        String str = "";
        String str2 = str;
        String A0H = A0O.A0H();
        if (A0H != null) {
            str2 = A0H;
        }
        String str3 = str;
        String A0F = A0O.A0F();
        if (A0F != null) {
            str3 = A0F;
        }
        Context requireContext = C308206Td.A01(r8).requireContext();
        1Yh A00 = C18138VmE.A00();
        W29 A002 = VA4.A00().A00(requireContext, DbT.A0Z(r8), str2, str3);
        String A0H2 = A0O.A0H();
        if (A0H2 != null) {
            str = A0H2;
        }
        A002.A0A = W29.A02(str);
        A002.A0C = "ctwa_afterparty_upsell".equals(str3);
        A00.A0B(A002);
        return null;
    }
}
