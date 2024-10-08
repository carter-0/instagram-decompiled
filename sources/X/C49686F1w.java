package X;

import android.view.View;

/* renamed from: X.F1w  reason: case insensitive filesystem */
public final class C49686F1w {
    public final View A00;
    public final 2cs A01;

    public C49686F1w(View view) {
        this.A00 = view;
        2cs A02 = C61340me.A00().A02();
        A02.A0A(new C47277Du5(this));
        A02.A02();
        this.A01 = A02;
    }

    public final void A00(float f) {
        if (11Z.A07()) {
            this.A01.A07((double) f);
        } else {
            this.A00.post(new C51345Fsd(this, f));
        }
    }
}
