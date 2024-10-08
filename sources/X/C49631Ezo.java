package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Ezo  reason: case insensitive filesystem */
public final class C49631Ezo {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final CircularImageView A04;

    public C49631Ezo(ViewGroup viewGroup) {
        this.A00 = viewGroup;
        this.A04 = DbU.A0X(viewGroup, R.id.avatar_image_view);
        this.A03 = Dba.A06(viewGroup);
        View requireViewById = viewGroup.requireViewById(R.id.login_button);
        this.A01 = requireViewById;
        2eS.A01(requireViewById);
        this.A02 = viewGroup.requireViewById(R.id.option_button);
    }
}
