package X;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Ns7  reason: case insensitive filesystem */
public abstract class C69784Ns7 {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        OTP otp;
        Object A03 = r12.A03(0);
        DbS.A1Y(A03);
        String str = (String) A03;
        List list = r12.A00;
        String A0t = DbU.A0t(list, 1);
        String A0t2 = DbU.A0t(list, 2);
        String A0t3 = DbU.A0t(list, 3);
        String A0t4 = DbU.A0t(list, 4);
        0lg A0B = C308206Td.A0B(r11);
        synchronized (OTP.A03) {
            0qQ.A0B(A0B, 0);
            otp = (OTP) A0B.A01(OTP.class, new C13348TVv(A0B, 37));
        }
        if (A0t3 == null) {
            A0t3 = "com.bloks.www.consent.flow.action";
        }
        0qQ.A0B(str, 0);
        String A0n = C51972G9s.A0n();
        LinkedHashMap A00 = OOW.A00(str, A0n, A0t, A0t2, A0t4);
        String obj = 0sr.A1P(new String[]{str, A0t3, A0t, A0t2, A0t4}).toString();
        C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, otp.A01, A0t3, A00);
        A02.A00(new C68501NKu(otp, obj, A0n));
        1ES.A03(A02);
        return null;
    }
}
