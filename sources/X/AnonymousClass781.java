package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.781  reason: invalid class name */
public final class AnonymousClass781 extends AnonymousClass782 {
    public final 0wc A00;
    public final UserSession A01;
    public final C333517Zg A02;
    public final AnonymousClass786 A03;

    public AnonymousClass781(Context context, RecyclerView recyclerView, 0wc r4, UserSession userSession, C333517Zg r6, AnonymousClass780 r7, C330707Nw r8, C332297Uk r9, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        super(context, recyclerView, r7, refreshableNestedScrollingParent);
        this.A01 = userSession;
        this.A02 = r6;
        this.A00 = r4;
        this.A03 = new C3257774c(r6, r8, r9);
    }
}
