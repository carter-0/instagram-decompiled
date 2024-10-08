package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class HH9 extends C54306H6y {
    public final C14327Tu5 A00;
    public final H08 A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        HH8 hh8 = (HH8) r8;
        HAO hao = (HAO) r9;
        AnonymousClass7TF.A1H(hh8, hao);
        this.A00.A00(new IRO(hh8, this), hh8, hh8.A00.A00, hao.A00, false);
        C63260Ku5.A00(hao, hh8, this.A01, this.A02, this.A00);
    }

    public final Class modelClass() {
        return HH8.class;
    }

    public HH9(C14327Tu5 tu5, C320576sb r2, H08 h08) {
        super(r2);
        this.A00 = tu5;
        this.A01 = h08;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new HAO(C51973G9u.A0B(layoutInflater, viewGroup, R.layout.selectable_grid_item));
    }
}
