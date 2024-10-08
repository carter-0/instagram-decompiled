package X;

import android.graphics.Canvas;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AZi  reason: case insensitive filesystem */
public class C40293AZi implements AnonymousClass88H {
    public final InteractiveDrawableContainer A00;

    public final void EF8(Canvas canvas, int i, boolean z, boolean z2) {
        C386039jx r2;
        if (this instanceof C387569mQ) {
            C387569mQ r4 = (C387569mQ) this;
            ArrayList A1C = AnonymousClass7TE.A1C();
            InteractiveDrawableContainer interactiveDrawableContainer = r4.A00;
            interactiveDrawableContainer.A0u(new AWG(0, A1C, r4));
            Iterator it = interactiveDrawableContainer.getAllDrawables().iterator();
            while (it.hasNext()) {
                AHO.A00(AnonymousClass7TE.A0Z(it));
            }
            interactiveDrawableContainer.draw(canvas);
            Iterator it2 = A1C.iterator();
            while (it2.hasNext()) {
                interactiveDrawableContainer.A0h(AnonymousClass7TG.A0F(it2), true);
            }
            return;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        InteractiveDrawableContainer interactiveDrawableContainer2 = this.A00;
        interactiveDrawableContainer2.A0u(new AWI(this, A1C3, A1C2, i, z, z2));
        interactiveDrawableContainer2.draw(canvas);
        int size = A1C2.size();
        for (int i2 = 0; i2 < size; i2++) {
            interactiveDrawableContainer2.A0h(AnonymousClass7TE.A0M(A1C2.get(i2)), true);
        }
        C389629pw r0 = (C389629pw) 00k.A0J(A1C3);
        if (r0 != null) {
            C16146UpX upX = r0.A01;
            if (upX.A08.A02 && (r2 = upX.A01) != null) {
                r2.A00 = false;
                r2.A0A.A0L(C386039jx.A00(r2, r2.A0C));
                r2.invalidateSelf();
            }
        }
    }

    public final boolean CKM() {
        return AnonymousClass7TF.A1R(this.A00.getInteractiveDrawables().size());
    }

    public final boolean CKR(boolean z, boolean z2) {
        return AHO.A03(this.A00.getAllDrawables(), z, z2);
    }

    public final void EI6() {
        this.A00.A0u(new Lc4(this, 4));
    }

    public final boolean isVisible() {
        return true;
    }

    public C40293AZi(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A00 = interactiveDrawableContainer;
    }
}
