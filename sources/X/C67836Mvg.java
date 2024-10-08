package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mvg  reason: case insensitive filesystem */
public final class C67836Mvg extends C249403jg {
    public final int A00 = 4;
    public final 2Rw A01;
    public final C62320sa A02;

    public C67836Mvg(2Rw r2, C62320sa r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        LinearLayoutManager linearLayoutManager;
        int A0D = AnonymousClass7TG.A0D(recyclerView, 1566525201);
        super.onScrolled(recyclerView, i, i2);
        C252553pI r2 = recyclerView.A0D;
        if (!(r2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) r2) == null) {
            i3 = -470704782;
        } else {
            int itemCount = this.A01.getItemCount();
            if (itemCount > 0 && itemCount - linearLayoutManager.A1d() <= this.A00) {
                this.A02.invoke();
            }
            i3 = 1347713545;
        }
        AnonymousClass0fD.A0A(i3, A0D);
    }
}
