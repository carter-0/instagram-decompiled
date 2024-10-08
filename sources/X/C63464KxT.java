package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;

/* renamed from: X.KxT  reason: case insensitive filesystem */
public abstract class C63464KxT {
    public static void A00(Context context, C331157Pu r11, LB9 lb9, C60625JoY joY, MixedAttributionModel mixedAttributionModel) {
        Drawable drawable = mixedAttributionModel.A00;
        if (drawable != null) {
            String str = mixedAttributionModel.A04;
            0qQ.A0B(context, 0);
            Resources resources = context.getResources();
            SpannableStringBuilder A0E = C51965G9l.A0E();
            C51969G9p.A12(PorterDuff.Mode.SRC_IN, drawable, C51968G9o.A04(context));
            drawable.setBounds(0, 0, resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material), resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            C263324Kh.A03(drawable, A0E, AnonymousClass05K.A00, 0, 0, JTP.A03(resources));
            A0E.append(str);
            String A06 = 0mp.A06(context.getResources().getString(2131953212), new Object[]{mixedAttributionModel.A05});
            joY.A01.setText(A0E);
            joY.A00.setText(A06);
            LYA.A01(joY.itemView, lb9, r11, mixedAttributionModel, 36);
            joY.A02.A00.setImportantForAccessibility(2);
            2eS.A01(joY.itemView);
            return;
        }
        0qQ.A0F("attributionTextDrawable");
        throw AnonymousClass00P.createAndThrow();
    }
}
