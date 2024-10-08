package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class GIZ {
    public static final ShapeDrawable A01(Context context, GradientDrawable.Orientation orientation, double d, float f, float f2) {
        GradientDrawable.Orientation orientation2;
        int i = 0;
        if (0.0d > d || d > 1.0d) {
            d = 0.5d;
        }
        int A06 = 2eL.A06(context.getColor(R.color.black), AnonymousClass1GB.A00(d * 255.0d));
        Float A0g = C51967G9n.A0g();
        Float valueOf = Float.valueOf(0.118f);
        Float valueOf2 = Float.valueOf(0.214f);
        Float valueOf3 = Float.valueOf(0.291f);
        Float valueOf4 = Float.valueOf(0.353f);
        Float valueOf5 = Float.valueOf(0.404f);
        Float valueOf6 = Float.valueOf(0.446f);
        Float valueOf7 = Float.valueOf(0.482f);
        Float valueOf8 = Float.valueOf(0.518f);
        Float valueOf9 = Float.valueOf(0.554f);
        Float valueOf10 = Float.valueOf(0.596f);
        Float valueOf11 = Float.valueOf(0.647f);
        Float valueOf12 = Float.valueOf(0.709f);
        Float valueOf13 = Float.valueOf(0.786f);
        Float valueOf14 = Float.valueOf(0.882f);
        Float A0h = C51967G9n.A0h();
        ArrayList A1M = 0sr.A1M(new Float[]{A0g, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, A0h});
        ArrayList A0p = AnonymousClass7TF.A0p(A1M);
        Iterator it = A1M.iterator();
        while (true) {
            orientation2 = orientation;
            if (!it.hasNext()) {
                break;
            }
            float floatValue = ((Number) it.next()).floatValue() * (1.0f - f2);
            if (orientation2 == GradientDrawable.Orientation.TOP_BOTTOM) {
                floatValue += f2;
            }
            A0p.add(Float.valueOf(floatValue));
        }
        ArrayList A0U = 00k.A0U(A0p);
        GradientDrawable.Orientation orientation3 = GradientDrawable.Orientation.TOP_BOTTOM;
        if (orientation2 == orientation3) {
            A0U.add(0, A0g);
        } else {
            A0U.add(A0h);
        }
        float[] A0w = 00k.A0w(A0U);
        float[] fArr = {0.0f, 0.008f, 0.03f, 0.07f, 0.12f, 0.18f, 0.25f, 0.33f, 0.41f, 0.5f, 0.59f, 0.67f, 0.76f, 0.85f, 0.93f, 1.0f, 1.0f};
        ArrayList A0v = DbS.A0v(17);
        do {
            A0v.add(Float.valueOf(fArr[i]));
            i++;
        } while (i < 17);
        00v.A10(A0v);
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0v);
        Iterator it2 = A0v.iterator();
        while (it2.hasNext()) {
            A0p2.add(Integer.valueOf(0nH.A06(A06, (((Number) it2.next()).floatValue() * ((float) Color.alpha(A06))) / 255.0f)));
        }
        if (orientation2 != orientation3) {
            A0p2 = new 097(A0p2);
        }
        int[] A0x = 00k.A0x(A0p2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, A0x, A0w, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static final GradientDrawable A00(Context context, GradientDrawable.Orientation orientation, double d) {
        if (0.0d > d || d > 1.0d) {
            d = 0.5d;
        }
        return C52184GIa.A00(orientation, 2eL.A06(context.getColor(R.color.black), AnonymousClass1GB.A00(d * 255.0d)));
    }
}
