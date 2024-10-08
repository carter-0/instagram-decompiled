package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.KFm  reason: case insensitive filesystem */
public final class C61636KFm extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C63681L2r A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C64744LhL lhL = (C64744LhL) r2;
        C60601JoA joA = (C60601JoA) r3;
        AnonymousClass7TG.A1N(lhL, joA);
        joA.A01.A00(lhL);
    }

    public final Class modelClass() {
        return C64744LhL.class;
    }

    public C61636KFm(AnonymousClass0iw r2, C63681L2r l2r) {
        this.A00 = r2;
        this.A01 = l2r;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        AnonymousClass0iw r5 = this.A00;
        C63681L2r l2r = this.A01;
        AnonymousClass7TG.A1Q(r5, l2r);
        View inflate = layoutInflater.inflate(R.layout.layout_snap_horizontal_recycler_view, viewGroup, false);
        C63682L2s l2s = new C63682L2s(l2r);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C60601JoA joA = new C60601JoA(inflate, r5, l2s);
        C60473Jm5.A00(joA.A00, l2r, 18);
        inflate.setTag(joA);
        Object tag = inflate.getTag();
        if (!(tag instanceof C60601JoA)) {
            return null;
        }
        C60601JoA joA2 = (C60601JoA) tag;
        if (joA2 != null) {
            this.A02.add(joA2.A01);
        }
        return joA2;
    }
}
