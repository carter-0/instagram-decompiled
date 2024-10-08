package X;

import android.view.View;

/* renamed from: X.Lhv  reason: case insensitive filesystem */
public final class C64779Lhv implements C232262tL {
    public final int A00;
    public final View.OnClickListener A01;

    public C64779Lhv(View.OnClickListener onClickListener, int i) {
        0qQ.A0B(onClickListener, 4);
        this.A00 = i;
        this.A01 = onClickListener;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64779Lhv lhv = (C64779Lhv) obj;
        0qQ.A0B(lhv, 0);
        return AnonymousClass7TF.A1S(this.A00, lhv.A00);
    }
}
