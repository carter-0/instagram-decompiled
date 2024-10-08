package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Aqb  reason: case insensitive filesystem */
public final class C41239Aqb implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ AnonymousClass8BH A01;
    public final /* synthetic */ C310416b1 A02;
    public final /* synthetic */ InteractiveDrawableContainer A03;
    public final /* synthetic */ B3f A04;

    public C41239Aqb(Drawable drawable, AnonymousClass8BH r2, C310416b1 r3, InteractiveDrawableContainer interactiveDrawableContainer, B3f b3f) {
        this.A03 = interactiveDrawableContainer;
        this.A02 = r3;
        this.A00 = drawable;
        this.A04 = b3f;
        this.A01 = r2;
    }

    public final void run() {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A03;
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        C310416b1 r7 = this.A02;
        float f = r7.A02;
        if (f != -1.0f) {
            float intrinsicWidth = (f * ((float) width)) / ((float) this.A00.getIntrinsicWidth());
            float f2 = r7.A01;
            if (f2 != -1.0f && intrinsicWidth < f2) {
                intrinsicWidth = f2;
            }
            float f3 = r7.A00;
            if (f3 != -1.0f && intrinsicWidth > f3) {
                intrinsicWidth = f3;
            }
            this.A04.EjE(intrinsicWidth);
        }
        AnonymousClass8BH r5 = this.A01;
        Drawable drawable = this.A00;
        r5.A02(drawable, interactiveDrawableContainer.getDrawableRealBounds(), width, height);
        B3f b3f = this.A04;
        0qQ.A0C(b3f, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableImpl");
        ((C378669Qs) b3f).A0h.set(AnonymousClass7TE.A0X(drawable));
    }
}
