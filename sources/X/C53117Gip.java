package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gip  reason: case insensitive filesystem */
public final class C53117Gip extends C249703kE {
    public final C53068Gi1 A00;
    public final RecyclerView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53117Gip(View view, UserSession userSession, C67161MjJ mjJ) {
        super(view);
        AnonymousClass7TG.A1Q(userSession, mjJ);
        RecyclerView recyclerView = (RecyclerView) view;
        this.A01 = recyclerView;
        C53068Gi1 gi1 = new C53068Gi1(userSession, mjJ);
        this.A00 = gi1;
        recyclerView.setAdapter(gi1);
    }
}
