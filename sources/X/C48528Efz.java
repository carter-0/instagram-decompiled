package X;

import com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1;
import java.util.List;

/* renamed from: X.Efz  reason: case insensitive filesystem */
public abstract class C48528Efz {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Integer num;
        Object A01 = r11.A01();
        String A0p = DbS.A0p(A01);
        String str = (String) A01;
        Object A02 = r11.A02();
        0qQ.A0C(A02, A0p);
        String str2 = (String) A02;
        List list = r11.A00;
        C277014uI A0R = DbV.A0R(list, 2);
        Number number = (Number) list.get(3);
        if (number != null) {
            num = Integer.valueOf(number.intValue());
        } else {
            num = null;
        }
        AnonymousClass7TE.A1Z(new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1(r10, A0R, num, str, str2, (AnonymousClass4D7) null, DbW.A1W(r11, 4), DbW.A1W(r11, 5)), AnonymousClass1HX.A02(197189788, 3));
        return null;
    }
}
