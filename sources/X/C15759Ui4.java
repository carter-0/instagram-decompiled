package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Ui4  reason: case insensitive filesystem */
public final class C15759Ui4 extends C232222tE {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A00;
        Object tag = C18248VoF.A00(context, viewGroup, 0nA.A08(context) / (0nA.A09(context) / 2)).getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductFeedShimmerViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
        HES hes = (HES) r1;
        UBY uby = (UBY) r2;
        AnonymousClass7TG.A1N(hes, uby);
        C18248VoF.A01(uby, hes);
    }

    public final Class modelClass() {
        return HES.class;
    }

    public C15759Ui4(Context context) {
        this.A00 = context;
    }
}
