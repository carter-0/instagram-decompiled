package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;

public final class H7Y extends IgFrameLayout {
    public final JSM A00;
    public final GW3 A01;
    public final boolean A02;

    public static final void A00(Context context, GW3 gw3, H7Y h7y) {
        ViewGroup viewGroup;
        TextView textView;
        C306386Ly r5;
        Drawable drawable;
        View childAt = gw3.getChildAt(0);
        if ((childAt instanceof IgFrameLayout) && (viewGroup = (ViewGroup) childAt) != null) {
            View childAt2 = viewGroup.getChildAt(0);
            if ((childAt2 instanceof IgTextView) && (textView = (TextView) childAt2) != null) {
                boolean z = h7y.A02;
                JSM jsm = h7y.A00;
                if (z) {
                    String emoji = jsm.getEmoji();
                    if (emoji != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autocomplete_dropdown_header_text_size);
                        C306386Ly r52 = new C306386Ly(context, DbS.A02(context, 12));
                        r52.A0M(emoji);
                        r52.A0A((float) dimensionPixelSize);
                        r5 = r52;
                    }
                    r5 = null;
                } else {
                    String BEB = jsm.BEB();
                    if (BEB != null) {
                        r5 = C14091Tpi.A01(context, GOg.SIZE_12, C52337GOf.OUTLINE, BEB);
                    }
                    r5 = null;
                }
                String BEA = jsm.BEA();
                if (BEA != null) {
                    drawable = C14091Tpi.A01(context, GOg.SIZE_12, C52337GOf.FILLED, BEA);
                } else {
                    drawable = null;
                }
                if (r5 != null && drawable != null) {
                    C306386Ly r53 = r5;
                    if (gw3.isSelected()) {
                        r53 = drawable;
                    }
                    ColorStateList A022 = 02K.A02(context, R.color.igds_pill_label_color);
                    if (A022 != null) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        if (gw3.isSelected()) {
                            AnonymousClass7TF.A1M(A1C, 16842913);
                        }
                        if (gw3.isPressed()) {
                            AnonymousClass7TF.A1M(A1C, 16842919);
                        }
                        C51969G9p.A12(PorterDuff.Mode.SRC_IN, r53, A022.getColorForState(00k.A0x(A1C), A022.getDefaultColor()));
                        textView.setCompoundDrawablesWithIntrinsicBounds(r53, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
                    }
                }
            }
        }
    }

    public final JSM getInterest() {
        return this.A00;
    }

    public final boolean isSelected() {
        return this.A01.isSelected();
    }

    public H7Y(Context context, JSM jsm, boolean z, boolean z2) {
        super(context);
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup;
        TextView textView;
        this.A00 = jsm;
        this.A02 = z2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C61670oa.A07() ? R.style.afi_interest_pill_prism : R.style.afi_interest_pill);
        String displayName = jsm.getDisplayName();
        if (displayName != null) {
            GW3 gw3 = new GW3(contextThemeWrapper);
            gw3.setLabel(displayName);
            gw3.setSelected(z);
            View childAt = gw3.getChildAt(0);
            if (childAt != null) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                0nA.A0j(childAt, 0, 0, 0, AnonymousClass7TF.A02(contextThemeWrapper, R.dimen.abc_action_bar_elevation_material));
                0nA.A0U(childAt, dimensionPixelSize);
            }
            View childAt2 = gw3.getChildAt(0);
            if ((childAt2 instanceof IgFrameLayout) && (viewGroup = (ViewGroup) childAt2) != null) {
                View childAt3 = viewGroup.getChildAt(0);
                if ((childAt3 instanceof IgTextView) && (textView = (TextView) childAt3) != null) {
                    textView.setTextAppearance(R.style.afi_interest_pill_text);
                    textView.setGravity(16);
                }
            }
            if (!C61670oa.A07()) {
                View childAt4 = gw3.getChildAt(0);
                Drawable background = childAt4 != null ? childAt4.getBackground() : null;
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    ColorStateList A022 = 02K.A02(contextThemeWrapper, R.color.igds_pill_border_color);
                    int dimensionPixelSize2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
                    gradientDrawable.mutate();
                    gradientDrawable.setStroke(dimensionPixelSize2, A022);
                }
            }
            A00(contextThemeWrapper, gw3, this);
            this.A01 = gw3;
            addView(gw3);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
