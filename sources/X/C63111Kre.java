package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kre  reason: case insensitive filesystem */
public abstract class C63111Kre {
    public static final Drawable A00(Context context, String str, List list, int i, int i2) {
        Context context2 = context;
        Drawable A06 = AnonymousClass3JT.A06(context, R.drawable.close_friends_star_60, 2Yu.A0H(context, R.attr.igds_color_creation_tools_green));
        int color = context.getColor(R.color.grey_1);
        int i3 = i2;
        int i4 = i + (i2 * 2);
        InsetDrawable insetDrawable = new InsetDrawable(A06, i3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        AnonymousClass7TE.A1R(shapeDrawable, -1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, insetDrawable});
        if (list.isEmpty()) {
            return layerDrawable;
        }
        ArrayList A1M = 0sr.A1M(new Drawable[]{layerDrawable});
        int i5 = 0;
        while (i5 < list.size()) {
            A1M.add(new C244303ay((ImageUrl) 00k.A0O(list, i5), str, i4, i3, -1, color));
            i5++;
            if (i5 >= 3) {
                break;
            }
        }
        return new C244323b0(context2, AnonymousClass05K.A00, A1M, 0.3f, i4, true);
    }
}
