package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.Wdq  reason: case insensitive filesystem */
public final class C19688Wdq implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19688Wdq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D9V() {
        switch (this.A00) {
            case 0:
                new Handler().postDelayed(new C20250Wnp((AnonymousClass4DH) this.A01, (AnonymousClass37D) this.A02), 400);
                return;
            case 1:
                new C49945FFy((C46498Dg1) this.A01).A05((Context) this.A02);
                return;
            default:
                ((0sP) this.A01).invoke(this.A02);
                return;
        }
    }

    public final void D9a() {
    }
}
