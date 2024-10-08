package X;

import android.database.DataSetObserver;
import android.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.fragment.SuggestBusinessFragment;

/* renamed from: X.F2o  reason: case insensitive filesystem */
public final class C49703F2o {
    public int A00 = 0;
    public int A01 = 0;
    public DataSetObserver A02;
    public final RecyclerView A03;
    public final C15474UdP A04;
    public final SuggestBusinessFragment A05;
    public final C249403jg A06;
    public final 0mM A07;

    public C49703F2o(RecyclerView recyclerView, C15474UdP udP, SuggestBusinessFragment suggestBusinessFragment) {
        0qQ.A0B(recyclerView, 1);
        this.A03 = recyclerView;
        this.A04 = udP;
        this.A05 = suggestBusinessFragment;
        C46665Diu diu = new C46665Diu(this, 0);
        this.A02 = diu;
        C46864Dmg dmg = new C46864Dmg(this, 0);
        this.A06 = dmg;
        udP.registerDataSetObserver(diu);
        this.A07 = new 0mM(AnonymousClass7TF.A0D(), new C46347Dcq(this, 2), 300);
        recyclerView.A15(dmg);
    }

    public final void A00(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        C252553pI r3 = recyclerView.A0D;
        if ((r3 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r3) != null) {
            this.A07.A01(new Pair(Integer.valueOf(Math.max(linearLayoutManager.A1a(), 1)), Integer.valueOf(Math.min(linearLayoutManager.A1b(), (i - 1) - 1))));
        }
    }
}
