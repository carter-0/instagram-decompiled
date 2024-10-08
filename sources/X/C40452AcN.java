package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.AcN  reason: case insensitive filesystem */
public final class C40452AcN implements C3256173i {
    public final /* synthetic */ C63854L9j A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public C40452AcN(C63854L9j l9j, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = l9j;
        this.A02 = z;
        this.A01 = directThreadThemeInfo;
    }

    public final void DrA(Bitmap bitmap, String str) {
        Drawable drawable;
        Drawable drawable2;
        C63854L9j l9j = this.A00;
        AnonymousClass7L2 r0 = l9j.A00;
        boolean z = this.A02;
        C329967Kx r1 = r0.A04;
        String str2 = r1.A0U;
        if (str2 == null) {
            if (z) {
                str2 = r1.A0V;
            } else {
                str2 = r1.A0W;
            }
        }
        if (str.equals(str2)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            C308486Ul.A00(bitmap, shapeDrawable, shapeDrawable.getShape());
            Context context = l9j.A01;
            AnonymousClass9HC r8 = l9j.A04;
            Integer num = AnonymousClass05K.A00;
            DirectThreadThemeInfo directThreadThemeInfo = this.A01;
            if (z) {
                drawable = l9j.A00.A04.A0R;
                drawable2 = shapeDrawable;
            } else {
                drawable = shapeDrawable;
                drawable2 = l9j.A00.A04.A0Q;
            }
            AnonymousClass7L2 A002 = C329927Kt.A00.A00(context, drawable, drawable2, r8, directThreadThemeInfo, num);
            l9j.A00 = A002;
            C329967Kx r02 = A002.A04;
            TransitionDrawable transitionDrawable = r02.A0T;
            transitionDrawable.setCrossFadeEnabled(false);
            ShapeDrawable shapeDrawable2 = r02.A0S;
            int A012 = 2db.A01(l9j.A03);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{transitionDrawable, shapeDrawable2});
            layerDrawable.setLayerInset(1, 0, 0, 0, AnonymousClass0nB.A00(context) - A012);
            l9j.A02.setBackground(layerDrawable);
        }
    }
}
