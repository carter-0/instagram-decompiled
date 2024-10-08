package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.Dlg  reason: case insensitive filesystem */
public final class C46804Dlg extends U9W {
    public final /* synthetic */ E53 A00;

    public final void onSwiped(C249703kE r1, int i) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46804Dlg(E53 e53) {
        super(60, 0);
        this.A00 = e53;
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r7, C249703kE r8) {
        Object value;
        ArrayList A0U;
        AnonymousClass7TG.A1O(r7, r8);
        if (!(r8 instanceof C46992Dok)) {
            return false;
        }
        int bindingAdapterPosition = r7.getBindingAdapterPosition();
        int bindingAdapterPosition2 = r8.getBindingAdapterPosition();
        05G r2 = ((C46792DlR) this.A00.A0B.getValue()).A0A;
        do {
            value = r2.getValue();
            A0U = 00k.A0U((Collection) value);
            Collections.swap(A0U, bindingAdapterPosition, bindingAdapterPosition2);
        } while (!r2.AIY(value, A0U));
        return true;
    }
}
