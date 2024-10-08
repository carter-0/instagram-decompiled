package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class F0E {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgdsButton A03;
    public final IgdsButton A04;
    public final IgdsButton A05;

    public F0E(View view) {
        View requireViewById = view.requireViewById(R.id.cta_1);
        this.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.cta_2);
        this.A01 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.cta_3);
        this.A02 = requireViewById3;
        this.A03 = DbU.A0b(requireViewById, R.id.cta_button);
        this.A04 = DbU.A0b(requireViewById2, R.id.cta_button);
        this.A05 = DbU.A0b(requireViewById3, R.id.cta_button);
    }
}
