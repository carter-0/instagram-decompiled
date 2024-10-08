package X;

import android.content.Context;

/* renamed from: X.Dhm  reason: case insensitive filesystem */
public final class C46606Dhm implements C307796Rn {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Integer A01;

    public C46606Dhm(Context context, Integer num) {
        this.A00 = context;
        this.A01 = num;
    }

    public final boolean CRA() {
        Context context = this.A00;
        Integer num = this.A01;
        0qQ.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue == 1) {
            return false;
        }
        if (intValue == 2) {
            return AnonymousClass3HA.A00(context);
        }
        throw AnonymousClass7TE.A1K();
    }
}
