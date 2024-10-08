package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.KEu  reason: case insensitive filesystem */
public final class C61618KEu extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64779Lhv lhv = (C64779Lhv) r5;
        C60547JnI jnI = (C60547JnI) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(lhv, jnI);
        U56 u56 = jnI.A00;
        u56.A00();
        CharSequence text = u56.getResources().getText(lhv.A00);
        0qQ.A07(text);
        u56.A02(text, A1Z);
    }

    public final Class modelClass() {
        return C64779Lhv.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60547JnI(new U56(JTU.A06(viewGroup)));
    }
}
