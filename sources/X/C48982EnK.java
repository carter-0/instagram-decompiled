package X;

import android.content.Context;

/* renamed from: X.EnK  reason: case insensitive filesystem */
public abstract class C48982EnK {
    public static final void A00(Context context, int i) {
        int i2;
        Object[] objArr;
        Integer valueOf;
        0qQ.A0B(context, 0);
        int ceil = (int) Math.ceil((double) (((float) i) / 60.0f));
        if (ceil > 1) {
            i2 = 2131974069;
            objArr = new Object[1];
            valueOf = Integer.valueOf(ceil);
        } else {
            i2 = 2131974070;
            objArr = new Object[1];
            valueOf = Integer.valueOf(i);
        }
        objArr[0] = valueOf;
        String string = context.getString(i2, objArr);
        0qQ.A0A(string);
        C49952FGh.A05(context, string, context.getString(2131974071));
    }
}
