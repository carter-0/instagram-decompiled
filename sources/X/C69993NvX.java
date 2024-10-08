package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;

/* renamed from: X.NvX  reason: case insensitive filesystem */
public abstract class C69993NvX {
    public static final void A00(ViewGroup viewGroup, C71662eb r11, C74398PuE puE, C66754Mbz mbz, boolean z) {
        int A1X = DbW.A1X(r11);
        0qQ.A0B(mbz, 3);
        r11.A03(A1X);
        View A01 = r11.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type android.widget.CheckBox");
        CompoundButton compoundButton = (CompoundButton) A01;
        AnonymousClass0fU.A00(new C71355OjA(3, compoundButton, puE, mbz, z), viewGroup);
        Context context = viewGroup.getContext();
        Drawable drawable = context.getDrawable(R.drawable.checkbox);
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        if (drawable2 != null) {
            Drawable mutate = drawable2.mutate();
            0qQ.A07(mutate);
            DbX.A11(context, mutate, R.color.badge_color);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842912}, mutate);
            stateListDrawable.addState(new int[A1X], drawable);
            compoundButton.setBackground(stateListDrawable);
            compoundButton.setChecked(puE.CbV(mbz.A04));
            compoundButton.setVisibility(A1X);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
