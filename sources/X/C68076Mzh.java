package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mzh  reason: case insensitive filesystem */
public final class C68076Mzh extends C249703kE implements C328007Db, C328017Dc, C328027Dd, AnonymousClass76N {
    public C70440O6r A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final IgImageView A04;
    public final AnonymousClass76M A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68076Mzh(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, IgImageView igImageView, AnonymousClass76M r6) {
        super(viewGroup);
        C51973G9u.A0r(3, viewGroup2, viewGroup3, igImageView);
        this.A05 = r6;
        this.A03 = viewGroup;
        this.A01 = viewGroup2;
        this.A02 = viewGroup3;
        this.A04 = igImageView;
    }

    public final void EdM(AnonymousClass7DU r2) {
        0qQ.A0B(r2, 0);
        this.A05.A00 = r2;
    }

    public final View BJd() {
        return this.A03;
    }

    public final C328087Dj BY0() {
        return this.A05.A01;
    }

    public final void EeT(C328087Dj r2) {
        this.A05.A01 = r2;
    }

    public final void FHQ(int i) {
        this.A05.FHQ(i);
    }
}
