package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Myn  reason: case insensitive filesystem */
public final class C68021Myn extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;

    public C68021Myn(View view) {
        super(view);
        View A0G = AnonymousClass7TF.A0G(view, R.id.popular_pill);
        this.A02 = A0G;
        this.A05 = DbX.A0Z(A0G, R.id.pill_text);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.for_you_pill);
        this.A00 = A0G2;
        this.A03 = DbX.A0Z(A0G2, R.id.pill_text);
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.most_active_pill);
        this.A01 = A0G3;
        this.A04 = DbX.A0Z(A0G3, R.id.pill_text);
    }
}
