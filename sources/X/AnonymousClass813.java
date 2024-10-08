package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.813  reason: invalid class name */
public final class AnonymousClass813 implements AnonymousClass2eo {
    public final /* synthetic */ AnonymousClass810 A00;

    public AnonymousClass813(AnonymousClass810 r1) {
        this.A00 = r1;
    }

    public final void Ann(Rect rect) {
        AnonymousClass810 r2 = this.A00;
        View view = r2.A00;
        if (view == null) {
            view = r2.A01.findViewById(R.id.clips_review_container);
            r2.A00 = view;
        }
        if (view == null || !view.isShown()) {
            rect.setEmpty();
            return;
        }
        View view2 = r2.A00;
        if (view2 != null) {
            view2.getGlobalVisibleRect(rect);
        }
    }
}
