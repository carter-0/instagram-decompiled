package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.3gs  reason: invalid class name and case insensitive filesystem */
public abstract class C247763gs {
    public static void A04(View view, C295005nO r5) {
        C294975nL A0C = C294975nL.A01(view, 1).A0D(new C271654jN()).A0C(250);
        A0C.A0U(1.0f, 0.0f, view.getPivotX());
        A0C.A0V(1.0f, 0.0f, view.getPivotY());
        A0C.A05 = r5;
        A0C.A0H();
    }

    public static ShapeDrawable A00(Context context, int i) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, ((float) (i + (context.getResources().getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2))) / 2.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_button_on_media_panavision_updated)), PorterDuff.Mode.DST_IN);
        return shapeDrawable;
    }

    public static void A01(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            C294975nL A0C = C294975nL.A01(view, 1).A0D(new C271654jN()).A0C(250);
            A0C.A0M(0.0f, 1.0f);
            A0C.A0H();
        }
    }

    public static void A02(View view) {
        if (view.getVisibility() != 8) {
            C294975nL A0C = C294975nL.A01(view, 1).A0D(new C271654jN()).A0C(250);
            A0C.A0M(1.0f, 0.0f);
            A0C.A05 = new PQH(view);
            A0C.A0H();
        }
    }

    public static void A03(View view, int i) {
        int measuredWidth = view.getMeasuredWidth();
        C294975nL A0C = C294975nL.A01(view, 1).A0D(new C271654jN()).A0C(250);
        A0C.A06 = new C40641AgG(view, measuredWidth, i);
        A0C.A05 = new C65715LyV(view);
        A0C.A0H();
    }

    public static void A05(C60046JeE jeE, C295005nO r6) {
        PointF relativeTagPosition = jeE.getRelativeTagPosition();
        C294975nL A0C = C294975nL.A01(jeE, 1).A0D(new C271654jN()).A0C(250);
        A0C.A0U(1.0f, 0.0f, relativeTagPosition.x);
        A0C.A0V(1.0f, 0.0f, relativeTagPosition.y);
        A0C.A05 = r6;
        A0C.A0H();
    }
}
