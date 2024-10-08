package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;

/* renamed from: X.HBx  reason: case insensitive filesystem */
public final class C54406HBx extends C54305H6x {
    public final C355608Qq A00;
    public final XBt A01;
    public final H1Q A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54406HBx(C355608Qq r2, XBt xBt, H1Q h1q, C320576sb r5) {
        super(r5);
        0qQ.A0B(xBt, 3);
        this.A00 = r2;
        this.A02 = h1q;
        this.A01 = xBt;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C54408HBz hBz = (C54408HBz) r6;
        HAO hao = (HAO) r7;
        boolean A1U = AnonymousClass7TF.A1U(0, hBz, hao);
        ? obj = new Object();
        IOC ioc = new IOC(0, hao, obj);
        Medium medium = hBz.A00.A00.A00;
        if (medium != null) {
            obj.A00 = A1U;
            this.A00.A04(medium, ioc);
        }
        ID2.A02(hao.A00, 39, hBz, this);
        C63260Ku5.A00(hao, hBz, this.A01, this.A02, this.A00);
    }

    public final Class modelClass() {
        return C54408HBz.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new HAM(C51973G9u.A0B(layoutInflater, viewGroup, R.layout.media_kit_selectable_grid_item));
    }
}
