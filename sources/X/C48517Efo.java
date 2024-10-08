package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Efo  reason: case insensitive filesystem */
public abstract class C48517Efo {
    public static Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        List list = r12.A00;
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        Object obj3 = list.get(2);
        AnonymousClass37D A0i = DbT.A0i(C308206Td.A04(r11));
        if (A0i == null) {
            return null;
        }
        C49731F3w A07 = 1as.A04.A02.A07(C308206Td.A08(r11), DbT.A0Z(r11), 2FW.A0r);
        obj.getClass();
        String str = (String) obj;
        obj2.getClass();
        String str2 = (String) obj2;
        obj3.getClass();
        String str3 = (String) obj3;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        Bundle bundle = A07.A07;
        bundle.putString("DirectShareSheetConstants.referral_id", str);
        bundle.putString("DirectShareSheetConstants.referral_title", str2);
        bundle.putString("DirectShareSheetConstants.referral_title", str3);
        A0i.A0I(A07.A00());
        return null;
    }
}
