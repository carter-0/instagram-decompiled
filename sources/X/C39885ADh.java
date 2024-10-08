package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Map;

/* renamed from: X.ADh  reason: case insensitive filesystem */
public final class C39885ADh {
    public final AnonymousClass88G A00 = new C57412IaI(this, 0);
    public final InteractiveDrawableContainer A01;
    public final Map A02 = AnonymousClass7TE.A1H();

    public static final void A00(Drawable drawable, C39885ADh aDh, 0sP r3) {
        C381499br r1 = (C381499br) aDh.A02.get(drawable);
        if (r1 != null) {
            r1.A00 = false;
            r3.invoke(r1);
            r1.A00 = true;
        }
    }

    public final void A01(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null) {
            0u4.A03(this.A02).remove(drawable);
            InteractiveDrawableContainer interactiveDrawableContainer = this.A01;
            interactiveDrawableContainer.setPropertyListener(drawable, new C40673Agn(0));
            interactiveDrawableContainer.setPropertyListener(drawable2, new C40673Agn(1));
        }
    }

    public C39885ADh(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A01 = interactiveDrawableContainer;
    }
}
