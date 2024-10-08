package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8jH  reason: invalid class name and case insensitive filesystem */
public final class C363168jH extends C232922uf {
    public final /* synthetic */ InteractiveDrawableContainer A00;

    public final void DmB(2cs r8) {
        int height;
        0qQ.A0B(r8, 0);
        if (r8.A01 == 1.0d) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A00;
            B3f A01 = interactiveDrawableContainer.getActiveDrawable();
            if (A01 != null) {
                interactiveDrawableContainer.A02 = A01.Bcl();
                interactiveDrawableContainer.A03 = A01.Bcm();
                C378669Qs r5 = (C378669Qs) A01;
                interactiveDrawableContainer.A00 = r5.A04 * r5.A00;
                View view = interactiveDrawableContainer.A0l;
                float height2 = ((float) view.getHeight()) / 2.0f;
                View view2 = interactiveDrawableContainer.A0k;
                interactiveDrawableContainer.A04 = view2.getX() + view.getX() + height2;
                interactiveDrawableContainer.A05 = view2.getY() + view.getY() + height2;
                float sqrt = (height2 / ((float) Math.sqrt(2.0d))) * 2.0f * 1.3f;
                Rect bounds = r5.A0B.getBounds();
                0qQ.A07(bounds);
                if (bounds.width() > bounds.height()) {
                    height = bounds.width();
                } else {
                    height = bounds.height();
                }
                interactiveDrawableContainer.A01 = sqrt / ((float) height);
                AnonymousClass2S0.A01.A05(20);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DmE(2cs r19) {
        B2J b2j;
        2cs r5 = r19;
        0qQ.A0B(r5, 0);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A00;
        B3f A01 = interactiveDrawableContainer.getActiveDrawable();
        if (A01 != null) {
            C71412ct r1 = r5.A09;
            C378669Qs r2 = (C378669Qs) A01;
            r2.EeI(r2.A01 + (((float) AnonymousClass37Q.A04(r1.A00, 0.0d, 1.0d, (double) interactiveDrawableContainer.A02, (double) interactiveDrawableContainer.A04)) - A01.Bcl()));
            r2.EeJ(r2.A02 + (((float) AnonymousClass37Q.A04(r1.A00, 0.0d, 1.0d, (double) interactiveDrawableContainer.A03, (double) interactiveDrawableContainer.A05)) - A01.Bcm()));
            float f = r2.A04;
            r2.A04 = f * (((float) AnonymousClass37Q.A04(r1.A00, 0.0d, 1.0d, (double) interactiveDrawableContainer.A00, (double) interactiveDrawableContainer.A01)) / (r2.A00 * f));
            C378669Qs.A04(r2);
            r2.A0E.Dgr(r2.A04 * r2.A00);
            AnonymousClass8DA r12 = r2.A0D;
            if (!(r12 == null || (b2j = r12.A02) == null)) {
                b2j.Dgr(r2.A04 * r2.A00);
            }
        }
        float A04 = (float) AnonymousClass37Q.A04(r5.A09.A00, 0.0d, 1.0d, 1.0d, 1.2999999523162842d);
        View view = interactiveDrawableContainer.A0l;
        view.setScaleX(A04);
        view.setScaleY(A04);
    }

    public C363168jH(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A00 = interactiveDrawableContainer;
    }

    public final void DmC(2cs r3) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A00;
        if (interactiveDrawableContainer.A0J) {
            InteractiveDrawableContainer.A06(interactiveDrawableContainer);
        }
    }
}
