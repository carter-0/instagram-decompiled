package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ldv  reason: case insensitive filesystem */
public final class C64554Ldv implements MTR {
    public final /* synthetic */ C357088Wk A00;

    public final void Ere(List list) {
    }

    public C64554Ldv(C357088Wk r1) {
        this.A00 = r1;
    }

    public final void CwM(List list, boolean z) {
        C357088Wk r4 = this.A00;
        if (!z) {
            r4.A0A.A0c();
        } else if (list.size() == 1 && ((AudienceListViewModel) AnonymousClass7TE.A13(list)).A05) {
            r4.A0D();
        } else if (!list.isEmpty()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.add(((AudienceListViewModel) it.next()).A01);
            }
            C357088Wk.A0A(r4, A1C, 3);
        }
    }
}
