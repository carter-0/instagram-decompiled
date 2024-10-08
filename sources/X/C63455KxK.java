package X;

import android.content.Context;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.KxK  reason: case insensitive filesystem */
public abstract class C63455KxK {
    public static final void A00(C13997Tnz tnz, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView, C300835xz r7) {
        boolean isSelected = igBouncyUfiButtonImageView.isSelected();
        if (tnz.A00) {
            igBouncyUfiButtonImageView.setVisibility(0);
            boolean z = tnz.A01;
            igBouncyUfiButtonImageView.setSelected(z);
            Context context = igBouncyUfiButtonImageView.getContext();
            int i = 2131964931;
            if (z) {
                i = 2131964944;
            }
            DbU.A12(context, igBouncyUfiButtonImageView, i);
            if (isSelected != z && tnz.A02 && r7 != null) {
                r7.A02(isSelected, false, false);
                return;
            }
            return;
        }
        igBouncyUfiButtonImageView.setVisibility(8);
    }
}
