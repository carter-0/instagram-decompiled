package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.Dmb  reason: case insensitive filesystem */
public final class C46859Dmb extends C249403jg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C48219Eb0 A01;

    public C46859Dmb(UserSession userSession, C48219Eb0 eb0) {
        this.A01 = eb0;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.3DQ, X.1qK, java.lang.Object] */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        int A0D = AnonymousClass7TG.A0D(recyclerView, 581803839);
        super.onScrollStateChanged(recyclerView, i);
        HorizontalRecyclerPager horizontalRecyclerPager = this.A01.A00;
        if (recyclerView == horizontalRecyclerPager) {
            C252553pI r3 = horizontalRecyclerPager.A0D;
            if ((r3 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r3) != null) {
                UserSession userSession = this.A00;
                int A1c = linearLayoutManager.A1c();
                if (A1c < 0) {
                    A1c = linearLayoutManager.A1a() + 1;
                }
                1Ng A002 = AnonymousClass1Nd.A00(userSession);
                ? obj = new Object();
                obj.A00 = A1c;
                A002.A05(obj);
            }
        }
        AnonymousClass0fD.A0A(-1998781099, A0D);
    }
}
