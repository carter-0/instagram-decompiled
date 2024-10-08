package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
public final class I0B {
    public int A00;
    public C66125MCx A01;
    public C66125MCx A02;
    public C231452rh A03;
    public Executor A04;
    public final C54724HQd A05;
    public final LEy A06;
    public final C231472rj A07;
    public final List A08;
    public final CopyOnWriteArrayList A09 = new CopyOnWriteArrayList();
    public final C59520Ya A0A;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.InR, X.0Ya] */
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public I0B(C252303ot r5, 2Rw r6) {
        Executor executor = C21057XCj.A03;
        0qQ.A07(executor);
        this.A04 = executor;
        C53060Ghs ghs = new C53060Ghs(this);
        this.A06 = ghs;
        this.A0A = new C58161InR(ghs, 1);
        this.A08 = new CopyOnWriteArrayList();
        this.A05 = new C53058Ghq(this);
        this.A03 = new C231442rg(r6);
        synchronized (C231462ri.A01) {
            if (C231462ri.A00 == null) {
                C231462ri.A00 = Executors.newFixedThreadPool(2);
            }
        }
        this.A07 = new C231472rj(r5, (Executor) null, C231462ri.A00);
    }

    public static final void A00(I0B i0b, C66125MCx mCx, C66125MCx mCx2) {
        Iterator it = i0b.A09.iterator();
        while (it.hasNext()) {
            ((IHP) ((JLR) it.next())).A00.invoke(mCx, mCx2);
        }
    }
}
