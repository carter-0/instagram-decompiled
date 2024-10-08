package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.F4g  reason: case insensitive filesystem */
public abstract class C49741F4g {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        C276544tV A0P = DbY.A0P(r12, 0);
        String A0F = A0P.A0F();
        C307896Rx r8 = r11;
        UserSession A0Z = DbT.A0Z(r11);
        C307786Rm r0 = r11.A03;
        if (r0 != null) {
            Context context = r0.A00;
            if (0qQ.A0K(A0F, "SSO_Cache")) {
                0qQ.A0B(A0Z, 0);
                C375839Fj.A00(A0Z).A03(new C51633FxR(AnonymousClass1UZ.A00(context).A00("XE_ACCESS_LIBRARY_DATA"), r8, A0P.A09()), true);
            } else if (0qQ.A0K(A0F, "Device_Library")) {
                C277014uI A09 = A0P.A09();
                String A0H = A0P.A0H();
                if (A0H == null) {
                    A0H = "";
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                1Eo.A05(AnonymousClass12T.A00.A04, new MHM(A0Z, A09, r8, A1C, A0H, (AnonymousClass4D7) null, 2), AnonymousClass07a.A00(Dba.A08(r8)));
                return null;
            }
        }
        return null;
    }

    public static final ArrayList A01(String str, List list) {
        String str2;
        ArrayList A14 = DbV.A14(str);
        if (list != null) {
            A14.add("");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FXDeviceItem fXDeviceItem = (FXDeviceItem) it.next();
                C62447Kfx kfx = fXDeviceItem.A03;
                if (kfx == null || (str2 = kfx.name()) == null) {
                    str2 = "No Data Found";
                }
                A14.add(str2);
                String str3 = fXDeviceItem.A02;
                if (str3 == null || str3.length() == 0) {
                    A14.add("No Data Found");
                } else {
                    A14.add(str3);
                }
                Long l = fXDeviceItem.A01;
                if (l != null) {
                    A14.add("CREATED_TIMESTAMP");
                    A14.add(String.valueOf(l));
                }
            }
        } else {
            A14.add("No Data Found");
        }
        return A14;
    }
}
