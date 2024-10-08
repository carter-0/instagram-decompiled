package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class U6C extends AppCompatSeekBar {
    public static final int A00(Context context, int i) {
        return AnonymousClass7TE.A06((float) i, ((float) AnonymousClass7TF.A0E(context).densityDpi) / 160.0f);
    }

    public final void A02(VUN vun, int i) {
        List list;
        setSplitTrack(false);
        Context context = getContext();
        setThumb(context.getDrawable(R.drawable.parametric_slider_thumb));
        vun.A00 = getThumb();
        getViewTreeObserver().addOnGlobalLayoutListener(new C64297LYx(i, 0, this, vun));
        V4Z v4z = vun.A02;
        if (!(v4z == null || (list = v4z.A04) == null)) {
            A03(list);
        }
        V4Z v4z2 = vun.A02;
        if (v4z2 != null) {
            int i2 = v4z2.A01;
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable thumb = getThumb();
                0qQ.A0C(thumb, C273654mx.A00(16));
                A01(context, (LayerDrawable) thumb, i2);
            }
        }
    }

    public final void A03(List list) {
        setBackground((Drawable) null);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass7TF.A1M(arrayList, Color.parseColor(002.A0D(AnonymousClass7TE.A18(it), '#')));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, 00k.A0x(arrayList));
        gradientDrawable.setCornerRadius(100.0f);
        setProgressDrawable(gradientDrawable);
        setThumbOffset(A00(AnonymousClass7TE.A0S(this), 10));
    }

    private final void A01(Context context, LayerDrawable layerDrawable, int i) {
        if (layerDrawable.getNumberOfLayers() < 2) {
            0KC.A0C("ParametricSlider", "Thumb drawable must have at least 2 layers, if the drawable has changed, please update this section that applies thumb border width to thumb drawable");
            return;
        }
        Drawable drawable = layerDrawable.getDrawable(0);
        String A00 = C273654mx.A00(0);
        0qQ.A0C(drawable, A00);
        Drawable drawable2 = layerDrawable.getDrawable(1);
        0qQ.A0C(drawable2, A00);
        ((GradientDrawable) drawable).setThickness(A00(context, i));
        ((GradientDrawable) drawable2).setThickness(AnonymousClass7TE.A06(((float) i) - 0.2f, ((float) AnonymousClass7TF.A0E(context).densityDpi) / 160.0f));
    }
}
