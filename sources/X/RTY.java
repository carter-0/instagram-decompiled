package X;

import android.content.Context;
import java.util.List;

public abstract class RTY {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        C307706Rd r7;
        Integer num;
        C307786Rm r5 = r11.A03;
        if (r5 == null) {
            return null;
        }
        AnonymousClass6RZ A04 = C307476Qg.A04(r5, "media_store");
        if (!(A04 instanceof C307706Rd) || (r7 = (C307706Rd) A04) == null) {
            1Kn.A02(C273654mx.A00(570), "Failed to load media: MediaStore data module is not found.");
            return null;
        }
        Object A01 = r12.A01();
        DbS.A1Y(A01);
        String str = (String) A01;
        List list = r12.A00;
        List list2 = (List) list.get(1);
        String A0t = DbU.A0t(list, 2);
        Number number = (Number) list.get(3);
        String A0t2 = DbU.A0t(list, 4);
        Context context = r5.A00;
        if (number != null) {
            num = Integer.valueOf(number.intValue());
        } else {
            num = null;
        }
        0qQ.A0B(str, 1);
        r7.A02.execute(new C13073TKd(context, r7, num, A0t, A0t2, str, list2));
        return null;
    }
}
