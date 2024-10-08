package X;

import android.widget.Adapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GiS  reason: case insensitive filesystem */
public final class C53094GiS extends C249403jg {
    public final C227812jx A00;
    public final AnonymousClass343 A01;
    public final C54228H3x A02;

    public C53094GiS(C227812jx r3, C54228H3x h3x) {
        this.A00 = r3;
        this.A02 = h3x;
        this.A01 = new AnonymousClass343((Adapter) h3x, (AnonymousClass4DV) r3, new HB7(h3x));
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A0D = AnonymousClass7TG.A0D(recyclerView, 1399955146);
        super.onScrolled(recyclerView, i, i2);
        if (!this.A00.isResumed()) {
            i3 = 232628787;
        } else {
            this.A01.A01();
            i3 = 2130770209;
        }
        AnonymousClass0fD.A0A(i3, A0D);
    }
}
