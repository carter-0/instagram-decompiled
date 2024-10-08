package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Dop  reason: case insensitive filesystem */
public final class C46997Dop extends C249703kE {
    public final ImageView A00;
    public final IgTextView A01;
    public final C252063oV A02;
    public final IgTextView A03;

    public C46997Dop(View view) {
        super(view);
        this.A00 = DbX.A0J(view, R.id.image);
        this.A01 = DbX.A0Z(view, R.id.label);
        this.A03 = DbX.A0Z(view, R.id.secondary_label);
        this.A02 = DbU.A0Z(view, R.id.universal_creation_menu_row_badge_stub);
    }
}
