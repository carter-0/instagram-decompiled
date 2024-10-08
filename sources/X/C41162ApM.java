package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.user.model.User;

/* renamed from: X.ApM  reason: case insensitive filesystem */
public final /* synthetic */ class C41162ApM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C358368an A01;
    public final /* synthetic */ User A02;

    public /* synthetic */ C41162ApM(C358368an r1, User user, int i) {
        this.A01 = r1;
        this.A02 = user;
        this.A00 = i;
    }

    public final void run() {
        String str;
        String BiY;
        C358368an r6 = this.A01;
        User user = this.A02;
        int i = this.A00;
        r6.A0V();
        r6.A0c = false;
        if (!(C358368an.A01(r6) instanceof C363138jC)) {
            r6.A1U.A00(r6.A1j, AnonymousClass05K.A00, AnonymousClass7TF.A1W(r6.A1Q.A02.A01(), C365758nd.A04));
        }
        AnonymousClass9UR.A05(r6.A1j, user, user.getUsername(), '@');
        C314676if r1 = r6.A1c;
        if (r1.A03) {
            A9W a9w = (A9W) r1.get();
            a9w.A07.post(a9w.A08);
        }
        C63414Kwa.A00(r6.A1J).A01(user);
        String id = user.getId();
        RecyclerView recyclerView = r6.A1D;
        if (recyclerView != null) {
            C358558b6 r0 = recyclerView.A0A;
            r0.getClass();
            C337257fy r02 = ((C358548b5) r0).A05;
            if (!(r02 == null || (BiY = r02.BiY()) == null || BiY.length() == 0)) {
                str = 00p.A0g(BiY, "@", "", false);
                r6.A1V.A02(id, str, i);
            }
        }
        str = "";
        r6.A1V.A02(id, str, i);
    }
}
