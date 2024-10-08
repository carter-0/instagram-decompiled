package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D07 {
    public static C42102BHf parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Long l = null;
            1Xj r2 = null;
            ArrayList arrayList = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (DatePickerDialogModule.ARG_DATE.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r7);
                } else if ("profile_pic_media_dict".equals(A17)) {
                    r2 = 1Xj.A00(r7);
                } else if ("published_media_dicts".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C41846B3n.A1D(r7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass9NF.A00().equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C42102BHf(r2, l, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C42102BHf bHf) {
        r3.A0c();
        Long l = bHf.A01;
        if (l != null) {
            r3.A0Q(DatePickerDialogModule.ARG_DATE, l.longValue());
        }
        1Xj r1 = bHf.A00;
        if (r1 != null) {
            r3.A0q("profile_pic_media_dict");
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r3, r1);
        }
        List list = bHf.A03;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "published_media_dicts", list);
            while (A0s.hasNext()) {
                C41848B3p.A1O(r3, A0s);
            }
            r3.A0Y();
        }
        String str = bHf.A02;
        if (str != null) {
            r3.A0R(AnonymousClass9NF.A00(), str);
        }
        r3.A0Z();
    }
}
