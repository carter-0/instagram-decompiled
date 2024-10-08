package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.IhL  reason: case insensitive filesystem */
public final class C57842IhL implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C292795jX A01;

    public C57842IhL(RecyclerView recyclerView, C292795jX r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public final void run() {
        Parcelable A1M;
        C252553pI r0 = this.A00.A0D;
        if (r0 != null && (A1M = r0.A1M()) != null) {
            this.A01.A01 = A1M;
        }
    }
}
