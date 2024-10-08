package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.JWu  reason: case insensitive filesystem */
public final class C59757JWu extends C232232tF {
    public final C66093MBb A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60684JpV(DbU.A0A(DbX.A0E(viewGroup), viewGroup, R.layout.gallery_header, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C64757LhZ lhZ = (C64757LhZ) r3;
        C60684JpV jpV = (C60684JpV) r4;
        AnonymousClass7TG.A1N(lhZ, jpV);
        jpV.A00(lhZ.A00, this.A00);
    }

    public final Class modelClass() {
        return C64757LhZ.class;
    }

    public C59757JWu(C66093MBb mBb) {
        this.A00 = mBb;
    }
}
