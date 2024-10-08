package X;

import android.view.View;

public final class FZH implements C252213ok {
    public final int A00;
    public final Object A01;

    public FZH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DMr(int i, boolean z) {
        switch (this.A00) {
            case 0:
                C49634Ezr ezr = (C49634Ezr) this.A01;
                if (ezr.A01) {
                    ezr.A03.postDelayed(new C51385FtH(this, i), 250);
                    return;
                }
                return;
            case 1:
                C49653F0k f0k = (C49653F0k) this.A01;
                boolean A1R = AnonymousClass7TF.A1R(i);
                f0k.A00 = A1R;
                if (!A1R) {
                    f0k.A07.getText().clear();
                }
                float f = -((float) i);
                View view = f0k.A01;
                if (view.getTranslationY() != f) {
                    int i2 = 8;
                    float f2 = 0.0f;
                    float f3 = 1.0f;
                    if (f0k.A00) {
                        i2 = 0;
                        f3 = 0.0f;
                        f2 = 1.0f;
                    }
                    C294975nL A012 = C294975nL.A01(view, 0);
                    A012.A0G();
                    C294975nL A0A = A012.A0A();
                    A0A.A0K(f);
                    A0A.A0M(f3, f2);
                    A0A.A04 = 0;
                    A0A.A03 = i2;
                    A0A.A0H();
                }
                C68478NJv.A03(f0k.A06).A03(Dba.A1U(i));
                return;
            default:
                return;
        }
    }
}
