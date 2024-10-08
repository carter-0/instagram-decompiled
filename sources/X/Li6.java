package X;

import android.view.View;

public final class Li6 implements C232262tL {
    public final int A00;
    public final View.OnClickListener A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Li6 li6 = (Li6) obj;
        0qQ.A0B(li6, 0);
        if (this.A00 != li6.A00 || !0qQ.A0K(this.A02, li6.A02)) {
            return false;
        }
        return true;
    }

    public Li6(View.OnClickListener onClickListener, String str, int i) {
        this.A00 = i;
        this.A01 = onClickListener;
        this.A02 = str;
    }
}
