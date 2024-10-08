package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.MYw  reason: case insensitive filesystem */
public final class C66610MYw extends C232222tE {
    public final int A00;
    public final C229122ms A01;
    public final C230682q1 A02;
    public final C74434Puo A03;

    public C66610MYw(C229122ms r2, int i) {
        this(r2, (C230682q1) null, (C74434Puo) null, i);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C14036Toc toc = (C14036Toc) r4;
        C67321Mlv mlv = (C67321Mlv) r5;
        mlv.A00.A03(this.A01, this.A02);
        C74434Puo puo = this.A03;
        if (puo != null) {
            puo.Cy3(mlv, toc);
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C67321Mlv(LoadMoreButton.A00(viewGroup.getContext(), this.A00, viewGroup));
    }

    public final Class modelClass() {
        return C14036Toc.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        C74434Puo puo = this.A03;
        if (puo != null) {
            puo.DuR(r2);
        }
    }

    public C66610MYw(C229122ms r1, C230682q1 r2, C74434Puo puo, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A03 = puo;
        this.A02 = r2;
    }
}
