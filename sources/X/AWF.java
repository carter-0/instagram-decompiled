package X;

import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

public final /* synthetic */ class AWF implements AnonymousClass2hV {
    public final /* synthetic */ AnonymousClass8S4 A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AWF(AnonymousClass8S4 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final Object apply(Object obj) {
        AnonymousClass8S4 r0 = this.A00;
        boolean z = this.A01;
        B3f A02 = InteractiveDrawableContainer.A02(r0.A08, ((Number) obj).intValue());
        if (A02 == null) {
            return null;
        }
        ((C378669Qs) A02).A0P = z;
        return null;
    }
}
