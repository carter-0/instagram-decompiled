package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;

/* renamed from: X.8S4  reason: invalid class name */
public final class AnonymousClass8S4 {
    public final C357638Yz A00;
    public final AnonymousClass8QA A01;
    public final C355948Rz A02;
    public final AnonymousClass8BA A03;
    public final AnonymousClass85X A04;
    public final C3499582p A05;
    public final AnonymousClass80U A06;
    public final C3510287h A07;
    public final InteractiveDrawableContainer A08;

    public final void A00() {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A03.A1s;
        Iterator it = interactiveDrawableContainer.A0V(Drawable.class).iterator();
        while (it.hasNext()) {
            interactiveDrawableContainer.A0S((Drawable) it.next());
        }
    }

    public AnonymousClass8S4(C357638Yz r1, AnonymousClass8QA r2, C355948Rz r3, AnonymousClass8BA r4, AnonymousClass85X r5, C3499582p r6, AnonymousClass80U r7, C3510287h r8, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = interactiveDrawableContainer;
        this.A04 = r5;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
    }
}
