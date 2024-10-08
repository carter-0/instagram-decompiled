package X;

import android.content.Context;

public abstract class FEQ {
    public static final int A00 = DbX.A07(Dc2.A0S);
    public static final C310346aq A01 = C310346aq.ERROR;

    public static final void A00(Context context, String str, String str2, boolean z) {
        int i;
        Object[] objArr;
        String string;
        int i2;
        Object[] objArr2;
        DbY.A1S(context, str2);
        boolean A0B = 0mp.A0B(str);
        if (z) {
            if (A0B) {
                i2 = 2131974075;
                objArr2 = new Object[]{str2};
            } else {
                i2 = 2131974073;
                objArr2 = new Object[]{str, str2};
            }
            string = context.getString(i2, objArr2);
            0qQ.A0A(string);
        } else {
            if (A0B) {
                i = 2131974078;
                objArr = new Object[]{str2};
            } else {
                i = 2131974076;
                objArr = new Object[]{str, str2};
            }
            string = context.getString(i, objArr);
            0qQ.A07(string);
        }
        A01(string);
    }

    public static final void A01(String str) {
        C310336ap A0a = DbS.A0a();
        A0a.A0C(A01);
        A0a.A0H = "post_block_failure";
        A0a.A0D = str;
        A0a.A01 = A00;
        DbY.A1N(A0a);
    }
}
