package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.8Mm  reason: invalid class name and case insensitive filesystem */
public final class C354558Mm implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354558Mm(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Object obj2;
        C388439np r4;
        C391949tw r42 = (C391949tw) obj;
        0qQ.A0B(r42, 0);
        AnonymousClass8ME r2 = this.A00;
        AnonymousClass88W r0 = (AnonymousClass88W) r2.A1I.A00.A02();
        if (r0 != null) {
            obj2 = r0.A01;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof C388439np) {
            Drawable drawable = null;
            if ((r42 instanceof C388439np) && (r4 = (C388439np) r42) != null) {
                drawable = r4.A00;
            }
            AnonymousClass8ME.A0M(drawable, r2);
            return;
        }
        View view = r2.A04;
        if (view != null) {
            r2.A0i.removeView(view);
        }
    }
}
