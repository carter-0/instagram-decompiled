package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.3DF  reason: invalid class name */
public final class AnonymousClass3DF extends 1KD {
    public final /* synthetic */ AnonymousClass3BD A00;
    public final /* synthetic */ AnonymousClass36K A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ Iterator A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3DF(AnonymousClass3BD r2, AnonymousClass36K r3, WeakReference weakReference, Iterator it) {
        super("prefetch child views for RV");
        this.A01 = r3;
        this.A02 = weakReference;
        this.A03 = it;
        this.A00 = r2;
    }

    public final boolean onQueueIdle() {
        RecyclerView recyclerView = (RecyclerView) this.A02.get();
        if (recyclerView != null) {
            AnonymousClass36K r2 = this.A01;
            if (!r2.A00) {
                Iterator it = this.A03;
                if (it.hasNext()) {
                    C249703kE prefetchViewHolder = r2.A01.prefetchViewHolder(recyclerView, ((Number) it.next()).intValue());
                    if (prefetchViewHolder.isRecyclable()) {
                        this.A00.A03(prefetchViewHolder);
                        0I2 r0 = 0KC.A01;
                    }
                }
            }
            if (r2.A00 || !this.A03.hasNext()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
