package X;

import android.content.Context;

/* renamed from: X.Uiu  reason: case insensitive filesystem */
public abstract class C15811Uiu extends AnonymousClass4AA implements X40 {
    public Integer A00;

    public abstract int A00(Context context);

    public final int CEi(Context context) {
        Integer num = this.A00;
        if (num != null) {
            return num.intValue();
        }
        int A002 = A00(context);
        this.A00 = Integer.valueOf(A002);
        return A002;
    }
}
