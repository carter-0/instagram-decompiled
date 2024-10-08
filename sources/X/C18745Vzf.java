package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Vzf  reason: case insensitive filesystem */
public final class C18745Vzf {
    public static final C18745Vzf A00 = new Object();

    public static final void A00(Context context, AnimatedHintsTextLayout animatedHintsTextLayout) {
        0qQ.A0B(context, 0);
        int A08 = C51972G9s.A08(context);
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(animatedHintsTextLayout);
        A0G.leftMargin = A08;
        A0G.rightMargin = A08;
        animatedHintsTextLayout.setLayoutParams(A0G);
        TextView A0R = AnonymousClass7TG.A0R(animatedHintsTextLayout, R.id.action_bar_search_edit_text);
        ColorFilter A06 = DbV.A06(context, 2Yu.A0B(context));
        Drawable drawable = A0R.getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            drawable.mutate();
            drawable.setAlpha(51);
            drawable.setColorFilter(A06);
        }
    }

    public final void A01(AnimatedHintsTextLayout animatedHintsTextLayout, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Context context = animatedHintsTextLayout.getContext();
        0qQ.A0A(context);
        A00(context, animatedHintsTextLayout);
        EditText editText = animatedHintsTextLayout.getEditText();
        0qQ.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        SearchEditText searchEditText = (SearchEditText) editText;
        boolean z7 = z2;
        if (z3) {
            searchEditText.A07(i, i2, z7, j);
        } else {
            searchEditText.A08(z7);
        }
        searchEditText.A09(z5);
        if (z4) {
            searchEditText.setMultiLineSearchBarEnabled(true);
            ViewGroup.LayoutParams layoutParams = animatedHintsTextLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                animatedHintsTextLayout.setLayoutParams(layoutParams);
                int dimensionPixelSize = searchEditText.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
                0nA.A0i(searchEditText, dimensionPixelSize, dimensionPixelSize);
            } else {
                throw new NullPointerException(AnonymousClass000.A00(1));
            }
        }
        if (z) {
            if (!z4) {
                0nA.A0V(animatedHintsTextLayout, 2Yu.A0G(context, R.attr.inlineMetaAISearchBarHeight));
            }
            DbU.A11(context, animatedHintsTextLayout, R.drawable.elevated_rounded_meta_ai_searchbar_background);
            if (z6) {
                searchEditText.setHintTextColor(context.getColor(R.color.ig_search_meta_ai_searchbar_hint_color));
            }
            ViewGroup.LayoutParams layoutParams2 = searchEditText.getLayoutParams();
            if (layoutParams2 != null) {
                searchEditText.getLayoutParams().height = -1;
                searchEditText.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException(AnonymousClass000.A00(49));
        }
    }
}
