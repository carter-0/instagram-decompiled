package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NSc  reason: case insensitive filesystem */
public final class C68670NSc extends 0ng {
    public String A00;
    public final List A01;
    public final /* synthetic */ C71949Ota A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68670NSc(C71949Ota ota, String str, List list) {
        super(1788300865, 3, false, false);
        0qQ.A0B(str, 2);
        this.A02 = ota;
        this.A00 = str;
        this.A01 = list;
    }

    private final void A00(ViewGroup viewGroup, C232232tF r7, int i) {
        C71949Ota ota = this.A02;
        C249703kE createViewHolder = r7.createViewHolder(viewGroup, ota.A01);
        HashMap hashMap = ota.A05;
        Integer valueOf = Integer.valueOf(i);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new C330767Oc();
            hashMap.put(valueOf, obj);
        }
        C330767Oc r2 = (C330767Oc) obj;
        if (0qQ.A0K(this.A00, ota.A07)) {
            0qQ.A0B(createViewHolder, 0);
            r2.A01.add(createViewHolder);
            return;
        }
        this.A00 = ota.A07;
        A00(viewGroup, r7, i);
    }

    public final void run() {
        0fh.A01("MessageThreadViewHolderPreloaderIgRecyclerView.preload", 844483705);
        C71949Ota ota = this.A02;
        AnonymousClass0eM r4 = ota.A04.A0A;
        ((C2366634p) AnonymousClass7TE.A14(r4)).A04();
        FrameLayout frameLayout = new FrameLayout(ota.A00);
        C51968G9o.A1D(frameLayout, -1);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            int A0F = AnonymousClass7TG.A0F(it);
            A00(frameLayout, ota.A02.A01(A0F), A0F);
        }
        ((C2366634p) AnonymousClass7TE.A14(r4)).A05();
        0fh.A00(-114527820);
    }
}
