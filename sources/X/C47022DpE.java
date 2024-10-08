package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.DpE  reason: case insensitive filesystem */
public final class C47022DpE extends C249703kE {
    public final View A00;
    public final ViewGroup A01;
    public final WUF A02;
    public final IgdsButton A03;
    public final IgdsButton A04;
    public final IgdsButton A05;
    public final F18 A06;

    public C47022DpE(View view, WUF wuf) {
        super(view);
        this.A02 = wuf;
        ViewGroup A0C = DbU.A0C(view, R.id.profile_row_container);
        this.A01 = A0C;
        ViewGroup A012 = FFY.A01(view.getContext(), A0C);
        A012.setMinimumHeight(0);
        this.A00 = A012.requireViewById(R.id.row_user_container_base);
        A012.requireViewById(R.id.row_user_imageview).setMinimumWidth(0);
        A012.getChildAt(0).setMinimumHeight(0);
        A0C.addView(A012);
        0nA.A0k(A012.requireViewById(R.id.row_user_container_base), 0, 0, 0, 0);
        this.A06 = (F18) DbT.A0o(A012);
        this.A04 = DbU.A0b(view, R.id.delivery_button);
        this.A03 = DbU.A0b(view, R.id.contact_button);
        this.A05 = DbU.A0b(view, R.id.see_menu_button);
    }
}
