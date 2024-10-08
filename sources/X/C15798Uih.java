package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Uih  reason: case insensitive filesystem */
public final class C15798Uih extends C232222tE {
    public final C229382nI A00;

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        0qQ.A0B(r4, 0);
        Object tag = r4.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.interop.sharedshoppinghistory.ShoppingDataSignifierRowViewBinder.Holder");
        VYT vyt = (VYT) tag;
        0qQ.A0B(vyt, 0);
        AnonymousClass6NS r0 = vyt.A00;
        if (r0 != null) {
            r0.A04();
            vyt.A00 = null;
            vyt.A01 = null;
        }
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        UO0 uo0 = (UO0) r4;
        AnonymousClass7TG.A1N(uo0, r5);
        Object tag = r5.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.interop.sharedshoppinghistory.ShoppingDataSignifierRowViewBinder.Holder");
        C3034368u r1 = uo0.A00;
        C18249VoG.A01(this.A00, r1, (VYT) tag);
    }

    public final Class modelClass() {
        return UO0.class;
    }

    public C15798Uih(C229382nI r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C249703kE(C18249VoG.A00(AnonymousClass7TE.A0S(viewGroup), viewGroup));
    }
}
