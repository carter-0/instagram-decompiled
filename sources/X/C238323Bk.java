package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Bk  reason: invalid class name and case insensitive filesystem */
public final class C238323Bk extends C249403jg {
    public final UserSession A00;
    public final C228112ko A01;

    public C238323Bk(UserSession userSession, C228112ko r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int A03 = AnonymousClass0fD.A03(-159104628);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        2Rw r2 = recyclerView.A0A;
        if (!(r2 == null || recyclerView.getScrollState() == 0)) {
            C252553pI r1 = recyclerView.A0D;
            if ((r1 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r1) != null) {
                int A1b = linearLayoutManager.A1b();
                int itemCount = r2.getItemCount();
                C228112ko r5 = this.A01;
                if (r5.EsD(AnonymousClass05K.A00, A1b, itemCount)) {
                    r5.AUz();
                } else {
                    UserSession userSession = this.A00;
                    0qQ.A0B(userSession, 0);
                    0Tu r22 = 0Tu.A05;
                    if (182.A06(r22, userSession, 36329973010678158L) && r5.CKY() && itemCount - A1b <= ((int) 182.A01(r22, userSession, 36611447987509477L))) {
                        r5.Cmq();
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-1339799610, A03);
    }
}
