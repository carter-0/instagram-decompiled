package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LqW  reason: case insensitive filesystem */
public final class C65277LqW implements MSK {
    public final /* synthetic */ C60179Jgy A00;

    public C65277LqW(C60179Jgy jgy) {
        this.A00 = jgy;
    }

    public final void Dhp(String str, List list) {
        Object value;
        ArrayList A0U;
        Integer num;
        List list2;
        String str2;
        C60179Jgy jgy = this.A00;
        if (str.equals(((C61070Jw8) jgy.A05.getValue()).A03)) {
            05G r7 = jgy.A04;
            do {
                value = r7.getValue();
                C61070Jw8 jw8 = (C61070Jw8) value;
                A0U = 00k.A0U(list);
                018.A1A(A0U, new C59100J6i(jgy, 36));
                num = AnonymousClass05K.A0C;
                list2 = (List) jw8.A01;
                str2 = jw8.A03;
                DbY.A1S(list2, str2);
            } while (!r7.AIY(value, new C61070Jw8(num, str2, list2, (List) A0U)));
        }
    }
}
