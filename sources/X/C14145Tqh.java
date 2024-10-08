package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.Tqh  reason: case insensitive filesystem */
public final class C14145Tqh implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ boolean A01;

    public C14145Tqh(RecyclerView recyclerView, boolean z) {
        this.A01 = z;
        this.A00 = recyclerView;
    }

    public final void run() {
        if (!this.A01) {
            RecyclerView recyclerView = this.A00;
            0qQ.A0C(recyclerView, "null cannot be cast to non-null type com.instagram.ui.recyclerpager.HorizontalRecyclerPager");
            ((HorizontalRecyclerPager) recyclerView).A1I();
        }
    }
}
