package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Exu  reason: case insensitive filesystem */
public final class C49559Exu {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    public C49559Exu(View view) {
        IgImageView A0b = DbT.A0b(view, R.id.autocomplete_user_row_imageview);
        this.A02 = A0b;
        ViewGroup.MarginLayoutParams A0D = DbS.A0D(A0b);
        A0D.setMargins(0, 0, 0, 0);
        A0b.setLayoutParams(A0D);
        A0b.setVisibility(0);
        TextView A0G = DbU.A0G(view, R.id.autocomplete_user_row_username);
        this.A01 = A0G;
        A0G.getPaint().setFakeBoldText(true);
        this.A00 = DbU.A0G(view, R.id.autocomplete_user_row_fullname);
    }
}
