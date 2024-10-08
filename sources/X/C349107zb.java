package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7zb  reason: invalid class name and case insensitive filesystem */
public final class C349107zb extends C232232tF {
    public final C349097za A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.text_tool_attribute_picker_item, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new C380419Yc(inflate));
        Object tag = inflate.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.text.attribute.TextToolAttributeItemViewBinder.Companion.Holder");
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        int dimensionPixelOffset;
        C349117zc r112 = (C349117zc) r11;
        C380419Yc r122 = (C380419Yc) r12;
        0qQ.A0B(r112, 0);
        0qQ.A0B(r122, 1);
        C349097za r2 = this.A00;
        0qQ.A0B(r2, 2);
        IgTextView igTextView = r122.A01;
        Context context = igTextView.getContext();
        float f = context.getResources().getDisplayMetrics().density;
        Drawable drawable = r112.A01;
        int i = -16777216;
        IgSimpleImageView igSimpleImageView = r122.A00;
        if (drawable != null) {
            igSimpleImageView.setImageDrawable(drawable);
            int i2 = -1;
            if (r112.A07) {
                i2 = -16777216;
            }
            igSimpleImageView.setColorFilter(i2);
            ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (r112.A06.length() == 0) {
                dimensionPixelOffset = 0;
            } else {
                dimensionPixelOffset = igSimpleImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
            }
            marginLayoutParams.setMarginEnd(dimensionPixelOffset);
            igSimpleImageView.setLayoutParams(marginLayoutParams);
        } else {
            igSimpleImageView.setVisibility(8);
        }
        String str = r112.A06;
        igTextView.setText(str);
        Typeface typeface = r112.A00;
        if (typeface == null) {
            0qQ.A07(context);
            typeface = AnonymousClass0qo.A00(context).A02(0qm.A0Y);
        }
        igTextView.setTypeface(typeface);
        Float f2 = r112.A03;
        if (f2 != null) {
            igTextView.setTextSize(1, f2.floatValue());
        }
        Float f3 = r112.A02;
        if (f3 != null) {
            igTextView.setTranslationX(f3.floatValue() * f);
        }
        Float f4 = r112.A04;
        if (f4 != null) {
            igTextView.setTranslationY(f * f4.floatValue());
        }
        boolean z = r112.A07;
        if (!z) {
            i = -1;
        }
        igTextView.setTextColor(i);
        View view = r122.itemView;
        view.setContentDescription(r112.A05);
        int i3 = R.drawable.text_tool_attribute_picker_item_background_unselected;
        if (z) {
            i3 = R.drawable.text_tool_attribute_picker_item_background_selected;
        }
        view.setBackgroundResource(i3);
        AnonymousClass0fU.A00(new ANU(r122, r2), view);
        Context context2 = view.getContext();
        int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        Resources resources = context2.getResources();
        int length = str.length();
        int i4 = R.dimen.action_bar_item_spacing_right;
        if (length == 0) {
            i4 = R.dimen.abc_edit_text_inset_top_material;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        view.setPadding(dimensionPixelOffset3, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset2);
        2eS.A04(r122.itemView, AnonymousClass05K.A01);
    }

    public final Class modelClass() {
        return C349117zc.class;
    }

    public C349107zb(C349097za r1) {
        this.A00 = r1;
    }
}
