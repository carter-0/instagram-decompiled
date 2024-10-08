package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.O1u  reason: case insensitive filesystem */
public abstract class C70316O1u {
    public static final void A00(AnonymousClass6N2 r11) {
        C270084gA r0;
        List list;
        AnonymousClass2t9 r5;
        C255773uh r02 = r11.A04;
        if (r02 != null && (r0 = r02.A07) != null && (list = r0.A01) != null && r11.A02 != null && (r5 = r11.A03) != null) {
            ViewModelListUpdate A0R = DbS.A0R();
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                BHV bhv = (BHV) next;
                A0r.add(new C68206N5v(bhv.A00, bhv.A01, (List) null, (List) null, i));
                i = i2;
            }
            A0R.A01(A0r);
            r5.A05(A0R);
        }
    }
}
