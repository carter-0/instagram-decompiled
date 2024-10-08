package X;

import com.instagram.ui.text.ConstrainedEditText;
import java.util.Iterator;

/* renamed from: X.9UU  reason: invalid class name */
public final class AnonymousClass9UU implements AnonymousClass7JD {
    public final /* synthetic */ ConstrainedEditText A00;

    public AnonymousClass9UU(ConstrainedEditText constrainedEditText) {
        this.A00 = constrainedEditText;
    }

    public final boolean Dbf(AnonymousClass05V r4) {
        Iterator it = this.A00.A07.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (((C358588b9) it.next()).Dbf(r4) || z) {
                    z = true;
                }
            }
        }
    }
}
