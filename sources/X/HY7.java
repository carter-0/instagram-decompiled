package X;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class HY7 {
    public static final C286025Tq A00(Resources resources, AnonymousClass5ZB r11, C53380GnA[] gnAArr, int i) {
        C303876Bd A0b = C51969G9p.A0b();
        ArrayList A0v = DbS.A0v(r6);
        for (C53380GnA gnA : gnAArr) {
            A0v.add(resources.getString(gnA.A00));
        }
        String[] A1b = DbU.A1b(A0v, 0);
        String string = resources.getString(i, Arrays.copyOf(A1b, A1b.length));
        0qQ.A07(string);
        A0b.A09(string);
        for (C53380GnA gnA2 : gnAArr) {
            String A0d = AnonymousClass7TF.A0d(resources, gnA2.A00);
            int A08 = 00l.A08(string, A0d, 0, false);
            int A05 = C51966G9m.A05(A0d, A08);
            A0b.A06(r11, A08, A05);
            A0b.A0A(gnA2.A02, gnA2.A01, A08, A05);
        }
        return A0b.A02();
    }
}
