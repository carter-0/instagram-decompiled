package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.Ebl  reason: case insensitive filesystem */
public abstract class C48266Ebl {
    public static final ArrayList A00(AnonymousClass6Tm r9) {
        int i = 0;
        Object A0g = DbW.A0g(r9, 0);
        Integer num = AnonymousClass05K.A0N;
        Integer num2 = num;
        Integer[] A00 = AnonymousClass05K.A00(4);
        int length = A00.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num3 = A00[i];
            if (0qQ.A0K(Eo7.A00(num3), A0g)) {
                num = num3;
                break;
            }
            i++;
        }
        Context A04 = DbT.A04();
        ArrayList A0q = AnonymousClass7TF.A0q(num, 0);
        ArrayList A002 = C49196Er1.A00(A04);
        if (!A002.isEmpty()) {
            A0q.addAll(A002);
        }
        if (!(num == AnonymousClass05K.A0C || num == num2 || "".length() == 0)) {
            A0q.add("");
        }
        String str = C49315Esy.A00;
        if (!(str == null || str.length() == 0)) {
            A0q.add(str);
        }
        return A0q;
    }
}
