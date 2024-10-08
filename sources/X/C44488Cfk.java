package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cfk  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44488Cfk {
    public static Map A00(DUD dud) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dud.AvQ() != null) {
            A1H.put(DatePickerDialogModule.ARG_DATE, dud.AvQ());
        }
        1Xj Bh1 = dud.Bh1();
        if (Bh1 != null) {
            A1H.put("profile_pic_media_dict", Bh1.A1C());
        }
        List BiI = dud.BiI();
        if (BiI != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BiI);
            Iterator it = BiI.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("published_media_dicts", A0r);
        }
        if (dud.getUsername() != null) {
            A1H.put(AnonymousClass9NF.A00(), dud.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
