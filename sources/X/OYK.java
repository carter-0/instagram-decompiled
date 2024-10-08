package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class OYK {
    public static final OYK A00 = new Object();

    public static final void A00(Drawable drawable, View.OnClickListener onClickListener, OD6 od6, Integer num, Integer num2, Integer num3, String str) {
        View view = od6.A00;
        if (view != null) {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.self_remediation_action_title);
            View A0G = AnonymousClass7TF.A0G(view, R.id.self_remediation_action_subtitle);
            view.setVisibility(0);
            AnonymousClass0fU.A00(onClickListener, view);
            A0R.setText(str);
            if (num != null) {
                A0R.setTextColor(num.intValue());
            }
            A0G.setVisibility(8);
        }
        IgdsListCell igdsListCell = od6.A01;
        if (igdsListCell != null) {
            igdsListCell.setVisibility(0);
            igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
            igdsListCell.A0I(str);
            if (num2 != null) {
                igdsListCell.setTitleTextColorContrib(num2.intValue());
            }
            if (drawable != null) {
                igdsListCell.A09(drawable);
                if (num3 != null) {
                    igdsListCell.setIconColorContrib(num3.intValue());
                }
            }
            AnonymousClass0fU.A00(onClickListener, igdsListCell);
        }
    }
}
