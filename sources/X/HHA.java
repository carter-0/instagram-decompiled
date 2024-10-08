package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;

public final class HHA extends C54306H6y {
    public final C355608Qq A00;
    public final XBt A01;
    public final H08 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HHA(C355608Qq r2, XBt xBt, C320576sb r4, H08 h08) {
        super(r4);
        0qQ.A0B(xBt, 3);
        this.A00 = r2;
        this.A02 = h08;
        this.A01 = xBt;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        HH7 hh7 = (HH7) r6;
        HAO hao = (HAO) r7;
        boolean A1Z = AnonymousClass7TG.A1Z(hh7, hao);
        ? obj = new Object();
        IOC ioc = new IOC(3, hao, obj);
        Medium medium = hh7.A00.A00.A00;
        if (medium != null) {
            obj.A00 = A1Z;
            this.A00.A04(medium, ioc);
        }
        ID2.A02(hao.A00, 61, hh7, this);
        C63260Ku5.A00(hao, hh7, this.A01, this.A02, this.A00);
    }

    public final Class modelClass() {
        return HH7.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new HAN(C51973G9u.A0B(layoutInflater, viewGroup, R.layout.wall_selectable_grid_item));
    }
}
