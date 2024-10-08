package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.ApD  reason: case insensitive filesystem */
public final class C41153ApD implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ AnonymousClass9IZ A01;
    public final /* synthetic */ C358958bk A02;

    public C41153ApD(Drawable drawable, AnonymousClass9IZ r2, C358958bk r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void run() {
        C358958bk r3 = this.A02;
        InteractiveDrawableContainer interactiveDrawableContainer = r3.A02;
        Drawable drawable = (Drawable) this.A01.A03;
        interactiveDrawableContainer.A0S(drawable);
        r3.A04(this.A00, drawable);
    }
}
