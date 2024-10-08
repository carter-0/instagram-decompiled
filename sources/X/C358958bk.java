package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8bk  reason: invalid class name and case insensitive filesystem */
public final class C358958bk {
    public final Context A00;
    public final TargetViewSizeProvider A01;
    public final InteractiveDrawableContainer A02;
    public final Map A03 = new LinkedHashMap();
    public final AnonymousClass88G A04 = new C358968bl(this);

    public C358958bk(Context context, TargetViewSizeProvider targetViewSizeProvider, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(context, 2);
        this.A02 = interactiveDrawableContainer;
        this.A00 = context;
        this.A01 = targetViewSizeProvider;
    }

    public static final float A00(Drawable drawable, AnonymousClass9IZ r6, C358958bk r7) {
        float f;
        int i;
        Float A0R = r7.A02.A0R(drawable);
        if (A0R != null) {
            f = A0R.floatValue();
        } else {
            f = 1.0f;
        }
        int dimensionPixelSize = r7.A00.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Drawable drawable2 = (Drawable) r6.A03;
        int intrinsicWidth = (dimensionPixelSize * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight();
        int intValue = ((Number) r6.A00).intValue();
        if (intValue == 2) {
            i = drawable.getBounds().width() - intrinsicWidth;
        } else if (intValue != 0) {
            return 0.0f;
        } else {
            i = intrinsicWidth - drawable.getBounds().width();
        }
        return (f * ((float) i)) / 2.0f;
    }

    public static final float A01(Drawable drawable, C358958bk r7) {
        float f;
        Context context = r7.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Float A0R = r7.A02.A0R(drawable);
        if (A0R != null) {
            f = A0R.floatValue();
        } else {
            f = 1.0f;
        }
        return f * ((((float) drawable.getBounds().height()) / 2.0f) + (((float) dimensionPixelSize) / 2.0f) + context.getResources().getDimension(R.dimen.abc_control_corner_material));
    }

    public static final void A02(Drawable drawable, C358958bk r2, 0sP r3) {
        AnonymousClass9IZ r1 = (AnonymousClass9IZ) r2.A03.get(drawable);
        if (r1 != null) {
            r1.A01 = false;
            r3.invoke(r1);
            r1.A01 = true;
        }
    }

    public final void A03(Drawable drawable, Drawable drawable2) {
        AnonymousClass9IZ r2 = new AnonymousClass9IZ(drawable2);
        this.A03.put(drawable, r2);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A02;
        interactiveDrawableContainer.setPropertyListener(drawable, new C40675Agp(drawable, this));
        interactiveDrawableContainer.setPropertyListener(drawable2, new C40677Agr(drawable, drawable2, r2, this));
        interactiveDrawableContainer.A0y(this.A04);
    }

    public final void A04(Drawable drawable, Drawable drawable2) {
        0u4.A03(this.A03).remove(drawable);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A02;
        interactiveDrawableContainer.setPropertyListener(drawable, new C40671Agl());
        interactiveDrawableContainer.setPropertyListener(drawable2, new C40672Agm());
    }
}
