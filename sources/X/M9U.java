package X;

import android.view.View;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

public final class M9U implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C59962JcV A03;

    public M9U(View view, C59962JcV jcV, int i, int i2) {
        this.A02 = view;
        this.A03 = jcV;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        View view = this.A02;
        if (view != null) {
            int i = this.A00;
            int i2 = this.A01;
            0nA.A0j(view, i, i2, i, i2);
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.A03.A0T;
        if (interactiveDrawableContainer != null) {
            int i3 = this.A00;
            int i4 = this.A01;
            0nA.A0j(interactiveDrawableContainer, i3, i4, i3, i4);
        }
    }
}
