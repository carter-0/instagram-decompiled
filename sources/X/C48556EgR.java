package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Map;

/* renamed from: X.EgR  reason: case insensitive filesystem */
public abstract class C48556EgR {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String str;
        String str2;
        String str3;
        String str4;
        Object A01 = r10.A01();
        0qQ.A0C(A01, Pxd.A00(2));
        Map map = (Map) A01;
        Object obj = map.get("tag_id");
        if (obj != null) {
            str = C308206Td.A0G(obj);
        } else {
            str = null;
        }
        Object obj2 = map.get("destination_id");
        if (obj2 != null) {
            str2 = C308206Td.A0G(obj2);
        } else {
            str2 = null;
        }
        Object obj3 = map.get(DialogModule.KEY_TITLE);
        if (obj3 != null) {
            str3 = C308206Td.A0G(obj3);
        } else {
            str3 = null;
        }
        Object obj4 = map.get("subtitle");
        if (obj4 != null) {
            str4 = C308206Td.A0G(obj4);
        } else {
            str4 = null;
        }
        if (!(str2 == null || str2.length() == 0 || str == null || str.length() == 0)) {
            C49731F3w A07 = 1as.A04.A02.A07(C308206Td.A08(r9), DbT.A0Z(r9), 2FW.A0g);
            Bundle bundle = A07.A07;
            bundle.putString("DirectShareSheetConstants.tag_id", str);
            bundle.putString("DirectShareSheetConstants.destination_id", str2);
            bundle.putString("DirectShareSheetConstants.title", str3);
            bundle.putString("DirectShareSheetConstants.subtitle", str4);
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(C308206Td.A04(r9));
            if (A012 != null) {
                A012.A0J(A07.A00());
            }
        }
        return null;
    }
}
