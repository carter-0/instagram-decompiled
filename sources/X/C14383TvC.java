package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.TvC  reason: case insensitive filesystem */
public final class C14383TvC extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(layoutInflater, 1);
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        C66581MXm.A1A(frameLayout, -1);
        return new C14839UBt(frameLayout);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C14839UBt uBt = (C14839UBt) r4;
        0qQ.A0B(uBt, 1);
        ViewGroup viewGroup = uBt.A00;
        0qQ.A0C(viewGroup, C273654mx.A00(2));
        LayoutInflater.from(viewGroup.getContext());
        throw new NullPointerException("getLayoutResId");
    }

    public final Class modelClass() {
        return C19281WSp.class;
    }
}
