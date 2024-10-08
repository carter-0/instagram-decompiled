package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.HBw  reason: case insensitive filesystem */
public final class C54405HBw extends C54305H6x {
    public final C14327Tu5 A00;
    public final H1Q A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        HC0 hc0 = (HC0) r8;
        HAO hao = (HAO) r9;
        AnonymousClass7TF.A1H(hc0, hao);
        this.A00.A00(new IRN(hc0, this), hc0, hc0.A00.A00, hao.A00, false);
        C63260Ku5.A00(hao, hc0, this.A01, this.A02, this.A00);
    }

    public final Class modelClass() {
        return HC0.class;
    }

    public C54405HBw(C14327Tu5 tu5, H1Q h1q, C320576sb r3) {
        super(r3);
        this.A00 = tu5;
        this.A01 = h1q;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new HAO(C51973G9u.A0B(layoutInflater, viewGroup, R.layout.selectable_grid_item));
    }
}
