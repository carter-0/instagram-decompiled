package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Uhi  reason: case insensitive filesystem */
public final class C15737Uhi extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A0D = DbT.A0D(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.card_search_placeholder, false);
        A0D.setTag(new VTN(A0D));
        return new UC4(A0D);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C71980OuC ouC = (C71980OuC) r5;
        UC4 uc4 = (UC4) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(ouC, uc4);
        VTN vtn = uc4.A00;
        0qQ.A0B(vtn, A1Z ? 1 : 0);
        RoundedCornerFrameLayout roundedCornerFrameLayout = vtn.A00;
        roundedCornerFrameLayout.getLayoutParams().width = (int) (((float) roundedCornerFrameLayout.getLayoutParams().height) * ouC.A00);
        vtn.A01.A02();
    }

    public final Class modelClass() {
        return C71980OuC.class;
    }
}
