package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.instagram.android.R;
import java.util.regex.Pattern;

/* renamed from: X.7vb  reason: invalid class name and case insensitive filesystem */
public abstract class C346697vb {
    public static final LayerDrawable A00(Context context) {
        0qQ.A0B(context, 0);
        ShapeDrawable A05 = A05(-1);
        int A0H = 2Yu.A0H(context, R.attr.igds_color_creation_tools_green);
        Paint paint = AnonymousClass3JT.A00;
        return new LayerDrawable(new Drawable[]{A05, AnonymousClass3JT.A05(context, R.drawable.close_friends_star, context.getColor(A0H))});
    }

    public static final LayerDrawable A01(Context context) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A05(context.getColor(2Yu.A0H(context, R.attr.igds_color_elevated_background))), A02(context, R.drawable.close_friends_star_60)});
        int A01 = AnonymousClass1GB.A01(0nA.A04(context, 3));
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return layerDrawable;
    }

    public static final LayerDrawable A02(Context context, int i) {
        0qQ.A0B(context, 0);
        ShapeDrawable A05 = A05(-1);
        int A0H = 2Yu.A0H(context, R.attr.igds_color_creation_tools_green);
        Paint paint = AnonymousClass3JT.A00;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A05, AnonymousClass3JT.A05(context, i, context.getColor(A0H))});
        int A01 = AnonymousClass1GB.A01(0nA.A04(context, 1));
        layerDrawable.setLayerInset(0, A01, A01, A01, A01);
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        return layerDrawable;
    }

    public static final LayerDrawable A03(Context context, int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A05(2Yu.A0F(context, R.attr.igds_color_primary_background)), A02(context, i)});
        int A01 = AnonymousClass1GB.A01(0nA.A04(context, i2));
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return layerDrawable;
    }

    public static final LayerDrawable A04(Context context, Drawable drawable) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, context.getDrawable(R.drawable.story_shortcut_ring)});
        int A01 = AnonymousClass1GB.A01(0nA.A04(context, 3));
        layerDrawable.setLayerInset(0, A01, A01, A01, A01);
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        return layerDrawable;
    }

    public static final SpannableString A06(Context context, String str) {
        int i;
        SpannableString spannableString = new SpannableString(str);
        String str2 = new String[]{context.getString(2131956179)}[0];
        0qQ.A0A(str2);
        if (00l.A0d(str, str2, false)) {
            StyleSpan styleSpan = new StyleSpan(1);
            int A08 = 00l.A08(str, str2, 0, false);
            int A082 = 00l.A08(str, str2, 0, false);
            Pattern pattern = 0mp.A00;
            if (str2 != null) {
                i = str2.length();
            } else {
                i = 0;
            }
            spannableString.setSpan(styleSpan, A08, A082 + i, 18);
        }
        return spannableString;
    }

    public static final SpannableString A07(Context context, String str, boolean z) {
        0qQ.A0B(context, 1);
        boolean A02 = 0mk.A02(context);
        if (!z ? A02 : !A02) {
            SpannableString A06 = A06(context, 002.A0C(str, ' '));
            LayerDrawable A03 = A03(context, R.drawable.close_friends_star_small, 0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            A03.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            C2606346l r3 = new C2606346l(A03);
            r3.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
            A06.setSpan(r3, A06.length() - 1, A06.length(), 18);
            return A06;
        }
        SpannableString A062 = A06(context, 002.A0D(str, ' '));
        LayerDrawable A032 = A03(context, R.drawable.close_friends_star_small, 0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        A032.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
        C2606346l r2 = new C2606346l(A032);
        r2.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        A062.setSpan(r2, 0, 1, 18);
        return A062;
    }

    public static final ShapeDrawable A05(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }
}
