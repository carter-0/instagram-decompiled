package X;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Nud  reason: case insensitive filesystem */
public abstract class C69937Nud {
    public static final String A00(Context context, long j) {
        int i;
        Object[] objArr;
        0qQ.A0B(context, 1);
        Date date = new Date();
        Calendar calendar = C14240TsN.A02;
        switch (VB1.A00(date, j).intValue()) {
            case 2:
                i = 2131972674;
                break;
            case 3:
                i = 2131972675;
                break;
            default:
                i = 2131972672;
                objArr = new Object[]{C14240TsN.A04("MMM d", j), C14240TsN.A01(context, j)};
                break;
        }
        objArr = new Object[]{C14240TsN.A01(context, j)};
        String string = context.getString(i, objArr);
        0qQ.A07(string);
        return string;
    }
}
