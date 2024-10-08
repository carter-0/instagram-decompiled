package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H7C extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        0qQ.A0B((Object) null, 0);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Class modelClass() {
        return C53502GpY.class;
    }

    public H7C(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.layout_iglive_fundraiser_row, false);
        A09.setTag(new C53124Giw(A09));
        Object tag = A09.getTag();
        if (tag instanceof C53124Giw) {
            return (C249703kE) tag;
        }
        return null;
    }
}
