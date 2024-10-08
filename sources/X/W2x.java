package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public abstract class W2x {
    public static final List A00;
    public static final List A01;
    public static final List A02;

    public static final String A00(Context context, int i) {
        int i2 = 2131970462;
        if (i == 1) {
            i2 = 2131970464;
        }
        return DbY.A0c(context, Integer.valueOf(i), i2);
    }

    public static final String A01(String str) {
        0qQ.A0B(str, 0);
        return C51967G9n.A0q(str, 0, str.length() - 1);
    }

    public static final String A02(Currency currency, int i, int i2) {
        0qQ.A0B(currency, 2);
        return C13992Tns.A0P(currency, (double) i, 0, i2);
    }

    static {
        Integer A0R = C13988Tno.A0R();
        Integer A0q = C66580MXl.A0q();
        A00 = 0sr.A1P(new Integer[]{A0R, A0q, 3, 4, 5, 6, 7, 10, 15, 30});
        A01 = 0sr.A1P(new Integer[]{A0R, A0q, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20, 22, 25, 30});
        Integer[] numArr = new Integer[30];
        System.arraycopy(new Integer[]{A0R, A0q, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{28, 29, 30}, 0, numArr, 27, 3);
        A02 = 0sr.A1P(numArr);
    }

    public static final List A03(Context context) {
        List list = A02;
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int A0F = AnonymousClass7TG.A0F(it);
            W2W w2w = C17149VKb.A00;
            A0m.add(DbY.A0c(context, Integer.valueOf(A0F), W2W.A01(context).A00));
        }
        return C51966G9m.A1J(A0m);
    }

    public static final List A05(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00(context, AnonymousClass7TG.A0F(it)));
        }
        return C51966G9m.A1J(arrayList);
    }

    public static final List A04(Context context, PromoteData promoteData) {
        String A0c;
        boolean A1X = DbW.A1X(promoteData);
        ArrayList arrayList = new ArrayList();
        for (Number number : promoteData.A1n) {
            if (promoteData.A0D()) {
                int intValue = number.intValue();
                int i = promoteData.A06;
                Currency currency = promoteData.A1j;
                0qQ.A06(currency);
                String A0c2 = DbY.A0c(context, A02(currency, intValue * 2, i), 2131970257);
                int i2 = promoteData.A06;
                Currency currency2 = promoteData.A1j;
                0qQ.A06(currency2);
                A0c = 0mp.A06("%s (%s)", new Object[]{A0c2, DbY.A0c(context, C13992Tns.A0P(currency2, (double) intValue, A1X ? 1 : 0, i2), 2131953962)});
            } else {
                int A09 = JTP.A09(number);
                int i3 = promoteData.A06;
                Currency currency3 = promoteData.A1j;
                0qQ.A06(currency3);
                A0c = DbY.A0c(context, A02(currency3, A09, i3), 2131970257);
            }
            arrayList.add(A0c);
        }
        return C51966G9m.A1J(arrayList);
    }
}
