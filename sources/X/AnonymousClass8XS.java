package X;

import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;

/* renamed from: X.8XS  reason: invalid class name */
public final class AnonymousClass8XS implements AnonymousClass8XT {
    public final /* synthetic */ AnonymousClass8XA A00;

    public final boolean AFR(Folder folder, List list) {
        0qQ.A0B(list, 0);
        0qQ.A0B(folder, 1);
        C362048hG r0 = this.A00.A02;
        if (r0 == null) {
            return false;
        }
        List A01 = 0u4.A01(list);
        0qQ.A0B(A01, 0);
        if (r0.A0r.AFR(folder, A01)) {
            return true;
        }
        return false;
    }

    public AnonymousClass8XS(AnonymousClass8XA r1) {
        this.A00 = r1;
    }

    public final List C2u(Integer num) {
        List C2u;
        C362048hG r0 = this.A00.A02;
        if (r0 == null || (C2u = r0.A0r.C2u(num)) == null) {
            return 0sn.A00;
        }
        return C2u;
    }

    public final void DpR(List list) {
        C362048hG r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0r.DpR(list);
        }
    }
}
