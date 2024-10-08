package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

public abstract class W0n {
    public static final void A02(IgFormField igFormField, X4F x4f) {
        0qQ.A0B(igFormField, 0);
        if (igFormField.A0J) {
            WBG.A01(igFormField.getStateView(), 40, igFormField, x4f);
        } else {
            igFormField.setEditTextOnTouchListener(new C18899WBr(7, x4f, igFormField));
        }
    }

    public static final void A00(IgFormField igFormField) {
        C71492dQ r1;
        if (igFormField.A0J) {
            ViewGroup.LayoutParams layoutParams = igFormField.getMEditText().getLayoutParams();
            layoutParams.height = igFormField.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
            igFormField.getMEditText().setLayoutParams(layoutParams);
            igFormField.getMEditText().setInputType(igFormField.getMEditText().getInputType() | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            igFormField.getMEditText().setGravity(48);
            igFormField.getMEditText().setPadding(igFormField.getMEditText().getPaddingLeft(), igFormField.A01, igFormField.getMEditText().getPaddingRight(), igFormField.getMEditText().getPaddingBottom());
            ViewGroup.LayoutParams layoutParams2 = igFormField.getInlineLabel().getLayoutParams();
            if ((layoutParams2 instanceof C71492dQ) && (r1 = (C71492dQ) layoutParams2) != null) {
                r1.A09 = 0.15f;
            }
        }
    }

    public static final void A01(IgFormField igFormField) {
        boolean z = igFormField.A0J;
        TextView topLabel = igFormField.getTopLabel();
        if (z) {
            topLabel.setTextColor(02K.A02(igFormField.getContext(), R.color.prism_form_field_top_label_color));
        } else {
            DbY.A11(topLabel, igFormField.getContext());
        }
    }

    public static final void A03(IgFormField igFormField, boolean z, boolean z2) {
        Integer num;
        int i;
        Drawable drawable = null;
        if (igFormField.A0J) {
            if (z) {
                i = R.drawable.prism_form_field_error_background;
                if (z2) {
                    i = R.drawable.prism_form_field_picker_error_background;
                }
            } else {
                i = R.drawable.prism_form_field_background;
                if (z2) {
                    i = R.drawable.prism_form_field_picker_background;
                }
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        View prismFormFieldContainer = igFormField.getPrismFormFieldContainer();
        if (num != null) {
            drawable = JTP.A0E(igFormField.getContext(), num);
        }
        prismFormFieldContainer.setBackground(drawable);
    }
}
