package X;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.6vJ  reason: invalid class name and case insensitive filesystem */
public abstract class C322136vJ extends 2Rw {
    public final C231422re mDiffer;
    public final C322156vL mListener;

    public void onCurrentListChanged(List list, List list2) {
    }

    public List getCurrentList() {
        return this.mDiffer.A02;
    }

    public Object getItem(int i) {
        return this.mDiffer.A02.get(i);
    }

    public void submitList(List list) {
        this.mDiffer.A01(list, (Runnable) null);
    }

    public C322136vJ(C252303ot r6) {
        C322146vK r4 = new C322146vK(this);
        this.mListener = r4;
        C231442rg r3 = new C231442rg(this);
        synchronized (C231462ri.A01) {
            if (C231462ri.A00 == null) {
                C231462ri.A00 = Executors.newFixedThreadPool(2);
            }
        }
        C231422re r0 = new C231422re(new C231472rj(r6, (Executor) null, C231462ri.A00), (C231452rh) r3);
        this.mDiffer = r0;
        r0.A06.add(r4);
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(25441074);
        int size = this.mDiffer.A02.size();
        AnonymousClass0fD.A0A(-1760296223, A03);
        return size;
    }

    public C322136vJ(C231472rj r4) {
        C322146vK r2 = new C322146vK(this);
        this.mListener = r2;
        C231422re r0 = new C231422re(r4, (C231452rh) new C231442rg(this));
        this.mDiffer = r0;
        r0.A06.add(r2);
    }

    public void submitList(List list, Runnable runnable) {
        this.mDiffer.A01(list, runnable);
    }
}
