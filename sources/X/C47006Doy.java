package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Doy  reason: case insensitive filesystem */
public final class C47006Doy extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final E2Y A04;

    public C47006Doy(View view, E2Y e2y) {
        super(view);
        this.A00 = view;
        this.A04 = e2y;
        this.A01 = DbS.A0G(view, R.id.title_icon);
        this.A03 = view.findViewById(R.id.title);
        this.A02 = view.findViewById(R.id.description);
    }
}
