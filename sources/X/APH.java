package X;

import android.view.ViewTreeObserver;
import android.widget.ImageView;

public final class APH implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass88K A01;

    public APH(ImageView imageView, AnonymousClass88K r2) {
        this.A00 = imageView;
        this.A01 = r2;
    }

    public final boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        AnonymousClass88K.A01(this.A01);
        return true;
    }
}
