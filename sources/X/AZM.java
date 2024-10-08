package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.direct.model.DirectThreadThemeInfo;

public final /* synthetic */ class AZM implements C262424Dq {
    public final /* synthetic */ AnonymousClass7U1 A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AZM(AnonymousClass7U1 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void CyE(Bitmap bitmap) {
        Drawable drawable;
        Drawable drawable2;
        AnonymousClass7U1 r2 = this.A00;
        boolean z = this.A01;
        AnonymousClass4DH r1 = r2.A07;
        if (r1.getContext() != null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            r2.A00 = shapeDrawable;
            0qQ.A0B(bitmap, 1);
            r2.A01 = C308486Ul.A00(bitmap, shapeDrawable, shapeDrawable.getShape());
            AnonymousClass0eK r3 = r2.A0A;
            DirectThreadThemeInfo C6d = ((C333517Zg) r3.get()).C6l().C6d();
            Context requireContext = r1.requireContext();
            AnonymousClass9HC r8 = (AnonymousClass9HC) r2.A0E.get();
            Integer A03 = r2.A03(((C333517Zg) r3.get()).C6l());
            if (z) {
                drawable = r2.A02(C6d);
                drawable2 = shapeDrawable;
            } else {
                drawable = shapeDrawable;
                drawable2 = r2.A01(C6d);
            }
            r2.A05(C329927Kt.A00.A00(requireContext, drawable, drawable2, r8, C6d, A03));
            r2.A04(r1.mView, AnonymousClass7TE.A0M(r2.A0D.get()), AnonymousClass7TE.A1a(r2.A0B.get()));
            return;
        }
        0wb.A03("DirectThreadFragmentbackground drawable callback is not cleared", "");
    }
}
