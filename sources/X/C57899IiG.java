package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.IiG  reason: case insensitive filesystem */
public final class C57899IiG implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C381499br A01;
    public final /* synthetic */ C39885ADh A02;

    public C57899IiG(Drawable drawable, C381499br r2, C39885ADh aDh) {
        this.A02 = aDh;
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void run() {
        C39885ADh aDh = this.A02;
        InteractiveDrawableContainer interactiveDrawableContainer = aDh.A01;
        Drawable drawable = this.A01.A03;
        interactiveDrawableContainer.A0S(drawable);
        aDh.A01(this.A00, drawable);
    }
}
