package X;

import android.view.View;

/* renamed from: X.91b  reason: invalid class name and case insensitive filesystem */
public final class C3724891b extends AnonymousClass3NK {
    public final /* synthetic */ AnonymousClass91a A00;

    public C3724891b(AnonymousClass91a r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        Integer num;
        AnonymousClass91a r3 = this.A00;
        int intValue = r3.A00.intValue();
        if (intValue == 0) {
            num = AnonymousClass05K.A0C;
        } else if (intValue != 1) {
            if (intValue == 2) {
                num = AnonymousClass05K.A01;
            }
            return true;
        } else {
            num = AnonymousClass05K.A00;
        }
        r3.A00(num);
        return true;
    }
}
