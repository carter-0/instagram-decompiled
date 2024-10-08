package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8Nw  reason: invalid class name and case insensitive filesystem */
public final class C354918Nw implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354918Nw(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C347017w8 r1;
        C321016tR r12;
        C321016tR r13;
        AnonymousClass5MH r2;
        0qQ.A0B(obj, 0);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A00.A1m;
        if (!interactiveDrawableContainer.getAllDrawables().isEmpty()) {
            for (Drawable drawable : interactiveDrawableContainer.getAllDrawables()) {
                Drawable drawable2 = null;
                if ((drawable instanceof AnonymousClass5MH) && (r2 = (AnonymousClass5MH) drawable) != null) {
                    drawable2 = r2.A0A;
                }
                if ((drawable2 instanceof C347017w8) && (r1 = (C347017w8) drawable2) != null) {
                    for (Drawable drawable3 : r1.A05()) {
                        if (obj == AnonymousClass8YU.PAUSED) {
                            if ((drawable3 instanceof C321016tR) && (r13 = (C321016tR) drawable3) != null) {
                                r13.A05();
                            }
                        } else if (obj == AnonymousClass8YU.PLAYING && (drawable3 instanceof C321016tR) && (r12 = (C321016tR) drawable3) != null) {
                            r12.A07();
                        }
                    }
                }
            }
        }
    }
}
