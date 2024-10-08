package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class OZD {
    public final ViewGroup A00;

    public static final void A00(View.OnClickListener onClickListener, OZD ozd, String str, int i, int i2) {
        ViewGroup viewGroup = ozd.A00;
        IgdsButton A0n = JTR.A0n(viewGroup, i);
        A0n.setText(str);
        AnonymousClass0fU.A00(onClickListener, A0n);
        A0n.setVisibility(0);
        DbU.A0b(viewGroup, i).setTextColor(i2);
    }

    public static final void A01(OZD ozd, int i) {
        IgdsButton A0n = JTR.A0n(ozd.A00, i);
        A0n.setText("");
        A0n.setOnClickListener((View.OnClickListener) null);
        A0n.setVisibility(8);
    }

    public OZD(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void A02(String str, View.OnClickListener onClickListener) {
        IgdsButton A0n = JTR.A0n(this.A00, R.id.permissions_choice_button_right);
        A0n.setText(str);
        AnonymousClass0fU.A00(onClickListener, A0n);
        A0n.setVisibility(0);
    }
}
