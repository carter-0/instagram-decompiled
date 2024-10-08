package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Nts  reason: case insensitive filesystem */
public abstract class C69890Nts {
    public static final void A00(View view, C69664Npm npm, C74444Puz puz) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        0qQ.A0B(view, 0);
        int[] iArr = O4E.A00;
        int i = 0;
        do {
            0nA.A0O(view.findViewById(iArr[i]));
            i++;
        } while (i < 4);
        ViewGroup A0I = DbX.A0I(view, R.id.megaphone_content);
        TextView A0F = C66582MXn.A0F(view);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.message);
        ViewGroup A0I2 = DbX.A0I(view, R.id.button_placeholder);
        ImageView A0J = DbX.A0J(view, R.id.dismiss_button);
        ImageView A0J2 = DbX.A0J(view, R.id.megaphone_icon);
        View A0G = AnonymousClass7TF.A0G(view, R.id.megaphone_inner);
        DbZ.A14(A0F, puz.BTX().A01);
        DbZ.A14(A0R, puz.BTX().A04);
        A0J2.setImageResource(puz.BTX().A03);
        ViewGroup.LayoutParams layoutParams = A0J2.getLayoutParams();
        Resources resources = view.getResources();
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
        DbT.A1B(resources, layoutParams, R.dimen.action_button_settings_height);
        A0J2.setLayoutParams(layoutParams);
        ColorStateList valueOf = ColorStateList.valueOf(C66581MXm.A02(view.getContext()));
        0qQ.A07(valueOf);
        A0J.setImageTintList(valueOf);
        A0J.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = A0G.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin));
        }
        C71405Ok4.A01(A0J, 19, npm, puz);
        C17006VEg.A00(A0I, A0I2, (ViewGroup) null, (C16584Uxe) null, C16584Uxe.ONE_BUTTON_PRIMARY_CONDENSED);
        TextView A0R2 = AnonymousClass7TG.A0R(A0I, R.id.primary_button);
        DbZ.A14(A0R2, puz.BTX().A00);
        C71405Ok4.A01(A0R2, 20, npm, puz);
        A0I2.setVisibility(0);
    }
}
