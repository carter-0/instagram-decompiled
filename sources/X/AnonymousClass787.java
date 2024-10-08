package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.787  reason: invalid class name */
public final class AnonymousClass787 extends AnonymousClass782 {
    public final UserSession A00;
    public final C333517Zg A01;
    public final C332297Uk A02;
    public final AnonymousClass786 A03;
    public final C21326XWj A04 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.XWj] */
    public AnonymousClass787(Context context, RecyclerView recyclerView, UserSession userSession, C333517Zg r5, AnonymousClass780 r6, C332297Uk r7, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        super(context, recyclerView, r6, refreshableNestedScrollingParent);
        this.A00 = userSession;
        this.A01 = r5;
        this.A02 = r7;
        this.A03 = new PAR(userSession, r5);
    }
}
