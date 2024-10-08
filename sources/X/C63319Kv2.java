package X;

import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kv2  reason: case insensitive filesystem */
public abstract class C63319Kv2 {
    public static C61220JzD A00(C66553MWh mWh, MediaKitSectionType mediaKitSectionType, String str, String str2, String str3, List list, List list2) {
        ArrayList arrayList;
        C61219JzC jzC = null;
        AnonymousClass7TH.A0K();
        if (list2 != null) {
            arrayList = AnonymousClass7TG.A0r(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                JTT.A1U(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        if (mWh != null) {
            jzC = (C61219JzC) mWh;
        }
        return new C61220JzD(jzC, mediaKitSectionType, str, str2, str3, list, arrayList);
    }
}
