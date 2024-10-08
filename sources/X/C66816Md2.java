package X;

import android.view.View;
import android.widget.Space;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;

/* renamed from: X.Md2  reason: case insensitive filesystem */
public final class C66816Md2 extends C328217Dy {
    public final Space A00;
    public final ObservableVerticalOffsetConstraintLayout A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66816Md2(Space space, ObservableVerticalOffsetConstraintLayout observableVerticalOffsetConstraintLayout) {
        super(observableVerticalOffsetConstraintLayout);
        0qQ.A0B(space, 2);
        this.A01 = observableVerticalOffsetConstraintLayout;
        this.A00 = space;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66816Md2) {
                C66816Md2 md2 = (C66816Md2) obj;
                if (!0qQ.A0K(this.A01, md2.A01) || !0qQ.A0K(this.A00, md2.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ View A00() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Constraint(root=");
        A1A.append(this.A01);
        A1A.append(", spacer=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
