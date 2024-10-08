package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jek  reason: case insensitive filesystem */
public final class C60062Jek extends LinearLayout {
    public int A00;

    public final void A00() {
        if (2eO.A00(getContext())) {
            int i = 0;
            int childCount = getChildCount();
            while (i < childCount) {
                int i2 = this.A00;
                View childAt = getChildAt(i);
                0qQ.A07(childAt);
                int i3 = i + 1;
                AnonymousClass2gY.A00(childAt, i3, getChildCount(), AnonymousClass7TF.A1S(i, i2));
                i = i3;
            }
        }
    }

    public final void setSelectedIndex(int i) {
        boolean z;
        IgImageView igImageView;
        Context context;
        int i2;
        if (i >= getChildCount()) {
            return;
        }
        if (i != this.A00 || !getChildAt(i).isSelected()) {
            this.A00 = i;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                int i4 = this.A00;
                View childAt = getChildAt(i3);
                0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollTabView");
                KHK khk = (KHK) childAt;
                Context context2 = khk.getContext();
                if (i3 == i4) {
                    if (context2 != null) {
                        z = true;
                    }
                } else if (context2 != null) {
                    z = false;
                }
                khk.setSelected(z);
                if (khk.isSelected()) {
                    context = khk.getContext();
                    DbU.A11(context, khk, R.drawable.expression_tray_tab_rounded_rect);
                    if (khk.A01 instanceof C61901KQu) {
                        igImageView = khk.A02;
                        i2 = R.attr.igds_color_primary_icon;
                    }
                } else {
                    khk.setBackground((Drawable) null);
                    if (khk.A01 instanceof C61901KQu) {
                        igImageView = khk.A02;
                        context = khk.getContext();
                        i2 = R.attr.igds_color_secondary_icon;
                    }
                }
                DbX.A12(context, igImageView, 2Yu.A0H(context, i2));
            }
        }
    }
}
