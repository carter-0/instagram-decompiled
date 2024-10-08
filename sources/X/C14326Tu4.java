package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Tu4  reason: case insensitive filesystem */
public final class C14326Tu4 extends C232222tE {
    public final XBv A00;
    public final C14327Tu5 A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C296985qy r2 = (C296985qy) r7;
        C52532GWj gWj = (C52532GWj) r8;
        0qQ.A0B(r2, 0);
        0qQ.A0B(gWj, 1);
        this.A01.A00(this.A00, r2, r2.A01, gWj.A00, false);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C52532GWj(2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, viewGroup, R.layout.layout_grid_item_image, false, true));
    }

    public final Class modelClass() {
        return C296985qy.class;
    }

    public C14326Tu4(XBv xBv, C14327Tu5 tu5) {
        this.A01 = tu5;
        this.A00 = xBv;
    }
}
